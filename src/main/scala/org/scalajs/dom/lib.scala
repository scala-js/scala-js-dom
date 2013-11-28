/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom

import scala.scalajs.js

/**
 * The PositionOptions interface describes the options to use when calling the
 * geolocation backend. The user agent itself doesn't create such an object itself:
 * it is the calling script that create it and use it as a parameter of
 * Geolocation.getCurrentPosition() and Geolocation.watchPosition().
 *
 * MDN
 */
class PositionOptions extends js.Object {
  /**
   * The PositionOptions.enableHighAccuracy property is a Boolean that indicates
   * the application would like to receive the best possible results. If true and if the
   * device is able to provide a more accurate position, it will do so. Note that this can
   * result in slower response times or increased power consumption (with a GPS chip on a
   * mobile device for example). On the other hand, if false (the default value), the
   * device can take the liberty to save resources by responding more quickly and/or
   * using less power.
   *
   * MDN
   */
  var enableHighAccuracy: js.Boolean = _
  /**
   * The PositionOptions.timeout property is a positive long value representing the
   * maximum length of time (in milliseconds) the device is allowed to take in order to
   * return a position. The default value is Infinity, meaning that
   * getCurrentPosition() won't return until the position is available.
   *
   * MDN
   */
  var timeout: js.Number = _
  /**
   * The PositionOptions.maximumAge property is a positive long value indicating the
   * maximum age in milliseconds of a possible cached position that is acceptable to
   * return. If set to 0, it means that the device cannot use a cached position and must
   * attempt to retrieve the real current position. If set to Infinity the device must
   * return a cached position regardless of its age.
   *
   * MDN
   */
  var maximumAge: js.Number = _
}

/**
 * The NavigatorID interface contains methods and properties related to the
 * identity of the browser.
 *
 * MDN
 */
trait NavigatorID extends js.Object {
  /**
   * Returns the version of the browser as a string. It may be either a plain version
   * number, like "5.0", or a version number followed by more detailed information. The
   * HTML5 specification also allows any browser to return "4.0" here, for
   * compatibility reasons.
   *
   * MDN
   */
  var appVersion: js.String = _
  /**
   * Returns the name of the browser. The HTML5 specification also allows any browser to
   * return "Netscape" here, for compatibility reasons.
   *
   * MDN
   */
  var appName: js.String = _
  /**
   * Returns the user agent string for the current browser.
   *
   * MDN
   */
  var userAgent: js.String = _
  /**
   * Returns a string representing the platform of the browser.
   *
   * MDN
   */
  var platform: js.String = _
}

/**
 * The TreeWalker object represents the nodes of a document subtree and a position
 * within them.
 *
 * MDN
 */
class TreeWalker extends js.Object {
  /**
   * Returns an unsigned long being a bitmask made of constants describing the types of
   * Node that must to be presented. Non-matching nodes are skipped, but their children
   * may be included, if relevant. The possible values are: Constant Numerical value
   * Description NodeFilter.SHOW_ALL -1 (that is the max value of unsigned long) Shows
   * all nodes. NodeFilter.SHOW_ATTRIBUTE 2 Shows attribute Attr nodes. This is
   * meaningful only when creating a TreeWalker with an Attr node as its root; in this
   * case, it means that the attribute node will appear in the first position of the
   * iteration or traversal. Since attributes are never children of other nodes, they
   * do not appear when traversing over the document tree.
   * NodeFilter.SHOW_CDATA_SECTION 8 Shows CDATASection nodes.
   * NodeFilter.SHOW_COMMENT 128 Shows Comment nodes. NodeFilter.SHOW_DOCUMENT
   * 256 Shows Document nodes. NodeFilter.SHOW_DOCUMENT_FRAGMENT 1024 Shows
   * DocumentFragment nodes. NodeFilter.SHOW_DOCUMENT_TYPE 512 Shows
   * DocumentType nodes. NodeFilter.SHOW_ELEMENT 1 Shows Element nodes.
   * NodeFilter.SHOW_ENTITY 32 Shows Entity nodes. This is meaningful only when
   * creating a TreeWalker with an Entity node as its root; in this case, it means that the
   * Entity node will appear in the first position of the traversal. Since entities are
   * not part of the document tree, they do not appear when traversing over the document
   * tree. NodeFilter.SHOW_ENTITY_REFERENCE 16 Shows EntityReference nodes.
   * NodeFilter.SHOW_NOTATION 2048 Shows Notation nodes. This is meaningful only
   * when creating a TreeWalker with a Notation node as its root; in this case, it means
   * that the Notation node will appear in the first position of the traversal. Since
   * entities are not part of the document tree, they do not appear when traversing over
   * the document tree. NodeFilter.SHOW_PROCESSING_INSTRUCTION 64 Shows
   * ProcessingInstruction nodes. NodeFilter.SHOW_TEXT 4 Shows Text nodes.
   *
   * MDN
   */
  var whatToShow: js.Number = _
  /**
   * The TreeWalker.filter read-only property returns a NodeFilter that is the
   * filtering object associated with the TreeWalker.
   *
   * MDN
   */
  var filter: NodeFilter = _
  /**
   * The TreeWalker.root read-only property returns the node that is the root of what
   * the TreeWalker traverses.
   *
   * MDN
   */
  var root: Node = _
  /**
   * The TreeWalker.currentNode property represents the Node on which the TreeWalker
   * is currently pointing at.
   *
   * MDN
   */
  var currentNode: Node = _
  /**
   * The TreeWalker.expandEntityReferences read-only property returns a Boolean
   * flag indicating whether or not the children of entity reference nodes are visible
   * to the TreeWalker.
   *
   * MDN
   */
  var expandEntityReferences: js.Boolean = _

  /**
   * The TreeWalker.previousSibling() method moves the current Node to its previous
   * sibling, if any, and returns the found sibling. I there is no such node, return null
   * and the current node is not changed.
   *
   * MDN
   */
  def previousSibling(): Node = ???

  /**
   * The TreeWalker.lastChild() method moves the current Node to the last visible
   * child of the current node, and returns the found child. It also moves the current
   * node to this child. If no such child exists, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def lastChild(): Node = ???

  /**
   * The TreeWalker.nextSibling() method moves the current Node to its next sibling,
   * if any, and returns the found sibling. I there is no such node, return null and the
   * current node is not changed.
   *
   * MDN
   */
  def nextSibling(): Node = ???

  /**
   * The TreeWalker.nextNode() method moves the current Node to the next visible node
   * in the document order, and returns the found node. It also moves the current node to
   * this one. If no such node exists, returns null and the current node is not changed.
   *
   * MDN
   */
  def nextNode(): Node = ???

  /**
   * The TreeWalker.parentNode() method moves the current Node to the first visible
   * ancestor node in the document order, and returns the found node. It also moves the
   * current node to this one. If no such node exists, or if it is before that the root node
   * defined at the object construction, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def parentNode(): Node = ???

  /**
   * The TreeWalker.firstChild() method moves the current Node to the first visible
   * child of the current node, and returns the found child. It also moves the current
   * node to this child. If no such child exists, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def firstChild(): Node = ???

  /**
   * The TreeWalker.previousNode() method moves the current Node to the previous
   * visible node in the document order, and returns the found node. It also moves the
   * current node to this one. If no such node exists,or if it is before that the root node
   * defined at the object construction, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def previousNode(): Node = ???
}


/**
 * An object of this type can be obtained by calling the Window.performance read-only
 * attribute.
 *
 * MDN
 */
class Performance extends js.Object {
  /**
   * The Performance.navigation read-only property returns a
   * PerformanceNavigation object representing the type of navigation that occurs in
   * the given browsing context, like the amount of redirections needed to fetch the
   * resource.
   *
   * MDN
   */
  var navigation: PerformanceNavigation = _
  /**
   * The Performance.timing read-only property returns a PerformanceTiming object
   * containing latency-related performance information.
   *
   * MDN
   */
  var timing: PerformanceTiming = _

  def getEntriesByType(entryType: js.String): js.Dynamic = ???

  /**
   * Is a jsonizer returning a json object representing the Performance object.
   *
   * MDN
   */
  def toJSON(): js.Dynamic = ???

  def getMeasures(measureName: js.String): js.Dynamic = ???

  def getMeasures(): js.Dynamic = ???

  def clearMarks(markName: js.String): Unit = ???

  def clearMarks(): Unit = ???

  def getMarks(markName: js.String): js.Dynamic = ???

  def getMarks(): js.Dynamic = ???

  def clearResourceTimings(): Unit = ???

  def mark(markName: js.String): Unit = ???

  def measure(measureName: js.String, startMarkName: js.String, endMarkName: js.String): Unit = ???

  def measure(measureName: js.String, startMarkName: js.String): Unit = ???

  def measure(measureName: js.String): Unit = ???

  def getEntriesByName(name: js.String, entryType: js.String): js.Dynamic = ???

  def getEntriesByName(name: js.String): js.Dynamic = ???

  def getEntries(): js.Dynamic = ???

  def clearMeasures(measureName: js.String): Unit = ???

  def clearMeasures(): Unit = ???

  def setResourceTimingBufferSize(maxSize: js.Number): Unit = ???

  /**
   * Returns a DOMHighResTimeStamp representing the amount of miliseconds elapsed
   * since the start of the navigation, as give by PerformanceTiming.navigationStart
   * to the call of the method.
   *
   * MDN
   */
  def now(): js.Number = ???
}


/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly
 * entering text.
 *
 * MDN
 */
class CompositionEvent extends UIEvent {
  /**
   * For compositionstart events, this is the currently selected text that will be
   * replaced by the string being composed. This value doesn't change even if content
   * changes the selection range; rather, it indicates the string that was selected
   * when composition started. For compositionupdate, this is the string as it stands
   * currently as editing is ongoing. For compositionend events, this is the string as
   * committed to the editor. Read only.
   *
   * MDN
   */
  val data: js.String = ???
  /**
   * The locale of current input method (for example, the keyboard layout locale if the
   * composition is associated with IME). Read only.
   *
   * MDN
   */
  val locale: js.String = ???

  /**
   * Initializes the attributes of a composition event.
   *
   * MDN
   */
  def initCompositionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, dataArg: js.String, locale: js.String): Unit = ???
}


trait WindowTimers extends WindowTimersExtension {
  def clearTimeout(handle: js.Number): Unit = ???

  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???

  def clearInterval(handle: js.Number): Unit = ???

  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
}

/**
 * The Navigator interface represents the state and the identity of the user agent. It
 * allows scripts to query it and to register themselves to carry on some activities.
 *
 * MDN
 */
class Navigator extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with NavigatorGeolocation with NavigatorStorageUtils

trait NodeSelector extends js.Object {
  def querySelectorAll(selectors: js.String): NodeList = ???

  def querySelector(selectors: js.String): Element = ???
}

class ClientRect extends js.Object {
  var left: js.Number = _
  var width: js.Number = _
  var right: js.Number = _
  var top: js.Number = _
  var bottom: js.Number = _
  var height: js.Number = _
}


/**
 * The DOMImplementation interface represent an object providing methods which are
 * not dependent on any particular document. Such an object is returned by the
 * Document.implementation property.
 *
 * MDN
 */
class DOMImplementation extends js.Object {
  /**
   * « DOM Reference « DOMImplementation
   *
   * MDN
   */
  def createDocumentType(qualifiedName: js.String, publicId: js.String, systemId: js.String): DocumentType = ???

  /**
   * « DOM Reference « DOMImplementation
   *
   * MDN
   */
  def createDocument(namespaceURI: js.String, qualifiedName: js.String, doctype: DocumentType): Document = ???

  def hasFeature(feature: js.String, version: js.String): js.Boolean = ???

  /**
   * Returns a Boolean indicating if a given feature is supported or not. This function
   * is unreliable and kept for compatibility purpose alone: except for SVG-related
   * queries, it always returns true. Old browsers are very inconsistent in their
   * behavior.
   *
   * MDN
   */
  def hasFeature(feature: js.String): js.Boolean = ???

  /**
   * Creates and returns an HTML Document.
   *
   * MDN
   */
  def createHTMLDocument(title: js.String): Document = ???
}

/**
 * The Element interface represents part of the document. This interface describes
 * methods and properties common to each kind of elements. Specific behaviors are
 * described in the specific interfaces, inheriting from Element: the HTMLElement
 * interface for HTML elements, or the SVGElement interface for SVG elements.
 *
 * MDN
 */
class Element extends Node with NodeSelector {
  /**
   * scrollTop gets or sets the number of pixels that the content of an element is
   * scrolled upward.
   *
   * MDN
   */
  var scrollTop: js.Number = _
  /**
   * The width of the left border of an element in pixels. It includes the width of the
   * vertical scrollbar if the text direction of the element is right–to–left and if
   * there is an overflow causing a left vertical scrollbar to be rendered. clientLeft
   * does not include the left margin or the left padding. clientLeft is read-only.
   *
   * MDN
   */
  var clientLeft: js.Number = _
  /**
   * scrollLeft gets or sets the number of pixels that an element's content is scrolled
   * to the left.
   *
   * MDN
   */
  var scrollLeft: js.Number = _
  /**
   * In XML (and XML-based languages such as XHTML), tagName preserves case. On
   * HTML elements in DOM trees flagged as HTML documents, tagName returns the
   * element name in the uppercase form. The value of tagName is the same as that of
   * nodeName.
   *
   * MDN
   */
  var tagName: js.String = _
  /**
   * clientWidth is the inner width of an element in pixels. It includes padding but not
   * the vertical scrollbar (if present, if rendered), border or margin.
   *
   * MDN
   */
  var clientWidth: js.Number = _
  /**
   * scrollWidth is a read–only property that returns either the width in pixels of the
   * content of an element or the width of the element itself, whichever is greater. If
   * the element is wider than its content area (for example, if there are scroll bars for
   * scrolling through the content), the scrollWidth is larger than the clientWidth.
   *
   * MDN
   */
  var scrollWidth: js.Number = _
  var clientHeight: js.Number = _
  /**
   * The width of the top border of an element in pixels. It does not include the top margin
   * or padding. clientTop is read-only.
   *
   * MDN
   */
  var clientTop: js.Number = _
  /**
   * Height of the scroll view of an element; it includes the element padding but not its
   * margin.
   *
   * MDN
   */
  var scrollHeight: js.Number = _

  def getAttribute(name: js.String): js.String = ???

  /**
   * getAttribute() returns the value of the named attribute on the specified element.
   * If the named attribute does not exist, the value returned will either be null or ""
   * (the empty string); see Notes for details.
   *
   * MDN
   */
  def getAttribute(): js.String = ???

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace.
   *
   * MDN
   */
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???

  /**
   * hasAttributeNS returns a boolean value indicating whether the current element
   * has the specified attribute.
   *
   * MDN
   */
  def hasAttributeNS(namespaceURI: js.String, localName: js.String): js.Boolean = ???

  /**
   * Returns a text rectangle object that encloses a group of text rectangles.
   *
   * MDN
   */
  def getBoundingClientRect(): ClientRect = ???

  /**
   * getAttributeNS returns the string value of the attribute with the specified
   * namespace and name. If the named attribute does not exist, the value returned will
   * either be null or "" (the empty string); see Notes for details.
   *
   * MDN
   */
  def getAttributeNS(namespaceURI: js.String, localName: js.String): js.String = ???

  /**
   * Returns the Attr node for the attribute with the given namespace and name.
   *
   * MDN
   */
  def getAttributeNodeNS(namespaceURI: js.String, localName: js.String): Attr = ???

  /**
   * setAttributeNodeNS adds a new namespaced attribute node to an element.
   *
   * MDN
   */
  def setAttributeNodeNS(newAttr: Attr): Attr = ???

  def msMatchesSelector(selectors: js.String): js.Boolean = ???

  /**
   * hasAttribute returns a boolean value indicating whether the specified element
   * has the specified attribute or not.
   *
   * MDN
   */
  def hasAttribute(name: js.String): js.Boolean = ???

  def removeAttribute(name: js.String): Unit = ???

  /**
   * removeAttribute removes an attribute from the specified element.
   *
   * MDN
   */
  def removeAttribute(): Unit = ???

  /**
   * setAttributeNS adds a new attribute or changes the value of an attribute with the
   * given namespace and name.
   *
   * MDN
   */
  def setAttributeNS(namespaceURI: js.String, qualifiedName: js.String, value: js.String): Unit = ???

  /**
   * Returns the specified attribute of the specified element, as an Attr node.
   *
   * MDN
   */
  def getAttributeNode(name: js.String): Attr = ???

  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???

  def fireEvent(eventName: js.String): js.Boolean = ???

  /**
   * Returns a list of elements with the given tag name. The subtree underneath the
   * specified element is searched, excluding the element itself. The returned list is
   * live, meaning that it updates itself with the DOM tree automatically.
   * Consequently, there is no need to call several times
   * element.getElementsByTagName with the same element and arguments.
   *
   * MDN
   */
  def getElementsByTagName(name: js.String): NodeList = ???

  /**
   * Returns a collection of rectangles that indicate the bounding rectangles for each
   * box in a client.
   *
   * MDN
   */
  def getClientRects(): ClientRectList = ???

  /**
   * setAttributeNode() adds a new Attr node to the specified element.
   *
   * MDN
   */
  def setAttributeNode(newAttr: Attr): Attr = ???

  /**
   * removeAttributeNode removes the specified attribute from the current element.
   *
   * MDN
   */
  def removeAttributeNode(oldAttr: Attr): Attr = ???

  def setAttribute(name: js.String, value: js.String): Unit = ???

  def setAttribute(name: js.String): Unit = ???

  /**
   * Adds a new attribute or changes the value of an existing attribute on the specified
   * element.
   *
   * MDN
   */
  def setAttribute(): Unit = ???

  /**
   * removeAttributeNS removes the specified attribute from an element.
   *
   * MDN
   */
  def removeAttributeNS(namespaceURI: js.String, localName: js.String): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * A Node is an interface from which a number of DOM types inherit, and allows these
 * various types to be treated (or tested) similarly.
 *
 * MDN
 */
class Node extends EventTarget {
  /**
   * The read-only Node.nodeType property returns an unsigned short integer
   * representing the type of the node.
   *
   * MDN
   */
  var nodeType: js.Number = _
  /**
   * Returns the node immediately preceding the specified one in its parent's
   * childNodes list, null if the specified node is the first in that list.
   *
   * MDN
   */
  var previousSibling: Node = _
  /**
   * Returns a DOMString representing the local part of the qualified name of an
   * element. In Firefox 3.5 and earlier, the property upper-cases the local name for
   * HTML elements (but not XHTML elements). In later versions, this does not happen,
   * so the property is in lower case for both HTML and XHTML. Though the specification
   * requires localName to be defined on the Node interface, Gecko-based browsers
   * implement it on the Element interface.
   *
   * MDN
   */
  var localName: js.String = _
  /**
   * The namespace URI of this node, or null if it is no namespace. In Firefox 3.5 and
   * earlier, HTML elements are in no namespace. In later versions, HTML elements are
   * in the http://www.w3.org/1999/xhtml namespace in both HTML and XML trees.
   * Though the specification requires namespaceURI to be defined on the Node
   * interface, Gecko-based browsers implement it on the Element interface.
   *
   * MDN
   */
  var namespaceURI: js.String = _
  /**
   * Is a DOMString representing the textual content of an element and all its
   * descendants.
   *
   * MDN
   */
  var textContent: js.String = _
  /**
   * Returns a Node that is the parent of this node. If there is no such node, like if this
   * node is the top of the tree or if doesn't participate in a tree, this property returns
   * null.
   *
   * MDN
   */
  var parentNode: Node = _
  /**
   * Returns the node immediately following the specified one in its parent's
   * childNodes list, or null if the specified node is the last node in that list.
   *
   * MDN
   */
  var nextSibling: Node = _
  /**
   * Is a DOMString representing the value of an object. For most Node type, this returns
   * null and any set operation is ignored. For nodes of type TEXT_NODE (Text objects),
   * COMMENT_NODE (Comment objects), and PROCESSING_INSTRUCTION_NODE
   * (ProcessingInstruction objects), the value corresponds to the text data
   * contained in the object.
   *
   * MDN
   */
  var nodeValue: js.String = _
  /**
   * Returns a Node representing the last direct child node of the node, or null if the
   * node has no child.
   *
   * MDN
   */
  var lastChild: Node = _
  /**
   * Returns a live NodeList containing all the children of this node. NodeList being
   * live means that if the children of the Node change, the NodeList object is
   * automatically updated.
   *
   * MDN
   */
  var childNodes: NodeList = _
  /**
   * Returns a DOMString containing the name of the Node. The structure of the name will
   * differ with the name type. E.g. An HTMLElement will contain the name of the
   * corresponding tag, like 'audio' for an HTMLAudioElement, a Text node will have the
   * '#text' string, or a Document node will have the '#document' string.
   *
   * MDN
   */
  var nodeName: js.String = _
  /**
   * Returns the Document that this node belongs to. If no document is associated with
   * it, returns null.
   *
   * MDN
   */
  var ownerDocument: Document = _
  /**
   * .attributes is a collection of all attribute nodes registered to the specified
   * node. It is a NamedNodeMap,not an Array, so it has no Array methods and the Attr
   * nodes' indexes may differ among browsers. To be more specific, attribute is a key
   * value pair of strings that represents any information regarding that node; it
   * cannot hold Object. Attribute can hold additional data/information that is
   * required while processing custom JavaScript. There are many predefined
   * attributes for different nodes used for binding events, validations, and
   * specifying layout informations that are handled by browser (may vary from browser
   * to browser).  
   *
   * MDN
   */
  var attributes: NamedNodeMap = _
  /**
   * Returns the node's first child in the tree, or null if the node is childless. If the
   * node is a Document, it returns the first node in the list of its direct children.
   *
   * MDN
   */
  var firstChild: Node = _
  /**
   * Is a DOMString representing the namespace prefix of the node, or null if no prefix is
   * specified. Though the specification requires localName to be defined on the Node
   * interface, Gecko-based browsers implement it on the Element interface.
   *
   * MDN
   */
  var prefix: js.String = _

