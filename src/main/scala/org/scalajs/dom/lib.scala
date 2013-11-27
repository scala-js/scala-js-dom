package org.scalajs

import scala.scalajs.js

package dom {

trait PositionOptions extends js.Object {
  var enableHighAccuracy: js.Boolean = _
  var timeout: js.Number = _
  var maximumAge: js.Number = _
}

trait NavigatorID extends js.Object {
  var appVersion: js.String = _
  var appName: js.String = _
  var userAgent: js.String = _
  var platform: js.String = _
}

trait TreeWalker extends js.Object {
  var whatToShow: js.Number = _
  var filter: NodeFilter = _
  var root: Node = _
  var currentNode: Node = _
  var expandEntityReferences: js.Boolean = _
  def previousSibling(): Node = ???
  def lastChild(): Node = ???
  def nextSibling(): Node = ???
  def nextNode(): Node = ???
  def parentNode(): Node = ???
  def firstChild(): Node = ???
  def previousNode(): Node = ???
}

object TreeWalker extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TreeWalker),List())))) */
}

trait Performance extends js.Object {
  var navigation: PerformanceNavigation = _
  var timing: PerformanceTiming = _
  def getEntriesByType(entryType: js.String): js.Dynamic = ???
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
  def now(): js.Number = ???
}

object Performance extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Performance),List())))) */
}

trait CompositionEvent extends UIEvent {
  var data: js.String = _
  var locale: js.String = _
  def initCompositionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, dataArg: js.String, locale: js.String): Unit = ???
}

object CompositionEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CompositionEvent),List())))) */
}

trait WindowTimers extends WindowTimersExtension {
  def clearTimeout(handle: js.Number): Unit = ???
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
  def clearInterval(handle: js.Number): Unit = ???
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
}

trait Navigator extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with MSNavigatorExtensions with NavigatorGeolocation with MSNavigatorDoNotTrack with NavigatorStorageUtils with MSFileSaver {
  var msMaxTouchPoints: js.Number = _
  var msPointerEnabled: js.Boolean = _
  var msManipulationViewsEnabled: js.Boolean = _
  def msLaunchUri(uri: js.String, successCallback: MSLaunchUriCallback, noHandlerCallback: MSLaunchUriCallback): Unit = ???
  def msLaunchUri(uri: js.String, successCallback: MSLaunchUriCallback): Unit = ???
  def msLaunchUri(uri: js.String): Unit = ???
}

object Navigator extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Navigator),List())))) */
}

trait NodeSelector extends js.Object {
  def querySelectorAll(selectors: js.String): NodeList = ???
  def querySelector(selectors: js.String): Element = ???
}

trait ClientRect extends js.Object {
  var left: js.Number = _
  var width: js.Number = _
  var right: js.Number = _
  var top: js.Number = _
  var bottom: js.Number = _
  var height: js.Number = _
}

object ClientRect extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ClientRect),List())))) */
}

trait PositionErrorCallback extends js.Object {
  def apply(error: PositionError): Unit = ???
}

trait DOMImplementation extends js.Object {
  def createDocumentType(qualifiedName: js.String, publicId: js.String, systemId: js.String): DocumentType = ???
  def createDocument(namespaceURI: js.String, qualifiedName: js.String, doctype: DocumentType): Document = ???
  def hasFeature(feature: js.String, version: js.String): js.Boolean = ???
  def hasFeature(feature: js.String): js.Boolean = ???
  def createHTMLDocument(title: js.String): Document = ???
}

object DOMImplementation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMImplementation),List())))) */
}

trait Element extends Node with NodeSelector with ElementTraversal {
  var scrollTop: js.Number = _
  var clientLeft: js.Number = _
  var scrollLeft: js.Number = _
  var tagName: js.String = _
  var clientWidth: js.Number = _
  var scrollWidth: js.Number = _
  var clientHeight: js.Number = _
  var clientTop: js.Number = _
  var scrollHeight: js.Number = _
  def getAttribute(name: js.String): js.String = ???
  def getAttribute(): js.String = ???
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???
  def hasAttributeNS(namespaceURI: js.String, localName: js.String): js.Boolean = ???
  def getBoundingClientRect(): ClientRect = ???
  def getAttributeNS(namespaceURI: js.String, localName: js.String): js.String = ???
  def getAttributeNodeNS(namespaceURI: js.String, localName: js.String): Attr = ???
  def setAttributeNodeNS(newAttr: Attr): Attr = ???
  def msMatchesSelector(selectors: js.String): js.Boolean = ???
  def hasAttribute(name: js.String): js.Boolean = ???
  def removeAttribute(name: js.String): Unit = ???
  def removeAttribute(): Unit = ???
  def setAttributeNS(namespaceURI: js.String, qualifiedName: js.String, value: js.String): Unit = ???
  def getAttributeNode(name: js.String): Attr = ???
  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???
  def fireEvent(eventName: js.String): js.Boolean = ???
  def getElementsByTagName(name: js.String): NodeList = ???
  def getClientRects(): ClientRectList = ???
  def setAttributeNode(newAttr: Attr): Attr = ???
  def removeAttributeNode(oldAttr: Attr): Attr = ???
  def setAttribute(name: js.String, value: js.String): Unit = ???
  def setAttribute(name: js.String): Unit = ???
  def setAttribute(): Unit = ???
  def removeAttributeNS(namespaceURI: js.String, localName: js.String): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object Element extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Element),List())))) */
}

trait Node extends EventTarget {
  var nodeType: js.Number = _
  var previousSibling: Node = _
  var localName: js.String = _
  var namespaceURI: js.String = _
  var textContent: js.String = _
  var parentNode: Node = _
  var nextSibling: Node = _
  var nodeValue: js.String = _
  var lastChild: Node = _
  var childNodes: NodeList = _
  var nodeName: js.String = _
  var ownerDocument: Document = _
  var attributes: NamedNodeMap = _
  var firstChild: Node = _
  var prefix: js.String = _
  def removeChild(oldChild: Node): Node = ???
  def appendChild(newChild: Node): Node = ???
  def isSupported(feature: js.String, version: js.String): js.Boolean = ???
  def isEqualNode(arg: Node): js.Boolean = ???
  def lookupPrefix(namespaceURI: js.String): js.String = ???
  def isDefaultNamespace(namespaceURI: js.String): js.Boolean = ???
  def compareDocumentPosition(other: Node): js.Number = ???
  def normalize(): Unit = ???
  def isSameNode(other: Node): js.Boolean = ???
  def hasAttributes(): js.Boolean = ???
  def lookupNamespaceURI(prefix: js.String): js.String = ???
  def cloneNode(deep: js.Boolean): Node = ???
  def cloneNode(): Node = ???
  def hasChildNodes(): js.Boolean = ???
  def replaceChild(newChild: Node, oldChild: Node): Node = ???
  def insertBefore(newChild: Node, refChild: Node): Node = ???
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

class MouseEvent extends UIEvent {
  var toElement: Element = _
  var layerY: js.Number = _
  var fromElement: Element = _
  var which: js.Number = _
  var pageX: js.Number = _
  var offsetY: js.Number = _
  var x: js.Number = _
  var y: js.Number = _
  var metaKey: js.Boolean = _
  var altKey: js.Boolean = _
  var ctrlKey: js.Boolean = _
  var offsetX: js.Number = _
  var screenX: js.Number = _
  var clientY: js.Number = _
  var shiftKey: js.Boolean = _
  var layerX: js.Number = _
  var screenY: js.Number = _
  var relatedTarget: EventTarget = _
  var button: js.Number = _
  var pageY: js.Number = _
  var buttons: js.Number = _
  var clientX: js.Number = _
  def initMouseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget): Unit = ???
  def getModifierState(keyArg: js.String): js.Boolean = ???
}

object MouseEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MouseEvent),List())))) */
}

trait RangeException extends js.Object {
  var code: js.Number = _
  var message: js.String = _

  var INVALID_NODE_TYPE_ERR: js.Number = _
  var BAD_BOUNDARYPOINTS_ERR: js.Number = _
  var name: js.String = _
}

object RangeException extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(RangeException),List())))) */
  var INVALID_NODE_TYPE_ERR: js.Number = _
  var BAD_BOUNDARYPOINTS_ERR: js.Number = _
}

