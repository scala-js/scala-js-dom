/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The Range interface represents a fragment of a document that can contain nodes and parts of text nodes in a given
  * document.
  *
  * A range can be created using the createRange method of the Document object. Range objects can also be retrieved by
  * using the getRangeAt method of the Selection object. There also is the Range() constructor available.
  */
@js.native
@JSGlobal
class Range extends AbstractRange {

  /** The Range.commonAncestorContainer read-only property returns the deepest, or further down the document tree, Node
    * that contains both the Range.startContainer and Range.endContainer nodes.
    */
  def commonAncestorContainer: Node = js.native

  /** The Range.setStart() method sets the start position of a Range. */
  def setStart(refNode: Node, offset: Int): Unit = js.native

  /** The Range.setEndBefore() method sets the end position of a Range relative to another Node. The parent Node of end
    * of the Range will be the same as that for the referenceNode.
    */
  def setEndBefore(refNode: Node): Unit = js.native

  /** The Range.setStartBefore() method sets the start position of a Range relative to another Node. The parent Node of
    * the start of the Range will be the same as that for the referenceNode.
    */
  def setStartBefore(refNode: Node): Unit = js.native

  /** The Range.selectNode() method sets the Range to contain the Node and its contents. The parent Node of the start
    * and end of the Range will be the same as the parent of the referenceNode.
    */
  def selectNode(refNode: Node): Unit = js.native

  /** The Range.detach() method releases a Range from use. This lets the browser choose to release resources associated
    * with this Range. Subsequent attempts to use the detached range will result in a DOMException being thrown with an
    * error code of INVALID_STATE_ERR.
    */
  def detach(): Unit = js.native

  /** The Range.getBoundingClientRect() method returns a DOMRect object that bounds the contents of the range; this a
    * rectangle enclosing the union of the bounding rectangles for all the elements in the range.
    */
  def getBoundingClientRect(): DOMRect = js.native

  /** The Range.compareBoundaryPoints() method compares the boundary points of the Range with another one. */
  def compareBoundaryPoints(how: Int, sourceRange: Range): Int = js.native

  /** The Range.insertNode() method inserts a node at the start of the Range. */
  def insertNode(newNode: Node): Unit = js.native

  /** The Range.collapse() method collapses the Range to one of its boundary points. */
  def collapse(toStart: Boolean): Unit = js.native

  /** The Range.selectNodeContents() sets the Range to contain the contents of a Node. */
  def selectNodeContents(refNode: Node): Unit = js.native

  /** The Range.cloneContents() returns a DocumentFragment copying the objects of type Node included in the Range. */
  def cloneContents(): DocumentFragment = js.native

  /** The Range.setEnd() method sets the end position of a Range. */
  def setEnd(refNode: Node, offset: Int): Unit = js.native

  /** The Range.cloneRange() method returns a Range object with boundary points identical to the cloned Range. */
  def cloneRange(): Range = js.native

  /** The Range.getClientRects() method returns a list of ClientRect objects representing the area of the screen
    * occupied by the range. This is created by aggregating the results of calls to Element.getClientRects() for all the
    * elements in the range.
    */
  def getClientRects(): DOMRectList = js.native

  /** The Range.surroundContents() method moves content of the Range into a new node, placing the new node at the start
    * of the specified range.
    */
  def surroundContents(newParent: Node): Unit = js.native

  /** The Range.deleteContents() removes the contents of the Range from the Document. */
  def deleteContents(): Unit = js.native

  /** The Range.setStartAfter() method sets the start position of a Range relative to a Node. The parent Node of the
    * start of the Range will be the same as that for the referenceNode.
    */
  def setStartAfter(refNode: Node): Unit = js.native

  /** The Range.extractContents() method moves contents of the Range from the document tree into a DocumentFragment. */
  def extractContents(): DocumentFragment = js.native

  /** The Range.setEndAfter() method sets the end position of a Range relative to another Node. The parent Node of end
    * of the Range will be the same as that for the referenceNode.
    */
  def setEndAfter(refNode: Node): Unit = js.native

  /** The Range.createContextualFragment() method returns a DocumentFragment by invoking the HTML fragment parsing
    * algorithm or the XML fragment parsing algorithm with the start of the range (the parent of the selected node) as
    * the context node. The HTML fragment parsing algorithm is used if the range belongs to a Document whose HTMLness
    * bit is set. In the HTML case, if the context node would be html, for historical reasons the fragment parsing
    * algorithm is invoked with body as the context instead.
    */
  def createContextualFragment(fragment: String): DocumentFragment = js.native
}

@js.native
@JSGlobal
object Range extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Range),List())))) */
  val END_TO_END: Int = js.native
  val START_TO_START: Int = js.native
  val START_TO_END: Int = js.native
  val END_TO_START: Int = js.native
}
