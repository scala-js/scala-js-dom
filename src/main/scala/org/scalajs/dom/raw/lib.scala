/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom.raw

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.ArrayBuffer

object XPathResult extends js.Object {

  /**
   * A result set containing whatever type naturally results from evaluation
   * of the expression. Note that if the result is a node-set then
   * UNORDERED_NODE_ITERATOR_TYPE is always the resulting type.
   *
   * MDN
   */
  val ANY_TYPE: Int = js.native

  /**
   * A result containing a single number. This is useful for example, in an
   * XPath expression using the count() function.
   *
   * MDN
   */
  val NUMBER_TYPE: Int = js.native

  /**
   * A result containing a single string.
   *
   * MDN
   */
  val STRING_TYPE: Int = js.native

  /**
   * A result containing a single boolean value. This is useful for example,
   * in an XPath expression using the not() function.
   *
   * MDN
   */
  val BOOLEAN_TYPE: Int = js.native

  /**
   * A result node-set containing all the nodes matching the expression. The
   * nodes may not necessarily be in the same order that they appear in the
   * document.
   *
   * MDN
   */
  val UNORDERED_NODE_ITERATOR_TYPE: Int = js.native

  /**
   * A result node-set containing all the nodes matching the expression. The
   * nodes in the result set are in the same order that they appear in the
   * document.
   *
   * MDN
   */
  val ORDERED_NODE_ITERATOR_TYPE: Int = js.native

  /**
   * A result node-set containing snapshots of all the nodes matching the
   * expression. The nodes may not necessarily be in the same order that they
   * appear in the document.
   *
   * MDN
   */
  val UNORDERED_NODE_SNAPSHOT_TYPE: Int = js.native

  /**
   * A result node-set containing snapshots of all the nodes matching the
   * expression. The nodes in the result set are in the same order that they
   * appear in the document.
   *
   * MDN
   */
  val ORDERED_NODE_SNAPSHOT_TYPE: Int = js.native

  /**
   * A result node-set containing any single node that matches the expression.
   * The node is not necessarily the first node in the document that matches
   * the expression.
   *
   * MDN
   */
  val ANY_UNORDERED_NODE_TYPE: Int = js.native

  /**
   * A result node-set containing the first node in the document that matches
   * the expression.
   *
   * MDN
   */
  val FIRST_ORDERED_NODE_TYPE: Int = js.native
}

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

class XPathNSResolver extends js.Object {
  def lookupNamespaceURI(prefix: String): String = js.native
}

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
  var enableHighAccuracy: Boolean = js.native
  /**
   * The PositionOptions.timeout property is a positive long value representing the
   * maximum length of time (in milliseconds) the device is allowed to take in order to
   * return a position. The default value is Infinity, meaning that
   * getCurrentPosition() won't return until the position is available.
   *
   * MDN
   */
  var timeout: Int = js.native
  /**
   * The PositionOptions.maximumAge property is a positive long value indicating the
   * maximum age in milliseconds of a possible cached position that is acceptable to
   * return. If set to 0, it means that the device cannot use a cached position and must
   * attempt to retrieve the real current position. If set to Infinity the device must
   * return a cached position regardless of its age.
   *
   * MDN
   */
  var maximumAge: Int = js.native
}

/**
 * The NavigatorID interface contains methods and properties related to the
 * identity of the browser.
 *
 * There is no object of type NavigatorID, but other interfaces, like Navigator
 * or WorkerNavigator, implement it.
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
  def appVersion: String = js.native

  /**
   * Returns the name of the browser. The HTML5 specification also allows any browser to
   * return "Netscape" here, for compatibility reasons.
   *
   * MDN
   */
  def appName: String = js.native

  /**
   * Returns the user agent string for the current browser.
   *
   * MDN
   */
  def userAgent: String = js.native

  /**
   * Returns a string representing the platform of the browser.
   *
   * MDN
   */
  def platform: String = js.native
}

/**
 * The TreeWalker object represents the nodes of a document subtree and a position
 * within them.
 *
 * A TreeWalker can be created using the Document.createTreeWalker() method.
 *
 * MDN
 */
class TreeWalker extends js.Object {
  /**
   * Returns an unsigned long being a bitmask made of constants describing the types of
   * Node that must to be presented. Non-matching nodes are skipped, but their children
   * may be included, if relevant.
   *
   * MDN
   */
  def whatToShow: Int = js.native

  /**
   * The TreeWalker.filter read-only property returns a NodeFilter that is the
   * filtering object associated with the TreeWalker.
   *
   * MDN
   */
  def filter: NodeFilter = js.native

  /**
   * The TreeWalker.root read-only property returns the node that is the root of what
   * the TreeWalker traverses.
   *
   * MDN
   */
  def root: Node = js.native

  /**
   * The TreeWalker.currentNode property represents the Node on which the TreeWalker
   * is currently pointing at.
   *
   * MDN
   */
  def currentNode: Node = js.native

  /**
   * The TreeWalker.expandEntityReferences read-only property returns a Boolean
   * flag indicating whether or not the children of entity reference nodes are visible
   * to the TreeWalker.
   *
   * MDN
   */
  def expandEntityReferences: Boolean = js.native

  /**
   * The TreeWalker.previousSibling() method moves the current Node to its previous
   * sibling, if any, and returns the found sibling. I there is no such node, return null
   * and the current node is not changed.
   *
   * MDN
   */
  def previousSibling(): Node = js.native

  /**
   * The TreeWalker.lastChild() method moves the current Node to the last visible
   * child of the current node, and returns the found child. It also moves the current
   * node to this child. If no such child exists, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def lastChild(): Node = js.native

  /**
   * The TreeWalker.nextSibling() method moves the current Node to its next sibling,
   * if any, and returns the found sibling. I there is no such node, return null and the
   * current node is not changed.
   *
   * MDN
   */
  def nextSibling(): Node = js.native

  /**
   * The TreeWalker.nextNode() method moves the current Node to the next visible node
   * in the document order, and returns the found node. It also moves the current node to
   * this one. If no such node exists, returns null and the current node is not changed.
   *
   * MDN
   */
  def nextNode(): Node = js.native

  /**
   * The TreeWalker.parentNode() method moves the current Node to the first visible
   * ancestor node in the document order, and returns the found node. It also moves the
   * current node to this one. If no such node exists, or if it is before that the root node
   * defined at the object construction, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def parentNode(): Node = js.native

  /**
   * The TreeWalker.firstChild() method moves the current Node to the first visible
   * child of the current node, and returns the found child. It also moves the current
   * node to this child. If no such child exists, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def firstChild(): Node = js.native

  /**
   * The TreeWalker.previousNode() method moves the current Node to the previous
   * visible node in the document order, and returns the found node. It also moves the
   * current node to this one. If no such node exists,or if it is before that the root node
   * defined at the object construction, returns null and the current node is not
   * changed.
   *
   * MDN
   */
  def previousNode(): Node = js.native
}


/**
 * An object of this type can be obtained by calling the Window.performance read-only
 * attribute.
 *
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
  def navigation: PerformanceNavigation = js.native

  /**
   * The Performance.timing read-only property returns a PerformanceTiming object
   * containing latency-related performance information.
   *
   * MDN
   */
  def timing: PerformanceTiming = js.native

  def getEntriesByType(entryType: String): js.Dynamic = js.native

  /**
   * Is a jsonizer returning a json object representing the Performance object.
   *
   * MDN
   */
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

  /**
   * Returns a DOMHighResTimeStamp representing the amount of miliseconds elapsed
   * since the start of the navigation, as give by PerformanceTiming.navigationStart
   * to the call of the method.
   *
   * MDN
   */
  def now(): Double = js.native
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
  def data: String = js.native

  /**
   * The locale of current input method (for example, the keyboard layout locale if the
   * composition is associated with IME). Read only.
   *
   * MDN
   */
  def locale: String = js.native

  /**
   * Initializes the attributes of a composition event.
   *
   * MDN
   */
  def initCompositionEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, dataArg: String, locale: String): Unit = js.native
}


trait WindowTimers extends WindowTimersExtension {
  /**
   * Clears the delay set by window.setTimeout().
   *
   * MDN
   */
  def clearTimeout(handle: Int): Unit = js.native

  /**
   * Calls a function or executes a code snippet after a specified delay.
   *
   * MDN
   */
  def setTimeout(handler: js.Function0[Any], timeout: Double): Int = js.native

  /**
   * Cancels repeated action which was set up using setInterval.
   *
   * MDN
   */
  def clearInterval(handle: Int): Unit = js.native

  /**
   * Calls a function or executes a code snippet repeatedly, with a fixed time
   * delay between each call to that function.
   *
   * MDN
   */
  def setInterval(handler: js.Function0[Any], timeout: Double): Int = js.native
}

/**
 * The Promise object is used for deferred and asynchronous computations. A Promise is in one of these states:
 * pending: initial state, not fulfilled or rejected.
 * fulfilled: successful operation
 * rejected: failed operation.
 * settled: the Promise is either fulfilled or rejected, but not pending.
 *
 * MDN
 */
class Promise[+A](executor: js.Function2[js.Function1[A, Any], js.Function1[Any, Any], Any]) extends js.Object {

  /**
   * The catch() method returns a Promise and deals with rejected cases only.
   * It behaves the same as calling Promise.prototype.then(undefined, onRejected).
   *
   * MDN
   */
  @JSName("catch")
  def recover[B >: A](onRejected: js.Function1[Any, B]): Promise[Any] = js.native

  /**
   * The then() method returns a Promise.
   * It takes two arguments, both are callback functions for the success and failure cases of the Promise.
   *
   * MDN
   */
  @JSName("then")
  def andThen[B](onFulfilled: js.Function1[A,B]): Promise[Any] = js.native

  @JSName("then")
  def andThen[B](onFulfilled: js.Function1[A,B], onRejected: js.Function1[Any,B]): Promise[Any] = js.native

}

object Promise extends js.Object {

  /**
   * The Promise.all(iterable) method returns a promise that resolves when all of the promises in the iterable argument have resolved.
   *
   * MDN
   */
  def all[B](iterable: js.Array[Promise[B]]): Promise[Any] = js.native

  /**
   * The Promise.race(iterable) method returns a promise that resolves or rejects as soon as one of the promises in the iterable resolves or rejects, with the value or reason from that promise.
   *
   * MDN
   */
  def race[B](iterable: js.Array[Promise[B]]): Promise[Any] = js.native

  /**
   * The Promise.reject(reason) method returns a Promise object that is rejected with the given reason.
   *
   * MDN
   */
  def reject(reason: String): Promise[Nothing] = js.native

}

/**
 * The ServiceWorker interface of the ServiceWorker API provides a reference to a service worker.
 * Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker,
 * each through a unique ServiceWorker object.
 *
 *  MDN
 */
trait ServiceWorker extends EventTarget {
  /**
   * Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration.
   * Must be on the same origin as the document that registers the ServiceWorker.
   *
   * MDN
   */
  def scriptURL: String = js.native

  /**
   * The state read-only property of the ServiceWorker interface returns a string representing the current state of the service worker.
   * It can be one of the following values: installing, installed, activating, activated, or redundant.
   *
   * MDN
   */
  def state: String = js.native

  /**
   * An EventListener property called whenever an event of type statechange is fired; it is basically fired anytime the ServiceWorker.state changes.
   *
   * MDN
   */
  var onstatechange: js.Function1[Event, Any] = js.native

}

/**
 * The ServiceWorkerRegistion interface of the ServiceWorker API represents the service worker registration.
 * You register a service worker to control one or more pages that share the same origin.
 *
 * MDN
 */
trait ServiceWorkerRegistration extends EventTarget {
  /**
   * The installing property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is installing.
   * This property is initially set to null.
   *
   * MDN
   */
  var installing: ServiceWorker = js.native

  /**
   * The waiting property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is installed.
   * This property is initially set to null.
   *
   * MDN
   */
  var waiting: ServiceWorker = js.native

  /**
   * The active property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is activating or activated.
   * This property is initially set to null.
   *
   * MDN
   */
  var active: ServiceWorker = js.native

  /**
   * The scope read-only property of the ServiceWorkerRegistration interface returns a unique identifier for a service worker registration.
   * The service worker must be on the same origin as the document that registers the ServiceWorker.
   *
   * MDN
   */
  var scope: String = js.native

  /**
   * The update method of the ServiceWorkerRegistration interface allows you to ping the server for an updated service worker script.
   * If you don't explicitly call this,
   * the UA will do this automatically once every 24 hours.
   *
   * MDN
   */
  def update(): Unit = js.native

  /**
   * The unregister method of the ServiceWorkerRegistration interface unregisters the service worker registration and returns a Promise.
   * The promise will resolve to false if no registration was found, otherwise it resolves to true irrespective of whether unregistration happened or not (it may not unregister if someone else just called ServiceWorkerContainer.register with the same scope.)
   * The service worker will finish any ongoing operations before it is unregistered.
   *
   * MDN
   */
  def unregister(): Promise[Boolean] = js.native

  /**
   * The onupdatefound property of the ServiceWorkerRegistration interface is an EventListener property called whenever an event of type statechange is fired;
   * it is fired any time the ServiceWorkerRegistration.
   * installing property acquires a new service worker.
   *
   * MDN
   */
  var onupdatefound: js.Function1[Event, Any] = js.native
}

/**
 * The ServiceWorkerContainer interface of the ServiceWorker API exposes the ServiceWorkerContainer.
 * register(scriptURL, scope[, base]) method used to register service workers, and the ServiceWorkerContainer.
 * controller property used to determine whether or not the current page is actively controlled.
 *
 * MDN
 */
trait ServiceWorkerContainer extends EventTarget {

  /**
   * Creates or updates a ServiceWorkerRegistration for the given scriptURL.
   * If successful, a service worker registration ties the provided script URL to a scope, which is subsequently used for navigation matching.
   * If the method can't return a ServiceWorkerRegistration, it returns a Promise.
   * You can call this method unconditionally from the controlled page, i.e.,
   * you don't need to first check whether there's an active registration.
   *
   *  MDN
   */
  def register(scriptURL: String, options: js.Object = new js.Object()): Promise[ServiceWorkerRegistration] = js.native

  /**
   * The ServiceWorkerContainer.controller read-only property of the ServiceWorkerContainer interface returns the ServiceWorker whose state is activated (the same object returned by ServiceWorkerRegistration.active).
   * This property returns null if the request is a force refresh (Shift + refresh) or if there is no active worker.
   *
   * MDN
   */
  def controller: ServiceWorker = js.native

  /**
   * Gets a ServiceWorkerRegistration object whose scope URL matches the document URL.
   * If the method can't return a ServiceWorkerRegistration, it returns a Promise.
   *
   *  MDN
   */
  def getRegistration(scope: String = ""): Promise[ServiceWorkerRegistration] = js.native
}

/**
 * The Navigator interface represents the state and the identity of the user
 * agent. It allows scripts to query it and to register themselves to carry
 * on some activities.
 *
 * A Navigator object can be retrieved using the read-only Window.navigator
 * property.
 *
 * MDN
 */
class Navigator extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with NavigatorGeolocation with NavigatorStorageUtils {

  val serviceWorker: ServiceWorkerContainer = js.native

}

trait NodeSelector extends js.Object {
  /**
   * Returns a list of the elements within the document (using depth-first
   * pre-order traversal of the document's nodes) that match the specified
   * group of selectors.
   *
   * MDN
   */
  def querySelectorAll(selectors: String): NodeList = js.native

  /**
   * Returns the first element within the document (using depth-first pre-order
   * traversal of the document's nodes) that matches the specified group of
   * selectors.
   *
   * MDN
   */
  def querySelector(selectors: String): Element = js.native
}

class ClientRect extends js.Object {
  var left: Double = js.native
  var width: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  var bottom: Double = js.native
  var height: Double = js.native
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
  def createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType = js.native

  /**
   * « DOM Reference « DOMImplementation
   *
   * MDN
   */
  def createDocument(namespaceURI: String, qualifiedName: String, doctype: DocumentType): Document = js.native

  def hasFeature(feature: String, version: String): Boolean = js.native

  /**
   * Returns a Boolean indicating if a given feature is supported or not. This function
   * is unreliable and kept for compatibility purpose alone: except for SVG-related
   * queries, it always returns true. Old browsers are very inconsistent in their
   * behavior.
   *
   * MDN
   */
  def hasFeature(feature: String): Boolean = js.native

  /**
   * Creates and returns an HTML Document.
   *
   * MDN
   */
  def createHTMLDocument(title: String): Document = js.native
}

/**
 * The ParentNode interface allows to traverse from an element to its children.
 *
 * ParentNode is a raw interface and no object of this type can be created; it
 * is implemented by Element, Document, and DocumentFragment objects.
 *
 * MDN
 */
trait ParentNode extends js.Object {
  /**
   * Returns a live HTMLCollection containing all objects of type Element that are children of the object.
   *
   * MDN
   */
  def children: HTMLCollection = js.native

  /**
   * Returns the Element that is the first child of the object, or null if there is none.
   *
   * MDN
   */
  def firstElementChild: Element = js.native

  /**
   * Returns the Element that is the last child of the object, or null if there is none.
   *
   * MDN
   */
  def lastElementChild: Element = js.native

  /**
   * Returns an unsigned long giving the amount of children that the object has.
   *
   * MDN
   */
  def childElementCount: Int = js.native

}

/**
 * The NonDocumentTypeChildNode interface contains methods that are particular to
 * Node objects that can have a parent, but not suitable for DocumentType.
 *
 * NonDocumentTypeChildNode is a raw interface and no object of this type can be
 * created; it is implemented by Element, and CharacterData objects.
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/NonDocumentTypeChildNode
 */
trait NonDocumentTypeChildNode extends js.Object {

  /**
   * The previousElementSibling read-only property returns the Element immediately prior
   * to the specified one in its parent's children list, or null if the specified element
   * is the first one in the list.
   *
   * MDN
   */
  def previousElementSibling: Element = js.native

  /**
   * The nextElementSibling read-only property returns the element immediately following
   * the specified one in its parent's children list, or null if the specified element is
   * the last one in the list.
   *
   * MDN
   */
  def nextElementSibling: Element = js.native
}

/**
 * The Element interface represents part of the document. This interface describes
 * methods and properties common to each kind of elements. Specific behaviors are
 * described in the specific interfaces, inheriting from Element: the HTMLElement
 * interface for HTML elements, or the SVGElement interface for SVG elements.
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/element
 */
abstract class Element extends Node with NodeSelector with ParentNode with NonDocumentTypeChildNode {


  /**
   * scrollTop gets or sets the number of pixels that the content of an element is
   * scrolled upward.
   *
   * MDN
   */
  var scrollTop: Double = js.native

  /**
   * The width of the left border of an element in pixels. It includes the width of the
   * vertical scrollbar if the text direction of the element is right–to–left and if
   * there is an overflow causing a left vertical scrollbar to be rendered. clientLeft
   * does not include the left margin or the left padding. clientLeft is read-only.
   *
   * MDN
   */
  def clientLeft: Int = js.native