trait TextMetrics extends js.Object {
  var width: js.Number = _
}

object TextMetrics extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextMetrics),List())))) */
}

trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: js.String): Event = ???
}

trait CDATASection extends Text {
}

object CDATASection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CDATASection),List())))) */
}

trait StyleMedia extends js.Object {
  var `type`: js.String = _
  def matchMedium(mediaquery: js.String): js.Boolean = ???
}

object StyleMedia extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleMedia),List())))) */
}

trait TextRange extends js.Object {
  var boundingLeft: js.Number = _
  var htmlText: js.String = _
  var offsetLeft: js.Number = _
  var boundingWidth: js.Number = _
  var boundingHeight: js.Number = _
  var boundingTop: js.Number = _
  var text: js.String = _
  var offsetTop: js.Number = _
  def moveToPoint(x: js.Number, y: js.Number): Unit = ???
  def queryCommandValue(cmdID: js.String): js.Dynamic = ???
  def getBookmark(): js.String = ???
  def move(unit: js.String, count: js.Number): js.Number = ???
  def move(unit: js.String): js.Number = ???
  def queryCommandIndeterm(cmdID: js.String): js.Boolean = ???
  def scrollIntoView(fStart: js.Boolean): Unit = ???
  def scrollIntoView(): Unit = ???
  def findText(string: js.String, count: js.Number, flags: js.Number): js.Boolean = ???
  def findText(string: js.String, count: js.Number): js.Boolean = ???
  def findText(string: js.String): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(cmdID: js.String): js.Boolean = ???
  def getBoundingClientRect(): ClientRect = ???
  def moveToBookmark(bookmark: js.String): js.Boolean = ???
  def isEqual(range: TextRange): js.Boolean = ???
  def duplicate(): TextRange = ???
  def collapse(start: js.Boolean): Unit = ???
  def collapse(): Unit = ???
  def queryCommandText(cmdID: js.String): js.String = ???
  def select(): Unit = ???
  def pasteHTML(html: js.String): Unit = ???
  def inRange(range: TextRange): js.Boolean = ???
  def moveEnd(unit: js.String, count: js.Number): js.Number = ???
  def moveEnd(unit: js.String): js.Number = ???
  def getClientRects(): ClientRectList = ???
  def moveStart(unit: js.String, count: js.Number): js.Number = ???
  def moveStart(unit: js.String): js.Number = ???
  def parentElement(): Element = ???
  def queryCommandState(cmdID: js.String): js.Boolean = ???
  def compareEndPoints(how: js.String, sourceRange: TextRange): js.Number = ???
  def execCommandShowHelp(cmdID: js.String): js.Boolean = ???
  def moveToElementText(element: Element): Unit = ???
  def expand(Unit: js.String): js.Boolean = ???
  def queryCommandSupported(cmdID: js.String): js.Boolean = ???
  def setEndPoint(how: js.String, SourceRange: TextRange): Unit = ???
  def queryCommandEnabled(cmdID: js.String): js.Boolean = ???
}

object TextRange extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextRange),List())))) */
}




trait Selection extends js.Object {
  var isCollapsed: js.Boolean = _
  var anchorNode: Node = _
  var focusNode: Node = _
  var anchorOffset: js.Number = _
  var focusOffset: js.Number = _
  var rangeCount: js.Number = _
  def addRange(range: Range): Unit = ???
  def collapseToEnd(): Unit = ???

  def selectAllChildren(parentNode: Node): Unit = ???
  def getRangeAt(index: js.Number): Range = ???
  def collapse(parentNode: Node, offset: js.Number): Unit = ???
  def removeAllRanges(): Unit = ???
  def collapseToStart(): Unit = ???
  def deleteFromDocument(): Unit = ???
  def removeRange(range: Range): Unit = ???
}

object Selection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Selection),List())))) */
}

trait NodeIterator extends js.Object {
  var whatToShow: js.Number = _
  var filter: NodeFilter = _
  var root: Node = _
  var expandEntityReferences: js.Boolean = _
  def nextNode(): Node = ???
  def detach(): Unit = ???
  def previousNode(): Node = ???
}

object NodeIterator extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeIterator),List())))) */
}

trait ControlRangeCollection extends js.Object {
  var length: js.Number = _
  def queryCommandValue(cmdID: js.String): js.Dynamic = ???
  def remove(index: js.Number): Unit = ???
  def add(item: Element): Unit = ???
  def queryCommandIndeterm(cmdID: js.String): js.Boolean = ???
  def scrollIntoView(varargStart: js.Any): Unit = ???
  def scrollIntoView(): Unit = ???
  def item(index: js.Number): Element = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): Element = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Element): Unit = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(cmdID: js.String): js.Boolean = ???
  def addElement(item: Element): Unit = ???
  def queryCommandState(cmdID: js.String): js.Boolean = ???
  def queryCommandSupported(cmdID: js.String): js.Boolean = ???
  def queryCommandEnabled(cmdID: js.String): js.Boolean = ???
  def queryCommandText(cmdID: js.String): js.String = ???
  def select(): Unit = ???
}

object ControlRangeCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ControlRangeCollection),List())))) */
}

trait WindowSessionStorage extends js.Object {
  var sessionStorage: Storage = _
}

trait MouseWheelEvent extends MouseEvent {
  var wheelDelta: js.Number = _
  def initMouseWheelEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, buttonArg: js.Number, relatedTargetArg: EventTarget, modifiersListArg: js.String, wheelDeltaArg: js.Number): Unit = ???
}

object MouseWheelEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MouseWheelEvent),List())))) */
}

trait Window extends EventTarget with MSEventAttachmentTarget with WindowLocalStorage with MSWindowExtensions with WindowSessionStorage with WindowTimers with WindowBase64 with IDBEnvironment with WindowConsole {
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
  var onreset: js.Function1[Event, _] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var screenX: js.Number = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var history: History = _
  var pageXOffset: js.Number = _
  var name: js.String = _
  var onafterprint: js.Function1[Event, _] = _
  var onpause: js.Function1[Event, _] = _
  var onbeforeprint: js.Function1[Event, _] = _
  var top: Window = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onseeked: js.Function1[Event, _] = _
  var opener: Window = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var innerHeight: js.Number = _
  var onwaiting: js.Function1[Event, _] = _
  var ononline: js.Function1[Event, _] = _
  var ondurationchange: js.Function1[Event, _] = _
  var frames: Window = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var onemptied: js.Function1[Event, _] = _
  var onseeking: js.Function1[Event, _] = _
  var oncanplay: js.Function1[Event, _] = _
  var outerWidth: js.Number = _
  var onstalled: js.Function1[Event, _] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var innerWidth: js.Number = _
  var onoffline: js.Function1[Event, _] = _
  var length: js.Number = _
  var screen: Screen = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var onratechange: js.Function1[Event, _] = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  var onloadstart: js.Function1[Event, _] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, _] = _
  var self: Window = _
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var pageYOffset: js.Number = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onchange: js.Function1[Event, _] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var onplay: js.Function1[Event, _] = _
  var onerror: ErrorEventHandler = _
  var onplaying: js.Function1[Event, _] = _
  var parent: Window = _
  var location: Location = _
  var oncanplaythrough: js.Function1[Event, _] = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onreadystatechange: js.Function1[Event, _] = _
  var outerHeight: js.Number = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var frameElement: Element = _
  var onloadeddata: js.Function1[Event, _] = _
  var onsuspend: js.Function1[Event, _] = _
  var window: Window = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var ontimeupdate: js.Function1[Event, _] = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var navigator: Navigator = _
  var styleMedia: StyleMedia = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  var onhashchange: js.Function1[Event, _] = _
  var onunload: js.Function1[Event, _] = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var screenY: js.Number = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onload: js.Function1[Event, _] = _
  var onvolumechange: js.Function1[Event, _] = _
  var oninput: js.Function1[Event, _] = _
  var performance: Performance = _
  def alert(message: js.String): Unit = ???
  def alert(): Unit = ???
  def scroll(x: js.Number, y: js.Number): Unit = ???
  def scroll(x: js.Number): Unit = ???
  def scroll(): Unit = ???
  def focus(): Unit = ???
  def scrollTo(x: js.Number, y: js.Number): Unit = ???
  def scrollTo(x: js.Number): Unit = ???
  def scrollTo(): Unit = ???
  def print(): Unit = ???
  def prompt(message: js.String, defaul: js.String): js.String = ???
  def prompt(message: js.String): js.String = ???
  def prompt(): js.String = ???

  def open(url: js.String, target: js.String, features: js.String, replace: js.Boolean): Window = ???
  def open(url: js.String, target: js.String, features: js.String): Window = ???
  def open(url: js.String, target: js.String): Window = ???
  def open(url: js.String): Window = ???
  def open(): Window = ???
  def scrollBy(x: js.Number, y: js.Number): Unit = ???
  def scrollBy(x: js.Number): Unit = ???
  def scrollBy(): Unit = ???
  def confirm(message: js.String): js.Boolean = ???
  def confirm(): js.Boolean = ???
  def close(): Unit = ???
  def postMessage(message: js.Any, targetOrigin: js.String, ports: js.Any): Unit = ???
  def postMessage(message: js.Any, targetOrigin: js.String): Unit = ???
  def showModalDialog(url: js.String, argument: js.Any, options: js.Any): js.Dynamic = ???
  def showModalDialog(url: js.String, argument: js.Any): js.Dynamic = ???
  def showModalDialog(url: js.String): js.Dynamic = ???
  def showModalDialog(): js.Dynamic = ???
  def blur(): Unit = ???
  def getSelection(): Selection = ???
  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???
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
  var applicationCache: ApplicationCache = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  var onpopstate: js.Function1[PopStateEvent, js.Any] = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _
  def msCancelRequestAnimationFrame(handle: js.Number): Unit = ???
  def matchMedia(mediaQuery: js.String): MediaQueryList = ???
  def cancelAnimationFrame(handle: js.Number): Unit = ???
  def msIsStaticHTML(html: js.String): js.Boolean = ???
  def msMatchMedia(mediaQuery: js.String): MediaQueryList = ???
  def requestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
  def msRequestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
}

