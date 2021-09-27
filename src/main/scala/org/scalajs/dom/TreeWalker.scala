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

/** The TreeWalker object represents the nodes of a document subtree and a position within them.
  *
  * A TreeWalker can be created using the Document.createTreeWalker() method.
  */
@js.native
@JSGlobal
class TreeWalker extends js.Object {

  /** Returns an unsigned long being a bitmask made of constants describing the types of Node that must to be presented.
    * Non-matching nodes are skipped, but their children may be included, if relevant.
    */
  def whatToShow: Int = js.native

  /** The TreeWalker.filter read-only property returns a NodeFilter that is the filtering object associated with the
    * TreeWalker.
    */
  def filter: NodeFilter = js.native

  /** The TreeWalker.root read-only property returns the node that is the root of what the TreeWalker traverses. */
  def root: Node = js.native

  /** The TreeWalker.currentNode property represents the Node on which the TreeWalker is currently pointing at. */
  var currentNode: Node = js.native

  /** The TreeWalker.previousSibling() method moves the current Node to its previous sibling, if any, and returns the
    * found sibling. I there is no such node, return null and the current node is not changed.
    */
  def previousSibling(): Node = js.native

  /** The TreeWalker.lastChild() method moves the current Node to the last visible child of the current node, and
    * returns the found child. It also moves the current node to this child. If no such child exists, returns null and
    * the current node is not changed.
    */
  def lastChild(): Node = js.native

  /** The TreeWalker.nextSibling() method moves the current Node to its next sibling, if any, and returns the found
    * sibling. I there is no such node, return null and the current node is not changed.
    */
  def nextSibling(): Node = js.native

  /** The TreeWalker.nextNode() method moves the current Node to the next visible node in the document order, and
    * returns the found node. It also moves the current node to this one. If no such node exists, returns null and the
    * current node is not changed.
    */
  def nextNode(): Node = js.native

  /** The TreeWalker.parentNode() method moves the current Node to the first visible ancestor node in the document
    * order, and returns the found node. It also moves the current node to this one. If no such node exists, or if it is
    * before that the root node defined at the object construction, returns null and the current node is not changed.
    */
  def parentNode(): Node = js.native

  /** The TreeWalker.firstChild() method moves the current Node to the first visible child of the current node, and
    * returns the found child. It also moves the current node to this child. If no such child exists, returns null and
    * the current node is not changed.
    */
  def firstChild(): Node = js.native

  /** The TreeWalker.previousNode() method moves the current Node to the previous visible node in the document order,
    * and returns the found node. It also moves the current node to this one. If no such node exists,or if it is before
    * that the root node defined at the object construction, returns null and the current node is not changed.
    */
  def previousNode(): Node = js.native
}
