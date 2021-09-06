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

@js.native
@JSGlobal
class XPathNSResolver extends js.Object {
  def lookupNamespaceURI(prefix: String): String = js.native
}

/** The PositionOptions interface describes the options to use when calling the geolocation backend. The user agent
  * itself doesn't create such an object itself: it is the calling script that create it and use it as a parameter of
  * Geolocation.getCurrentPosition() and Geolocation.watchPosition().
  */
@js.native
@JSGlobal
class PositionOptions extends js.Object {

  /** The PositionOptions.enableHighAccuracy property is a Boolean that indicates the application would like to receive
    * the best possible results. If true and if the device is able to provide a more accurate position, it will do so.
    * Note that this can result in slower response times or increased power consumption (with a GPS chip on a mobile
    * device for example). On the other hand, if false (the default value), the device can take the liberty to save
    * resources by responding more quickly and/or using less power.
    */
  var enableHighAccuracy: Boolean = js.native

  /** The PositionOptions.timeout property is a positive long value representing the maximum length of time (in
    * milliseconds) the device is allowed to take in order to return a position. The default value is Infinity, meaning
    * that getCurrentPosition() won't return until the position is available.
    */
  var timeout: Int = js.native

  /** The PositionOptions.maximumAge property is a positive long value indicating the maximum age in milliseconds of a
    * possible cached position that is acceptable to return. If set to 0, it means that the device cannot use a cached
    * position and must attempt to retrieve the real current position. If set to Infinity the device must return a
    * cached position regardless of its age.
    */
  var maximumAge: Int = js.native
}

/** The NavigatorID interface contains methods and properties related to the identity of the browser.
  *
  * There is no object of type NavigatorID, but other interfaces, like Navigator or WorkerNavigator, implement it.
  */
@js.native
trait NavigatorID extends js.Object {

  /** Returns the version of the browser as a string. It may be either a plain version number, like "5.0", or a version
    * number followed by more detailed information. The HTML5 specification also allows any browser to return "4.0"
    * here, for compatibility reasons.
    */
  def appVersion: String = js.native

  /** Returns the name of the browser. The HTML5 specification also allows any browser to return "Netscape" here, for
    * compatibility reasons.
    */
  def appName: String = js.native

  /** Returns the user agent string for the current browser. */
  def userAgent: String = js.native

  /** Returns a string representing the platform of the browser. */
  def platform: String = js.native
}

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

/** An object of this type can be obtained by calling the Window.performance read-only attribute.
  *
  * An object of this type can be obtained by calling the Window.performance read-only attribute.
  */
@js.native
@JSGlobal
class Performance extends js.Object {

  /** The Performance.navigation read-only property returns a PerformanceNavigation object representing the type of
    * navigation that occurs in the given browsing context, like the amount of redirections needed to fetch the
    * resource.
    */
  def navigation: PerformanceNavigation = js.native

  /** The Performance.timing read-only property returns a PerformanceTiming object containing latency-related
    * performance information.
    */
  def timing: PerformanceTiming = js.native

  def getEntriesByType(entryType: String): js.Dynamic = js.native

  /** Is a jsonizer returning a json object representing the Performance object. */
  def toJSON(): js.Dynamic = js.native

  def getMeasures(measureName: String = js.native): js.Dynamic = js.native

  def clearMarks(markName: String = js.native): Unit = js.native

  def getMarks(markName: String = js.native): js.Dynamic = js.native

  def clearResourceTimings(): Unit = js.native

  def mark(markName: String): Unit = js.native

  def measure(measureName: String, startMarkName: String = js.native, endMarkName: String = js.native): Unit = js.native

  def getEntriesByName(name: String, entryType: String = js.native): js.Dynamic = js.native

  def getEntries(): js.Dynamic = js.native

  def clearMeasures(measureName: String = js.native): Unit = js.native

  def setResourceTimingBufferSize(maxSize: Int): Unit = js.native

  /** Returns a DOMHighResTimeStamp representing the amount of milliseconds elapsed since the start of the navigation,
    * as give by PerformanceTiming.navigationStart to the call of the method.
    */
  def now(): Double = js.native
}

trait CompositionEventInit extends UIEventInit {
  var data: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

/** The DOM CompositionEvent represents events that occur due to the user indirectly entering text. */
@js.native
@JSGlobal
class CompositionEvent(typeArg: String, init: js.UndefOr[CompositionEventInit]) extends UIEvent(typeArg, init) {

  /** For compositionstart events, this is the currently selected text that will be replaced by the string being
    * composed. This value doesn't change even if content changes the selection range; rather, it indicates the string
    * that was selected when composition started. For compositionupdate, this is the string as it stands currently as
    * editing is ongoing. For compositionend events, this is the string as committed to the editor. Read only.
    */
  def data: String = js.native

  /** The locale of current input method (for example, the keyboard layout locale if the composition is associated with
    * IME). Read only.
    */
  def locale: String = js.native
}

@js.native
trait WindowTimers extends js.Object {

  /** Clears the delay set by window.setTimeout(). */
  def clearTimeout(handle: Int): Unit = js.native

  /** Calls a function or executes a code snippet after a specified delay. */
  def setTimeout(handler: js.Function0[Any], timeout: Double): Int = js.native

  /** Cancels repeated action which was set up using setInterval. */
  def clearInterval(handle: Int): Unit = js.native

  /** Calls a function or executes a code snippet repeatedly, with a fixed time delay between each call to that
    * function.
    */
  def setInterval(handler: js.Function0[Any], timeout: Double): Int = js.native
}

/** The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and
  * to register themselves to carry on some activities.
  *
  * A Navigator object can be retrieved using the read-only Window.navigator property.
  */
@js.native
@JSGlobal
class Navigator
    extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with NavigatorGeolocation
    with NavigatorStorageUtils with NavigatorLanguage with NavigatorVibration {

  /** The Clipboard API adds to the Navigator interface the read-only clipboard property, which returns the Clipboard
    * object used to read and write the clipboard's contents. The Clipboard API can be used to implement cut, copy, and
    * paste features within a web application.
    *
    * Use of the asynchronous clipboard read and write methods requires that the user grant the web site or app
    * permission to access the clipboard. This permission must be obtained from the Permissions API using the
    * "clipboard-read" and/or "clipboard-write" permissions.
    */
  def clipboard: Clipboard = js.native

  /** The navigator.sendBeacon() method can be used to asynchronously transfer small HTTP data from the User Agent to a
    * web server.
    *
    * @param url
    *   The url parameter indicates the resolved URL where the data is to be transmitted.
    * @param data
    *   The data parameter is the ArrayBufferView, Blob, DOMString, or FormData data that is to be transmitted.
    */
  def sendBeacon(url: String, data: BodyInit = js.native): Boolean = js.native
}

@js.native
trait NodeSelector extends js.Object {

  /** Returns a list of the elements within the document (using depth-first pre-order traversal of the document's nodes)
    * that match the specified group of selectors.
    */
  def querySelectorAll(selectors: String): NodeList[Element] = js.native

  /** Returns the first element within the document (using depth-first pre-order traversal of the document's nodes) that
    * matches the specified group of selectors.
    */
  def querySelector(selectors: String): Element = js.native
}

@js.native
@JSGlobal
class DOMRect extends js.Object {
  var left: Double = js.native
  var width: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var bottom: Double = js.native
  var height: Double = js.native
}

/** The DOMImplementation interface represent an object providing methods which are not dependent on any particular
  * document. Such an object is returned by the Document.implementation property.
  */
@js.native
@JSGlobal
class DOMImplementation extends js.Object {

  /** « DOM Reference « DOMImplementation */
  def createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType = js.native

  /** « DOM Reference « DOMImplementation */
  def createDocument(namespaceURI: String, qualifiedName: String, doctype: DocumentType): Document = js.native

  def hasFeature(feature: String, version: String): Boolean = js.native

  /** Returns a Boolean indicating if a given feature is supported or not. This function is unreliable and kept for
    * compatibility purpose alone: except for SVG-related queries, it always returns true. Old browsers are very
    * inconsistent in their behavior.
    */
  def hasFeature(feature: String): Boolean = js.native

  /** Creates and returns an HTML Document. */
  def createHTMLDocument(title: String): Document = js.native
}

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

/** The NonDocumentTypeChildNode interface contains methods that are particular to Node objects that can have a parent,
  * but not suitable for DocumentType.
  *
  * NonDocumentTypeChildNode is a raw interface and no object of this type can be created; it is implemented by Element,
  * and CharacterData objects.
  *
  * https://developer.mozilla.org/en-US/docs/Web/API/NonDocumentTypeChildNode
  */
@js.native
trait NonDocumentTypeChildNode extends js.Object {

  /** The previousElementSibling read-only property returns the Element immediately prior to the specified one in its
    * parent's children list, or null if the specified element is the first one in the list.
    */
  def previousElementSibling: Element = js.native

  /** The nextElementSibling read-only property returns the element immediately following the specified one in its
    * parent's children list, or null if the specified element is the last one in the list.
    */
  def nextElementSibling: Element = js.native
}

/** The Element interface represents part of the document. This interface describes methods and properties common to
  * each kind of elements. Specific behaviors are described in the specific interfaces, inheriting from Element: the
  * HTMLElement interface for HTML elements, or the SVGElement interface for SVG elements.
  *
  * https://developer.mozilla.org/en-US/docs/Web/API/element
  */
@js.native
@JSGlobal
abstract class Element extends Node with NodeSelector with ParentNode with NonDocumentTypeChildNode {

  /** Removes the element from the tree it belongs to. */
  def remove(): Unit = js.native

  /** Inserts a set of Node or DOMString objects in the children list of this Element's parent, just before this
    * Element. DOMString objects are inserted as equivalent Text nodes.
    */
  def before(nodes: (Node | String)*): Unit = js.native

  /** Inserts a set of Node or DOMString objects in the children list of the Element's parent, just after the Element.
    * DOMString objects are inserted as equivalent Text nodes.
    */
  def after(nodes: (Node | String)*): Unit = js.native

  /** Inserts a set of Node objects or DOMString objects after the last child of the Element. DOMString objects are
    * inserted as equivalent Text nodes.
    *
    * Differences from Node.appendChild():
    *
    *   - Element.append() allows you to also append DOMString objects, whereas Node.appendChild() only accepts Node
    *     objects.
    *   - Element.append() has no return value, whereas Node.appendChild() returns the appended Node object.
    *   - Element.append() can append several nodes and strings, whereas Node.appendChild() can only append one node.
    */
  def append(nodes: (Node | String)*): Unit = js.native

  /** Inserts a set of Node objects or DOMString objects before the first child of the Element. DOMString objects are
    * inserted as equivalent Text nodes.
    */
  def prepend(nodes: (Node | String)*): Unit = js.native

  /** A DOMString representing the namespace prefix of the element, or null if no prefix is specified. */
  def prefix: String = js.native

  /** scrollTop gets or sets the number of pixels that the content of an element is scrolled upward. */
  var scrollTop: Double = js.native

  /** The width of the left border of an element in pixels. It includes the width of the vertical scrollbar if the text
    * direction of the element is right–to–left and if there is an overflow causing a left vertical scrollbar to be
    * rendered. clientLeft does not include the left margin or the left padding. clientLeft is read-only.
    */
  def clientLeft: Int = js.native

  /** scrollLeft gets or sets the number of pixels that an element's content is scrolled to the left. */
  var scrollLeft: Double = js.native

  /** In XML (and XML-based languages such as XHTML), tagName preserves case. On HTML elements in DOM trees flagged as
    * HTML documents, tagName returns the element name in the uppercase form. The value of tagName is the same as that
    * of nodeName.
    */
  def tagName: String = js.native

  /** clientWidth is the inner width of an element in pixels. It includes padding but not the vertical scrollbar (if
    * present, if rendered), border or margin.
    */
  def clientWidth: Int = js.native

  /** scrollWidth is a read–only property that returns either the width in pixels of the content of an element or the
    * width of the element itself, whichever is greater. If the element is wider than its content area (for example, if
    * there are scroll bars for scrolling through the content), the scrollWidth is larger than the clientWidth.
    */
  def scrollWidth: Int = js.native

  /** Returns the inner height of an element in pixels, including padding but not the horizontal scrollbar height,
    * border, or margin.
    *
    * clientHeight can be calculated as CSS height + CSS padding - height of horizontal scrollbar (if present).
    */
  def clientHeight: Int = js.native

  /** The width of the top border of an element in pixels. It does not include the top margin or padding. clientTop is
    * read-only.
    */
  def clientTop: Int = js.native

  /** Height of the scroll view of an element; it includes the element padding but not its margin. */
  def scrollHeight: Int = js.native

  /** Gets the markup of the element including its content. When used as a setter, replaces the element with nodes
    * parsed from the given string.
    *
    * Supported by FF&gt;10, any Opera, any Chrome, any IE, any Safari
    */
  var outerHTML: String = js.native

  /** innerHTML sets or gets the HTML syntax describing the element's descendants.
    *
    * Note: If a &lt;div&gt;, &lt;span&gt;, or &lt;noembed&gt; node has a child text node that includes the characters
    * (&), (&lt;), or (&gt;), innerHTML returns these characters as &amp, &lt and &gt respectively. Use Node.textContent
    * to get a correct copy of these text nodes' contents.
    */
  var innerHTML: String = js.native

  var id: String = js.native

  /** The copy event is fired when the user initiates a copy action through the browser UI (for example, using the
    * CTRL/Cmd+C keyboard shortcut or selecting the "Copy" from the menu) and in response to an allowed
    * `document.execCommand("copy")` call.
    */
  var oncopy: js.Function1[ClipboardEvent, _] = js.native

  /** The cut event is fired when a selection has been removed from the document and added to the clipboard. */
  var oncut: js.Function1[ClipboardEvent, _] = js.native

  /** The paste event is fired when a selection has been pasted from the clipboard to the document. */
  var onpaste: js.Function1[ClipboardEvent, _] = js.native

  var accessKey: String = js.native

  /** Supported by FF&gt;3.6, any Opera, any Chrome, any IE, any Safari */
  var classList: DOMTokenList = js.native

  def scrollIntoView(top: Boolean = js.native): Unit = js.native

  /** Supported by FF&gt;8, Opera&gt;7, Chrome&gt;1, IE&gt;4, Safari&gt;4 */
  def insertAdjacentHTML(where: String, html: String): Unit = js.native

  /** The insertAdjacentElement() method of the Element interface inserts a given element node at a given position
    * relative to the element it is invoked upon.
    *
    * @param position
    *   A DOMString representing the position relative to the targetElement; must match (case-insensitively) one of the
    *   following strings:
    *   - `"beforebegin"`: Before the targetElement itself.
    *   - `"afterbegin"`: Just inside the targetElement, before its first child.
    *   - `"beforeend"`: Just inside the targetElement, after its last child.
    *   - `"afterend"`: After the targetElement itself.
    *
    * @return
    *   The element that was inserted, or null, if the insertion failed.
    */
  def insertAdjacentElement(position: String, element: Element): Element = js.native

  /** The `matches()` method of the `Element` interface returns `true` if the element would be selected by the specified
    * selector string; otherwise, it returns `false`.
    */
  def matches(selector: String): Boolean = js.native

  /** getAttribute() returns the value of the named attribute on the specified element. If the named attribute does not
    * exist, the value returned will either be null or "" (the empty string); see Notes for details.
    */
  def getAttribute(name: String): String = js.native

  /** Returns a list of elements with the given tag name. The subtree underneath the specified element is searched,
    * excluding the element itself. The returned list is live, meaning that it updates itself with the DOM tree
    * automatically. Consequently, there is no need to call several times element.getElementsByTagName with the same
    * element and arguments.
    */
  def getElementsByTagName(name: String): HTMLCollection = js.native

  /** Returns a list of elements with the given tag name belonging to the given namespace. */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollection = js.native

  /** Returns an array-like object of all child elements which have all of the given class names. When called on the
    * document object, the complete document is searched, including the root node. You may also call
    * getElementsByClassName() on any element; it will return only elements which are descendants of the specified root
    * element with the given class names.
    */
  def getElementsByClassName(classNames: String): HTMLCollection = js.native

  /** hasAttributeNS returns a boolean value indicating whether the current element has the specified attribute. */
  def hasAttributeNS(namespaceURI: String, localName: String): Boolean = js.native

  /** Returns a text rectangle object that encloses a group of text rectangles. */
  def getBoundingClientRect(): DOMRect = js.native

  /** getAttributeNS returns the string value of the attribute with the specified namespace and name. If the named
    * attribute does not exist, the value returned will either be null or "" (the empty string); see Notes for details.
    */
  def getAttributeNS(namespaceURI: String, localName: String): String = js.native

  /** Returns the Attr node for the attribute with the given namespace and name. */
  def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = js.native

  /** setAttributeNodeNS adds a new namespaced attribute node to an element. */
  def setAttributeNodeNS(newAttr: Attr): Attr = js.native

  /** hasAttribute returns a boolean value indicating whether the specified element has the specified attribute or not.
    */
  def hasAttribute(name: String): Boolean = js.native

  /** removeAttribute removes an attribute from the specified element. */
  def removeAttribute(name: String): Unit = js.native

  /** setAttributeNS adds a new attribute or changes the value of an attribute with the given namespace and name. */
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native

  /** Returns the specified attribute of the specified element, as an Attr node. */
  def getAttributeNode(name: String): Attr = js.native

  /** Returns a collection of rectangles that indicate the bounding rectangles for each box in a client. */
  def getClientRects(): DOMRectList = js.native

  /** setAttributeNode() adds a new Attr node to the specified element. */
  def setAttributeNode(newAttr: Attr): Attr = js.native

  /** removeAttributeNode removes the specified attribute from the current element. */
  def removeAttributeNode(oldAttr: Attr): Attr = js.native

  /** Adds a new attribute or changes the value of an existing attribute on the specified element.
    *
    * MSN
    */
  def setAttribute(name: String, value: String): Unit = js.native

  /** removeAttributeNS removes the specified attribute from an element. */
  def removeAttributeNS(namespaceURI: String, localName: String): Unit = js.native

  /** The Element.requestFullscreen() method issues an asynchronous request to make the element be displayed in
    * full-screen mode.
    *
    * It's not guaranteed that the element will be put into full screen mode. If permission to enter full screen mode is
    * granted, the returned Promise will resolve and the element will receive a fullscreenchange event to let it know
    * that it's now in full screen mode. If permission is denied, the promise is rejected and the element receives a
    * fullscreenerror event instead. If the element has been detached from the original document, then the document
    * receives these events instead.
    *
    * Earlier implementations of the Fullscreen API would always send these events to the document rather than the
    * element, and you may need to be able to handle that situation. Check Browser compatibility in fullscreen for
    * specifics on when each browser made this change.
    */
  def requestFullscreen(options: FullscreenOptions = js.native): js.Promise[Unit] = js.native

  /** The Element interface's onfullscreenchange property is an event handler for the fullscreenchange event that is
    * fired when the element has transitioned into or out of full-screen mode.
    */
  var onfullscreenchange: js.Function1[Event, _] = js.native

  /** The Element interface's onfullscreenerror property is an event handler for the fullscreenerror event which is sent
    * to the element when an error occurs while attempting to transition into or out of full-screen mode.
    */
  var onfullscreenerror: js.Function1[Event, _] = js.native
}

trait FullscreenOptions extends js.Object {
  var navigationUI: js.UndefOr[String] = js.undefined
}

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

  /** .attributes is a collection of all attribute nodes registered to the specified node. It is a NamedNodeMap,not an
    * Array, so it has no Array methods and the Attr nodes' indexes may differ among browsers. To be more specific,
    * attribute is a key value pair of strings that represents any information regarding that node; it cannot hold
    * Object. Attribute can hold additional data/information that is required while processing custom JavaScript. There
    * are many predefined attributes for different nodes used for binding events, validations, and specifying layout
    * informations that are handled by browser (may vary from browser to browser).
    */
  def attributes: NamedNodeMap = js.native

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

