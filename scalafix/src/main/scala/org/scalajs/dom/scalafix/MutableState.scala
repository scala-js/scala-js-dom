package org.scalajs.dom.scalafix

import scala.annotation.tailrec
import scala.collection.immutable.SortedSet
import scala.collection.mutable
import scala.meta._
import scalafix.v1._

final class MutableState {
  import MutableState._

  private[this] val scopes = mutable.Map.empty[Symbol, Scope]

  def register(sym: Symbol, isJsType: Boolean, scopeType: ScopeType, parents: Set[Symbol]): Scope = synchronized {
    scopes.get(sym) match {
      case None =>
        val s = Scope(sym)(scopeType, parents)
        scopes.update(sym, s)
        s.isJsType = isJsType
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
    val sortHack = "-OMG-"

    val b = SortedSet.newBuilder[(String, String)](Ordering.by(_._1))

    // Pass 1
    for (root <- scopes.valuesIterator) {
      if (!root.isJsType && scopeParents(root).exists(_.isJsType))
        root.isJsType = true
    }

    // Pass 2
    for (root <- scopes.valuesIterator) {
      val name = root.symbol.value.stripSuffix("#").stripSuffix(".")
      val prefix = {
        val lang = if (root.isJsType) "J" else "S"
        val typ  = root.scopeType.id
        s"$name$sortHack[$lang$typ] "
      }

      var membersFound = false
      for {
        s <- root :: scopeParents(root)
        v <- s.directMembers
      } {
        membersFound = true
        b += ((name, prefix + v))
      }

      if (!membersFound && !name.endsWith("/package"))
        b += ((name, prefix.trim))
    }

    val array = b.result().toArray.map(_._2)
    for (i <- array.indices)
      array(i) = array(i).replace(sortHack, "")
    array
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

  final case class Scope(symbol: Symbol)
                        (val scopeType: ScopeType,
                         val parents: Set[Symbol]) {

    private[MutableState] val directMembers = mutable.Set.empty[String]
    private[MutableState] var isJsType = false

    def add(ov: Option[String]): Unit =
      ov.foreach(add(_))

    def add(v: String): Unit =
      synchronized(directMembers += v)
  }
}