  /**
   * Removes a child node from the current element, which must be a child of the current
   * node.
   *
   * MDN
   */
  def removeChild(oldChild: Node): Node = ???

  /**
   * Adds a node to the end of the list of children of a specified parent node. If the node
   * already exists it is removed from current parent node, then added to new parent
   * node.
   *
   * MDN
   */
  def appendChild(newChild: Node): Node = ???

  /**
   * The Node.isSupported()returns a Boolean flag containing the result of a test
   * whether the DOM implementation implements a specific feature and this feature is
   * supported by the specific node.
   *
   * MDN
   */
  def isSupported(feature: js.String, version: js.String): js.Boolean = ???

  /**
   * If #targetElm is first div element in document, "true" will be displayed.
   *
   * MDN
   */
  def isEqualNode(arg: Node): js.Boolean = ???

  /**
   * Returns the prefix for a given namespaceURI if present, and null if not. When
   * multiple prefixes are possible, the result is implementation-dependent.
   *
   * MDN
   */
  def lookupPrefix(namespaceURI: js.String): js.String = ???

  /**
   * isDefaultNamespace accepts a namespace URI as an argument and returns true if the
   * namespace is the default namespace on the given node or false if not.
   *
   * MDN
   */
  def isDefaultNamespace(namespaceURI: js.String): js.Boolean = ???

  /**
   * Compares the position of the current node against another node in any other
   * document.
   *
   * MDN
   */
  def compareDocumentPosition(other: Node): js.Number = ???

  /**
   * Puts the specified node and all of its subtree into a "normalized" form. In a
   * normalized subtree, no text nodes in the subtree are empty and there are no adjacent
   * text nodes.
   *
   * MDN
   */
  def normalize(): Unit = ???

  /**
   * Tests whether two nodes are the same, that is they reference the same object.
   *
   * MDN
   */
  def isSameNode(other: Node): js.Boolean = ???

  /**
   * hasAttributes returns a boolean value of true or false, indicating if the current
   * element has any attributes or not.
   *
   * MDN
   */
  def hasAttributes(): js.Boolean = ???

  /**
   * Takes a prefix and returns the namespaceURI associated with it on the given node if
   * found (and null if not). Supplying null for the prefix will return the default
   * namespace.
   *
   * MDN
   */
  def lookupNamespaceURI(prefix: js.String): js.String = ???

  def cloneNode(deep: js.Boolean): Node = ???

  /**
   * Clone a Node, and optionally, all of its contents. By default, it clones the content
   * of the node.
   *
   * MDN
   */
  def cloneNode(): Node = ???

  /**
   * hasChildNodes returns a Boolean value indicating whether the current Node has
   * child nodes or not.
   *
   * MDN
   */
  def hasChildNodes(): js.Boolean = ???

  /**
   * Replaces one child Node of the current one with the second one given in parameter.
   *
   * MDN
   */
  def replaceChild(newChild: Node, oldChild: Node): Node = ???

  def insertBefore(newChild: Node, refChild: Node): Node = ???

  /**
   * Inserts the first Node given in a parameter immediately before the second, child of
   * this element, Node.
   *
   * MDN
   */
  def insertBefore(newChild: Node): Node = ???

  var ENTITY_REFERENCE_NODE: js.Number = _
  var ATTRIBUTE_NODE: js.Number = _
  var DOCUMENT_FRAGMENT_NODE: js.Number = _
  var TEXT_NODE: js.Number = _
  var ELEMENT_NODE: js.Number = _
  var COMMENT_NODE: js.Number = _
  var DOCUMENT_POSITION_DISCONNECTED: js.Number = _
  var DOCUMENT_POSITION_CONTAINED_BY: js.Number = _
  var DOCUMENT_POSITION_CONTAINS: js.Number = _
  var DOCUMENT_TYPE_NODE: js.Number = _
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.Number = _
  var DOCUMENT_NODE: js.Number = _
  var ENTITY_NODE: js.Number = _
  var PROCESSING_INSTRUCTION_NODE: js.Number = _
  var CDATA_SECTION_NODE: js.Number = _
  var NOTATION_NODE: js.Number = _
  var DOCUMENT_POSITION_FOLLOWING: js.Number = _
  var DOCUMENT_POSITION_PRECEDING: js.Number = _
}

/**
 * A Node is an interface from which a number of DOM types inherit, and allows these
 * various types to be treated (or tested) similarly.
 *
 * MDN
 */
object Node extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Node),List())))) */
  var ENTITY_REFERENCE_NODE: js.Number = _
  var ATTRIBUTE_NODE: js.Number = _
  var DOCUMENT_FRAGMENT_NODE: js.Number = _
  var TEXT_NODE: js.Number = _
  var ELEMENT_NODE: js.Number = _
  var COMMENT_NODE: js.Number = _
  var DOCUMENT_POSITION_DISCONNECTED: js.Number = _
  var DOCUMENT_POSITION_CONTAINED_BY: js.Number = _
  var DOCUMENT_POSITION_CONTAINS: js.Number = _
  var DOCUMENT_TYPE_NODE: js.Number = _
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.Number = _
  var DOCUMENT_NODE: js.Number = _
  var ENTITY_NODE: js.Number = _
  var PROCESSING_INSTRUCTION_NODE: js.Number = _
  var CDATA_SECTION_NODE: js.Number = _
  var NOTATION_NODE: js.Number = _
  var DOCUMENT_POSITION_FOLLOWING: js.Number = _
  var DOCUMENT_POSITION_PRECEDING: js.Number = _
}

/**
 * The DOM MouseEvent interface represents events that occur due to the user
 * interacting with a pointing device (such as a mouse).
 *
 * MDN
 */
class MouseEvent extends UIEvent {
  var toElement: Element = _
  var layerY: js.Number = _
  var fromElement: Element = _
  var which: js.Number = _
  var pageX: js.Number = _
  var offsetY: js.Number = _
  /**
   * The metaKey property indicates if the meta key was pressed (true) or not (false)
   * when the event occured.
   *
   * MDN
   */
  var metaKey: js.Boolean = _
  /**
   * The altKey property indicates if the alt key was pressed (true) or not (false) when
   * the event occured.
   *
   * MDN
   */
  var altKey: js.Boolean = _
  /**
   * The ctrlKey property indicates if the control key was pressed (true) or not (false)
   * when the event occured.
   *
   * MDN
   */
  var ctrlKey: js.Boolean = _
  var offsetX: js.Number = _
  /**
   * The screenX property provides the X coordinate of the mouse pointer in global
   * (screen) coordinates.
   *
   * MDN
   */
  var screenX: js.Number = _
  /**
   * The clientY property provides the Y coordinate of the mouse pointer in local (DOM
   * content) coordinates.
   *
   * MDN
   */
  var clientY: js.Number = _
  /**
   * The shiftKey property indicates if the shift key was pressed (true) or not (false)
   * when the event occurred.
   *
   * MDN
   */
  var shiftKey: js.Boolean = _
  var layerX: js.Number = _
  /**
   * The screenY property provides the Y coordinate of the mouse pointer in global
   * (screen) coordinates.
   *
   * MDN
   */
  var screenY: js.Number = _
  /**
   * The relatedTarget property is the secondary target for the event, if there is one.
   *
   * MDN
   */
  var relatedTarget: EventTarget = _
  /**
   * The button property indicates which button was pressed on the mouse to trigger the
   * event.
   *
   * MDN
   */
  var button: js.Number = _
  var pageY: js.Number = _
  /**
   * The buttons property indicates which buttons were pressed on the mouse to trigger
   * the event.
   *
   * MDN
   */
  var buttons: js.Number = _
  /**
   * The clientX property provides the X coordinate of the mouse pointer in local (DOM
   * content) coordinates.
   *
   * MDN
   */
  var clientX: js.Number = _

  def initMouseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget): Unit = ???

  /**
   * Returns the current state of the specified modifier key. See the
   * KeyboardEvent.getModifierState() documentation for details.
   *
   * MDN
   */
  def getModifierState(keyArg: js.String): js.Boolean = ???
}


/**
 * The TextMetrics interface represents the dimension of a text in the canvas, as
 * created by the CanvasRenderingContext2D.measureText() method.
 *
 * MDN
 */
class TextMetrics extends js.Object {
  /**
   * Is a double giving the calculated width of a segment of inline text in CSS pixels. It
   * takes into account the current font of the context.
   *
   * MDN
   */
  var width: js.Number = _
}


trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: js.String): Event = ???
}

/**
 * A CDATA Section can be used within XML to include extended portions of unescaped
 * text, such that the symbols < and & do not need escaping as they normally do within XML
 * when used as text.
 *
 * MDN
 */
class CDATASection extends Text {
}


trait StyleMedia extends js.Object {
  var `type`: js.String = _

  def matchMedium(mediaquery: js.String): js.Boolean = ???
}


/**
 * Selection is the class of the object returned by window.getSelection() and other
 * methods. It represents the text selection in the greater page, possibly spanning
 * multiple elements, when the user drags over static text and other parts of the page.
 * For information about text selection in an individual text editing element, see
 * Input, TextArea and document.activeElement which typically return the parent
 * object returned from window.getSelection().
 *
 * MDN
 */
class Selection extends js.Object {
  /**
   * Returns a boolean indicating whether the selection's start and end points are at
   * the same position.
   *
   * MDN
   */
  var isCollapsed: js.Boolean = _
  /**
   * Returns the node in which the selection begins.
   *
   * MDN
   */
  var anchorNode: Node = _
  /**
   * Returns the node in which the selection ends.
   *
   * MDN
   */
  var focusNode: Node = _
  /**
   * Returns a number representing the offset of the selection's anchor within the
   * anchorNode. If anchorNode is a text node, this is the number of characters within
   * anchorNode preceding the anchor. If anchorNode is an element, this is the number of
   * child nodes of the anchorNode preceding the anchor.
   *
   * MDN
   */
  var anchorOffset: js.Number = _
  /**
   * Returns a number representing the offset of the selection's anchor within the
   * focusNode. If focusNode is a text node, this is the number of characters within
   * focusNode preceding the focus. If focusNode is an element, this is the number of
   * child nodes of the focusNode preceding the focus.
   *
   * MDN
   */
  var focusOffset: js.Number = _
  /**
   * Returns the number of ranges in the selection.
   *
   * MDN
   */
  var rangeCount: js.Number = _

  /**
   * A range object that will be added to the selection.
   *
   * MDN
   */
  def addRange(range: Range): Unit = ???

  /**
   * Collapses the selection to the end of the last range in the selection.  If the
   * content the selection is in is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapseToEnd(): Unit = ???

  /**
   * Adds all the children of the specified node to the selection. Previous selection is
   * lost.
   *
   * MDN
   */
  def selectAllChildren(parentNode: Node): Unit = ???

  /**
   * Returns a range object representing one of the ranges currently selected.
   *
   * MDN
   */
  def getRangeAt(index: js.Number): Range = ???

  /**
   * Collapses the current selection to a single point. The document is not modified. If
   * the content is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapse(parentNode: Node, offset: js.Number): Unit = ???

  /**
   * Removes all ranges from the selection, leaving the anchorNode and focusNode
   * properties equal to null and leaving nothing selected.
   *
   * MDN
   */
  def removeAllRanges(): Unit = ???

  /**
   * Collapses the selection to the start of the first range in the selection.  If the
   * content of the selection is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapseToStart(): Unit = ???

  /**
   * Deletes the actual text being represented by a selection object from the
   * document's DOM.
   *
   * MDN
   */
  def deleteFromDocument(): Unit = ???

  /**
   * Removes a range from the selection.
   *
   * MDN
   */
  def removeRange(range: Range): Unit = ???
}


/**
 * The NodeIterator interface represents an iterator over the members of a list of the
 * nodes in a subtree of the DOM. The nodes will be returned in document order.
 *
 * MDN
 */
class NodeIterator extends js.Object {
  /**
   * Returns an unsigned long being a bitmask made of constants describing the types of
   * Node that must to be presented. Non-matching nodes are skipped, but their children
   * may be included, if relevant. The possible values are: Constant Numerical value
   * Description NodeFilter.SHOW_ALL -1 (that is the max value of unsigned long) Shows
   * all nodes. NodeFilter.SHOW_ATTRIBUTE 2 Shows attribute Attr nodes. This is
   * meaningful only when creating a NodeIterator with an Attr node as its root; in this
   * case, it means that the attribute node will appear in the first position of the
   * iteration or traversal. Since attributes are never children of other nodes, they
   * do not appear when traversing over the document tree.
   * NodeFilter.SHOW_CDATA_SECTION 8 Shows CDATASection nodes.
   * NodeFilter.SHOW_COMMENT 128 Shows Comment nodes. NodeFilter.SHOW_DOCUMENT
   * 256 Shows Document nodes. NodeFilter.SHOW_DOCUMENT_FRAGMENT 1024 Shows
   * DocumentFragment nodes. NodeFilter.SHOW_DOCUMENT_TYPE 512 Shows
   * DocumentType nodes. NodeFilter.SHOW_ELEMENT 1 Shows Element nodes.
   * NodeFilter.SHOW_ENTITY 32 Shows Entity nodes. This is meaningful only when
   * creating a NodeIterator with an Entity node as its root; in this case, it means that
   * the Entity node will appear in the first position of the traversal. Since entities
   * are not part of the document tree, they do not appear when traversing over the
   * document tree. NodeFilter.SHOW_ENTITY_REFERENCE 16 Shows
   * EntityReference nodes. NodeFilter.SHOW_NOTATION 2048 Shows Notation nodes.
   * This is meaningful only when creating a NodeIterator with a Notation node as its
   * root; in this case, it means that the Notation node will appear in the first position
   * of the traversal. Since entities are not part of the document tree, they do not
   * appear when traversing over the document tree.
   * NodeFilter.SHOW_PROCESSING_INSTRUCTION 64 Shows
   * ProcessingInstruction nodes. NodeFilter.SHOW_TEXT 4 Shows Text nodes.
   *
   * MDN
   */
  var whatToShow: js.Number = _
  /**
   * The NodeIterator.filter read-only method returns a NodeFilter object, that is an
   * object implement an acceptNode(node) method, used to screen nodes.
   *
   * MDN
   */
  var filter: NodeFilter = _
  /**
   * The NodeIterator.root read-only property represents the Node that is the root of
   * what the NodeIterator traverses.
   *
   * MDN
   */
  var root: Node = _
  /**
   * The NodeIterator.expandEntityReferences read-only property returns a Boolean
   * flag indicating whether or not the children of entity reference nodes are visible
   * to the NodeIterator.
   *
   * MDN
   */
  var expandEntityReferences: js.Boolean = _

  /**
   * The NodeIterator.nextNode() method returns the next node in the set represented
   * by the NodeIterator and advances the position of the iterator within the set.  The
   * first call to nextNode() returns the first node in the set.
   *
   * MDN
   */
  def nextNode(): Node = ???

  /**
   * This operation is a no-op. It doesn't do anything. Previously it was telling the
   * engine that the NodeIterator was no more used, but this is now useless.
   *
   * MDN
   */
  def detach(): Unit = ???

  /**
   * The NodeIterator.previousNode() method returns the previous node in the set
   * represented by the NodeIterator and moves the position of the iterator backwards
   * within the set.
   *
   * MDN
   */
  def previousNode(): Node = ???
}


trait WindowSessionStorage extends js.Object {
  var sessionStorage: Storage = _
}

/**
 * This section provides a brief reference for all of the methods, properties, and
 * events available through the DOM window object. The window object implements the
 * Window interface, which in turn inherits from the AbstractView interface. Some
 * additional global functions, namespaces objects, interfaces, and
 * constructors, not typically associated with the window, but available on it, are
 * listed in the JavaScript Reference and DOM Reference.
 *
 * MDN
 */
class Window extends EventTarget with WindowLocalStorage with WindowSessionStorage with WindowTimers with WindowBase64 with IDBEnvironment with WindowConsole {
  var ondragend: js.Function1[DragEvent, js.Any] = _
  /**
   * An event handler property for keydown events on the window.
   *
   * MDN
   */
  var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  /**
   * An event handler property for keyup events on the window.
   *
   * MDN
   */
  var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
  /**
   * An event handler property for reset events on the window.
   *
   * MDN
   */
  var onreset: js.Function1[Event, _] = _
  /**
   * An event handler property for mouseup events on the window.
   *
   * MDN
   */
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  /**
   * Returns the horizontal distance of the left border of the user's browser from the
   * left side of the screen.
   *
   * MDN
   */
  var screenX: js.Number = _
  /**
   * An event handler property for mouseover events on the window.
   *
   * MDN
   */
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  /**
   * The Window.history read-only property returns a reference to the History object,
   * which provides an interface for manipulating the browser session history (pages
   * visited in the tab or frame that the current page is loaded in).
   *
   * MDN
   */
  var history: History = _
  var pageXOffset: js.Number = _
  /**
   * The name of the window is used primarily for setting targets for hyperlinks and
   * forms. Windows do not need to have names.
   *
   * MDN
   */
  var name: js.String = _
  /**
   * The onafterprint property sets and returns the onafterprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onafterprint: js.Function1[Event, _] = _
  var onpause: js.Function1[Event, _] = _
  /**
   * The onbeforeprint property sets and returns the onbeforeprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onbeforeprint: js.Function1[Event, _] = _
  /**
   * Returns a reference to the topmost window in the window hierarchy. This property is
   * read only.
   *
   * MDN
   */
  val top: Window = ???
  /**
   * An event handler property for mousedown events on the window.
   *
   * MDN
   */
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onseeked: js.Function1[Event, _] = _
  /**
   * Returns a reference to the window that opened this current window.
   *
   * MDN
   */
  var opener: Window = _
  /**
   * Called when the user clicks the mouse button while the cursor is in the window. This
   * event is fired for any mouse button pressed; you can look at the event properties to
   * find out which button was pressed and where.
   *
   * MDN
   */
  var onclick: js.Function1[MouseEvent, js.Any] = _
  /**
   * Gets the height of the content area of the browser window including, if rendered,
   * the horizontal scrollbar.
   *
   * MDN
   */
  var innerHeight: js.Number = _
  var onwaiting: js.Function1[Event, _] = _
  var ononline: js.Function1[Event, _] = _
  var ondurationchange: js.Function1[Event, _] = _
  /**
   * Returns the window itself, which is an array-like object, listing the direct
   * sub-frames of the current window.
   *
   * MDN
   */
  var frames: Window = _
  /**
   * The onblur property can be used to set the blur handler on the window, which is
   * triggered when the window loses focus.
   *
   * MDN
   */
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var onemptied: js.Function1[Event, _] = _
  var onseeking: js.Function1[Event, _] = _
  var oncanplay: js.Function1[Event, _] = _
  /**
   * window.outerWidth gets the width of the outside of the browser window. It
   * represents the width of the whole browser window including sidebar (if expanded),
   * window chrome and window resizing borders/handles.
   *
   * MDN
   */
  var outerWidth: js.Number = _
  var onstalled: js.Function1[Event, _] = _
  /**
   * An event handler property for mousemove events on the window.
   *
   * MDN
   */
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  /**
   * Gets the width of the content area of the browser window including, if rendered, the
   * vertical scrollbar.
   *
   * MDN
   */
  var innerWidth: js.Number = _
  var onoffline: js.Function1[Event, _] = _
  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * MDN
   */
  var length: js.Number = _
  /**
   * Specifies the height of the screen, in pixels, minus permanent or semipermanent
   * user interface features displayed by the operating system, such as the Taskbar on
   * Windows.
   *
   * MDN
   */
  var screen: Screen = _
  /**
   * An event that fires when a window is about to unload its resources. The document is
   * still visible and the event is still cancelable.
   *
   * MDN
   */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var onratechange: js.Function1[Event, _] = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  var onloadstart: js.Function1[Event, _] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  /**
   * An event handler property for submits on window forms.
   *
   * MDN
   */
  var onsubmit: js.Function1[Event, _] = _
  /**
   * Returns an object reference to the window object itself.
   *
   * MDN
   */
  var self: Window = _
  /**
   * Returns a reference to the document that the window contains.
   *
   * MDN
   */
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var pageYOffset: js.Number = _
  /**
   * An event handler property for right-click events on the window.
   *
   * MDN
   */
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  /**
   * An event handler property for change events on the window.
   *
   * MDN
   */
  var onchange: js.Function1[Event, _] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var onplay: js.Function1[Event, _] = _
  /**
   * An event handler property for errors raised on the window.
   *
   * MDN
   */
  var onerror: ErrorEventHandler = _
  var onplaying: js.Function1[Event, _] = _
  /**
   * Returns a reference to the parent of the current window or subframe.
   *
   * MDN
   */
  var parent: Window = _
  /**
   * The Window.location read-only property returns a Location object with
   * information about the current location of the document.
   *
   * MDN
   */
  var location: Location = _
  var oncanplaythrough: js.Function1[Event, _] = _
  /**
   * An event handler property for abort events on the window.
   *
   * MDN
   */
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onreadystatechange: js.Function1[Event, _] = _
  /**
   * window.outerHeight gets the height in pixels of the whole browser window. It
   * represents the height of the whole browser window including sidebar (if
   * expanded), window chrome and window resizing borders/handles.
   *
   * MDN
   */
  var outerHeight: js.Number = _
  /**
   * An event handler property for keypress events on the window.
   *
   * MDN
   */
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  /**
   * Returns the element (such as <iframe> or <object>) in which the window is embedded,
   * or null if the window is top-level.
   *
   * MDN
   */
  var frameElement: Element = _
  var onloadeddata: js.Function1[Event, _] = _
  var onsuspend: js.Function1[Event, _] = _
  /**
   * The window property of a window object points to the window object itself. Thus the
   * following expressions all return the same window object:
   *
   * MDN
   */
  var window: Window = _
  /**
   * An event handler property for focus events on the window.
   *
   * MDN
   */
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var ontimeupdate: js.Function1[Event, _] = _
  /**
   * An event handler for the resize event on the window.
   *
   * MDN
   */
  var onresize: js.Function1[UIEvent, js.Any] = _
  /**
   * An event handler property for window selection.
   *
   * MDN
   */
  var onselect: js.Function1[UIEvent, js.Any] = _
  /**
   * The Window.navigator read-only property returns a reference to the Navigator
   * object, which can be queried for information about the application running the
   * script.
   *
   * MDN
   */
  var navigator: Navigator = _
  var styleMedia: StyleMedia = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  /**
   * An event handler property for mouseout events on the window.
   *
   * MDN
   */
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  /**
   * An event handler property for hash change events on the window; called when the part
   * of the URL after the hash mark ("#") changes.
   *
   * MDN
   */
  var onhashchange: js.Function1[Event, _] = _
  /**
   * The unload event is raised when the window is unloading its content and resources.
   * The resources removal is processed  after the unload event occurs.
   *
   * MDN
   */
  var onunload: js.Function1[Event, _] = _
  /**
   * Specifies the function to be called when the window is scrolled.
   *
   * MDN
   */
  var onscroll: js.Function1[UIEvent, js.Any] = _
  /**
   * Returns the vertical distance of the top border of the user's browser from the top
   * edge of the screen.
   *
   * MDN
   */
  var screenY: js.Number = _
  var onmousewheel: js.Function1[WheelEvent, js.Any] = _
  /**
   * An event handler property for window loading.
   *
   * MDN
   */
  var onload: js.Function1[Event, _] = _
  var onvolumechange: js.Function1[Event, _] = _
  var oninput: js.Function1[Event, _] = _
  /**
   * The Web Performance API allows web pages access to certain functions for measuring
   * the performance of web pages and web applications, including the Navigation
   * Timing API and high-resolution time data.
   *
   * MDN
   */
  var performance: Performance = _