object Window extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Window),List())))) */
}

trait StyleSheetPageList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): CSSPageRule = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSPageRule = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSPageRule): Unit = ???
}

object StyleSheetPageList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleSheetPageList),List())))) */
}

trait EventTarget extends js.Object {
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  def dispatchEvent(evt: Event): js.Boolean = ???
}

trait CanvasGradient extends js.Object {
  def addColorStop(offset: js.Number, color: js.String): Unit = ???
}

object CanvasGradient extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasGradient),List())))) */
}

trait TouchEvent{
  val altKey: Boolean = ???
  val changedTouches: TouchList = ???
  val ctrlKey: Boolean = ???
  val metaKey: Boolean = ???
  val shiftKey: Boolean = ???
  val targetTouches: TouchList = ???
  val touches: TouchList = ???
  val `type`: String = ???
  val target: js.Any = ???
}

trait TouchList extends js.Object {
  var length: js.Number = _
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

trait Document extends Node with NodeSelector with MSEventAttachmentTarget with DocumentEvent with MSResourceMetadata with MSNodeExtensions {
  var compatible: MSCompatibleInfoCollection = _
  var onkeydown: js.Function1[KeyboardEvent, _] = _
  var onkeyup: js.Function1[KeyboardEvent, _] = _
  var implementation: DOMImplementation = _
  var onreset: js.Function1[Event, _] = _
  var scripts: HTMLCollection = _
  var onhelp: js.Function1[Event, _] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var charset: js.String = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  var vlinkColor: js.String = _
  var onseeked: js.Function1[Event, _] = _
  var security: js.String = _
  var title: js.String = _
  var namespaces: MSNamespaceInfoCollection = _
  var defaultCharset: js.String = _
  var embeds: HTMLCollection = _
  var styleSheets: StyleSheetList = _
  var frames: Window = _
  var ondurationchange: js.Function1[Event, _] = _
  var all: HTMLCollection = _
  var forms: HTMLCollection = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var dir: js.String = _
  var onemptied: js.Function1[Event, _] = _
  var designMode: js.String = _
  var onseeking: js.Function1[Event, _] = _
  var ondeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplay: js.Function1[Event, _] = _
  var ondatasetchanged: js.Function1[MSEventObj, js.Any] = _
  var onrowsdelete: js.Function1[MSEventObj, js.Any] = _
  var Script: MSScriptHost = _
  var onloadstart: js.Function1[Event, _] = _
  var URLUnencoded: js.String = _
  var defaultView: Window = _
  var oncontrolselect: js.Function1[MSEventObj, js.Any] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, _] = _
  var inputEncoding: js.String = _
  var activeElement: Element = _
  var onchange: js.Function1[Event, _] = _
  var links: HTMLCollection = _
  var uniqueID: js.String = _
  var URL: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  var head: HTMLHeadElement = _
  var cookie: js.String = _
  var xmlEncoding: js.String = _
  var oncanplaythrough: js.Function1[Event, _] = _
  var documentMode: js.Number = _
  var characterSet: js.String = _
  var anchors: HTMLCollection = _
  var onbeforeupdate: js.Function1[MSEventObj, js.Any] = _
  var ondatasetcomplete: js.Function1[MSEventObj, js.Any] = _
  var plugins: HTMLCollection = _
  var onsuspend: js.Function1[Event, _] = _
  var rootElement: SVGSVGElement = _
  var readyState: js.String = _
  var referrer: js.String = _
  var alinkColor: js.String = _
  var onerrorupdate: js.Function1[MSEventObj, js.Any] = _
  var parentWindow: Window = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onmsthumbnailclick: js.Function1[MSSiteModeEvent, js.Any] = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, _] = _
  var oncellchange: js.Function1[MSEventObj, js.Any] = _
  var onrowexit: js.Function1[MSEventObj, js.Any] = _
  var onrowsinserted: js.Function1[MSEventObj, js.Any] = _
  var xmlVersion: js.String = _
  var msCapsLockWarningOff: js.Boolean = _
  var onpropertychange: js.Function1[MSEventObj, js.Any] = _
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var doctype: DocumentType = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var bgColor: js.String = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var linkColor: js.String = _
  var onpause: js.Function1[Event, _] = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var onwaiting: js.Function1[Event, _] = _
  var onstop: js.Function1[Event, _] = _
  var onmssitemodejumplistitemremoved: js.Function1[MSSiteModeEvent, js.Any] = _
  var applets: HTMLCollection = _
  var body: HTMLElement = _
  var domain: js.String = _
  var xmlStandalone: js.Boolean = _
  var selection: MSSelection = _
  var onstalled: js.Function1[Event, _] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var documentElement: Element = _
  var onbeforeeditfocus: js.Function1[MSEventObj, js.Any] = _
  var onratechange: js.Function1[Event, _] = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var media: js.String = _
  var onerror: js.Function1[Event, _] = _
  var onplay: js.Function1[Event, _] = _
  var onafterupdate: js.Function1[MSEventObj, js.Any] = _
  var onplaying: js.Function1[Event, _] = _
  var images: HTMLCollection = _
  var location: Location = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onselectionchange: js.Function1[Event, _] = _
  var onstoragecommit: js.Function1[StorageEvent, js.Any] = _
  var ondataavailable: js.Function1[MSEventObj, js.Any] = _
  var onreadystatechange: js.Function1[Event, _] = _
  var lastModified: js.String = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, _] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var onselectstart: js.Function1[Event, _] = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var fgColor: js.String = _
  var ontimeupdate: js.Function1[Event, _] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  var compatMode: js.String = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var onrowenter: js.Function1[MSEventObj, js.Any] = _
  var onload: js.Function1[Event, _] = _
  var oninput: js.Function1[Event, _] = _
  def queryCommandValue(commandId: js.String): js.String = ???
  def adoptNode(source: Node): Node = ???
  def queryCommandIndeterm(commandId: js.String): js.Boolean = ???
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???
  def createProcessingInstruction(target: js.String, data: js.String): ProcessingInstruction = ???
  def execCommand(commandId: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(commandId: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(commandId: js.String): js.Boolean = ???
  def elementFromPoint(x: js.Number, y: js.Number): Element = ???
  def createCDATASection(data: js.String): CDATASection = ???
  def queryCommandText(commandId: js.String): js.String = ???
  def write(content: js.String*): Unit = ???
  def updateSettings(): Unit = ???
  def createElement(tagName: js.String): HTMLElement = ???
  def releaseCapture(): Unit = ???
  def writeln(content: js.String*): Unit = ???
  def createElementNS(namespaceURI: js.String, qualifiedName: js.String): Element = ???
  def open(url: js.String, name: js.String, features: js.String, replace: js.Boolean): js.Dynamic = ???
  def open(url: js.String, name: js.String, features: js.String): js.Dynamic = ???
  def open(url: js.String, name: js.String): js.Dynamic = ???
  def open(url: js.String): js.Dynamic = ???
  def open(): js.Dynamic = ???
  def queryCommandSupported(commandId: js.String): js.Boolean = ???
  def createTreeWalker(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): TreeWalker = ???
  def createAttributeNS(namespaceURI: js.String, qualifiedName: js.String): Attr = ???
  def queryCommandEnabled(commandId: js.String): js.Boolean = ???
  def focus(): Unit = ???
  def close(): Unit = ???
  def getElementsByClassName(classNames: js.String): NodeList = ???
  def importNode(importedNode: Node, deep: js.Boolean): Node = ???
  def createRange(): Range = ???
  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???
  def fireEvent(eventName: js.String): js.Boolean = ???
  def createComment(data: js.String): Comment = ???
  def getElementsByTagName(tagname: js.String): NodeList = ???
  def createDocumentFragment(): DocumentFragment = ???
  def createStyleSheet(href: js.String, index: js.Number): CSSStyleSheet = ???
  def createStyleSheet(href: js.String): CSSStyleSheet = ???
  def createStyleSheet(): CSSStyleSheet = ???
  def getElementsByName(elementName: js.String): NodeList = ???
  def queryCommandState(commandId: js.String): js.Boolean = ???
  def hasFocus(): js.Boolean = ???
  def execCommandShowHelp(commandId: js.String): js.Boolean = ???
  def createAttribute(name: js.String): Attr = ???
  def createTextNode(data: js.String): Text = ???
  def createNodeIterator(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): NodeIterator = ???
  def createEventObject(eventObj: js.Any): MSEventObj = ???
  def createEventObject(): MSEventObj = ???
  def getSelection(): Selection = ???
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
  def clear(): Unit = ???
}

object Document extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Document),List())))) */
}

