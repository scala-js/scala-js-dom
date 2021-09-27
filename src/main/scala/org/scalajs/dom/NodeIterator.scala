/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The NodeIterator interface represents an iterator over the members of a list of the nodes in a subtree of the DOM.
  * The nodes will be returned in document order.
  *
  * A NodeIterator can be created using the Document.createNodeIterator() method.
  */
@js.native
@JSGlobal
class NodeIterator extends js.Object {

  /** Returns an unsigned long being a bitmask made of constants describing the types of Node that must to be presented.
    * Non-matching nodes are skipped, but their children may be included, if relevant. The possible values are: Constant
    * Numerical value Description NodeFilter.SHOW_ALL -1 (that is the max value of unsigned long) Shows all nodes.
    * NodeFilter.SHOW_ATTRIBUTE 2 Shows attribute Attr nodes. This is meaningful only when creating a NodeIterator with
    * an Attr node as its root; in this case, it means that the attribute node will appear in the first position of the
    * iteration or traversal. Since attributes are never children of other nodes, they do not appear when traversing
    * over the document tree. NodeFilter.SHOW_CDATA_SECTION 8 Shows CDATASection nodes. NodeFilter.SHOW_COMMENT 128
    * Shows Comment nodes. NodeFilter.SHOW_DOCUMENT 256 Shows Document nodes. NodeFilter.SHOW_DOCUMENT_FRAGMENT 1024
    * Shows DocumentFragment nodes. NodeFilter.SHOW_DOCUMENT_TYPE 512 Shows DocumentType nodes. NodeFilter.SHOW_ELEMENT
    * 1 Shows Element nodes. NodeFilter.SHOW_ENTITY 32 Shows Entity nodes. This is meaningful only when creating a
    * NodeIterator with an Entity node as its root; in this case, it means that the Entity node will appear in the first
    * position of the traversal. Since entities are not part of the document tree, they do not appear when traversing
    * over the document tree. NodeFilter.SHOW_ENTITY_REFERENCE 16 Shows EntityReference nodes. NodeFilter.SHOW_NOTATION
    * 2048 Shows Notation nodes. This is meaningful only when creating a NodeIterator with a Notation node as its root;
    * in this case, it means that the Notation node will appear in the first position of the traversal. Since entities
    * are not part of the document tree, they do not appear when traversing over the document tree.
    * NodeFilter.SHOW_PROCESSING_INSTRUCTION 64 Shows ProcessingInstruction nodes. NodeFilter.SHOW_TEXT 4 Shows
    * Text nodes.
    */
  var whatToShow: Int = js.native

  /** The NodeIterator.filter read-only method returns a NodeFilter object, that is an object implement an
    * acceptNode(node) method, used to screen nodes.
    */
  def filter: NodeFilter = js.native

  /** The NodeIterator.root read-only property represents the Node that is the root of what the NodeIterator traverses.
    */
  def root: Node = js.native

  /** The NodeIterator.nextNode() method returns the next node in the set represented by the NodeIterator and advances
    * the position of the iterator within the set.  The first call to nextNode() returns the first node in the set.
    */
  def nextNode(): Node = js.native

  /** This operation is a no-op. It doesn't do anything. Previously it was telling the engine that the NodeIterator was
    * no more used, but this is now useless.
    */
  def detach(): Unit = js.native

  /** The NodeIterator.previousNode() method returns the previous node in the set represented by the NodeIterator and
    * moves the position of the iterator backwards within the set.
    */
  def previousNode(): Node = js.native
}
