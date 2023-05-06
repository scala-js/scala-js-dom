/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A Node is an interface from which a number of DOM types inherit, and allows these various types to be treated (or
  * tested) similarly.
  *
  * The following interfaces all inherit from Node its methods and properties: Document, Element, CharacterData (which
  * Text, Comment, and CDATASection inherit), ProcessingInstruction, DocumentFragment, DocumentType, Notation, Entity,
  * EntityReference
  *
  * These interfaces may return null in particular cases where the methods and properties are not relevant. They may
  * throw an exception - for example when adding children to a node type for which no children can exist.
  */
@js.native
@JSGlobal
abstract class Node extends EventTarget {

  /** The read-only Node.nodeType property returns an unsigned short integer representing the type of the node. */
  def nodeType: Int = js.native

  /** Returns the node immediately preceding the specified one in its parent's childNodes list, null if the specified
    * node is the first in that list.
    */
  def previousSibling: Node = js.native

  /** Returns a DOMString representing the local part of the qualified name of an element. In Firefox 3.5 and earlier,
    * the property upper-cases the local name for HTML elements (but not XHTML elements). In later versions, this does
    * not happen, so the property is in lower case for both HTML and XHTML. Though the specification requires localName
    * to be defined on the Node interface, Gecko-based browsers implement it on the Element interface.
    */
  def localName: String = js.native

  /** The namespace URI of this node, or null if it is no namespace. In Firefox 3.5 and earlier, HTML elements are in no
    * namespace. In later versions, HTML elements are in the http://www.w3.org/1999/xhtml namespace in both HTML and
    * XML trees. Though the specification requires namespaceURI to be defined on the Node interface, Gecko-based
    * browsers implement it on the Element interface.
    */
  def namespaceURI: String = js.native

  /** Is a DOMString representing the textual content of an element and all its descendants. */
  var textContent: String = js.native

  /** Returns a Node that is the parent of this node. If there is no such node, like if this node is the top of the tree
    * or if doesn't participate in a tree, this property returns null.
    */
  def parentNode: Node = js.native

  /** Returns the node immediately following the specified one in its parent's childNodes list, or null if the specified
    * node is the last node in that list.
    */
  def nextSibling: Node = js.native

  /** Is a DOMString representing the value of an object. For most Node type, this returns null and any set operation is
    * ignored. For nodes of type TEXT_NODE (Text objects), COMMENT_NODE (Comment objects), and
    * PROCESSING_INSTRUCTION_NODE (ProcessingInstruction objects), the value corresponds to the text data contained in
    * the object.
    */
  var nodeValue: String = js.native

  /** Returns a Node representing the last direct child node of the node, or null if the node has no child. */
  def lastChild: Node = js.native

  /** Returns a live NodeList containing all the children of this node. NodeList being live means that if the children
    * of the Node change, the NodeList object is automatically updated.
    */
  def childNodes: NodeList[Node] = js.native

  /** Returns a DOMString containing the name of the Node. The structure of the name will differ with the name type.
    * E.g. An HTMLElement will contain the name of the corresponding tag, like 'audio' for an HTMLAudioElement, a Text
    * node will have the '#text' string, or a Document node will have the '#document' string.
    */
  def nodeName: String = js.native

  /** Returns the Document that this node belongs to. If no document is associated with it, returns null. */
  def ownerDocument: Document = js.native

  /** Returns the node's first child in the tree, or null if the node is childless. If the node is a Document, it
    * returns the first node in the list of its direct children.
    */
  def firstChild: Node = js.native

  /** Removes a child node from the current element, which must be a child of the current node. */
  def removeChild(oldChild: Node): Node = js.native

  /** Adds a node to the end of the list of children of a specified parent node. If the node already exists it is
    * removed from current parent node, then added to new parent node.
    */
  def appendChild(newChild: Node): Node = js.native

  /** The Node.isSupported()returns a Boolean flag containing the result of a test whether the DOM implementation
    * implements a specific feature and this feature is supported by the specific node.
    */
  def isSupported(feature: String, version: String): Boolean = js.native

  /** If #targetElm is first div element in document, "true" will be displayed. */
  def isEqualNode(arg: Node): Boolean = js.native

  /** Returns the prefix for a given namespaceURI if present, and null if not. When multiple prefixes are possible, the
    * result is implementation-dependent.
    */
  def lookupPrefix(namespaceURI: String): String = js.native

  /** isDefaultNamespace accepts a namespace URI as an argument and returns true if the namespace is the default
    * namespace on the given node or false if not.
    */
  def isDefaultNamespace(namespaceURI: String): Boolean = js.native

  /** Compares the position of the current node against another node in any other document. */
  def compareDocumentPosition(other: Node): Int = js.native

  /** Puts the specified node and all of its subtree into a "normalized" form. In a normalized subtree, no text nodes in
    * the subtree are empty and there are no adjacent text nodes.
    */
  def normalize(): Unit = js.native

  /** Tests whether two nodes are the same, that is they reference the same object. */
  def isSameNode(other: Node): Boolean = js.native

  /** Returns a Boolean value indicating whether a node is a descendant of a given node, i.e. the node itself, one of
    * its direct children (childNodes), one of the children's direct children, and so on.
    */
  def contains(otherNode: Node): Boolean = js.native

  /** Takes a prefix and returns the namespaceURI associated with it on the given node if found (and null if not).
    * Supplying null for the prefix will return the default namespace.
    */
  def lookupNamespaceURI(prefix: String): String = js.native

  /** Clone a Node, and optionally, all of its contents. By default, it clones the content of the node. */
  def cloneNode(deep: Boolean = js.native): Node = js.native

  /** hasChildNodes returns a Boolean value indicating whether the current Node has child nodes or not. */
  def hasChildNodes(): Boolean = js.native

  /** Replaces one child Node of the current one with the second one given in parameter. */
  def replaceChild(newChild: Node, oldChild: Node): Node = js.native

  /** Inserts the first Node given in a parameter immediately before the second, child of this element, Node. */
  def insertBefore(newChild: Node, refChild: Node): Node = js.native

  /** Returns the absolute base URL of this Node. */
  def baseURI: String = js.native

  /** True if this Node is connected to the Document context object (or ShadowRoot in the case of shadow DOM) */
  def isConnected: Boolean = js.native

  /** Represents the "rendered" text content of a node and its descendants. As a getter, it approximates the text the
    * user would get if they highlighted the contents of the element with the cursor and then copied to the clipboard.
    */
  var innerText: String = js.native
}

@js.native
@JSGlobal
object Node extends js.Object {
  def ENTITY_REFERENCE_NODE: Int = js.native

  def ATTRIBUTE_NODE: Int = js.native

  def DOCUMENT_FRAGMENT_NODE: Int = js.native

  def TEXT_NODE: Int = js.native

  def ELEMENT_NODE: Int = js.native

  def COMMENT_NODE: Int = js.native

  def DOCUMENT_POSITION_DISCONNECTED: Int = js.native

  def DOCUMENT_POSITION_CONTAINED_BY: Int = js.native

  def DOCUMENT_POSITION_CONTAINS: Int = js.native

  def DOCUMENT_TYPE_NODE: Int = js.native

  def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Int = js.native

  def DOCUMENT_NODE: Int = js.native

  def ENTITY_NODE: Int = js.native

  def PROCESSING_INSTRUCTION_NODE: Int = js.native

  def CDATA_SECTION_NODE: Int = js.native

  def NOTATION_NODE: Int = js.native

  def DOCUMENT_POSITION_FOLLOWING: Int = js.native

  def DOCUMENT_POSITION_PRECEDING: Int = js.native
}