  def alert(message: js.String): Unit = ???

  /**
   * The Window.alert() method displays an alert dialog with the optional specified
   * content and an OK button.
   *
   * MDN
   */
  def alert(): Unit = ???

  def scroll(x: js.Number, y: js.Number): Unit = ???

  def scroll(x: js.Number): Unit = ???

  /**
   * Scrolls the window to a particular place in the document.
   *
   * MDN
   */
  def scroll(): Unit = ???

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and
   * the window isn't guaranteed to be frontmost before this method returns.
   *
   * MDN
   */
  def focus(): Unit = ???

  def scrollTo(x: js.Number, y: js.Number): Unit = ???

  def scrollTo(x: js.Number): Unit = ???

  /**
   * Scrolls to a particular set of coordinates in the document.
   *
   * MDN
   */
  def scrollTo(): Unit = ???

  /**
   * Opens the Print Dialog to print the current document.
   *
   * MDN
   */
  def print(): Unit = ???

  def prompt(message: js.String, defaul: js.String): js.String = ???

  def prompt(message: js.String): js.String = ???

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user
   * to input some text.
   *
   * MDN
   */
  def prompt(): js.String = ???

  def open(url: js.String, target: js.String, features: js.String, replace: js.Boolean): Window = ???

  def open(url: js.String, target: js.String, features: js.String): Window = ???

  def open(url: js.String, target: js.String): Window = ???

  def open(url: js.String): Window = ???

  /**
   * Loads a resource in a new browsing context or an existing one.
   *
   * MDN
   */
  def open(): Window = ???

  def scrollBy(x: js.Number, y: js.Number): Unit = ???

  def scrollBy(x: js.Number): Unit = ???

  /**
   * Scrolls the document in the window by the given amount.
   *
   * MDN
   */
  def scrollBy(): Unit = ???

  def confirm(message: js.String): js.Boolean = ???

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and
   * two buttons, OK and Cancel.
   *
   * MDN
   */
  def confirm(): js.Boolean = ???

  /**
   * Closes the current window, or a referenced window.
   *
   * MDN
   */
  def close(): Unit = ???

  def postMessage(message: js.Any, targetOrigin: js.String, ports: js.Any): Unit = ???

  /**
   * The window.postMessage method safely enables cross-origin communication.
   * Normally, scripts on different pages are allowed to access each other if and only if
   * the pages that executed them are at locations with the same protocol (usually both
   * http), port number (80 being the default for http), and host (modulo
   * document.domain being set by both pages to the same value). window.postMessage
   * provides a controlled mechanism to circumvent this restriction in a way which is
   * secure when properly used.
   *
   * MDN
   */
  def postMessage(message: js.Any, targetOrigin: js.String): Unit = ???

  def showModalDialog(url: js.String, argument: js.Any, options: js.Any): js.Dynamic = ???

  def showModalDialog(url: js.String, argument: js.Any): js.Dynamic = ???

  def showModalDialog(url: js.String): js.Dynamic = ???

  /**
   * Creates and displays a modal dialog box containing a specified HTML document.
   *
   * MDN
   */
  def showModalDialog(): js.Dynamic = ???

  /**
   * The window.blur() method is the programmatic equivalent of the user shifting
   * focus away from the current window.
   *
   * MDN
   */
  def blur(): Unit = ???

  /**
   * Returns a selection object representing the range of text selected by the user.
   *
   * MDN
   */
  def getSelection(): Selection = ???

  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???

  /**
   * getComputedStyle() gives the values of all the CSS properties of an element after
   * applying the active stylesheets and resolving any basic computation those values
   * may contain.
   *
   * MDN
   */
  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var onmspointerdown: js.Function1[js.Any, js.Any] = _
  var animationStartTime: js.Number = _
  var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
  var onmspointerhover: js.Function1[js.Any, js.Any] = _
  var onmsgesturehold: js.Function1[js.Any, js.Any] = _
  var onmspointermove: js.Function1[js.Any, js.Any] = _
  var onmsgesturechange: js.Function1[js.Any, js.Any] = _
  var onmsgesturestart: js.Function1[js.Any, js.Any] = _
  var onmspointercancel: js.Function1[js.Any, js.Any] = _
  var onmsgestureend: js.Function1[js.Any, js.Any] = _
  var onmsgesturetap: js.Function1[js.Any, js.Any] = _
  var onmspointerout: js.Function1[js.Any, js.Any] = _
  var msAnimationStartTime: js.Number = _
  /**
   * An OfflineResourceList object providing access to the offline resources for the
   * window.
   *
   * MDN
   */
  var applicationCache: ApplicationCache = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  /**
   * An event handler property for popstate events, which are fired when navigating to a
   * session history entry representing a state object.
   *
   * MDN
   */
  var onpopstate: js.Function1[PopStateEvent, js.Any] = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _

  def msCancelRequestAnimationFrame(handle: js.Number): Unit = ???

  /**
   * Returns a new MediaQueryList object representing the parsed results of the
   * specified media query string.
   *
   * MDN
   */
  def matchMedia(mediaQuery: js.String): MediaQueryList = ???

  /**
   * Cancels an animation frame request previously scheduled through a call to
   * window.requestAnimationFrame().
   *
   * MDN
   */
  def cancelAnimationFrame(handle: js.Number): Unit = ???

  def msIsStaticHTML(html: js.String): js.Boolean = ???

  def msMatchMedia(mediaQuery: js.String): MediaQueryList = ???

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to
   * perform an animation and requests that the browser call a specified function to
   * update an animation before the next repaint. The method takes as an argument a
   * callback to be invoked before the repaint.
   *
   * MDN
   */
  def requestAnimationFrame(callback: FrameRequestCallback): js.Number = ???

  def msRequestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
}


/**
 * EventTarget is a DOM interface implemented by objects that can receive DOM events
 * and have listeners for them.
 *
 * MDN
 */
class EventTarget extends js.Object {
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  /**
   * Removes the event listener previously registered with
   * EventTarget.addEventListener.
   *
   * MDN
   */
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  /**
   * The EventTarget.addEventListener() method registers the specified listener on
   * the EventTarget it's called on. The event target may be an Element in a document, the
   * Document itself, a Window, or any other object that supports events (such as
   * XMLHttpRequest).
   *
   * MDN
   */
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  /**
   * Dispatches an Event at the specified EventTarget, invoking the affected
   * EventListeners in the appropriate order. The normal event processing rules
   * (including the capturing and optional bubbling phase) apply to events dispatched
   * manually with dispatchEvent().
   *
   * MDN
   */
  def dispatchEvent(evt: Event): js.Boolean = ???
}

/**
 * The CanvasGradient interface represents an opaque object describing a gradient
 * and returned by CanvasRenderingContext2D.createLinearGradient or
 * CanvasRenderingContext2D.createRadialGradient methods.
 *
 * MDN
 */
class CanvasGradient extends js.Object {
  /**
   * Add a new stop, defined by an offset and a color, to the gradient. If the offset is not
   * between 0 and 1 an INDEX_SIZE_ERR is raised, if the color can't be parsed as a CSS
   * <color>, a SYNTAX_ERR is raised.
   *
   * MDN
   */
  def addColorStop(offset: js.Number, color: js.String): Unit = ???
}


/**
 * A TouchEvent represents an event sent when the state of contacts with a
 * touch-sensitive surface changes. This surface can be a touch screen or trackpad,
 * for example. The event can describe one or more points of contact with the screen and
 * includes support for detecting movement, addition and removal of contact points,
 * and so forth.
 *
 * MDN
 */
class TouchEvent {
  /**
   * A Boolean value indicating whether or not the alt key was down when the touch event
   * was fired. Read only.
   *
   * MDN
   */
  val altKey: Boolean = ???
  /**
   * A TouchList of all the Touch objects representing individual points of contact
   * whose states changed between the previous touch event and this one. Read only.
   *
   * MDN
   */
  val changedTouches: TouchList = ???
  /**
   * A Boolean value indicating whether or not the control key was down when the touch
   * event was fired. Read only.
   *
   * MDN
   */
  val ctrlKey: Boolean = ???
  /**
   * A Boolean value indicating whether or not the meta key was down when the touch event
   * was fired. Read only.
   *
   * MDN
   */
  val metaKey: Boolean = ???
  /**
   * A Boolean value indicating whether or not the shift key was down when the touch event
   * was fired. Read only.
   *
   * MDN
   */
  val shiftKey: Boolean = ???
  /**
   * A TouchList listing all the Touch objects for touch points that are still in contact
   * with the touch surface and whose touchstart event occurred inside the same target
   * element as the current target element.
   *
   * MDN
   */
  val targetTouches: TouchList = ???
  /**
   * A TouchList listing all the Touch objects for touch points that are still in contact
   * with the touch surface, regardless of whether or not they've changed or what their
   * target was at touchstart time.
   *
   * MDN
   */
  val touches: TouchList = ???
  val `type`: String = ???
  /**
   * The target of the touches associated with this event. This target corresponds to
   * the target of all the touches in the targetTouches attribute, but note that other
   * touches in this event may have a different target. To be careful, you should use the
   * target associated with individual touches.
   *
   * MDN
   */
  val target: js.Any = ???
}

/**
 * A TouchList represents a list of all of the points of contact with a touch surface;
 * for example, if the user has three fingers on the screen (or trackpad), the
 * corresponding TouchList would have one Touch object for each finger, for a total of
 * three entries.
 *
 * MDN
 */
class TouchList extends js.Object {
  /**
   * This read-only property indicates the number of items in a TouchList.
   *
   * MDN
   */
  var length: js.Number = _

  /**
   * Returns the Touch object at the specified index in the list. You can also simply
   * reference the TouchList using array syntax (touchList[x]).
   *
   * MDN
   */
  def item(index: js.Number): TouchEvent = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): TouchEvent = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Node): Unit = ???
}

class KeyboardEvent extends UIEvent {
  var location: js.Number = _
  var keyCode: js.Number = _
  var shiftKey: js.Boolean = _
  var which: js.Number = _
  var locale: js.String = _
  var key: js.String = _
  var altKey: js.Boolean = _
  var metaKey: js.Boolean = _
  var char: js.String = _
  var ctrlKey: js.Boolean = _
  var repeat: js.Boolean = _
  var charCode: js.Number = _

  def getModifierState(keyArg: js.String): js.Boolean = ???

  def initKeyboardEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, keyArg: js.String, locationArg: js.Number, modifiersListArg: js.String, repeat: js.Boolean, locale: js.String): Unit = ???

  var DOM_KEY_LOCATION_RIGHT: js.Number = _
  var DOM_KEY_LOCATION_STANDARD: js.Number = _
  var DOM_KEY_LOCATION_LEFT: js.Number = _
  var DOM_KEY_LOCATION_NUMPAD: js.Number = _
  var DOM_KEY_LOCATION_JOYSTICK: js.Number = _
  var DOM_KEY_LOCATION_MOBILE: js.Number = _
}

object KeyboardEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(KeyboardEvent),List())))) */
  var DOM_KEY_LOCATION_RIGHT: js.Number = _
  var DOM_KEY_LOCATION_STANDARD: js.Number = _
  var DOM_KEY_LOCATION_LEFT: js.Number = _
  var DOM_KEY_LOCATION_NUMPAD: js.Number = _
  var DOM_KEY_LOCATION_JOYSTICK: js.Number = _
  var DOM_KEY_LOCATION_MOBILE: js.Number = _
}

/**
 * Each web page loaded in the browser has its own document object. The Document
 * interface serves as an entry point to the web page's content (the DOM tree,
 * including elements such as <body> and <table>) and provides functionality global
 * to the document (such as obtaining the page's URL and creating new elements in the
 * document).
 *
 * MDN
 */