trait MessageEvent extends Event {
  var source: Window = _
  var origin: js.String = _
  var data: js.Any = _
  def initMessageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, dataArg: js.Any, originArg: js.String, lastEventIdArg: js.String, sourceArg: Window): Unit = ???
  var ports: js.Any = _
}

object MessageEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessageEvent),List())))) */
}

trait CanvasRenderingContext2D extends js.Object {
  var miterLimit: js.Number = _
  var font: js.String = _
  var globalCompositeOperation: js.String = _
  var msFillRule: js.String = _
  var lineCap: js.String = _
  var msImageSmoothingEnabled: js.Boolean = _
  var lineDashOffset: js.Number = _
  var shadowColor: js.String = _
  var lineJoin: js.String = _
  var shadowOffsetX: js.Number = _
  var lineWidth: js.Number = _
  var canvas: HTMLCanvasElement = _
  var strokeStyle: js.Any = _
  var globalAlpha: js.Number = _
  var shadowOffsetY: js.Number = _
  var fillStyle: js.Any = _
  var shadowBlur: js.Number = _
  var textAlign: js.String = _
  var textBaseline: js.String = _
  def restore(): Unit = ???
  def setTransform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???
  def save(): Unit = ???
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number, anticlockwise: js.Boolean): Unit = ???
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number): Unit = ???
  def measureText(text: js.String): TextMetrics = ???
  def isPointInPath(x: js.Number, y: js.Number, fillRule: js.String): js.Boolean = ???
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
  def translate(x: js.Number, y: js.Number): Unit = ???
  def scale(x: js.Number, y: js.Number): Unit = ???
  def createRadialGradient(x0: js.Number, y0: js.Number, r0: js.Number, x1: js.Number, y1: js.Number, r1: js.Number): CanvasGradient = ???
  def lineTo(x: js.Number, y: js.Number): Unit = ???
  def getLineDash(): js.Array[js.Number] = ???
  def fill(fillRule: js.String): Unit = ???
  def fill(): Unit = ???
  def createImageData(imageDataOrSw: js.Any, sh: js.Number): ImageData = ???
  def createImageData(imageDataOrSw: js.Any): ImageData = ???
  def createPattern(image: HTMLElement, repetition: js.String): CanvasPattern = ???
  def closePath(): Unit = ???
  def rect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def clip(fillRule: js.String): Unit = ???
  def clip(): Unit = ???
  def clearRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def moveTo(x: js.Number, y: js.Number): Unit = ???
  def getImageData(sx: js.Number, sy: js.Number, sw: js.Number, sh: js.Number): ImageData = ???
  def fillRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def bezierCurveTo(cp1x: js.Number, cp1y: js.Number, cp2x: js.Number, cp2y: js.Number, x: js.Number, y: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number, canvasImageHeight: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number): Unit = ???
  def transform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???
  def stroke(): Unit = ???
  def strokeRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def setLineDash(segments: js.Array[js.Number]): Unit = ???
  def strokeText(text: js.String, x: js.Number, y: js.Number, maxWidth: js.Number): Unit = ???
  def strokeText(text: js.String, x: js.Number, y: js.Number): Unit = ???
  def beginPath(): Unit = ???
  def arcTo(x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number, radius: js.Number): Unit = ???
  def createLinearGradient(x0: js.Number, y0: js.Number, x1: js.Number, y1: js.Number): CanvasGradient = ???
}

object CanvasRenderingContext2D extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasRenderingContext2D),List())))) */
}

trait WindowModal extends js.Object {
  var dialogArguments: js.Any = _
  var returnValue: js.Any = _
}

class XMLHttpRequest extends EventTarget {
  var responseBody: js.Any = _
  var status: js.Number = _
  var readyState: js.Number = _
  var responseText: js.String = _
  var responseXML: Document = _
  var ontimeout: js.Function1[Event, _] = _
  var statusText: js.String = _
  var onreadystatechange: js.Function1[Event, _] = _
  var timeout: js.Number = _
  var onload: js.Function1[Event, _] = _
  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String, password: js.String): Unit = ???
  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String): Unit = ???
  def open(method: js.String, url: js.String, async: js.Boolean): Unit = ???
  def open(method: js.String, url: js.String): Unit = ???
  def create(): XMLHttpRequest = ???
  def send(data: js.Any): Unit = ???
  def send(): Unit = ???
  def abort(): Unit = ???
  def getAllResponseHeaders(): js.String = ???
  def setRequestHeader(header: js.String, value: js.String): Unit = ???
  def getResponseHeader(header: js.String): js.String = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
  var response: js.Any = _
  var withCredentials: js.Boolean = _
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var responseType: js.String = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  var upload: XMLHttpRequestEventTarget = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
}

object XMLHttpRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
}

trait Screen extends js.Object {
  var width: js.Number = _
  var deviceXDPI: js.Number = _
  var fontSmoothingEnabled: js.Boolean = _
  var bufferDepth: js.Number = _
  var logicalXDPI: js.Number = _
  var systemXDPI: js.Number = _
  var availHeight: js.Number = _
  var height: js.Number = _
  var logicalYDPI: js.Number = _
  var systemYDPI: js.Number = _
  var updateInterval: js.Number = _
  var colorDepth: js.Number = _
  var availWidth: js.Number = _
  var deviceYDPI: js.Number = _
  var pixelDepth: js.Number = _
}

object Screen extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Screen),List())))) */
}

trait Coordinates extends js.Object {
  var altitudeAccuracy: js.Number = _
  var longitude: js.Number = _
  var latitude: js.Number = _
  var speed: js.Number = _
  var heading: js.Number = _
  var altitude: js.Number = _
  var accuracy: js.Number = _
}

object Coordinates extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Coordinates),List())))) */
}

trait NavigatorGeolocation extends js.Object {
  var geolocation: Geolocation = _
}

trait NavigatorContentUtils extends js.Object {
}