  /**
   * scrollLeft gets or sets the number of pixels that an element's content is scrolled
   * to the left.
   *
   * MDN
   */
  var scrollLeft: Double = js.native

  /**
   * In XML (and XML-based languages such as XHTML), tagName preserves case. On
   * HTML elements in DOM trees flagged as HTML documents, tagName returns the
   * element name in the uppercase form. The value of tagName is the same as that of
   * nodeName.
   *
   * MDN
   */
  def tagName: String = js.native

  /**
   * clientWidth is the inner width of an element in pixels. It includes padding but not
   * the vertical scrollbar (if present, if rendered), border or margin.
   *
   * MDN
   */
  def clientWidth: Int = js.native

  /**
   * scrollWidth is a read–only property that returns either the width in pixels of the
   * content of an element or the width of the element itself, whichever is greater. If
   * the element is wider than its content area (for example, if there are scroll bars for
   * scrolling through the content), the scrollWidth is larger than the clientWidth.
   *
   * MDN
   */
  def scrollWidth: Int = js.native

  /**
   * Returns the inner height of an element in pixels, including padding but not
   * the horizontal scrollbar height, border, or margin.
   *
   * clientHeight can be calculated as CSS height + CSS padding - height of
   * horizontal scrollbar (if present).
   *
   * MDN
   */
  def clientHeight: Int = js.native

  /**
   * The width of the top border of an element in pixels. It does not include the top margin
   * or padding. clientTop is read-only.
   *
   * MDN
   */
  def clientTop: Int = js.native

  /**
   * Height of the scroll view of an element; it includes the element padding but not its
   * margin.
   *
   * MDN
   */
  def scrollHeight: Int = js.native

  /**
   * Gets the markup of the element including its content. When used as a
   * setter, replaces the element with nodes parsed from the given string.
   *
   * Supported by FF>10, any Opera, any Chrome, any IE, any Safari
   */
  var outerHTML: String = js.native

  /**
   * innerHTML sets or gets the HTML syntax describing the element's descendants.
   *
   * Note: If a <div>, <span>, or <noembed> node has a child text node that includes
   * the characters (&), (<), or (>), innerHTML returns these characters as &amp,
   * &lt and &gt respectively. Use Node.textContent to get a correct copy of these
   * text nodes' contents.
   */
  var innerHTML: String = js.native

  var id: String = js.native

  var oncut: js.Function1[DragEvent, _] = js.native
  var oncopy: js.Function1[DragEvent, _] = js.native
  var onpaste: js.Function1[DragEvent, _] = js.native

  var accessKey: String = js.native

  /**
   * Supported by FF>3.6, any Opera, any Chrome, any IE, any Safari
   */
  var classList: DOMTokenList = js.native

  def scrollIntoView(top: Boolean = js.native): Unit = js.native

  /**
   * Supported by FF>8, Opera>7, Chrome>1, IE>4, Safari>4
   */
  def insertAdjacentHTML(where: String, html: String): Unit = js.native

  /**
   * getAttribute() returns the value of the named attribute on the specified element.
   * If the named attribute does not exist, the value returned will either be null or ""
   * (the empty string); see Notes for details.
   *
   * MDN
   */
  def getAttribute(name: String): String = js.native

  /**
   * getAttribute() returns the value of the named attribute on the specified element.
   * If the named attribute does not exist, the value returned will either be null or ""
   * (the empty string); see Notes for details.
   *
   * MDN
   */
  def getAttribute(): String = js.native

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace.
   *
   * MDN
   */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = js.native

  def getElementsByClassName(classNames: String): NodeList = js.native

  /**
   * hasAttributeNS returns a boolean value indicating whether the current element
   * has the specified attribute.
   *
   * MDN
   */
  def hasAttributeNS(namespaceURI: String, localName: String): Boolean = js.native

  /**
   * Returns a text rectangle object that encloses a group of text rectangles.
   *
   * MDN
   */
  def getBoundingClientRect(): ClientRect = js.native

  /**
   * getAttributeNS returns the string value of the attribute with the specified
   * namespace and name. If the named attribute does not exist, the value returned will
   * either be null or "" (the empty string); see Notes for details.
   *
   * MDN
   */
  def getAttributeNS(namespaceURI: String, localName: String): String = js.native

  /**
   * Returns the Attr node for the attribute with the given namespace and name.
   *
   * MDN
   */
  def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = js.native

  /**
   * setAttributeNodeNS adds a new namespaced attribute node to an element.
   *
   * MDN
   */
  def setAttributeNodeNS(newAttr: Attr): Attr = js.native

  /**
   * hasAttribute returns a boolean value indicating whether the specified element
   * has the specified attribute or not.
   *
   * MDN
   */
  def hasAttribute(name: String): Boolean = js.native

  /**
   * removeAttribute removes an attribute from the specified element.
   *
   * MDN
   */
  def removeAttribute(name: String): Unit = js.native

  /**
   * removeAttribute removes an attribute from the specified element.
   *
   * MDN
   */
  def removeAttribute(): Unit = js.native

  /**
   * setAttributeNS adds a new attribute or changes the value of an attribute with the
   * given namespace and name.
   *
   * MDN
   */
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native

  /**
   * Returns the specified attribute of the specified element, as an Attr node.
   *
   * MDN
   */
  def getAttributeNode(name: String): Attr = js.native

  /**
   * Returns a list of elements with the given tag name. The subtree underneath the
   * specified element is searched, excluding the element itself. The returned list is
   * live, meaning that it updates itself with the DOM tree automatically.
   * Consequently, there is no need to call several times
   * element.getElementsByTagName with the same element and arguments.
   *
   * MDN
   */
  def getElementsByTagName(name: String): NodeList = js.native

  /**
   * Returns a collection of rectangles that indicate the bounding rectangles for each
   * box in a client.
   *
   * MDN
   */
  def getClientRects(): ClientRectList = js.native

  /**
   * setAttributeNode() adds a new Attr node to the specified element.
   *
   * MDN
   */
  def setAttributeNode(newAttr: Attr): Attr = js.native

  /**
   * removeAttributeNode removes the specified attribute from the current element.
   *
   * MDN
   */
  def removeAttributeNode(oldAttr: Attr): Attr = js.native

  /**
   * Adds a new attribute or changes the value of an existing attribute on the
   * specified element.
   *
   * MSN
   */
  def setAttribute(name: String, value: String): Unit = js.native

  /**
   * removeAttributeNS removes the specified attribute from an element.
   *
   * MDN
   */
  def removeAttributeNS(namespaceURI: String, localName: String): Unit = js.native


}


/**
 * A Node is an interface from which a number of DOM types inherit, and allows these
 * various types to be treated (or tested) similarly.
 *
 * The following interfaces all inherit from Node its methods and properties:
 * Document, Element, CharacterData (which Text, Comment, and CDATASection
 * inherit), ProcessingInstruction, DocumentFragment, DocumentType, Notation,
 * Entity, EntityReference
 *
 * These interfaces may return null in particular cases where the methods
 * and properties are not relevant. They may throw an exception - for example
 * when adding children to a node type for which no children can exist.
 *
 * MDN
 */
abstract class Node extends EventTarget {
  /**
   * The read-only Node.nodeType property returns an unsigned short integer
   * representing the type of the node.
   *
   * MDN
   */
  def nodeType: Int = js.native

  /**
   * Returns the node immediately preceding the specified one in its parent's
   * childNodes list, null if the specified node is the first in that list.
   *
   * MDN
   */
  def previousSibling: Node = js.native

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
  def localName: String = js.native

  /**
   * The namespace URI of this node, or null if it is no namespace. In Firefox 3.5 and
   * earlier, HTML elements are in no namespace. In later versions, HTML elements are
   * in the http://www.w3.org/1999/xhtml namespace in both HTML and XML trees.
   * Though the specification requires namespaceURI to be defined on the Node
   * interface, Gecko-based browsers implement it on the Element interface.
   *
   * MDN
   */
  def namespaceURI: String = js.native

  /**
   * Is a DOMString representing the textual content of an element and all its
   * descendants.
   *
   * MDN
   */
  var textContent: String = js.native

  /**
   * Returns a Node that is the parent of this node. If there is no such node, like if this
   * node is the top of the tree or if doesn't participate in a tree, this property returns
   * null.
   *
   * MDN
   */
  def parentNode: Node = js.native

  /**
   * Returns the node immediately following the specified one in its parent's
   * childNodes list, or null if the specified node is the last node in that list.
   *
   * MDN
   */
  def nextSibling: Node = js.native

  /**
   * Is a DOMString representing the value of an object. For most Node type, this returns
   * null and any set operation is ignored. For nodes of type TEXT_NODE (Text objects),
   * COMMENT_NODE (Comment objects), and PROCESSING_INSTRUCTION_NODE
   * (ProcessingInstruction objects), the value corresponds to the text data
   * contained in the object.
   *
   * MDN
   */
  def nodeValue: String = js.native

  /**
   * Returns a Node representing the last direct child node of the node, or null if the
   * node has no child.
   *
   * MDN
   */
  def lastChild: Node = js.native

  /**
   * Returns a live NodeList containing all the children of this node. NodeList being
   * live means that if the children of the Node change, the NodeList object is
   * automatically updated.
   *
   * MDN
   */
  def childNodes: NodeList = js.native

  /**
   * Returns a DOMString containing the name of the Node. The structure of the name will
   * differ with the name type. E.g. An HTMLElement will contain the name of the
   * corresponding tag, like 'audio' for an HTMLAudioElement, a Text node will have the
   * '#text' string, or a Document node will have the '#document' string.
   *
   * MDN
   */
  def nodeName: String = js.native

  /**
   * Returns the Document that this node belongs to. If no document is associated with
   * it, returns null.
   *
   * MDN
   */
  def ownerDocument: Document = js.native

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
  def attributes: NamedNodeMap = js.native

  /**
   * Returns the node's first child in the tree, or null if the node is childless. If the
   * node is a Document, it returns the first node in the list of its direct children.
   *
   * MDN
   */
  def firstChild: Node = js.native

  /**
   * Is a DOMString representing the namespace prefix of the node, or null if no prefix is
   * specified. Though the specification requires localName to be defined on the Node
   * interface, Gecko-based browsers implement it on the Element interface.
   *
   * MDN
   */
  var prefix: String = js.native

  /**
   * Removes a child node from the current element, which must be a child of the current
   * node.
   *
   * MDN
   */
  def removeChild(oldChild: Node): Node = js.native

  /**
   * Adds a node to the end of the list of children of a specified parent node. If the node
   * already exists it is removed from current parent node, then added to new parent
   * node.
   *
   * MDN
   */
  def appendChild(newChild: Node): Node = js.native

  /**
   * The Node.isSupported()returns a Boolean flag containing the result of a test
   * whether the DOM implementation implements a specific feature and this feature is
   * supported by the specific node.
   *
   * MDN
   */
  def isSupported(feature: String, version: String): Boolean = js.native

  /**
   * If #targetElm is first div element in document, "true" will be displayed.
   *
   * MDN
   */
  def isEqualNode(arg: Node): Boolean = js.native

  /**
   * Returns the prefix for a given namespaceURI if present, and null if not. When
   * multiple prefixes are possible, the result is implementation-dependent.
   *
   * MDN
   */
  def lookupPrefix(namespaceURI: String): String = js.native

  /**
   * isDefaultNamespace accepts a namespace URI as an argument and returns true if the
   * namespace is the default namespace on the given node or false if not.
   *
   * MDN
   */
  def isDefaultNamespace(namespaceURI: String): Boolean = js.native

  /**
   * Compares the position of the current node against another node in any other
   * document.
   *
   * MDN
   */
  def compareDocumentPosition(other: Node): Int = js.native

  /**
   * Puts the specified node and all of its subtree into a "normalized" form. In a
   * normalized subtree, no text nodes in the subtree are empty and there are no adjacent
   * text nodes.
   *
   * MDN
   */
  def normalize(): Unit = js.native

  /**
   * Tests whether two nodes are the same, that is they reference the same object.
   *
   * MDN
   */
  def isSameNode(other: Node): Boolean = js.native

  /**
   * hasAttributes returns a boolean value of true or false, indicating if the current
   * element has any attributes or not.
   *
   * MDN
   */
  def hasAttributes(): Boolean = js.native

  /**
   * Takes a prefix and returns the namespaceURI associated with it on the given node if
   * found (and null if not). Supplying null for the prefix will return the default
   * namespace.
   *
   * MDN
   */
  def lookupNamespaceURI(prefix: String): String = js.native

  /**
   * Clone a Node, and optionally, all of its contents. By default, it clones the content
   * of the node.
   *
   * MDN
   */
  def cloneNode(deep: Boolean = js.native): Node = js.native

  /**
   * hasChildNodes returns a Boolean value indicating whether the current Node has
   * child nodes or not.
   *
   * MDN
   */
  def hasChildNodes(): Boolean = js.native

  /**
   * Replaces one child Node of the current one with the second one given in parameter.
   *
   * MDN
   */
  def replaceChild(newChild: Node, oldChild: Node): Node = js.native

  /**
   * Inserts the first Node given in a parameter immediately before the second, child of
   * this element, Node.
   *
   * MDN
   */
  def insertBefore(newChild: Node, refChild: Node): Node = js.native
}


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

trait ModifierKeyEvent extends js.Object {
  /**
   * The metaKey property indicates if the meta key was pressed (true) or not (false)
   * when the event occured.
   *
   * MDN
   */
  def metaKey: Boolean = js.native

  /**
   * The altKey property indicates if the alt key was pressed (true) or not (false) when
   * the event occured.
   *
   * MDN
   */
  def altKey: Boolean = js.native

  /**
   * A Boolean value indicating whether or not the control key was down when the touch
   * event was fired. Read only.
   *
   * MDN
   */
  def ctrlKey: Boolean = js.native

  /**
   * A Boolean value indicating whether or not the shift key was down when the touch event
   * was fired. Read only.
   *
   * MDN
   */
  def shiftKey: Boolean = js.native
}

/**
 * The hashchange event is fired when the fragment identifier of the URL has
 * changed (the part of the URL that follows the # symbol, including the #
 * symbol).
 *
 * MDN
 */
trait HashChangeEvent extends Event {
  /**
   * The new URL to which the window is navigating.
   *
   * MDN
   */
  def newURL: String = js.native

  /**
   * The previous URL from which the window was navigated.
   *
   * MDN
   */
  def oldURL: String = js.native
}

/**
 * The DOM MouseEvent interface represents events that occur due to the user
 * interacting with a pointing device (such as a mouse).
 *
 * Common events using this interface include click, dblclick, mouseup,
 * mousedown. The list of all events using this interface is provided in
 * the Events reference.
 *
 * MouseEvent derives from UIEvent, which in turn derives from Event.
 *
 * MDN
 */
class MouseEvent extends UIEvent with ModifierKeyEvent {

  /**
   * The screenX property provides the X coordinate of the mouse pointer in global
   * (screen) coordinates.
   *
   * MDN
   */
  def screenX: Double = js.native

  /**
   * The pageX property is an integer value in pixels for the X coordinate of the
   * mouse pointer, relative to the whole document, when the mouse event fired.
   * This property takes into account any horizontal scrolling of the page.
   *
   * MDN
   */
  def pageX: Double = js.native

  /**
   * The pageY property is an integer value in pixels for the Y coordinate of the
   * mouse pointer, relative to the whole document, when the mouse event fired.
   * This property takes into account any vertical scrolling of the page.
   *
   * MDN
   */
  def pageY: Double = js.native

  /**
   * The clientY property provides the Y coordinate of the mouse pointer in local (DOM
   * content) coordinates.
   *
   * MDN
   */
  def clientY: Double = js.native

  /**
   * The screenY property provides the Y coordinate of the mouse pointer in global
   * (screen) coordinates.
   *
   * MDN
   */
  def screenY: Double = js.native

  /**
   * The relatedTarget property is the secondary target for the event, if there is one.
   *
   * MDN
   */
  def relatedTarget: EventTarget = js.native

  /**
   * The button property indicates which button was pressed on the mouse to trigger the
   * event.
   *
   * MDN
   */
  def button: Int = js.native

  /**
   * The buttons property indicates which buttons were pressed on the mouse to trigger
   * the event.
   *
   * MDN
   */
  def buttons: Int = js.native

  /**
   * The clientX property provides the X coordinate of the mouse pointer in local (DOM
   * content) coordinates.
   *
   * MDN
   */
  def clientX: Double = js.native

  def initMouseEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Int, screenXArg: Int, screenYArg: Int, clientXArg: Int, clientYArg: Int, ctrlKeyArg: Boolean, altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean, buttonArg: Int, relatedTargetArg: EventTarget): Unit = js.native

  /**
   * Returns the current state of the specified modifier key. See the
   * KeyboardEvent.getModifierState() documentation for details.
   *
   * MDN
   */
  def getModifierState(keyArg: String): Boolean = js.native
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
  var width: Double = js.native
}


trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: String): Event = js.native
}

/**
 * A CDATA Section can be used within XML to include extended portions of
 * unescaped text, such that the symbols < and & do not need escaping as they
 * normally do within XML when used as text.
 *
 * As a CDATASection has no properties or methods unique to itself and only
 * directly implements the Text interface, one can refer to Text to find
 * its properties and methods.
 *
 * MDN
 */
abstract class CDATASection extends Text {
}


trait StyleMedia extends js.Object {
  def `type`: String = js.native

  def matchMedium(mediaquery: String): Boolean = js.native
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
  def isCollapsed: Boolean = js.native

  /**
   * Returns the node in which the selection begins.
   *
   * MDN
   */
  def anchorNode: Node = js.native

  /**
   * Returns the node in which the selection ends.
   *
   * MDN
   */
  def focusNode: Node = js.native

  /**
   * Returns a number representing the offset of the selection's anchor within the
   * anchorNode. If anchorNode is a text node, this is the number of characters within
   * anchorNode preceding the anchor. If anchorNode is an element, this is the number of
   * child nodes of the anchorNode preceding the anchor.
   *
   * MDN
   */
  def anchorOffset: Int = js.native

  /**
   * Returns a number representing the offset of the selection's anchor within the
   * focusNode. If focusNode is a text node, this is the number of characters within
   * focusNode preceding the focus. If focusNode is an element, this is the number of
   * child nodes of the focusNode preceding the focus.
   *
   * MDN
   */
  def focusOffset: Int = js.native

  /**
   * Returns the number of ranges in the selection.
   *
   * MDN
   */
  def rangeCount: Int = js.native

  /**
   * A range object that will be added to the selection.
   *
   * MDN
   */
  def addRange(range: Range): Unit = js.native