class Document extends Node with NodeSelector with DocumentEvent {
  var onkeydown: js.Function1[KeyboardEvent, _] = _
  var onkeyup: js.Function1[KeyboardEvent, _] = _
  /**
   * Returns a DOMImplementation object associated with the current document.
   *
   * MDN
   */
  var implementation: DOMImplementation = _
  var onreset: js.Function1[Event, _] = _
  /**
   * Returns a list of the <script> elements in the document. The returned object is an
   * HTMLCollection.
   *
   * MDN
   */
  var scripts: HTMLCollection = _
  var onhelp: js.Function1[Event, _] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var charset: js.String = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  /**
   * The default value for this property in Mozilla Firefox is purple (#551a8b in
   * hexadecimal).
   *
   * MDN
   */
  var vlinkColor: js.String = _
  var onseeked: js.Function1[Event, _] = _
  var security: js.String = _
  /**
   * Returns the title of the current document.
   *
   * MDN
   */
  var title: js.String = _
  var defaultCharset: js.String = _
  /**
   * Returns a list of the embedded <embed> elements within the current document.
   *
   * MDN
   */
  var embeds: HTMLCollection = _
  /**
   * Returns a list of StyleSheet objects for stylesheets explicitly linked into or
   * embedded in a document.
   *
   * MDN
   */
  var styleSheets: StyleSheetList = _
  var frames: Window = _
  var ondurationchange: js.Function1[Event, _] = _
  /**
   * Provides access to all elements with an id. This a legacy non-standard interface,
   * you should use the Document.getElementById() method instead.
   *
   * MDN
   */
  var all: HTMLCollection = _
  /**
   * forms returns a collection (an HTMLCollection) of the form elements within the
   * current document.
   *
   * MDN
   */
  var forms: HTMLCollection = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  /**
   * The Document.dir property is a DOMString representing the directionality of the
   * text of the document, whether left to right (default) or right to left. Possible
   * values are 'rtl', right to left, and 'ltr', left to right.
   *
   * MDN
   */
  var dir: js.String = _
  var onemptied: js.Function1[Event, _] = _
  /**
   * Can be used to make any document editable, for example in a <iframe />:
   *
   * MDN
   */
  var designMode: js.String = _
  var onseeking: js.Function1[Event, _] = _
  var ondeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplay: js.Function1[Event, _] = _
  var onloadstart: js.Function1[Event, _] = _
  var URLUnencoded: js.String = _
  /**
   * In browsers returns the window object associated with the document or null if none
   * available.
   *
   * MDN
   */
  var defaultView: Window = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, _] = _
  /**
   * Returns a string representing the encoding under which the document was parsed
   * (e.g. ISO-8859-1).
   *
   * MDN
   */
  var inputEncoding: js.String = _
  /**
   * Returns the currently focused element, that is, the element that will get
   * keystroke events if the user types any. This attribute is read only.
   *
   * MDN
   */
  val activeElement: Element = ???
  var onchange: js.Function1[Event, _] = _
  /**
   * The links property returns a collection of all AREA elements and anchor elements in
   * a document with a value for the href attribute.
   *
   * MDN
   */
  var links: HTMLCollection = _
  var uniqueID: js.String = _
  /**
   * Returns a string containing the URL of the current document.
   *
   * MDN
   */
  var URL: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  /**
   * Returns the <head> element of the current document. If there are more than one
   * <head> elements, the first one is returned.
   *
   * MDN
   */
  var head: HTMLHeadElement = _
  /**
   * Returns a semicolon-separated list of the cookies for that document or sets a
   * single cookie.
   *
   * MDN
   */
  var cookie: js.String = _
  /**
   * Returns the encoding as determined by the XML declaration. Should be null if
   * unspecified or unknown.
   *
   * MDN
   */
  var xmlEncoding: js.String = _
  var oncanplaythrough: js.Function1[Event, _] = _
  var documentMode: js.Number = _
  /**
   * Returns the character encoding of the current document.
   *
   * MDN
   */
  var characterSet: js.String = _
  /**
   * anchors returns a list of all of the anchors in the document.
   *
   * MDN
   */
  var anchors: HTMLCollection = _
  /**
   * Returns an HTMLCollection object containing one or more HTMLEmbedElements or
   * null which represent the <embed> elements in the current document.
   *
   * MDN
   */
  var plugins: HTMLCollection = _
  var onsuspend: js.Function1[Event, _] = _
  var rootElement: SVGSVGElement = _
  /**
   * Returns "loading" while the document is loading, "interactive" once it is
   * finished parsing but still loading sub-resources, and "complete" once it has
   * loaded.
   *
   * MDN
   */
  var readyState: js.String = _
  /**
   * Returns the URI of the page that linked to this page.
   *
   * MDN
   */
  var referrer: js.String = _
  /**
   * color is a string containing the name of the color (e.g., "blue", "darkblue", etc.)
   * or the hexadecimal value of the color (e.g., #0000FF)
   *
   * MDN
   */
  var alinkColor: js.String = _
  var parentWindow: Window = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onmousewheel: js.Function1[WheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, _] = _
  /**
   * Returns the version number as specified in the XML declaration (e.g., <?xml
   * version="1.0"?>) or "1.0" if the declaration is absent.
   *
   * MDN
   */
  var xmlVersion: js.String = _
  var msCapsLockWarningOff: js.Boolean = _
  var ondragend: js.Function1[DragEvent, js.Any] = _
  /**
   * Returns the Document Type Declaration (DTD) associated with current document.
   * The returned object implements the DocumentType interface. Use
   * DOMImplementation.createDocumentType() to create a DocumentType.
   *
   * MDN
   */
  var doctype: DocumentType = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  /**
   * The default value for this property in Mozilla Firefox is white (#ffffff in
   * hexadecimal).
   *
   * MDN
   */
  var bgColor: js.String = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  /**
   * linkColor gets/sets the color of links within the document.
   *
   * MDN
   */
  var linkColor: js.String = _
  var onpause: js.Function1[Event, _] = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var onwaiting: js.Function1[Event, _] = _
  var onstop: js.Function1[Event, _] = _
  /**
   * applets returns an ordered list of the applets within a document.
   *
   * MDN
   */
  var applets: HTMLCollection = _
  /**
   * Returns the <body> or <frameset> node of the current document, or null if no such
   * element exists.
   *
   * MDN
   */
  var body: HTMLElement = _
  /**
   * Gets/sets the domain portion of the origin of the current document, as used by the
   * same origin policy.
   *
   * MDN
   */
  var domain: js.String = _
  /**
   * Returns true if the XML declaration specifies the document is standalone (e.g., An
   * external part of the DTD affects the document's content), else false.
   *
   * MDN
   */
  var xmlStandalone: js.Boolean = _
  var onstalled: js.Function1[Event, _] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  /**
   * Returns the Element that is the root element of the document (for example, the
   * <html> element for HTML documents).
   *
   * MDN
   */
  var documentElement: Element = _
  var onratechange: js.Function1[Event, _] = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var media: js.String = _
  var onerror: js.Function1[Event, _] = _
  var onplay: js.Function1[Event, _] = _
  var onplaying: js.Function1[Event, _] = _
  /**
   * document.images returns a collection of the images in the current HTML document.
   *
   * MDN
   */
  var images: HTMLCollection = _
  /**
   * The Document.location read-only property returns a Location object, which
   * contains information about the URL of the document and provides methods for
   * changing that URL and load another URL.
   *
   * MDN
   */
  var location: Location = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onselectionchange: js.Function1[Event, _] = _
  var onstoragecommit: js.Function1[StorageEvent, js.Any] = _
  /**
   * Returns the event handling code for the readystatechange event.
   *
   * MDN
   */
  var onreadystatechange: js.Function1[Event, _] = _
  /**
   * Returns a string containing the date and time on which the current document was last
   * modified.
   *
   * MDN
   */
  var lastModified: js.String = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, _] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var onselectstart: js.Function1[Event, _] = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  /**
   * fgColor gets/sets the foreground color, or text color, of the current document.
   *
   * MDN
   */
  var fgColor: js.String = _
  var ontimeupdate: js.Function1[Event, _] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  /**
   * Indicates whether the document is rendered in Quirks mode or Strict mode.
   *
   * MDN
   */
  var compatMode: js.String = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var onload: js.Function1[Event, _] = _
  var oninput: js.Function1[Event, _] = _

  /**
   * Returns the current value of the current range for a formating command.
   *
   * MDN
   */
  def queryCommandValue(commandId: js.String): js.String = ???

  /**
   * Adopts a node from an external document. The node and its subtree is removed from the
   * document it's in (if any), and its ownerDocument is changed to the current
   * document. The node can then be inserted into the current document.
   *
   * MDN
   */
  def adoptNode(source: Node): Node = ???

  /**
   * Returns true if the formating command is in an indeterminate state on the current
   * range.
   *
   * MDN
   */
  def queryCommandIndeterm(commandId: js.String): js.Boolean = ???

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace.
   * The complete document is searched, including the root node.
   *
   * MDN
   */
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???

  /**
   * createProcessingInstruction() creates a new processing instruction node, and
   * returns it.
   *
   * MDN
   */
  def createProcessingInstruction(target: js.String, data: js.String): ProcessingInstruction = ???

  def execCommand(commandId: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???

  def execCommand(commandId: js.String, showUI: js.Boolean): js.Boolean = ???

  /**
   * When an HTML document has been switched to designMode, the document object exposes
   * the execCommand method which allows one to run commands to manipulate the
   * contents of the editable region. Most commands affect the document's selection
   * (bold, italics, etc), while others insert new elements (adding a link) or affect an
   * entire line (indenting). When using contentEditable,
   * calling execCommand will affect the currently active editable element.
   *
   * MDN
   */
  def execCommand(commandId: js.String): js.Boolean = ???

  /**
   * Returns the element from the document whose elementFromPoint method is being
   * called which is the topmost element which lies under the given point.  To get an
   * element, specify the point via coordinates, in CSS pixels, relative to the
   * upper-left-most point in the window or frame containing the document.
   *
   * MDN
   */
  def elementFromPoint(x: js.Number, y: js.Number): Element = ???

  /**
   * createCDATASection() creates a new CDATA section node, and returns it.
   *
   * MDN
   */
  def createCDATASection(data: js.String): CDATASection = ???

  /**
   * This method never did anything but throw an exception, and was removed in Gecko 14.0
   * (Firefox 14.0 / Thunderbird 14.0 / SeaMonkey 2.11).
   *
   * MDN
   */
  def queryCommandText(commandId: js.String): js.String = ???

  /**
   * Writes a string of text to a document stream opened by document.open().
   *
   * MDN
   */
  def write(content: js.String*): Unit = ???

  def updateSettings(): Unit = ???

  /**
   * In an HTML document creates the specified HTML element or HTMLUnknownElement if
   * the element is not known. In a XUL document creates the specified XUL element. In
   * other documents creates an element with a null namespaceURI.
   *
   * MDN
   */
  def createElement(tagName: js.String): HTMLElement = ???

  /**
   * Releases mouse capture if it's currently enabled on an element within this
   * document. Enabling mouse capture on an element is done by calling
   * element.setCapture().
   *
   * MDN
   */
  def releaseCapture(): Unit = ???

  /**
   * Writes a string of text followed by a newline character to a document.
   *
   * MDN
   */
  def writeln(content: js.String*): Unit = ???

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * MDN
   */
  def createElementNS(namespaceURI: js.String, qualifiedName: js.String): Element = ???

  def open(url: js.String, name: js.String, features: js.String, replace: js.Boolean): js.Dynamic = ???

  def open(url: js.String, name: js.String, features: js.String): js.Dynamic = ???

  def open(url: js.String, name: js.String): js.Dynamic = ???

  def open(url: js.String): js.Dynamic = ???

  /**
   * The document.open() method opens a document for writing.
   *
   * MDN
   */
  def open(): js.Dynamic = ???

  /**
   * Reports whether or not the specified editor query command is supported by the
   * browser.
   *
   * MDN
   */
  def queryCommandSupported(commandId: js.String): js.Boolean = ???

  /**
   * The Document.createTreeWalker() creator method returns a newly created
   * TreeWalker object.
   *
   * MDN
   */
  def createTreeWalker(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): TreeWalker = ???

  /**
   * Creates a new attribute node in a given namespace and returns it.
   *
   * MDN
   */
  def createAttributeNS(namespaceURI: js.String, qualifiedName: js.String): Attr = ???

  /**
   * Returns true if the formating command can be executed on the current range.
   *
   * MDN
   */
  def queryCommandEnabled(commandId: js.String): js.Boolean = ???

  def focus(): Unit = ???

  /**
   * The document.close() method finishes writing to a document, opened with
   * document.open().
   *
   * MDN
   */
  def close(): Unit = ???

  /**
   * Returns a set of elements which have all the given class names. When called on the
   * document object, the complete document is searched, including the root node. You
   * may also call getElementsByClassName on any element; it will return only elements
   * which are descendants of the specified root element with the given class names.
   *
   * MDN
   */
  def getElementsByClassName(classNames: js.String): NodeList = ???

  /**
   * Creates a copy of a node from an external document that can be inserted into the
   * current document.
   *
   * MDN
   */
  def importNode(importedNode: Node, deep: js.Boolean): Node = ???

  /**
   * Once a Range is created, you need to set its boundary points before you can make use of
   * most of its methods.
   *
   * MDN
   */
  def createRange(): Range = ???

  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???

  def fireEvent(eventName: js.String): js.Boolean = ???

  /**
   * createComment() creates a new comment node, and returns it.
   *
   * MDN
   */
  def createComment(data: js.String): Comment = ???

  /**
   * Returns a HTMLCollection of elements with the given tag name. The complete
   * document is searched, including the root node. The returned HTMLCollection is
   * live, meaning that it updates itself automatically to stay in sync with the DOM tree
   * without having to call document.getElementsByTagName again.
   *
   * MDN
   */
  def getElementsByTagName(tagname: js.String): NodeList = ???

  /**
   * Creates a new empty DocumentFragment.
   *
   * MDN
   */
  def createDocumentFragment(): DocumentFragment = ???

  def createStyleSheet(href: js.String, index: js.Number): CSSStyleSheet = ???

  def createStyleSheet(href: js.String): CSSStyleSheet = ???

  def createStyleSheet(): CSSStyleSheet = ???

  /**
   * Returns a list of elements with a given name in the (X)HTML document.
   *
   * MDN
   */
  def getElementsByName(elementName: js.String): NodeList = ???

  /**
   * Returns true if the formating command has been executed on the current range.
   *
   * MDN
   */
  def queryCommandState(commandId: js.String): js.Boolean = ???

  /**
   * Returns a Boolean value indicating whether the document or any element inside the
   * document has focus. This method can be used to determine whether the active element
   * in a document has focus.
   *
   * MDN
   */
  def hasFocus(): js.Boolean = ???

  /**
   * This method never did anything and always threw an exception, so it was removed in
   * Gecko 14.0 (Firefox 14.0 / Thunderbird 14.0 / SeaMonkey 2.11).
   *
   * MDN
   */
  def execCommandShowHelp(commandId: js.String): js.Boolean = ???

  /**
   * createAttribute creates a new attribute node, and returns it.
   *
   * MDN
   */
  def createAttribute(name: js.String): Attr = ???

  def createTextNode(data: js.String): Text = ???

  /**
   * Supported in FF 3.5+, Chrome 1+, Opera 9+, Safari 3+, IE9+
   *
   * MDN
   */
  def createNodeIterator(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): NodeIterator = ???

  /**
   * The DOM getSelection() method is available on the Window and Document interfaces.
   * See window.getSelection() for details.
   *
   * MDN
   */
  def getSelection(): Selection = ???

  /**
   * Returns an object reference to the identified element.
   *
   * MDN
   */
  def getElementById(elementId: js.String): HTMLElement = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var onmspointerdown: js.Function1[js.Any, js.Any] = _
  var msHidden: js.Boolean = _
  var msVisibilityState: js.String = _
  var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
  var visibilityState: js.String = _
  var onmsmanipulationstatechanged: js.Function1[js.Any, js.Any] = _
  var onmspointerhover: js.Function1[js.Any, js.Any] = _
  var onmscontentzoom: js.Function1[js.Any, js.Any] = _
  var onmspointermove: js.Function1[js.Any, js.Any] = _
  var onmsgesturehold: js.Function1[js.Any, js.Any] = _
  var onmsgesturechange: js.Function1[js.Any, js.Any] = _
  var onmsgesturestart: js.Function1[js.Any, js.Any] = _
  var onmspointercancel: js.Function1[js.Any, js.Any] = _
  var onmsgestureend: js.Function1[js.Any, js.Any] = _
  var onmsgesturetap: js.Function1[js.Any, js.Any] = _
  var onmspointerout: js.Function1[js.Any, js.Any] = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var msCSSOMElementFloatMetrics: js.Boolean = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  var hidden: js.Boolean = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _

  def msElementsFromPoint(x: js.Number, y: js.Number): NodeList = ???

  def msElementsFromRect(left: js.Number, top: js.Number, width: js.Number, height: js.Number): NodeList = ???

  /**
   * In recent versions of Mozilla-based applications as well as in Internet Explorer
   * and Netscape 4 this method does nothing.
   *
   * MDN
   */
  def clear(): Unit = ???
}


/**
 * A MessageEvent is sent to clients using WebSockets when data is received from the
 * server. This is delivered to the listener indicated by the WebSocket object's
 * onmessage attribute.
 *
 * MDN
 */
class MessageEvent extends Event {
  var source: Window = _
  var origin: js.String = _
  var data: js.Any = _

  def initMessageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, dataArg: js.Any, originArg: js.String, lastEventIdArg: js.String, sourceArg: Window): Unit = ???

  var ports: js.Any = _
}


/**
 * The 2D rendering context for the drawing surface of a <canvas> element. To get this
 * object, call getContext() on a <canvas>, supplying "2d" as the argument:
 *
 * MDN
 */
class CanvasRenderingContext2D extends js.Object {
  var miterLimit: js.Number = _
  var font: js.String = _
  /**
   * With globalAlpha applied this sets how shapes and images are drawn onto the
   * existing bitmap. Possible values: source-atop source-in source-out
   * source-over (default) destination-atop destination-in destination-out
   * destination-over lighter darker copy xor
   *
   * MDN
   */
  var globalCompositeOperation: js.String = _
  var msFillRule: js.String = _
  /**
   * Type of endings on the end of lines. Possible values: butt (default), round, square
   *
   * MDN
   */
  var lineCap: js.String = _
  var msImageSmoothingEnabled: js.Boolean = _
  /**
   * Specifies where to start a dasharray on a line.
   *
   * MDN
   */
  var lineDashOffset: js.Number = _
  /**
   * Color of the shadow. Default fully-transparent black.
   *
   * MDN
   */
  var shadowColor: js.String = _
  /**
   * Defines the type of corners where two lines meet. Possible values: round, bevel,
   * miter (default)
   *
   * MDN
   */
  var lineJoin: js.String = _
  /**
   * Horizontal distance the shadow will be offset. Default 0.
   *
   * MDN
   */
  var shadowOffsetX: js.Number = _
  var lineWidth: js.Number = _
  /**
   * Back-reference to the canvas element for which this context was created. Read
   * only.
   *
   * MDN
   */
  var canvas: HTMLCanvasElement = _
  /**
   * Color or style to use for the lines around shapes. Default #000 (black).
   *
   * MDN
   */
  var strokeStyle: js.Any = _
  /**
   * Alpha value that is applied to shapes and images before they are composited onto the
   * canvas. Default 1.0 (opaque).
   *
   * MDN
   */
  var globalAlpha: js.Number = _
  /**
   * Vertical distance the shadow will be offset. Default 0.
   *
   * MDN
   */
  var shadowOffsetY: js.Number = _
  /**
   * Color or style to use inside shapes. Default #000 (black).
   *
   * MDN
   */
  var fillStyle: js.Any = _
  /**
   * Specifies the blurring effect. Default 0
   *
   * MDN
   */
  var shadowBlur: js.Number = _
  /**
   * Possible values: start (default), end, left, right or center.
   *
   * MDN
   */
  var textAlign: js.String = _
  /**
   * Possible values: top, hanging, middle, alphabetic (default), ideographic,
   * bottom
   *
   * MDN
   */
  var textBaseline: js.String = _

  /**
   * Restores the drawing style state to the last element on the 'state stack' saved by
   * save().
   *
   * MDN
   */
  def restore(): Unit = ???

  def setTransform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???

  /**
   * Saves the current drawing style state using a stack so you can revert any change you
   * make to it using restore().
   *
   * MDN
   */
  def save(): Unit = ???

  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number, anticlockwise: js.Boolean): Unit = ???

  /**
   * Adds an arc to the path which is centered at (x, y) position with radius r starting at
   * startAngle and ending at endAngle going in the given direction by anticlockwise
   * (defaulting to clockwise).
   *
   * MDN
   */
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number): Unit = ???

  def measureText(text: js.String): TextMetrics = ???

  def isPointInPath(x: js.Number, y: js.Number, fillRule: js.String): js.Boolean = ???

  /**
   * Reports whether or not the specified point is contained in the current path.
   *
   * MDN
   */
  def isPointInPath(x: js.Number, y: js.Number): js.Boolean = ???

  def quadraticCurveTo(cpx: js.Number, cpy: js.Number, x: js.Number, y: js.Number): Unit = ???

  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number, dirtyWidth: js.Number, dirtyHeight: js.Number): Unit = ???

  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number, dirtyWidth: js.Number): Unit = ???

  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number): Unit = ???

  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number): Unit = ???

  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number): Unit = ???

  def rotate(angle: js.Number): Unit = ???

  def fillText(text: js.String, x: js.Number, y: js.Number, maxWidth: js.Number): Unit = ???

  def fillText(text: js.String, x: js.Number, y: js.Number): Unit = ???

  /**
   * Moves the origin point of the context to (x, y).
   *
   * MDN
   */
  def translate(x: js.Number, y: js.Number): Unit = ???

  def scale(x: js.Number, y: js.Number): Unit = ???

  def createRadialGradient(x0: js.Number, y0: js.Number, r0: js.Number, x1: js.Number, y1: js.Number, r1: js.Number): CanvasGradient = ???

  /**
   * Connects the last point in the subpath to the x, y coordinates with a straight line.
   *
   * MDN
   */
  def lineTo(x: js.Number, y: js.Number): Unit = ???

  /**
   * Returns a dash list array containing an even number of non-negative numbers.
   *
   * MDN
   */
  def getLineDash(): js.Array[js.Number] = ???

  def fill(fillRule: js.String): Unit = ???

  /**
   * Fills the subpaths with the current fill style.
   *
   * MDN
   */
  def fill(): Unit = ???

  def createImageData(imageDataOrSw: js.Any, sh: js.Number): ImageData = ???

  /**
   * Creates a new, blank ImageData object with the specified dimensions. All of the
   * pixels in the new object are transparent black.
   *
   * MDN
   */
  def createImageData(imageDataOrSw: js.Any): ImageData = ???

  def createPattern(image: HTMLElement, repetition: js.String): CanvasPattern = ???

  /**
   * Tries to draw a straight line from the current point to the start. If the shape has
   * already been closed or has only one point, this function does nothing.
   *
   * MDN
   */
  def closePath(): Unit = ???

  def rect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???

  def clip(fillRule: js.String): Unit = ???

  /**
   * Creates a clipping path from the current sub-paths. Everything drawn after clip()
   * is called appears inside the clipping path only. For an example, see Clipping paths
   * in the Canvas tutorial.
   *
   * MDN
   */
  def clip(): Unit = ???

  /**
   * Sets all pixels in the rectangle defined by starting point (x, y) and size (width,
   * height) to transparent black.
   *
   * MDN
   */
  def clearRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???

  /**
   * Moves the starting point of a new subpath to the (x, y) coordinates.
   *
   * MDN
   */
  def moveTo(x: js.Number, y: js.Number): Unit = ???

  /**
   * Returns an ImageData object representing the underlying pixel data for the area of
   * the canvas denoted by the rectangle which starts at (sx, sy) and has an sw width and sh
   * height.
   *
   * MDN
   */
  def getImageData(sx: js.Number, sy: js.Number, sw: js.Number, sh: js.Number): ImageData = ???

  /**
   * Draws a filled rectangle at (x, y) position whose size is determined by width and
   * height.
   *
   * MDN
   */
  def fillRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???

  def bezierCurveTo(cp1x: js.Number, cp1y: js.Number, cp2x: js.Number, cp2y: js.Number, x: js.Number, y: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number, canvasImageHeight: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number): Unit = ???

  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number): Unit = ???

  /**
   * Draws the specified image. This method is available in multiple formats,
   * providing a great deal of flexibility in its use.
   *
   * MDN
   */
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number): Unit = ???

  def transform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???

  /**
   * Strokes the subpaths with the current stroke style.
   *
   * MDN
   */
  def stroke(): Unit = ???

  /**
   * Paints a rectangle which has a starting point at (x, y) and has a w width and an h height
   * onto the canvas, using the current stroke style.
   *
   * MDN
   */
  def strokeRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???

  def setLineDash(segments: js.Array[js.Number]): Unit = ???

  def strokeText(text: js.String, x: js.Number, y: js.Number, maxWidth: js.Number): Unit = ???

  def strokeText(text: js.String, x: js.Number, y: js.Number): Unit = ???

  /**
   * Starts a new path by resetting the list of sub-paths. Call this method when you want
   * to create a new path.
   *
   * MDN
   */
  def beginPath(): Unit = ???

  /**
   * Adds an arc with the given control points and radius, connected to the previous
   * point by a straight line.
   *
   * MDN
   */
  def arcTo(x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number, radius: js.Number): Unit = ???

  def createLinearGradient(x0: js.Number, y0: js.Number, x1: js.Number, y1: js.Number): CanvasGradient = ???
}


/**
 * XMLHttpRequest is a JavaScript object that was designed by Microsoft and adopted
 * by Mozilla, Apple, and Google. It's now being standardized in the W3C. It provides
 * an easy way to retrieve data from a URL without having to do a full page refresh. A Web
 * page can update just a part of the page without disrupting what the user is doing.
 *  XMLHttpRequest is used heavily in AJAX programming.
 *
 * MDN
 */
class XMLHttpRequest extends EventTarget {
  var responseBody: js.Any = _
  /**
   * The status of the response to the request. This is the HTTP result code (for example,
   * status is 200 for a successful request).
   *
   * MDN
   */
  var status: js.Number = _
  /**
   * The state of the request: Value State Description 0 UNSENT open()has not been
   * called yet. 1 OPENED send()has not been called yet. 2 HEADERS_RECEIVED send() has
   * been called, and headers and status are available. 3 LOADING Downloading;
   * responseText holds partial data. 4 DONE The operation is complete.
   *
   * MDN
   */
  var readyState: js.Number = _
  /**
   * The response to the request as text, or null if the request was unsuccessful or has
   * not yet been sent.
   *
   * MDN
   */
  var responseText: js.String = _
  /**
   * The response to the request as a DOM Document object, or null if the request was
   * unsuccessful, has not yet been sent, or cannot be parsed as XML or HTML. The response
   * is parsed as if it were a text/xml stream. When the responseType is set to "document"
   * and the request has been made asynchronously, the response is parsed as a text/html
   * stream. Note: If the server doesn't apply the text/xml Content-Type header, you
   * can use overrideMimeType()to force XMLHttpRequest to parse it as XML anyway.
   *
   * MDN
   */
  var responseXML: Document = _
  var ontimeout: js.Function1[Event, _] = _
  /**
   * The response string returned by the HTTP server. Unlike status, this includes the
   * entire text of the response message ("200 OK", for example).
   *
   * MDN
   */
  var statusText: js.String = _
  var onreadystatechange: js.Function1[Event, _] = _
  /**
   * The number of milliseconds a request can take before automatically being
   * terminated. A value of 0 (which is the default) means there is no timeout. Note: You
   * may not use a timeout for synchronous requests with an owning window.
   *
   * MDN
   */
  var timeout: js.Number = _
  var onload: js.Function1[Event, _] = _

  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String, password: js.String): Unit = ???

  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String): Unit = ???

  def open(method: js.String, url: js.String, async: js.Boolean): Unit = ???

  /**
   * Initializes a request. This method is to be used from JavaScript code; to
   * initialize a request from native code, use openRequest()instead.
   *
   * MDN
   */
  def open(method: js.String, url: js.String): Unit = ???

  def create(): XMLHttpRequest = ???

  def send(data: js.Any): Unit = ???

  /**
   * Sends the request. If the request is asynchronous (which is the default), this
   * method returns as soon as the request is sent. If the request is synchronous, this
   * method doesn't return until the response has arrived.
   *
   * MDN
   */
  def send(): Unit = ???

  /**
   * Aborts the request if it has already been sent.
   *
   * MDN
   */
  def abort(): Unit = ???

  def getAllResponseHeaders(): js.String = ???

  /**
   * Sets the value of an HTTP request header. You must call setRequestHeader()
   * after open(), but before send(). If this method is called several times with the
   * same header, the values are merged into one single request header.
   *
   * MDN
   */
  def setRequestHeader(header: js.String, value: js.String): Unit = ???

  def getResponseHeader(header: js.String): js.String = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
  /**
   * The response entity body according to responseType, as an ArrayBuffer, Blob,
   * Document, JavaScript object (for "json"), or string. This is null if the request is
   * not complete or was not successful.
   *
   * MDN
   */
  var response: js.Any = _
  /**
   * Indicates whether or not cross-site Access-Control requests should be made using
   * credentials such as cookies or authorization headers. The default is false. Note:
   * This never affects same-site requests. Note: Starting with Gecko 11.0 (Firefox
   * 11.0 / Thunderbird 11.0 / SeaMonkey 2.8), Gecko no longer lets you use the
   * withCredentials attribute when performing synchronous requests. Attempting to
   * do so throws an NS_ERROR_DOM_INVALID_ACCESS_ERR exception.
   *
   * MDN
   */
  var withCredentials: js.Boolean = _
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  /**
   * Can be set to change the response type. Value Data type of response property ""
   * (empty string) String (this is the default) "arraybuffer" ArrayBuffer "blob"
   * Blob "document" Document "json" JavaScript object, parsed from a JSON string
   * returned by the server "text" String "moz-blob" Used by Firefox to allow
   * retrieving partial Blob data from progress events. This lets your progress event
   * handler start processing data while it's still being received.
   * "moz-chunked-text" Similar to "text", but is streaming. This means that the value
   * in response is only available during dispatch of the "progress" event and only
   * contains the data received since the last "progress" event. When response is
   * accessed during a "progress" event it contains a string with the data. Otherwise it
   * returns null. This mode currently only works in Firefox.
   * "moz-chunked-arraybuffer" Similar to "arraybuffer", but is streaming. This
   * means that the value in response is only available during dispatch of the
   * "progress" event and only contains the data received since the last "progress"
   * event. When response is accessed during a "progress" event it contains a string
   * with the data. Otherwise it returns null. This mode currently only works in
   * Firefox. Note: Starting with Gecko 11.0 (Firefox 11.0 / Thunderbird 11.0 /
   * SeaMonkey 2.8), as well as WebKit build 528, these browsers no longer let you use the
   * responseType attribute when performing synchronous requests. Attempting to do
   * so throws an NS_ERROR_DOM_INVALID_ACCESS_ERR exception. This change has been
   * proposed to the W3C for standardization.
   *
   * MDN
   */
  var responseType: js.String = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  /**
   * The upload process can be tracked by adding an event listener to upload.
   *
   * MDN
   */
  var upload: XMLHttpRequestEventTarget = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
}