  /** hasAttributes returns a boolean value of true or false, indicating if the current element has any attributes or
    * not.
    */
  def hasAttributes(): Boolean = js.native

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

trait ModifierKeyEventInit extends js.Object {
  var metaKey: js.UndefOr[Boolean] = js.undefined
  var altKey: js.UndefOr[Boolean] = js.undefined
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  var shiftKey: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait ModifierKeyEvent extends js.Object {

  /** The metaKey property indicates if the meta key was pressed (true) or not (false) when the event occurred. */
  def metaKey: Boolean = js.native

  /** The altKey property indicates if the alt key was pressed (true) or not (false) when the event occurred. */
  def altKey: Boolean = js.native

  /** A Boolean value indicating whether or not the control key was down when the touch event was fired. Read only. */
  def ctrlKey: Boolean = js.native

  /** A Boolean value indicating whether or not the shift key was down when the touch event was fired. Read only. */
  def shiftKey: Boolean = js.native
}

/** The hashchange event is fired when the fragment identifier of the URL has changed (the part of the URL that follows
  * the # symbol, including the # symbol).
  */
@js.native
trait HashChangeEvent extends Event {

  /** The new URL to which the window is navigating. */
  def newURL: String = js.native

  /** The previous URL from which the window was navigated. */
  def oldURL: String = js.native
}

trait MouseEventInit extends UIEventInit with ModifierKeyEventInit {
  var screenX: js.UndefOr[Double] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var relatedTarget: js.UndefOr[EventTarget] = js.undefined
  var button: js.UndefOr[Int] = js.undefined
  var buttons: js.UndefOr[Int] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
}

/** The DOM MouseEvent interface represents events that occur due to the user interacting with a pointing device (such
  * as a mouse).
  *
  * Common events using this interface include click, dblclick, mouseup, mousedown. The list of all events using this
  * interface is provided in the Events reference.
  *
  * MouseEvent derives from UIEvent, which in turn derives from Event.
  */
@js.native
@JSGlobal
class MouseEvent(typeArg: String, init: js.UndefOr[MouseEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  /** The screenX property provides the X coordinate of the mouse pointer in global (screen) coordinates. */
  def screenX: Double = js.native

  /** The pageX property is an integer value in pixels for the X coordinate of the mouse pointer, relative to the whole
    * document, when the mouse event fired. This property takes into account any horizontal scrolling of the page.
    */
  def pageX: Double = js.native

  /** The pageY property is an integer value in pixels for the Y coordinate of the mouse pointer, relative to the whole
    * document, when the mouse event fired. This property takes into account any vertical scrolling of the page.
    */
  def pageY: Double = js.native

  /** The clientY property provides the Y coordinate of the mouse pointer in local (DOM content) coordinates. */
  def clientY: Double = js.native

  /** The screenY property provides the Y coordinate of the mouse pointer in global (screen) coordinates. */
  def screenY: Double = js.native

  /** The relatedTarget property is the secondary target for the event, if there is one. */
  def relatedTarget: EventTarget = js.native

  /** The button property indicates which button was pressed on the mouse to trigger the event. */
  def button: Int = js.native

  /** The buttons property indicates which buttons were pressed on the mouse to trigger the event. */
  def buttons: Int = js.native

  /** The clientX property provides the X coordinate of the mouse pointer in local (DOM content) coordinates. */
  def clientX: Double = js.native

  /** Returns the current state of the specified modifier key. See the KeyboardEvent.getModifierState() documentation
    * for details.
    */
  def getModifierState(keyArg: String): Boolean = js.native
}

/** Most of today's web content assumes the user's pointing device will be a mouse. However, since many devices support
  * other types of pointing input devices, such as pen/stylus and touch surfaces, extensions to the existing pointing
  * device event models are needed and pointer events address that need.
  *
  * Pointer events are DOM events that are fired for a pointing device. They are designed to create a single DOM event
  * model to handle pointing input devices such as a mouse, pen/stylus or touch (such as one or more fingers). The
  * pointer is a hardware-agnostic device that can target a specific set of screen coordinates. Having a single event
  * model for pointers can simplify creating Web sites and applications and provide a good user experience regardless of
  * the user's hardware. However, for scenarios when device-specific handling is desired, pointer events defines a
  * property to inspect the device type which produced the event.
  *
  * The events needed to handle generic pointer input are analogous to mouse events (mousedown/pointerdown,
  * mousemove/pointermove, etc.). Consequently, pointer event types are intentionally similar to mouse event types.
  * Additionally, a pointer event contains the usual properties present in mouse events (client coordinates, target
  * element, button states, etc.) in addition to new properties for other forms of input: pressure, contact geometry,
  * tilt, etc. In fact, the PointerEvent interface inherits all of the MouseEvent's properties thus facilitating
  * migrating content from mouse events to pointer events.
  */
@js.native
@JSGlobal
class PointerEvent(typeArg: String, pointerEventInit: js.UndefOr[PointerEventInit] = js.undefined)
    extends MouseEvent(typeArg, pointerEventInit) {

  def this(typeArg: String) = this(typeArg, js.native)

  /** An identifier assigned to a pointer event that is unique from the identifiers of all active pointer events at the
    * time. Authors cannot assume values convey any particular meaning other than an identifier for the pointer that is
    * unique from all other active pointers.
    */
  def pointerId: Double = js.native

  /** The width read-only property of the PointerEvent interface represents the width of the pointer's contact geometry
    * along the x-axis, measured in CSS pixels. Depending on the source of the pointer device (such as a finger), for a
    * given pointer, each event may produce a different value.
    */
  def width: Double = js.native

  /** The height read-only property of the PointerEvent interface represents the height of the pointer's contact
    * geometry, along the Y axis (in CSS pixels). Depending on the source of the pointer device (for example a finger),
    * for a given pointer, each event may produce a different value.
    */
  def height: Double = js.native

  /** The normalized pressure of the pointer input in the range of 0 to 1, where 0 and 1 represent the minimum and
    * maximum pressure the hardware is capable of detecting, respectively.
    *
    * For hardware that does not support pressure, including but not limited to mouse, the value MUST be 0.5 when the
    * pointer is active and 0 otherwise.
    */
  def pressure: Double = js.native

  /** The tangentialPressure read-only property of the PointerEvent interface represents the normalized tangential
    * pressure of the pointer input (also known as barrel pressure or cylinder stress) in the range -1 to 1, where 0 is
    * the neutral position of the control.
    *
    * Note that some hardware may only support positive values in the range 0 to 1. For hardware that does not support
    * tangential pressure, the value will be 0.
    */
  def tangentialPressure: Double = js.native

  /** This property is the angle (in degrees) between the Y-Z plane of the pointer and the screen. This property is
    * typically only useful for a pen/stylus pointer type. The range of values is -90 to 90 degrees and a positive value
    * means a tilt to the right. For devices that do not support this property, the value is 0.
    */
  def tiltX: Double = js.native

  /** This property is the angle (in degrees) between the X-Z plane of the pointer and the screen. This property is
    * typically only useful for a pen/stylus pointer type. The range of values is -90 to 90 degrees and a positive value
    * is a tilt toward the user. For devices that do not support this property, the value is 0.
    */
  def tiltY: Double = js.native

  /** The twist read-only property of the PointerEvent interface represents the clockwise rotation of the transducer
    * (e.g. pen stylus) around its major axis in degrees, with a value in the range 0 to 359.
    *
    * For devices that do not report twist, the value MUST be 0.
    */
  def twist: Double = js.native

  /** The pointerType read-only property of the PointerEvent interface indicates the device type that caused the pointer
    * event. The supported values are the following strings:
    *
    * mouse The event was generated by a mouse device.
    *
    * pen The event was generated by a pen or stylus device.
    *
    * touch The event was generated by a touch such as a finger. If the device type cannot be detected by the browser,
    * the value can be an empty string (""). If the browser supports pointer device types other than those listed above,
    * the value should be vendor prefixed to avoid conflicting names for different types of devices.
    */
  def pointerType: String = js.native

  /** Indicates if the pointer represents the primary pointer of this pointer type.
    *
    * In some scenarios there may be multiple pointers (for example a device with both a touchscreen and a mouse) or a
    * pointer supports multiple contact points (for example a touchscreen that supports multiple finger touches). The
    * application can use the isPrimary property to identify a master pointer among the set of active pointers for each
    * pointer type. If an application only wants to support a primary pointer, it can ignore all pointer events that are
    * not primary.
    *
    * For mouse there is only one pointer, so it will always be the primary pointer. For touch input, a pointer is
    * considered primary if the user touched the screen when there were no other active touches. For pen and stylus
    * input, a pointer is considered primary if the user's pen initially contacted the screenwhen there were no other
    * active pens contacting the screen.
    */
  def isPrimary: Boolean = js.native
}

trait PointerEventInit extends MouseEventInit {

  /** Sets value of MouseEvent.pointerId. Defaults to 0. */
  var pointerId: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.width. Defaults to 1. */
  var width: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.height. Defaults to 0. */
  var height: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.pressure. Defaults to 0. */
  var pressure: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tangentialPressure. Defaults to 0. */
  var tangentialPressure: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tiltX. Defaults to 0. */
  var tiltX: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.tiltY. Defaults to 0. */
  var tiltY: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.twist. Defaults to 0. */
  var twist: js.UndefOr[Double] = js.undefined

  /** Sets value of MouseEvent.pointerType. Defaults to 0. */
  var pointerType: js.UndefOr[String] = js.undefined

  /** Sets value of MouseEvent.isPrimary. Defaults to 0. */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
}

/** The TextMetrics interface represents the dimension of a text in the canvas, as created by the
  * CanvasRenderingContext2D.measureText() method.
  */
@js.native
@JSGlobal
class TextMetrics extends js.Object {

  /** Is a double giving the calculated width of a segment of inline text in CSS pixels. It takes into account the
    * current font of the context.
    */
  var width: Double = js.native
}

@js.native
trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: String): Event = js.native
}

/** A CDATA Section can be used within XML to include extended portions of unescaped text, such that the symbols &lt;
  * and & do not need escaping as they normally do within XML when used as text.
  *
  * As a CDATASection has no properties or methods unique to itself and only directly implements the Text interface, one
  * can refer to Text to find its properties and methods.
  */
@js.native
@JSGlobal
abstract class CDATASection extends Text

@js.native
trait StyleMedia extends js.Object {
  def `type`: String = js.native

  def matchMedium(mediaquery: String): Boolean = js.native
}

/** Selection is the class of the object returned by window.getSelection() and other methods. It represents the text
  * selection in the greater page, possibly spanning multiple elements, when the user drags over static text and other
  * parts of the page. For information about text selection in an individual text editing element, see Input, TextArea
  * and document.activeElement which typically return the parent object returned from window.getSelection().
  */
@js.native
@JSGlobal
class Selection extends js.Object {

  /** Returns a boolean indicating whether the selection's start and end points are at the same position. */
  def isCollapsed: Boolean = js.native

  /** Returns the node in which the selection begins. */
  def anchorNode: Node = js.native

  /** Returns the node in which the selection ends. */
  def focusNode: Node = js.native

  /** Returns a number representing the offset of the selection's anchor within the anchorNode. If anchorNode is a text
    * node, this is the number of characters within anchorNode preceding the anchor. If anchorNode is an element, this
    * is the number of child nodes of the anchorNode preceding the anchor.
    */
  def anchorOffset: Int = js.native

  /** Returns a number representing the offset of the selection's anchor within the focusNode. If focusNode is a text
    * node, this is the number of characters within focusNode preceding the focus. If focusNode is an element, this is
    * the number of child nodes of the focusNode preceding the focus.
    */
  def focusOffset: Int = js.native

  /** Returns the number of ranges in the selection. */
  def rangeCount: Int = js.native

  /** A range object that will be added to the selection. */
  def addRange(range: Range): Unit = js.native

  /** Collapses the selection to the end of the last range in the selection.  If the content the selection is in is
    * focused and editable, the caret will blink there.
    */
  def collapseToEnd(): Unit = js.native

  /** Adds all the children of the specified node to the selection. Previous selection is lost. */
  def selectAllChildren(parentNode: Node): Unit = js.native

  /** Returns a range object representing one of the ranges currently selected. */
  def getRangeAt(index: Int): Range = js.native

  /** Collapses the current selection to a single point. The document is not modified. If the content is focused and
    * editable, the caret will blink there.
    */
  def collapse(parentNode: Node, offset: Int): Unit = js.native

  /** Removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and leaving
    * nothing selected.
    */
  def removeAllRanges(): Unit = js.native

  /** Collapses the selection to the start of the first range in the selection.  If the content of the selection is
    * focused and editable, the caret will blink there.
    */
  def collapseToStart(): Unit = js.native

  /** Deletes the actual text being represented by a selection object from the document's DOM. */
  def deleteFromDocument(): Unit = js.native

  /** Removes a range from the selection. */
  def removeRange(range: Range): Unit = js.native

  /** Indicates if the node is part of the selection */
  def containsNode(node: Node, partialContainment: Boolean = js.native): Boolean = js.native

  /** Moves the focus of the selection to a specified point. The anchor of the selection does not move. The selection
    * will be from the anchor to the new focus regardless of direction.
    */
  def extend(node: Node, offset: Int = js.native): Unit = js.native
}

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

@js.native
trait WindowSessionStorage extends js.Object {

