/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** MutationRecord is the object that will be passed to the observer's callback. It has the following properties: */
@js.native
trait MutationRecord extends js.Object {

  /** Returns attributes if the mutation was an attribute mutation, characterData if it was a mutation to a
    * CharacterData node, and childList if it was a mutation to the tree of nodes.
    */
  def `type`: String = js.native

  /** Returns the node the mutation affected, depending on the type. For attributes, it is the element whose attribute
    * changed. For characterData, it is the CharacterData node. For childList, it is the node whose children changed.
    */
  def target: Node = js.native

  /** Return the nodes added. Will be an empty NodeList if no nodes were added. */
  def addedNodes: NodeList[Node] = js.native

  /** Return the nodes removed. Will be an empty NodeList if no nodes were removed. */
  def removedNodes: NodeList[Node] = js.native

  /** Return the previous sibling of the added or removed nodes, or null. */
  def previousSibling: Node = js.native

  /** Return the next sibling of the added or removed nodes, or null. */
  def nextSibling: Node = js.native

  /** Returns the local name of the changed attribute, or null. */
  def attributeName: String = js.native

  /** Returns the namespace of the changed attribute, or null. */
  def attributeNamespace: String = js.native

  /** The return value depends on the type. For attributes, it is the value of the changed attribute before the change.
    * For characterData, it is the data of the changed node before the change. For childList, it is null.
    */
  def oldValue: String = js.native
}