/**
 * XMLHttpRequest is a JavaScript object that was designed by Microsoft and adopted
 * by Mozilla, Apple, and Google. It's now being standardized in the W3C. It provides
 * an easy way to retrieve data from a URL without having to do a full page refresh. A Web
 * page can update just a part of the page without disrupting what the user is doing.
 *  XMLHttpRequest is used heavily in AJAX programming.
 *
 * MDN
 */
object XMLHttpRequest extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
}

class Screen extends js.Object {
  /**
   * Note that not all of the width given by this property may be available to the window
   * itself. When other widgets occupy space that cannot be used by the window object,
   * there is a difference in window.screen.width and window.screen.availWidth. See
   * also window.screen.height.
   *
   * MDN
   */
  var width: js.Number = _
  var deviceXDPI: js.Number = _
  var fontSmoothingEnabled: js.Boolean = _
  var bufferDepth: js.Number = _
  var logicalXDPI: js.Number = _
  var systemXDPI: js.Number = _
  /**
   * Returns the amount of vertical space available to the window on the screen.
   *
   * MDN
   */
  var availHeight: js.Number = _
  /**
   * Returns the height of the screen in pixels.
   *
   * MDN
   */
  var height: js.Number = _
  var logicalYDPI: js.Number = _
  var systemYDPI: js.Number = _
  var updateInterval: js.Number = _
  /**
   * Returns the color depth of the screen.
   *
   * MDN
   */
  var colorDepth: js.Number = _
  /**
   * Returns the amount of horizontal space in pixels available to the window.
   *
   * MDN
   */
  var availWidth: js.Number = _
  var deviceYDPI: js.Number = _
  /**
   * Returns the bit depth of the screen.
   *
   * MDN
   */
  var pixelDepth: js.Number = _
}


/**
 * The Coordinates interface represents the position and attitude of the device on
 * Earth, as well as the accuracy with which these data are computed.
 *
 * MDN
 */
trait Coordinates extends js.Object {
  /**
   * The Coordinates.altitudeAccuracy read-only property is a strictly positive
   * double representing the accuracy, with a 95% confidence level, of the altitude
   * expressed in meters. This value is null if the implementation doesn't support
   * measuring altitude.
   *
   * MDN
   */
  var altitudeAccuracy: js.Number = _
  /**
   * The Coordinates.longitude read-only property is a double representing the
   * longitude of the position in decimal degrees.
   *
   * MDN
   */
  var longitude: js.Number = _
  /**
   * The Coordinates.latitude read-only property is a double representing the
   * latitude of the position in decimal degrees.
   *
   * MDN
   */
  var latitude: js.Number = _
  /**
   * The Coordinates.speed read-only property is a double representing the velocity
   * of the device in meters per second. This value is null if the implementation is not
   * able to measure it.
   *
   * MDN
   */
  var speed: js.Number = _
  /**
   * The Coordinates.heading read-only property is a double representing the
   * direction in which the device is traveling. This value, specified in degrees,
   * indicates how far off from heading due north the device is. 0 degrees represents
   * true true north, and the direction is determined clockwise (which means that east
   * is 90 degrees and west is 270 degrees). If Coordinates.speed is 0, heading is NaN. If
   * the device is not able to provide heading information, this value is null.
   *
   * MDN
   */
  var heading: js.Number = _
  /**
   * The Coordinates.altitude read-only property is a double representing the
   * altitude of the position in meters, relative to sea level. This value is null if the
   * implementation cannot provide this data.
   *
   * MDN
   */
  var altitude: js.Number = _
  /**
   * The Coordinates.accuracy read-only property is a strictly positive double
   * representing the accuracy, with a 95% confidence level, of the
   * Coordinates.latitude and Coordinates.longitude properties expressed in
   * meters.
   *
   * MDN
   */
  var accuracy: js.Number = _
}


/**
 * The NavigatorGeolocation interface contains a constructor method allowing
 * objects implementing it to obtain a Geolocation instance.
 *
 * MDN
 */
trait NavigatorGeolocation extends js.Object {
  /**
   * The NavigatorGeolocation.geolocation read-only property returns a
   * Geolocation object that gives Web content access to the location of the device.
   * This allows a Web site or app offer customized results based on the user's location.
   *
   * MDN
   */
  var geolocation: Geolocation = _
}

trait NavigatorContentUtils extends js.Object {
}


/**
 * The DataTransfer object is used to hold the data that is being dragged during a drag
 * and drop operation. It may hold one or more data items, each of one or more data types.
 * For more information about drag and drop, see Drag and Drop.
 *
 * MDN
 */
trait DataTransfer extends js.Object {
  /**
   * Specifies the effects that are allowed for this drag. You may set this in the
   * dragstart event to set the desired effects for the source, and within the dragenter
   * and dragover events to set the desired effects for the target. The value is not used
   * for other events.
   *
   * MDN
   */
  var effectAllowed: js.String = _
  /**
   * The actual effect that will be used, and should always be one of the possible values
   * of effectAllowed.
   *
   * MDN
   */
  var dropEffect: js.String = _

  def clearData(format: js.String): js.Boolean = ???

  /**
   * Remove the data associated with a given type. The type argument is optional. If the
   * type is empty or not specified, the data associated with all types is removed. If
   * data for the specified type does not exist, or the data transfer contains no data,
   * this method will have no effect.
   *
   * MDN
   */
  def clearData(): js.Boolean = ???

  /**
   * Set the data for a given type. If data for the type does not exist, it is added at the
   * end, such that the last item in the types list will be the new format. If data for the
   * type already exists, the existing data is replaced in the same position. That is,
   * the order of the types list is not changed when replacing data of the same type.
   *
   * MDN
   */
  def setData(format: js.String, data: js.String): js.Boolean = ???

  /**
   * Retrieves the data for a given type, or an empty string if data for that type does not
   * exist or the data transfer contains no data.
   *
   * MDN
   */
  def getData(format: js.String): js.String = ???

  /**
   * Holds a list of the format types of the data that is stored for the first item, in the
   * same order the data was added. An empty list will be returned if no data was added.
   *
   * MDN
   */
  var types: DOMStringList = _
  var files: FileList = _
}


/**
 * The FocusEvent interface represents focus-related events like focus, blur,
 * focusin, or focusout.
 *
 * MDN
 */
class FocusEvent extends UIEvent {
  /**
   * The FocusEvent.relatedTarget read-only property represents a secondary target
   * for this event, which will depend of the event itself. As in some cases (like when
   * tabbing in or out a page), this property may be set to null for security reasons.
   *
   * MDN
   */
  var relatedTarget: EventTarget = _

  def initFocusEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, relatedTargetArg: EventTarget): Unit = ???
}


/**
 * The Range interface represents a fragment of a document that can contain nodes and
 * parts of text nodes in a given document.
 *
 * MDN
 */
class Range extends js.Object {
  /**
   * The Range.startOffset read-only property returns a number representing where in
   * the startContainer the Range starts.
   *
   * MDN
   */
  var startOffset: js.Number = _
  /**
   * The Range.collapsed read-only property returns a Boolean flag indicating
   * whether the start and end points of the Range are at the same position. It returns
   * true if the start and end boundary points of the Range are the same point in the DOM,
   * false if not.
   *
   * MDN
   */
  var collapsed: js.Boolean = _
  /**
   * The Range.endOffset read-only property returns a number representing where in
   * the Range.endContainer the Range ends.
   *
   * MDN
   */
  var endOffset: js.Number = _
  /**
   * The Range.startContainer read-only property returns the Node within which the
   * Range starts. To change the start position of a node, use one of the
   * Range.setStart() methods.
   *
   * MDN
   */
  var startContainer: Node = _
  /**
   * The Range.endContainer read-only property returns the Node within which the
   * Range ends. To change the end position of a node, use the Range.setEnd() method or a
   * similar one.
   *
   * MDN
   */
  var endContainer: Node = _
  /**
   * The Range.commonAncestorContainer read-only property returns the deepest, or
   * further down the document tree, Node that contains both the Range.startContainer
   * and Range.endContainer nodes.
   *
   * MDN
   */
  var commonAncestorContainer: Node = _

  /**
   * The Range.setStart() method sets the start position of a Range.
   *
   * MDN
   */
  def setStart(refNode: Node, offset: js.Number): Unit = ???

  /**
   * The Range.setEndBefore() method sets the end position of a Range relative to
   * another Node. The parent Node of end of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setEndBefore(refNode: Node): Unit = ???

  /**
   * The Range.setStartBefore() method sets the start position of a Range relative to
   * another Node. The parent Node of the start of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setStartBefore(refNode: Node): Unit = ???

  /**
   * The Range.selectNode() method sets the Range to contain the Node and its contents.
   * The parent Node of the start and end of the Range will be the same as the parent of the
   * referenceNode.
   *
   * MDN
   */
  def selectNode(refNode: Node): Unit = ???

  /**
   * The Range.detach() method releases a Range from use. This lets the browser choose
   * to release resources associated with this Range. Subsequent attempts to use the
   * detached range will result in a DOMException being thrown with an error code of
   * INVALID_STATE_ERR.
   *
   * MDN
   */
  def detach(): Unit = ???

  /**
   * The Range.getBoundingClientRect() method returns a ClientRect object that
   * bounds the contents of the range; this a rectangle enclosing the union of the
   * bounding rectangles for all the elements in the range.
   *
   * MDN
   */
  def getBoundingClientRect(): ClientRect = ???

  /**
   * The Range.compareBoundaryPoints() method compares the boundary points of the
   * Range with another one.
   *
   * MDN
   */
  def compareBoundaryPoints(how: js.Number, sourceRange: Range): js.Number = ???

  /**
   * The Range.insertNode() method inserts a node at the start of the Range.
   *
   * MDN
   */
  def insertNode(newNode: Node): Unit = ???

  /**
   * The Range.collapse() method collapses the Range to one of its boundary points.
   *
   * MDN
   */
  def collapse(toStart: js.Boolean): Unit = ???

  /**
   * The Range.selectNodeContents() sets the Range to contain the contents of
   * a Node.
   *
   * MDN
   */
  def selectNodeContents(refNode: Node): Unit = ???

  /**
   * The Range.cloneContents() returns a DocumentFragment copying the objects of
   * type Node included in the Range.
   *
   * MDN
   */
  def cloneContents(): DocumentFragment = ???

  /**
   * The Range.setEnd() method sets the end position of a Range.
   *
   * MDN
   */
  def setEnd(refNode: Node, offset: js.Number): Unit = ???

  /**
   * The Range.cloneRange() method returns a Range object with boundary points
   * identical to the cloned Range.
   *
   * MDN
   */
  def cloneRange(): Range = ???

  /**
   * The Range.getClientRects() method returns a list of ClientRect objects
   * representing the area of the screen occupied by the range. This is created by
   * aggregating the results of calls to Element.getClientRects() for all the
   * elements in the range.
   *
   * MDN
   */
  def getClientRects(): ClientRectList = ???

  /**
   * The Range.surroundContents() method moves content of the Range into a new node,
   * placing the new node at the start of the specified range.
   *
   * MDN
   */
  def surroundContents(newParent: Node): Unit = ???

  /**
   * The Range.deleteContents() removes the contents of the Range from the Document.
   *
   * MDN
   */
  def deleteContents(): Unit = ???

  /**
   * The Range.setStartAfter() method sets the start position of a Range relative to a
   * Node. The parent Node of the start of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setStartAfter(refNode: Node): Unit = ???

  /**
   * The Range.extractContents() method moves contents of the Range from the
   * document tree into a DocumentFragment.
   *
   * MDN
   */
  def extractContents(): DocumentFragment = ???

  /**
   * The Range.setEndAfter() method sets the end position of a Range relative to
   * another Node. The parent Node of end of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setEndAfter(refNode: Node): Unit = ???

  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _

  /**
   * The Range.createContextualFragment() method returns a DocumentFragment by
   * invoking the HTML fragment parsing algorithm or the XML fragment parsing
   * algorithm with the start of the range (the parent of the selected node) as the
   * context node. The HTML fragment parsing algorithm is used if the range belongs to a
   * Document whose HTMLness bit is set. In the HTML case, if the context node would be
   * html, for historical reasons the fragment parsing algorithm is invoked with body
   * as the context instead.
   *
   * MDN
   */
  def createContextualFragment(fragment: js.String): DocumentFragment = ???
}

/**
 * The Range interface represents a fragment of a document that can contain nodes and
 * parts of text nodes in a given document.
 *
 * MDN
 */
object Range extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Range),List())))) */
  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _
}

class Storage {
  var length: js.Number = _

  def getItem(key: js.String): js.Dynamic = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(key: js.String): js.Any = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(key: js.String, v: js.Any): Unit = ???

  def setItem(key: js.String, data: js.String): Unit = ???

  def clear(): Unit = ???

  def removeItem(key: js.String): Unit = ???

  def key(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.Any = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.Any): Unit = ???
}


/**
 * The DocumentType interface represents a Node containing a doctype.
 *
 * MDN
 */
class DocumentType extends Node {
  var name: js.String = _
  var notations: NamedNodeMap = _
  var systemId: js.String = _
  var internalSubset: js.String = _
  var entities: NamedNodeMap = _
  var publicId: js.String = _
}


class MutationEvent extends Event {
  var newValue: js.String = _
  var attrChange: js.Number = _
  var attrName: js.String = _
  var prevValue: js.String = _
  var relatedNode: Node = _

  def initMutationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, relatedNodeArg: Node, prevValueArg: js.String, newValueArg: js.String, attrNameArg: js.String, attrChangeArg: js.Number): Unit = ???

  var MODIFICATION: js.Number = _
  var REMOVAL: js.Number = _
  var ADDITION: js.Number = _
}

object MutationEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MutationEvent),List())))) */
  var MODIFICATION: js.Number = _
  var REMOVAL: js.Number = _
  var ADDITION: js.Number = _
}

trait DragEvent extends MouseEvent {
  var dataTransfer: DataTransfer = _

  def initDragEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget, dataTransferArg: DataTransfer): Unit = ???
}


/**
 * The PerformanceTiming interface represents timing-related performance
 * information for the given page.
 *
 * MDN
 */
class PerformanceTiming extends js.Object {
  /**
   * The PerformanceTiming.redirectStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, the first
   * HTTP redirect starts. If there is no redirect, or if one of the redirect is not of the
   * same origin, the value returned is 0.
   *
   * MDN
   */
  var redirectStart: js.Number = _
  /**
   * The PerformanceTiming.domainLookupEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, where the
   * domain lookup is finished. If a persistent connection is used, or the information
   * is stored in a cache or a local resource, the value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  var domainLookupEnd: js.Number = _
  /**
   * The PerformanceTiming.responseStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * browser received the first byte of the response, from the server from a cache, of
   * from a local resource.
   *
   * MDN
   */
  var responseStart: js.Number = _
  /**
   * The PerformanceTiming.domComplete read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the parser
   * finished its work on the main document, that is when its Document.readyState
   * changes to 'complete' and the corresponding readystatechange event is thrown.
   *
   * MDN
   */
  var domComplete: js.Number = _
  /**
   * The PerformanceTiming.domainLookupStart read-only property returns an
   * unsigned long long representing the moment, in miliseconds since the UNIX epoch,
   * where the domain lookup starts. If a persistent connection is used, or the
   * information is stored in a cache or a local resource, the value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  var domainLookupStart: js.Number = _
  /**
   * The PerformanceTiming.loadEventStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * load event was sent for the current document. If this event has not yet been sent, it
   * returns 0.
   *
   * MDN
   */
  var loadEventStart: js.Number = _
  var msFirstPaint: js.Number = _
  /**
   * The PerformanceTiming.unloadEventEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, the unload
   * event handler finishes. If there is no previous document, or if the previous
   * document, or one of the needed redirects, is not of the same origin, the value
   * returned is 0.
   *
   * MDN
   */
  var unloadEventEnd: js.Number = _
  /**
   * The PerformanceTiming.fetchStart read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, the browser is
   * ready to fetch the document using an HTTP request. This moment is before the check to
   * any application cache.
   *
   * MDN
   */
  var fetchStart: js.Number = _
  /**
   * The PerformanceTiming.requestStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * browser sent the request to obtain the actual document, from the server or from a
   * cache. If the transport layer fails after the start of the request and the
   * connection is reopened, this property will be set to the time corresponding to the
   * new request.
   *
   * MDN
   */
  var requestStart: js.Number = _
  /**
   * The PerformanceTiming.domInteractive read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * parser finished its work on the main document, that is when its
   * Document.readyState changes to 'interactive' and the corresponding
   * readystatechange event is thrown.
   *
   * MDN
   */
  var domInteractive: js.Number = _
  /**
   * The PerformanceTiming.navigationStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, right
   * after the prompt for unload terminates on the previous document in the same
   * browsing context. If there is no previous document, this value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  var navigationStart: js.Number = _
  /**
   * The PerformanceTiming.connectEnd read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, where the
   * connection is opened network. If the transport layer reports an error and the
   * connection establishment is started again, the last connection establisment end
   * time is given. If a persistent connection is used, the value will be the same as
   * PerformanceTiming.fetchStart. A connection is considered as opened when all
   * secure connection handshake, or SOCKS authentication, is terminated.
   *
   * MDN
   */
  var connectEnd: js.Number = _
  /**
   * The PerformanceTiming.loadEventEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * load event handler terminated, that is when the load event is completed. If this
   * event has not yet been sent, or is not yet completed, it returns 0.
   *
   * MDN
   */
  var loadEventEnd: js.Number = _
  /**
   * The PerformanceTiming.connectStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, where the
   * request to open a connection is sent to the network. If the transport layer reports
   * an error and the connection establishment is started again, the last connection
   * establisment start time is given. If a persistent connection is used, the value
   * will be the same as PerformanceTiming.fetchStart.
   *
   * MDN
   */
  var connectStart: js.Number = _
  /**
   * The PerformanceTiming.responseEnd read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the
   * browser received the last byte of the response, or when the connection is closed if
   * this happened first, from the server from a cache, of from a local resource.
   *
   * MDN
   */
  var responseEnd: js.Number = _
  /**
   * The PerformanceTiming.domLoading read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the parser
   * started its work, that is when its Document.readyState changes to 'loading' and
   * the corresponding readystatechange event is thrown.
   *
   * MDN
   */
  var domLoading: js.Number = _
  /**
   * The PerformanceTiming.redirectEnd read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, the last HTTP
   * redirect is completed, that is when the last byte of the HTTP response has been
   * received. If there is no redirect, or if one of the redirect is not of the same origin,
   * the value returned is 0.
   *
   * MDN
   */
  var redirectEnd: js.Number = _
  /**
   * The PerformanceTiming.unloadEventStart read-only property returns an
   * unsigned long long representing the moment, in miliseconds since the UNIX epoch,
   * the unload event has been thrown. If there is no previous document, or if the
   * previous document, or one of the needed redirects, is not of the same origin, the
   * value returned is 0.
   *
   * MDN
   */
  var unloadEventStart: js.Number = _
  /**
   * The PerformanceTiming.domContentLoadedEventStart read-only property
   * returns an unsigned long long representing the moment, in miliseconds since the
   * UNIX epoch, right before the parser sent the DOMContentLoaded event, that is right
   * after all the scripts that need to be executed right after parsing has been
   * executed.
   *
   * MDN
   */
  var domContentLoadedEventStart: js.Number = _
  /**
   * The PerformanceTiming.domContentLoadedEventEnd read-only property returns
   * an unsigned long long representing the moment, in miliseconds since the UNIX
   * epoch, right after all the scripts that need to be executed as soon as possible, in
   * order or not, has been executed.
   *
   * MDN
   */
  var domContentLoadedEventEnd: js.Number = _