  /**
   * Collapses the selection to the end of the last range in the selection.  If the
   * content the selection is in is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapseToEnd(): Unit = js.native

  /**
   * Adds all the children of the specified node to the selection. Previous selection is
   * lost.
   *
   * MDN
   */
  def selectAllChildren(parentNode: Node): Unit = js.native

  /**
   * Returns a range object representing one of the ranges currently selected.
   *
   * MDN
   */
  def getRangeAt(index: Int): Range = js.native

  /**
   * Collapses the current selection to a single point. The document is not modified. If
   * the content is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapse(parentNode: Node, offset: Int): Unit = js.native

  /**
   * Removes all ranges from the selection, leaving the anchorNode and focusNode
   * properties equal to null and leaving nothing selected.
   *
   * MDN
   */
  def removeAllRanges(): Unit = js.native

  /**
   * Collapses the selection to the start of the first range in the selection.  If the
   * content of the selection is focused and editable, the caret will blink there.
   *
   * MDN
   */
  def collapseToStart(): Unit = js.native

  /**
   * Deletes the actual text being represented by a selection object from the
   * document's DOM.
   *
   * MDN
   */
  def deleteFromDocument(): Unit = js.native

  /**
   * Removes a range from the selection.
   *
   * MDN
   */
  def removeRange(range: Range): Unit = js.native
}


/**
 * The NodeIterator interface represents an iterator over the members of a list of the
 * nodes in a subtree of the DOM. The nodes will be returned in document order.
 *
 * A NodeIterator can be created using the Document.createNodeIterator() method.
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
  var whatToShow: Int = js.native

  /**
   * The NodeIterator.filter read-only method returns a NodeFilter object, that is an
   * object implement an acceptNode(node) method, used to screen nodes.
   *
   * MDN
   */
  def filter: NodeFilter = js.native

  /**
   * The NodeIterator.root read-only property represents the Node that is the root of
   * what the NodeIterator traverses.
   *
   * MDN
   */
  def root: Node = js.native

  /**
   * The NodeIterator.expandEntityReferences read-only property returns a Boolean
   * flag indicating whether or not the children of entity reference nodes are visible
   * to the NodeIterator.
   *
   * MDN
   */
  def expandEntityReferences: Boolean = js.native

  /**
   * The NodeIterator.nextNode() method returns the next node in the set represented
   * by the NodeIterator and advances the position of the iterator within the set.  The
   * first call to nextNode() returns the first node in the set.
   *
   * MDN
   */
  def nextNode(): Node = js.native

  /**
   * This operation is a no-op. It doesn't do anything. Previously it was telling the
   * engine that the NodeIterator was no more used, but this is now useless.
   *
   * MDN
   */
  def detach(): Unit = js.native

  /**
   * The NodeIterator.previousNode() method returns the previous node in the set
   * represented by the NodeIterator and moves the position of the iterator backwards
   * within the set.
   *
   * MDN
   */
  def previousNode(): Node = js.native
}


trait WindowSessionStorage extends js.Object {
  /**
   * This is a global object (sessionStorage) that maintains a storage area that's
   * available for the duration of the page session. A page session lasts for as
   * long as the browser is open and survives over page reloads and restores.
   * Opening a page in a new tab or window will cause a new session to be initiated.
   *
   * MDN
   */
  def sessionStorage: Storage = js.native
}

/**
 * The window object represents the window itself. The document property of
 * a window points to the DOM document loaded in that window. A window for a
 * given document can be obtained using the document.defaultView property.
 *
 * In a tabbed browser, such as Firefox, each tab contains its own window
 * object (and if you're writing an extension, the browser window itself
 * is a separate window too - see Working with windows in chrome code for
 * more information). That is, the window object is not shared between tabs
 * in the same window. Some methods, namely window.resizeTo and window.resizeBy
 * apply to the whole window and not to the specific tab the window object
 * belongs to. Generally, anything that can't reasonably pertain to a tab
 * pertains to the window instead.
 *
 * MDN
 */
class Window extends EventTarget with WindowLocalStorage
  with WindowSessionStorage with WindowTimers with WindowBase64
  with IDBEnvironment with WindowConsole {
  var ondragend: js.Function1[DragEvent, _] = js.native
  /**
   * An event handler property for keydown events on the window.
   *
   * MDN
   */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native
  /**
   * An event handler property for keyup events on the window.
   *
   * MDN
   */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native
  /**
   * An event handler property for reset events on the window.
   *
   * MDN
   */
  var onreset: js.Function1[Event, _] = js.native
  /**
   * An event handler property for mouseup events on the window.
   *
   * MDN
   */
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native
  /**
   * Returns the horizontal distance of the left border of the user's browser from the
   * left side of the screen.
   *
   * MDN
   */
  var screenX: Int = js.native
  /**
   * An event handler property for mouseover events on the window.
   *
   * MDN
   */
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  var ondragleave: js.Function1[DragEvent, _] = js.native

  /**
   * The Window.history read-only property returns a reference to the History object,
   * which provides an interface for manipulating the browser session history (pages
   * visited in the tab or frame that the current page is loaded in).
   *
   * MDN
   */
  def history: History = js.native

  /**
   * Returns the number of pixels that the document has already been scrolled
   * horizontally.
   *
   * MDN
   */
  def pageXOffset: Int = js.native

  /**
   * The name of the window is used primarily for setting targets for hyperlinks and
   * forms. Windows do not need to have names.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * The onafterprint property sets and returns the onafterprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onafterprint: js.Function1[Event, _] = js.native
  var onpause: js.Function1[Event, _] = js.native
  /**
   * The onbeforeprint property sets and returns the onbeforeprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onbeforeprint: js.Function1[Event, _] = js.native

  /**
   * Returns a reference to the topmost window in the window hierarchy. This property is
   * read only.
   *
   * MDN
   */
  def top: Window = js.native

  /**
   * An event handler property for mousedown events on the window.
   *
   * MDN
   */
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onseeked: js.Function1[Event, _] = js.native
  /**
   * Returns a reference to the window that opened this current window.
   *
   * MDN
   */
  var opener: Window = js.native
  /**
   * Called when the user clicks the mouse button while the cursor is in the window. This
   * event is fired for any mouse button pressed; you can look at the event properties to
   * find out which button was pressed and where.
   *
   * MDN
   */
  var onclick: js.Function1[MouseEvent, _] = js.native

  /**
   * Gets the width of the content area of the browser window including, if rendered, the
   * vertical scrollbar.
   *
   * MDN
   */
  def innerWidth: Int = js.native

  /**
   * Gets the height of the content area of the browser window including, if rendered,
   * the horizontal scrollbar.
   *
   * MDN
   */
  def innerHeight: Int = js.native

  var onwaiting: js.Function1[Event, _] = js.native
  var ononline: js.Function1[Event, _] = js.native
  var ondurationchange: js.Function1[Event, _] = js.native

  /**
   * Returns the window itself, which is an array-like object, listing the direct
   * sub-frames of the current window.
   *
   * MDN
   */
  def frames: Window = js.native

  /**
   * The onblur property can be used to set the blur handler on the window, which is
   * triggered when the window loses focus.
   *
   * MDN
   */
  var onblur: js.Function1[FocusEvent, _] = js.native
  var onemptied: js.Function1[Event, _] = js.native
  var onseeking: js.Function1[Event, _] = js.native
  var oncanplay: js.Function1[Event, _] = js.native

  /**
   * window.outerWidth gets the width of the outside of the browser window. It
   * represents the width of the whole browser window including sidebar (if expanded),
   * window chrome and window resizing borders/handles.
   *
   * MDN
   */
  def outerWidth: Int = js.native

  var onstalled: js.Function1[Event, _] = js.native
  /**
   * An event handler property for mousemove events on the window.
   *
   * MDN
   */
  var onmousemove: js.Function1[MouseEvent, _] = js.native

  var onoffline: js.Function1[Event, _] = js.native

  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * MDN
   */
  def length: Int = js.native

  /**
   * Specifies the height of the screen, in pixels, minus permanent or semipermanent
   * user interface features displayed by the operating system, such as the Taskbar on
   * Windows.
   *
   * MDN
   */
  def screen: Screen = js.native

  /**
   * An event that fires when a window is about to unload its resources. The document is
   * still visible and the event is still cancelable.
   *
   * MDN
   */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var onratechange: js.Function1[Event, _] = js.native
  var onstorage: js.Function1[StorageEvent, _] = js.native
  var onloadstart: js.Function1[Event, _] = js.native
  /**
   * Called for an element when the mouse pointer first moves over the element while
   * something is being dragged. This might be used to change the appearance of the
   * element to indicate to the user that the object can be dropped on it.
   *
   * MDN
   */
  var ondragenter: js.Function1[DragEvent, _] = js.native
  /**
   * An event handler property for submits on window forms.
   *
   * MDN
   */
  var onsubmit: js.Function1[Event, _] = js.native

  /**
   * Returns an object reference to the window object itself.
   *
   * MDN
   */
  def self: Window = js.native

  /**
   * Returns a reference to the document that the window contains.
   *
   * MDN
   */
  def document: HTMLDocument = js.native

  var onprogress: js.Function1[js.Any, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native

  /**
   * Returns the number of pixels that the document has already been scrolled
   * vertically.
   *
   * MDN
   */
  def pageYOffset: Int = js.native

  /**
   * An event handler property for right-click events on the window.
   *
   * MDN
   */
  var oncontextmenu: js.Function1[MouseEvent, _] = js.native
  /**
   * An event handler property for change events on the window.
   *
   * MDN
   */
  var onchange: js.Function1[Event, _] = js.native
  var onloadedmetadata: js.Function1[Event, _] = js.native
  var onplay: js.Function1[Event, _] = js.native
  /**
   * An event handler property for errors raised on the window.
   *
   * MDN
   */
  var onerror: js.Function4[Event, String, Int, Int, _] = js.native
  var onplaying: js.Function1[Event, _] = js.native

  /**
   * Returns a reference to the parent of the current window or subframe.
   *
   * MDN
   */
  def parent: Window = js.native

  /**
   * The Window.location property returns a Location object with
   * information about the current location of the document.
   *
   * MDN
   */
  var location: Location = js.native
  var oncanplaythrough: js.Function1[Event, _] = js.native
  /**
   * An event handler property for abort events on the window.
   *
   * MDN
   */
  var onabort: js.Function1[UIEvent, _] = js.native
  var onreadystatechange: js.Function1[Event, _] = js.native

  /**
   * window.outerHeight gets the height in pixels of the whole browser window. It
   * represents the height of the whole browser window including sidebar (if
   * expanded), window chrome and window resizing borders/handles.
   *
   * MDN
   */
  def outerHeight: Int = js.native

  /**
   * An event handler property for keypress events on the window.
   *
   * MDN
   */
  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /**
   * Returns the element (such as <iframe> or <object>) in which the window is embedded,
   * or null if the window is top-level.
   *
   * MDN
   */
  def frameElement: Element = js.native

  var onloadeddata: js.Function1[Event, _] = js.native
  var onsuspend: js.Function1[Event, _] = js.native

  /**
   * The window property of a window object points to the window object itself.
   *
   * MDN
   */
  def window: Window = js.native

  /**
   * An event handler property for focus events on the window.
   *
   * MDN
   */
  var onfocus: js.Function1[FocusEvent, _] = js.native
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native
  /**
   * An event handler for the resize event on the window.
   *
   * MDN
   */
  var onresize: js.Function1[UIEvent, _] = js.native
  /**
   * An event handler property for window selection.
   *
   * MDN
   */
  var onselect: js.Function1[UIEvent, _] = js.native

  /**
   * The Window.navigator read-only property returns a reference to the Navigator
   * object, which can be queried for information about the application running the
   * script.
   *
   * MDN
   */
  def navigator: Navigator = js.native

  def styleMedia: StyleMedia = js.native

  var ondrop: js.Function1[DragEvent, _] = js.native
  /**
   * An event handler property for mouseout events on the window.
   *
   * MDN
   */
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var onended: js.Function1[Event, _] = js.native
  /**
   * An event handler property for hash change events on the window; called when the part
   * of the URL after the hash mark ("#") changes.
   *
   * MDN
   */
  var onhashchange: js.Function1[HashChangeEvent, _] = js.native
  /**
   * The unload event is raised when the window is unloading its content and resources.
   * The resources removal is processed  after the unload event occurs.
   *
   * MDN
   */
  var onunload: js.Function1[Event, _] = js.native
  /**
   * Specifies the function to be called when the window is scrolled.
   *
   * MDN
   */
  var onscroll: js.Function1[UIEvent, _] = js.native

  /**
   * Returns the vertical distance of the top border of the user's browser from the top
   * edge of the screen.
   *
   * MDN
   */
  def screenY: Int = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native
  /**
   * An event handler property for window loading.
   *
   * MDN
   */
  var onload: js.Function1[Event, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var oninput: js.Function1[Event, _] = js.native

  /**
   * The Web Performance API allows web pages access to certain functions for measuring
   * the performance of web pages and web applications, including the Navigation
   * Timing API and high-resolution time data.
   *
   * MDN
   */
  def performance: Performance = js.native

  def alert(message: String): Unit = js.native

  /**
   * The Window.alert() method displays an alert dialog with the optional specified
   * content and an OK button.
   *
   * MDN
   */
  def alert(): Unit = js.native
  /**
   * Scrolls the window to a particular place in the document.
   *
   * MDN
   */
  def scroll(x: Int, y: Int): Unit = js.native

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and
   * the window isn't guaranteed to be frontmost before this method returns.
   *
   * MDN
   */
  def focus(): Unit = js.native
  /**
   * Scrolls to a particular set of coordinates in the document.
   *
   * MDN
   */
  def scrollTo(x: Int, y: Int): Unit = js.native

  /**
   * Opens the Print Dialog to print the current document.
   *
   * MDN
   */
  def print(): Unit = js.native

  def prompt(message: String, default: String = js.native): String = js.native

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user
   * to input some text.
   *
   * MDN
   */
  def prompt(): String = js.native
  /**
   * Loads a resource in a new browsing context or an existing one.
   *
   * MDN
   */
  def open(url: String = js.native,
           target: String = js.native,
           features: String = js.native,
           replace: Boolean = js.native): Window = js.native

  /**
   * Scrolls the document in the window by the given amount.
   *
   * MDN
   */
  def scrollBy(x: Int, y: Int): Unit = js.native

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and
   * two buttons, OK and Cancel.
   *
   * MDN
   */
  def confirm(message: String = js.native): Boolean = js.native


  /**
   * Closes the current window, or a referenced window.
   *
   * MDN
   */
  def close(): Unit = js.native
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
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Any = js.native): Unit = js.native

  /**
   * The Window.showModalDialog() creates and displays a modal dialog box containing
   * a specified HTML document.
   *
   * @param url The URI of the document to display in the dialog box
   * @param argument An optional variant the contains values that should be passed to the
   *                 dialog box; these are made available in the `window` object's
   *                 `dialogArguments` property.
   * @param options An optional String that specifies window ornamentation
   */
  def showModalDialog(url: String = js.native, argument: js.Any = js.native, options: js.Any = js.native): js.Dynamic = js.native

  /**
   * The window.blur() method is the programmatic equivalent of the user shifting
   * focus away from the current window.
   *
   * MDN
   */
  def blur(): Unit = js.native

  /**
   * Returns a selection object representing the range of text selected by the user.
   *
   * MDN
   */
  def getSelection(): Selection = js.native

  def getComputedStyle(elt: Element, pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /**
   * An OfflineResourceList object providing access to the offline resources for the
   * window.
   *
   * MDN
   */
  def applicationCache: ApplicationCache = js.native

  /**
   * An event handler property for popstate events, which are fired when navigating to a
   * session history entry representing a state object.
   *
   * MDN
   */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native

  /**
   * Returns a new MediaQueryList object representing the parsed results of the
   * specified media query string.
   *
   * MDN
   */
  def matchMedia(mediaQuery: String): MediaQueryList = js.native

  /**
   * Cancels an animation frame request previously scheduled through a call to
   * window.requestAnimationFrame().
   *
   * MDN
   */
  def cancelAnimationFrame(handle: Int): Unit = js.native

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to
   * perform an animation and requests that the browser call a specified function to
   * update an animation before the next repaint. The method takes as an argument a
   * callback to be invoked before the repaint.
   *
   * MDN
   */
  def requestAnimationFrame(callback: js.Function1[Double, _]): Int = js.native
}


/**
 * EventTarget is a DOM interface implemented by objects that can receive DOM events
 * and have listeners for them.
 *
 * Element, document, and window are the most common event targets, but other
 * objects can be event targets too, for example XMLHttpRequest, AudioNode,
 * AudioContext and others.
 *
 * Many event targets (including elements, documents, and windows) also support
 * setting event handlers via on... properties and attributes.
 *
 * MDN
 */
class EventTarget extends js.Object {
  /**
   * Removes the event listener previously registered with
   * EventTarget.addEventListener.
   *
   * MDN
   */
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _], useCapture: Boolean = js.native): Unit = js.native

  /**
   * The EventTarget.addEventListener() method registers the specified listener on
   * the EventTarget it's called on. The event target may be an Element in a document, the
   * Document itself, a Window, or any other object that supports events (such as
   * XMLHttpRequest).
   *
   * MDN
   */
  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _], useCapture: Boolean = js.native): Unit = js.native

  /**
   * Dispatches an Event at the specified EventTarget, invoking the affected
   * EventListeners in the appropriate order. The normal event processing rules
   * (including the capturing and optional bubbling phase) apply to events dispatched
   * manually with dispatchEvent().
   *
   * MDN
   */
  def dispatchEvent(evt: Event): Boolean = js.native
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
  def addColorStop(offset: Double, color: String): Unit = js.native
}


/**
 * A TouchEvent represents an event sent when the state of contacts with a
 * touch-sensitive surface changes. This surface can be a touch screen or trackpad,
 * for example. The event can describe one or more points of contact with the screen and
 * includes support for detecting movement, addition and removal of contact points,
 * and so forth.
 *
 * Touches are represented by the Touch object; each touch is described by
 * a position, size and shape, amount of pressure, and target element. Lists
 * of touches are represented by TouchList objects.
 *
 * MDN
 */
class TouchEvent extends UIEvent with ModifierKeyEvent {

  /**
   * A TouchList of all the Touch objects representing individual points of contact
   * whose states changed between the previous touch event and this one. Read only.
   *
   * MDN
   */
  def changedTouches: TouchList = js.native


  /**
   * A TouchList listing all the Touch objects for touch points that are still in contact
   * with the touch surface and whose touchstart event occurred inside the same target
   * element as the current target element.
   *
   * MDN
   */
  def targetTouches: TouchList = js.native

  /**
   * A TouchList listing all the Touch objects for touch points that are still in contact
   * with the touch surface, regardless of whether or not they've changed or what their
   * target was at touchstart time.
   *
   * MDN
   */
  def touches: TouchList = js.native