trait DataTransfer extends js.Object {
  var effectAllowed: js.String = _
  var dropEffect: js.String = _
  def clearData(format: js.String): js.Boolean = ???
  def clearData(): js.Boolean = ???
  def setData(format: js.String, data: js.String): js.Boolean = ???
  def getData(format: js.String): js.String = ???
  var types: DOMStringList = _
  var files: FileList = _
}

object DataTransfer extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DataTransfer),List())))) */
}

trait FocusEvent extends UIEvent {
  var relatedTarget: EventTarget = _
  def initFocusEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, relatedTargetArg: EventTarget): Unit = ???
}

object FocusEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FocusEvent),List())))) */
}

trait Range extends js.Object {
  var startOffset: js.Number = _
  var collapsed: js.Boolean = _
  var endOffset: js.Number = _
  var startContainer: Node = _
  var endContainer: Node = _
  var commonAncestorContainer: Node = _
  def setStart(refNode: Node, offset: js.Number): Unit = ???
  def setEndBefore(refNode: Node): Unit = ???
  def setStartBefore(refNode: Node): Unit = ???
  def selectNode(refNode: Node): Unit = ???
  def detach(): Unit = ???
  def getBoundingClientRect(): ClientRect = ???

  def compareBoundaryPoints(how: js.Number, sourceRange: Range): js.Number = ???
  def insertNode(newNode: Node): Unit = ???
  def collapse(toStart: js.Boolean): Unit = ???
  def selectNodeContents(refNode: Node): Unit = ???
  def cloneContents(): DocumentFragment = ???
  def setEnd(refNode: Node, offset: js.Number): Unit = ???
  def cloneRange(): Range = ???
  def getClientRects(): ClientRectList = ???
  def surroundContents(newParent: Node): Unit = ???
  def deleteContents(): Unit = ???
  def setStartAfter(refNode: Node): Unit = ???
  def extractContents(): DocumentFragment = ???
  def setEndAfter(refNode: Node): Unit = ???
  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _
  def createContextualFragment(fragment: js.String): DocumentFragment = ???
}

object Range extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Range),List())))) */
  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _
}

trait Storage extends MSStorageExtensions {
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

object Storage extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Storage),List())))) */
}

trait TextRangeCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): TextRange = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextRange = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextRange): Unit = ???
}

object TextRangeCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextRangeCollection),List())))) */
}

trait DocumentType extends Node {
  var name: js.String = _
  var notations: NamedNodeMap = _
  var systemId: js.String = _
  var internalSubset: js.String = _
  var entities: NamedNodeMap = _
  var publicId: js.String = _
}

object DocumentType extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DocumentType),List())))) */
}

trait MutationEvent extends Event {
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

object DragEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DragEvent),List())))) */
}



trait PerformanceTiming extends js.Object {
  var redirectStart: js.Number = _
  var domainLookupEnd: js.Number = _
  var responseStart: js.Number = _
  var domComplete: js.Number = _
  var domainLookupStart: js.Number = _
  var loadEventStart: js.Number = _
  var msFirstPaint: js.Number = _
  var unloadEventEnd: js.Number = _
  var fetchStart: js.Number = _
  var requestStart: js.Number = _
  var domInteractive: js.Number = _
  var navigationStart: js.Number = _
  var connectEnd: js.Number = _
  var loadEventEnd: js.Number = _
  var connectStart: js.Number = _
  var responseEnd: js.Number = _
  var domLoading: js.Number = _
  var redirectEnd: js.Number = _
  var unloadEventStart: js.Number = _
  var domContentLoadedEventStart: js.Number = _
  var domContentLoadedEventEnd: js.Number = _
  def toJSON(): js.Dynamic = ???
}

object PerformanceTiming extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceTiming),List())))) */
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

trait NavigatorOnLine extends js.Object {
  var onLine: js.Boolean = _
}

trait WindowLocalStorage extends js.Object {
  var localStorage: Storage = _
}

trait XDomainRequest extends js.Object {
  var timeout: js.Number = _
  var onerror: js.Function1[Event, _] = _
  var onload: js.Function1[Event, _] = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ontimeout: js.Function1[Event, _] = _
  var responseText: js.String = _
  var contentType: js.String = _
  def open(method: js.String, url: js.String): Unit = ???
  def create(): XDomainRequest = ???
  def abort(): Unit = ???
  def send(data: js.Any): Unit = ???
  def send(): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object XDomainRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XDomainRequest),List())))) */
}



trait ElementTraversal extends js.Object {
  var childElementCount: js.Number = _
  var previousElementSibling: Element = _
  var lastElementChild: Element = _
  var nextElementSibling: Element = _
  var firstElementChild: Element = _
}

trait NavigatorStorageUtils extends js.Object {
}




trait Location extends js.Object {
  var hash: js.String = _
  var protocol: js.String = _
  var search: js.String = _
  var href: js.String = _
  var hostname: js.String = _
  var port: js.String = _
  var pathname: js.String = _
  var host: js.String = _
  def reload(flag: js.Boolean): Unit = ???
  def reload(): Unit = ???
  def replace(url: js.String): Unit = ???
  def assign(url: js.String): Unit = ???

}

object Location extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Location),List())))) */
}

trait PerformanceEntry extends js.Object {
  var name: js.String = _
  var startTime: js.Number = _
  var duration: js.Number = _
  var entryType: js.String = _
}

object PerformanceEntry extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceEntry),List())))) */
}

trait UIEvent extends Event {
  var detail: js.Number = _
  var view: Window = _
  def initUIEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number): Unit = ???
}

object UIEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(UIEvent),List())))) */
}


class WheelEvent extends MouseEvent {
  var deltaZ: js.Number = _
  var deltaX: js.Number = _
  var deltaMode: js.Number = _
  var deltaY: js.Number = _
  def initWheelEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, buttonArg: js.Number, relatedTargetArg: EventTarget, modifiersListArg: js.String, deltaXArg: js.Number, deltaYArg: js.Number, deltaZArg: js.Number, deltaMode: js.Number): Unit = ???
  var DOM_DELTA_PIXEL: js.Number = _
  var DOM_DELTA_LINE: js.Number = _
  var DOM_DELTA_PAGE: js.Number = _
  def getCurrentPoint(element: Element): Unit = ???
}

object WheelEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  var DOM_DELTA_PIXEL: js.Number = _
  var DOM_DELTA_LINE: js.Number = _
  var DOM_DELTA_PAGE: js.Number = _
}

trait Text extends CharacterData with MSNodeExtensions {
  var wholeText: js.String = _
  def splitText(offset: js.Number): Text = ???
  def replaceWholeText(content: js.String): Text = ???
}

object Text extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Text),List())))) */
}

trait PositionError extends js.Object {
  var code: js.Number = _
  var message: js.String = _

  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

object PositionError extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PositionError),List())))) */
  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

trait StyleSheetList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): StyleSheet = ???
  def item(): StyleSheet = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): StyleSheet = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: StyleSheet): Unit = ???
}

object StyleSheetList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleSheetList),List())))) */
}

trait CustomEvent extends Event {
  var detail: Object = _
  def initCustomEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, detailArg: Object): Unit = ???
}

object CustomEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CustomEvent),List())))) */
}

trait Geolocation extends js.Object {
  def clearWatch(watchId: js.Number): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback): Unit = ???
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): js.Number = ???
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): js.Number = ???
  def watchPosition(successCallback: PositionCallback): js.Number = ???
}

object Geolocation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Geolocation),List())))) */
}



trait History extends js.Object {
  var length: js.Number = _
  def back(distance: js.Any): Unit = ???
  def back(): Unit = ???
  def forward(distance: js.Any): Unit = ???
  def forward(): Unit = ???
  def go(delta: js.Any): Unit = ???
  def go(): Unit = ???
  var state: js.Any = _
  def replaceState(statedata: js.Any, title: js.String, url: js.String): Unit = ???
  def replaceState(statedata: js.Any, title: js.String): Unit = ???
  def pushState(statedata: js.Any, title: js.String, url: js.String): Unit = ???
  def pushState(statedata: js.Any, title: js.String): Unit = ???
}

object History extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(History),List())))) */
}

trait TimeRanges extends js.Object {
  var length: js.Number = _
  def start(index: js.Number): js.Number = ???
  def end(index: js.Number): js.Number = ???
}