  /** This is a global object (sessionStorage) that maintains a storage area that's available for the duration of the
    * page session. A page session lasts for as long as the browser is open and survives over page reloads and restores.
    * Opening a page in a new tab or window will cause a new session to be initiated.
    */
  def sessionStorage: Storage = js.native
}

/** The window object represents the window itself. The document property of a window points to the DOM document loaded
  * in that window. A window for a given document can be obtained using the document.defaultView property.
  *
  * In a tabbed browser, such as Firefox, each tab contains its own window object (and if you're writing an extension,
  * the browser window itself is a separate window too - see Working with windows in chrome code for more information).
  * That is, the window object is not shared between tabs in the same window. Some methods, namely window.resizeTo and
  * window.resizeBy apply to the whole window and not to the specific tab the window object belongs to. Generally,
  * anything that can't reasonably pertain to a tab pertains to the window instead.
  */
@js.native
@JSGlobal
class Window
    extends EventTarget with WindowLocalStorage with WindowSessionStorage with WindowOrWorkerGlobalScope
    with WindowConsole {
  var ondragend: js.Function1[DragEvent, _] = js.native

  /** An event handler property for keydown events on the window. */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native

  /** An event handler property for keyup events on the window. */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native

  /** An event handler property for reset events on the window. */
  var onreset: js.Function1[Event, _] = js.native

  /** An event handler property for mouseup events on the window. */
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native

  /** Returns the horizontal distance of the left border of the user's browser from the left side of the screen. */
  var screenX: Int = js.native

  /** An event handler property for mouseover events on the window. */
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  var ondragleave: js.Function1[DragEvent, _] = js.native

  /** The Window.history read-only property returns a reference to the History object, which provides an interface for
    * manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
    */
  def history: History = js.native

  /** Returns the number of pixels that the document has already been scrolled horizontally. */
  def pageXOffset: Double = js.native

  /** The name of the window is used primarily for setting targets for hyperlinks and forms. Windows do not need to have
    * names.
    */
  var name: String = js.native

  /** The onafterprint property sets and returns the onafterprint event handler code for the current window. */
  var onafterprint: js.Function1[Event, _] = js.native
  var onpause: js.Function1[Event, _] = js.native

  /** The onbeforeprint property sets and returns the onbeforeprint event handler code for the current window. */
  var onbeforeprint: js.Function1[Event, _] = js.native

  /** Returns a reference to the topmost window in the window hierarchy. This property is read only. */
  def top: Window = js.native

  /** An event handler property for mousedown events on the window. */
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onseeked: js.Function1[Event, _] = js.native

  /** Returns a reference to the window that opened this current window. */
  var opener: Window = js.native

  /** Called when the user clicks the mouse button while the cursor is in the window. This event is fired for any mouse
    * button pressed; you can look at the event properties to find out which button was pressed and where.
    */
  var onclick: js.Function1[MouseEvent, _] = js.native

  /** Gets the width of the content area of the browser window including, if rendered, the vertical scrollbar. */
  def innerWidth: Double = js.native

  /** Gets the height of the content area of the browser window including, if rendered, the horizontal scrollbar. */
  def innerHeight: Double = js.native

  var onwaiting: js.Function1[Event, _] = js.native
  var ononline: js.Function1[Event, _] = js.native
  var ondurationchange: js.Function1[Event, _] = js.native

  /** Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window. */
  def frames: Window = js.native

  /** The onblur property can be used to set the blur handler on the window, which is triggered when the window loses
    * focus.
    */
  var onblur: js.Function1[FocusEvent, _] = js.native
  var onemptied: js.Function1[Event, _] = js.native
  var onseeking: js.Function1[Event, _] = js.native
  var oncanplay: js.Function1[Event, _] = js.native

  /** window.outerWidth gets the width of the outside of the browser window. It represents the width of the whole
    * browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
    */
  def outerWidth: Int = js.native

  var onstalled: js.Function1[Event, _] = js.native

  /** An event handler property for mousemove events on the window. */
  var onmousemove: js.Function1[MouseEvent, _] = js.native

  var onoffline: js.Function1[Event, _] = js.native

  /** Returns the number of frames (either frame or iframe elements) in the window. */
  def length: Int = js.native

  /** Specifies the height of the screen, in pixels, minus permanent or semipermanent user interface features displayed
    * by the operating system, such as the Taskbar on Windows.
    */
  def screen: Screen = js.native

  /** An event that fires when a window is about to unload its resources. The document is still visible and the event is
    * still cancelable.
    */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var onratechange: js.Function1[Event, _] = js.native
  var onstorage: js.Function1[StorageEvent, _] = js.native
  var onloadstart: js.Function1[Event, _] = js.native

  /** Called for an element when the mouse pointer first moves over the element while something is being dragged. This
    * might be used to change the appearance of the element to indicate to the user that the object can be dropped on
    * it.
    */
  var ondragenter: js.Function1[DragEvent, _] = js.native

  /** An event handler property for submits on window forms. */
  var onsubmit: js.Function1[Event, _] = js.native

  /** Returns an object reference to the window object itself. */
  def self: Window = js.native

  /** Returns a reference to the document that the window contains. */
  def document: HTMLDocument = js.native

  var onprogress: js.Function1[js.Any, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native

  /** Returns the number of pixels that the document has already been scrolled vertically. */
  def pageYOffset: Double = js.native

  /** An event handler property for right-click events on the window. */
  var oncontextmenu: js.Function1[MouseEvent, _] = js.native

  /** An event handler property for change events on the window. */
  var onchange: js.Function1[Event, _] = js.native
  var onloadedmetadata: js.Function1[Event, _] = js.native
  var onplay: js.Function1[Event, _] = js.native

  /** An event handler property for errors raised on the window. */
  var onerror: js.Function5[Event, String, Int, Int, Any, _] = js.native
  var onplaying: js.Function1[Event, _] = js.native

  /** Returns a reference to the parent of the current window or subframe. */
  def parent: Window = js.native

  /** The Window.location property returns a Location object with information about the current location of the
    * document.
    */
  var location: Location = js.native
  var oncanplaythrough: js.Function1[Event, _] = js.native

  /** An event handler property for abort events on the window. */
  var onabort: js.Function1[UIEvent, _] = js.native
  var onreadystatechange: js.Function1[Event, _] = js.native

  /** window.outerHeight gets the height in pixels of the whole browser window. It represents the height of the whole
    * browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
    */
  def outerHeight: Int = js.native

  /** An event handler property for keypress events on the window. */
  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /** Returns the element (such as &lt;iframe&gt; or &lt;object&gt;) in which the window is embedded, or null if the
    * window is top-level.
    */
  def frameElement: Element = js.native

  var onloadeddata: js.Function1[Event, _] = js.native
  var onsuspend: js.Function1[Event, _] = js.native

  /** The window property of a window object points to the window object itself. */
  def window: Window = js.native

  /** An event handler property for focus events on the window. */
  var onfocus: js.Function1[FocusEvent, _] = js.native
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native

  /** An event handler for the resize event on the window. */
  var onresize: js.Function1[UIEvent, _] = js.native

  /** An event handler property for window selection. */
  var onselect: js.Function1[UIEvent, _] = js.native

  /** The Window.navigator read-only property returns a reference to the Navigator object, which can be queried for
    * information about the application running the script.
    */
  def navigator: Navigator = js.native

  def styleMedia: StyleMedia = js.native

  var ondrop: js.Function1[DragEvent, _] = js.native

  /** An event handler property for mouseout events on the window. */
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var onended: js.Function1[Event, _] = js.native

  /** An event handler property for hash change events on the window; called when the part of the URL after the hash
    * mark ("#") changes.
    */
  var onhashchange: js.Function1[HashChangeEvent, _] = js.native

  /** The unload event is raised when the window is unloading its content and resources. The resources removal is
    * processed  after the unload event occurs.
    */
  var onunload: js.Function1[Event, _] = js.native

  /** Specifies the function to be called when the window is scrolled. */
  var onscroll: js.Function1[UIEvent, _] = js.native

  /** Returns the vertical distance of the top border of the user's browser from the top edge of the screen. */
  def screenY: Int = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native

  var onwheel: js.Function1[WheelEvent, _] = js.native

  /** An event handler property for window loading. */
  var onload: js.Function1[Event, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var oninput: js.Function1[Event, _] = js.native

  /** The Web Performance API allows web pages access to certain functions for measuring the performance of web pages
    * and web applications, including the Navigation Timing API and high-resolution time data.
    */
  def performance: Performance = js.native

  def alert(message: String): Unit = js.native

  /** The Window.alert() method displays an alert dialog with the optional specified content and an OK button. */
  def alert(): Unit = js.native

  /** Scrolls the window to a particular place in the document. */
  def scroll(x: Int, y: Int): Unit = js.native

  /** Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed
    * to be frontmost before this method returns.
    */
  def focus(): Unit = js.native

  /** Scrolls to a particular set of coordinates in the document. */
  def scrollTo(x: Int, y: Int): Unit = js.native

  /** Opens the Print Dialog to print the current document. */
  def print(): Unit = js.native

  def prompt(message: String, default: String = js.native): String = js.native

  /** The Window.prompt() displays a dialog with an optional message prompting the user to input some text. */
  def prompt(): String = js.native

  /** Loads a resource in a new browsing context or an existing one. */
  def open(url: String = js.native, target: String = js.native, features: String = js.native,
      replace: Boolean = js.native): Window = js.native

  /** Scrolls the document in the window by the given amount. */
  def scrollBy(x: Int, y: Int): Unit = js.native

  /** The Window.confirm() method displays a modal dialog with an optional message and two buttons, OK and Cancel. */
  def confirm(message: String = js.native): Boolean = js.native

  /** Closes the current window, or a referenced window. */
  def close(): Unit = js.native

  def closed: Boolean = js.native

  /** Safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it
    * spawned, or between a page and an iframe embedded within it.
    *
    * Normally, scripts on different pages are allowed to access each other if and only if the pages they originate from
    * share the same protocol, port number, and host (also known as the "same-origin policy"). window.postMessage()
    * provides a controlled mechanism to securely circumvent this restriction (if used properly).
    *
    * Broadly, one window may obtain a reference to another (e.g., via targetWindow = window.opener), and then dispatch
    * a MessageEvent on it with targetWindow.postMessage(). The receiving window is then free to handle this event as
    * needed. The arguments passed to window.postMessage() (i.e., the “message”) are exposed to the receiving window
    * through the event object.
    *
    * @param targetOrigin
    *   Specifies what the origin of targetWindow must be for the event to be dispatched, either as the literal string
    *   "*" (indicating no preference) or as a URI. If at the time the event is scheduled to be dispatched the scheme,
    *   hostname, or port of targetWindow's document does not match that provided in targetOrigin, the event will not be
    *   dispatched; only if all three match will the event be dispatched. This mechanism provides control over where
    *   messages are sent; for example, if postMessage() was used to transmit a password, it would be absolutely
    *   critical that this argument be a URI whose origin is the same as the intended receiver of the message containing
    *   the password, to prevent interception of the password by a malicious third party. Always provide a specific
    *   targetOrigin, not *, if you know where the other window's document should be located. Failing to provide a
    *   specific target discloses the data you send to any interested malicious site.
    *
    * @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  def postMessage(message: js.Any, targetOrigin: String,
      transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  /** The Window.showModalDialog() creates and displays a modal dialog box containing a specified HTML document.
    *
    * @param url
    *   The URI of the document to display in the dialog box
    * @param argument
    *   An optional variant the contains values that should be passed to the dialog box; these are made available in the
    *   `window` object's `dialogArguments` property.
    * @param options
    *   An optional String that specifies window ornamentation
    */
  def showModalDialog(url: String = js.native, argument: js.Any = js.native,
      options: js.Any = js.native): js.Dynamic = js.native

  /** The window.blur() method is the programmatic equivalent of the user shifting focus away from the current window.
    */
  def blur(): Unit = js.native

  /** Returns a selection object representing the range of text selected by the user. */
  def getSelection(): Selection = js.native

  def getComputedStyle(elt: Element, pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /** An OfflineResourceList object providing access to the offline resources for the window. */
  def applicationCache: ApplicationCache = js.native

  /** An event handler property for popstate events, which are fired when navigating to a session history entry
    * representing a state object.
    */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native

  /** An event handler property for pagehide events, which are fired when the browser hides the current page in the
    * process of presenting a different page from the session's history.
    *
    * For example, when the user clicks the browser's Back button, the current page receives a pagehide event before the
    * previous page is shown.
    */
  var onpagehide: js.Function1[PageTransitionEvent, _] = js.native

  /** An event handler property for pageshow events, which are fired when the browser makes the window's document
    * visible due to navigation tasks. This includes the process of initially loading the page, navigating to the page
    * from another page within the same window or tab, or returning to the page using the browser's forward or back
    * buttons.
    *
    * When this event is sent during the page load process, it's sent after the load event.
    */
  var onpageshow: js.Function1[PageTransitionEvent, _] = js.native

  /** Returns a new MediaQueryList object representing the parsed results of the specified media query string. */
  def matchMedia(mediaQuery: String): MediaQueryList = js.native

  /** Cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame(). */
  def cancelAnimationFrame(handle: Int): Unit = js.native

  /** The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests
    * that the browser call a specified function to update an animation before the next repaint. The method takes as an
    * argument a callback to be invoked before the repaint.
    */
  def requestAnimationFrame(callback: js.Function1[Double, _]): Int = js.native

  /** The Window.devicePixelRatio read-only property returns the ratio of the (vertical) size of one physical pixel on
    * the current display device to the size of one device independent pixel (dips).
    */
  def devicePixelRatio: Double = js.native

  /** fired when a pointing device is moved into an element's hit test boundaries. */
  var onpointerover: js.Function1[PointerEvent, _] = js.native

  /** fired when a pointing device is moved into the hit test boundaries of an element or one of its descendants,
    * including as a result of a pointerdown event from a device that does not support hover (see pointerdown).
    */
  var onpointerenter: js.Function1[PointerEvent, _] = js.native

  /** fired when a pointer becomes active. */
  var onpointerdown: js.Function1[PointerEvent, _] = js.native

  /** fired when a pointer changes coordinates. */
  var onpointermove: js.Function1[PointerEvent, _] = js.native

  /** fired when a pointer is no longer active. */
  var onpointerup: js.Function1[PointerEvent, _] = js.native

  /** a browser fires this event if it concludes the pointer will no longer be able to generate events (for example the
    * related device is deactived).
    */
  var onpointercancel: js.Function1[PointerEvent, _] = js.native

  /** fired for several reasons including: pointing device is moved out of the hit test boundaries of an element; firing
    * the pointerup event for a device that does not support hover (see pointerup); after firing the pointercancel event
    * (see pointercancel); when a pen stylus leaves the hover range detectable by the digitizer.
    */
  var onpointerout: js.Function1[PointerEvent, _] = js.native

  /** fired when a pointing device is moved out of the hit test boundaries of an element. For pen devices, this event is
    * fired when the stylus leaves the hover range detectable by the digitizer.
    */
  var onpointerleave: js.Function1[PointerEvent, _] = js.native

  /** fired when an element receives pointer capture. */
  var gotpointercapture: js.Function1[PointerEvent, _] = js.native

  /** Fired after pointer capture is released for a pointer. */
  var lostpointercapture: js.Function1[PointerEvent, _] = js.native

  /** Moves the window to the specified coordinates. */
  def moveTo(x: Int, y: Int): Unit = js.native

  /** Moves the current window by a specified amount. */
  def moveBy(deltaX: Int, deltaY: Int): Unit = js.native

  /** Dynamically resizes window. */
  def resizeTo(width: Int, height: Int): Unit = js.native

  /** Resizes the current window by a certain amount. */
  def resizeBy(deltaX: Int, deltaY: Int): Unit = js.native

  /** The read-only scrollX property of the Window interface returns the number of pixels that the document is currently
    * scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a
    * whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
    */
  def scrollX: Double = js.native

  /** The read-only scrollY property of the Window interface returns the number of pixels that the document is currently
    * scrolled vertically. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole
    * number. You can get the number of pixels the document is scrolled horizontally from the scrollX property.
    */
  def scrollY: Double = js.native
}

/** An options object that specifies characteristics about the event listener. */
trait EventListenerOptions extends js.Object {

  /** A Boolean indicating that events of this type will be dispatched to the registered listener before being
    * dispatched to any EventTarget beneath it in the DOM tree.
    */
  var capture: js.UndefOr[Boolean] = js.undefined

  /** A Boolean indicating that the listener should be invoked at most once after being added. If true, the listener
    * would be automatically removed when invoked.
    */
  var once: js.UndefOr[Boolean] = js.undefined

  /** A Boolean which, if true, indicates that the function specified by listener will never call preventDefault(). If a
    * passive listener does call preventDefault(), the user agent will do nothing other than generate a console warning.
    * See Improving scrolling performance with passive listeners to learn more.
    */
  var passive: js.UndefOr[Boolean] = js.undefined
}

/** EventTarget is a DOM interface implemented by objects that can receive DOM events and have listeners for them.
  *
  * Element, document, and window are the most common event targets, but other objects can be event targets too, for
  * example XMLHttpRequest, AudioNode, AudioContext and others.
  *
  * Many event targets (including elements, documents, and windows) also support setting event handlers via on...
  * properties and attributes.
  */
@js.native
@JSGlobal
class EventTarget extends js.Object {

  /** Removes the event listener previously registered with EventTarget.addEventListener. */
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      useCapture: Boolean = js.native): Unit = js.native

  /** The EventTarget.addEventListener() method registers the specified listener on the EventTarget it's called on. The
    * event target may be an Element in a document, the Document itself, a Window, or any other object that supports
    * events (such as XMLHttpRequest).
    */
  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      useCapture: Boolean = js.native): Unit = js.native

  /** Removes the event listener previously registered with EventTarget.addEventListener.
    *
    * This implementation accepts a settings object of type EventListenerOptions.
    */
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      options: EventListenerOptions): Unit = js.native

  /** The EventTarget.addEventListener() method registers the specified listener on the EventTarget it's called on. The
    * event target may be an Element in a document, the Document itself, a Window, or any other object that supports
    * events (such as XMLHttpRequest).
    *
    * This implementation accepts a settings object of type EventListenerOptions.
    */
  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _],
      options: EventListenerOptions): Unit = js.native

  /** Dispatches an Event at the specified EventTarget, invoking the affected EventListeners in the appropriate order.
    * The normal event processing rules (including the capturing and optional bubbling phase) apply to events dispatched
    * manually with dispatchEvent().
    */
  def dispatchEvent(evt: Event): Boolean = js.native
}

/** The CanvasGradient interface represents an opaque object describing a gradient and returned by
  * CanvasRenderingContext2D.createLinearGradient or CanvasRenderingContext2D.createRadialGradient methods.
  */
@js.native
@JSGlobal
class CanvasGradient extends js.Object {

  /** Add a new stop, defined by an offset and a color, to the gradient. If the offset is not between 0 and 1 an
    * INDEX_SIZE_ERR is raised, if the color can't be parsed as a CSS &lt;color&gt;, a SYNTAX_ERR is raised.
    */
  def addColorStop(offset: Double, color: String): Unit = js.native
}

trait TouchEventInit extends UIEventInit with ModifierKeyEventInit {
  var changedTouches: js.UndefOr[TouchList] = js.undefined
  var targetTouches: js.UndefOr[TouchList] = js.undefined
  var touches: js.UndefOr[TouchList] = js.undefined
}

/** A TouchEvent represents an event sent when the state of contacts with a touch-sensitive surface changes. This
  * surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with
  * the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
  *
  * Touches are represented by the Touch object; each touch is described by a position, size and shape, amount of
  * pressure, and target element. Lists of touches are represented by TouchList objects.
  */