  /**
   * The target of the touches associated with this event. This target corresponds to
   * the target of all the touches in the targetTouches attribute, but note that other
   * touches in this event may have a different target. To be careful, you should use the
   * target associated with individual touches.
   *
   * MDN
   */
  override def target: EventTarget = js.native
}

/**
 * A TouchList represents a list of all of the points of contact with a touch surface;
 * for example, if the user has three fingers on the screen (or trackpad), the
 * corresponding TouchList would have one Touch object for each finger, for a total of
 * three entries.
 *
 * MDN
 */
class TouchList extends DOMList[Touch]

/**
 * A Touch object represents a single point of contact between the user and a touch-sensitive
 * interface device (which may be, for example, a touchscreen or a trackpad).
 *
 * Note: Many of these values are hardware-dependent; for example, if the device doesn't have a
 * way to detect the amount of pressure placed on the surface, the force value will always be 1.0.
 * This may also be the case for radiusX and radiusY; if the hardware reports only a single point,
 * these values will be 1.
 *
 * MDN
 */
class Touch extends js.Object {

  /**
   * A unique identifier for this Touch object. A given touch (say, by a finger) will have the same
   * identifier for the duration of its movement around the surface. This lets you ensure that you're
   * tracking the same touch all the time. Read only.
   *
   * MDN
   */
  def identifier: Double = js.native

  /**
   * The X coordinate of the touch point relative to the left edge of the screen.
   * Read only.
   *
   * MDN
   */
  def screenX: Double = js.native

  /**
   * The Y coordinate of the touch point relative to the top edge of the screen.
   * Read only.
   *
   * MDN
   */
  def screenY: Double = js.native

  /**
   * The X coordinate of the touch point relative to the left edge of the browser viewport,
   * not including any scroll offset. Read only.
   *
   * MDN
   */
  def clientX: Double = js.native

  /**
   * The Y coordinate of the touch point relative to the top edge of the browser viewport,
   * not including any scroll offset. Read only.
   *
   * MDN
   */
  def clientY: Double = js.native

  /**
   *  The X coordinate of the touch point relative to the left edge of the document. Unlike clientX,
   *  this value includes the horizontal scroll offset, if any.
   *
   * MDN
   *  Read only.
   */
  def pageX: Double = js.native

  /**
   * The Y coordinate of the touch point relative to the top of the document. Unlike clientY, this value
   * includes the vertical scroll offset, if any.
   * Read only.
   *
   * MDN
   */
  def pageY: Double = js.native

  /**
   * The X radius of the ellipse that most closely circumscribes the area of contact with the screen.
   * The value is in pixels of the same scale as screenX.
   * Read only.
   *
   * MDN
   */
  def radiusX: Double = js.native

  /**
   * The Y radius of the ellipse that most closely circumscribes the area of contact with the screen.
   * The value is in pixels of the same scale as screenY.
   * Read only.
   *
   * MDN
   */
  def radiusY: Double = js.native

  /**
   * The angle (in degrees) that the ellipse described by radiusX and radiusY must be rotated,
   * clockwise, to most accurately cover the area of contact between the user and the surface.
   * Read only.
   *
   * MDN
   */
  def rotationAngle: Double = js.native

  /**
   * The amount of pressure being applied to the surface by the user, as a float
   * between 0.0 (no pressure) and 1.0 (maximum pressure).
   * Read only.
   *
   * MDN
   */
  def force: Double = js.native

  /**
   * The Element on which the touch point started when it was first placed on the surface,
   * even if the touch point has since moved outside the interactive area of that element or
   * even been removed from the document. Note that if the target is removed from the document,
   * events will still be targeted at it, and hence won't necessarily bubble up to the window
   * or document anymore. If there's any risk of an element being removed while it is being
   * touched, best practice is to attach the touch listeners directly to the target.
   * Read only.
   *
   * MDN
   */
  def target: EventTarget = js.native

}
/**
 * KeyboardEvent objects describe a user interaction with the keyboard. Each event
 * describes a key; the event type (keydown, keypress, or keyup) identifies what
 * kind of activity was performed.
 *
 * Note: The KeyboardEvent indicates just what's happening on a key. When you need
 * to handle text input, use HTML5 input event instead. For example, if user inputs
 * text from hand-writing system like tablet PC, key events may not be fired.
 *
 * MDN
 *
 * Warning: keypress event is to be deprecated in favor of beforeinput event eventually
 *
 * W3C
 */
class KeyboardEvent extends UIEvent with ModifierKeyEvent {
  /**
   * Returns the Unicode value of a character key pressed during a keypress event.
   *
   * Note: Required especially in Gecko based browsers
   */
  def charCode: Int = js.native

  /**
   * A system and implementation dependent numerical code identifying the
   * unmodified value of the pressed key. This is usually the decimal ASCII
   * (RFC 20) or Windows 1252 code corresponding to the key; see Virtual key
   * codes for a list of Gecko's keyCode values. If the key can't be identified,
   * this value is 0. Read only.
   */
  def keyCode: Int = js.native

  /**
   * The location of the key on the keyboard or other input device.
   * See the constants in the KeyboardEvent object.
   *
   * MDN
   */
  def location: Int = js.native

  /**
   * A locale string indicating the locale the keyboard is configured for. This may
   * be the empty string if the browser or device doesn't know the keyboard's locale.
   *
   * Note: This does not describe the locale of the data being entered. A user may
   * be using one keyboard layout while typing text in a different language.
   *
   * MDN
   */
  def locale: String = js.native

  /**
   * The key value of the key represented by the event. If the value has a printed
   * representation, this attribute's value is the same as the char attribute.
   * Otherwise, it's one of the key value strings specified in Key values. If the
   * key can't be identified, this is the string "Unidentified". See key names for
   * the detail.
   *
   * MDN
   */
  def key: String = js.native

  /**
   * true if the key is being held down such that it is automatically repeating
   *
   * MDN
   */
  def repeat: Boolean = js.native

  /**
   * Returns the current state of the specified modifier key.
   */
  def getModifierState(keyArg: String): Boolean = js.native

  def initKeyboardEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, keyArg: String, locationArg: Int, modifiersListArg: String, repeat: Boolean, locale: String): Unit = js.native
}

object KeyboardEvent extends js.Object {
  def DOM_KEY_LOCATION_RIGHT: Int = js.native

  def DOM_KEY_LOCATION_STANDARD: Int = js.native

  def DOM_KEY_LOCATION_LEFT: Int = js.native

  def DOM_KEY_LOCATION_NUMPAD: Int = js.native

  def DOM_KEY_LOCATION_JOYSTICK: Int = js.native

  def DOM_KEY_LOCATION_MOBILE: Int = js.native
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
abstract class Document extends Node with NodeSelector with DocumentEvent with ParentNode {

  /**
   * Returns a DOMImplementation object associated with the current document.
   *
   * MDN
   */
  def implementation: DOMImplementation = js.native

  /**
   * Returns true if the XML declaration specifies the document is standalone (e.g., An
   * external part of the DTD affects the document's content), else false.
   *
   * MDN
   */
  @deprecated("Not supported by all browsers", "forever")
  def xmlStandalone: Boolean = js.native

  /**
   * Returns the character encoding of the current document.
   *
   * MDN
   */
  def characterSet: String = js.native

  /**
   * Returns the Document Type Declaration (DTD) associated with current document.
   * The returned object implements the DocumentType interface. Use
   * DOMImplementation.createDocumentType() to create a DocumentType.
   *
   * MDN
   */
  def doctype: DocumentType = js.native

  /**
   * Returns the Element that is the root element of the document (for example, the
   * <html> element for HTML documents).
   *
   * MDN
   */
  def documentElement: Element = js.native

  def documentURI: String = js.native

  /**
   * Returns a list of StyleSheet objects for stylesheets explicitly linked into or
   * embedded in a document.
   *
   * MDN
   */
  def styleSheets: StyleSheetList = js.native

  /**
   * Returns a string containing the date and time on which the current document was last
   * modified.
   *
   * MDN
   */
  def lastModified: String = js.native

  /**
   * Returns an object reference to the identified element.
   *
   * MDN
   */
  def getElementById(elementId: String): Element = js.native

  /**
   * Returns a list of elements with a given name in the (X)HTML document.
   *
   * MDN
   */
  def getElementsByName(elementName: String): NodeList = js.native

  /**
   * Returns a HTMLCollection of elements with the given tag name. The complete
   * document is searched, including the root node. The returned HTMLCollection is
   * live, meaning that it updates itself automatically to stay in sync with the DOM tree
   * without having to call document.getElementsByTagName again.
   *
   * MDN
   */
  def getElementsByTagName(tagname: String): NodeList = js.native

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace.
   * The complete document is searched, including the root node.
   *
   * MDN
   */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = js.native

  /**
   * Returns a set of elements which have all the given class names. When called on the
   * document object, the complete document is searched, including the root node. You
   * may also call getElementsByClassName on any element; it will return only elements
   * which are descendants of the specified root element with the given class names.
   *
   * MDN
   */
  def getElementsByClassName(classNames: String): NodeList = js.native

  /**
   * Returns the element from the document whose elementFromPoint method is being
   * called which is the topmost element which lies under the given point.  To get an
   * element, specify the point via coordinates, in CSS pixels, relative to the
   * upper-left-most point in the window or frame containing the document.
   *
   * MDN
   */
  def elementFromPoint(x: Double, y: Double): Element = js.native

  /**
   * Adopts a node from an external document. The node and its subtree is removed from the
   * document it's in (if any), and its ownerDocument is changed to the current
   * document. The node can then be inserted into the current document.
   *
   * MDN
   */
  def adoptNode(source: Node): Node = js.native

  /**
   * Returns an XPathResult based on an XPath expression and other given
   * parameters.
   *
   * MDN
   *
   * @param xpathExpression is a string representing the XPath to be
   *     evaluated.
   * @param contextNode specifies the context node for the query (see the
   *     http://www.w3.org/TR/xpath XPath specification). It's common to pass
   *     document as the context node.
   * @param namespaceResolver an `XPathNSResolver`
   * @param resultType is an integer that corresponds to the type of result
   *     XPathResult to return. Use named constant properties, such as
   *     XPathResult.ANY_TYPE, of the XPathResult constructor, which
   *     correspond to integers from 0 to 9.
   * @param result is an existing XPathResult to use for the results. null is
   *     the most common and will create a new XPathResult
   */
  def evaluate(xpathExpression: String, contextNode: Node,
      namespaceResolver: XPathNSResolver, resultType: Int,
      result: XPathResult): XPathResult = js.native

  /**
   * Returns an XPathResult based on an XPath expression and other given
   * parameters.
   *
   * MDN
   *
   * @param xpathExpression is a string representing the XPath to be
   *     evaluated.
   * @param contextNode specifies the context node for the query (see the
   *     [http://www.w3.org/TR/xpath XPath specification). It's common to pass
   *     document as the context node.
   * @param namespaceResolver is a function that will be passed any namespace
   *     prefixes and should return a string representing the namespace URI
   *     associated with that prefix. It will be used to resolve prefixes
   *     within the XPath itself, so that they can be matched with the
   *     document. null is common for HTML documents or when no namespace
   *     prefixes are used.
   * @param resultType is an integer that corresponds to the type of result
   *     XPathResult to return. Use named constant properties, such as
   *     XPathResult.ANY_TYPE, of the XPathResult constructor, which
   *     correspond to integers from 0 to 9.
   * @param result is an existing XPathResult to use for the results. null is
   *     the most common and will create a new XPathResult
   */
  def evaluate(xpathExpression: String, contextNode: Node,
      namespaceResolver: js.Function1[String, String], resultType: Int,
      result: XPathResult): XPathResult = js.native

  /**
   * Creates an XPathNSResolver which resolves namespaces with respect to the
   * definitions in scope for a specified node.
   *
   * MDN.
   */
  def createNSResolver(node: Node): XPathNSResolver = js.native

  /**
   * Creates a copy of a node from an external document that can be inserted into the
   * current document.
   *
   * MDN
   */
  def importNode(importedNode: Node, deep: Boolean): Node = js.native

  /**
   * In an HTML document creates the specified HTML element or HTMLUnknownElement if
   * the element is not known. In a XUL document creates the specified XUL element. In
   * other documents creates an element with a null namespaceURI.
   *
   * MDN
   */
  def createElement(tagName: String): Element = js.native

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * MDN
   */
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native

  /**
   * createAttribute creates a new attribute node, and returns it.
   *
   * MDN
   */
  def createAttribute(name: String): Attr = js.native

  /**
   * Creates a new attribute node in a given namespace and returns it.
   *
   * MDN
   */
  def createAttributeNS(namespaceURI: String, qualifiedName: String): Attr = js.native

  /**
   * createProcessingInstruction() creates a new processing instruction node, and
   * returns it.
   *
   * MDN
   */
  def createProcessingInstruction(target: String, data: String): ProcessingInstruction = js.native

  /**
   * createCDATASection() creates a new CDATA section node, and returns it.
   *
   * MDN
   */
  def createCDATASection(data: String): CDATASection = js.native

  /**
   * Once a Range is created, you need to set its boundary points before you can make use of
   * most of its methods.
   *
   * MDN
   */
  def createRange(): Range = js.native

  /**
   * createComment() creates a new comment node, and returns it.
   *
   * MDN
   */
  def createComment(data: String): Comment = js.native

  /**
   * Creates a new empty DocumentFragment.
   *
   * MDN
   */
  def createDocumentFragment(): DocumentFragment = js.native

  def createStyleSheet(href: String = js.native, index: Int = js.native): CSSStyleSheet = js.native

  def createTextNode(data: String): Text = js.native

  /**
   * Supported in FF 3.5+, Chrome 1+, Opera 9+, Safari 3+, IE9+
   *
   * MDN
   */
  def createNodeIterator(root: Node, whatToShow: Int, filter: NodeFilter, entityReferenceExpansion: Boolean): NodeIterator = js.native

  /**
   * The Document.createTreeWalker() creator method returns a newly created
   * TreeWalker object.
   *
   * MDN
   */
  def createTreeWalker(root: Node, whatToShow: Int, filter: NodeFilter, entityReferenceExpansion: Boolean): TreeWalker = js.native

  /**
   * Releases mouse capture if it's currently enabled on an element within this
   * document. Enabling mouse capture on an element is done by calling
   * element.setCapture().
   *
   * MDN
   */
  @deprecated("Non standard.", "forever")
  def releaseCapture(): Unit = js.native
}

/**
 * A MessageEvent is sent to clients using WebSockets when data is received from the
 * server. This is delivered to the listener indicated by the WebSocket object's
 * onmessage attribute.
 *
 * MDN
 */
class MessageEvent extends Event {
  def source: Window = js.native

  def origin: String = js.native

  /**
   * The data from the server (`String`, [[Blob]], or `ArrayBuffer`)
   *
   * MDN
   */
  def data: Any = js.native

  def initMessageEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, dataArg: js.Any, originArg: String, lastEventIdArg: String, sourceArg: Window): Unit = js.native

  def ports: js.Any = js.native
}


/**
 * The 2D rendering context for the drawing surface of a <canvas> element. To get this
 * object, call getContext() on a <canvas>, supplying "2d" as the argument:
 *
 * MDN
 */
class CanvasRenderingContext2D extends js.Object {
  /**
   * Default 10
   *
   * MDN
   */
  var miterLimit: Double = js.native
  /**
   * Default value 10px sans-serif
   *
   * MDN
   */
  var font: String = js.native
  /**
   * With globalAlpha applied this sets how shapes and images are drawn onto the
   * existing bitmap. Possible values: source-atop source-in source-out
   * source-over (default) destination-atop destination-in destination-out
   * destination-over lighter darker copy xor
   *
   * MDN
   */
  var globalCompositeOperation: String = js.native

  /**
   * Type of endings on the end of lines. Possible values: butt (default), round, square
   *
   * MDN
   */
  var lineCap: String = js.native

  /**
   * Specifies where to start a dasharray on a line.
   *
   * MDN
   */
  var lineDashOffset: Double = js.native
  /**
   * Color of the shadow. Default fully-transparent black.
   *
   * MDN
   */
  var shadowColor: String = js.native
  /**
   * Defines the type of corners where two lines meet. Possible values: round, bevel,
   * miter (default)
   *
   * MDN
   */
  var lineJoin: String = js.native
  /**
   * Horizontal distance the shadow will be offset. Default 0.
   *
   * MDN
   */
  var shadowOffsetX: Double = js.native
  /**
   * Width of lines. Default 1.0
   *
   * MDN
   */
  var lineWidth: Double = js.native
  /**
   * Back-reference to the canvas element for which this context was created. Read
   * only.
   *
   * MDN
   */
  var canvas: HTMLCanvasElement = js.native
  /**
   * A CSS color, a CanvasGradient or CanvasPattern, to use as a line around shapes.
   */
  var strokeStyle: js.Any = js.native
  /**
   * Alpha value that is applied to shapes and images before they are composited onto the
   * canvas. Default 1.0 (opaque).
   *
   * MDN
   */
  var globalAlpha: Double = js.native
  /**
   * Vertical distance the shadow will be offset. Default 0.
   *
   * MDN
   */
  var shadowOffsetY: Double = js.native
  /**
   * A CSS color, a CanvasGradient or CanvasPattern, to use as a fill.
   */
  var fillStyle: js.Any = js.native
  /**
   * Specifies the blurring effect. Default 0
   *
   * MDN
   */
  var shadowBlur: Double = js.native
  /**
   * Possible values: start (default), end, left, right or center.
   *
   * MDN
   */
  var textAlign: String = js.native
  /**
   * Possible values: top, hanging, middle, alphabetic (default), ideographic,
   * bottom
   *
   * MDN
   */
  var textBaseline: String = js.native

  /**
   * Restores the drawing style state to the last element on the 'state stack' saved by
   * save().
   *
   * MDN
   */
  def restore(): Unit = js.native

  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /**
   * Saves the current drawing style state using a stack so you can revert any change you
   * make to it using restore().
   *
   * MDN
   */
  def save(): Unit = js.native

  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native

  /**
   * Adds an arc to the path which is centered at (x, y) position with radius r starting at
   * startAngle and ending at endAngle going in the given direction by anticlockwise
   * (defaulting to clockwise).
   *
   * MDN
   */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native

  def measureText(text: String): TextMetrics = js.native

  def isPointInPath(x: Double, y: Double, fillRule: String): Boolean = js.native

