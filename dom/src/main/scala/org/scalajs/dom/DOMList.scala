/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait DOMList[+T] extends js.Object {
  def length: Int = js.native

  @JSBracketAccess
  def apply(index: Int): T = js.native
}

object DOMList {

  implicit def domListAsSeq[T](domList: DOMList[T]): scala.collection.Seq[T] =
    new DOMListSeq(domList)

  private final class DOMListSeq[+T](domList: DOMList[T]) extends scala.collection.Seq[T] {

    def length: Int = domList.length

    def apply(x: Int): T = domList(x)

    def iterator: Iterator[T] = new DOMListIterator(domList)
  }

  private final class DOMListIterator[+T](domList: DOMList[T]) extends Iterator[T] {

    private[this] var index = 0

    def hasNext: Boolean = index < domList.length

    def next(): T = {
      val res = domList(index)
      index += 1
      res
    }
  }
}