@js.native
@JSGlobal
class TouchEvent(typeArg: String, init: js.UndefOr[TouchEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  /** A TouchList of all the Touch objects representing individual points of contact whose states changed between the
    * previous touch event and this one. Read only.
    */
  def changedTouches: TouchList = js.native

  /** A TouchList listing all the Touch objects for touch points that are still in contact with the touch surface and
    * whose touchstart event occurred inside the same target element as the current target element.
    */
  def targetTouches: TouchList = js.native

  /** A TouchList listing all the Touch objects for touch points that are still in contact with the touch surface,
    * regardless of whether or not they've changed or what their target was at touchstart time.
    */
  def touches: TouchList = js.native

  /** The target of the touches associated with this event. This target corresponds to the target of all the touches in
    * the targetTouches attribute, but note that other touches in this event may have a different target. To be careful,
    * you should use the target associated with individual touches.
    */
  override def target: EventTarget = js.native
}

/** A TouchList represents a list of all of the points of contact with a touch surface; for example, if the user has
  * three fingers on the screen (or trackpad), the corresponding TouchList would have one Touch object for each finger,
  * for a total of three entries.
  */
@js.native
trait TouchList extends DOMList[Touch] {
  def item(index: Int): Touch = js.native
}

/** A Touch object represents a single point of contact between the user and a touch-sensitive interface device (which
  * may be, for example, a touchscreen or a trackpad).
  *
  * Note: Many of these values are hardware-dependent; for example, if the device doesn't have a way to detect the
  * amount of pressure placed on the surface, the force value will always be 1.0. This may also be the case for radiusX
  * and radiusY; if the hardware reports only a single point, these values will be 1.
  */
@js.native
@JSGlobal
class Touch extends js.Object {

  /** A unique identifier for this Touch object. A given touch (say, by a finger) will have the same identifier for the
    * duration of its movement around the surface. This lets you ensure that you're tracking the same touch all the
    * time. Read only.
    */
  def identifier: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the screen. Read only. */
  def screenX: Double = js.native

  /** The Y coordinate of the touch point relative to the top edge of the screen. Read only. */
  def screenY: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the browser viewport, not including any scroll
    * offset. Read only.
    */
  def clientX: Double = js.native

  /** The Y coordinate of the touch point relative to the top edge of the browser viewport, not including any scroll
    * offset. Read only.
    */
  def clientY: Double = js.native

  /** The X coordinate of the touch point relative to the left edge of the document. Unlike clientX, this value includes
    * the horizontal scroll offset, if any.
    *
    * Read only.
    */
  def pageX: Double = js.native

  /** The Y coordinate of the touch point relative to the top of the document. Unlike clientY, this value includes the
    * vertical scroll offset, if any. Read only.
    */
  def pageY: Double = js.native

  /** The X radius of the ellipse that most closely circumscribes the area of contact with the screen. The value is in
    * pixels of the same scale as screenX. Read only.
    */
  def radiusX: Double = js.native

  /** The Y radius of the ellipse that most closely circumscribes the area of contact with the screen. The value is in
    * pixels of the same scale as screenY. Read only.
    */
  def radiusY: Double = js.native

  /** The angle (in degrees) that the ellipse described by radiusX and radiusY must be rotated, clockwise, to most
    * accurately cover the area of contact between the user and the surface. Read only.
    */
  def rotationAngle: Double = js.native

  /** The amount of pressure being applied to the surface by the user, as a float between 0.0 (no pressure) and 1.0
    * (maximum pressure). Read only.
    */
  def force: Double = js.native

  /** The Element on which the touch point started when it was first placed on the surface, even if the touch point has
    * since moved outside the interactive area of that element or even been removed from the document. Note that if the
    * target is removed from the document, events will still be targeted at it, and hence won't necessarily bubble up to
    * the window or document anymore. If there's any risk of an element being removed while it is being touched, best
    * practice is to attach the touch listeners directly to the target. Read only.
    */
  def target: EventTarget = js.native
}

/** KeyboardEvent objects describe a user interaction with the keyboard. Each event describes a key; the event type
  * (keydown, keypress, or keyup) identifies what kind of activity was performed.
  *
  * Note: The KeyboardEvent indicates just what's happening on a key. When you need to handle text input, use HTML5
  * input event instead. For example, if user inputs text from hand-writing system like tablet PC, key events may not be
  * fired.
  *
  * Warning: keypress event is to be deprecated in favor of beforeinput event eventually
  *
  * W3C
  */
@js.native
@JSGlobal
class KeyboardEvent(typeArg: String, init: js.UndefOr[KeyboardEventInit])
    extends UIEvent(typeArg, init) with ModifierKeyEvent {

  def this(typeArg: String) = this(typeArg, js.native)

  /** Returns the Unicode value of a character key pressed during a keypress event.
    *
    * Note: Required especially in Gecko based browsers
    */
  def charCode: Int = js.native

  /** A system and implementation dependent numerical code identifying the unmodified value of the pressed key. This is
    * usually the decimal ASCII (RFC 20) or Windows 1252 code corresponding to the key; see Virtual key codes for a list
    * of Gecko's keyCode values. If the key can't be identified, this value is 0. Read only.
    */
  def keyCode: Int = js.native

  /** The location of the key on the keyboard or other input device. See the constants in the [[KeyboardEvent]] object.
    */
  def location: Int = js.native

  /** The key value of the key represented by the event. If the value has a printed representation, this attribute's
    * value is the same as the char attribute. Otherwise, it's one of the key value strings specified in Key values. If
    * the key can't be identified, this is the string "Unidentified". See key names for the detail.
    */
  def key: String = js.native

  /** true if the key is being held down such that it is automatically repeating */
  def repeat: Boolean = js.native

  /** Returns the current state of the specified modifier key. */
  def getModifierState(keyArg: String): Boolean = js.native
}

trait KeyboardEventInit extends UIEventInit with ModifierKeyEventInit {

  /** Sets value of KeyboardEvent.charCode. Defaults to 0. */
  var charCode: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.keyCode. Defaults to 0. */
  var keyCode: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.location. Defaults to 0. */
  var location: js.UndefOr[Int] = js.undefined

  /** Sets value of KeyboardEvent.locale. Defaults to empty string. */
  var locale: js.UndefOr[String] = js.undefined

  /** Sets value of KeyboardEvent.key. Defaults to empty string. */
  var key: js.UndefOr[String] = js.undefined

  /** Sets value of KeyboardEvent.repeat. Defaults to false. */
  var repeat: js.UndefOr[Boolean] = js.undefined
}

@js.native
@JSGlobal
object KeyboardEvent extends js.Object {

  /** The key has only one version, or can't be distinguished between the left and right versions of the key, and was
    * not pressed on the numeric keypad or a key that is considered to be part of the keypad.
    */
  def DOM_KEY_LOCATION_STANDARD: Int = js.native

  /** The key was the left-hand version of the key; for example, the left-hand Control key was pressed on a standard 101
    * key US keyboard. This value is only used for keys that have more that one possible location on the keyboard.
    */
  def DOM_KEY_LOCATION_LEFT: Int = js.native

  /** The key was the right-hand version of the key; for example, the right-hand Control key is pressed on a standard
    * 101 key US keyboard. This value is only used for keys that have more that one possible location on the keyboard.
    */
  def DOM_KEY_LOCATION_RIGHT: Int = js.native

  /** The key was on the numeric keypad, or has a virtual key code that corresponds to the numeric keypad.
    *
    * @note
    *   When NumLock is locked, Gecko always returns [[DOM_KEY_LOCATION_NUMPAD]] for the keys on the numeric pad.
    *   Otherwise, when NumLock is unlocked and the keyboard actually has a numeric keypad, Gecko always returns
    *   [[DOM_KEY_LOCATION_NUMPAD]] too. On the other hand, if the keyboard doesn't have a keypad, such as on a notebook
    *   computer, some keys become Numpad only when NumLock is locked. When such keys fires key events, the location
    *   attribute value depends on the key. That is, it must not be [[DOM_KEY_LOCATION_NUMPAD]].
    * @note
    *   NumLock key's key events indicate [[DOM_KEY_LOCATION_STANDARD]] both on Gecko and Internet Explorer.
    */
  def DOM_KEY_LOCATION_NUMPAD: Int = js.native
}

/** Each web page loaded in the browser has its own document object. The Document interface serves as an entry point to
  * the web page's content (the DOM tree, including elements such as &lt;body&gt; and &lt;table&gt;) and provides
  * functionality global to the document (such as obtaining the page's URL and creating new elements in the document).
  */
@js.native
@JSGlobal
abstract class Document extends Node with NodeSelector with DocumentEvent with ParentNode with PageVisibility {

  /** Returns a DOMImplementation object associated with the current document. */
  def implementation: DOMImplementation = js.native

  /** Returns the character encoding of the current document. */
  def characterSet: String = js.native

  /** Returns the Document Type Declaration (DTD) associated with current document. The returned object implements the
    * DocumentType interface. Use DOMImplementation.createDocumentType() to create a DocumentType.
    */
  def doctype: DocumentType = js.native

  /** Returns the Element that is the root element of the document (for example, the &lt;html&gt; element for HTML
    * documents).
    */
  def documentElement: Element = js.native

  def documentURI: String = js.native

  /** Returns a list of StyleSheet objects for stylesheets explicitly linked into or embedded in a document. */
  def styleSheets: StyleSheetList = js.native

  /** Returns a string containing the date and time on which the current document was last modified. */
  def lastModified: String = js.native

  /** Returns an object reference to the identified element. */
  def getElementById(elementId: String): Element = js.native

  /** Returns a list of elements with a given name in the (X)HTML document. */
  def getElementsByName(elementName: String): NodeList[Node] = js.native

  /** Returns a HTMLCollection of elements with the given tag name. The complete document is searched, including the
    * root node. The returned HTMLCollection is live, meaning that it updates itself automatically to stay in sync with
    * the DOM tree without having to call document.getElementsByTagName again.
    */
  def getElementsByTagName(name: String): HTMLCollection = js.native

  /** Returns a list of elements with the given tag name belonging to the given namespace. The complete document is
    * searched, including the root node.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollection = js.native

  /** Returns a set of elements which have all the given class names. When called on the document object, the complete
    * document is searched, including the root node. You may also call getElementsByClassName on any element; it will
    * return only elements which are descendants of the specified root element with the given class names.
    */
  def getElementsByClassName(classNames: String): HTMLCollection = js.native

  /** Returns the element from the document whose elementFromPoint method is being called which is the topmost element
    * which lies under the given point.  To get an element, specify the point via coordinates, in CSS pixels, relative
    * to the upper-left-most point in the window or frame containing the document.
    */
  def elementFromPoint(x: Double, y: Double): Element = js.native

  /** Adopts a node from an external document. The node and its subtree is removed from the document it's in (if any),
    * and its ownerDocument is changed to the current document. The node can then be inserted into the current document.
    */
  def adoptNode(source: Node): Node = js.native

  /** Returns an XPathResult based on an XPath expression and other given parameters.
    *
    * @param xpathExpression
    *   is a string representing the XPath to be evaluated.
    * @param contextNode
    *   specifies the context node for the query (see the http://www.w3.org/TR/xpath XPath specification). It's common
    *   to pass document as the context node.
    * @param namespaceResolver
    *   an `XPathNSResolver`
    * @param resultType
    *   is an integer that corresponds to the type of result XPathResult to return. Use named constant properties, such
    *   as XPathResult.ANY_TYPE, of the XPathResult constructor, which correspond to integers from 0 to 9.
    * @param result
    *   is an existing XPathResult to use for the results. null is the most common and will create a new XPathResult
    */
  def evaluate(xpathExpression: String, contextNode: Node, namespaceResolver: XPathNSResolver, resultType: Int,
      result: XPathResult): XPathResult = js.native

  /** Returns an XPathResult based on an XPath expression and other given parameters.
    *
    * @param xpathExpression
    *   is a string representing the XPath to be evaluated.
    * @param contextNode
    *   specifies the context node for the query (see the [http://www.w3.org/TR/xpath XPath specification). It's common
    *   to pass document as the context node.
    * @param namespaceResolver
    *   is a function that will be passed any namespace prefixes and should return a string representing the namespace
    *   URI associated with that prefix. It will be used to resolve prefixes within the XPath itself, so that they can
    *   be matched with the document. null is common for HTML documents or when no namespace prefixes are used.
    * @param resultType
    *   is an integer that corresponds to the type of result XPathResult to return. Use named constant properties, such
    *   as XPathResult.ANY_TYPE, of the XPathResult constructor, which correspond to integers from 0 to 9.
    * @param result
    *   is an existing XPathResult to use for the results. null is the most common and will create a new XPathResult
    */
  def evaluate(xpathExpression: String, contextNode: Node, namespaceResolver: js.Function1[String, String],
      resultType: Int, result: XPathResult): XPathResult = js.native

  /** Creates an XPathNSResolver which resolves namespaces with respect to the definitions in scope for a specified
    * node.
    */
  def createNSResolver(node: Node): XPathNSResolver = js.native

  /** Creates a copy of a node from an external document that can be inserted into the current document. */
  def importNode(importedNode: Node, deep: Boolean): Node = js.native

  /** In an HTML document creates the specified HTML element or HTMLUnknownElement if the element is not known. In a XUL
    * document creates the specified XUL element. In other documents creates an element with a null namespaceURI.
    */
  def createElement(tagName: String): Element = js.native

  /** Creates an element with the specified namespace URI and qualified name. */
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native

  /** createAttribute creates a new attribute node, and returns it. */
  def createAttribute(name: String): Attr = js.native

  /** Creates a new attribute node in a given namespace and returns it. */
  def createAttributeNS(namespaceURI: String, qualifiedName: String): Attr = js.native

  /** createProcessingInstruction() creates a new processing instruction node, and returns it. */
  def createProcessingInstruction(target: String, data: String): ProcessingInstruction = js.native

  /** createCDATASection() creates a new CDATA section node, and returns it. */
  def createCDATASection(data: String): CDATASection = js.native

  /** Once a Range is created, you need to set its boundary points before you can make use of most of its methods. */
  def createRange(): Range = js.native

  /** createComment() creates a new comment node, and returns it. */
  def createComment(data: String): Comment = js.native

  /** Creates a new empty DocumentFragment. */
  def createDocumentFragment(): DocumentFragment = js.native

  def createStyleSheet(href: String = js.native, index: Int = js.native): CSSStyleSheet = js.native

  def createTextNode(data: String): Text = js.native

  /** Supported in FF 3.5+, Chrome 1+, Opera 9+, Safari 3+, IE9+ */
  def createNodeIterator(root: Node, whatToShow: Int, filter: NodeFilter,
      entityReferenceExpansion: Boolean): NodeIterator = js.native

  /** The Document.createTreeWalker() creator method returns a newly created TreeWalker object. */
  def createTreeWalker(root: Node, whatToShow: Int, filter: NodeFilter,
      entityReferenceExpansion: Boolean): TreeWalker = js.native

  /** The Document method exitFullscreen() requests that the element on this document which is currently being presented
    * in full-screen mode be taken out of full-screen mode, restoring the previous state of the screen. This usually
    * reverses the effects of a previous call to Element.requestFullscreen().
    *
    * The exception is if another element was already in full-screen mode when the current element was placed into
    * full-screen mode using requestFullscreen(). In that case, the previous full-screen element is restored to
    * full-screen status instead. In essence, a stack of full-screen elements is maintained.
    */
  def exitFullscreen(): js.Promise[Unit] = js.native

  /** The DocumentOrShadowRoot.fullscreenElement read-only property returns the Element that is currently being
    * presented in full-screen mode in this document, or null if full-screen mode is not currently in use.
    *
    * Although this property is read-only, it will not throw if it is modified (even in strict mode); the setter is a
    * no-operation and it will be ignored.
    */
  def fullscreenElement: Element = js.native

  /** The read-only fullscreenEnabled property on the Document interface indicates whether or not full-screen mode is
    * available. Full-screen mode is available only for a page that has no windowed plug-ins in any of its documents,
    * and if all <iframe> elements which contain the document have their allowfullscreen attribute set.
    */
  def fullscreenEnabled: Boolean = js.native

  /** The Document interface's onfullscreenchange property is an event handler for the fullscreenchange event that is
    * fired immediately before a document transitions into or out of full-screen mode.
    */
  var onfullscreenchange: js.Function1[Event, _] = js.native

  /** The Document.onfullscreenerror property is an event handler for the fullscreenerror event that is sent to the
    * document when it fails to transition into full-screen mode after a prior call to Element.requestFullscreen().
    */
  var onfullscreenerror: js.Function1[Event, _] = js.native
}

trait MessageEventInit extends EventInit {
  var source: js.UndefOr[Window] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Any] = js.undefined
}

/** A MessageEvent is sent to clients using WebSockets when data is received from the server. This is delivered to the
  * listener indicated by the WebSocket object's onmessage attribute.
  */
@js.native
@JSGlobal
class MessageEvent(typeArg: String, init: js.UndefOr[MessageEventInit]) extends Event(typeArg, init) {
  def source: Window = js.native

  def origin: String = js.native

  /** The data you want contained in the MessageEvent.
    *
    * This can be of any data type, and will default to null if not specified.
    */
  def data: Any = js.native

  def ports: js.Any = js.native
}

/** The 2D rendering context for the drawing surface of a &lt;canvas&gt; element. To get this object, call getContext()
  * on a &lt;canvas&gt;, supplying "2d" as the argument:
  */
@js.native
@JSGlobal
class CanvasRenderingContext2D extends js.Object {

  /** Default 10 */
  var miterLimit: Double = js.native

  /** Default value 10px sans-serif */
  var font: String = js.native

  /** With globalAlpha applied this sets how shapes and images are drawn onto the existing bitmap. Possible values:
    * source-atop source-in source-out source-over (default) destination-atop destination-in destination-out
    * destination-over lighter darker copy xor
    */
  var globalCompositeOperation: String = js.native

  /** Type of endings on the end of lines. Possible values: butt (default), round, square */
  var lineCap: String = js.native

  /** Specifies where to start a dasharray on a line. */
  var lineDashOffset: Double = js.native

  /** Color of the shadow. Default fully-transparent black. */
  var shadowColor: String = js.native

  /** Defines the type of corners where two lines meet. Possible values: round, bevel, miter (default) */
  var lineJoin: String = js.native

  /** Horizontal distance the shadow will be offset. Default 0. */
  var shadowOffsetX: Double = js.native

  /** Width of lines. Default 1.0 */
  var lineWidth: Double = js.native

  /** Back-reference to the canvas element for which this context was created. Read only. */
  var canvas: HTMLCanvasElement = js.native

  /** A CSS color, a CanvasGradient or CanvasPattern, to use as a line around shapes. */
  var strokeStyle: js.Any = js.native

  /** Alpha value that is applied to shapes and images before they are composited onto the canvas. Default 1.0 (opaque).
    */
  var globalAlpha: Double = js.native

  /** Vertical distance the shadow will be offset. Default 0. */
  var shadowOffsetY: Double = js.native

  /** A CSS color, a CanvasGradient or CanvasPattern, to use as a fill. */
  var fillStyle: js.Any = js.native

  /** Specifies the blurring effect. Default 0 */
  var shadowBlur: Double = js.native

  /** Possible values: start (default), end, left, right or center. */
  var textAlign: String = js.native

  /** Possible values: top, hanging, middle, alphabetic (default), ideographic, bottom */
  var textBaseline: String = js.native

  /** A boolean value indicating whether to smooth scaled images or not. The default value is true. */
  var imageSmoothingEnabled: Boolean = js.native

  /** Restores the drawing style state to the last element on the 'state stack' saved by save(). */
  def restore(): Unit = js.native

  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /** Saves the current drawing style state using a stack so you can revert any change you make to it using restore().
    */
  def save(): Unit = js.native

  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double,
      anticlockwise: Boolean): Unit = js.native

  /** Adds an arc to the path which is centered at (x, y) position with radius r starting at startAngle and ending at
    * endAngle going in the given direction by anticlockwise (defaulting to clockwise).
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native

  def measureText(text: String): TextMetrics = js.native

  def isPointInPath(x: Double, y: Double, fillRule: String): Boolean = js.native

  /** Reports whether or not the specified point is contained in the current path. */
  def isPointInPath(x: Double, y: Double): Boolean = js.native

  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native

  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double = js.native, dirtyY: Double = js.native,
      dirtyWidth: Double = js.native, dirtyHeight: Double = js.native): Unit = js.native

  def rotate(angle: Double): Unit = js.native

  def fillText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /** Moves the origin point of the context to (x, y). */
  def translate(x: Double, y: Double): Unit = js.native

  def scale(x: Double, y: Double): Unit = js.native

  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double,
      r1: Double): CanvasGradient = js.native

  /** Connects the last point in the subpath to the x, y coordinates with a straight line. */
  def lineTo(x: Double, y: Double): Unit = js.native

  /** Returns a dash list array containing an even number of non-negative numbers. */
  def getLineDash(): js.Array[Double] = js.native

  /** Fills the subpaths with the current fill style. */
  def fill(): Unit = js.native

  /** Creates a new, blank ImageData object with the specified dimensions. All of the pixels in the new object are
    * transparent black.
    */
  def createImageData(imageDataOrSw: js.Any, sh: Double = js.native): ImageData = js.native

  def createPattern(image: HTMLElement, repetition: String): CanvasPattern = js.native

  /** Tries to draw a straight line from the current point to the start. If the shape has already been closed or has
    * only one point, this function does nothing.
    */
  def closePath(): Unit = js.native

  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the
    * clipping path only. For an example, see Clipping paths in the Canvas tutorial.
    */
  def clip(fillRule: String = js.native): Unit = js.native

  /** Sets all pixels in the rectangle defined by starting point (x, y) and size (width, height) to transparent black.
    */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /** Moves the starting point of a new subpath to the (x, y) coordinates. */
  def moveTo(x: Double, y: Double): Unit = js.native

  /** Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted by the
    * rectangle which starts at (sx, sy) and has an sw width and sh height.
    */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native

  /** Draws a filled rectangle at (x, y) position whose size is determined by width and height. */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native

  /** Draws the specified image. This method is available in multiple formats, providing a great deal of flexibility in
    * its use.
    */
  def drawImage(image: HTMLElement, offsetX: Double, offsetY: Double, width: Double = js.native,
      height: Double = js.native, canvasOffsetX: Double = js.native, canvasOffsetY: Double = js.native,
      canvasImageWidth: Double = js.native, canvasImageHeight: Double = js.native): Unit = js.native

  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /** Strokes the subpaths with the current stroke style. */
  def stroke(): Unit = js.native

  /** Paints a rectangle which has a starting point at (x, y) and has a w width and an h height onto the canvas, using
    * the current stroke style.
    */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  def setLineDash(segments: js.Array[Double]): Unit = js.native

  def strokeText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /** Starts a new path by resetting the list of sub-paths. Call this method when you want to create a new path. */
  def beginPath(): Unit = js.native

  /** Adds an arc with the given control points and radius, connected to the previous point by a straight line. */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native

  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native

  /** The ellipse() method creates an elliptical arc centered at (x, y) with the radii radiusX and radiusY. The path
    * starts at startAngle and ends at endAngle, and travels in the direction given by anticlockwise (defaulting to
    * clockwise).
    */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double,
      endAngle: Double, anticlockwise: Boolean = js.native): Unit = js.native
}

/** XMLHttpRequest is a JavaScript object that was designed by Microsoft and adopted by Mozilla, Apple, and Google. It's
  * now being standardized in the W3C. It provides an easy way to retrieve data from a URL without having to do a full
  * page refresh. A Web page can update just a part of the page without disrupting what the user is doing.
  * XMLHttpRequest is used heavily in AJAX programming.
  *
  * Despite its name, XMLHttpRequest can be used to retrieve any type of data, not just XML, and it supports protocols
  * other than HTTP (including file and ftp).
  */
@js.native
@JSGlobal
class XMLHttpRequest extends EventTarget {

  /** The status of the response to the request. This is the HTTP result code (for example, status is 200 for a
    * successful request).
    */
  def status: Int = js.native

  /** The state of the request: Value State Description 0 UNSENT open()has not been called yet. 1 OPENED send()has not
    * been called yet. 2 HEADERS_RECEIVED send() has been called, and headers and status are available. 3 LOADING
    * Downloading; responseText holds partial data. 4 DONE The operation is complete.
    */
  def readyState: Int = js.native

  /** The response to the request as text, or null if the request was unsuccessful or has not yet been sent. */
  def responseText: String = js.native

  /** The response to the request as a DOM Document object, or null if the request was unsuccessful, has not yet been
    * sent, or cannot be parsed as XML or HTML. The response is parsed as if it were a text/xml stream. When the
    * responseType is set to "document" and the request has been made asynchronously, the response is parsed as a
    * text/html stream. Note: If the server doesn't apply the text/xml Content-Type header, you can use
    * overrideMimeType() to force XMLHttpRequest to parse it as XML anyway.
    */
  def responseXML: Document = js.native

  /** Returns the serialized URL of the response or the empty string if the URL is null. If the URL is returned, URL
    * fragment if present in the URL will be stripped away. The value of responseURL will be the final URL obtained
    * after any redirects.
    *
    * This property should be a String, but it isn't implemented by IE, even as new as IE11, hence it must be UndefOr.
    */
  def responseURL: js.UndefOr[String] = js.native

  var ontimeout: js.Function1[ProgressEvent, _] = js.native

  /** The response string returned by the HTTP server. Unlike status, this includes the entire text of the response
    * message ("200 OK", for example).
    */
  def statusText: String = js.native

  var onreadystatechange: js.Function1[Event, _] = js.native

  /** The number of milliseconds a request can take before automatically being terminated. A value of 0 (which is the
    * default) means there is no timeout. Note: You may not use a timeout for synchronous requests with an owning
    * window.
    */
  var timeout: Double = js.native
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** Initializes a request. This method is to be used from JavaScript code; to initialize a request from native code,
    * use openRequest()instead.
    */
  def open(method: String, url: String, async: Boolean = js.native, user: String = js.native,
      password: String = js.native): Unit = js.native

  def create(): XMLHttpRequest = js.native

  /** Sends the request. If the request is asynchronous (which is the default), this method returns as soon as the
    * request is sent. If the request is synchronous, this method doesn't return until the response has arrived.
    */
  def send(data: js.Any = js.native): Unit = js.native

  /** Aborts the request if it has already been sent. */
  def abort(): Unit = js.native

  /** The XMLHttpRequest method overrideMimeType() specifies a MIME type other than the one provided by the server to be
    * used instead when interpreting the data being transferred in a request. This may be used, for example, to force a
    * stream to be treated and parsed as "text/xml", even if the server does not report it as such. This method must be
    * called before calling send().
    */
  def overrideMimeType(mimeType: String): Unit = js.native

