/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

/** The ParentNode interface allows to traverse from an element to its children.
  *
  * ParentNode is a raw interface and no object of this type can be created; it is implemented by Element, Document, and
  * DocumentFragment objects.
  */
@js.native
trait ParentNode extends js.Object {

  /** Returns a live HTMLCollection containing all objects of type Element that are children of the object. */
  def children: HTMLCollection = js.native

  /** Returns the Element that is the first child of the object, or null if there is none. */
  def firstElementChild: Element = js.native

  /** Returns the Element that is the last child of the object, or null if there is none. */
  def lastElementChild: Element = js.native

  /** Returns an unsigned long giving the amount of children that the object has. */
  def childElementCount: Int = js.native

  /** Replaces the existing children of a Node with a specified new set of children. */
  def replaceChildren(nodes: (Node | String)*): Unit = js.native
}
