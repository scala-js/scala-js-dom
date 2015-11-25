package scala.scalajs.js.dom.experimental

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSBracketCall}

/**
 * See [[https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols The iterable protocol]]
 * on MDN
 *
 * todo: to be replaced by official version once
 * https://github.com/scala-js/scala-js/issues/1141
 * is completed
 */
@ScalaJSDefined
trait JSIterable[A] extends js.Object

@ScalaJSDefined
trait JSIterator[+A] extends js.Object {
  def next(): JSIterator.Entry[A]
}

object JSIterator {
  private val iteratorSymbol = g.Symbol.iterator

  @js.native
  private trait IteratorMethodAccess extends js.Object {
    @JSBracketCall
    def bracketCall[A](method: js.Any)(): A
  }

  @ScalaJSDefined
  trait Entry[+A] extends js.Object {
    def done: Boolean
    def value: A
  }

  def toIterator[A](it: JSIterator[A]): scala.collection.Iterator[A] = {
    new scala.collection.Iterator[A]() {
      private var nextEntry: Entry[A] = it.next()

      def hasNext: Boolean = !nextEntry.done

      def next(): A = {
        val result = nextEntry.value
        nextEntry = it.next()
        result
      }
    }
  }

  implicit class IterableW[+A](it: JSIterable[A]) {
    def iterator(): Iterator[A] =
      toIterator(it.asInstanceOf[IteratorMethodAccess].bracketCall[JSIterator[A]](iteratorSymbol)())
  }
}