  /**
   * Reports whether or not the specified point is contained in the current path.
   *
   * MDN
   */
  def isPointInPath(x: Double, y: Double): Boolean = js.native

  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native

  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double = js.native, dirtyY: Double = js.native, dirtyWidth: Double = js.native, dirtyHeight: Double = js.native): Unit = js.native

  def rotate(angle: Double): Unit = js.native

  def fillText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /**
   * Moves the origin point of the context to (x, y).
   *
   * MDN
   */
  def translate(x: Double, y: Double): Unit = js.native

  def scale(x: Double, y: Double): Unit = js.native

  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native

  /**
   * Connects the last point in the subpath to the x, y coordinates with a straight line.
   *
   * MDN
   */
  def lineTo(x: Double, y: Double): Unit = js.native

  /**
   * Returns a dash list array containing an even number of non-negative numbers.
   *
   * MDN
   */
  def getLineDash(): js.Array[Double] = js.native
  /**
   * Fills the subpaths with the current fill style.
   *
   * MDN
   */
  def fill(): Unit = js.native

  /**
   * Creates a new, blank ImageData object with the specified dimensions. All of the
   * pixels in the new object are transparent black.
   *
   * MDN
   */
  def createImageData(imageDataOrSw: js.Any, sh: Double = js.native): ImageData = js.native


  def createPattern(image: HTMLElement, repetition: String): CanvasPattern = js.native

  /**
   * Tries to draw a straight line from the current point to the start. If the shape has
   * already been closed or has only one point, this function does nothing.
   *
   * MDN
   */
  def closePath(): Unit = js.native

  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /**
   * Creates a clipping path from the current sub-paths. Everything drawn after clip()
   * is called appears inside the clipping path only. For an example, see Clipping paths
   * in the Canvas tutorial.
   *
   * MDN
   */
  def clip(fillRule: String = js.native): Unit = js.native


  /**
   * Sets all pixels in the rectangle defined by starting point (x, y) and size (width,
   * height) to transparent black.
   *
   * MDN
   */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  /**
   * Moves the starting point of a new subpath to the (x, y) coordinates.
   *
   * MDN
   */
  def moveTo(x: Double, y: Double): Unit = js.native

  /**
   * Returns an ImageData object representing the underlying pixel data for the area of
   * the canvas denoted by the rectangle which starts at (sx, sy) and has an sw width and sh
   * height.
   *
   * MDN
   */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native

  /**
   * Draws a filled rectangle at (x, y) position whose size is determined by width and
   * height.
   *
   * MDN
   */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  /**
   * Draws the specified image. This method is available in multiple formats,
   * providing a great deal of flexibility in its use.
   *
   * MDN
   */
  def drawImage(image: HTMLElement, offsetX: Double, offsetY: Double, width: Double = js.native, height: Double = js.native, canvasOffsetX: Double = js.native, canvasOffsetY: Double = js.native, canvasImageWidth: Double = js.native, canvasImageHeight: Double = js.native): Unit = js.native

  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native

  /**
   * Strokes the subpaths with the current stroke style.
   *
   * MDN
   */
  def stroke(): Unit = js.native

  /**
   * Paints a rectangle which has a starting point at (x, y) and has a w width and an h height
   * onto the canvas, using the current stroke style.
   *
   * MDN
   */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native

  def setLineDash(segments: js.Array[Double]): Unit = js.native

  def strokeText(text: String, x: Double, y: Double, maxWidth: Double = js.native): Unit = js.native

  /**
   * Starts a new path by resetting the list of sub-paths. Call this method when you want
   * to create a new path.
   *
   * MDN
   */
  def beginPath(): Unit = js.native

  /**
   * Adds an arc with the given control points and radius, connected to the previous
   * point by a straight line.
   *
   * MDN
   */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native

  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
}


/**
 * XMLHttpRequest is a JavaScript object that was designed by Microsoft and adopted
 * by Mozilla, Apple, and Google. It's now being standardized in the W3C. It provides
 * an easy way to retrieve data from a URL without having to do a full page refresh. A Web
 * page can update just a part of the page without disrupting what the user is doing.
 * XMLHttpRequest is used heavily in AJAX programming.
 *
 * Despite its name, XMLHttpRequest can be used to retrieve any type of data,
 * not just XML, and it supports protocols other than HTTP (including file and ftp).
 *
 * MDN
 */
class XMLHttpRequest extends EventTarget {

  /**
   * The status of the response to the request. This is the HTTP result code (for example,
   * status is 200 for a successful request).
   *
   * MDN
   */
  def status: Int = js.native

  /**
   * The state of the request: Value State Description 0 UNSENT open()has not been
   * called yet. 1 OPENED send()has not been called yet. 2 HEADERS_RECEIVED send() has
   * been called, and headers and status are available. 3 LOADING Downloading;
   * responseText holds partial data. 4 DONE The operation is complete.
   *
   * MDN
   */
  def readyState: Int = js.native

  /**
   * The response to the request as text, or null if the request was unsuccessful or has
   * not yet been sent.
   *
   * MDN
   */
  def responseText: String = js.native

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
  def responseXML: Document = js.native

  var ontimeout: js.Function1[Event, _] = js.native

  /**
   * The response string returned by the HTTP server. Unlike status, this includes the
   * entire text of the response message ("200 OK", for example).
   *
   * MDN
   */
  def statusText: String = js.native

  var onreadystatechange: js.Function1[Event, _] = js.native
  /**
   * The number of milliseconds a request can take before automatically being
   * terminated. A value of 0 (which is the default) means there is no timeout. Note: You
   * may not use a timeout for synchronous requests with an owning window.
   *
   * MDN
   */
  var timeout: Double = js.native
  var onload: js.Function1[Event, _] = js.native
  /**
   * Initializes a request. This method is to be used from JavaScript code; to
   * initialize a request from native code, use openRequest()instead.
   *
   * MDN
   */
  def open(method: String, url: String, async: Boolean = js.native, user: String = js.native, password: String = js.native): Unit = js.native

  def create(): XMLHttpRequest = js.native
  /**
   * Sends the request. If the request is asynchronous (which is the default), this
   * method returns as soon as the request is sent. If the request is synchronous, this
   * method doesn't return until the response has arrived.
   *
   * MDN
   */
  def send(data: js.Any = js.native): Unit = js.native


  /**
   * Aborts the request if it has already been sent.
   *
   * MDN
   */
  def abort(): Unit = js.native

  def getAllResponseHeaders(): String = js.native

  /**
   * Sets the value of an HTTP request header. You must call setRequestHeader()
   * after open(), but before send(). If this method is called several times with the
   * same header, the values are merged into one single request header.
   *
   * MDN
   */
  def setRequestHeader(header: String, value: String): Unit = js.native

  def getResponseHeader(header: String): String = js.native


  /**
   * The response entity body according to responseType, as an ArrayBuffer, Blob,
   * Document, JavaScript object (for "json"), or string. This is null if the request is
   * not complete or was not successful.
   *
   * MDN
   */
  def response: js.Any = js.native

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
  var withCredentials: Boolean = js.native
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  var onabort: js.Function1[js.Any, _] = js.native
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
  var responseType: String = js.native
  var onloadend: js.Function1[ProgressEvent, _] = js.native
  /**
   * The upload process can be tracked by adding an event listener to upload.
   *
   * MDN
   */
  var upload: XMLHttpRequestEventTarget = js.native
  var onerror: js.Function1[ErrorEvent, _] = js.native
  var onloadstart: js.Function1[js.Any, _] = js.native
}

object XMLHttpRequest extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: Int = js.native
  var DONE: Int = js.native
  var UNSENT: Int = js.native
  var OPENED: Int = js.native
  var HEADERS_RECEIVED: Int = js.native
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
  def width: Double = js.native

  /**
   * Returns the amount of vertical space available to the window on the screen.
   *
   * MDN
   */
  def availHeight: Double = js.native

  /**
   * Returns the height of the screen in pixels.
   *
   * MDN
   */
  def height: Double = js.native

  /**
   * Returns the color depth of the screen.
   *
   * MDN
   */
  def colorDepth: Int = js.native

  /**
   * Returns the amount of horizontal space in pixels available to the window.
   *
   * MDN
   */
  def availWidth: Double = js.native

  /**
   * Returns the bit depth of the screen.
   *
   * MDN
   */
  def pixelDepth: Int = js.native
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
  def altitudeAccuracy: Double = js.native

  /**
   * The Coordinates.longitude read-only property is a double representing the
   * longitude of the position in decimal degrees.
   *
   * MDN
   */
  def longitude: Double = js.native

  /**
   * The Coordinates.latitude read-only property is a double representing the
   * latitude of the position in decimal degrees.
   *
   * MDN
   */
  def latitude: Double = js.native

  /**
   * The Coordinates.speed read-only property is a double representing the velocity
   * of the device in meters per second. This value is null if the implementation is not
   * able to measure it.
   *
   * MDN
   */
  def speed: Double = js.native

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
  def heading: Double = js.native

  /**
   * The Coordinates.altitude read-only property is a double representing the
   * altitude of the position in meters, relative to sea level. This value is null if the
   * implementation cannot provide this data.
   *
   * MDN
   */
  def altitude: Double = js.native

  /**
   * The Coordinates.accuracy read-only property is a strictly positive double
   * representing the accuracy, with a 95% confidence level, of the
   * Coordinates.latitude and Coordinates.longitude properties expressed in
   * meters.
   *
   * MDN
   */
  def accuracy: Double = js.native
}


/**
 * The NavigatorGeolocation interface contains a constructor method allowing
 * objects implementing it to obtain a Geolocation instance.
 *
 * There is no object of type NavigatorGeolocation, but some, like Navigator
 * implements it.
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
  def geolocation: Geolocation = js.native
}

trait NavigatorContentUtils extends js.Object {
}

/**
 * When dragging, there are several operations that may be performed. The copy
 * operation is used to indicate that the data being dragged will be copied from
 * its present location to the drop location. The move operation is used to
 * indicate that the data being dragged will be moved, and the link operation is
 * used to indicate that some form of relationship or connection will be created
 * between the source and drop locations.
 *
 * You can specify which of the three operations are allowed for a drag source
 * by setting the `effectAllowed` property within a `dragstart` event listener.
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

/**
 * The DataTransfer object is used to hold the data that is being dragged during a drag
 * and drop operation. It may hold one or more data items, each of one or more data types.
 * For more information about drag and drop, see Drag and Drop.
 *
 * This object is available from the dataTransfer property of all drag events.
 * It cannot be created separately.
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
   *
   * See [[DragEffect]] for possible values.
   */
  var effectAllowed: String = js.native

  /**
   * The actual effect that will be used, and should always be one of the possible values
   * of effectAllowed.
   *
   * MDN
   *
   * See [[DragEffect]] for possible values.
   */
  var dropEffect: String = js.native

  /**
   * Remove the data associated with a given type. The type argument is optional. If the
   * type is empty or not specified, the data associated with all types is removed. If
   * data for the specified type does not exist, or the data transfer contains no data,
   * this method will have no effect.
   *
   * MDN
   */
  def clearData(format: String = js.native): Unit = js.native

  /**
   * Set the data for a given type. If data for the type does not exist, it is added at the
   * end, such that the last item in the types list will be the new format. If data for the
   * type already exists, the existing data is replaced in the same position. That is,
   * the order of the types list is not changed when replacing data of the same type.
   *
   * MDN
   */
  def setData(format: String, data: String): Unit = js.native

  /**
   * Set the image to be used for dragging if a custom one is desired. Most of the time, this
   * would not be set, as a default image is created from the node that was dragged.
   *
   * If the node is an HTML img element, an HTML canvas element or a XUL image element, the
   * image data is used. Otherwise, image should be a visible node and the drag image will be
   * created from this. If image is null, any custom drag image is cleared and the default is
   * used instead.
   *
   * The coordinates specify the offset into the image where the mouse cursor should be. To
   * center the image, for instance, use values that are half the width and height of the image.
   *
   * @param image An element to use as the drag feedback image.
   * @param x Horizontal offset within the image.
   * @param y Vertical offset within the image.
   */
  def setDragImage(image: Element, x: Double, y: Double): Unit = js.native

  /**
   * Retrieves the data for a given type, or an empty string if data for that type does not
   * exist or the data transfer contains no data.
   *
   * A security error will occur if you attempt to retrieve data during a drag that was set
   * from a different domain, or the caller would otherwise not have access to. This data will
   * only be available once a drop occurs during the drop event.
   *
   * MDN
   */
  def getData(format: String): String = js.native

  /**
   * Holds a list of the format types of the data that is stored for the first item, in the
   * same order the data was added. An empty list will be returned if no data was added.
   *
   * MDN
   */
  def types: DOMStringList = js.native

  def files: FileList = js.native
}

trait ClipboardEventInit extends js.Object {
  /**
   * The data for this clipboard event.
   */
  val data: String = js.native

  /**
   * The MIME type of the data.
   */
  val dataType: String = js.native
}

object ClipboardEventInit {
  /**
   * Construct a new ClipboardEventInit
   *
   * @param data       The data for this clipboard event
   * @param dataType   The MIME type of the data.
   * @return a new ClipBoardEventInit
   */
  @inline
  def apply(data: js.UndefOr[String] = js.undefined,
    dataType: js.UndefOr[String] = js.undefined): ClipboardEventInit = {
    val result = js.Dynamic.literal()
    data.foreach(result.data = _)
    dataType.foreach(result.dataType = _)
    result.asInstanceOf[ClipboardEventInit]
  }
}

/**
 * The ClipboardEvent interface represents events providing information related to
 * modification of the clipboard, that is cut, copy, and paste events.
 *
 * MDN
 */
class ClipboardEvent(`type`: String, settings: ClipboardEventInit) extends Event {
  @deprecated("Use the overload with a ClipboardEventInit instead.", "0.8.1")
  def this(`type`: String, settings: js.Dynamic) = this(`type`, settings.asInstanceOf[ClipboardEventInit])

  /**
   * Is a DataTransfer object containing the data affected by the user-initialed cut, copy,
   * or paste operation, along with its MIME type.
   *
   * MDN
   */
  def clipboardData: DataTransfer = js.native
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
  def relatedTarget: EventTarget = js.native

  def initFocusEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Int, relatedTargetArg: EventTarget): Unit = js.native
}


/**
 * The Range interface represents a fragment of a document that can contain nodes and
 * parts of text nodes in a given document.
 *
 * A range can be created using the createRange method of the Document object.
 * Range objects can also be retrieved by using the getRangeAt method of the
 * Selection object. There also is the Range() constructor available.
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
  def startOffset: Int = js.native

  /**
   * The Range.collapsed read-only property returns a Boolean flag indicating
   * whether the start and end points of the Range are at the same position. It returns
   * true if the start and end boundary points of the Range are the same point in the DOM,
   * false if not.
   *
   * MDN
   */
  def collapsed: Boolean = js.native

  /**
   * The Range.endOffset read-only property returns a number representing where in
   * the Range.endContainer the Range ends.
   *
   * MDN
   */
  def endOffset: Int = js.native

  /**
   * The Range.startContainer read-only property returns the Node within which the
   * Range starts. To change the start position of a node, use one of the
   * Range.setStart() methods.
   *
   * MDN
   */
  def startContainer: Node = js.native

  /**
   * The Range.endContainer read-only property returns the Node within which the
   * Range ends. To change the end position of a node, use the Range.setEnd() method or a
   * similar one.
   *
   * MDN
   */
  def endContainer: Node = js.native

  /**
   * The Range.commonAncestorContainer read-only property returns the deepest, or
   * further down the document tree, Node that contains both the Range.startContainer
   * and Range.endContainer nodes.
   *
   * MDN
   */
  def commonAncestorContainer: Node = js.native

  /**
   * The Range.setStart() method sets the start position of a Range.
   *
   * MDN
   */
  def setStart(refNode: Node, offset: Int): Unit = js.native

  /**
   * The Range.setEndBefore() method sets the end position of a Range relative to
   * another Node. The parent Node of end of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setEndBefore(refNode: Node): Unit = js.native

  /**
   * The Range.setStartBefore() method sets the start position of a Range relative to
   * another Node. The parent Node of the start of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setStartBefore(refNode: Node): Unit = js.native

  /**
   * The Range.selectNode() method sets the Range to contain the Node and its contents.
   * The parent Node of the start and end of the Range will be the same as the parent of the
   * referenceNode.
   *
   * MDN
   */
  def selectNode(refNode: Node): Unit = js.native

  /**
   * The Range.detach() method releases a Range from use. This lets the browser choose
   * to release resources associated with this Range. Subsequent attempts to use the
   * detached range will result in a DOMException being thrown with an error code of
   * INVALID_STATE_ERR.
   *
   * MDN
   */
  def detach(): Unit = js.native

  /**
   * The Range.getBoundingClientRect() method returns a ClientRect object that
   * bounds the contents of the range; this a rectangle enclosing the union of the
   * bounding rectangles for all the elements in the range.
   *
   * MDN
   */
  def getBoundingClientRect(): ClientRect = js.native

  /**
   * The Range.compareBoundaryPoints() method compares the boundary points of the
   * Range with another one.
   *
   * MDN
   */
  def compareBoundaryPoints(how: Int, sourceRange: Range): Int = js.native

  /**
   * The Range.insertNode() method inserts a node at the start of the Range.
   *
   * MDN
   */
  def insertNode(newNode: Node): Unit = js.native

  /**
   * The Range.collapse() method collapses the Range to one of its boundary points.
   *
   * MDN
   */
  def collapse(toStart: Boolean): Unit = js.native

  /**
   * The Range.selectNodeContents() sets the Range to contain the contents of
   * a Node.
   *
   * MDN
   */
  def selectNodeContents(refNode: Node): Unit = js.native

  /**
   * The Range.cloneContents() returns a DocumentFragment copying the objects of
   * type Node included in the Range.
   *
   * MDN
   */
  def cloneContents(): DocumentFragment = js.native

  /**
   * The Range.setEnd() method sets the end position of a Range.
   *
   * MDN
   */
  def setEnd(refNode: Node, offset: Int): Unit = js.native

  /**
   * The Range.cloneRange() method returns a Range object with boundary points
   * identical to the cloned Range.
   *
   * MDN
   */
  def cloneRange(): Range = js.native

  /**
   * The Range.getClientRects() method returns a list of ClientRect objects
   * representing the area of the screen occupied by the range. This is created by
   * aggregating the results of calls to Element.getClientRects() for all the
   * elements in the range.
   *
   * MDN
   */
  def getClientRects(): ClientRectList = js.native

  /**
   * The Range.surroundContents() method moves content of the Range into a new node,
   * placing the new node at the start of the specified range.
   *
   * MDN
   */
  def surroundContents(newParent: Node): Unit = js.native

  /**
   * The Range.deleteContents() removes the contents of the Range from the Document.
   *
   * MDN
   */
  def deleteContents(): Unit = js.native

  /**
   * The Range.setStartAfter() method sets the start position of a Range relative to a
   * Node. The parent Node of the start of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setStartAfter(refNode: Node): Unit = js.native

  /**
   * The Range.extractContents() method moves contents of the Range from the
   * document tree into a DocumentFragment.
   *
   * MDN
   */
  def extractContents(): DocumentFragment = js.native

  /**
   * The Range.setEndAfter() method sets the end position of a Range relative to
   * another Node. The parent Node of end of the Range will be the same as that for the
   * referenceNode.
   *
   * MDN
   */
  def setEndAfter(refNode: Node): Unit = js.native

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
  def createContextualFragment(fragment: String): DocumentFragment = js.native
}