  /**
   * Is a jsonizer returning a JSON object representing the specific
   * PerformanceTiming object.
   *
   * MDN
   */
  def toJSON(): js.Dynamic = ???
}


trait EventException extends js.Object {
  var code: js.Number = _
  var message: js.String = _

  var DISPATCH_REQUEST_ERR: js.Number = _
  var UNSPECIFIED_EVENT_TYPE_ERR: js.Number = _
  var name: js.String = _
}

object EventException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(EventException),List())))) */
  var DISPATCH_REQUEST_ERR: js.Number = _
  var UNSPECIFIED_EVENT_TYPE_ERR: js.Number = _
}

/**
 * The NavigatorOnLine interface contains methods and properties related to the
 * connectivity status of the browser.
 *
 * MDN
 */
trait NavigatorOnLine extends js.Object {
  /**
   * Returns the online status of the browser. The property returns a boolean value,
   * with true for being online and false for being offline. The property sends updates
   * whenever the browser's ability to connect to the network changes. The update
   * occurs when the user follows links or when a script requests a remote page. For
   * example, the property should return false when users click links soon after they
   * lose internet connection.
   *
   * MDN
   */
  var onLine: js.Boolean = _
}

trait WindowLocalStorage extends js.Object {
  var localStorage: Storage = _
}


trait NavigatorStorageUtils extends js.Object {
}


/**
 * The Location interface represents the location of the object it is linked to.
 * Changes done on it are reflected on the object it relates to. Both the Document and
 * Window interface have such a linked Location, accessible via Document.location
 * and Window.location respectively.
 *
 * MDN
 */
trait Location extends js.Object {
  /**
   * Is a DOMString containing a '#' followed by the fragment identifier of the URL.
   *
   * MDN
   */
  var hash: js.String = _
  /**
   * Is a DOMString containing the protocol scheme of the URL, including the final ':'.
   *
   * MDN
   */
  var protocol: js.String = _
  /**
   * Is a DOMString containing a '?' followed by the parameters of the URL.
   *
   * MDN
   */
  var search: js.String = _
  /**
   * Is a DOMString containing the whole URL.
   *
   * MDN
   */
  var href: js.String = _
  /**
   * Is a DOMString containing the domain of the URL.
   *
   * MDN
   */
  var hostname: js.String = _
  /**
   * Is a DOMString containing the port number of the URL.
   *
   * MDN
   */
  var port: js.String = _
  /**
   * Is a DOMString containing an initial '/' followed by the path of the URL.
   *
   * MDN
   */
  var pathname: js.String = _
  /**
   * Is a DOMString containing the host, that is the hostname, a ':', and the port of the
   * URL.
   *
   * MDN
   */
  var host: js.String = _

  def reload(flag: js.Boolean): Unit = ???

  /**
   * The Location.reload()method Reloads the resource from the current URL. Its
   * optional unique parameter is a Boolean, which, when it is true, causes the page to
   * always be reloaded from the server. If it is false or not specified, the browser may
   * reload the page from its cache.
   *
   * MDN
   */
  def reload(): Unit = ???

  /**
   * The Location.replace()method replaces the current resource with the one at the
   * provided URL. The difference from the assign() method is that after using
   * replace() the current page will not be saved in session History, meaning the user
   * won't be able to use the back button to navigate to it.
   *
   * MDN
   */
  def replace(url: js.String): Unit = ???

  /**
   * The Location.assign()method loading the object at the URL providing in
   * parameter.
   *
   * MDN
   */
  def assign(url: js.String): Unit = ???

}


class PerformanceEntry extends js.Object {
  var name: js.String = _
  var startTime: js.Number = _
  var duration: js.Number = _
  var entryType: js.String = _
}


/**
 * The DOM UIEvent represents simple user interface events.
 *
 * MDN
 */
class UIEvent extends Event {
  /**
   * Detail about the event, depending on the type of event. Read only.
   *
   * MDN
   */
  val detail: js.Number = ???
  /**
   * A view which generated the event. Read only.
   *
   * MDN
   */
  val view: Window = ???

  def initUIEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number): Unit = ???
}


/**
 * The DOM WheelEvent represents events that occur due to the user moving a mouse wheel
 * or similar input device.
 *
 * MDN
 */
class WheelEvent extends MouseEvent {
  /**
   * Scroll amount for the z-axis. Read only.
   *
   * MDN
   */
  val deltaZ: js.Number = ???
  /**
   * Horizontal scroll amount. Read only.
   *
   * MDN
   */
  val deltaX: js.Number = ???
  /**
   * Unit of delta values. See Delta modes for a list of permitted values. Read only.
   *
   * MDN
   */
  val deltaMode: js.Number = ???
  var deltaY: js.Number = _

  def initWheelEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, buttonArg: js.Number, relatedTargetArg: EventTarget, modifiersListArg: js.String, deltaXArg: js.Number, deltaYArg: js.Number, deltaZArg: js.Number, deltaMode: js.Number): Unit = ???

  var DOM_DELTA_PIXEL: js.Number = _
  var DOM_DELTA_LINE: js.Number = _
  var DOM_DELTA_PAGE: js.Number = _

  def getCurrentPoint(element: Element): Unit = ???
}

/**
 * The DOM WheelEvent represents events that occur due to the user moving a mouse wheel
 * or similar input device.
 *
 * MDN
 */
object WheelEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  /**
   * The delta values are specified in pixels.
   *
   * MDN
   */
  var DOM_DELTA_PIXEL: js.Number = _
  /**
   * The delta values are specified in lines.
   *
   * MDN
   */
  var DOM_DELTA_LINE: js.Number = _
  /**
   * The delta values are specified in pages.
   *
   * MDN
   */
  var DOM_DELTA_PAGE: js.Number = _
}

/**
 * The Text interface represents the textual content of Element or Attr.  If an
 * element has no markup within its content, it has a single child implementing Text
 * that contains the element's text.  However, if the element contains markup, it is
 * parsed into information items and Text nodes that form its children.
 *
 * MDN
 */
class Text extends CharacterData {
  /**
   * The Text.wholeText read-only property returns all text of all Text nodes
   * logically adjacent to the node. The text is concatenated in document order.  This
   * allows to specify any text node and obtain all adjacent text as a single string.
   *
   * MDN
   */
  var wholeText: js.String = _

  /**
   * The Text.splitText() method breaks the Textnode into two nodes at the specified
   * offset, keeping both nodes in the tree as siblings.
   *
   * MDN
   */
  def splitText(offset: js.Number): Text = ???

  /**
   * The Text.replaceWholeText() method replaces the text of the node and all of its
   * logically adjacent text nodes with the specified text. The replaced nodes are
   * removed, including the current node, unless it was the recipient of the
   * replacement text.
   *
   * MDN
   */
  def replaceWholeText(content: js.String): Text = ???
}


/**
 * The PositionError interface represents the reason of an error occuring when using
 * the geolocating device.
 *
 * MDN
 */
trait PositionError extends js.Object {
  /**
   * Returns an unsigned short representing the error code. The following values are
   * possible: Value Associated constant Description 1 PERMISSION_DENIED The
   * acquisition of the geolocation information failed because the page didn't had the
   * permission to do it. 2 POSITION_UNAVAILABLE The acquisition of the geolocation
   * failed because one or several internal source of position returned an internal
   * error. 3 TIMEOUT The time allowed to acquire the geolocation, defined by
   * PositionOptions.timeout information was reached before the information was
   * obtained.
   *
   * MDN
   */
  var code: js.Number = _
  /**
   * The PositionError.message read-only property returns a human-readable
   * DOMString describing the details of the error.
   *
   * MDN
   */
  var message: js.String = _

  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

/**
 * The PositionError interface represents the reason of an error occuring when using
 * the geolocating device.
 *
 * MDN
 */
object PositionError extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PositionError),List())))) */
  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

class StyleSheetList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): StyleSheet = ???

  def item(): StyleSheet = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): StyleSheet = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: StyleSheet): Unit = ???
}


/**
 * The DOM CustomEvent are events initialized by an application for any purpose.
 *
 * MDN
 */
class CustomEvent extends Event {
  /**
   * The data passed when initializing the event.
   *
   * MDN
   */
  var detail: Object = _

  /**
   * Initializes the event in a manner analogous to the similarly-named method in the
   * DOM Events interfaces.
   *
   * MDN
   */
  def initCustomEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, detailArg: Object): Unit = ???
}


/**
 * The Geolocation interface represents an object able to programmatically obtain
 * the position of the device. It gives Web content access to the location of the
 * device. This allows a Web site or app offer customized results based on the user's
 * location.
 *
 * MDN
 */
trait Geolocation extends js.Object {
  /**
   * The Geolocation.clearWatch() method is used to unregister location/error
   * monitoring handlers previously installed using Geolocation.watchPosition().
   *
   * MDN
   */
  def clearWatch(watchId: js.Number): Unit = ???

  def getCurrentPosition(successCallback: js.Function1[Position, Unit], errorCallback: js.Function1[PositionError, Unit], options: PositionOptions): Unit = ???

  def getCurrentPosition(successCallback: js.Function1[Position, Unit], errorCallback: js.Function1[PositionError, Unit]): Unit = ???

  /**
   * The Geolocation.getCurrentPosition() method is used to get the current position
   * of the device.
   *
   * MDN
   */
  def getCurrentPosition(successCallback: js.Function1[Position, Unit]): Unit = ???

  def watchPosition(successCallback: js.Function1[Position, Unit], errorCallback: js.Function1[PositionError, Unit], options: PositionOptions): js.Number = ???

  def watchPosition(successCallback: js.Function1[Position, Unit], errorCallback: js.Function1[PositionError, Unit]): js.Number = ???

  /**
   * The Geolocation.watchPosition() method is used to register a handler function
   * that will be called automatically each time the position of the device changes. You
   * can also, optionally, specify an error handling callback function.
   *
   * MDN
   */
  def watchPosition(successCallback: js.Function1[Position, Unit]): js.Number = ???
}


/**
 * The History interface allows to manipulate the browser session history, that is
 * the pages visited in the tab or frame that the current page is loaded in.
 *
 * MDN
 */
class History extends js.Object {
  /**
   * The History.length read-only property returns an Integer representing the
   * number of elements in the session history, including the currently loaded page.
   * For example, for a page loaded in a new tab this property returns 1.
   *
   * MDN
   */
  var length: js.Number = _

  def back(distance: js.Any): Unit = ???

  /**
   * Goes to the previous page in session history, the same action as when the user clicks
   * the browser's Back button. Equivalent to history.go(-1). Note: Calling this
   * method to go back beyond the first page in the session history has no effect and
   * doesn't raise an exception.
   *
   * MDN
   */
  def back(): Unit = ???

  def forward(distance: js.Any): Unit = ???

  /**
   * Goes to the next page in session history, the same action as when the user clicks the
   * browser's Forward button; this is equivalent to history.go(1). Note: Calling
   * this method to go back beyond the last page in the session history has no effect and
   * doesn't raise an exception.
   *
   * MDN
   */
  def forward(): Unit = ???

  def go(delta: js.Any): Unit = ???

  /**
   * Loads a page from the session history, identified by its relative location to the
   * current page, for example -1 for the previous page or 1 for the next page. When
   * integerDelta is out of bounds (e.g. -1 when there are no previously visited pages in
   * the session history), the method doesn't do anything and doesn't raise an
   * exception. Calling go() without parameters or with a non-integer argument has no
   * effect (unlike Internet Explorer, which supports string URLs as the argument).
   *
   * MDN
   */
  def go(): Unit = ???

  /**
   * Returns an any value representing the state at the top of the history stack. This is a
   * way to look at the state without having to wait for a popstate event.
   *
   * MDN
   */
  var state: js.Any = _

  def replaceState(statedata: js.Any, title: js.String, url: js.String): Unit = ???

  /**
   * Updates the most recent entry on the history stack to have the specified data,
   * title, and, if provided, URL. The data is treated as opaque by the DOM; you may
   * specify any JavaScript object that can be serialized.  Note that Firefox
   * currently ignores the title parameter; for more information, see manipulating
   * the browser history. Note: In Gecko 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey
   * 2.1) through Gecko 5.0 (Firefox 5.0 / Thunderbird 5.0 / SeaMonkey 2.2), the passed
   * object is serialized using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird
   * 6.0 / SeaMonkey 2.3), the object is serialized using the structured clone
   * algorithm. This allows a wider variety of objects to be safely passed.
   *
   * MDN
   */
  def replaceState(statedata: js.Any, title: js.String): Unit = ???

  def pushState(statedata: js.Any, title: js.String, url: js.String): Unit = ???

  /**
   * Pushes the given data onto the session history stack with the specified title and,
   * if provided, URL. The data is treated as opaque by the DOM; you may specify any
   * JavaScript object that can be serialized.  Note that Firefox currently ignores
   * the title parameter; for more information, see manipulating the browser history.
   * Note: In Gecko 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey 2.1) through Gecko 5.0
   * (Firefox 5.0 / Thunderbird 5.0 / SeaMonkey 2.2), the passed object is serialized
   * using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird 6.0 / SeaMonkey 2.3),
   * the object is serialized using the structured clone algorithm. This allows a wider
   * variety of objects to be safely passed.
   *
   * MDN
   */
  def pushState(statedata: js.Any, title: js.String): Unit = ???
}


/**
 * The TimeRanges interface is used to represent a set of time ranges, primarily for
 * the purpose of tracking which portions of media have been buffered when loading it
 * for use by the <audio> and <video> elements.
 *
 * MDN
 */
class TimeRanges extends js.Object {
  /**
   * Returns the number of ranges in the object.
   *
   * MDN
   */
  var length: js.Number = _

  /**
   * Returns the time for the start of the range with the specified index.
   *
   * MDN
   */
  def start(index: js.Number): js.Number = ???

  /**
   * Returns the time offset at which a specified time range ends.
   *
   * MDN
   */
  def end(index: js.Number): js.Number = ???
}


class BeforeUnloadEvent extends Event {
  var returnValue: js.String = _
}


/**
 * This chapter describes the DOM Event Model. The Event interface itself is
 * described, as well as the interfaces for event registration on nodes in the DOM, and
 * event listeners, and several longer examples that show how the various event
 * interfaces relate to one another.
 *
 * MDN
 */
class Event extends js.Object {
  /**
   * Returns the time (in milliseconds since the epoch) at which the event was created.
   *
   * MDN
   */
  var timeStamp: js.Number = _
  /**
   * Returns a boolean indicating whether or not event.preventDefault() was called on
   * the event.
   *
   * MDN
   */
  var defaultPrevented: js.Boolean = _
  /**
   * Indicates whether or not the event was initiated by the browser (after a user click
   * for instance) or by a script (using an event creation method, like
   * event.initEvent)
   *
   * MDN
   */
  var isTrusted: js.Boolean = _
  /**
   * Identifies the current target for the event, as the event traverses the DOM. It
   * always refers to the element the event handler has been attached to as opposed to
   * event.target which identifies the element on which the event occurred.
   *
   * MDN
   */
  var currentTarget: EventTarget = _
  /**
   * A boolean indicating whether the bubbling of the event has been canceled or not.
   *
   * MDN
   */
  var cancelBubble: js.Boolean = _
  /**
   * This property of event objects is the object the event was dispatched on. It is
   * different than event.currentTarget when the event handler is called in bubbling
   * or capturing phase of the event.
   *
   * MDN
   */
  var target: EventTarget = _
  /**
   * Indicates which phase of the event flow is currently being evaluated.
   *
   * MDN
   */
  var eventPhase: js.Number = _
  /**
   * A boolean indicating whether the event is cancelable.
   *
   * MDN
   */
  var cancelable: js.Boolean = _
  var `type`: js.String = _
  var srcElement: Element = _
  /**
   * A boolean indicating whether the event bubbles up through the DOM or not.
   *
   * MDN
   */
  var bubbles: js.Boolean = _

  /**
   * The initEvent method is used to initialize the value of an event created using
   * document.createEvent.
   *
   * MDN
   */
  def initEvent(eventTypeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean): Unit = ???

  /**
   * Stops the propagation of events further along in the DOM.
   *
   * MDN
   */
  def stopPropagation(): Unit = ???

  /**
   * For this particular event, no other listener will be called. Neither those
   * attached on the same element, nor those attached on elements which will be
   * traversed later (in capture phase, for instance)
   *
   * MDN
   */
  def stopImmediatePropagation(): Unit = ???

  /**
   * Cancels the event if it is cancelable, without stopping further propagation of the
   * event.
   *
   * MDN
   */
  def preventDefault(): Unit = ???

  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

/**
 * This chapter describes the DOM Event Model. The Event interface itself is
 * described, as well as the interfaces for event registration on nodes in the DOM, and
 * event listeners, and several longer examples that show how the various event
 * interfaces relate to one another.
 *
 * MDN
 */
object Event extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Event),List())))) */
  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

/**
 * The ImageData interface represents the underlying pixel data of an area of a
 * <canvas> element. It is created using creators on the CanvasRenderingContext2D
 * object associated with the canvas createImageData() and getImageData()). It can
 * also be used to set a part of the canvas (like with putImageData()).
 *
 * MDN
 */
class ImageData extends js.Object {
  /**
   * Is an unsigned long representing the actual width, in pixels, of the ImageData.
   *
   * MDN
   */
  var width: js.Number = _
  /**
   * Is a Uint8ClampedArray representing a one-dimensional array containing the data
   * in the RGBA order, with integer values between 0 and 255 (included).
   *
   * MDN
   */
  var data: js.Array[js.Number] = _
  /**
   * Is an unsigned long representing the actual height, in pixels, of the ImageData.
   *
   * MDN
   */
  var height: js.Number = _
}


trait ErrorEventHandler extends js.Object {
  def apply(event: Event, source: js.String, fileno: js.Number, columnNumber: js.Number): Unit = ???
}

/**
 * A collection of nodes returned by Node.attributes (also potentially for
 * DocumentType.entities, DocumentType.notations). NamedNodeMaps are not in any
 * particular order (unlike NodeList, although they may be accessed by an index as in
 * an array (they may also be accessed with the item method). A NamedNodeMap object are
 * live and will thus be auto-updated if changes are made to their contents internally
 * or elsewhere.
 *
 * MDN
 */
class NamedNodeMap extends js.Object {
  var length: js.Number = _

  def removeNamedItemNS(namespaceURI: js.String, localName: js.String): Attr = ???

  def item(index: js.Number): Attr = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): Attr = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Attr): Unit = ???

  def removeNamedItem(name: js.String): Attr = ???

  def getNamedItem(name: js.String): Attr = ???

  def setNamedItem(arg: Attr): Attr = ???

  def getNamedItemNS(namespaceURI: js.String, localName: js.String): Attr = ???

  def setNamedItemNS(arg: Attr): Attr = ???
}


class MediaList extends js.Object {
  var length: js.Number = _
  var mediaText: js.String = _

  def deleteMedium(oldMedium: js.String): Unit = ???

  def appendMedium(newMedium: js.String): Unit = ???

  def item(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???

}


/**
 * A processing instruction provides an opportunity for application-specific
 * instructions to be embedded within XML and which can be ignored by XML processors
 * which do not support processing their instructions (outside of their having a
 * place in the DOM).
 *
 * MDN
 */
class ProcessingInstruction extends Node {
  var target: js.String = _
  var data: js.String = _
}


class TextEvent extends UIEvent {
  var inputMethod: js.Number = _
  var data: js.String = _
  var locale: js.String = _

  def initTextEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, dataArg: js.String, inputMethod: js.Number, locale: js.String): Unit = ???

  var DOM_INPUT_METHOD_KEYBOARD: js.Number = _
  var DOM_INPUT_METHOD_DROP: js.Number = _
  var DOM_INPUT_METHOD_IME: js.Number = _
  var DOM_INPUT_METHOD_SCRIPT: js.Number = _
  var DOM_INPUT_METHOD_VOICE: js.Number = _
  var DOM_INPUT_METHOD_UNKNOWN: js.Number = _
  var DOM_INPUT_METHOD_PASTE: js.Number = _
  var DOM_INPUT_METHOD_HANDWRITING: js.Number = _
  var DOM_INPUT_METHOD_OPTION: js.Number = _
  var DOM_INPUT_METHOD_MULTIMODAL: js.Number = _
}

object TextEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextEvent),List())))) */
  var DOM_INPUT_METHOD_KEYBOARD: js.Number = _
  var DOM_INPUT_METHOD_DROP: js.Number = _
  var DOM_INPUT_METHOD_IME: js.Number = _
  var DOM_INPUT_METHOD_SCRIPT: js.Number = _
  var DOM_INPUT_METHOD_VOICE: js.Number = _
  var DOM_INPUT_METHOD_UNKNOWN: js.Number = _
  var DOM_INPUT_METHOD_PASTE: js.Number = _
  var DOM_INPUT_METHOD_HANDWRITING: js.Number = _
  var DOM_INPUT_METHOD_OPTION: js.Number = _
  var DOM_INPUT_METHOD_MULTIMODAL: js.Number = _
}