  def getAllResponseHeaders(): String = js.native

  /** Sets the value of an HTTP request header. You must call setRequestHeader() after open(), but before send(). If
    * this method is called several times with the same header, the values are merged into one single request header.
    */
  def setRequestHeader(header: String, value: String): Unit = js.native

  def getResponseHeader(header: String): String = js.native

  /** The response entity body according to responseType, as an ArrayBuffer, Blob, Document, JavaScript object (for
    * "json"), or string. This is null if the request is not complete or was not successful.
    */
  def response: js.Any = js.native

  /** Indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies or
    * authorization headers. The default is false. Note: This never affects same-site requests. Note: Starting with
    * Gecko 11.0 (Firefox 11.0 / Thunderbird 11.0 / SeaMonkey 2.8), Gecko no longer lets you use the withCredentials
    * attribute when performing synchronous requests. Attempting to do so throws an NS_ERROR_DOM_INVALID_ACCESS_ERR
    * exception.
    */
  var withCredentials: Boolean = js.native
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** Can be set to change the response type. Value Data type of response property "" (empty string) String (this is the
    * default) "arraybuffer" ArrayBuffer "blob" Blob "document" Document "json" JavaScript object, parsed from a JSON
    * string returned by the server "text" String "moz-blob" Used by Firefox to allow retrieving partial Blob data from
    * progress events. This lets your progress event handler start processing data while it's still being received.
    * "moz-chunked-text" Similar to "text", but is streaming. This means that the value in response is only available
    * during dispatch of the "progress" event and only contains the data received since the last "progress" event. When
    * response is accessed during a "progress" event it contains a string with the data. Otherwise it returns null. This
    * mode currently only works in Firefox. "moz-chunked-arraybuffer" Similar to "arraybuffer", but is streaming. This
    * means that the value in response is only available during dispatch of the "progress" event and only contains the
    * data received since the last "progress" event. When response is accessed during a "progress" event it contains a
    * string with the data. Otherwise it returns null. This mode currently only works in Firefox. Note: Starting with
    * Gecko 11.0 (Firefox 11.0 / Thunderbird 11.0 / SeaMonkey 2.8), as well as WebKit build 528, these browsers no
    * longer let you use the responseType attribute when performing synchronous requests. Attempting to do so throws an
    * NS_ERROR_DOM_INVALID_ACCESS_ERR exception. This change has been proposed to the W3C for standardization.
    */
  var responseType: String = js.native
  var onloadend: js.Function1[ProgressEvent, _] = js.native

  /** The upload process can be tracked by adding an event listener to upload. */
  var upload: XMLHttpRequestEventTarget = js.native
  var onerror: js.Function1[ProgressEvent, _] = js.native
  var onloadstart: js.Function1[ProgressEvent, _] = js.native
}

@js.native
@JSGlobal
object XMLHttpRequest extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: Int = js.native
  var DONE: Int = js.native
  var UNSENT: Int = js.native
  var OPENED: Int = js.native
  var HEADERS_RECEIVED: Int = js.native
}

@js.native
@JSGlobal
class Screen extends js.Object {

  /** Note that not all of the width given by this property may be available to the window itself. When other widgets
    * occupy space that cannot be used by the window object, there is a difference in window.screen.width and
    * window.screen.availWidth. See also window.screen.height.
    */
  def width: Double = js.native

  /** Returns the amount of vertical space available to the window on the screen. */
  def availHeight: Double = js.native

  /** Returns the height of the screen in pixels. */
  def height: Double = js.native

  /** Returns the color depth of the screen. */
  def colorDepth: Int = js.native

  /** Returns the amount of horizontal space in pixels available to the window. */
  def availWidth: Double = js.native

  /** Returns the bit depth of the screen. */
  def pixelDepth: Int = js.native
}

/** The Coordinates interface represents the position and attitude of the device on Earth, as well as the accuracy with
  * which these data are computed.
  */
@js.native
trait Coordinates extends js.Object {

  /** The Coordinates.altitudeAccuracy read-only property is a strictly positive double representing the accuracy, with
    * a 95% confidence level, of the altitude expressed in meters. This value is null if the implementation doesn't
    * support measuring altitude.
    */
  def altitudeAccuracy: Double = js.native

  /** The Coordinates.longitude read-only property is a double representing the longitude of the position in decimal
    * degrees.
    */
  def longitude: Double = js.native

  /** The Coordinates.latitude read-only property is a double representing the latitude of the position in decimal
    * degrees.
    */
  def latitude: Double = js.native

  /** The Coordinates.speed read-only property is a double representing the velocity of the device in meters per second.
    * This value is null if the implementation is not able to measure it.
    */
  def speed: Double = js.native

  /** The Coordinates.heading read-only property is a double representing the direction in which the device is
    * traveling. This value, specified in degrees, indicates how far off from heading due north the device is. 0 degrees
    * represents true true north, and the direction is determined clockwise (which means that east is 90 degrees and
    * west is 270 degrees). If Coordinates.speed is 0, heading is NaN. If the device is not able to provide heading
    * information, this value is null.
    */
  def heading: Double = js.native

  /** The Coordinates.altitude read-only property is a double representing the altitude of the position in meters,
    * relative to sea level. This value is null if the implementation cannot provide this data.
    */
  def altitude: Double = js.native

  /** The Coordinates.accuracy read-only property is a strictly positive double representing the accuracy, with a 95%
    * confidence level, of the Coordinates.latitude and Coordinates.longitude properties expressed in meters.
    */
  def accuracy: Double = js.native
}

/** The NavigatorGeolocation interface contains a constructor method allowing objects implementing it to obtain a
  * Geolocation instance.
  *
  * There is no object of type NavigatorGeolocation, but some, like Navigator implements it.
  */
@js.native
trait NavigatorGeolocation extends js.Object {

  /** The NavigatorGeolocation.geolocation read-only property returns a Geolocation object that gives Web content access
    * to the location of the device. This allows a Web site or app offer customized results based on the user's
    * location.
    */
  def geolocation: Geolocation = js.native
}

@js.native
trait NavigatorContentUtils extends js.Object

/** When dragging, there are several operations that may be performed. The copy operation is used to indicate that the
  * data being dragged will be copied from its present location to the drop location. The move operation is used to
  * indicate that the data being dragged will be moved, and the link operation is used to indicate that some form of
  * relationship or connection will be created between the source and drop locations.
  *
  * You can specify which of the three operations are allowed for a drag source by setting the `effectAllowed` property
  * within a `dragstart` event listener.
  *
  * Note that these values must be used exactly as defined below.
  *
  * https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Drag_operations#drageffects
  */
object DragEffect {

  /** no operation is permitted */
  final val None = "none"

  /** copy only */
  final val Copy = "copy"

  /** move only */
  final val Move = "move"

  /** link only */
  final val Link = "link"

  /** copy or move only */
  final val CopyMove = "copyMove"

  /** copy or link only */
  final val CopyLink = "copyLink"

  /** link or move only */
  final val LinkMove = "linkMove"

  /** copy, move, or link */
  final val All = "all"
}

/** The DataTransfer object is used to hold the data that is being dragged during a drag and drop operation. It may hold
  * one or more data items, each of one or more data types. For more information about drag and drop, see Drag and Drop.
  *
  * This object is available from the dataTransfer property of all drag events. It cannot be created separately.
  */
@js.native
trait DataTransfer extends js.Object {

  /** Specifies the effects that are allowed for this drag. You may set this in the dragstart event to set the desired
    * effects for the source, and within the dragenter and dragover events to set the desired effects for the target.
    * The value is not used for other events.
    *
    * See [[DragEffect]] for possible values.
    */
  var effectAllowed: String = js.native

  /** The actual effect that will be used, and should always be one of the possible values of effectAllowed.
    *
    * See [[DragEffect]] for possible values.
    */
  var dropEffect: String = js.native

  /** Remove the data associated with a given type. The type argument is optional. If the type is empty or not
    * specified, the data associated with all types is removed. If data for the specified type does not exist, or the
    * data transfer contains no data, this method will have no effect.
    */
  def clearData(format: String = js.native): Unit = js.native

  /** Set the data for a given type. If data for the type does not exist, it is added at the end, such that the last
    * item in the types list will be the new format. If data for the type already exists, the existing data is replaced
    * in the same position. That is, the order of the types list is not changed when replacing data of the same type.
    */
  def setData(format: String, data: String): Unit = js.native

  /** Set the image to be used for dragging if a custom one is desired. Most of the time, this would not be set, as a
    * default image is created from the node that was dragged.
    *
    * If the node is an HTML img element, an HTML canvas element or a XUL image element, the image data is used.
    * Otherwise, image should be a visible node and the drag image will be created from this. If image is null, any
    * custom drag image is cleared and the default is used instead.
    *
    * The coordinates specify the offset into the image where the mouse cursor should be. To center the image, for
    * instance, use values that are half the width and height of the image.
    *
    * @param image
    *   An element to use as the drag feedback image.
    * @param x
    *   Horizontal offset within the image.
    * @param y
    *   Vertical offset within the image.
    */
  def setDragImage(image: Element, x: Double, y: Double): Unit = js.native

  /** Retrieves the data for a given type, or an empty string if data for that type does not exist or the data transfer
    * contains no data.
    *
    * A security error will occur if you attempt to retrieve data during a drag that was set from a different domain, or
    * the caller would otherwise not have access to. This data will only be available once a drop occurs during the drop
    * event.
    */
  def getData(format: String): String = js.native

  /** An array of the drag data formats (as strings) that were set in the dragstart event.
    *
    * The order of the formats is the same order as the data included in the drag operation.
    *
    * The formats are Unicode strings giving the type or format of the data, generally given by a MIME type. Some values
    * that are not MIME types are special-cased for legacy reasons (for example "text").
    */
  def types: js.Array[String] = js.native

  def files: FileList = js.native
}

trait ClipboardEventInit extends EventInit {

  /** The data for this clipboard event. */
  var data: js.UndefOr[String] = js.undefined

  /** The MIME type of the data. */
  var dataType: js.UndefOr[String] = js.undefined
}

/** The ClipboardEvent interface represents events providing information related to modification of the clipboard, that
  * is cut, copy, and paste events.
  */
@js.native
@JSGlobal
class ClipboardEvent(typeArg: String, init: js.UndefOr[ClipboardEventInit] = js.undefined)
    extends Event(typeArg, init) {

  /** Is a DataTransfer object containing the data affected by the user-initialed cut, copy, or paste operation, along
    * with its MIME type.
    */
  def clipboardData: DataTransfer = js.native
}

trait FocusEventInit extends UIEventInit {
  val relatedTarget: js.UndefOr[EventTarget] = js.undefined
}

/** The FocusEvent interface represents focus-related events like focus, blur, focusin, or focusout. */
@js.native
@JSGlobal
class FocusEvent(typeArg: String, init: js.UndefOr[FocusEventInit] = js.undefined) extends UIEvent(typeArg, init) {

  /** The FocusEvent.relatedTarget read-only property represents a secondary target for this event, which will depend of
    * the event itself. As in some cases (like when tabbing in or out a page), this property may be set to null for
    * security reasons.
    */
  def relatedTarget: EventTarget = js.native
}

/** The Range interface represents a fragment of a document that can contain nodes and parts of text nodes in a given
  * document.
  *
  * A range can be created using the createRange method of the Document object. Range objects can also be retrieved by
  * using the getRangeAt method of the Selection object. There also is the Range() constructor available.
  */
@js.native
@JSGlobal
class Range extends js.Object {

  /** The Range.startOffset read-only property returns a number representing where in the startContainer the Range
    * starts.
    */
  def startOffset: Int = js.native

  /** The Range.collapsed read-only property returns a Boolean flag indicating whether the start and end points of the
    * Range are at the same position. It returns true if the start and end boundary points of the Range are the same
    * point in the DOM, false if not.
    */
  def collapsed: Boolean = js.native

  /** The Range.endOffset read-only property returns a number representing where in the Range.endContainer the Range
    * ends.
    */
  def endOffset: Int = js.native

  /** The Range.startContainer read-only property returns the Node within which the Range starts. To change the start
    * position of a node, use one of the Range.setStart() methods.
    */
  def startContainer: Node = js.native

  /** The Range.endContainer read-only property returns the Node within which the Range ends. To change the end position
    * of a node, use the Range.setEnd() method or a similar one.
    */
  def endContainer: Node = js.native

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

/** The DOM Storage mechanism is a means through which string key/value pairs can be securely stored and later retrieved
  * for use. The goal of this addition is to provide a comprehensive means through which interactive applications can be
  * built (including advanced abilities, such as being able to work "offline" for extended periods of time).
  */
@js.native
@JSGlobal
class Storage extends js.Object {
  var length: Int = js.native

  def getItem(key: String): String = js.native

  def setItem(key: String, data: String): Unit = js.native

  def clear(): Unit = js.native

  def removeItem(key: String): Unit = js.native

  def key(index: Int): String = js.native
}

/** The DocumentType interface represents a Node containing a doctype. */
@js.native
@JSGlobal
abstract class DocumentType extends Node {
  def name: String = js.native

  def systemId: String = js.native

  def publicId: String = js.native
}

/** MutationObserver provides developers a way to react to changes in a DOM. It is designed as a replacement for
  * Mutation Events defined in the DOM3 Events specification.
  */
@js.native
@JSGlobal
class MutationObserver(callback: js.Function2[js.Array[MutationRecord], MutationObserver, _]) extends js.Object {

  /** Registers the MutationObserver instance to receive notifications of DOM mutations on the specified node. */
  def observe(target: Node, options: MutationObserverInit): Unit = js.native

  /** Stops the MutationObserver instance from receiving notifications of DOM mutations. Until the observe() method is
    * used again, observer's callback will not be invoked.
    */
  def disconnect(): Unit = js.native

  /** Empties the MutationObserver instance's record queue and returns what was in there. */
  def takeRecords(): js.Array[MutationRecord] = js.native
}

/** MutationObserverInit is an object which can specify the following properties: NOTE: At the very least, childList,
  * attributes, or characterDatamust be set to true. Otherwise, "An invalid or illegal string was specified" error is
  * thrown.
  */
@js.native
trait MutationObserverInit extends js.Object {

  /** Set to true if additions and removals of the target node's child elements (including text nodes) are to be
    * observed.
    */
  var childList: js.UndefOr[Boolean] = js.native

  /** Set to true if mutations to target's attributes are to be observed. */
  var attributes: js.UndefOr[Boolean] = js.native

  /** Set to true if mutations to target's data are to be observed. */
  var characterData: js.UndefOr[Boolean] = js.native

  /** Set to true if mutations to not just target, but also target's descendants are to be observed. */
  var subtree: js.UndefOr[Boolean] = js.native

  /** Set to true if attributes is set to true and target's attribute value before the mutation needs to be recorded. */
  var attributeOldValue: js.UndefOr[Boolean] = js.native

  /** Set to true if characterData is set to true and target's data before the mutation needs to be recorded. */
  var characterDataOldValue: js.UndefOr[Boolean] = js.native

  /** Set to an array of attribute local names (without namespace) if not all attribute mutations need to be observed.
    */
  var attributeFilter: js.UndefOr[js.Array[String]] = js.native
}

/** Factory for [[MutationObserverInit]] objects. */
object MutationObserverInit {

  /** Creates a new [[MutationObserverInit]] object with the given values. Default values for the `Boolean` parameters
    * are `false`. If the value of `attributeFilter` is `js.undefined`, created object won't have `attributeFilter`
    * property.
    */
  def apply(
      childList: Boolean = false, attributes: Boolean = false, characterData: Boolean = false, subtree: Boolean = false,
      attributeOldValue: Boolean = false, characterDataOldValue: Boolean = false,
      attributeFilter: js.UndefOr[js.Array[String]] = js.undefined
  ): MutationObserverInit = {
    val res = js.Dynamic
      .literal(
          "childList" -> childList,
          "attributes" -> attributes,
          "characterData" -> characterData,
          "subtree" -> subtree,
          "attributeOldValue" -> attributeOldValue,
          "characterDataOldValue" -> characterDataOldValue
      )
      .asInstanceOf[MutationObserverInit]
    attributeFilter.foreach(res.attributeFilter = _)
    res
  }
}

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

@js.native
trait DragEvent extends MouseEvent {
  def dataTransfer: DataTransfer = js.native
}

/** The PerformanceTiming interface represents timing-related performance information for the given page. */
@js.native
@JSGlobal
class PerformanceTiming extends js.Object {

  /** The PerformanceTiming.redirectStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the first HTTP redirect starts. If there is no redirect, or if one of the
    * redirect is not of the same origin, the value returned is 0.
    */
  def redirectStart: Double = js.native

  /** The PerformanceTiming.domainLookupEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the domain lookup is finished. If a persistent connection is used, or the
    * information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
    */
  def domainLookupEnd: Double = js.native

  /** The PerformanceTiming.responseStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser received the first byte of the response, from the server from
    * a cache, of from a local resource.
    */
  def responseStart: Double = js.native

  /** The PerformanceTiming.domComplete read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its
    * Document.readyState changes to 'complete' and the corresponding readystatechange event is thrown.
    */
  def domComplete: Double = js.native

  /** The PerformanceTiming.domainLookupStart read-only property returns an unsigned long long representing the moment,
    * in milliseconds since the UNIX epoch, where the domain lookup starts. If a persistent connection is used, or the
    * information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
    */
  def domainLookupStart: Double = js.native

  /** The PerformanceTiming.loadEventStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the load event was sent for the current document. If this event has not
    * yet been sent, it returns 0.
    */
  def loadEventStart: Double = js.native

  /** The PerformanceTiming.unloadEventEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the unload event handler finishes. If there is no previous document, or if the
    * previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
    */
  def unloadEventEnd: Double = js.native

  /** The PerformanceTiming.fetchStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the browser is ready to fetch the document using an HTTP request. This moment
    * is before the check to any application cache.
    */
  def fetchStart: Double = js.native

  /** The PerformanceTiming.requestStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser sent the request to obtain the actual document, from the
    * server or from a cache. If the transport layer fails after the start of the request and the connection is
    * reopened, this property will be set to the time corresponding to the new request.
    */
  def requestStart: Double = js.native

  /** The PerformanceTiming.domInteractive read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its
    * Document.readyState changes to 'interactive' and the corresponding readystatechange event is thrown.
    */
  def domInteractive: Double = js.native

  /** The PerformanceTiming.navigationStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, right after the prompt for unload terminates on the previous document in the
    * same browsing context. If there is no previous document, this value will be the same as
    * PerformanceTiming.fetchStart.
    */
  def navigationStart: Double = js.native

  /** The PerformanceTiming.connectEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the connection is opened network. If the transport layer reports an error
    * and the connection establishment is started again, the last connection establisment end time is given. If a
    * persistent connection is used, the value will be the same as PerformanceTiming.fetchStart. A connection is
    * considered as opened when all secure connection handshake, or SOCKS authentication, is terminated.
    */
  def connectEnd: Double = js.native

  /** The PerformanceTiming.loadEventEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the load event handler terminated, that is when the load event is
    * completed. If this event has not yet been sent, or is not yet completed, it returns 0.
    */
  def loadEventEnd: Double = js.native

  /** The PerformanceTiming.connectStart read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, where the request to open a connection is sent to the network. If the transport
    * layer reports an error and the connection establishment is started again, the last connection establisment start
    * time is given. If a persistent connection is used, the value will be the same as PerformanceTiming.fetchStart.
    */
  def connectStart: Double = js.native

  /** The PerformanceTiming.responseEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the browser received the last byte of the response, or when the connection
    * is closed if this happened first, from the server from a cache, of from a local resource.
    */
  def responseEnd: Double = js.native

  /** The PerformanceTiming.domLoading read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, when the parser started its work, that is when its Document.readyState changes
    * to 'loading' and the corresponding readystatechange event is thrown.
    */
  def domLoading: Double = js.native