object Range extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Range),List())))) */
  val END_TO_END: Int = js.native
  val START_TO_START: Int = js.native
  val START_TO_END: Int = js.native
  val END_TO_START: Int = js.native
}

/**
 * The DOM Storage mechanism is a means through which string key/value pairs can
 * be securely stored and later retrieved for use. The goal of this addition is
 * to provide a comprehensive means through which interactive applications can
 * be built (including advanced abilities, such as being able to work "offline"
 * for extended periods of time).
 *
 * MDN
 */
class Storage extends js.Object {
  var length: Int = js.native

  def getItem(key: String): String = js.native

  def setItem(key: String, data: String): Unit = js.native

  def clear(): Unit = js.native

  def removeItem(key: String): Unit = js.native

  def key(index: Int): String = js.native
}


/**
 * The DocumentType interface represents a Node containing a doctype.
 *
 * MDN
 */
abstract class DocumentType extends Node {
  def name: String = js.native

  def notations: NamedNodeMap = js.native

  def systemId: String = js.native

  def internalSubset: String = js.native

  def entities: NamedNodeMap = js.native

  def publicId: String = js.native
}


class MutationEvent extends Event {
  def newValue: String = js.native

  def attrChange: Int = js.native

  def attrName: String = js.native

  def prevValue: String = js.native

  def relatedNode: Node = js.native

  def initMutationEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, relatedNodeArg: Node, prevValueArg: String, newValueArg: String, attrNameArg: String, attrChangeArg: Int): Unit = js.native

}

object MutationEvent extends js.Object {
  val MODIFICATION: Int = js.native
  val REMOVAL: Int = js.native
  val ADDITION: Int = js.native
}

/**
 * MutationObserver provides developers a way to react to changes in a DOM.
 * It is designed as a replacement for Mutation Events defined in the
 * DOM3 Events specification.
 *
 * MDN
 */
class MutationObserver(callback: js.Function2[js.Array[MutationRecord], MutationObserver, _]) extends js.Object {
  /**
   * Registers the MutationObserver instance to receive notifications of DOM
   * mutations on the specified node.
   *
   * MDN
   */
  def observe(target: Node, options: MutationObserverInit): Unit = js.native

  /**
   * Stops the MutationObserver instance from receiving notifications of DOM
   * mutations. Until the observe() method is used again, observer's callback
   * will not be invoked.
   *
   * MDN
   */
  def disconnect(): Unit = js.native

  /**
   * Empties the MutationObserver instance's record queue
   * and returns what was in there.
   *
   * MDN
   */
  def takeRecords(): js.Array[MutationRecord] = js.native
}

/**
 * MutationObserverInit is an object which can specify the following properties:
 * NOTE: At the very least, childList, attributes, or characterDatamust be set
 * to true. Otherwise, "An invalid or illegal string was specified" error is thrown.
 *
 * MDN
 */
trait MutationObserverInit extends js.Object {
  /**
   * Set to true if additions and removals of the target node's child elements
   * (including text nodes) are to be observed.
   *
   * MDN
   */
  var childList: js.UndefOr[Boolean] = js.native
  /**
   * Set to true if mutations to target's attributes are to be observed.
   *
   * MDN
   */
  var attributes: js.UndefOr[Boolean] = js.native
  /**
   * Set to true if mutations to target's data are to be observed.
   *
   * MDN
   */
  var characterData: js.UndefOr[Boolean] = js.native
  /**
   * Set to true if mutations to not just target, but also target's descendants
   * are to be observed.
   *
   * MDN
   */
  var subtree: js.UndefOr[Boolean] = js.native
  /**
   * Set to true if attributes is set to true and target's attribute value
   * before the mutation needs to be recorded.
   *
   * MDN
   */
  var attributeOldValue: js.UndefOr[Boolean] = js.native
  /**
   * Set to true if characterData is set to true and target's data before the
   * mutation needs to be recorded.
   *
   * MDN
   */
  var characterDataOldValue: js.UndefOr[Boolean] = js.native
  /**
   * Set to an array of attribute local names (without namespace) if not all
   * attribute mutations need to be observed.
   *
   * MDN
   */
  var attributeFilter: js.UndefOr[js.Array[String]] = js.native
}

/** Factory for [[MutationObserverInit]] objects. */
object MutationObserverInit {
  /**
   * Creates a new [[MutationObserverInit]] object with the given values.
   * Default values for the `Boolean` parameters are `false`.
   * If the value of `attributeFilter` is `js.undefined`, created object won't
   * have `attributeFilter` property.
   */
  def apply(
    childList: Boolean = false,
    attributes: Boolean = false,
    characterData: Boolean = false,
    subtree: Boolean = false,
    attributeOldValue: Boolean = false,
    characterDataOldValue: Boolean = false,
    attributeFilter: js.UndefOr[js.Array[String]] = js.undefined): MutationObserverInit = {
    val res = js.Dynamic.literal(
      "childList" -> childList,
      "attributes" -> attributes,
      "characterData" -> characterData,
      "subtree" -> subtree,
      "attributeOldValue" -> attributeOldValue,
      "characterDataOldValue" -> characterDataOldValue)
      .asInstanceOf[MutationObserverInit]
    attributeFilter.foreach(res.attributeFilter = _)
    res
  }
}

/**
 * MutationRecord is the object that will be passed to the observer's callback.
 * It has the following properties:
 *
 * MDN
 */
trait MutationRecord extends js.Object {
  /**
   * Returns attributes if the mutation was an attribute mutation, characterData
   * if it was a mutation to a CharacterData node, and childList if it was a
   * mutation to the tree of nodes.
   *
   * MDN
   */
  def `type`: String = js.native
  /**
   * Returns the node the mutation affected, depending on the type.
   * For attributes, it is the element whose attribute changed.
   * For characterData, it is the CharacterData node.
   * For childList, it is the node whose children changed.
   *
   * MDN
   */
  def target: Node = js.native
  /**
   * Return the nodes added. Will be an empty NodeList if no nodes were added.
   *
   * MDN
   */
  def addedNodes: NodeList = js.native
  /**
   * Return the nodes removed. Will be an empty NodeList if no nodes were removed.
   *
   * MDN
   */
  def removedNodes: NodeList = js.native
  /**
   * Return the previous sibling of the added or removed nodes, or null.
   *
   * MDN
   */
  def previousSibling: Node = js.native
  /**
   * Return the next sibling of the added or removed nodes, or null.
   *
   * MDN
   */
  def nextSibling: Node = js.native
  /**
   * Returns the local name of the changed attribute, or null.
   *
   * MDN
   */
  def attributeName: String = js.native
  /**
   * Returns the namespace of the changed attribute, or null.
   *
   * MDN
   */
  def attributeNamespace: String = js.native
  /**
   * The return value depends on the type. For attributes, it is the value of
   * the changed attribute before the change. For characterData, it is the data
   * of the changed node before the change. For childList, it is null.
   *
   * MDN
   */
  def oldValue: String = js.native
}

trait DragEvent extends MouseEvent {
  def dataTransfer: DataTransfer = js.native

  def initDragEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Int, screenXArg: Int, screenYArg: Int, clientXArg: Int, clientYArg: Int, ctrlKeyArg: Boolean, altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean, buttonArg: Int, relatedTargetArg: EventTarget, dataTransferArg: DataTransfer): Unit = js.native
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
  def redirectStart: Double = js.native

  /**
   * The PerformanceTiming.domainLookupEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, where the
   * domain lookup is finished. If a persistent connection is used, or the information
   * is stored in a cache or a local resource, the value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  def domainLookupEnd: Double = js.native

  /**
   * The PerformanceTiming.responseStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * browser received the first byte of the response, from the server from a cache, of
   * from a local resource.
   *
   * MDN
   */
  def responseStart: Double = js.native

  /**
   * The PerformanceTiming.domComplete read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the parser
   * finished its work on the main document, that is when its Document.readyState
   * changes to 'complete' and the corresponding readystatechange event is thrown.
   *
   * MDN
   */
  def domComplete: Double = js.native

  /**
   * The PerformanceTiming.domainLookupStart read-only property returns an
   * unsigned long long representing the moment, in miliseconds since the UNIX epoch,
   * where the domain lookup starts. If a persistent connection is used, or the
   * information is stored in a cache or a local resource, the value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  def domainLookupStart: Double = js.native

  /**
   * The PerformanceTiming.loadEventStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * load event was sent for the current document. If this event has not yet been sent, it
   * returns 0.
   *
   * MDN
   */
  def loadEventStart: Double = js.native

  /**
   * The PerformanceTiming.unloadEventEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, the unload
   * event handler finishes. If there is no previous document, or if the previous
   * document, or one of the needed redirects, is not of the same origin, the value
   * returned is 0.
   *
   * MDN
   */
  def unloadEventEnd: Double = js.native

  /**
   * The PerformanceTiming.fetchStart read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, the browser is
   * ready to fetch the document using an HTTP request. This moment is before the check to
   * any application cache.
   *
   * MDN
   */
  def fetchStart: Double = js.native

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
  def requestStart: Double = js.native

  /**
   * The PerformanceTiming.domInteractive read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * parser finished its work on the main document, that is when its
   * Document.readyState changes to 'interactive' and the corresponding
   * readystatechange event is thrown.
   *
   * MDN
   */
  def domInteractive: Double = js.native

  /**
   * The PerformanceTiming.navigationStart read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, right
   * after the prompt for unload terminates on the previous document in the same
   * browsing context. If there is no previous document, this value will be the same as
   * PerformanceTiming.fetchStart.
   *
   * MDN
   */
  def navigationStart: Double = js.native

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
  def connectEnd: Double = js.native

  /**
   * The PerformanceTiming.loadEventEnd read-only property returns an unsigned
   * long long representing the moment, in miliseconds since the UNIX epoch, when the
   * load event handler terminated, that is when the load event is completed. If this
   * event has not yet been sent, or is not yet completed, it returns 0.
   *
   * MDN
   */
  def loadEventEnd: Double = js.native

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
  def connectStart: Double = js.native

  /**
   * The PerformanceTiming.responseEnd read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the
   * browser received the last byte of the response, or when the connection is closed if
   * this happened first, from the server from a cache, of from a local resource.
   *
   * MDN
   */
  def responseEnd: Double = js.native

  /**
   * The PerformanceTiming.domLoading read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, when the parser
   * started its work, that is when its Document.readyState changes to 'loading' and
   * the corresponding readystatechange event is thrown.
   *
   * MDN
   */
  def domLoading: Double = js.native

  /**
   * The PerformanceTiming.redirectEnd read-only property returns an unsigned long
   * long representing the moment, in miliseconds since the UNIX epoch, the last HTTP
   * redirect is completed, that is when the last byte of the HTTP response has been
   * received. If there is no redirect, or if one of the redirect is not of the same origin,
   * the value returned is 0.
   *
   * MDN
   */
  def redirectEnd: Double = js.native

  /**
   * The PerformanceTiming.unloadEventStart read-only property returns an
   * unsigned long long representing the moment, in miliseconds since the UNIX epoch,
   * the unload event has been thrown. If there is no previous document, or if the
   * previous document, or one of the needed redirects, is not of the same origin, the
   * value returned is 0.
   *
   * MDN
   */
  def unloadEventStart: Double = js.native

  /**
   * The PerformanceTiming.domContentLoadedEventStart read-only property
   * returns an unsigned long long representing the moment, in miliseconds since the
   * UNIX epoch, right before the parser sent the DOMContentLoaded event, that is right
   * after all the scripts that need to be executed right after parsing has been
   * executed.
   *
   * MDN
   */
  def domContentLoadedEventStart: Double = js.native

  /**
   * The PerformanceTiming.domContentLoadedEventEnd read-only property returns
   * an unsigned long long representing the moment, in miliseconds since the UNIX
   * epoch, right after all the scripts that need to be executed as soon as possible, in
   * order or not, has been executed.
   *
   * MDN
   */
  def domContentLoadedEventEnd: Double = js.native

  /**
   * Is a jsonizer returning a JSON object representing the specific
   * PerformanceTiming object.
   *
   * MDN
   */
  def toJSON(): js.Dynamic = js.native
}


trait EventException extends js.Object {
  def code: Int = js.native

  def message: String = js.native

  def name: String = js.native
}

object EventException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(EventException),List())))) */
  val DISPATCH_REQUEST_ERR: Int = js.native
  val UNSPECIFIED_EVENT_TYPE_ERR: Int = js.native
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
  def onLine: Boolean = js.native
}

trait WindowLocalStorage extends js.Object {
  def localStorage: Storage = js.native
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
  var hash: String = js.native
  /**
   * Is a DOMString containing the protocol scheme of the URL, including the final ':'.
   *
   * MDN
   */
  var protocol: String = js.native
  /**
   * Is a DOMString containing a '?' followed by the parameters of the URL.
   *
   * MDN
   */
  var search: String = js.native
  /**
   * Is a DOMString containing the whole URL.
   *
   * MDN
   */
  var href: String = js.native
  /**
   * Is a DOMString containing the domain of the URL.
   *
   * MDN
   */
  var hostname: String = js.native
  /**
   * Is a DOMString containing the port number of the URL.
   *
   * MDN
   */
  var port: String = js.native
  /**
   * Is a DOMString containing an initial '/' followed by the path of the URL.
   *
   * MDN
   */
  var pathname: String = js.native
  /**
   * Is a DOMString containing the host, that is the hostname, a ':', and the port of the
   * URL.
   *
   * MDN
   */
  var host: String = js.native
  /**
   * Theorigin read-only property is a String containing the Unicode serialization of the
   * origin of the represented URL, that is, for http and https, the scheme followed by
   * '://', followed by the domain, followed by ':', followed by the port (the default
   * port, 80 and 443 respectively, if explicitely specified). For URL using file: scheme,
   * the value is browser dependant.
   *
   * MDN
   */
  def origin: String = js.native
  /**
   * The Location.reload()method Reloads the resource from the current URL. Its
   * optional unique parameter is a Boolean, which, when it is true, causes the page to
   * always be reloaded from the server. If it is false or not specified, the browser may
   * reload the page from its cache.
   *
   * MDN
   */
  def reload(flag: Boolean = js.native): Unit = js.native


  /**
   * The Location.replace()method replaces the current resource with the one at the
   * provided URL. The difference from the assign() method is that after using
   * replace() the current page will not be saved in session History, meaning the user
   * won't be able to use the back button to navigate to it.
   *
   * MDN
   */
  def replace(url: String): Unit = js.native

  /**
   * The Location.assign()method loading the object at the URL providing in
   * parameter.
   *
   * MDN
   */
  def assign(url: String): Unit = js.native

}


class PerformanceEntry extends js.Object {
  def name: String = js.native

  def startTime: Double = js.native

  def duration: Int = js.native

  def entryType: String = js.native
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
  def detail: Int = js.native

  /**
   * A view which generated the event. Read only.
   *
   * MDN
   */
  def view: Window = js.native

  def initUIEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Int): Unit = js.native
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
  def deltaZ: Double = js.native

  /**
   * Horizontal scroll amount. Read only.
   *
   * MDN
   */
  def deltaX: Double = js.native

  /**
   * Unit of delta values. See Delta modes for a list of permitted values. Read only.
   *
   * MDN
   */
  def deltaMode: Int = js.native

  /**
   * Vertical scroll amount. Read only.
   *
   * MDN
   */
  def deltaY: Double = js.native

  def initWheelEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Int, screenXArg: Int, screenYArg: Int, clientXArg: Int, clientYArg: Int, buttonArg: Int, relatedTargetArg: EventTarget, modifiersListArg: String, deltaXArg: Double, deltaYArg: Double, deltaZArg: Double, deltaMode: Int): Unit = js.native

  def getCurrentPoint(element: Element): Unit = js.native
}

object WheelEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  /**
   * The delta values are specified in pixels.
   *
   * MDN
   */
  val DOM_DELTA_PIXEL: Int = js.native
  /**
   * The delta values are specified in lines.
   *
   * MDN
   */
  val DOM_DELTA_LINE: Int = js.native
  /**
   * The delta values are specified in pages.
   *
   * MDN
   */
  val DOM_DELTA_PAGE: Int = js.native
}

/**
 * The Text interface represents the textual content of Element or Attr.  If an
 * element has no markup within its content, it has a single child implementing Text
 * that contains the element's text.  However, if the element contains markup, it is
 * parsed into information items and Text nodes that form its children.
 *
 * New documents have a single Text node for each block of text. Over time,
 * more Text nodes may be created as the document's content changes.  The
 * Node.normalize() method merges adjacent Text objects back into a single
 * node for each block of text.
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
  def wholeText: String = js.native

  /**
   * The Text.splitText() method breaks the Textnode into two nodes at the specified
   * offset, keeping both nodes in the tree as siblings.
   *
   * MDN
   */
  def splitText(offset: Int): Text = js.native
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
  def code: Int = js.native

  /**
   * The PositionError.message read-only property returns a human-readable
   * DOMString describing the details of the error.
   *
   * MDN
   */
  def message: String = js.native

}

object PositionError extends js.Object {

  val POSITION_UNAVAILABLE: Int = js.native
  val PERMISSION_DENIED: Int = js.native
  val TIMEOUT: Int = js.native
}

class StyleSheetList extends js.Object {
  def length: Int = js.native

  def item(index: Int = js.native): StyleSheet = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): StyleSheet = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: StyleSheet): Unit = js.native
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
  def detail: Object = js.native

  /**
   * Initializes the event in a manner analogous to the similarly-named method in the
   * DOM Events interfaces.
   *
   * MDN
   */
  def initCustomEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, detailArg: Object): Unit = js.native
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
  def clearWatch(watchId: Int): Unit = js.native

  def getCurrentPosition(successCallback: js.Function1[Position, _], errorCallback: js.Function1[PositionError, _], options: PositionOptions = js.native): Unit = js.native


  /**
   * The Geolocation.getCurrentPosition() method is used to get the current position
   * of the device.
   *
   * MDN
   */
  def getCurrentPosition(successCallback: js.Function1[Position, _]): Unit = js.native

  /**
   * The Geolocation.watchPosition() method is used to register a handler function
   * that will be called automatically each time the position of the device changes. You
   * can also, optionally, specify an error handling callback function.
   *
   * MDN
   */
  def watchPosition(successCallback: js.Function1[Position, _], errorCallback: js.Function1[PositionError, _] = js.native, options: PositionOptions = js.native): Int = js.native
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
  def length: Int = js.native

  def back(distance: js.Any): Unit = js.native

  /**
   * Goes to the previous page in session history, the same action as when the user clicks
   * the browser's Back button. Equivalent to history.go(-1). Note: Calling this
   * method to go back beyond the first page in the session history has no effect and
   * doesn't raise an exception.
   *
   * MDN
   */
  def back(): Unit = js.native

  def forward(distance: js.Any): Unit = js.native

  /**
   * Goes to the next page in session history, the same action as when the user clicks the
   * browser's Forward button; this is equivalent to history.go(1). Note: Calling
   * this method to go back beyond the last page in the session history has no effect and
   * doesn't raise an exception.
   *
   * MDN
   */
  def forward(): Unit = js.native

  def go(delta: js.Any): Unit = js.native

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
  def go(): Unit = js.native

  /**
   * Returns an any value representing the state at the top of the history stack. This is a
   * way to look at the state without having to wait for a popstate event.
   *
   * MDN
   */
  def state: js.Any = js.native

  def replaceState(statedata: js.Any, title: String, url: String): Unit = js.native

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
  def replaceState(statedata: js.Any, title: String): Unit = js.native

  def pushState(statedata: js.Any, title: String, url: String): Unit = js.native

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
  def pushState(statedata: js.Any, title: String): Unit = js.native
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
  def length: Int = js.native

  /**
   * Returns the time for the start of the range with the specified index.
   *
   * MDN
   */
  def start(index: Int): Double = js.native

  /**
   * Returns the time offset at which a specified time range ends.
   *
   * MDN
   */
  def end(index: Int): Double = js.native
}


