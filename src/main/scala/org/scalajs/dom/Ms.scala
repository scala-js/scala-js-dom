package org.scalajs.dom

import scala.scalajs.js

class MSCSSMatrix extends js.Object {
  def this(text: js.String) = this()
  var m24: js.Number = _
  var m34: js.Number = _
  var a: js.Number = _
  var d: js.Number = _
  var m32: js.Number = _
  var m41: js.Number = _
  var m11: js.Number = _
  var f: js.Number = _
  var e: js.Number = _
  var m23: js.Number = _
  var m14: js.Number = _
  var m33: js.Number = _
  var m22: js.Number = _
  var m21: js.Number = _
  var c: js.Number = _
  var m12: js.Number = _
  var b: js.Number = _
  var m42: js.Number = _
  var m31: js.Number = _
  var m43: js.Number = _
  var m13: js.Number = _
  var m44: js.Number = _
  def multiply(secondMatrix: MSCSSMatrix): MSCSSMatrix = ???
  def skewY(angle: js.Number): MSCSSMatrix = ???
  def setMatrixValue(value: js.String): Unit = ???
  def inverse(): MSCSSMatrix = ???
  def rotateAxisAngle(x: js.Number, y: js.Number, z: js.Number, angle: js.Number): MSCSSMatrix = ???

  def rotate(angleX: js.Number, angleY: js.Number, angleZ: js.Number): MSCSSMatrix = ???
  def rotate(angleX: js.Number, angleY: js.Number): MSCSSMatrix = ???
  def rotate(angleX: js.Number): MSCSSMatrix = ???
  def translate(x: js.Number, y: js.Number, z: js.Number): MSCSSMatrix = ???
  def translate(x: js.Number, y: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number, scaleY: js.Number, scaleZ: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number, scaleY: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number): MSCSSMatrix = ???
  def skewX(angle: js.Number): MSCSSMatrix = ???
}

object MSCSSMatrix extends js.Object {
}


trait MSApp extends js.Object {
  def createFileFromStorageFile(storageFile: js.Any): File = ???
  def createBlobFromRandomAccessStream(`type`: js.String, seeker: js.Any): Blob = ???
  def createStreamFromInputStream(`type`: js.String, inputStream: js.Any): MSStream = ???
  def terminateApp(exceptionObject: js.Any): Unit = ???
  def createDataPackage(`object`: js.Any): js.Dynamic = ???
  def execUnsafeLocalFunction(unsafeFunction: MSUnsafeFunctionCallback): js.Dynamic = ???
  def getHtmlPrintDocumentSource(htmlDoc: js.Any): js.Dynamic = ???
  def addPublicLocalApplicationUri(uri: js.String): Unit = ???
  def createDataPackageFromSelection(): js.Dynamic = ???
}


trait MSPointerEvent extends MouseEvent {
  var width: js.Number = _
  var rotation: js.Number = _
  var pressure: js.Number = _
  var pointerType: js.Any = _
  var isPrimary: js.Boolean = _
  var tiltY: js.Number = _
  var height: js.Number = _
  var intermediatePoints: js.Any = _
  var currentPoint: js.Any = _
  var tiltX: js.Number = _
  var hwTimestamp: js.Number = _
  var pointerId: js.Number = _
  def initPointerEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget, offsetXArg: js.Number, offsetYArg: js.Number, widthArg: js.Number, heightArg: js.Number, pressure: js.Number, rotation: js.Number, tiltX: js.Number, tiltY: js.Number, pointerIdArg: js.Number, pointerType: js.Any, hwTimestampArg: js.Number, isPrimary: js.Boolean): Unit = ???
  def getCurrentPoint(element: Element): Unit = ???
  def getIntermediatePoints(element: Element): Unit = ???
  var MSPOINTER_TYPE_PEN: js.Number = _
  var MSPOINTER_TYPE_MOUSE: js.Number = _
  var MSPOINTER_TYPE_TOUCH: js.Number = _
}

object MSPointerEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPointerEvent),List())))) */
  var MSPOINTER_TYPE_PEN: js.Number = _
  var MSPOINTER_TYPE_MOUSE: js.Number = _
  var MSPOINTER_TYPE_TOUCH: js.Number = _
}