  /** The PerformanceTiming.redirectEnd read-only property returns an unsigned long long representing the moment, in
    * milliseconds since the UNIX epoch, the last HTTP redirect is completed, that is when the last byte of the HTTP
    * response has been received. If there is no redirect, or if one of the redirect is not of the same origin, the
    * value returned is 0.
    */
  def redirectEnd: Double = js.native

  /** The PerformanceTiming.unloadEventStart read-only property returns an unsigned long long representing the moment,
    * in milliseconds since the UNIX epoch, the unload event has been thrown. If there is no previous document, or if
    * the previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
    */
  def unloadEventStart: Double = js.native

  /** The PerformanceTiming.domContentLoadedEventStart read-only property returns an unsigned long long representing the
    * moment, in milliseconds since the UNIX epoch, right before the parser sent the DOMContentLoaded event, that is
    * right after all the scripts that need to be executed right after parsing has been executed.
    */
  def domContentLoadedEventStart: Double = js.native

  /** The PerformanceTiming.domContentLoadedEventEnd read-only property returns an unsigned long long representing the
    * moment, in milliseconds since the UNIX epoch, right after all the scripts that need to be executed as soon as
    * possible, in order or not, has been executed.
    */
  def domContentLoadedEventEnd: Double = js.native

  /** Is a jsonizer returning a JSON object representing the specific PerformanceTiming object. */
  def toJSON(): js.Dynamic = js.native
}

@js.native
trait EventException extends js.Object {
  def code: Int = js.native

  def message: String = js.native

  def name: String = js.native
}

@js.native
@JSGlobal
object EventException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(EventException),List())))) */
  val DISPATCH_REQUEST_ERR: Int = js.native
  val UNSPECIFIED_EVENT_TYPE_ERR: Int = js.native
}

/** The NavigatorOnLine interface contains methods and properties related to the connectivity status of the browser. */
@js.native
trait NavigatorOnLine extends js.Object {

  /** Returns the online status of the browser. The property returns a boolean value, with true for being online and
    * false for being offline. The property sends updates whenever the browser's ability to connect to the network
    * changes. The update occurs when the user follows links or when a script requests a remote page. For example, the
    * property should return false when users click links soon after they lose internet connection.
    */
  def onLine: Boolean = js.native
}

/** NavigatorLanguage contains methods and properties related to the language of the navigator. */
@js.native
trait NavigatorLanguage extends js.Object {

  /** Returns a DOMString representing the preferred language of the user, usually the language of the browser UI. The
    * null value is returned when this is unknown.
    */
  def language: String = js.native

  /** Returns a Array of DOMStrings representing the the user's preferred languages. The language is described using BCP
    * 47 language tags. The null value is returned when this is unknown.
    */
  def languages: js.Array[String] = js.native
}

@js.native
trait WindowLocalStorage extends js.Object {
  def localStorage: Storage = js.native
}

@js.native
trait NavigatorStorageUtils extends js.Object

@js.native
trait NavigatorVibration extends js.Object {

  /** Vibrate the device for the specified number of milliseconds. */
  def vibrate(duration: Double): Boolean = js.native

  /** Vibrate the device in the given pattern.
    *
    * @param pattern
    *   the pattern to vibrate. The first number is the initial duration, the subsequent a delay of silence, and so on.
    */
  def vibrate(pattern: js.Array[Double]): Boolean = js.native
}

/** The Location interface represents the location of the object it is linked to. Changes done on it are reflected on
  * the object it relates to. Both the Document and Window interface have such a linked Location, accessible via
  * Document.location and Window.location respectively.
  */
@js.native
trait Location extends js.Object {

  /** Is a DOMString containing a '#' followed by the fragment identifier of the URL. */
  var hash: String = js.native

  /** Is a DOMString containing the protocol scheme of the URL, including the final ':'. */
  var protocol: String = js.native

  /** Is a DOMString containing a '?' followed by the parameters of the URL. */
  var search: String = js.native

  /** Is a DOMString containing the whole URL. */
  var href: String = js.native

  /** Is a DOMString containing the domain of the URL. */
  var hostname: String = js.native

  /** Is a DOMString containing the port number of the URL. */
  var port: String = js.native

  /** Is a DOMString containing an initial '/' followed by the path of the URL. */
  var pathname: String = js.native

  /** Is a DOMString containing the host, that is the hostname, a ':', and the port of the URL. */
  var host: String = js.native

  /** The origin read-only property is a String containing the Unicode serialization of the origin of the represented
    * URL, that is, for http and https, the scheme followed by '://', followed by the domain, followed by ':', followed
    * by the port (the default port, 80 and 443 respectively, if explicitly specified). For URL using file: scheme, the
    * value is browser dependant.
    *
    * This property also does not exist consistently on IE, even as new as IE11, hence it must be UndefOr.
    */
  def origin: js.UndefOr[String] = js.native

  /** The Location.reload()method Reloads the resource from the current URL. Its optional unique parameter is a Boolean,
    * which, when it is true, causes the page to always be reloaded from the server. If it is false or not specified,
    * the browser may reload the page from its cache.
    */
  def reload(flag: Boolean = js.native): Unit = js.native

  /** The Location.replace()method replaces the current resource with the one at the provided URL. The difference from
    * the assign() method is that after using replace() the current page will not be saved in session History, meaning
    * the user won't be able to use the back button to navigate to it.
    */
  def replace(url: String): Unit = js.native

  /** The Location.assign()method loading the object at the URL providing in parameter. */
  def assign(url: String): Unit = js.native
}

@js.native
@JSGlobal
class PerformanceEntry extends js.Object {
  def name: String = js.native

  def startTime: Double = js.native

  def duration: Int = js.native

  def entryType: String = js.native
}

trait UIEventInit extends EventInit {
  val detail: js.UndefOr[Int] = js.undefined
  val view: js.UndefOr[Window] = js.undefined
}

/** The DOM UIEvent represents simple user interface events. */
@js.native
@JSGlobal
class UIEvent(typeArg: String, init: js.UndefOr[UIEventInit] = js.undefined) extends Event(typeArg, init) {

  /** Detail about the event, depending on the type of event. Read only. */
  def detail: Int = js.native

  /** A view which generated the event. Read only. */
  def view: Window = js.native
}

trait WheelEventInit extends MouseEventInit {
  var deltaZ: js.UndefOr[Double] = js.undefined
  var deltaX: js.UndefOr[Double] = js.undefined
  var deltaY: js.UndefOr[Double] = js.undefined
  var deltaMode: js.UndefOr[Int] = js.undefined
}

/** The DOM WheelEvent represents events that occur due to the user moving a mouse wheel or similar input device. */
@js.native
@JSGlobal
class WheelEvent(typeArg: String, init: js.UndefOr[WheelEventInit]) extends MouseEvent(typeArg, init) {

  /** Scroll amount for the z-axis. Read only. */
  def deltaZ: Double = js.native

  /** Horizontal scroll amount. Read only. */
  def deltaX: Double = js.native

  /** Unit of delta values. See Delta modes for a list of permitted values. Read only. */
  def deltaMode: Int = js.native

  /** Vertical scroll amount. Read only. */
  def deltaY: Double = js.native
}

@js.native
@JSGlobal
object WheelEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  /** The delta values are specified in pixels. */
  val DOM_DELTA_PIXEL: Int = js.native

  /** The delta values are specified in lines. */
  val DOM_DELTA_LINE: Int = js.native

  /** The delta values are specified in pages. */
  val DOM_DELTA_PAGE: Int = js.native
}

/** The Text interface represents the textual content of Element or Attr.  If an element has no markup within its
  * content, it has a single child implementing Text that contains the element's text.  However, if the element contains
  * markup, it is parsed into information items and Text nodes that form its children.
  *
  * New documents have a single Text node for each block of text. Over time, more Text nodes may be created as the
  * document's content changes. The Node.normalize() method merges adjacent Text objects back into a single node for
  * each block of text.
  */
@js.native
@JSGlobal
class Text extends CharacterData {

  /** The Text.wholeText read-only property returns all text of all Text nodes logically adjacent to the node. The text
    * is concatenated in document order.  This allows to specify any text node and obtain all adjacent text as a single
    * string.
    */
  def wholeText: String = js.native

  /** The Text.splitText() method breaks the Textnode into two nodes at the specified offset, keeping both nodes in the
    * tree as siblings.
    */
  def splitText(offset: Int): Text = js.native
}

/** The PositionError interface represents the reason of an error occuring when using the geolocating device. */
@js.native
trait PositionError extends js.Object {

  /** Returns an unsigned short representing the error code. The following values are possible: Value Associated
    * constant Description 1 PERMISSION_DENIED The acquisition of the geolocation information failed because the page
    * didn't had the permission to do it. 2 POSITION_UNAVAILABLE The acquisition of the geolocation failed because one
    * or several internal source of position returned an internal error. 3 TIMEOUT The time allowed to acquire the
    * geolocation, defined by PositionOptions.timeout information was reached before the information was obtained.
    */
  def code: Int = js.native

  /** The PositionError.message read-only property returns a human-readable DOMString describing the details of the
    * error.
    */
  def message: String = js.native
}

@js.native
@JSGlobal
object PositionError extends js.Object {

  val POSITION_UNAVAILABLE: Int = js.native
  val PERMISSION_DENIED: Int = js.native
  val TIMEOUT: Int = js.native
}

@js.native
@JSGlobal
class StyleSheetList extends js.Object {
  def length: Int = js.native

  def item(index: Int): StyleSheet = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): StyleSheet = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: StyleSheet): Unit = js.native
}

trait CustomEventInit extends EventInit {
  var detail: js.UndefOr[Any] = js.undefined
}

/** The DOM CustomEvent are events initialized by an application for any purpose. */
@js.native
@JSGlobal
class CustomEvent(typeArg: String, init: js.UndefOr[CustomEventInit]) extends Event(typeArg, init) {

  /** The data passed when initializing the event. */
  def detail: Any = js.native
}

/** The Geolocation interface represents an object able to programmatically obtain the position of the device. It gives
  * Web content access to the location of the device. This allows a Web site or app offer customized results based on
  * the user's location.
  */
@js.native
trait Geolocation extends js.Object {

  /** The Geolocation.clearWatch() method is used to unregister location/error monitoring handlers previously installed
    * using Geolocation.watchPosition().
    */
  def clearWatch(watchId: Int): Unit = js.native

  def getCurrentPosition(successCallback: js.Function1[Position, _], errorCallback: js.Function1[PositionError, _],
      options: PositionOptions = js.native): Unit = js.native

  /** The Geolocation.getCurrentPosition() method is used to get the current position of the device. */
  def getCurrentPosition(successCallback: js.Function1[Position, _]): Unit = js.native

  /** The Geolocation.watchPosition() method is used to register a handler function that will be called automatically
    * each time the position of the device changes. You can also, optionally, specify an error handling callback
    * function.
    */
  def watchPosition(successCallback: js.Function1[Position, _],
      errorCallback: js.Function1[PositionError, _] = js.native, options: PositionOptions = js.native): Int = js.native
}

/** The History interface allows to manipulate the browser session history, that is the pages visited in the tab or
  * frame that the current page is loaded in.
  */
@js.native
@JSGlobal
class History extends js.Object {

  /** The History.length read-only property returns an Integer representing the number of elements in the session
    * history, including the currently loaded page. For example, for a page loaded in a new tab this property returns 1.
    */
  def length: Int = js.native

  /** Goes to the previous page in session history, the same action as when the user clicks the browser's Back button.
    * Equivalent to history.go(-1). Note: Calling this method to go back beyond the first page in the session history
    * has no effect and doesn't raise an exception.
    */
  def back(): Unit = js.native

  /** Goes to the next page in session history, the same action as when the user clicks the browser's Forward button;
    * this is equivalent to history.go(1). Note: Calling this method to go back beyond the last page in the session
    * history has no effect and doesn't raise an exception.
    */
  def forward(): Unit = js.native

  def go(delta: Int): Unit = js.native

  /** Loads a page from the session history, identified by its relative location to the current page, for example -1 for
    * the previous page or 1 for the next page. When integerDelta is out of bounds (e.g. -1 when there are no previously
    * visited pages in the session history), the method doesn't do anything and doesn't raise an exception. Calling go()
    * without parameters or with a non-integer argument has no effect (unlike Internet Explorer, which supports string
    * URLs as the argument).
    */
  def go(): Unit = js.native

  /** Returns an any value representing the state at the top of the history stack. This is a way to look at the state
    * without having to wait for a popstate event.
    */
  def state: js.Any = js.native

  def replaceState(statedata: js.Any, title: String, url: String): Unit = js.native

  /** Updates the most recent entry on the history stack to have the specified data, title, and, if provided, URL. The
    * data is treated as opaque by the DOM; you may specify any JavaScript object that can be serialized.  Note that
    * Firefox currently ignores the title parameter; for more information, see manipulating the browser history. Note:
    * In Gecko 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey 2.1) through Gecko 5.0 (Firefox 5.0 / Thunderbird 5.0 /
    * SeaMonkey 2.2), the passed object is serialized using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird 6.0 /
    * SeaMonkey 2.3), the object is serialized using the structured clone algorithm. This allows a wider variety of
    * objects to be safely passed.
    */
  def replaceState(statedata: js.Any, title: String): Unit = js.native

  def pushState(statedata: js.Any, title: String, url: String): Unit = js.native

  /** Pushes the given data onto the session history stack with the specified title and, if provided, URL. The data is
    * treated as opaque by the DOM; you may specify any JavaScript object that can be serialized.  Note that Firefox
    * currently ignores the title parameter; for more information, see manipulating the browser history. Note: In Gecko
    * 2.0 (Firefox 4 / Thunderbird 3.3 / SeaMonkey 2.1) through Gecko 5.0 (Firefox 5.0 / Thunderbird 5.0 / SeaMonkey
    * 2.2), the passed object is serialized using JSON. Starting in Gecko 6.0 (Firefox 6.0 / Thunderbird 6.0 / SeaMonkey
    * 2.3), the object is serialized using the structured clone algorithm. This allows a wider variety of objects to be
    * safely passed.
    */
  def pushState(statedata: js.Any, title: String): Unit = js.native
}

/** The TimeRanges interface is used to represent a set of time ranges, primarily for the purpose of tracking which
  * portions of media have been buffered when loading it for use by the &lt;audio&gt; and &lt;video&gt; elements.
  */
@js.native
@JSGlobal
class TimeRanges extends js.Object {

  /** Returns the number of ranges in the object. */
  def length: Int = js.native

  /** Returns the time for the start of the range with the specified index. */
  def start(index: Int): Double = js.native

  /** Returns the time offset at which a specified time range ends. */
  def end(index: Int): Double = js.native
}

@js.native
@JSGlobal
class BeforeUnloadEvent extends Event(js.native) {
  var returnValue: String = js.native
}

trait EventInit extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
}

/** Event handlers may be attached to various objects including DOM elements, document, the window object, etc. When an
  * event occurs, an event object is created and passed sequentially to the event listeners.
  *
  * The DOM Event interface is accessible from within the handler function, via the event object passed as the first
  * argument. The following simple example shows how an event object is passed to the event handler function, and can be
  * used from within one such function.
  */
@js.native
@JSGlobal
class Event(typeArg: String, init: js.UndefOr[EventInit] = js.undefined) extends js.Object {

  /** Returns the time (in milliseconds since the epoch) at which the event was created. */
  def timeStamp: Double = js.native

  /** Returns a boolean indicating whether or not event.preventDefault() was called on the event. */
  def defaultPrevented: Boolean = js.native

  /** Indicates whether or not the event was initiated by the browser (after a user click for instance) or by a script
    * (using an event creation method, like event.initEvent)
    */
  def isTrusted: Boolean = js.native

  /** Identifies the current target for the event, as the event traverses the DOM. It always refers to the element the
    * event handler has been attached to as opposed to event.target which identifies the element on which the event
    * occurred.
    */
  def currentTarget: EventTarget = js.native

  /** A boolean indicating whether the bubbling of the event has been canceled or not. */
  def cancelBubble: Boolean = js.native

  /** This property of event objects is the object the event was dispatched on. It is different than event.currentTarget
    * when the event handler is called in bubbling or capturing phase of the event.
    */
  def target: EventTarget = js.native

  /** Indicates which phase of the event flow is currently being evaluated. */
  def eventPhase: Int = js.native

  /** A boolean indicating whether the event is cancelable. */
  def cancelable: Boolean = js.native

  def `type`: String = js.native

  /** A boolean indicating whether the event bubbles up through the DOM or not. */
  def bubbles: Boolean = js.native

  /** Stops the propagation of events further along in the DOM. */
  def stopPropagation(): Unit = js.native

  /** For this particular event, no other listener will be called. Neither those attached on the same element, nor those
    * attached on elements which will be traversed later (in capture phase, for instance)
    */
  def stopImmediatePropagation(): Unit = js.native

  /** Cancels the event if it is cancelable, without stopping further propagation of the event. */
  def preventDefault(): Unit = js.native
}

@js.native
@JSGlobal
object Event extends js.Object {
  def CAPTURING_PHASE: Int = js.native

  def AT_TARGET: Int = js.native

  def BUBBLING_PHASE: Int = js.native
}

/** The ImageData interface represents the underlying pixel data of an area of a &lt;canvas&gt; element. It is created
  * using creators on the CanvasRenderingContext2D object associated with the canvas createImageData() and
  * getImageData()). It can also be used to set a part of the canvas (like with putImageData()).
  */
@js.native
@JSGlobal
class ImageData extends js.Object {

  /** Is an unsigned long representing the actual width, in pixels, of the ImageData. */
  def width: Int = js.native

  /** Is a Uint8ClampedArray representing a one-dimensional array containing the data in the RGBA order, with integer
    * values between 0 and 255 (included).
    */
  def data: js.Array[Int] = js.native

  /** Is an unsigned long representing the actual height, in pixels, of the ImageData. */
  def height: Int = js.native
}

/** A collection of nodes returned by Node.attributes (also potentially for DocumentType.entities,
  * DocumentType.notations). NamedNodeMaps are not in any particular order (unlike NodeList, although they may be
  * accessed by an index as in an array (they may also be accessed with the item method). A NamedNodeMap object are live
  * and will thus be auto-updated if changes are made to their contents internally or elsewhere.
  */
@js.native
@JSGlobal
class NamedNodeMap extends js.Object {
  def length: Int = js.native

  def removeNamedItemNS(namespaceURI: String, localName: String): Attr = js.native

  def item(index: Int): Attr = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): Attr = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: Attr): Unit = js.native

  def removeNamedItem(name: String): Attr = js.native

  def getNamedItem(name: String): Attr = js.native

  def setNamedItem(arg: Attr): Attr = js.native

  def getNamedItemNS(namespaceURI: String, localName: String): Attr = js.native

  def setNamedItemNS(arg: Attr): Attr = js.native
}

object NamedNodeMap {

  implicit def namedNodeMapAsMap(namedNodeMap: NamedNodeMap): mutable.Map[String, Attr] =
    new NamedNodeMapMap(namedNodeMap)
}

@js.native
@JSGlobal
class MediaList extends js.Object {
  def length: Int = js.native

  def mediaText: String = js.native

  def deleteMedium(oldMedium: String): Unit = js.native

  def appendMedium(newMedium: String): Unit = js.native

  def item(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: String): Unit = js.native
}

/** A processing instruction provides an opportunity for application-specific instructions to be embedded within XML and
  * which can be ignored by XML processors which do not support processing their instructions (outside of their having a
  * place in the DOM).
  */
@js.native
@JSGlobal
abstract class ProcessingInstruction extends Node {
  def target: String = js.native

  def data: String = js.native
}

trait TextEventInit extends UIEventInit {
  var inputMethod: js.UndefOr[Int] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

@js.native
@JSGlobal
class TextEvent(typeArg: String, init: js.UndefOr[TextEventInit]) extends UIEvent(typeArg, init) {
  def inputMethod: Int = js.native

  def data: String = js.native

  def locale: String = js.native

  def initTextEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, dataArg: String,
      inputMethod: Int, locale: String): Unit = js.native
}

