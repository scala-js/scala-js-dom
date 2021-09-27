/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
object XPathResult extends js.Object {

  /** A result set containing whatever type naturally results from evaluation of the expression. Note that if the result
    * is a node-set then UNORDERED_NODE_ITERATOR_TYPE is always the resulting type.
    */
  val ANY_TYPE: Int = js.native

  /** A result containing a single number. This is useful for example, in an XPath expression using the count()
    * function.
    */
  val NUMBER_TYPE: Int = js.native

  /** A result containing a single string. */
  val STRING_TYPE: Int = js.native

  /** A result containing a single boolean value. This is useful for example, in an XPath expression using the not()
    * function.
    */
  val BOOLEAN_TYPE: Int = js.native

  /** A result node-set containing all the nodes matching the expression. The nodes may not necessarily be in the same
    * order that they appear in the document.
    */
  val UNORDERED_NODE_ITERATOR_TYPE: Int = js.native

  /** A result node-set containing all the nodes matching the expression. The nodes in the result set are in the same
    * order that they appear in the document.
    */
  val ORDERED_NODE_ITERATOR_TYPE: Int = js.native

  /** A result node-set containing snapshots of all the nodes matching the expression. The nodes may not necessarily be
    * in the same order that they appear in the document.
    */
  val UNORDERED_NODE_SNAPSHOT_TYPE: Int = js.native

  /** A result node-set containing snapshots of all the nodes matching the expression. The nodes in the result set are
    * in the same order that they appear in the document.
    */
  val ORDERED_NODE_SNAPSHOT_TYPE: Int = js.native

  /** A result node-set containing any single node that matches the expression. The node is not necessarily the first
    * node in the document that matches the expression.
    */
  val ANY_UNORDERED_NODE_TYPE: Int = js.native

  /** A result node-set containing the first node in the document that matches the expression. */
  val FIRST_ORDERED_NODE_TYPE: Int = js.native
}

@js.native
@JSGlobal
class XPathResult extends js.Object {
  def booleanValue: Boolean = js.native
  def invalidIteratorState: Boolean = js.native
  def numberValue: Double = js.native
  def resultType: Int = js.native
  def singleNodeValue: Node = js.native
  def snapshotLength: Int = js.native
  def stringValue: String = js.native
  def iterateNext(): Node = js.native
  def snapshotItem(index: Int): Node = js.native
}
