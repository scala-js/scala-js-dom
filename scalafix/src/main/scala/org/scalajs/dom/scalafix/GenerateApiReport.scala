package org.scalajs.dom.scalafix

import java.nio.charset.StandardCharsets
import java.nio.file.{Paths, Files}
import scala.meta._
import scalafix.v1._

class GenerateApiReport extends SemanticRule("GenerateApiReport") {
  import MutableState.{global => state, ScopeType}

  private[this] def enabled = state ne null

  override def beforeStart(): Unit = {
    Util.scalaSeriesVer match {
      case "2.11" => // disabled - can't read classfiles
      case _      => MutableState.global = new MutableState // can't set state= in early Scala versions
    }
  }

  override def fix(implicit doc: SemanticDocument): Patch = {

    if (enabled)
      doc.tree.traverse {
        case a: Defn.Class  => process(a.symbol, a.templ, ScopeType.Class)
        case a: Defn.Object => process(a.symbol, a.templ, ScopeType.Object)
        case a: Defn.Trait  => process(a.symbol, a.templ, ScopeType.Trait)
        case a: Pkg.Object  => process(a.symbol, a.templ, ScopeType.Object)
        case _ =>
      }

    Patch.empty
  }

  private def process(sym: Symbol, body: Template, typ: ScopeType)(implicit doc: SemanticDocument): Unit = {
    // Skip non-public scopes
    val info = sym.info.get
    if (!info.isPublic && !info.isPackageObject)
      return

    val parents    = Util.parents(sym).iterator.map(Util.typeSymbol).toList
    val domParents = parents.iterator.filter(isScalaJsDom).toSet
    val isJsType   = parents.exists(isScalaJs)
    val s          = state.register(sym, isJsType, typ, domParents)

    def letsSeeHowLazyWeCanBeLol(t: Tree): Unit = {
      // Skip non-public members
      if (!t.symbol.info.get.isPublic)
        return

      // Remove definition bodies
      var t2: Tree =
        t match {
          case Defn.Def(mods, name, tparams, paramss, Some(tpe), _) => Decl.Def(mods, name, tparams, paramss, tpe)
          case Defn.Val(mods, pats, Some(tpe), _)                   => Decl.Val(mods, pats, tpe)
          case Defn.Var(mods, pats, Some(tpe), _)                   => Decl.Var(mods, pats, tpe)
          case _                                                    => t
        }

      // Inspect annotations
      var deprecatedVer = Option.empty[String]

      def inspectAnnotations(mods: List[Mod]): List[Mod] =
        mods.filter {
          case Mod.Annot(Init(tpe, _, List(List(_, ver)))) if tpe.toString == "deprecated" =>
            deprecatedVer = Some {
              ver match {
                case Lit.String(s) => s
                case term          => term.toString
              }
            }
            false
          case _ => true
        }

      t2 match {
        case Decl.Def(mods, name, tparams, paramss, tpe) => t2 = Decl.Def(inspectAnnotations(mods), name, tparams, paramss, tpe)
        case Decl.Val(mods, pats, tpe)                   => t2 = Decl.Val(inspectAnnotations(mods), pats, tpe)
        case Decl.Var(mods, pats, tpe)                   => t2 = Decl.Var(inspectAnnotations(mods), pats, tpe)
        case Defn.Type(mods, names, params, tpe)         => t2 = Defn.Type(inspectAnnotations(mods), names, params, tpe)
        case _ =>
      }

      // Generate member desc
      val desc =
        t2
          .toString
          .replace('\n', ' ')
          .replace("=", " = ")
          .replace("@inline ", "")
          .replaceAll(", *", ", ")
          .replaceAll(" {2,}", " ")
          .trim
          .stripSuffix(" = js.native")
          .replaceAll(" = js.native(?=[^\n])", "?")

      // "?" means that type aliases come before everything else
      val name = Util.termName(t2).fold("?")(_.value)

      s.add(MutableState.Member(name, desc, deprecatedVer))
    }

    body.traverse {

      // Skip inner members that we collect at the outer scope
      case _: Defn.Class  =>
      case _: Defn.Object =>
      case _: Defn.Trait  =>
      case _: Pkg.Object  =>

      case d: Decl => letsSeeHowLazyWeCanBeLol(d)
      case d: Defn => letsSeeHowLazyWeCanBeLol(d)

      case _ =>
    }
  }

  private def isScalaJs(sym: Symbol): Boolean =
    sym.toString startsWith "scala/scalajs/js/"

  private def isScalaJsDom(sym: Symbol): Boolean =
    sym.toString startsWith "org/scalajs/dom/"

  override def afterComplete(): Unit =
    if (enabled) {
      saveReport()
      MutableState.global = null // can't set state= in early Scala versions
    }

  private def saveReport(): Unit = {
    val scalaVer    = Util.scalaSeriesVer.replace('.', '_')
    val projectRoot = System.getProperty("user.dir")
    val reportFile  = Paths.get(s"$projectRoot/api-reports/$scalaVer.txt")
    val api         = state.result().iterator.map(_.stripPrefix("org/scalajs/dom/")).mkString("\n")

    val content =
      s"""|scala-js-dom API
          |================
          |
          |This is generated automatically on compile via custom Scalafix rule '${name.value}'.
          |
          |Flags:
          |  [J-] = JavaScript type
          |  [S-] = Scala type
          |  [-${ScopeType.Class.id}] = Class
          |  [-${ScopeType.Trait.id}] = Trait
          |  [-${ScopeType.Object.id}] = Object
          |
          |
          |$api
          |""".stripMargin

    println(s"[info] Generating $reportFile")
    Files.write(reportFile, content.getBytes(StandardCharsets.UTF_8))
  }
}