object TimeRanges extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TimeRanges),List())))) */
}

trait BeforeUnloadEvent extends Event {
  var returnValue: js.String = _
}

object BeforeUnloadEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(BeforeUnloadEvent),List())))) */
}

trait Event extends js.Object {
  var timeStamp: js.Number = _
  var defaultPrevented: js.Boolean = _
  var isTrusted: js.Boolean = _
  var currentTarget: EventTarget = _
  var cancelBubble: js.Boolean = _
  var target: EventTarget = _
  var eventPhase: js.Number = _
  var cancelable: js.Boolean = _
  var `type`: js.String = _
  var srcElement: Element = _
  var bubbles: js.Boolean = _
  def initEvent(eventTypeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean): Unit = ???
  def stopPropagation(): Unit = ???
  def stopImmediatePropagation(): Unit = ???
  def preventDefault(): Unit = ???
  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

object Event extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Event),List())))) */
  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

trait ImageData extends js.Object {
  var width: js.Number = _
  var data: js.Array[js.Number] = _
  var height: js.Number = _
}

object ImageData extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ImageData),List())))) */
}


trait ErrorEventHandler extends js.Object {
  def apply(event: Event, source: js.String, fileno: js.Number, columnNumber: js.Number): Unit = ???
}

trait NamedNodeMap extends js.Object {
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

object NamedNodeMap extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NamedNodeMap),List())))) */
}

trait MediaList extends js.Object {
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

object MediaList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaList),List())))) */
}

trait ProcessingInstruction extends Node {
  var target: js.String = _
  var data: js.String = _
}

object ProcessingInstruction extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ProcessingInstruction),List())))) */
}

trait TextEvent extends UIEvent {
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

trait DocumentFragment extends Node with NodeSelector with MSEventAttachmentTarget with MSNodeExtensions {
}

object DocumentFragment extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DocumentFragment),List())))) */
}

trait Position extends js.Object {
  var timestamp: js.Number = _
  var coords: Coordinates = _
}

object Position extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Position),List())))) */
}

trait BookmarkCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): js.Dynamic = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.Any = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.Any): Unit = ???
}

object BookmarkCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(BookmarkCollection),List())))) */
}

class PerformanceMark extends PerformanceEntry {
}


trait ElementCSSInlineStyle extends js.Object {
  var runtimeStyle: MSStyleCSSProperties = _
  var currentStyle: MSCurrentStyleCSSProperties = _
  def doScroll(component: js.Any): Unit = ???
  def doScroll(): Unit = ???
  def componentFromPoint(x: js.Number, y: js.Number): js.String = ???
}

class DOMParser extends js.Object {
  def parseFromString(source: js.String, mimeType: js.String): Document = ???
}



class StyleSheet extends js.Object {
  var disabled: js.Boolean = _
  var ownerNode: Node = _
  var parentStyleSheet: StyleSheet = _
  var media: MediaList = _
  var `type`: js.String = _
  var title: js.String = _
}


trait NodeList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): Node = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): Node = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Node): Unit = ???
}

object NodeList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeList),List())))) */
}

trait NodeListOf[TNode <: Node] extends NodeList {
  override def item(index: js.Number): TNode = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  override def apply(index: js.Number): TNode = ???

}

class XMLSerializer extends js.Object {
  def serializeToString(target: Node): js.String = ???
}

object XMLSerializer extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLSerializer),List())))) */
}

trait PerformanceMeasure extends PerformanceEntry {
}

object PerformanceMeasure extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceMeasure),List())))) */
}

trait NodeFilter extends js.Object {
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

object NodeFilter extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeFilter),List())))) */
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

trait MediaError extends js.Object {
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

trait Comment extends CharacterData {
  var text: js.String = _
}

object Comment extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Comment),List())))) */
}

trait PerformanceResourceTiming extends PerformanceEntry {
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

object PerformanceResourceTiming extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceResourceTiming),List())))) */
}

trait CanvasPattern extends js.Object {
}

object CanvasPattern extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasPattern),List())))) */
}

trait StorageEvent extends Event {
  var oldValue: js.Any = _
  var newValue: js.Any = _
  var url: js.String = _
  var storageArea: Storage = _
  var key: js.String = _
  def initStorageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, keyArg: js.String, oldValueArg: js.Any, newValueArg: js.Any, urlArg: js.String, storageAreaArg: Storage): Unit = ???
}

object StorageEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StorageEvent),List())))) */
}

trait CharacterData extends Node {
  var length: js.Number = _
  var data: js.String = _
  def deleteData(offset: js.Number, count: js.Number): Unit = ???
  def replaceData(offset: js.Number, count: js.Number, arg: js.String): Unit = ???
  def appendData(arg: js.String): Unit = ???
  def insertData(offset: js.Number, arg: js.String): Unit = ???
  def substringData(offset: js.Number, count: js.Number): js.String = ???
}

object CharacterData extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CharacterData),List())))) */
}

trait DOMException extends js.Object {
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

trait Attr extends Node {
  var expando: js.Boolean = _
  var specified: js.Boolean = _
  var ownerElement: Element = _
  var value: js.String = _
  var name: js.String = _
}

object Attr extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Attr),List())))) */
}

trait PerformanceNavigation extends js.Object {
  var redirectCount: js.Number = _
  var `type`: js.Number = _
  def toJSON(): js.Dynamic = ???
  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}

object PerformanceNavigation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceNavigation),List())))) */
  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}
trait PositionCallback extends js.Object {
  def apply(position: Position): Unit = ???
}


trait LinkStyle extends js.Object {
  var styleSheet: StyleSheet = _
  var sheet: StyleSheet = _
}

trait ClientRectList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): ClientRect = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): ClientRect = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: ClientRect): Unit = ???
}

object ClientRectList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ClientRectList),List())))) */
}

trait External extends js.Object {
}

object External extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(External),List())))) */
}

object Audio extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(src),true,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(HTMLAudioElement),List())))) */
}

object Option extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(text),true,Some(TypeRef(CoreType(string),List()))), FunParam(Ident(value),true,Some(TypeRef(CoreType(string),List()))), FunParam(Ident(defaultSelected),true,Some(TypeRef(CoreType(boolean),List()))), FunParam(Ident(selected),true,Some(TypeRef(CoreType(boolean),List())))),Some(TypeRef(TypeName(HTMLOptionElement),List())))) */
}


object Image extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(width),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(height),true,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(HTMLImageElement),List())))) */
}

trait ObjectURLOptions extends js.Object {
  var oneTimeOnly: js.Boolean = _
}

trait ErrorEvent extends Event {
  var colno: js.Number = _
  var filename: js.String = _
  var lineno: js.Number = _
  var message: js.String = _
  def initErrorEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, messageArg: js.String, filenameArg: js.String, linenoArg: js.Number): Unit = ???
}

object ErrorEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ErrorEvent),List())))) */
}

trait TrackEvent extends Event {
  var track: js.Any = _
}

object TrackEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TrackEvent),List())))) */
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

object TextTrackCue extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackCue),List())))) */
}


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

object DOMTokenList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMTokenList),List())))) */
}

object WindowTimers extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WindowTimers),List())))) */
}

trait MessageChannel extends js.Object {
  var port2: MessagePort = _
  var port1: MessagePort = _
}

object MessageChannel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessageChannel),List())))) */
}

trait TransitionEvent extends Event {
  var propertyName: js.String = _
  var elapsedTime: js.Number = _
  def initTransitionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, propertyNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}

object TransitionEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TransitionEvent),List())))) */
}

trait MediaQueryList extends js.Object {
  var matches: js.Boolean = _
  var media: js.String = _
  def addListener(listener: MediaQueryListListener): Unit = ???
  def removeListener(listener: MediaQueryListListener): Unit = ???
}

object MediaQueryList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaQueryList),List())))) */
}

trait DOMError extends js.Object {
  var name: js.String = _

}

object DOMError extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMError),List())))) */
}

trait CloseEvent extends Event {
  var wasClean: js.Boolean = _
  var reason: js.String = _
  var code: js.Number = _
  def initCloseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, wasCleanArg: js.Boolean, codeArg: js.Number, reasonArg: js.String): Unit = ???
}

object CloseEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CloseEvent),List())))) */
}

