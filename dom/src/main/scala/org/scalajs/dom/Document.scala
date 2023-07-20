/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

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
  def getElementsByTagName(name: String): HTMLCollection[Element] = js.native

  /** Returns a list of elements with the given tag name belonging to the given namespace. The complete document is
    * searched, including the root node.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollection[Element] = js.native

  /** Returns a set of elements which have all the given class names. When called on the document object, the complete
    * document is searched, including the root node. You may also call getElementsByClassName on any element; it will
    * return only elements which are descendants of the specified root element with the given class names.
    */
  def getElementsByClassName(classNames: String): HTMLCollection[Element] = js.native

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

  def createElement(tagName: String, options: String): Element = js.native

  def createElement(tagName: String, options: ElementCreationOptions): Element = js.native

  /** Creates an element with the specified namespace URI and qualified name. */
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native

  def createElementNS(namespaceURI: String, qualifiedName: String, options: String): Element = js.native

  def createElementNS(namespaceURI: String, qualifiedName: String, options: ElementCreationOptions): Element = js.native

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

  /** When the Pointer lock state changes—for example, when calling requestPointerLock, exitPointerLock, the user
    * pressing the ESC key, etc.—the pointerlockchange event is dispatched to the document. This is a simple event and
    * contains no extra data.
    */
  var onpointerlockchange: js.Function1[Event, _] = js.native

  /** When there is an error caused by calling requestPointerLock or exitPointerLock, the pointerlockerror event is
    * dispatched to the document. This is a simple event and contains no extra data.
    */
  var onpointerlockerror: js.Function1[Event, _] = js.native

  /** The pointerLockElement property provides the element set as the target for mouse events while the pointer is
    * locked. It is `null` if lock is pending, pointer is unlocked, or the target is in another document.
    */
  def pointerLockElement: Element = js.native

  /** The exitPointerLock asynchronously releases a pointer lock previously requested through
    * Element.requestPointerLock.
    *
    * To track the success or failure of the request, it is necessary to listen for the pointerlockchange and
    * pointerlockerror events.
    */
  def exitPointerLock(): Unit = js.native
}
