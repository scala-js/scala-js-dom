/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A NodeFilter interface represents an object used to filter the nodes in a NodeIterator or TreeWalker. They don't
  * know anything about the DOM or how to traverse nodes; they just know how to evaluate a single node against the
  * provided filter.
  */
@js.native
@JSGlobal
class NodeFilter extends js.Object {

  /** Returns an unsigned short that will be used to tell if a given Node must be accepted or not by the NodeIterator or
    * TreeWalker iteration algorithm. This method is expected to be written by the user of a NodeFilter. Possible return
    * values are: Constant Description FILTER_ACCEPT Value returned by the NodeFilter.acceptNode() method when a node
    * should be accepted. FILTER_REJECT Value to be returned by the NodeFilter.acceptNode() method when a node should be
    * rejected. The children of rejected nodes are not visited by the NodeIterator or TreeWalker object; this value is
    * treated as "skip this node and all its children". FILTER_SKIP Value to be returned by NodeFilter.acceptNode() for
    * nodes to be skipped by the NodeIterator or TreeWalker object. The children of skipped nodes are still considered.
    * This is treated as "skip this node but not its children".
    */
  def acceptNode(n: Node): Int = js.native
}

@js.native
@JSGlobal
object NodeFilter extends js.Object {

  val SHOW_ENTITY_REFERENCE: Int = js.native
  val SHOW_NOTATION: Int = js.native
  val SHOW_ENTITY: Int = js.native
  val SHOW_DOCUMENT: Int = js.native
  val SHOW_PROCESSING_INSTRUCTION: Int = js.native

  /** Value to be returned by the NodeFilter.acceptNode() method when a node should be rejected. The children of
    * rejected nodes are not visited by the NodeIterator or TreeWalker object; this value is treated as "skip this node
    * and all its children".
    */
  val FILTER_REJECT: Int = js.native
  val SHOW_CDATA_SECTION: Int = js.native

  /** Value returned by the NodeFilter.acceptNode() method when a node should be accepted. */
  val FILTER_ACCEPT: Int = js.native
  val SHOW_ALL: Int = js.native
  val SHOW_DOCUMENT_TYPE: Int = js.native
  val SHOW_TEXT: Int = js.native
  val SHOW_ELEMENT: Int = js.native
  val SHOW_COMMENT: Int = js.native

  /** Value to be returned by NodeFilter.acceptNode() for nodes to be skipped by the NodeIterator or TreeWalker object.
    * The children of skipped nodes are still considered. This is treated as "skip this node but not its children".
    */
  val FILTER_SKIP: Int = js.native
  val SHOW_ATTRIBUTE: Int = js.native
  val SHOW_DOCUMENT_FRAGMENT: Int = js.native
}
