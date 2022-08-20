/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

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
  def getElementsByTagName(name: String): HTMLCollection[Element] = js.native

  /** Returns a list of elements with the given tag name belonging to the given namespace. */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollection[Element] = js.native

  /** Returns an array-like object of all child elements which have all of the given class names. When called on the
    * document object, the complete document is searched, including the root node. You may also call
    * getElementsByClassName() on any element; it will return only elements which are descendants of the specified root
    * element with the given class names.
    */
  def getElementsByClassName(classNames: String): HTMLCollection[Element] = js.native

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

  /** The Element.requestPointerLock() method allows to asynchronously ask for the pointer to be locked on the given
    * element.
    *
    * To track the success or failure of the request, it is necessary to listen for the pointerlockchange and
    * pointerlockerror events at the Document level.
    */
  def requestPointerLock(): Unit = js.native

  /** Attaches a shadow DOM tree to the specified element and returns a reference to its ShadowRoot. */
  def attachShadow(init: ShadowRootInit): ShadowRoot = js.native

  /** Returns the open shadow root that is hosted by the element, or null if no open shadow root is present. */
  def shadowRoot: ShadowRoot = js.native

  /** Replaces this Element in the children list of its parent with a set of Node or
    * string objects. String objects are inserted as equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit = js.native
}