/**
 * The DocumentFragment interface represents a minimal document object that has no
 * parent. It is used as a light-weight version of Document to store well-formed or
 * potentially non-well-formed fragments of XML.
 *
 * MDN
 */
class DocumentFragment extends Node with NodeSelector {
}


/**
 * The Position interface represents the position of the concerned device at a given
 * time. The position, represented by a Coordinates object, comprehends the 2D
 * position of the device, on a spheroid representing the Earth, but also its altitude
 * and its speed.
 *
 * MDN
 */
trait Position extends js.Object {
  /**
   * The Position.timestamp read-only property, a DOMTimeStamp object, represents
   * the date and the time of the creation of the Position object it belongs to. The
   * precision is to the millisecond.
   *
   * MDN
   */
  var timestamp: js.Number = _
  /**
   * The Position.coords read-only property, a Coordinates object, represents a
   * geographic attitude: it contains the location, that is longitude and latitude on
   * the Earth, the altitude, and the speed of the object concerned, regrouped inside
   * the returned value. It also contains accuracy information about these values.
   *
   * MDN
   */
  var coords: Coordinates = _
}


class PerformanceMark extends PerformanceEntry {
}

/**
 * DOMParser can parse XML or HTML source stored in a string into a DOM Document.
 * DOMParser is specified in DOM Parsing and Serialization.
 *
 * MDN
 */
class DOMParser extends js.Object {
  def parseFromString(source: js.String, mimeType: js.String): Document = ???
}


/**
 * An object implementing the StyleSheet interface represents a single style sheet.
 * CSS style sheets will further implement the more specialized CSSStyleSheet
 * interface.
 *
 * MDN
 */
class StyleSheet extends js.Object {
  /**
   * Is a Boolean representing whether the current stylesheet has been applied or not.
   *
   * MDN
   */
  var disabled: js.Boolean = _
  /**
   * ownerNode returns the node that associates this style sheet with the document.
   *
   * MDN
   */
  var ownerNode: Node = _
  /**
   * Returns a StyleSheet including this one, if any; returns null if there aren't any.
   *
   * MDN
   */
  var parentStyleSheet: StyleSheet = _
  /**
   * Returns a MediaList representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  var media: MediaList = _
  var `type`: js.String = _
  /**
   * Returns a DOMString representing the advisory title of the current style sheet.
   *
   * MDN
   */
  var title: js.String = _
}


/**
 * NodeList objects are collections of nodes such as those returned by
 * Node.childNodes and the querySelectorAll method.
 *
 * MDN
 */
class NodeList extends js.Object {
  var length: js.Number = _

  /**
   * Returns a node from a NodeList by index.
   *
   * MDN
   */
  def item(index: js.Number): Node = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): Node = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Node): Unit = ???
}


trait NodeListOf[TNode <: Node] extends NodeList {
  override def item(index: js.Number): TNode = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  override def apply(index: js.Number): TNode = ???

}

class XMLSerializer extends js.Object {
  def serializeToString(target: Node): js.String = ???
}


class PerformanceMeasure extends PerformanceEntry {
}


/**
 * A NodeFilter interface represents an object used to filter the nodes in a
 * NodeIterator or TreeWalker. They don't know anything about the DOM or how to
 * traverse nodes; they just know how to evaluate a single node against the provided
 * filter.
 *
 * MDN
 */
class NodeFilter extends js.Object {
  /**
   * Returns an unsigned short that will be used to tell if a given Node must be accepted or
   * not by the NodeIterator or TreeWalker iteration algorithm. This method is
   * expected to be written by the user of a NodeFilter. Possible return values are:
   * Constant Description FILTER_ACCEPT Value returned by the
   * NodeFilter.acceptNode() method when a node should be accepted. FILTER_REJECT
   * Value to be returned by the NodeFilter.acceptNode() method when a node should be
   * rejected. The children of rejected nodes are not visited by the NodeIterator or
   * TreeWalker object; this value is treated as "skip this node and all its children".
   * FILTER_SKIP Value to be returned by NodeFilter.acceptNode() for nodes to be
   * skipped by the NodeIterator or TreeWalker object. The children of skipped nodes
   * are still considered. This is treated as "skip this node but not its children".
   *
   * MDN
   */
  def acceptNode(n: Node): js.Number = ???

  var SHOW_ENTITY_REFERENCE: js.Number = _
  var SHOW_NOTATION: js.Number = _
  var SHOW_ENTITY: js.Number = _
  var SHOW_DOCUMENT: js.Number = _
  var SHOW_PROCESSING_INSTRUCTION: js.Number = _
  var FILTER_REJECT: js.Number = _
  var SHOW_CDATA_SECTION: js.Number = _
  var FILTER_ACCEPT: js.Number = _
  var SHOW_ALL: js.Number = _
  var SHOW_DOCUMENT_TYPE: js.Number = _
  var SHOW_TEXT: js.Number = _
  var SHOW_ELEMENT: js.Number = _
  var SHOW_COMMENT: js.Number = _
  var FILTER_SKIP: js.Number = _
  var SHOW_ATTRIBUTE: js.Number = _
  var SHOW_DOCUMENT_FRAGMENT: js.Number = _
}

/**
 * A NodeFilter interface represents an object used to filter the nodes in a
 * NodeIterator or TreeWalker. They don't know anything about the DOM or how to
 * traverse nodes; they just know how to evaluate a single node against the provided
 * filter.
 *
 * MDN
 */
object NodeFilter extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeFilter),List())))) */
  var SHOW_ENTITY_REFERENCE: js.Number = _
  var SHOW_NOTATION: js.Number = _
  var SHOW_ENTITY: js.Number = _
  var SHOW_DOCUMENT: js.Number = _
  var SHOW_PROCESSING_INSTRUCTION: js.Number = _
  /**
   * Value to be returned by the NodeFilter.acceptNode() method when a node should be
   * rejected. The children of rejected nodes are not visited by the NodeIterator or
   * TreeWalker object; this value is treated as "skip this node and all its children".
   *
   * MDN
   */
  var FILTER_REJECT: js.Number = _
  var SHOW_CDATA_SECTION: js.Number = _
  /**
   * Value returned by the NodeFilter.acceptNode() method when a node should be
   * accepted.
   *
   * MDN
   */
  var FILTER_ACCEPT: js.Number = _
  var SHOW_ALL: js.Number = _
  var SHOW_DOCUMENT_TYPE: js.Number = _
  var SHOW_TEXT: js.Number = _
  var SHOW_ELEMENT: js.Number = _
  var SHOW_COMMENT: js.Number = _
  /**
   * Value to be returned by NodeFilter.acceptNode() for nodes to be skipped by the
   * NodeIterator or TreeWalker object. The children of skipped nodes are still
   * considered. This is treated as "skip this node but not its children".
   *
   * MDN
   */
  var FILTER_SKIP: js.Number = _
  var SHOW_ATTRIBUTE: js.Number = _
  var SHOW_DOCUMENT_FRAGMENT: js.Number = _
}

class MediaError extends js.Object {
  var code: js.Number = _
  var MEDIA_ERR_ABORTED: js.Number = _
  var MEDIA_ERR_NETWORK: js.Number = _
  var MEDIA_ERR_SRC_NOT_SUPPORTED: js.Number = _
  var MEDIA_ERR_DECODE: js.Number = _
  var msExtendedCode: js.Number = _
}

object MediaError extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaError),List())))) */
  var MEDIA_ERR_ABORTED: js.Number = _
  var MEDIA_ERR_NETWORK: js.Number = _
  var MEDIA_ERR_SRC_NOT_SUPPORTED: js.Number = _
  var MEDIA_ERR_DECODE: js.Number = _
}

/**
 * The Comment interface represents textual notations within markup; although it is
 * generally not visually shown, such comments are available to be read in the source
 * view. Comments are represented in HTML and XML as content between '<!--' and '-->'.
 * In XML, the character sequence '--' cannot be used within a comment.
 *
 * MDN
 */
class Comment extends CharacterData {
  var text: js.String = _
}


class PerformanceResourceTiming extends PerformanceEntry {
  var redirectStart: js.Number = _
  var redirectEnd: js.Number = _
  var domainLookupEnd: js.Number = _
  var responseStart: js.Number = _
  var domainLookupStart: js.Number = _
  var fetchStart: js.Number = _
  var requestStart: js.Number = _
  var connectEnd: js.Number = _
  var connectStart: js.Number = _
  var initiatorType: js.String = _
  var responseEnd: js.Number = _
}


/**
 * The CanvasPattern interface represents an opaque object describing a pattern,
 * based on a image, a canvas or a video, created by the
 * CanvasRenderingContext2D.createPattern() method.
 *
 * MDN
 */
class CanvasPattern extends js.Object {
}


/**
 * A StorageEvent is sent to a window when a storage area changes.
 *
 * MDN
 */
class StorageEvent extends Event {
  /**
   * The original value of the key. The oldValue is null when the change has been invoked
   * by storage clear() method or the key has been newly added and therefor doesn't have
   * any previous value. Read only.
   *
   * MDN
   */
  val oldValue: js.Any = ???
  /**
   * The new value of the key. The newValue is null when the change has been invoked by
   * storage clear() method or the key has been removed from the storage. Read only.
   *
   * MDN
   */
  val newValue: js.Any = ???
  /**
   * The URL of the document whose key changed. Read only.
   *
   * MDN
   */
  val url: js.String = ???
  /**
   * Represents the Storage object that was affected. Read only.
   *
   * MDN
   */
  val storageArea: Storage = ???
  /**
   * Represents the key changed. The key attribute is null when the change is caused by
   * the storage clear() method. Read only.
   *
   * MDN
   */
  val key: js.String = ???

  /**
   * Initializes the event in a manner analogous to the similarly-named method in the
   * DOM Events interfaces.
   *
   * MDN
   */
  def initStorageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, keyArg: js.String, oldValueArg: js.Any, newValueArg: js.Any, urlArg: js.String, storageAreaArg: Storage): Unit = ???
}


/**
 * The CharacterData abstract interface represents a Node object that contains
 * characters. This is an abstract interface, meaning there aren't any object of type
 * CharacterData: it is implemented by other interfaces, like Text, Comment, or
 * ProcessingInstruction which aren't abstract.
 *
 * MDN
 */
class CharacterData extends Node {
  /**
   * Returns an unsigned long representing the size of the string contained in
   * CharacterData.data.
   *
   * MDN
   */
  var length: js.Number = _
  /**
   * Is a DOMString representing the textual data contained in this object.
   *
   * MDN
   */
  var data: js.String = _

  /**
   * Removes the specified amount of characters, starting at the specified offset,
   * from the CharacterData.data string; when this method returns, data contains the
   * shortened DOMString.
   *
   * MDN
   */
  def deleteData(offset: js.Number, count: js.Number): Unit = ???

  /**
   * Replaces the specified amount of characters, starting at the specified offset,
   * with the specified DOMString; when this method returns, data contains the
   * modified DOMString.
   *
   * MDN
   */
  def replaceData(offset: js.Number, count: js.Number, arg: js.String): Unit = ???

  /**
   * Appends the given DOMString to the CharacterData.data string; when this method
   * returns, data contains the concatenated DOMString.
   *
   * MDN
   */
  def appendData(arg: js.String): Unit = ???

  /**
   * Inserts the specified characters, at the specified offset, in the
   * CharacterData.data string; when this method returns, data contains the modified
   * DOMString.
   *
   * MDN
   */
  def insertData(offset: js.Number, arg: js.String): Unit = ???

  /**
   * Returns a DOMString containing the part of CharacterData.data of the specified
   * length and starting at the specified offset.
   *
   * MDN
   */
  def substringData(offset: js.Number, count: js.Number): js.String = ???
}


/**
 * The DOMException interface represents an anormal event happening when a method or
 * a property is used.
 *
 * MDN
 */
class DOMException extends js.Object {
  /**
   * Readonly short. Returns one of the exception code constants (see below).
   * Deprecated use DOMError.name instead.
   *
   * MDN
   */
  var code: js.Number = _
  var message: js.String = _

  var HIERARCHY_REQUEST_ERR: js.Number = _
  var NO_MODIFICATION_ALLOWED_ERR: js.Number = _
  var INVALID_MODIFICATION_ERR: js.Number = _
  var NAMESPACE_ERR: js.Number = _
  var INVALID_CHARACTER_ERR: js.Number = _
  var TYPE_MISMATCH_ERR: js.Number = _
  var ABORT_ERR: js.Number = _
  var INVALID_STATE_ERR: js.Number = _
  var SECURITY_ERR: js.Number = _
  var NETWORK_ERR: js.Number = _
  var WRONG_DOCUMENT_ERR: js.Number = _
  var QUOTA_EXCEEDED_ERR: js.Number = _
  var INDEX_SIZE_ERR: js.Number = _
  var DOMSTRING_SIZE_ERR: js.Number = _
  var SYNTAX_ERR: js.Number = _
  var SERIALIZE_ERR: js.Number = _
  var VALIDATION_ERR: js.Number = _
  var NOT_FOUND_ERR: js.Number = _
  var URL_MISMATCH_ERR: js.Number = _
  var PARSE_ERR: js.Number = _
  var NO_DATA_ALLOWED_ERR: js.Number = _
  var NOT_SUPPORTED_ERR: js.Number = _
  var INVALID_ACCESS_ERR: js.Number = _
  var INUSE_ATTRIBUTE_ERR: js.Number = _
  var name: js.String = _
  var INVALID_NODE_TYPE_ERR: js.Number = _
  var DATA_CLONE_ERR: js.Number = _
  var TIMEOUT_ERR: js.Number = _
}

/**
 * The DOMException interface represents an anormal event happening when a method or
 * a property is used.
 *
 * MDN
 */
object DOMException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMException),List())))) */
  var HIERARCHY_REQUEST_ERR: js.Number = _
  var NO_MODIFICATION_ALLOWED_ERR: js.Number = _
  var INVALID_MODIFICATION_ERR: js.Number = _
  var NAMESPACE_ERR: js.Number = _
  var INVALID_CHARACTER_ERR: js.Number = _
  var TYPE_MISMATCH_ERR: js.Number = _
  var ABORT_ERR: js.Number = _
  var INVALID_STATE_ERR: js.Number = _
  var SECURITY_ERR: js.Number = _
  var NETWORK_ERR: js.Number = _
  var WRONG_DOCUMENT_ERR: js.Number = _
  var QUOTA_EXCEEDED_ERR: js.Number = _
  var INDEX_SIZE_ERR: js.Number = _
  var DOMSTRING_SIZE_ERR: js.Number = _
  var SYNTAX_ERR: js.Number = _
  var SERIALIZE_ERR: js.Number = _
  var VALIDATION_ERR: js.Number = _
  var NOT_FOUND_ERR: js.Number = _
  var URL_MISMATCH_ERR: js.Number = _
  var PARSE_ERR: js.Number = _
  var NO_DATA_ALLOWED_ERR: js.Number = _
  var NOT_SUPPORTED_ERR: js.Number = _
  var INVALID_ACCESS_ERR: js.Number = _
  var INUSE_ATTRIBUTE_ERR: js.Number = _
}

/**
 * This type represents a DOM element's attribute as an object. In most DOM methods,
 * you will probably directly retrieve the attribute as a string (e.g.,
 * Element.getAttribute(), but certain functions (e.g.,
 * Element.getAttributeNode()) or means of iterating give Attr types.
 *
 * MDN
 */
class Attr extends Node {
  var expando: js.Boolean = _
  /**
   * This property now always returns true.
   *
   * MDN
   */
  var specified: js.Boolean = _
  /**
   * Since you get an Attr object from an Element, you should already know the associated
   * element.
   *
   * MDN
   */
  var ownerElement: Element = _
  var value: js.String = _
  var name: js.String = _
}


/**
 * The PerformanceNavigation interface represents information about how the
 * navigtion to the current document was done.
 *
 * MDN
 */
class PerformanceNavigation extends js.Object {
  /**
   * The PerformanceNavigation.redirectCount read-only property returns an
   * unsigned short representing the number of REDIRECTs done before reaching the
   * page.
   *
   * MDN
   */
  var redirectCount: js.Number = _
  var `type`: js.Number = _

  /**
   * Is a jsonizer returning a json object representing the PerformanceNavigation
   * object.
   *
   * MDN
   */
  def toJSON(): js.Dynamic = ???

  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}

/**
 * The PerformanceNavigation interface represents information about how the
 * navigtion to the current document was done.
 *
 * MDN
 */
object PerformanceNavigation extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceNavigation),List())))) */
  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}


/**
 * The LinkStyle interface allows to access the associated CSS style sheet of a node.
 *
 * MDN
 */
trait LinkStyle extends js.Object {
  var styleSheet: StyleSheet = _
  /**
   * Returns the StyleSheet object associated with the given element, or null if there
   * is none.
   *
   * MDN
   */
  var sheet: StyleSheet = _
}

class ClientRectList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): ClientRect = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): ClientRect = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: ClientRect): Unit = ???
}


trait External extends js.Object {
}


trait ObjectURLOptions extends js.Object {
  var oneTimeOnly: js.Boolean = _
}

/**
 * The ErrorEvent interface represents events providing information related to
 * errors in scripts or in files.
 *
 * MDN
 */
trait ErrorEvent extends Event {
  var colno: js.Number = _
  /**
   * Is a DOMString containing the name of the script file in which the error occurred.
   *
   * MDN
   */
  var filename: js.String = _
  /**
   * Is an integer containing the line number of the script file on which the error
   * occurred.
   *
   * MDN
   */
  var lineno: js.Number = _
  /**
   * Is a DOMString containing a human-readable error message describing the problem.
   *
   * MDN
   */
  var message: js.String = _

  def initErrorEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, messageArg: js.String, filenameArg: js.String, linenoArg: js.Number): Unit = ???
}


trait TrackEvent extends Event {
  var track: js.Any = _
}


trait TextTrackCue extends EventTarget {
  var onenter: js.Function1[Event, _] = _
  var track: TextTrack = _
  var endTime: js.Number = _
  var text: js.String = _
  var pauseOnExit: js.Boolean = _
  var id: js.String = _
  var startTime: js.Number = _
  var onexit: js.Function1[Event, _] = _

  def getCueAsHTML(): DocumentFragment = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * This type represents a set of space-separated tokens. Commonly returned by
 * HTMLElement.classList, HTMLLinkElement.relList,
 * HTMLAnchorElement.relList or HTMLAreaElement.relList. It is indexed
 * beginning with 0 as with JavaScript arrays. DOMTokenList is always
 * case-sensitive.
 *
 * MDN
 */
trait DOMTokenList extends js.Object {
  var length: js.Number = _

  def contains(token: js.String): js.Boolean = ???

  def remove(token: js.String): Unit = ???

  def toggle(token: js.String): js.Boolean = ???

  def add(token: js.String): Unit = ???

  def item(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???

}


trait MessageChannel extends js.Object {
  var port2: MessagePort = _
  var port1: MessagePort = _
}


/**
 * The TransitionEvent interface represents events providing information related
 * to transitions.
 *
 * MDN
 */
trait TransitionEvent extends Event {
  var propertyName: js.String = _
  /**
   * The TransionnEvent.elapsedTime read-only property is a float giving the amount
   * of time the animation has been running, in seconds, when this event fired. This
   * value is not affected by the transition-delay property.
   *
   * MDN
   */
  var elapsedTime: js.Number = _

  /**
   * The TransitionEvent.initTransitionEvent() method Initializes a transition
   * event created using the deprecated Document.createEvent("TransitionEvent")
   * method.
   *
   * MDN
   */
  def initTransitionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, propertyNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}


/**
 * A MediaQueryList object maintains a list of media queries on a document, and
 * handles sending notifications to listeners when the media queries on the document
 * change.
 *
 * MDN
 */
trait MediaQueryList extends js.Object {
  /**
   * true if the document currently matches the media query list; otherwise false. Read
   * only.
   *
   * MDN
   */
  var matches: js.Boolean = _
  var media: js.String = _

  /**
   * Adds a new listener to the media query list. If the specified listener is already in
   * the list, this method has no effect.
   *
   * MDN
   */
  def addListener(listener: MediaQueryListListener): Unit = ???

  /**
   * Removes a listener from the media query list. Does nothing if the specified
   * listener isn't already in the list.
   *
   * MDN
   */
  def removeListener(listener: MediaQueryListListener): Unit = ???
}


/**
 * This interface describes an error object that contains an error name.
 *
 * MDN
 */
trait DOMError extends js.Object {
  /**
   * Readonly DOMString. Returns one of the error type names (see below).
   *
   * MDN
   */
  var name: js.String = _

}


/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed.
 * This is delivered to the listener indicated by the WebSocket object's onclose
 * attribute.
 *
 * MDN
 */
trait CloseEvent extends Event {
  /**
   * Indicates whether or not the connection was cleanly closed.
   *
   * MDN
   */
  var wasClean: js.Boolean = _
  /**
   * A string indicating the reason the server closed the connection. This is specific
   * to the particular server and sub-protocol.
   *
   * MDN
   */
  var reason: js.String = _
  /**
   * The WebSocket connection close code provided by the server. See Close codes for
   * possible values.
   *
   * MDN
   */
  var code: js.Number = _

  def initCloseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, wasCleanArg: js.Boolean, codeArg: js.Number, reasonArg: js.String): Unit = ???
}


/**
 * The WebSocket object provides the API for creating and managing a WebSocket
 * connection to a server, as well as for sending and receiving data on the connection.
 *
 * MDN
 */
class WebSocket protected() extends EventTarget {
  def this(url: js.String) = this()

  def this(url: js.String, prototcol: js.String) = this()

