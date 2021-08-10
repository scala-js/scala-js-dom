package org.scalajs.dom.scalafix

import java.nio.charset.StandardCharsets
import java.nio.file.{Paths, Files}
import scala.meta._
import scalafix.v1._

class GenerateApiReport extends SemanticRule("GenerateApiReport") {
  import MutableState.{global => state, ScopeType}

  override def beforeStart(): Unit = {
    state = new MutableState
  }

  override def fix(implicit doc: SemanticDocument): Patch = {

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
    if (!sym.info.get.isPublic)
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
      val t2: Tree =
        t match {
          case Defn.Def(mods, name, tparams, paramss, Some(tpe), _) => Decl.Def(mods, name, tparams, paramss, tpe)
          case Defn.Val(mods, pats, Some(tpe), _)                   => Decl.Val(mods, pats, tpe)
          case Defn.Var(mods, pats, Some(tpe), _)                   => Decl.Var(mods, pats, tpe)
          case _                                                    => t
        }

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

      s.add(desc)
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

  override def afterComplete(): Unit = {
    saveReport()
    state = null
  }

  private def saveReport(): Unit = {
    val projectRoot = System.getProperty("user.dir")
    val reportFile  = Paths.get(s"$projectRoot/api.txt")
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

    Files.write(reportFile, content.getBytes(StandardCharsets.UTF_8))
  }
}