@js.native
@JSGlobal
object TextEvent extends js.Object {
  val DOM_INPUT_METHOD_KEYBOARD: Int = js.native
  val DOM_INPUT_METHOD_DROP: Int = js.native
  val DOM_INPUT_METHOD_IME: Int = js.native
  val DOM_INPUT_METHOD_SCRIPT: Int = js.native
  val DOM_INPUT_METHOD_VOICE: Int = js.native
  val DOM_INPUT_METHOD_UNKNOWN: Int = js.native
  val DOM_INPUT_METHOD_PASTE: Int = js.native
  val DOM_INPUT_METHOD_HANDWRITING: Int = js.native
  val DOM_INPUT_METHOD_OPTION: Int = js.native
  val DOM_INPUT_METHOD_MULTIMODAL: Int = js.native
}

/** The DocumentFragment interface represents a minimal document object that has no parent. It is used as a light-weight
  * version of Document to store well-formed or potentially non-well-formed fragments of XML.
  */
@js.native
@JSGlobal
abstract class DocumentFragment extends Node with NodeSelector

/** The Position interface represents the position of the concerned device at a given time. The position, represented by
  * a Coordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its
  * altitude and its speed.
  */
@js.native
trait Position extends js.Object {

  /** The Position.timestamp read-only property, a DOMTimeStamp object, represents the date and the time of the creation
    * of the Position object it belongs to. The precision is to the millisecond.
    */
  def timestamp: Double = js.native

  /** The Position.coords read-only property, a Coordinates object, represents a geographic attitude: it contains the
    * location, that is longitude and latitude on the Earth, the altitude, and the speed of the object concerned,
    * regrouped inside the returned value. It also contains accuracy information about these values.
    */
  def coords: Coordinates = js.native
}

@js.native
@JSGlobal
class PerformanceMark extends PerformanceEntry

/** An object implementing the StyleSheet interface represents a single style sheet. CSS style sheets will further
  * implement the more specialized CSSStyleSheet interface.
  */
@js.native
@JSGlobal
class StyleSheet extends js.Object {

  /** Returns a DOMString representing the location of the stylesheet. */
  def href: String = js.native

  /** Is a Boolean representing whether the current stylesheet has been applied or not. */
  def disabled: Boolean = js.native

  /** ownerNode returns the node that associates this style sheet with the document. */
  def ownerNode: Node = js.native

  /** Returns a StyleSheet including this one, if any; returns null if there aren't any. */
  def parentStyleSheet: StyleSheet = js.native

  /** Returns a MediaList representing the intended destination medium for style information. */
  def media: MediaList = js.native

  /** Returns a DOMString representing the style sheet language for this style sheet. */
  def `type`: String = js.native

  /** Returns a DOMString representing the advisory title of the current style sheet. */
  def title: String = js.native
}

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

/** NodeList objects are collections of nodes such as those returned by Node.childNodes and the querySelectorAll method.
  */
@js.native
@JSGlobal
class NodeList[+T <: Node] private[this] () extends DOMList[T] {
  def item(index: Int): T = js.native
}

@js.native
@JSGlobal
class XMLSerializer extends js.Object {
  def serializeToString(target: Node): String = js.native
}

@js.native
@JSGlobal
class PerformanceMeasure extends PerformanceEntry

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

@js.native
@JSGlobal
class MediaError extends js.Object {
  def code: Int = js.native
}

@js.native
@JSGlobal
object MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Int = js.native
  val MEDIA_ERR_NETWORK: Int = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Int = js.native
  val MEDIA_ERR_DECODE: Int = js.native
}

/** The Comment interface represents textual notations within markup; although it is generally not visually shown, such
  * comments are available to be read in the source view. Comments are represented in HTML and XML as content between
  * '&lt;!--' and '--&gt;'. In XML, the character sequence '--' cannot be used within a comment.
  */
@js.native
@JSGlobal
class Comment extends CharacterData {
  var text: String = js.native
}

@js.native
@JSGlobal
class PerformanceResourceTiming extends PerformanceEntry {
  def redirectStart: Int = js.native

  def redirectEnd: Int = js.native

  def domainLookupEnd: Int = js.native

  def responseStart: Int = js.native

  def domainLookupStart: Int = js.native

  def fetchStart: Int = js.native

  def requestStart: Int = js.native

  def connectEnd: Int = js.native

  def connectStart: Int = js.native

  def initiatorType: String = js.native

  var responseEnd: Int = js.native
}

/** The CanvasPattern interface represents an opaque object describing a pattern, based on a image, a canvas or a video,
  * created by the CanvasRenderingContext2D.createPattern() method.
  */
@js.native
@JSGlobal
class CanvasPattern extends js.Object

trait StorageEventInit extends EventInit {
  var oldValue: js.UndefOr[String] = js.undefined
  var newValue: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var storageArea: js.UndefOr[Storage] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

/** A StorageEvent is sent to a window when a storage area changes. */
@js.native
@JSGlobal
class StorageEvent(typeArg: String, init: js.UndefOr[StorageEventInit]) extends Event(typeArg, init) {

  /** The original value of the key. The oldValue is null when the change has been invoked by storage clear() method or
    * the key has been newly added and therefor doesn't have any previous value. Read only.
    */
  def oldValue: String = js.native

  /** The new value of the key. The newValue is null when the change has been invoked by storage clear() method or the
    * key has been removed from the storage. Read only.
    */
  def newValue: String = js.native

  /** The URL of the document whose key changed. Read only. */
  def url: String = js.native

  /** Represents the Storage object that was affected. Read only. */
  def storageArea: Storage = js.native

  /** Represents the key changed. The key attribute is null when the change is caused by the storage clear() method.
    * Read only.
    */
  def key: String = js.native
}

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract
  * interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text,
  * Comment, or ProcessingInstruction which aren't abstract.
  */
@js.native
@JSGlobal
abstract class CharacterData extends Node with NonDocumentTypeChildNode {

  /** Returns an unsigned long representing the size of the string contained in CharacterData.data. */
  def length: Int = js.native

  /** Is a DOMString representing the textual data contained in this object. */
  var data: String = js.native

  /** Removes the specified amount of characters, starting at the specified offset, from the CharacterData.data string;
    * when this method returns, data contains the shortened DOMString.
    */
  def deleteData(offset: Int, count: Int): Unit = js.native

  /** Replaces the specified amount of characters, starting at the specified offset, with the specified DOMString; when
    * this method returns, data contains the modified DOMString.
    */
  def replaceData(offset: Int, count: Int, arg: String): Unit = js.native

  /** Appends the given DOMString to the CharacterData.data string; when this method returns, data contains the
    * concatenated DOMString.
    */
  def appendData(arg: String): Unit = js.native

  /** Inserts the specified characters, at the specified offset, in the CharacterData.data string; when this method
    * returns, data contains the modified DOMString.
    */
  def insertData(offset: Int, arg: String): Unit = js.native

  /** Returns a DOMString containing the part of CharacterData.data of the specified length and starting at the
    * specified offset.
    */
  def substringData(offset: Int, count: Int): String = js.native
}

/** The DOMException interface represents an anormal event happening when a method or a property is used. */
@js.native
@JSGlobal
class DOMException extends js.Object {

  /** Returns a DOMString representing a message or description associated with the given error name. */
  def message: String = js.native

  /** Returns a DOMString that contains one of the strings associated with an error name. */
  def name: String = js.native
}

@js.native
@JSGlobal
object DOMException extends js.Object {

  val INDEX_SIZE_ERR: Int = js.native
  val DOMSTRING_SIZE_ERR: Int = js.native
  val HIERARCHY_REQUEST_ERR: Int = js.native
  val WRONG_DOCUMENT_ERR: Int = js.native
  val INVALID_CHARACTER_ERR: Int = js.native
  val NO_DATA_ALLOWED_ERR: Int = js.native
  val NO_MODIFICATION_ALLOWED_ERR: Int = js.native
  val NOT_FOUND_ERR: Int = js.native
  val NOT_SUPPORTED_ERR: Int = js.native
  val INUSE_ATTRIBUTE_ERR: Int = js.native
  val INVALID_STATE_ERR: Int = js.native
  val SYNTAX_ERR: Int = js.native
  val INVALID_MODIFICATION_ERR: Int = js.native
  val NAMESPACE_ERR: Int = js.native
  val INVALID_ACCESS_ERR: Int = js.native
  val VALIDATION_ERR: Int = js.native
  val TYPE_MISMATCH_ERR: Int = js.native
  val SECURITY_ERR: Int = js.native
  val NETWORK_ERR: Int = js.native
  val ABORT_ERR: Int = js.native
  val URL_MISMATCH_ERR: Int = js.native
  val QUOTA_EXCEEDED_ERR: Int = js.native
  val TIMEOUT_ERR: Int = js.native
  val INVALID_NODE_TYPE_ERR: Int = js.native
  val DATA_CLONE_ERR: Int = js.native
}

/** This type represents a DOM element's attribute as an object. In most DOM methods, you will probably directly
  * retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g.,
  * Element.getAttributeNode()) or means of iterating give Attr types.
  */
@js.native
@JSGlobal
class Attr extends Node {

  /** This property now always returns true. */
  def specified: Boolean = js.native

  /** The element holding the attribute.
    *
    * Note: DOM Level 4 removed this property. The assumption was that since you get an Attr object from an Element, you
    * should already know the associated element.
    *
    * As that doesn't hold true in cases like Attr objects being returned by Document.evaluate, the DOM Living Standard
    * reintroduced the property.
    */
  def ownerElement: Element = js.native

  /** The attribute's value. */
  var value: String = js.native

  /** The attribute's name. */
  def name: String = js.native

  /** A DOMString representing the namespace prefix of the attribute, or null if no prefix is specified. */
  def prefix: String = js.native
}

/** The PerformanceNavigation interface represents information about how the navigtion to the current document was done.
  */
@js.native
@JSGlobal
class PerformanceNavigation extends js.Object {

  /** The PerformanceNavigation.redirectCount read-only property returns an unsigned short representing the number of
    * REDIRECTs done before reaching the page.
    */
  def redirectCount: Int = js.native

  def `type`: Int = js.native

  /** Is a jsonizer returning a json object representing the PerformanceNavigation object. */
  def toJSON(): js.Dynamic = js.native
}

@js.native
@JSGlobal
object PerformanceNavigation extends js.Object {

  val TYPE_RELOAD: Int = js.native
  val TYPE_RESERVED: Int = js.native
  val TYPE_BACK_FORWARD: Int = js.native
  val TYPE_NAVIGATE: Int = js.native
}

/** The LinkStyle interface allows to access the associated CSS style sheet of a node. */
@js.native
trait LinkStyle extends js.Object {

  /** Returns the StyleSheet object associated with the given element, or null if there is none. */
  def sheet: StyleSheet = js.native
}

@js.native
@JSGlobal
class DOMRectList extends DOMList[DOMRect]

@js.native
trait External extends js.Object

/** The ErrorEvent interface represents events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent extends Event {
  def colno: Int = js.native

  /** Is a DOMString containing the name of the script file in which the error occurred. */
  def filename: String = js.native

  /** Is an integer containing the line number of the script file on which the error occurred. */
  def lineno: Int = js.native

  /** Is a DOMString containing a human-readable error message describing the problem. */
  def message: String = js.native
}

@js.native
trait TrackEvent extends Event {
  var track: js.Any = js.native
}

@js.native
trait TextTrackCue extends EventTarget {
  var onenter: js.Function1[Event, _] = js.native
  var track: TextTrack = js.native
  var endTime: Double = js.native
  var text: String = js.native
  var pauseOnExit: Boolean = js.native
  var id: String = js.native
  var startTime: Double = js.native
  var onexit: js.Function1[Event, _] = js.native

  def getCueAsHTML(): DocumentFragment = js.native
}

/** This type represents a set of space-separated tokens. Commonly returned by HTMLElement.classList,
  * HTMLLinkElement.relList, HTMLAnchorElement.relList or HTMLAreaElement.relList. It is indexed beginning with 0 as
  * with JavaScript arrays. DOMTokenList is always case-sensitive.
  */
@js.native
@JSGlobal
class DOMTokenList private[this] extends DOMList[String] {
  def item(index: Int): String = js.native

  def contains(token: String): Boolean = js.native

  def remove(token: String): Unit = js.native

  def toggle(token: String): Boolean = js.native

  def toggle(token: String, force: Boolean): Boolean = js.native

  def add(token: String): Unit = js.native
}

@js.native
@JSGlobal
class MessageChannel extends js.Object {
  def port2: MessagePort = js.native

  def port1: MessagePort = js.native
}

/** The TransitionEvent interface represents events providing information related to transitions. */
@js.native
trait TransitionEvent extends Event {
  def propertyName: String = js.native

  /** The TransionnEvent.elapsedTime read-only property is a float giving the amount of time the animation has been
    * running, in seconds, when this event fired. This value is not affected by the transition-delay property.
    */
  def elapsedTime: Double = js.native
}

/** A MediaQueryList object maintains a list of media queries on a document, and handles sending notifications to
  * listeners when the media queries on the document change.
  */
@js.native
trait MediaQueryList extends js.Object {

  /** true if the document currently matches the media query list; otherwise false. Read only. */
  def matches: Boolean = js.native

  /** The serialized media query list */
  var media: String = js.native

  /** Adds a new listener to the media query list. If the specified listener is already in the list, this method has no
    * effect.
    */
  def addListener(listener: MediaQueryListListener): Unit = js.native

  /** Removes a listener from the media query list. Does nothing if the specified listener isn't already in the list. */
  def removeListener(listener: MediaQueryListListener): Unit = js.native
}

/** A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener
  * indicated by the WebSocket object's onclose attribute.
  */
@js.native
trait CloseEvent extends Event {

  /** Indicates whether or not the connection was cleanly closed. */
  def wasClean: Boolean = js.native

  /** A string indicating the reason the server closed the connection. This is specific to the particular server and
    * sub-protocol.
    */
  def reason: String = js.native

  /** The WebSocket connection close code provided by the server. See Close codes for possible values. */
  def code: Int = js.native
}

/** The WebSocket object provides the API for creating and managing a WebSocket connection to a server, as well as for
  * sending and receiving data on the connection.
  *
  * @param url
  *   The URL as resolved by the constructor. This is always an absolute URL. Read only.
  * @param protocol
  *   A string indicating the name of the sub-protocol the server selected; this will be one of the strings specified in
  *   the protocols parameter when creating the WebSocket object.
  */
@js.native
@JSGlobal
class WebSocket(var url: String = js.native, var protocol: String = js.native) extends EventTarget {
  def this(url: String, protocol: js.Array[String]) = this("", "")

  /** The current state of the connection; this is one of the Ready state constants. Read only. */
  def readyState: Int = js.native

  /** The number of bytes of data that have been queued using calls to send() but not yet transmitted to the network.
    * This value does not reset to zero when the connection is closed; if you keep calling send(), this will continue to
    * climb. Read only.
    */
  def bufferedAmount: Int = js.native

  /** An event listener to be called when the WebSocket connection's readyState changes to OPEN; this indicates that the
    * connection is ready to send and receive data. The event is a simple one with the name "open".
    */
  var onopen: js.Function1[Event, _] = js.native

  /** The extensions selected by the server. This is currently only the empty string or a list of extensions as
    * negotiated by the connection.
    */
  def extensions: String = js.native

  /** An event listener to be called when a message is received from the server. The listener receives a MessageEvent
    * named "message".
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** An event listener to be called when the WebSocket connection's readyState changes to CLOSED. The listener receives
    * a CloseEvent named "close".
    */
  var onclose: js.Function1[CloseEvent, _] = js.native

  /** An event listener to be called when an error occurs. This is a simple event named "error". */
  var onerror: js.Function1[Event, _] = js.native

  /** A string indicating the type of binary data being transmitted by the connection. This should be either "blob" if
    * DOM Blob objects are being used or "arraybuffer" if ArrayBuffer objects are being used.
    */
  var binaryType: String = js.native

  /** Closes the WebSocket connection or connection attempt, if any. If the connection is already CLOSED, this method
    * does nothing.
    */
  def close(code: Int = js.native, reason: String = js.native): Unit = js.native

  /** Transmits data to the server over the WebSocket connection. */
  def send(data: String): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
}

@js.native
@JSGlobal
object WebSocket extends js.Object {

  /** The connection is open and ready to communicate. */
  val OPEN: Int = js.native

  /** The connection is in the process of closing. */
  val CLOSING: Int = js.native
  val CONNECTING: Int = js.native

  /** The connection is closed or couldn't be opened. */
  val CLOSED: Int = js.native
}

/** EventSource enables servers to push data to Web pages over HTTP or using dedicated server-push protocols. Event
  * streams requests can be redirected using HTTP 301 and 307 redirects as with normal HTTP requests. Clients will
  * reconnect if the connection is closed; a client can be told to stop reconnecting using the HTTP 204 No Content
  * response code. W3C 2012
  * @param URL
  * @param settings
  */
@js.native
@JSGlobal
class EventSource(URL: String, settings: js.Dynamic = null) extends EventTarget {

  /** The url attribute must return the absolute URL that resulted from resolving the value that was passed to the
    * constructor. W3C 2012
    * @return
    */
  def url: String = js.native

  /** The withCredentials attribute must return the value to which it was last initialized. When the object is created
    * without withCredentials presents in the settings, it must be initialized to false. If it has the value true, then
    * set CORS mode to Use Credentials and initialize the new EventSource object's withCredentials attribute. W3C 2012
    */
  def withCredentials: Boolean = js.native

  /** The readyState attribute represents the state of the connection. W3C 2012 */
  def readyState: Int = js.native

  var onopen: js.Function1[Event, _] = js.native

  var onmessage: js.Function1[MessageEvent, _] = js.native

  var onerror: js.Function1[Event, _] = js.native

  /** The close() method must abort any instances of the fetch algorithm started for this EventSource object, and must
    * set the readyState attribute to CLOSED. W3C 2012
    */
  def close(): Unit = js.native
}

@js.native
@JSGlobal
object EventSource extends js.Object {

  /** The connection has not yet been established, or it was closed and the user agent is reconnecting. W3C 2012 */
  val CONNECTING: Int = js.native

  /** The user agent has an open connection and is dispatching events as it receives them. W3C 2012 */
  val OPEN: Int = js.native

  /** The connection is not open, and the user agent is not trying to reconnect. Either there was a fatal error or the
    * close() method was invoked. W3C 2012
    */
  val CLOSED: Int = js.native
}

/** The ProgressEvent interface represents events measuring progress of an underlying process, like an HTTP request (for
  * an XMLHttpRequest, or the loading of the underlying resource of an &lt;img&gt;, &lt;audio&gt;, &lt;video&gt;,
  * &lt;style&gt; or &lt;link&gt;).
  */
@js.native
trait ProgressEvent extends Event {

  /** The ProgressEvent.loaded read-only property is an unsigned long long representing the amount of work already
    * performed by the underlying process. The ratio of work done can be calculated with the property and
    * ProgressEvent.total. When downloading a resource using HTTP, this only represent the part of the content itself,
    * not headers and other overhead.
    */
  def loaded: Double = js.native

  /** The ProgressEvent.lengthComputable read-only property is a Boolean flag indicating if the resource concerned by
    * the ProgressEvent has a length that can be calculated. If not, the ProgressEvent.total property has no significant
    * value.
    */
  def lengthComputable: Boolean = js.native

  /** The ProgressEvent.total read-only property is an unsigned long long representing the total amount of work that the
    * underlying process is in the progress of performing. When downloading a resource using HTTP, this only represent
    * the content itself, not headers and other overhead.
    */
  def total: Double = js.native
}

/** An object of this type is returned by the files property of the HTML input element; this lets you access the list of
  * files selected with the &lt;input type="file"&gt; element. It's also used for a list of files dropped into web
  * content when using the drag and drop API; see the DataTransfer object for details on this usage.
  */