class WebSocket protected () extends EventTarget {
  def this(url: js.String) = this()
  def this(url: js.String, prototcol: js.String) = this()
  def this(url: js.String, prototcol: js.Array[js.String]) = this()
  var protocol: js.String = _
  var readyState: js.Number = _
  var bufferedAmount: js.Number = _
  var onopen: js.Function1[Event, Unit] = _
  var extensions: js.String = _
  var onmessage: js.Function1[MessageEvent, Unit] = _
  var onclose: js.Function1[CloseEvent, Unit] = _
  var onerror: js.Function1[ErrorEvent, Unit] = _
  var binaryType: js.String = _
  var url: js.String = _
  def close(code: js.Number, reason: js.String): Unit = ???
  def close(code: js.Number): Unit = ???
  def close(): Unit = ???
  def send(data: js.Any): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var OPEN: js.Number = _
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  var CLOSED: js.Number = _
}

object WebSocket extends js.Object {
  var OPEN: js.Number = _
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  var CLOSED: js.Number = _
}

trait ProgressEvent extends Event {
  var loaded: js.Number = _
  var lengthComputable: js.Boolean = _
  var total: js.Number = _
  def initProgressEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, lengthComputableArg: js.Boolean, loadedArg: js.Number, totalArg: js.Number): Unit = ???
}

object ProgressEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ProgressEvent),List())))) */
}


trait FileList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): File = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): File = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: File): Unit = ???
}

object FileList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FileList),List())))) */
}



trait File extends Blob {
  var lastModifiedDate: js.Any = _
  var name: js.String = _
}

object File extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(File),List())))) */
}

trait URL extends js.Object {
  def revokeObjectURL(url: js.String): Unit = ???
  def createObjectURL(`object`: js.Any, options: ObjectURLOptions): js.String = ???
  def createObjectURL(`object`: js.Any): js.String = ???
}

trait XMLHttpRequestEventTarget extends EventTarget {
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onload: js.Function1[js.Any, js.Any] = _
  var ontimeout: js.Function1[js.Any, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object XMLHttpRequestEventTarget extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequestEventTarget),List())))) */
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

object AudioTrackList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AudioTrackList),List())))) */
}



trait WindowTimersExtension extends js.Object {
  def msSetImmediate(expression: js.Any, args: js.Any*): js.Number = ???
  def clearImmediate(handle: js.Number): Unit = ???
  def msClearImmediate(handle: js.Number): Unit = ???
  def setImmediate(expression: js.Any, args: js.Any*): js.Number = ???
}

trait AnimationEvent extends Event {
  var animationName: js.String = _
  var elapsedTime: js.Number = _
  def initAnimationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, animationNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}

object AnimationEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AnimationEvent),List())))) */
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

object AudioTrack extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AudioTrack),List())))) */
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

object TextTrackCueList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackCueList),List())))) */
}

trait TextTrackList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): TextTrack = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextTrack = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextTrack): Unit = ???
}

object TextTrackList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackList),List())))) */
}

trait Console extends js.Object {
  def info(message: js.Any, optionalParams: js.Any*): Unit = ???
  def profile(reportName: js.String): Unit = ???
  def profile(): Unit = ???
  def assert(test: js.Boolean, message: js.String, optionalParams: js.Any*): Unit = ???
  def msIsIndependentlyComposed(element: Element): js.Boolean = ???
  def clear(): Unit = ???
  def dir(value: js.Any, optionalParams: js.Any*): Unit = ???
  def warn(message: js.Any, optionalParams: js.Any*): Unit = ???
  def error(message: js.Any, optionalParams: js.Any*): Unit = ???
  def log(message: js.Any, optionalParams: js.Any*): Unit = ???
  def profileEnd(): Unit = ???
}

object Console extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Console),List())))) */
}

trait WindowBase64 extends js.Object {
  def btoa(rawString: js.String): js.String = ???
  def atob(encodedString: js.String): js.String = ???
}


trait DOMStringList extends js.Object {
  var length: js.Number = _
  def contains(str: js.String): js.Boolean = ???
  def item(index: js.Number): js.String = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
}

object DOMStringList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMStringList),List())))) */
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

object MessagePort extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessagePort),List())))) */
}

trait FileReader extends MSBaseReader {
  var error: DOMError = _
  def readAsArrayBuffer(blob: Blob): Unit = ???
  def readAsDataURL(blob: Blob): Unit = ???
  def readAsText(blob: Blob, encoding: js.String): Unit = ???
  def readAsText(blob: Blob): Unit = ???
}

object FileReader extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FileReader),List())))) */
}

trait BlobPropertyBag extends js.Object {
  var `type`: js.String = _
  var endings: js.String = _
}

class Blob extends js.Object {
  def this(blobParts: js.Array[js.Any], options: BlobPropertyBag) = this()
  def this(blobParts: js.Array[js.Any]) = this()
  var `type`: js.String = _
  var size: js.Number = _
  def msDetachStream(): js.Dynamic = ???
  def slice(start: js.Number, end: js.Number, contentType: js.String): Blob = ???
  def slice(start: js.Number, end: js.Number): Blob = ???
  def slice(start: js.Number): Blob = ???
  def slice(): Blob = ???
  def close(): Unit = ???
  def msClose(): Unit = ???
}

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

object PopStateEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PopStateEvent),List())))) */
}


trait DOMSettableTokenList extends DOMTokenList {
  var value: js.String = _
}

object DOMSettableTokenList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMSettableTokenList),List())))) */
}


class FormData extends js.Object {
  def this(form: HTMLFormElement) = this()
  def append(name: js.Any, value: js.Any, blobName: js.String): Unit = ???
  def append(name: js.Any, value: js.Any): Unit = ???
}

object FormData extends js.Object {
}


trait AbstractWorker extends EventTarget {
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


trait ValidityState extends js.Object {
  var customError: js.Boolean = _
  var valueMissing: js.Boolean = _
  var stepMismatch: js.Boolean = _
  var rangeUnderflow: js.Boolean = _
  var rangeOverflow: js.Boolean = _
  var typeMismatch: js.Boolean = _
  var patternMismatch: js.Boolean = _
  var tooLong: js.Boolean = _
  var valid: js.Boolean = _
}

object ValidityState extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ValidityState),List())))) */
}