trait MSManipulationEvent extends UIEvent {
  var lastState: js.Number = _
  var currentState: js.Number = _
  def initMSManipulationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, lastState: js.Number, currentState: js.Number): Unit = ???
  var MS_MANIPULATION_STATE_STOPPED: js.Number = _
  var MS_MANIPULATION_STATE_ACTIVE: js.Number = _
  var MS_MANIPULATION_STATE_INERTIA: js.Number = _
}

object MSManipulationEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSManipulationEvent),List())))) */
  var MS_MANIPULATION_STATE_STOPPED: js.Number = _
  var MS_MANIPULATION_STATE_ACTIVE: js.Number = _
  var MS_MANIPULATION_STATE_INERTIA: js.Number = _
}


trait MSFileSaver extends js.Object {
  def msSaveBlob(blob: js.Any, defaultName: js.String): js.Boolean = ???
  def msSaveBlob(blob: js.Any): js.Boolean = ???
  def msSaveOrOpenBlob(blob: js.Any, defaultName: js.String): js.Boolean = ???
  def msSaveOrOpenBlob(blob: js.Any): js.Boolean = ???
}

trait MSStream extends js.Object {
  var `type`: js.String = _
  def msDetachStream(): js.Dynamic = ???
  def msClose(): Unit = ???
}

object MSStream extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStream),List())))) */
}

trait MSBlobBuilder extends js.Object {
  def append(data: js.Any, endings: js.String): Unit = ???
  def append(data: js.Any): Unit = ???
  def getBlob(contentType: js.String): Blob = ???
  def getBlob(): Blob = ???
}

object MSBlobBuilder extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSBlobBuilder),List())))) */
}


trait MSLaunchUriCallback extends js.Object {
  def apply(): Unit = ???
}


trait MSUnsafeFunctionCallback extends js.Object {
  def apply(): js.Dynamic = ???
}

trait MSRangeCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): Range = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): Range = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Range): Unit = ???
}

object MSRangeCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSRangeCollection),List())))) */
}

trait MSGesture extends js.Object {
  var target: Element = _
  def addPointer(pointerId: js.Number): Unit = ???
  def stop(): Unit = ???
}

object MSGesture extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSGesture),List())))) */
}
trait MSStreamReader extends MSBaseReader {
  var error: DOMError = _
  def readAsArrayBuffer(stream: MSStream, size: js.Number): Unit = ???
  def readAsArrayBuffer(stream: MSStream): Unit = ???
  def readAsBlob(stream: MSStream, size: js.Number): Unit = ???
  def readAsBlob(stream: MSStream): Unit = ???
  def readAsDataURL(stream: MSStream, size: js.Number): Unit = ???
  def readAsDataURL(stream: MSStream): Unit = ???
  def readAsText(stream: MSStream, encoding: js.String, size: js.Number): Unit = ???
  def readAsText(stream: MSStream, encoding: js.String): Unit = ???
  def readAsText(stream: MSStream): Unit = ???
}

object MSStreamReader extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStreamReader),List())))) */
}

trait MSGestureEvent extends UIEvent {
  var offsetY: js.Number = _
  var translationY: js.Number = _
  var velocityExpansion: js.Number = _
  var velocityY: js.Number = _
  var velocityAngular: js.Number = _
  var translationX: js.Number = _
  var velocityX: js.Number = _
  var hwTimestamp: js.Number = _
  var offsetX: js.Number = _
  var screenX: js.Number = _
  var rotation: js.Number = _
  var expansion: js.Number = _
  var clientY: js.Number = _
  var screenY: js.Number = _
  var scale: js.Number = _
  var gestureObject: js.Any = _
  var clientX: js.Number = _
  def initGestureEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, offsetXArg: js.Number, offsetYArg: js.Number, translationXArg: js.Number, translationYArg: js.Number, scaleArg: js.Number, expansionArg: js.Number, rotationArg: js.Number, velocityXArg: js.Number, velocityYArg: js.Number, velocityExpansionArg: js.Number, velocityAngularArg: js.Number, hwTimestampArg: js.Number): Unit = ???
  var MSGESTURE_FLAG_BEGIN: js.Number = _
  var MSGESTURE_FLAG_END: js.Number = _
  var MSGESTURE_FLAG_CANCEL: js.Number = _
  var MSGESTURE_FLAG_INERTIA: js.Number = _
  var MSGESTURE_FLAG_NONE: js.Number = _
}

object MSGestureEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSGestureEvent),List())))) */
  var MSGESTURE_FLAG_BEGIN: js.Number = _
  var MSGESTURE_FLAG_END: js.Number = _
  var MSGESTURE_FLAG_CANCEL: js.Number = _
  var MSGESTURE_FLAG_INERTIA: js.Number = _
  var MSGESTURE_FLAG_NONE: js.Number = _
}


trait MSDataBindingRecordSetExtensions extends js.Object {
  var recordset: Object = _
  def namedRecordset(dataMember: js.String, hierarchy: js.Any): Object = ???
  def namedRecordset(dataMember: js.String): Object = ???
}
trait MSDataBindingTableExtensions extends js.Object {
  var dataPageSize: js.Number = _
  def nextPage(): Unit = ???
  def firstPage(): Unit = ???
  def refresh(): Unit = ???
  def previousPage(): Unit = ???
  def lastPage(): Unit = ???
}

trait MSStyleCSSProperties extends MSCSSProperties {
  var pixelWidth: js.Number = _
  var posHeight: js.Number = _
  var posLeft: js.Number = _
  var pixelTop: js.Number = _
  var pixelBottom: js.Number = _
  var textDecorationNone: js.Boolean = _
  var pixelLeft: js.Number = _
  var posTop: js.Number = _
  var posBottom: js.Number = _
  var textDecorationOverline: js.Boolean = _
  var posWidth: js.Number = _
  var textDecorationLineThrough: js.Boolean = _
  var pixelHeight: js.Number = _
  var textDecorationBlink: js.Boolean = _
  var posRight: js.Number = _
  var pixelRight: js.Number = _
  var textDecorationUnderline: js.Boolean = _
}

object MSStyleCSSProperties extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStyleCSSProperties),List())))) */
}

trait MSScriptHost extends js.Object {
}

object MSScriptHost extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSScriptHost),List())))) */
}

trait MSSelection extends js.Object {
  var `type`: js.String = _
  var typeDetail: js.String = _
  def createRange(): TextRange = ???
  def clear(): Unit = ???
  def createRangeCollection(): TextRangeCollection = ???
  def empty(): Unit = ???
}

object MSSelection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSSelection),List())))) */
}

trait MSDataBindingRecordSetReadonlyExtensions extends js.Object {
  var recordset: Object = _
  def namedRecordset(dataMember: js.String, hierarchy: js.Any): Object = ???
  def namedRecordset(dataMember: js.String): Object = ???
}

trait MSNamespaceInfo extends MSEventAttachmentTarget {
  var urn: js.String = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var name: js.String = _
  var readyState: js.String = _
  def doImport(implementationUrl: js.String): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object MSNamespaceInfo extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSNamespaceInfo),List())))) */
}

trait MSSiteModeEvent extends Event {
  var buttonID: js.Number = _
  var actionURL: js.String = _
}

object MSSiteModeEvent extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSSiteModeEvent),List())))) */
}