class BeforeUnloadEvent extends Event {
  def returnValue: String = js.native
}


/**
 * Event handlers may be attached to various objects including DOM elements,
 * document, the window object, etc. When an event occurs, an event object
 * is created and passed sequentially to the event listeners.
 *
 * The DOM Event interface is accessible from within the handler function,
 * via the event object passed as the first argument. The following simple
 * example shows how an event object is passed to the event handler function,
 * and can be used from within one such function.
 *
 * MDN
 */
class Event extends js.Object {
  /**
   * Returns the time (in milliseconds since the epoch) at which the event was created.
   *
   * MDN
   */
  def timeStamp: Double = js.native

  /**
   * Returns a boolean indicating whether or not event.preventDefault() was called on
   * the event.
   *
   * MDN
   */
  def defaultPrevented: Boolean = js.native

  /**
   * Indicates whether or not the event was initiated by the browser (after a user click
   * for instance) or by a script (using an event creation method, like
   * event.initEvent)
   *
   * MDN
   */
  def isTrusted: Boolean = js.native

  /**
   * Identifies the current target for the event, as the event traverses the DOM. It
   * always refers to the element the event handler has been attached to as opposed to
   * event.target which identifies the element on which the event occurred.
   *
   * MDN
   */
  def currentTarget: EventTarget = js.native

  /**
   * A boolean indicating whether the bubbling of the event has been canceled or not.
   *
   * MDN
   */
  def cancelBubble: Boolean = js.native

  /**
   * This property of event objects is the object the event was dispatched on. It is
   * different than event.currentTarget when the event handler is called in bubbling
   * or capturing phase of the event.
   *
   * MDN
   */
  def target: EventTarget = js.native

  /**
   * Indicates which phase of the event flow is currently being evaluated.
   *
   * MDN
   */
  def eventPhase: Int = js.native

  /**
   * A boolean indicating whether the event is cancelable.
   *
   * MDN
   */
  def cancelable: Boolean = js.native

  def `type`: String = js.native

  def srcElement: Element = js.native

  /**
   * A boolean indicating whether the event bubbles up through the DOM or not.
   *
   * MDN
   */
  def bubbles: Boolean = js.native

  /**
   * The initEvent method is used to initialize the value of an event created using
   * document.createEvent.
   *
   * MDN
   */
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native

  /**
   * Stops the propagation of events further along in the DOM.
   *
   * MDN
   */
  def stopPropagation(): Unit = js.native

  /**
   * For this particular event, no other listener will be called. Neither those
   * attached on the same element, nor those attached on elements which will be
   * traversed later (in capture phase, for instance)
   *
   * MDN
   */
  def stopImmediatePropagation(): Unit = js.native

  /**
   * Cancels the event if it is cancelable, without stopping further propagation of the
   * event.
   *
   * MDN
   */
  def preventDefault(): Unit = js.native
}

object Event extends js.Object {
  def CAPTURING_PHASE: Int = js.native

  def AT_TARGET: Int = js.native

  def BUBBLING_PHASE: Int = js.native
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
  def width: Int = js.native

  /**
   * Is a Uint8ClampedArray representing a one-dimensional array containing the data
   * in the RGBA order, with integer values between 0 and 255 (included).
   *
   * MDN
   */
  def data: js.Array[Int] = js.native

  /**
   * Is an unsigned long representing the actual height, in pixels, of the ImageData.
   *
   * MDN
   */
  def height: Int = js.native
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

/**
 * The MediaStream interface represents a stream of media content.
 * A stream consists of several tracks, like video or audio tracks.
 *
 * MDN
 */
trait MediaStream extends EventTarget {
  // TODO
}


/**
 * A processing instruction provides an opportunity for application-specific
 * instructions to be embedded within XML and which can be ignored by XML processors
 * which do not support processing their instructions (outside of their having a
 * place in the DOM).
 *
 * MDN
 */
abstract class ProcessingInstruction extends Node {
  def target: String = js.native

  def data: String = js.native
}


class TextEvent extends UIEvent {
  def inputMethod: Int = js.native

  def data: String = js.native

  def locale: String = js.native

  def initTextEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, dataArg: String, inputMethod: Int, locale: String): Unit = js.native

}

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

/**
 * The DocumentFragment interface represents a minimal document object that has no
 * parent. It is used as a light-weight version of Document to store well-formed or
 * potentially non-well-formed fragments of XML.
 *
 * MDN
 */
abstract class DocumentFragment extends Node with NodeSelector {
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
  def timestamp: Double = js.native

  /**
   * The Position.coords read-only property, a Coordinates object, represents a
   * geographic attitude: it contains the location, that is longitude and latitude on
   * the Earth, the altitude, and the speed of the object concerned, regrouped inside
   * the returned value. It also contains accuracy information about these values.
   *
   * MDN
   */
  def coords: Coordinates = js.native
}


class PerformanceMark extends PerformanceEntry {
}

/**
 * DOMParser can parse XML or HTML source stored in a string into a DOM Document.
 * DOMParser is specified in DOM Parsing and Serialization.
 *
 * Note that XMLHttpRequest supports parsing XML and HTML from URL-addressable
 * resources.
 *
 * MDN
 */
class DOMParser extends js.Object {
  def parseFromString(source: String, mimeType: String): Document = js.native
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
  def disabled: Boolean = js.native

  /**
   * ownerNode returns the node that associates this style sheet with the document.
   *
   * MDN
   */
  def ownerNode: Node = js.native

  /**
   * Returns a StyleSheet including this one, if any; returns null if there aren't any.
   *
   * MDN
   */
  def parentStyleSheet: StyleSheet = js.native

  /**
   * Returns a MediaList representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  def media: MediaList = js.native

  /**
   * Returns a DOMString representing the style sheet language for this style sheet.
   *
   * MDN
   */
  def `type`: String = js.native

  /**
   * Returns a DOMString representing the advisory title of the current style sheet.
   *
   * MDN
   */
  def title: String = js.native
}

trait DOMList[T] extends js.Object{
  def length: Int = js.native
  def item(index: Int): T = js.native
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): T = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: T): Unit = js.native
}
/**
 * NodeList objects are collections of nodes such as those returned by
 * Node.childNodes and the querySelectorAll method.
 *
 * MDN
 */
class NodeList extends DOMList[Node]


trait NodeListOf[TNode <: Node] extends DOMList[TNode]

class XMLSerializer extends js.Object {
  def serializeToString(target: Node): String = js.native
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
  def acceptNode(n: Node): Int = js.native
}

object NodeFilter extends js.Object {

  val SHOW_ENTITY_REFERENCE: Int = js.native
  val SHOW_NOTATION: Int = js.native
  val SHOW_ENTITY: Int = js.native
  val SHOW_DOCUMENT: Int = js.native
  val SHOW_PROCESSING_INSTRUCTION: Int = js.native
  /**
   * Value to be returned by the NodeFilter.acceptNode() method when a node should be
   * rejected. The children of rejected nodes are not visited by the NodeIterator or
   * TreeWalker object; this value is treated as "skip this node and all its children".
   *
   * MDN
   */
  val FILTER_REJECT: Int = js.native
  val SHOW_CDATA_SECTION: Int = js.native
  /**
   * Value returned by the NodeFilter.acceptNode() method when a node should be
   * accepted.
   *
   * MDN
   */
  val FILTER_ACCEPT: Int = js.native
  val SHOW_ALL: Int = js.native
  val SHOW_DOCUMENT_TYPE: Int = js.native
  val SHOW_TEXT: Int = js.native
  val SHOW_ELEMENT: Int = js.native
  val SHOW_COMMENT: Int = js.native
  /**
   * Value to be returned by NodeFilter.acceptNode() for nodes to be skipped by the
   * NodeIterator or TreeWalker object. The children of skipped nodes are still
   * considered. This is treated as "skip this node but not its children".
   *
   * MDN
   */
  val FILTER_SKIP: Int = js.native
  val SHOW_ATTRIBUTE: Int = js.native
  val SHOW_DOCUMENT_FRAGMENT: Int = js.native
}

class MediaError extends js.Object {
  def code: Int = js.native

}

object MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Int = js.native
  val MEDIA_ERR_NETWORK: Int = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Int = js.native
  val MEDIA_ERR_DECODE: Int = js.native
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
  var text: String = js.native
}


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
  def oldValue: js.Any = js.native

  /**
   * The new value of the key. The newValue is null when the change has been invoked by
   * storage clear() method or the key has been removed from the storage. Read only.
   *
   * MDN
   */
  def newValue: js.Any = js.native

  /**
   * The URL of the document whose key changed. Read only.
   *
   * MDN
   */
  def url: String = js.native

  /**
   * Represents the Storage object that was affected. Read only.
   *
   * MDN
   */
  def storageArea: Storage = js.native

  /**
   * Represents the key changed. The key attribute is null when the change is caused by
   * the storage clear() method. Read only.
   *
   * MDN
   */
  def key: String = js.native

  /**
   * Initializes the event in a manner analogous to the similarly-named method in the
   * DOM Events interfaces.
   *
   * MDN
   */
  def initStorageEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, keyArg: String, oldValueArg: js.Any, newValueArg: js.Any, urlArg: String, storageAreaArg: Storage): Unit = js.native
}


/**
 * The CharacterData abstract interface represents a Node object that contains
 * characters. This is an abstract interface, meaning there aren't any object of type
 * CharacterData: it is implemented by other interfaces, like Text, Comment, or
 * ProcessingInstruction which aren't abstract.
 *
 * MDN
 */
abstract class CharacterData extends Node with NonDocumentTypeChildNode {
  /**
   * Returns an unsigned long representing the size of the string contained in
   * CharacterData.data.
   *
   * MDN
   */
  def length: Int = js.native

  /**
   * Is a DOMString representing the textual data contained in this object.
   *
   * MDN
   */
  var data: String = js.native

  /**
   * Removes the specified amount of characters, starting at the specified offset,
   * from the CharacterData.data string; when this method returns, data contains the
   * shortened DOMString.
   *
   * MDN
   */
  def deleteData(offset: Int, count: Int): Unit = js.native

  /**
   * Replaces the specified amount of characters, starting at the specified offset,
   * with the specified DOMString; when this method returns, data contains the
   * modified DOMString.
   *
   * MDN
   */
  def replaceData(offset: Int, count: Int, arg: String): Unit = js.native

  /**
   * Appends the given DOMString to the CharacterData.data string; when this method
   * returns, data contains the concatenated DOMString.
   *
   * MDN
   */
  def appendData(arg: String): Unit = js.native

  /**
   * Inserts the specified characters, at the specified offset, in the
   * CharacterData.data string; when this method returns, data contains the modified
   * DOMString.
   *
   * MDN
   */
  def insertData(offset: Int, arg: String): Unit = js.native

  /**
   * Returns a DOMString containing the part of CharacterData.data of the specified
   * length and starting at the specified offset.
   *
   * MDN
   */
  def substringData(offset: Int, count: Int): String = js.native
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
  def code: Int = js.native

  def message: String = js.native

}

object DOMException extends js.Object {

  val HIERARCHY_REQUEST_ERR: Int = js.native
  val NO_MODIFICATION_ALLOWED_ERR: Int = js.native
  val INVALID_MODIFICATION_ERR: Int = js.native
  val NAMESPACE_ERR: Int = js.native
  val INVALID_CHARACTER_ERR: Int = js.native
  val TYPE_MISMATCH_ERR: Int = js.native
  val ABORT_ERR: Int = js.native
  val INVALID_STATE_ERR: Int = js.native
  val SECURITY_ERR: Int = js.native
  val NETWORK_ERR: Int = js.native
  val WRONG_DOCUMENT_ERR: Int = js.native
  val QUOTA_EXCEEDED_ERR: Int = js.native
  val INDEX_SIZE_ERR: Int = js.native
  val DOMSTRING_SIZE_ERR: Int = js.native
  val SYNTAX_ERR: Int = js.native
  val SERIALIZE_ERR: Int = js.native
  val VALIDATION_ERR: Int = js.native
  val NOT_FOUND_ERR: Int = js.native
  val URL_MISMATCH_ERR: Int = js.native
  val PARSE_ERR: Int = js.native
  val NO_DATA_ALLOWED_ERR: Int = js.native
  val NOT_SUPPORTED_ERR: Int = js.native
  val INVALID_ACCESS_ERR: Int = js.native
  val INUSE_ATTRIBUTE_ERR: Int = js.native
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

  /**
   * This property now always returns true.
   *
   * MDN
   */
  def specified: Boolean = js.native

  /**
   * Since you get an Attr object from an Element, you should already know the associated
   * element.
   *
   * MDN
   */
  def ownerElement: Element = js.native

  var value: String = js.native

  def name: String = js.native
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
  def redirectCount: Int = js.native

  def `type`: Int = js.native

  /**
   * Is a jsonizer returning a json object representing the PerformanceNavigation
   * object.
   *
   * MDN
   */
  def toJSON(): js.Dynamic = js.native

}

object PerformanceNavigation extends js.Object {

  val TYPE_RELOAD: Int = js.native
  val TYPE_RESERVED: Int = js.native
  val TYPE_BACK_FORWARD: Int = js.native
  val TYPE_NAVIGATE: Int = js.native
}


/**
 * The LinkStyle interface allows to access the associated CSS style sheet of a node.
 *
 * MDN
 */
trait LinkStyle extends js.Object {

  /**
   * Returns the StyleSheet object associated with the given element, or null if there
   * is none.
   *
   * MDN
   */
  def sheet: StyleSheet = js.native
}

class ClientRectList extends DOMList[ClientRect]

trait External extends js.Object {
}


trait ObjectURLOptions extends js.Object {
  def oneTimeOnly: Boolean = js.native
}

/**
 * The ErrorEvent interface represents events providing information related to
 * errors in scripts or in files.
 *
 * MDN
 */
trait ErrorEvent extends Event {
  def colno: Int = js.native

  /**
   * Is a DOMString containing the name of the script file in which the error occurred.
   *
   * MDN
   */
  def filename: String = js.native

  /**
   * Is an integer containing the line number of the script file on which the error
   * occurred.
   *
   * MDN
   */
  def lineno: Int = js.native

  /**
   * Is a DOMString containing a human-readable error message describing the problem.
   *
   * MDN
   */
  def message: String = js.native

  def initErrorEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, messageArg: String, filenameArg: String, linenoArg: Int): Unit = js.native
}


trait TrackEvent extends Event {
  var track: js.Any = js.native
}


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


/**
 * This type represents a set of space-separated tokens. Commonly returned by
 * HTMLElement.classList, HTMLLinkElement.relList,
 * HTMLAnchorElement.relList or HTMLAreaElement.relList. It is indexed
 * beginning with 0 as with JavaScript arrays. DOMTokenList is always
 * case-sensitive.
 *
 * MDN
 */
trait DOMTokenList extends DOMList[String]{

  def contains(token: String): Boolean = js.native

  def remove(token: String): Unit = js.native

  def toggle(token: String): Boolean = js.native

  def toggle(token: String, force: Boolean): Boolean = js.native

  def add(token: String): Unit = js.native

}


class MessageChannel extends js.Object {
  def port2: MessagePort = js.native

  def port1: MessagePort = js.native
}


/**
 * The TransitionEvent interface represents events providing information related
 * to transitions.
 *
 * MDN
 */
trait TransitionEvent extends Event {
  def propertyName: String = js.native

  /**
   * The TransionnEvent.elapsedTime read-only property is a float giving the amount
   * of time the animation has been running, in seconds, when this event fired. This
   * value is not affected by the transition-delay property.
   *
   * MDN
   */
  def elapsedTime: Double = js.native

  /**
   * The TransitionEvent.initTransitionEvent() method Initializes a transition
   * event created using the deprecated Document.createEvent("TransitionEvent")
   * method.
   *
   * MDN
   */
  def initTransitionEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, propertyNameArg: String, elapsedTimeArg: Int): Unit = js.native
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
  def matches: Boolean = js.native

  /**
   * The serialized media query list
   *
   * MDN
   */
  var media: String = js.native

  /**
   * Adds a new listener to the media query list. If the specified listener is already in
   * the list, this method has no effect.
   *
   * MDN
   */
  def addListener(listener: MediaQueryListListener): Unit = js.native

  /**
   * Removes a listener from the media query list. Does nothing if the specified
   * listener isn't already in the list.
   *
   * MDN
   */
  def removeListener(listener: MediaQueryListListener): Unit = js.native
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
  def name: String = js.native

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
  def wasClean: Boolean = js.native

  /**
   * A string indicating the reason the server closed the connection. This is specific
   * to the particular server and sub-protocol.
   *
   * MDN
   */
  def reason: String = js.native

  /**
   * The WebSocket connection close code provided by the server. See Close codes for
   * possible values.
   *
   * MDN
   */
  def code: Int = js.native

  def initCloseEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, wasCleanArg: Boolean, codeArg: Int, reasonArg: String): Unit = js.native
}


/**
 * The WebSocket object provides the API for creating and managing a WebSocket
 * connection to a server, as well as for sending and receiving data on the connection.
 *
 * MDN
 *
 * @param url The URL as resolved by the constructor. This is always an absolute
 *            URL. Read only.
 * @param protocol A string indicating the name of the sub-protocol the server selected; this will be
 *                 one of the strings specified in the protocols parameter when creating the
 *                 WebSocket object.
 */
class WebSocket(var url: String = js.native, var protocol: String = js.native) extends EventTarget {
  def this(url: String, protocol: js.Array[String]) = this("", "")

  /**
   * The current state of the connection; this is one of the Ready state constants. Read
   * only.
   *
   * MDN
   */
  def readyState: Int = js.native

  /**
   * The number of bytes of data that have been queued using calls to send() but not yet
   * transmitted to the network. This value does not reset to zero when the connection is
   * closed; if you keep calling send(), this will continue to climb. Read only.
   *
   * MDN
   */
  def bufferedAmount: Int = js.native

