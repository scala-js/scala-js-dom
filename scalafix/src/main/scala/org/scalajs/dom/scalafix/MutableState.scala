package org.scalajs.dom.scalafix

import scala.annotation.tailrec
import scala.collection.immutable.SortedSet
import scala.collection.mutable
import scalafix.v1._

final class MutableState {
  import MutableState._

  private[this] val scopes = mutable.Map.empty[Symbol, Scope]

  def register(sym: Symbol, isJsType: Boolean, scopeType: ScopeType, parents: Set[Symbol],
      deprecatedVer: Option[String]): Scope = synchronized {
    scopes.get(sym) match {
      case None =>
        val s = Scope(sym)(scopeType, parents)
        scopes.update(sym, s)
        s.isJsType = isJsType
        s.deprecatedVer = deprecatedVer
        s
      case Some(s) =>
        s
    }
  }

  private def scopeParents(root: Scope): List[Scope] = {
    @tailrec
    def go(s: Scope, seen: Set[Symbol], queue: Set[Symbol], results: List[Scope]): List[Scope] =
      if (!seen.contains(s.symbol))
        go(s, seen + s.symbol, queue ++ s.parents, s :: results)
      else if (queue.nonEmpty) {
        val sym = queue.head
        val nextQueue = queue - sym
        scopes.get(sym) match {
          case Some(scope) => go(scope, seen, nextQueue, results)
          case None        => go(s, seen, nextQueue, results)
        }
      } else
        results

    go(root, Set.empty, Set.empty, Nil)
  }

  def result(): Array[String] = synchronized {
    // Because - comes before . in ASCII this little hack affects the ordering so that A[X] comes before A.B[X]
    val sortHack = "-"

    val b = SortedSet.newBuilder[Result]

    def deprecationSuffix(ver: Option[String]): String =
      ver match {
        case None    => ""
        case Some(v) => s"  (@deprecated in $v)"
      }

    // Pass 1
    for (root <- scopes.valuesIterator) {
      val parents = scopeParents(root)
      if (!root.isJsType && parents.exists(_.isJsType))
        root.isJsType = true
      if (root.deprecatedVer.isEmpty)
        for (p <- parents.find(_.deprecatedVer.isDefined))
          root.deprecatedVer = p.deprecatedVer
    }

    // Pass 2
    for (root <- scopes.valuesIterator) {
      val scopeName = root.symbol.value.stripSuffix("#").stripSuffix(".")
      val flagLang = if (root.isJsType) "J" else "S"
      val flagTyp = root.scopeType.id
      val flags = flagLang + flagTyp
      val prefix = s"$scopeName[$flags] "
      val scopeKey = s"$scopeName$sortHack[$flags"

      var membersFound = false
      for {
        s <- root :: scopeParents(root)
        m <- s.directMembers
      } {
        membersFound = true
        val key = (scopeKey, m.name, m.desc)
        val result = prefix + m.desc + deprecationSuffix(m.deprecatedVer.orElse(root.deprecatedVer))
        b += Result(key, result)
      }

      if (!membersFound && !scopeName.endsWith("/package")) {
        val key = (scopeKey, " ", "")
        val result = prefix.trim + deprecationSuffix(root.deprecatedVer)
        b += Result(key, result)
      }
    }

    b.result().iterator.map(_.value).toArray
  }
}

object MutableState {
  var global: MutableState = null

  sealed abstract class ScopeType(final val id: String)

  object ScopeType {
    case object Class extends ScopeType("C")
    case object Trait extends ScopeType("T")
    case object Object extends ScopeType("O")
  }

  final case class Scope(symbol: Symbol)(val scopeType: ScopeType, val parents: Set[Symbol]) {

    private[MutableState] val directMembers = mutable.Set.empty[Member]
    private[MutableState] var isJsType = false
    private[MutableState] var deprecatedVer = Option.empty[String]

    def add(v: Member): Unit =
      synchronized(directMembers += v)
  }

  final case class Member(name: String, desc: String, deprecatedVer: Option[String])

  private[MutableState] final case class Result(sortKey: Result.SortKey, value: String)

  private[MutableState] object Result {
    type SortKey = (String, String, String) // prefix, name, desc
    implicit val ordering: Ordering[Result] = Ordering.by(_.sortKey)
  }
}