trait MSCSSProperties extends CSSStyleDeclaration {
  var scrollbarShadowColor: js.String = _
  var scrollbarHighlightColor: js.String = _
  var layoutGridChar: js.String = _
  var layoutGridType: js.String = _
  var textAutospace: js.String = _
  var textKashidaSpace: js.String = _
  var writingMode: js.String = _
  var scrollbarFaceColor: js.String = _
  var backgroundPositionY: js.String = _
  var lineBreak: js.String = _
  var imeMode: js.String = _
  var msBlockProgression: js.String = _
  var layoutGridLine: js.String = _
  var scrollbarBaseColor: js.String = _
  var layoutGrid: js.String = _
  var layoutFlow: js.String = _
  var textKashida: js.String = _
  var filter: js.String = _
  var zoom: js.String = _
  var scrollbarArrowColor: js.String = _
  var behavior: js.String = _
  var backgroundPositionX: js.String = _
  var accelerator: js.String = _
  var layoutGridMode: js.String = _
  var textJustifyTrim: js.String = _
  var scrollbar3dLightColor: js.String = _
  var msInterpolationMode: js.String = _
  var scrollbarTrackColor: js.String = _
  var scrollbarDarkShadowColor: js.String = _
  var styleFloat: js.String = _
  def getAttribute(attributeName: js.String, flags: js.Number): js.Dynamic = ???
  def getAttribute(attributeName: js.String): js.Dynamic = ???
  def setAttribute(attributeName: js.String, AttributeValue: js.Any, flags: js.Number): Unit = ???
  def setAttribute(attributeName: js.String, AttributeValue: js.Any): Unit = ???
  def removeAttribute(attributeName: js.String, flags: js.Number): js.Boolean = ???
  def removeAttribute(attributeName: js.String): js.Boolean = ???
}

object MSCSSProperties extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCSSProperties),List())))) */
}
trait MSCSSRuleList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): CSSStyleRule = ???
  def item(): CSSStyleRule = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSStyleRule = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSStyleRule): Unit = ???
}

object MSCSSRuleList extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCSSRuleList),List())))) */
}

trait MSDataBindingExtensions extends js.Object {
  var dataSrc: js.String = _
  var dataFormatAs: js.String = _
  var dataFld: js.String = _
}

trait MSPluginsCollection extends js.Object {
  var length: js.Number = _
  def refresh(reload: js.Boolean): Unit = ???
  def refresh(): Unit = ???
}

object MSPluginsCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPluginsCollection),List())))) */
}

trait MSResourceMetadata extends js.Object {
  var protocol: js.String = _
  var fileSize: js.String = _
  var fileUpdatedDate: js.String = _
  var nameProp: js.String = _
  var fileCreatedDate: js.String = _
  var fileModifiedDate: js.String = _
  var mimeType: js.String = _
}

trait MSStorageExtensions extends js.Object {
  var remainingSpace: js.Number = _
}

trait MSCurrentStyleCSSProperties extends MSCSSProperties {
  var blockDirection: js.String = _
  var clipBottom: js.String = _
  var clipLeft: js.String = _
  var clipRight: js.String = _
  var clipTop: js.String = _
  var hasLayout: js.String = _
}

object MSCurrentStyleCSSProperties extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCurrentStyleCSSProperties),List())))) */
}

trait MSHTMLCollectionExtensions extends js.Object {
  def urns(urn: js.Any): Object = ???
  def tags(tagName: js.Any): Object = ???
}

trait MSNavigatorDoNotTrack extends js.Object {
  var msDoNotTrack: js.String = _
}


trait MSEventAttachmentTarget extends js.Object {
  def attachEvent(event: js.String, listener: js.Function1[Event, Unit]): js.Boolean = ???
  def detachEvent(event: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}
trait MSCompatibleInfo extends js.Object {
  var version: js.String = _
  var userAgent: js.String = _
}

object MSCompatibleInfo extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCompatibleInfo),List())))) */
}

trait MSImageResourceExtensions extends js.Object {
  var dynsrc: js.String = _
  var vrml: js.String = _
  var lowsrc: js.String = _
  var start: js.String = _
  var loop: js.Number = _
}

trait MSNamespaceInfoCollection extends js.Object {
  var length: js.Number = _
  def add(namespace: js.String, urn: js.String, implementationUrl: js.Any): Object = ???
  def add(namespace: js.String, urn: js.String): Object = ???
  def add(namespace: js.String): Object = ???
  def add(): Object = ???
  def item(index: js.Any): Object = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: js.String): Object = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: js.String, v: Object): Unit = ???
}

object MSNamespaceInfoCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSNamespaceInfoCollection),List())))) */
}

trait MSWindowModeless extends js.Object {
  var dialogTop: js.Any = _
  var dialogLeft: js.Any = _
  var dialogWidth: js.Any = _
  var dialogHeight: js.Any = _
  var menuArguments: js.Any = _
}