class Worker protected () extends AbstractWorker {
  def this(stringUrl: js.String) = this()
  var onmessage: js.Function1[js.Any, js.Any] = _
  def postMessage(message: js.Any, ports: js.Any): Unit = ???
  def postMessage(message: js.Any): Unit = ???
  def terminate(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object Worker extends js.Object {
}

}

package dom {
  object globals extends js.GlobalScope {
    def parseInt(string: js.String, radix: js.Number): js.Number = ???
    def parseFloat(string: js.String, radix: js.Number): js.Number = ???
    var ondragend: js.Function1[DragEvent, js.Any] = _
    var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
    var ondragover: js.Function1[DragEvent, js.Any] = _
    var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
    var onreset: js.Function1[Event, _] = _
    var onmouseup: js.Function1[MouseEvent, js.Any] = _
    var ondragstart: js.Function1[DragEvent, js.Any] = _
    var ondrag: js.Function1[DragEvent, js.Any] = _
    var screenX: js.Number = _
    var onmouseover: js.Function1[MouseEvent, js.Any] = _
    var ondragleave: js.Function1[DragEvent, js.Any] = _
    var history: History = _
    var pageXOffset: js.Number = _
    var name: js.String = _
    var onafterprint: js.Function1[Event, _] = _
    var onpause: js.Function1[Event, _] = _
    var onbeforeprint: js.Function1[Event, _] = _
    var top: Window = _
    var onmousedown: js.Function1[MouseEvent, js.Any] = _
    var onseeked: js.Function1[Event, _] = _
    var opener: Window = _
    var onclick: js.Function1[MouseEvent, js.Any] = _
    var innerHeight: js.Number = _
    var onwaiting: js.Function1[Event, _] = _
    var ononline: js.Function1[Event, _] = _
    var ondurationchange: js.Function1[Event, _] = _
    var frames: Window = _
    var onblur: js.Function1[FocusEvent, js.Any] = _
    var onemptied: js.Function1[Event, _] = _
    var onseeking: js.Function1[Event, _] = _
    var oncanplay: js.Function1[Event, _] = _
    var outerWidth: js.Number = _
    var onstalled: js.Function1[Event, _] = _
    var onmousemove: js.Function1[MouseEvent, js.Any] = _
    var innerWidth: js.Number = _
    var onoffline: js.Function1[Event, _] = _
    var length: js.Number = _
    var screen: Screen = _
    var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
    var onratechange: js.Function1[Event, _] = _
    var onstorage: js.Function1[StorageEvent, js.Any] = _
    var onloadstart: js.Function1[Event, _] = _
    var ondragenter: js.Function1[DragEvent, js.Any] = _
    var onsubmit: js.Function1[Event, _] = _
    var self: Window = _
    var document: Document = _
    var onprogress: js.Function1[js.Any, js.Any] = _
    var ondblclick: js.Function1[MouseEvent, js.Any] = _
    var pageYOffset: js.Number = _
    var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
    var onchange: js.Function1[Event, _] = _
    var onloadedmetadata: js.Function1[Event, _] = _
    var onplay: js.Function1[Event, _] = _
    var onerror: ErrorEventHandler = _
    var onplaying: js.Function1[Event, _] = _
    var parent: Window = _
    var location: Location = _
    var oncanplaythrough: js.Function1[Event, _] = _
    var onabort: js.Function1[UIEvent, js.Any] = _
    var onreadystatechange: js.Function1[Event, _] = _
    var outerHeight: js.Number = _
    var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
    var frameElement: Element = _
    var onloadeddata: js.Function1[Event, _] = _
    var onsuspend: js.Function1[Event, _] = _
    var window: Window = _
    var onfocus: js.Function1[FocusEvent, js.Any] = _
    var onmessage: js.Function1[MessageEvent, js.Any] = _
    var ontimeupdate: js.Function1[Event, _] = _
    var onresize: js.Function1[UIEvent, js.Any] = _
    var onselect: js.Function1[UIEvent, js.Any] = _
    var navigator: Navigator = _
    var styleMedia: StyleMedia = _
    var ondrop: js.Function1[DragEvent, js.Any] = _
    var onmouseout: js.Function1[MouseEvent, js.Any] = _
    var onended: js.Function1[Event, _] = _
    var onhashchange: js.Function1[Event, _] = _
    var onunload: js.Function1[Event, _] = _
    var onscroll: js.Function1[UIEvent, js.Any] = _
    var screenY: js.Number = _
    var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
    var onload: js.Function1[Event, _] = _
    var onvolumechange: js.Function1[Event, _] = _
    var oninput: js.Function1[Event, _] = _
    var performance: Performance = _
    def alert(message: js.String): Unit = ???
    def alert(): Unit = ???
    def scroll(x: js.Number, y: js.Number): Unit = ???
    def scroll(x: js.Number): Unit = ???
    def scroll(): Unit = ???
    def focus(): Unit = ???
    def scrollTo(x: js.Number, y: js.Number): Unit = ???
    def scrollTo(x: js.Number): Unit = ???
    def scrollTo(): Unit = ???
    def print(): Unit = ???
    def prompt(message: js.String, defaul: js.String): js.String = ???
    def prompt(message: js.String): js.String = ???
    def prompt(): js.String = ???

    def open(url: js.String, target: js.String, features: js.String, replace: js.Boolean): Window = ???
    def open(url: js.String, target: js.String, features: js.String): Window = ???
    def open(url: js.String, target: js.String): Window = ???
    def open(url: js.String): Window = ???
    def open(): Window = ???
    def scrollBy(x: js.Number, y: js.Number): Unit = ???
    def scrollBy(x: js.Number): Unit = ???
    def scrollBy(): Unit = ???
    def confirm(message: js.String): js.Boolean = ???
    def confirm(): js.Boolean = ???
    def close(): Unit = ???
    def postMessage(message: js.Any, targetOrigin: js.String, ports: js.Any): Unit = ???
    def postMessage(message: js.Any, targetOrigin: js.String): Unit = ???
    def showModalDialog(url: js.String, argument: js.Any, options: js.Any): js.Dynamic = ???
    def showModalDialog(url: js.String, argument: js.Any): js.Dynamic = ???
    def showModalDialog(url: js.String): js.Dynamic = ???
    def showModalDialog(): js.Dynamic = ???
    def blur(): Unit = ???
    def getSelection(): Selection = ???
    def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???
    def getComputedStyle(elt: Element): CSSStyleDeclaration = ???
    def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
    def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
    def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    def dispatchEvent(evt: Event): js.Boolean = ???
    def attachEvent(event: js.String, listener: js.Function1[Event, Unit]): js.Boolean = ???
    def detachEvent(event: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    var localStorage: Storage = _
    var status: js.String = _
    var onmouseleave: js.Function1[MouseEvent, js.Any] = _
    var screenLeft: js.Number = _
    var offscreenBuffering: js.Any = _
    var maxConnectionsPerServer: js.Number = _
    var onmouseenter: js.Function1[MouseEvent, js.Any] = _
    var clipboardData: DataTransfer = _
    var defaultStatus: js.String = _
    var clientInformation: Navigator = _
    var closed: js.Boolean = _
    var onhelp: js.Function1[Event, _] = _
    var external: External = _
    var event: MSEventObj = _
    var onfocusout: js.Function1[FocusEvent, js.Any] = _
    var screenTop: js.Number = _
    var onfocusin: js.Function1[FocusEvent, js.Any] = _
    def showModelessDialog(url: js.String, argument: js.Any, options: js.Any): Window = ???
    def showModelessDialog(url: js.String, argument: js.Any): Window = ???
    def showModelessDialog(url: js.String): Window = ???
    def showModelessDialog(): Window = ???
    def navigate(url: js.String): Unit = ???
    def resizeBy(x: js.Number, y: js.Number): Unit = ???
    def resizeBy(x: js.Number): Unit = ???
    def resizeBy(): Unit = ???
    def item(index: js.Any): js.Dynamic = ???
    def resizeTo(x: js.Number, y: js.Number): Unit = ???
    def resizeTo(x: js.Number): Unit = ???
    def resizeTo(): Unit = ???
    def createPopup(arguments: js.Any): MSPopupWindow = ???
    def createPopup(): MSPopupWindow = ???
    def toStaticHTML(html: js.String): js.String = ???
    def execScript(code: js.String, language: js.String): js.Dynamic = ???
    def execScript(code: js.String): js.Dynamic = ???
    def msWriteProfilerMark(profilerMarkName: js.String): Unit = ???
    def moveTo(x: js.Number, y: js.Number): Unit = ???
    def moveTo(x: js.Number): Unit = ???
    def moveTo(): Unit = ???
    def moveBy(x: js.Number, y: js.Number): Unit = ???
    def moveBy(x: js.Number): Unit = ???
    def moveBy(): Unit = ???
    def showHelp(url: js.String, helpArg: js.Any, features: js.String): Unit = ???
    def showHelp(url: js.String, helpArg: js.Any): Unit = ???
    def showHelp(url: js.String): Unit = ???
    var sessionStorage: Storage = _
    def clearTimeout(handle: js.Number): Unit = ???
    def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
    def clearInterval(handle: js.Number): Unit = ???
    def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
    var URL: URL = _
    var MSApp: MSApp = _
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
    var applicationCache: ApplicationCache = _
    var onmsinertiastart: js.Function1[js.Any, js.Any] = _
    var onmspointerover: js.Function1[js.Any, js.Any] = _
    var onpopstate: js.Function1[PopStateEvent, js.Any] = _
    var onmspointerup: js.Function1[js.Any, js.Any] = _
    def msCancelRequestAnimationFrame(handle: js.Number): Unit = ???
    def matchMedia(mediaQuery: js.String): MediaQueryList = ???
    def cancelAnimationFrame(handle: js.Number): Unit = ???
    def msIsStaticHTML(html: js.String): js.Boolean = ???
    def msMatchMedia(mediaQuery: js.String): MediaQueryList = ???
    def requestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
    def msRequestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
    def btoa(rawString: js.String): js.String = ???
    def atob(encodedString: js.String): js.String = ???
    var msIndexedDB: IDBFactory = _
    var indexedDB: IDBFactory = _
    var console: Console = _
  }
}