@js.native
@JSGlobal
class FileList private[this] () extends DOMList[File] {
  def item(index: Int): File = js.native
}

/** The File interface provides information about -- and access to the contents of -- files.
  *
  * These are generally retrieved from a FileList object returned as a result of a user selecting files using the input
  * element, or from a drag and drop operation's DataTransfer object.
  *
  * The file reference can be saved when the form is submitted while the user is offline, so that the data can be
  * retrieved and uploaded when the Internet connection is restored.
  */
@js.native
@JSGlobal
abstract class File extends Blob {

  /** Returns the name of the file. For security reasons, the path is excluded from this property. */
  def name: String = js.native
}

/** XMLHttpRequestEventTarget is the interface that describes the event handlers you can implement in an object that
  * will handle events for an XMLHttpRequest.
  */
@js.native
trait XMLHttpRequestEventTarget extends EventTarget {

  /** A function that is called periodically with information about the progress of the request. */
  var onprogress: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when a request encounters an error. */
  var onerror: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when an HTTP request returns after successfully loading content. */
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** A function that is called if the event times out; this only happens if a timeout has been previously established
    * by setting the value of the XMLHttpRequest object's timeout attribute.
    */
  var ontimeout: js.Function1[ProgressEvent, _] = js.native

  /** The function to call when a request is aborted. */
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** A function that gets called when the HTTP request first begins loading data. */
  var onloadstart: js.Function1[ProgressEvent, _] = js.native

  /** A function that is called when the load is completed, even if the request failed. */
  var onloadend: js.Function1[ProgressEvent, _] = js.native
}

@js.native
trait AudioTrackList extends EventTarget with DOMList[AudioTrack] {

  var onchange: js.Function1[js.Any, _] = js.native
  var onaddtrack: js.Function1[TrackEvent, _] = js.native

  def getTrackById(id: String): AudioTrack = js.native
}

/** The AnimationEvent interface represents events providing information related to animations. */
@js.native
trait AnimationEvent extends Event {

  /** The AnimationEvent.animationName read-only property is a DOMString containing the value of the animation-name CSS
    * property associated with the transition.
    */
  def animationName: String = js.native

  /** The AnimationEvent.elapsedTime read-only property is a float giving the amount of time the animation has been
    * running, in seconds, when this event fired, excluding any time the animation was paused. For an "animationstart"
    * event, elapsedTime is 0.0 unless there was a negative value for animation-delay, in which case the event will be
    * fired with elapsedTime containing  (-1 * delay).
    */
  def elapsedTime: Double = js.native
}

@js.native
trait WindowConsole extends js.Object {
  var console: Console = js.native
}

@js.native
trait AudioTrack extends js.Object {
  val id: String = js.native
  val kind: String = js.native
  val label: String = js.native
  val language: String = js.native
  var enabled: Boolean = js.native
}

@js.native
@JSGlobal
class TextTrackCueList private[this] () extends DOMList[TextTrackCue] {
  def getCueById(id: String): TextTrackCue = js.native
}

@js.native
trait TextTrackList extends DOMList[TextTrack]

/** The console object provides access to the browser's debugging console. The specifics of how it works vary from
  * browser to browser, but there is a de facto set of features that are typically provided.
  */
@js.native
trait Console extends js.Object {

  /** Outputs an informational message to the Web Console. In Firefox, a small "i" icon is displayed next to these items
    * in the Web Console's log.
    */
  def info(message: Any, optionalParams: Any*): Unit = js.native

  def profile(reportName: String = js.native): Unit = js.native

  def assert(test: Boolean, message: String, optionalParams: Any*): Unit = js.native

  def clear(): Unit = js.native

  /** Displays an interactive list of the properties of the specified JavaScript object. The output is presented as a
    * hierarchical listing with disclosure triangles that let you see the contents of child objects.
    */
  def dir(value: Any, optionalParams: Any*): Unit = js.native

  /** Displays an interactive tree of the descendant elements of the specified XML/HTML element. If it is not possible
    * to display as an element the JavaScript Object view is shown instead. The output is presented as a hierarchical
    * listing of expandable nodes that let you see the contents of child nodes.
    */
  def dirxml(value: Any): Unit = js.native

  /** Outputs a warning message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def warn(message: Any, optionalParams: Any*): Unit = js.native

  /** Outputs an error message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def error(message: Any, optionalParams: Any*): Unit = js.native

  /** For general output of logging information. You may use string substitution and additional arguments with this
    * method. See Using string substitutions.
    */
  def log(message: Any, optionalParams: Any*): Unit = js.native

  /** Outputs a debug message. You may use string substitution and additional arguments with this method. See Using
    * string substitutions.
    */
  def debug(message: Any, optionalParams: Any*): Unit = js.native

  /** Displays tabular data as a table.
    *
    * This function takes one mandatory argument data, which must be an array or an object, and one additional optional
    * parameter columns.
    *
    * It logs data as a table. Each element in the array (or enumerable property if data is an object) will be a row in
    * the table.
    *
    * The first column in the table will be labeled (index). If data is an array, then its values will be the array
    * indices. If data is an object, then its values will be the property names. Note that (in Firefox) console.table is
    * limited to displaying 1000 rows (first row is the labeled index).
    */
  def table(data: js.Object | js.Array[_], columns: js.UndefOr[Int] = js.native): Unit = js.native

  /** Outputs a stack trace to the Web Console. */
  def trace(): Unit = js.native

  def profileEnd(): Unit = js.native

  /** Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have
    * up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will
    * output the time, in milliseconds, that elapsed since the timer was started.
    */
  def time(label: String): Unit = js.native

  /** Stops a timer that was previously started by calling console.time(). */
  def timeEnd(label: String): Unit = js.native

  /** Logs the number of times that this particular call to count() has been called. This function takes an optional
    * argument label.
    */
  def count(label: String = js.native): Unit = js.native

  /** Resets the counter. This function takes an optional argument label. */
  def countReset(label: String = js.native): Unit = js.native

  /** Creates a new inline group in the Web Console log. This indents following console messages by an additional level,
    * until console.groupEnd() is called.
    */
  def group(label: js.UndefOr[String] = js.native): Unit = js.native

  /** Creates a new inline group in the Web Console. Unlike console.group(), however, the new group is created
    * collapsed. The user will need to use the disclosure button next to it to expand it, revealing the entries created
    * in the group.
    *
    * Call console.groupEnd() to back out to the parent group.
    */
  def groupCollapsed(label: js.UndefOr[String] = js.native): Unit = js.native

  /** Exits the current inline group in the Web Console. */
  def groupEnd(): Unit = js.native
}

@js.native
trait WindowBase64 extends js.Object {

  /** Creates a base-64 encoded ASCII string from a "string" of binary data. */
  def btoa(rawString: String): String = js.native

  /** Decodes a string of data which has been encoded using base-64 encoding. */
  def atob(encodedString: String): String = js.native
}

/** A type returned by DOMConfiguration.parameterNames which contains a list of DOMString (strings). */
@js.native
@JSGlobal
class DOMStringList private[this] () extends DOMList[String] {
  def item(index: Int): String = js.native

  def contains(str: String): Boolean = js.native
}

@js.native
trait TextTrack extends EventTarget {
  var language: String = js.native
  var mode: js.Any = js.native
  var readyState: Int = js.native
  var activeCues: TextTrackCueList = js.native
  var cues: TextTrackCueList = js.native
  var oncuechange: js.Function1[Event, _] = js.native
  var kind: String = js.native
  var onload: js.Function1[js.Any, _] = js.native
  var onerror: js.Function1[ErrorEvent, _] = js.native
  var label: String = js.native

  var ERROR: Int = js.native
  var SHOWING: Int = js.native
  var LOADING: Int = js.native
  var LOADED: Int = js.native
  var NONE: Int = js.native
  var HIDDEN: Int = js.native
  var DISABLED: Int = js.native
}

@js.native
@JSGlobal
object TextTrack extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrack),List())))) */
  var ERROR: Int = js.native
  var SHOWING: Int = js.native
  var LOADING: Int = js.native
  var LOADED: Int = js.native
  var NONE: Int = js.native
  var HIDDEN: Int = js.native
  var DISABLED: Int = js.native
}

/** A MediaQueryList object maintains a list of media queries on a document, and handles sending notifications to
  * listeners when the media queries on the document change.
  */
@js.native
trait MediaQueryListListener extends js.Object {
  def apply(mql: MediaQueryList): Unit = js.native
}

/** The MessagePort interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing
  * sending of messages from one port and listening out for them arriving at the other.
  */
@js.native
trait MessagePort extends EventTarget {

  /** An EventListener, called whenever an MessageEvent of type message is fired on the port — that is, when the port
    * receives a message.
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** Disconnects the port,so it is no longer active. This stops the flow of messages to that port. */
  def close(): Unit = js.native

  /** Sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
    *
    * @param transferList
    *   Transferable objects to be transferred — these objects have their ownership transferred to the receiving
    *   browsing context, so are no longer usable by the sending browsing context.
    */
  def postMessage(message: js.Any, transferList: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  def start(): Unit = js.native
}

/** The FileReader object lets web applications asynchronously read the contents of files (or raw data buffers) stored
  * on the user's computer, using File or Blob objects to specify the file or data to read.
  */
@js.native
@JSGlobal
class FileReader() extends EventTarget {

  /** A DOMException representing the error that occurred while reading the file. */
  def error: DOMException = js.native

  /** A number indicating the state of the FileReader. This will be one of the State constants. EMPTY : 0 : No data has
    * been loaded yet. LOADING : 1 : Data is currently being loaded. DONE : 2 : The entire read request has been
    * completed.
    */
  def readyState: Short = js.native

  /** The file's contents. This property is only valid after the read operation is complete, and the format of the data
    * depends on which of the methods was used to initiate the read operation.
    */
  def result: js.Any = js.native

  /** A handler for the abort event. This event is triggered each time the reading operation is aborted. */
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the error event. This event is triggered each time the reading operation encounter an error. */
  var onerror: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the load event. This event is triggered each time the reading operation is successfully completed.
    */
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the loadstart event. This event is triggered each time the reading is starting. */
  var onloadstart: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the loadend event. This event is triggered each time the reading operation is completed (either in
    * success or failure).
    */
  var onloadend: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the progress event. This event is triggered while reading a Blob content. */
  var onprogress: js.Function1[ProgressEvent, _] = js.native

  /** Aborts the read operation. Upon return, the readyState will be DONE. */
  def abort(): Unit = js.native

  /** The readAsArrayBuffer method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains an ArrayBuffer representing the file's data.
    */
  def readAsArrayBuffer(blob: Blob): Unit = js.native

  /** The readAsDataURL method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains a data: URL representing the file's data as base64 encoded string.
    */
  def readAsDataURL(blob: Blob): Unit = js.native

  /** The readAsText method is used to read the contents of the specified Blob or File. When the read operation is
    * complete, the readyState is changed to DONE, the loadend is triggered, and the result attribute contains the
    * contents of the file as a text string.
    */
  def readAsText(blob: Blob, encoding: String = js.native): Unit = js.native
}

@js.native
@JSGlobal
object FileReader extends js.Object {
  //states
  val EMPTY: Short = js.native
  val LOADING: Short = js.native
  val DONE: Short = js.native
}

@js.native
trait BlobPropertyBag extends js.Object {
  def `type`: String = js.native

  def endings: String = js.native
}

object BlobPropertyBag {

  @inline
  def apply(`type`: js.UndefOr[String] = js.undefined): BlobPropertyBag = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    result.asInstanceOf[BlobPropertyBag]
  }
}

/** A Blob object represents a file-like object of immutable, raw data; they can be read as text or binary data, or
  * converted into a ReadableStream so its methods can be used for processing the data. Blobs can represent data that
  * isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality
  * and expanding it to support files on the user's system.
  *
  * To construct a Blob from other non-blob objects and data, use the Blob() constructor. To create a blob that contains
  * a subset of another blob's data, use the slice() method. To obtain a Blob object for a file on the user's file
  * system, see the File documentation.
  *
  * The APIs accepting Blob objects are also listed in the File documentation.
  */
@js.native
@JSGlobal
class Blob(blobParts: js.Array[js.Any] = js.native, options: BlobPropertyBag = js.native) extends js.Object {

  @deprecated("This method seems to have been added in error and not actually exist.", "1.2.0")
  def close(): Unit = js.native

  /** The size, in bytes, of the data contained in the Blob object. */
  def size: Double = js.native

  /** A string indicating the MIME type of the data contained in the Blob. If the type is unknown, this string is empty.
    */
  def `type`: String = js.native

  /** A string indicating the MIME type of the data contained in the Blob. If the type is unknown, this string is empty.
    */
  def slice(start: Double = js.native, end: Double = js.native, contentType: String = js.native): Blob = js.native

  /** Returns a ReadableStream that can be used to read the contents of the blob. */
  def stream(): ReadableStream[Uint8Array] = js.native

  /** Returns a promise that resolves with a USVString containing the entire contents of the blob interpreted as UTF-8
    * text.
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/API/USVString
    */
  def text(): js.Promise[String] = js.native

  /** Returns a promise that resolves with an ArrayBuffer containing the entire contents of the blob as binary data. */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
}

@js.native
@JSGlobal
object Blob extends js.Object

@js.native
trait ApplicationCache extends EventTarget {
  def status: Int = js.native

  var ondownloading: js.Function1[Event, _] = js.native
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  var onupdateready: js.Function1[Event, _] = js.native
  var oncached: js.Function1[Event, _] = js.native
  var onobsolete: js.Function1[Event, _] = js.native
  var onerror: js.Function1[ErrorEvent, _] = js.native
  var onchecking: js.Function1[Event, _] = js.native
  var onnoupdate: js.Function1[Event, _] = js.native

  def swapCache(): Unit = js.native

  def abort(): Unit = js.native

  def update(): Unit = js.native
}

@js.native
@JSGlobal
object ApplicationCache extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ApplicationCache),List())))) */
  val CHECKING: Int = js.native
  val UNCACHED: Int = js.native
  val UPDATEREADY: Int = js.native
  val DOWNLOADING: Int = js.native
  val IDLE: Int = js.native
  val OBSOLETE: Int = js.native
}

@js.native
trait PopStateEvent extends Event {
  def state: js.Any = js.native
}

/** The PageTransitionEvent is fired when a document is being loaded or unloaded.
  *
  * This interface also inherits properties from its parent, Event.
  */
@js.native
trait PageTransitionEvent extends Event {

  /** Indicates if the document is loading from a cache. */
  def persisted: Boolean = js.native
}

@js.native
trait DOMSettableTokenList extends DOMTokenList {
  def value: String = js.native
}

/** XMLHttpRequest Level 2 adds support for the new FormData interface. FormData objects provide a way to easily
  * construct a set of key/value pairs representing form fields and their values, which can then be easily sent using
  * the XMLHttpRequest send() method.
  */
@js.native
@JSGlobal
class FormData(form: HTMLFormElement = js.native) extends js.Object {

  /** Appends a key/value pair to the FormData object. */
  def append(name: js.Any, value: js.Any, blobName: String = js.native): Unit = js.native
}

@js.native
@JSGlobal
object FormData extends js.Object

/** The DOM ValidityState interface represents the validity states that an element can be in, with respect to constraint
  * validation. Together, they help explain why an element's value fails to validate, if it's not valid.
  */
@js.native
trait ValidityState extends js.Object {

  /** The element's custom validity message has been set to a non-empty string by calling the element's
    * setCustomValidity() method.
    */
  def customError: Boolean = js.native

  /** The element has a required attribute, but no value. */
  def valueMissing: Boolean = js.native

  /** The value does not fit the rules determined by the step attribute (that is, it's not evenly divisible by the step
    * value).
    */
  def stepMismatch: Boolean = js.native

  /** The value is less than the minimum specified by the min attribute. */
  def rangeUnderflow: Boolean = js.native

  /** The value is greater than the maximum specified by the max attribute. */
  def rangeOverflow: Boolean = js.native

  /** The value is not in the required syntax (when type is email or url). */
  def typeMismatch: Boolean = js.native

  /** The value does not match the specified pattern. */
  def patternMismatch: Boolean = js.native

  /** The value exceeds the specified maxlength for HTMLInputElement or HTMLTextAreaElement objects. Note: This will
    * never be true in Gecko, because elements' values are prevented from being longer than maxlength.
    */
  def tooLong: Boolean = js.native

  /** The element meets all constraint validations, and is therefore considered to be valid. */
  def valid: Boolean = js.native
}

/** The Page Visibility API lets you know when a webpage is visible or in focus. With tabbed browsing, there is a
  * reasonable chance that any given webpage is in the background and thus not visible to the user. When the user
  * minimizes the webpage or moves to another tab, the API sends a visibilitychange event regarding the visibility of
  * the page. You can detect the event and perform some actions or behave differently. For example, if your web app is
  * playing a video, it would pause the moment the user looks at another browser, and plays again when the user returns
  * to the tab. The user does not lose their place in the video and can continue watching.
  *
  * @see
  *   [[https://www.w3.org/TR/2013/REC-page-visibility-20131029/ Page Visibility (Second Edition) W3C Recommendation 29 October 2013]]
  */
@js.native
trait PageVisibility extends js.Object {

  /** Returns true if the page is in a state considered to be hidden to the user, and false otherwise. */
  def hidden: Boolean = js.native

  /** Is a string denoting the visibility state of the document.
    *
    * Note: or a vendor prefixed DOMString as defined in
    * [[https://www.w3.org/TR/2013/REC-page-visibility-20131029/#sec-vendor-prefix 4.5 Vendor Prefixes]]
    */
  def visibilityState: VisibilityState | String = js.native

  /** The visibilitychange event is fired when the content of a tab has become visible or has been hidden. */
  var visibilitychange: js.Function1[Event, _] = js.native
}

@js.native
sealed trait VisibilityState extends js.Any

object VisibilityState {

  /** The page content may be at least partially visible. In practice this means that the page is the foreground tab of
    * a non-minimized window.
    */
  val visible: VisibilityState = "visible".asInstanceOf[VisibilityState]

  /** The page content is not visible to the user. In practice this means that the document is either a background tab
    * or part of a minimized window, or the OS screen lock is active.
    */
  val hidden: VisibilityState = "hidden".asInstanceOf[VisibilityState]

  /** the page content is being prerendered and is not visible to the user (considered hidden for purposes of
    * document.hidden). The document may start in this state, but will never transition to it from another value. Note:
    * browser support is optional.
    */
  val prerender: VisibilityState = "prerender".asInstanceOf[VisibilityState]

  /** The page is being unloaded from memory. Note: browser support is optional. */
  val unloaded: VisibilityState = "unloaded".asInstanceOf[VisibilityState]
}

/** The Clipboard interface implements the Clipboard API, providing—if the user grants permission—both read and write
  * access to the contents of the system clipboard. The Clipboard API can be used to implement cut, copy, and paste
  * features within a web application.
  *
  * The system clipboard is exposed through the global Navigator.clipboard property
  *
  * Clipboard is based on the EventTarget interface, and includes its methods.
  */
@js.native
trait Clipboard extends EventTarget {

  /** The read() method of the Clipboard interface requests a copy of the clipboard's contents, delivering the data to
    * the returned Promise when the promise is resolved. Unlike readText(), the read() method can return arbitrary data,
    * such as images.
    *
    * To read from the clipboard, you must first have the "clipboard-read" permission.
    */
  def read(): js.Promise[DataTransfer] = js.native

  /** The readText() method returns a Promise which resolves with a copy of the textual contents of the system
    * clipboard.
    */
  def readText(): js.Promise[String] = js.native

  /** The write() method writes arbitrary data, such as images, to the clipboard. This can be used to implement cut and
    * copy functionality.
    *
    * Before you can write to the clipboard, you need to use the Permissions API to get the "clipboard-write"
    * permission.
    */
  def write(data: DataTransfer): js.Promise[Unit] = js.native

  /** The writeText() method writes the specified text string to the system clipboard. */
  def writeText(newClipText: String): js.Promise[Unit] = js.native
}