  def this(url: js.String, prototcol: js.Array[js.String]) = this()

  /**
   * A string indicating the name of the sub-protocol the server selected; this will be
   * one of the strings specified in the protocols parameter when creating the
   * WebSocket object.
   *
   * MDN
   */
  var protocol: js.String = _
  /**
   * The current state of the connection; this is one of the Ready state constants. Read
   * only.
   *
   * MDN
   */
  var readyState: js.Number = _
  /**
   * The number of bytes of data that have been queued using calls to send() but not yet
   * transmitted to the network. This value does not reset to zero when the connection is
   * closed; if you keep calling send(), this will continue to climb. Read only.
   *
   * MDN
   */
  val bufferedAmount: js.Number = ???
  /**
   * An event listener to be called when the WebSocket connection's readyState changes
   * to OPEN; this indicates that the connection is ready to send and receive data. The
   * event is a simple one with the name "open".
   *
   * MDN
   */
  var onopen: js.Function1[Event, Unit] = _
  /**
   * The extensions selected by the server. This is currently only the empty string or a
   * list of extensions as negotiated by the connection.
   *
   * MDN
   */
  var extensions: js.String = _
  /**
   * An event listener to be called when a message is received from the server. The
   * listener receives a MessageEvent named "message".
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, Unit] = _
  /**
   * An event listener to be called when the WebSocket connection's readyState changes
   * to CLOSED. The listener receives a CloseEvent named "close".
   *
   * MDN
   */
  var onclose: js.Function1[CloseEvent, Unit] = _
  /**
   * An event listener to be called when an error occurs. This is a simple event named
   * "error".
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, Unit] = _
  /**
   * A string indicating the type of binary data being transmitted by the connection.
   * This should be either "blob" if DOM Blob objects are being used or "arraybuffer"
   * if ArrayBuffer objects are being used.
   *
   * MDN
   */
  var binaryType: js.String = _
  /**
   * The URL as resolved by the constructor. This is always an absolute URL. Read only.
   *
   * MDN
   */
  val url: js.String = ???

  def close(code: js.Number, reason: js.String): Unit = ???

  def close(code: js.Number): Unit = ???

  /**
   * Closes the WebSocket connection or connection attempt, if any. If the connection
   * is already CLOSED, this method does nothing.
   *
   * MDN
   */
  def close(): Unit = ???

  /**
   * Transmits data to the server over the WebSocket connection.
   *
   * MDN
   */
  def send(data: js.Any): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var OPEN: js.Number = _
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  var CLOSED: js.Number = _
}

/**
 * The WebSocket object provides the API for creating and managing a WebSocket
 * connection to a server, as well as for sending and receiving data on the connection.
 *
 * MDN
 */
object WebSocket extends js.Object {
  /**
   * The connection is open and ready to communicate.
   *
   * MDN
   */
  var OPEN: js.Number = _
  /**
   * The connection is in the process of closing.
   *
   * MDN
   */
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  /**
   * The connection is closed or couldn't be opened.
   *
   * MDN
   */
  var CLOSED: js.Number = _
}

/**
 * The ProgressEvent interface represents events measuring progress of an
 * underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of
 * the underlying resource of an <img>, <audio>, <video>, <style> or <link>).
 *
 * MDN
 */
trait ProgressEvent extends Event {
  /**
   * The ProgressEvent.loaded read-only property is an unsigned long long
   * representing the amount of work already performed by the underlying process. The
   * ratio of work done can be calculated with the property and ProgressEvent.total.
   * When downloading a resource using HTTP, this only represent the part of the content
   * itself, not headers and other overhead.
   *
   * MDN
   */
  var loaded: js.Number = _
  /**
   * The ProgressEvent.lengthComputable read-only property is a Boolean flag
   * indicating if the resource concerned by the ProgressEvent has a length that can be
   * calculated. If not, the ProgressEvent.total property has no significant value.
   *
   * MDN
   */
  var lengthComputable: js.Boolean = _
  /**
   * The ProgressEvent.total read-only property is an unsigned long long
   * representing the total amount of work that the underlying process is in the
   * progress of performing. When downloading a resource using HTTP, this only
   * represent the content itself, not headers and other overhead.
   *
   * MDN
   */
  var total: js.Number = _

  /**
   * The ProgressEvent.initProgressEvent() method Initializes an animation event
   * created using the deprecated Document.createEvent("ProgressEvent") method.
   *
   * MDN
   */
  def initProgressEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, lengthComputableArg: js.Boolean, loadedArg: js.Number, totalArg: js.Number): Unit = ???
}


/**
 * An object of this type is returned by the files property of the HTML input element;
 * this lets you access the list of files selected with the <input type="file">
 * element. It's also used for a list of files dropped into web content when using the
 * drag and drop API; see the DataTransfer object for details on this usage.
 *
 * MDN
 */
trait FileList extends js.Object {
  /**
   * A read-only value indicating the number of files in the list.
   *
   * MDN
   */
  var length: js.Number = _

  /**
   * Returns a File object representing the file at the specified index in the file list.
   *
   * MDN
   */
  def item(index: js.Number): File = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): File = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: File): Unit = ???
}


/**
 * The File interface provides information about -- and access to the contents of --
 * files.
 *
 * MDN
 */
trait File extends Blob {
  /**
   * Returns the last modified date of the file. Files without a known last modified date
   * use the current date instead.
   *
   * MDN
   */
  var lastModifiedDate: js.Any = _
  /**
   * Returns the name of the file. For security reasons, the path is excluded from this
   * property.
   *
   * MDN
   */
  var name: js.String = _
}


/**
 * The URL interface represent an object providing static methods used for creating
 * object URLs.
 *
 * MDN
 */
trait URL extends js.Object {
  /**
   * The URL.revokeObjectURL() static method releases an existing object URL which
   * was previously created by calling window.URL.createObjectURL().  Call this
   * method when you've finished using a object URL, in order to let the browser know it
   * doesn't need to keep the reference to the file any longer.
   *
   * MDN
   */
  def revokeObjectURL(url: js.String): Unit = ???

  def createObjectURL(`object`: js.Any, options: ObjectURLOptions): js.String = ???

  /**
   * The URL.createObjectURL() static method creates a DOMString containing an URL
   * representing the object given in parameter. The URL lifetime is tied to the
   * document in the window on which it was created. The new object URL represents the
   * specified File object or Blob object.
   *
   * MDN
   */
  def createObjectURL(`object`: js.Any): js.String = ???
}

/**
 * XMLHttpRequestEventTarget is the interface that describes the event handlers
 * you can implement in an object that will handle events for an XMLHttpRequest.
 *
 * MDN
 */
trait XMLHttpRequestEventTarget extends EventTarget {
  /**
   * A function that is called periodically with information about the progress of the
   * request.
   *
   * MDN
   */
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  /**
   * The function to call when a request encounters an error.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  /**
   * The function to call when an HTTP request returns after successfully loading
   * content.
   *
   * MDN
   */
  var onload: js.Function1[js.Any, js.Any] = _
  /**
   * A function that is called if the event times out; this only happens if a timeout has
   * been previously established by setting the value of the XMLHttpRequest object's
   * timeout attribute.
   *
   * MDN
   */
  var ontimeout: js.Function1[js.Any, js.Any] = _
  /**
   * The function to call when a request is aborted.
   *
   * MDN
   */
  var onabort: js.Function1[js.Any, js.Any] = _
  /**
   * A function that gets called when the HTTP request first begins loading data.
   *
   * MDN
   */
  var onloadstart: js.Function1[js.Any, js.Any] = _
  /**
   * A function that is called when the load is completed, even if the request failed.
   *
   * MDN
   */
  var onloadend: js.Function1[ProgressEvent, js.Any] = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


trait AudioTrackList extends EventTarget {
  var length: js.Number = _
  var onchange: js.Function1[js.Any, js.Any] = _
  var onaddtrack: js.Function1[TrackEvent, js.Any] = _

  def getTrackById(id: js.String): AudioTrack = ???

  def item(index: js.Number): AudioTrack = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): AudioTrack = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: AudioTrack): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


trait WindowTimersExtension extends js.Object {
  def msSetImmediate(expression: js.Any, args: js.Any*): js.Number = ???

  def clearImmediate(handle: js.Number): Unit = ???

  def msClearImmediate(handle: js.Number): Unit = ???

  def setImmediate(expression: js.Any, args: js.Any*): js.Number = ???
}

/**
 * The AnimationEvent interface represents events providing information related
 * to animations.
 *
 * MDN
 */
trait AnimationEvent extends Event {
  /**
   * The AnimationEvent.animationName read-only property is a DOMString containing
   * the value of the animation-name CSS property associated with the transition.
   *
   * MDN
   */
  var animationName: js.String = _
  /**
   * The AnimationEvent.elapsedTime read-only property is a float giving the amount
   * of time the animation has been running, in seconds, when this event fired,
   * excluding any time the animation was paused. For an "animationstart" event,
   * elapsedTime is 0.0 unless there was a negative value for animation-delay, in which
   * case the event will be fired with elapsedTime containing  (-1 * delay).
   *
   * MDN
   */
  var elapsedTime: js.Number = _

  /**
   * The AnimationEvent.initAnimationEvent() method Initializes an animation
   * event created using the deprecated Document.createEvent("AnimationEvent")
   * method.
   *
   * MDN
   */
  def initAnimationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, animationNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}


trait WindowConsole extends js.Object {
  var console: Console = _
}


trait AudioTrack extends js.Object {
  var kind: js.String = _
  var language: js.String = _
  var id: js.String = _
  var label: js.String = _
  var enabled: js.Boolean = _
}


trait TextTrackCueList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): TextTrackCue = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextTrackCue = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextTrackCue): Unit = ???

  def getCueById(id: js.String): TextTrackCue = ???
}


trait TextTrackList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): TextTrack = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextTrack = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextTrack): Unit = ???
}


/**
 * The console object provides access to the browser's debugging console. The
 * specifics of how it works vary from browser to browser, but there is a de facto set of
 * features that are typically provided.
 *
 * MDN
 */
trait Console extends js.Object {
  /**
   * Outputs an informational message to the Web Console. In Firefox, a small "i" icon is
   * displayed next to these items in the Web Console's log.
   *
   * MDN
   */
  def info(message: js.Any, optionalParams: js.Any*): Unit = ???

  def profile(reportName: js.String): Unit = ???

  def profile(): Unit = ???

  def assert(test: js.Boolean, message: js.String, optionalParams: js.Any*): Unit = ???

  def msIsIndependentlyComposed(element: Element): js.Boolean = ???

  def clear(): Unit = ???

  /**
   * Displays an interactive list of the properties of the specified JavaScript
   * object. The output is presented as a hierarchical listing with disclosure
   * triangles that let you see the contents of child objects.
   *
   * MDN
   */
  def dir(value: js.Any, optionalParams: js.Any*): Unit = ???

  /**
   * Outputs a warning message. You may use string substitution and additional
   * arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def warn(message: js.Any, optionalParams: js.Any*): Unit = ???

  /**
   * Outputs an error message. You may use string substitution and additional
   * arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def error(message: js.Any, optionalParams: js.Any*): Unit = ???

  /**
   * For general output of logging information. You may use string substitution and
   * additional arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def log(message: js.Any, optionalParams: js.Any*): Unit = ???

  def profileEnd(): Unit = ???
}


trait WindowBase64 extends js.Object {
  def btoa(rawString: js.String): js.String = ???

  def atob(encodedString: js.String): js.String = ???
}


/**
 * A type returned by DOMConfiguration.parameterNames which contains a list of
 * DOMString (strings).
 *
 * MDN
 */
trait DOMStringList extends js.Object {
  var length: js.Number = _

  def contains(str: js.String): js.Boolean = ???

  def item(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
}


trait TextTrack extends EventTarget {
  var language: js.String = _
  var mode: js.Any = _
  var readyState: js.Number = _
  var activeCues: TextTrackCueList = _
  var cues: TextTrackCueList = _
  var oncuechange: js.Function1[Event, _] = _
  var kind: js.String = _
  var onload: js.Function1[js.Any, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var label: js.String = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var ERROR: js.Number = _
  var SHOWING: js.Number = _
  var LOADING: js.Number = _
  var LOADED: js.Number = _
  var NONE: js.Number = _
  var HIDDEN: js.Number = _
  var DISABLED: js.Number = _
}

object TextTrack extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrack),List())))) */
  var ERROR: js.Number = _
  var SHOWING: js.Number = _
  var LOADING: js.Number = _
  var LOADED: js.Number = _
  var NONE: js.Number = _
  var HIDDEN: js.Number = _
  var DISABLED: js.Number = _
}

/**
 * A MediaQueryList object maintains a list of media queries on a document, and
 * handles sending notifications to listeners when the media queries on the document
 * change.
 *
 * MDN
 */
trait MediaQueryListListener extends js.Object {
  def apply(mql: MediaQueryList): Unit = ???
}


trait MessagePort extends EventTarget {
  var onmessage: js.Function1[js.Any, js.Any] = _

  def close(): Unit = ???

  def postMessage(message: js.Any, ports: js.Any): Unit = ???

  def postMessage(message: js.Any): Unit = ???

  def start(): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * The FileReader object lets web applications asynchronously read the contents of
 * files (or raw data buffers) stored on the user's computer, using File or Blob
 * objects to specify the file or data to read.
 *
 * MDN
 */
trait FileReader {
  /**
   * A DOMError representing the error that occurred while reading the file.
   *
   * MDN
   */
  var error: DOMError = _

  /**
   * The readAsArrayBuffer method is used to starts reading the contents of the
   * specified Blob or File. When the read operation is finished, the readyState
   * becomes DONE, and the loadend is triggered. At that time, the result attribute
   * contains an ArrayBuffer representing the file's data.
   *
   * MDN
   */
  def readAsArrayBuffer(blob: Blob): Unit = ???

  /**
   * The readAsDataURL method is used to starts reading the contents of the specified
   * Blob or File. When the read operation is finished, the readyState becomes DONE, and
   * the loadend is triggered. At that time, the result attribute contains a data: URL
   * representing the file's data as base64 encoded string.
   *
   * MDN
   */
  def readAsDataURL(blob: Blob): Unit = ???

  def readAsText(blob: Blob, encoding: js.String): Unit = ???

  /**
   * The readAsText method is used to starts reading the contents of the specified Blob
   * or File. When the read operation is finished, the readyState becomes DONE, and the
   * loadend is triggered. At that time, the result attribute contains the contents of
   * the file as a text string.
   *
   * MDN
   */
  def readAsText(blob: Blob): Unit = ???
}


trait BlobPropertyBag extends js.Object {
  var `type`: js.String = _
  var endings: js.String = _
}

/**
 * A Blob object represents a file-like object of immutable, raw data. Blobs
 * represent data that isn't necessarily in a JavaScript-native format. The File
 * interface is based on Blob, inheriting blob functionality and expanding it to
 * support files on the user's system.
 *
 * MDN
 */
class Blob extends js.Object {
  def this(blobParts: js.Array[js.Any], options: BlobPropertyBag) = this()

  def this(blobParts: js.Array[js.Any]) = this()

  var `type`: js.String = _
  /**
   * The size, in bytes, of the data contained in the Blob object.
   *
   * MDN
   */
  var size: js.Number = _

  def msDetachStream(): js.Dynamic = ???

  def slice(start: js.Number, end: js.Number, contentType: js.String): Blob = ???

  def slice(start: js.Number, end: js.Number): Blob = ???

  def slice(start: js.Number): Blob = ???

  /**
   * The slice is used to create a new Blob object containing the data in the specified
   * range of bytes of the source Blob.
   *
   * MDN
   */
  def slice(): Blob = ???

  def close(): Unit = ???

  def msClose(): Unit = ???
}

/**
 * A Blob object represents a file-like object of immutable, raw data. Blobs
 * represent data that isn't necessarily in a JavaScript-native format. The File
 * interface is based on Blob, inheriting blob functionality and expanding it to
 * support files on the user's system.
 *
 * MDN
 */
object Blob extends js.Object {
}

trait ApplicationCache extends EventTarget {
  var status: js.Number = _
  var ondownloading: js.Function1[Event, _] = _
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onupdateready: js.Function1[Event, _] = _
  var oncached: js.Function1[Event, _] = _
  var onobsolete: js.Function1[Event, _] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onchecking: js.Function1[Event, _] = _
  var onnoupdate: js.Function1[Event, _] = _

  def swapCache(): Unit = ???

  def abort(): Unit = ???

  def update(): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var CHECKING: js.Number = _
  var UNCACHED: js.Number = _
  var UPDATEREADY: js.Number = _
  var DOWNLOADING: js.Number = _
  var IDLE: js.Number = _
  var OBSOLETE: js.Number = _
}

object ApplicationCache extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ApplicationCache),List())))) */
  var CHECKING: js.Number = _
  var UNCACHED: js.Number = _
  var UPDATEREADY: js.Number = _
  var DOWNLOADING: js.Number = _
  var IDLE: js.Number = _
  var OBSOLETE: js.Number = _
}

trait FrameRequestCallback extends js.Object {
  def apply(time: js.Number): Unit = ???
}

trait PopStateEvent extends Event {
  var state: js.Any = _

  def initPopStateEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, stateArg: js.Any): Unit = ???
}


trait DOMSettableTokenList extends DOMTokenList {
  var value: js.String = _
}


/**
 * XMLHttpRequest Level 2 adds support for the new FormData interface. FormData
 * objects provide a way to easily construct a set of key/value pairs representing
 * form fields and their values, which can then be easily sent using the
 * XMLHttpRequest send() method.
 *
 * MDN
 */
class FormData extends js.Object {
  def this(form: HTMLFormElement) = this()

  def append(name: js.Any, value: js.Any, blobName: js.String): Unit = ???

  /**
   * Appends a key/value pair to the FormData object.
   *
   * MDN
   */
  def append(name: js.Any, value: js.Any): Unit = ???
}

/**
 * XMLHttpRequest Level 2 adds support for the new FormData interface. FormData
 * objects provide a way to easily construct a set of key/value pairs representing
 * form fields and their values, which can then be easily sent using the
 * XMLHttpRequest send() method.
 *
 * MDN
 */
object FormData extends js.Object {
}


/**
 * The AbstractWorker interface abstracts properties and methods common to all kind
 * of workers, being Worker or SharedWorker.
 *
 * MDN
 */
trait AbstractWorker extends EventTarget {
  /**
   * The AbstractWorker.onerror property represents an EventHandler, that is a
   * function to be called when the error event occurs and bubbles through the Worker.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, js.Any] = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * The DOM ValidityState interface represents the validity states that an element
 * can be in, with respect to constraint validation. Together, they help explain why
 * an element's value fails to validate, if it's not valid.
 *
 * MDN
 */
trait ValidityState extends js.Object {
  /**
   * The element's custom validity message has been set to a non-empty string by calling
   * the element's setCustomValidity() method.
   *
   * MDN
   */
  var customError: js.Boolean = _
  /**
   * The element has a required attribute, but no value.
   *
   * MDN
   */
  var valueMissing: js.Boolean = _
  /**
   * The value does not fit the rules determined by the step attribute (that is, it's not
   * evenly divisible by the step value).
   *
   * MDN
   */
  var stepMismatch: js.Boolean = _
  /**
   * The value is less than the minimum specified by the min attribute.
   *
   * MDN
   */
  var rangeUnderflow: js.Boolean = _
  /**
   * The value is greater than the maximum specified by the max attribute.
   *
   * MDN
   */
  var rangeOverflow: js.Boolean = _
  /**
   * The value is not in the required syntax (when type is email or url).
   *
   * MDN
   */
  var typeMismatch: js.Boolean = _
  /**
   * The value does not match the specified pattern.
   *
   * MDN
   */
  var patternMismatch: js.Boolean = _
  /**
   * The value exceeds the specified maxlength for HTMLInputElement or
   * HTMLTextAreaElement objects. Note: This will never be true in Gecko, because
   * elements' values are prevented from being longer than maxlength.
   *
   * MDN
   */
  var tooLong: js.Boolean = _
  /**
   * The element meets all constraint validations, and is therefore considered to be
   * valid.
   *
   * MDN
   */
  var valid: js.Boolean = _
}


/**
 * The Worker interface represents a background task that can be easily created and
 * can send messages back to their creators. Creating a worker is as simple as calling
 * the Worker() constructor, specifying a script to be run in the worker thread.
 *
 * MDN
 */
class Worker protected() extends AbstractWorker {
  def this(stringUrl: js.String) = this()

  /**
   * The Worker.onmessage property represents an EventHandler, that is a function to
   * be called when the message event occurs. These events are of type MessageEvent and
   * will be called when the worker calls its own postMessage() method: it is the way that
   * a Worker has to give back information to the thread that created it.
   *
   * MDN
   */
  var onmessage: js.Function1[js.Any, js.Any] = _

  def postMessage(message: js.Any, ports: js.Any): Unit = ???

  /**
   * The Worker.postMessage() method sends a message to the worker's inner scope. This
   * accepts a single parameter, which is the data to send to the worker. The data may be
   * any value or JavaScript object handled by the structured clone algorithm, which
   * includes cyclical references.
   *
   * MDN
   */
  def postMessage(message: js.Any): Unit = ???

  /**
   * The Worker.terminate() method immediately terminates the Worker. This does not
   * offer the worker an opportunity to finish its operations; it is simply stopped at
   * once.
   *
   * MDN
   */
  def terminate(): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

/**
 * The Worker interface represents a background task that can be easily created and
 * can send messages back to their creators. Creating a worker is as simple as calling
 * the Worker() constructor, specifying a script to be run in the worker thread.
 *
 * MDN
 */

object Worker extends js.Object {
}