trait MSNodeExtensions extends js.Object {
  def swapNode(otherNode: Node): Node = ???
  def removeNode(deep: js.Boolean): Node = ???
  def removeNode(): Node = ???
  def replaceNode(replacement: Node): Node = ???
}
trait MSPopupWindow extends js.Object {
  var document: Document = _
  var isOpen: js.Boolean = _
  def show(x: js.Number, y: js.Number, w: js.Number, h: js.Number, element: js.Any): Unit = ???
  def show(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def hide(): Unit = ???
}

object MSPopupWindow extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPopupWindow),List())))) */
}

trait MSWindowExtensions extends js.Object {
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
  var onhelp: js.Function1[Event, js.Any] = _
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
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

trait MSBehaviorUrnsCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): js.String = ???
}

object MSBehaviorUrnsCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSBehaviorUrnsCollection),List())))) */
}

trait MSNavigatorExtensions extends js.Object {
  var userLanguage: js.String = _
  var plugins: MSPluginsCollection = _
  var cookieEnabled: js.Boolean = _
  var appCodeName: js.String = _
  var cpuClass: js.String = _
  var appMinorVersion: js.String = _
  var connectionSpeed: js.Number = _
  var browserLanguage: js.String = _
  var mimeTypes: MSMimeTypesCollection = _
  var systemLanguage: js.String = _
  def javaEnabled(): js.Boolean = ???
  def taintEnabled(): js.Boolean = ???
}
trait MSMimeTypesCollection extends js.Object {
  var length: js.Number = _
}

object MSMimeTypesCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSMimeTypesCollection),List())))) */
}

trait MSCompatibleInfoCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): MSCompatibleInfo = ???
}

object MSCompatibleInfoCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCompatibleInfoCollection),List())))) */
}

trait MSBaseReader extends EventTarget {
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var readyState: js.Number = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onload: js.Function1[js.Any, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
  var result: js.Any = _
  def abort(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var LOADING: js.Number = _
  var EMPTY: js.Number = _
  var DONE: js.Number = _
}

trait MSEventObj extends Event {
  var nextPage: js.String = _
  var keyCode: js.Number = _
  var toElement: Element = _
  var returnValue: js.Any = _
  var dataFld: js.String = _
  var y: js.Number = _
  var dataTransfer: DataTransfer = _
  var propertyName: js.String = _
  var url: js.String = _
  var offsetX: js.Number = _
  var recordset: Object = _
  var screenX: js.Number = _
  var buttonID: js.Number = _
  var wheelDelta: js.Number = _
  var reason: js.Number = _
  var origin: js.String = _
  var data: js.String = _
  var srcFilter: Object = _
  var boundElements: HTMLCollection = _
  var altLeft: js.Boolean = _
  var behaviorCookie: js.Number = _
  var bookmarks: BookmarkCollection = _
  var repeat: js.Boolean = _
  var source: Window = _
  var fromElement: Element = _
  var offsetY: js.Number = _
  var x: js.Number = _
  var behaviorPart: js.Number = _
  var qualifier: js.String = _
  var altKey: js.Boolean = _
  var ctrlKey: js.Boolean = _
  var clientY: js.Number = _
  var shiftKey: js.Boolean = _
  var shiftLeft: js.Boolean = _
  var contentOverflow: js.Boolean = _
  var screenY: js.Number = _
  var ctrlLeft: js.Boolean = _
  var button: js.Number = _
  var srcUrn: js.String = _
  var clientX: js.Number = _
  var actionURL: js.String = _
  def getAttribute(strAttributeName: js.String, lFlags: js.Number): js.Dynamic = ???
  def getAttribute(strAttributeName: js.String): js.Dynamic = ???
  def setAttribute(strAttributeName: js.String, AttributeValue: js.Any, lFlags: js.Number): Unit = ???
  def setAttribute(strAttributeName: js.String, AttributeValue: js.Any): Unit = ???
  def removeAttribute(strAttributeName: js.String, lFlags: js.Number): js.Boolean = ???
  def removeAttribute(strAttributeName: js.String): js.Boolean = ???
}

object MSEventObj extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSEventObj),List())))) */
}