  /**
   * An event listener to be called when the WebSocket connection's readyState changes
   * to OPEN; this indicates that the connection is ready to send and receive data. The
   * event is a simple one with the name "open".
   *
   * MDN
   */
  var onopen: js.Function1[Event, _] = js.native

  /**
   * The extensions selected by the server. This is currently only the empty string or a
   * list of extensions as negotiated by the connection.
   *
   * MDN
   */
  def extensions: String = js.native

  /**
   * An event listener to be called when a message is received from the server. The
   * listener receives a MessageEvent named "message".
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, _] = js.native
  /**
   * An event listener to be called when the WebSocket connection's readyState changes
   * to CLOSED. The listener receives a CloseEvent named "close".
   *
   * MDN
   */
  var onclose: js.Function1[CloseEvent, _] = js.native
  /**
   * An event listener to be called when an error occurs. This is a simple event named
   * "error".
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native
  /**
   * A string indicating the type of binary data being transmitted by the connection.
   * This should be either "blob" if DOM Blob objects are being used or "arraybuffer"
   * if ArrayBuffer objects are being used.
   *
   * MDN
   */
  var binaryType: String = js.native

  /**
   * Closes the WebSocket connection or connection attempt, if any. If the connection
   * is already CLOSED, this method does nothing.
   *
   * MDN
   */

  def close(code: Int = js.native, reason: String = js.native): Unit = js.native

  /**
   * Transmits data to the server over the WebSocket connection.
   *
   * MDN
   */
  def send(data: String): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
}

object WebSocket extends js.Object {
  /**
   * The connection is open and ready to communicate.
   *
   * MDN
   */
  val OPEN: Int = js.native
  /**
   * The connection is in the process of closing.
   *
   * MDN
   */
  val CLOSING: Int = js.native
  val CONNECTING: Int = js.native
  /**
   * The connection is closed or couldn't be opened.
   *
   * MDN
   */
  val CLOSED: Int = js.native
}

/**
 * EventSource enables servers to push data to Web pages over HTTP or using dedicated server-push protocols.
 * Event streams requests can be redirected using HTTP 301 and 307 redirects as with normal HTTP requests.
 * Clients will reconnect if the connection is closed; a client can be told to stop reconnecting using
 * the HTTP 204 No Content response code.
 * W3C 2012
 * @param URL
 * @param settings
 */
class EventSource(URL: String, settings: js.Dynamic = null) extends EventTarget {

  /**
   * The url attribute must return the absolute URL that resulted from resolving the value that
   * was passed to the constructor.
   * W3C 2012
   * @return
   */
  def url: String = js.native

  /**
   * The withCredentials attribute must return the value to which it was last initialized.
   * When the object is created without withCredentials presents in the settings, it must be initialized to false.
   * If it has the value true, then set CORS mode to Use Credentials and initialize the new EventSource
   * object's withCredentials attribute.
   * W3C 2012
   */
  def withCredentials: Boolean = js.native

  /**
   * The readyState attribute represents the state of the connection.
   * W3C 2012
   */
  def readyState: Int = js.native

  var onopen: js.Function1[Event, _] = js.native

  var onmessage: js.Function1[MessageEvent, _] = js.native

  var onerror: js.Function1[Event, _] = js.native

  /**
   * The close() method must abort any instances of the fetch algorithm started for this EventSource object,
   * and must set the readyState attribute to CLOSED.
   * W3C 2012
   */
  def close(): Unit = js.native

}

object EventSource extends js.Object {
  /**
   * The connection has not yet been established, or it was closed and the user agent is reconnecting.
   * W3C 2012
   */
  val CONNECTING: Int = js.native
  /**
   * The user agent has an open connection and is dispatching events as it receives them.
   * W3C 2012
   */
  val OPEN: Int = js.native
  /**
   * The connection is not open, and the user agent is not trying to reconnect. Either there was a fatal
   * error or the close() method was invoked.
   * W3C 2012
   */
  val CLOSED: Int = js.native
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
  def loaded: Int = js.native

  /**
   * The ProgressEvent.lengthComputable read-only property is a Boolean flag
   * indicating if the resource concerned by the ProgressEvent has a length that can be
   * calculated. If not, the ProgressEvent.total property has no significant value.
   *
   * MDN
   */
  def lengthComputable: Boolean = js.native

  /**
   * The ProgressEvent.total read-only property is an unsigned long long
   * representing the total amount of work that the underlying process is in the
   * progress of performing. When downloading a resource using HTTP, this only
   * represent the content itself, not headers and other overhead.
   *
   * MDN
   */
  def total: Int = js.native

  /**
   * The ProgressEvent.initProgressEvent() method Initializes an animation event
   * created using the deprecated Document.createEvent("ProgressEvent") method.
   *
   * MDN
   */
  def initProgressEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, lengthComputableArg: Boolean, loadedArg: Int, totalArg: Int): Unit = js.native
}


/**
 * An object of this type is returned by the files property of the HTML input element;
 * this lets you access the list of files selected with the <input type="file">
 * element. It's also used for a list of files dropped into web content when using the
 * drag and drop API; see the DataTransfer object for details on this usage.
 *
 * MDN
 */
trait FileList extends DOMList[File]

/**
 * The File interface provides information about -- and access to the contents of --
 * files.
 *
 * These are generally retrieved from a FileList object returned as a result
 * of a user selecting files using the input element, or from a drag and drop
 * operation's DataTransfer object.
 *
 * The file reference can be saved when the form is submitted while the user
 * is offline, so that the data can be retrieved and uploaded when the Internet
 * connection is restored.
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
  def lastModifiedDate: js.Any = js.native

  /**
   * Returns the name of the file. For security reasons, the path is excluded from this
   * property.
   *
   * MDN
   */
  def name: String = js.native
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
  def revokeObjectURL(url: String): Unit = js.native
  /**
   * The URL.createObjectURL() static method creates a DOMString containing an URL
   * representing the object given in parameter. The URL lifetime is tied to the
   * document in the window on which it was created. The new object URL represents the
   * specified File object or Blob object.
   *
   * MDN
   */
  def createObjectURL(`object`: js.Any, options: ObjectURLOptions = js.native): String = js.native

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
  var onprogress: js.Function1[ProgressEvent, _] = js.native
  /**
   * The function to call when a request encounters an error.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native
  /**
   * The function to call when an HTTP request returns after successfully loading
   * content.
   *
   * MDN
   */
  var onload: js.Function1[js.Any, _] = js.native
  /**
   * A function that is called if the event times out; this only happens if a timeout has
   * been previously established by setting the value of the XMLHttpRequest object's
   * timeout attribute.
   *
   * MDN
   */
  var ontimeout: js.Function1[js.Any, _] = js.native
  /**
   * The function to call when a request is aborted.
   *
   * MDN
   */
  var onabort: js.Function1[js.Any, _] = js.native
  /**
   * A function that gets called when the HTTP request first begins loading data.
   *
   * MDN
   */
  var onloadstart: js.Function1[js.Any, _] = js.native
  /**
   * A function that is called when the load is completed, even if the request failed.
   *
   * MDN
   */
  var onloadend: js.Function1[ProgressEvent, _] = js.native


}


trait AudioTrackList extends EventTarget with DOMList[AudioTrack] {

  var onchange: js.Function1[js.Any, _] = js.native
  var onaddtrack: js.Function1[TrackEvent, _] = js.native

  def getTrackById(id: String): AudioTrack = js.native
}


trait WindowTimersExtension extends js.Object {
  def clearImmediate(handle: Int): Unit = js.native

  def setImmediate(handler: js.Function0[Any]): Int = js.native
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
  def animationName: String = js.native

  /**
   * The AnimationEvent.elapsedTime read-only property is a float giving the amount
   * of time the animation has been running, in seconds, when this event fired,
   * excluding any time the animation was paused. For an "animationstart" event,
   * elapsedTime is 0.0 unless there was a negative value for animation-delay, in which
   * case the event will be fired with elapsedTime containing  (-1 * delay).
   *
   * MDN
   */
  def elapsedTime: Double = js.native

  /**
   * The AnimationEvent.initAnimationEvent() method Initializes an animation
   * event created using the deprecated Document.createEvent("AnimationEvent")
   * method.
   *
   * MDN
   */
  def initAnimationEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, animationNameArg: String, elapsedTimeArg: Int): Unit = js.native
}


trait WindowConsole extends js.Object {
  var console: Console = js.native
}


trait AudioTrack extends js.Object {
  var kind: String = js.native
  var language: String = js.native
  var id: String = js.native
  var label: String = js.native
  var enabled: Boolean = js.native
}


trait TextTrackCueList extends DOMList[TextTrackCue]{
  def getCueById(id: String): TextTrackCue = js.native
}


trait TextTrackList extends DOMList[TextTrack]


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
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native

  def profile(reportName: String = js.native): Unit = js.native

  def assert(test: Boolean, message: String, optionalParams: js.Any*): Unit = js.native

  def clear(): Unit = js.native

  /**
   * Displays an interactive list of the properties of the specified JavaScript
   * object. The output is presented as a hierarchical listing with disclosure
   * triangles that let you see the contents of child objects.
   *
   * MDN
   */
  def dir(value: js.Any, optionalParams: js.Any*): Unit = js.native

  /**
   * Outputs a warning message. You may use string substitution and additional
   * arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native

  /**
   * Outputs an error message. You may use string substitution and additional
   * arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native

  /**
   * For general output of logging information. You may use string substitution and
   * additional arguments with this method. See Using string substitutions.
   *
   * MDN
   */
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native

  def profileEnd(): Unit = js.native
}


trait WindowBase64 extends js.Object {
  /**
   * Creates a base-64 encoded ASCII string from a "string" of binary data.
   */
  def btoa(rawString: String): String = js.native
  /**
   * Decodes a string of data which has been encoded using base-64 encoding.
   */
  def atob(encodedString: String): String = js.native
}


/**
 * A type returned by DOMConfiguration.parameterNames which contains a list of
 * DOMString (strings).
 *
 * MDN
 */
trait DOMStringList extends DOMList[String]{
  def contains(str: String): Boolean = js.native
}


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

/**
 * A MediaQueryList object maintains a list of media queries on a document, and
 * handles sending notifications to listeners when the media queries on the document
 * change.
 *
 * MDN
 */
trait MediaQueryListListener extends js.Object {
  def apply(mql: MediaQueryList): Unit = js.native
}


trait MessagePort extends EventTarget {
  var onmessage: js.Function1[js.Any, _] = js.native

  def close(): Unit = js.native

  def postMessage(message: js.Any, ports: js.Any = js.native): Unit = js.native

  def start(): Unit = js.native


}


/**
 * The FileReader object lets web applications asynchronously read the contents of
 * files (or raw data buffers) stored on the user's computer, using File or Blob
 * objects to specify the file or data to read.
 *
 * MDN
 */
class FileReader() extends EventTarget {

  /**
   * A DOMError representing the error that occurred while reading the file.
   *
   * MDN
   */
  def error: DOMError = js.native

  /**
   * A number indicating the state of the FileReader. This will be one of the State constants.
   * EMPTY   : 0 : No data has been loaded yet.
   * LOADING : 1 : Data is currently being loaded.
   * DONE    : 2 : The entire read request has been completed.
   *
   * MDN
   */
  def readyState: Short = js.native

  /**
   * The file's contents. This property is only valid after the read operation is
   * complete, and the format of the data depends on which of the methods was used to
   * initiate the read operation.
   *
   * MDN
   */
  def result: js.Any = js.native

  /**
   * A handler for the abort event. This event is triggered each time the reading
   * operation is aborted.
   *
   * MDN
   */
  var onabort: js.Function1[Event, _] = js.native

  /**
   * A handler for the error event. This event is triggered each time the reading
   * operation encounter an error.
   *
   * MDN
   */
  var onerror: js.Function1[Event, _] = js.native

  /**
   * A handler for the load event. This event is triggered each time the reading
   * operation is successfully completed.
   *
   * MDN
   */
  var onload: js.Function1[UIEvent, _] = js.native

  /**
   * A handler for the loadstart event. This event is triggered each time the reading
   * is starting.
   *
   * MDN
   */
  var onloadstart: js.Function1[ProgressEvent, _] = js.native

  /**
   * A handler for the loadend event. This event is triggered each time the reading
   * operation is completed (either in success or failure).
   *
   * MDN
   */
  var onloadend: js.Function1[ProgressEvent, _] = js.native

  /**
   * A handler for the progress event. This event is triggered while reading
   * a Blob content.
   *
   * MDN
   */
  var onprogress: js.Function1[ProgressEvent, _] = js.native

  /**
   * Aborts the read operation. Upon return, the readyState will be DONE.
   *
   * MDN
   */
  def abort(): Unit = js.native

  /**
   * The readAsArrayBuffer method is used to starts reading the contents of the
   * specified Blob or File. When the read operation is finished, the readyState
   * becomes DONE, and the loadend is triggered. At that time, the result attribute
   * contains an ArrayBuffer representing the file's data.
   *
   * MDN
   */
  def readAsArrayBuffer(blob: Blob): Unit = js.native

  /**
   * The readAsDataURL method is used to starts reading the contents of the specified
   * Blob or File. When the read operation is finished, the readyState becomes DONE, and
   * the loadend is triggered. At that time, the result attribute contains a data: URL
   * representing the file's data as base64 encoded string.
   *
   * MDN
   */
  def readAsDataURL(blob: Blob): Unit = js.native

  /**
   * The readAsText method is used to read the contents of the specified Blob or File.
   * When the read operation is complete, the readyState is changed to DONE, the loadend
   * is triggered, and the result attribute contains the contents of the file as a text string.
   *
   * MDN
   */
  def readAsText(blob: Blob, encoding: String = "UTF-8"): Unit = js.native

}

object FileReader extends js.Object {
  //states
  val EMPTY: Short = js.native
  val LOADING: Short = js.native
  val DONE: Short = js.native
}


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

/**
 * A Blob object represents a file-like object of immutable, raw data. Blobs
 * represent data that isn't necessarily in a JavaScript-native format. The File
 * interface is based on Blob, inheriting blob functionality and expanding it to
 * support files on the user's system.
 *
 * An easy way to construct a Blob is by invoking the Blob constuctor. Another
 * way is to use the slice() method to create a blob that contains a subset of
 * another blob's data.
 *
 * MDN
 */
class Blob(blobParts: js.Array[js.Any] = js.native, options: BlobPropertyBag = js.native) extends js.Object {

  def `type`: String = js.native

  /**
   * The size, in bytes, of the data contained in the Blob object.
   *
   * MDN
   */
  def size: Int = js.native
  /**
   * The slice is used to create a new Blob object containing the data in the specified
   * range of bytes of the source Blob.
   *
   * MDN
   */
  def slice(start: Int = js.native, end: Int = js.native, contentType: String = js.native): Blob = js.native

  def close(): Unit = js.native
}

object Blob extends js.Object {
}

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

object ApplicationCache extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ApplicationCache),List())))) */
  val CHECKING: Int = js.native
  val UNCACHED: Int = js.native
  val UPDATEREADY: Int = js.native
  val DOWNLOADING: Int = js.native
  val IDLE: Int = js.native
  val OBSOLETE: Int = js.native
}

trait PopStateEvent extends Event {
  def state: js.Any = js.native

  def initPopStateEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, stateArg: js.Any): Unit = js.native
}


trait DOMSettableTokenList extends DOMTokenList {
  def value: String = js.native
}


/**
 * XMLHttpRequest Level 2 adds support for the new FormData interface. FormData
 * objects provide a way to easily construct a set of key/value pairs representing
 * form fields and their values, which can then be easily sent using the
 * XMLHttpRequest send() method.
 *
 * MDN
 */
class FormData(form: HTMLFormElement = js.native) extends js.Object {

  /**
   * Appends a key/value pair to the FormData object.
   *
   * MDN
   */
  def append(name: js.Any, value: js.Any, blobName: String = js.native): Unit = js.native

}

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
  var onerror: js.Function1[ErrorEvent, _] = js.native


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
  def customError: Boolean = js.native

  /**
   * The element has a required attribute, but no value.
   *
   * MDN
   */
  def valueMissing: Boolean = js.native

  /**
   * The value does not fit the rules determined by the step attribute (that is, it's not
   * evenly divisible by the step value).
   *
   * MDN
   */
  def stepMismatch: Boolean = js.native

  /**
   * The value is less than the minimum specified by the min attribute.
   *
   * MDN
   */
  def rangeUnderflow: Boolean = js.native

  /**
   * The value is greater than the maximum specified by the max attribute.
   *
   * MDN
   */
  def rangeOverflow: Boolean = js.native

  /**
   * The value is not in the required syntax (when type is email or url).
   *
   * MDN
   */
  def typeMismatch: Boolean = js.native

  /**
   * The value does not match the specified pattern.
   *
   * MDN
   */
  def patternMismatch: Boolean = js.native

  /**
   * The value exceeds the specified maxlength for HTMLInputElement or
   * HTMLTextAreaElement objects. Note: This will never be true in Gecko, because
   * elements' values are prevented from being longer than maxlength.
   *
   * MDN
   */
  def tooLong: Boolean = js.native

  /**
   * The element meets all constraint validations, and is therefore considered to be
   * valid.
   *
   * MDN
   */
  def valid: Boolean = js.native
}


/**
 * The Worker interface represents a background task that can be easily created and
 * can send messages back to their creators. Creating a worker is as simple as calling
 * the Worker() constructor, specifying a script to be run in the worker thread.
 *
 * Of note is the fact that workers may in turn spawn new workers as long as
 * those workers are hosted within the same origin as the parent page.  In
 * addition, workers may use XMLHttpRequest for network I/O, with the exception
 * that the responseXML and channel attributes on XMLHttpRequest always return
 * null.
 *
 * MDN
 */
class Worker (stringUrl: String) extends AbstractWorker {

  /**
   * The Worker.onmessage property represents an EventHandler, that is a function to
   * be called when the message event occurs. These events are of type MessageEvent and
   * will be called when the worker calls its own postMessage() method: it is the way that
   * a Worker has to give back information to the thread that created it.
   *
   * MDN
   */
  var onmessage: js.Function1[js.Any, _] = js.native

  /**
   * The Worker.postMessage() method sends a message to the worker's inner scope. This
   * accepts a single parameter, which is the data to send to the worker. The data may be
   * any value or JavaScript object handled by the structured clone algorithm, which
   * includes cyclical references.
   *
   * MDN
   */
  def postMessage(message: js.Any, ports: js.Any = js.native): Unit = js.native

  /**
   * The Worker.terminate() method immediately terminates the Worker. This does not
   * offer the worker an opportunity to finish its operations; it is simply stopped at
   * once.
   *
   * MDN
   */
  def terminate(): Unit = js.native


}

object Worker extends js.Object {
}
