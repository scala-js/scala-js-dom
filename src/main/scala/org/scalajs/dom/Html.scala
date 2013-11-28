package org.scalajs.dom
import scala.scalajs.js

class HTMLTableElement extends HTMLElement {
  var width: js.String = _
  var borderColorLight: js.Any = _
  var cellSpacing: js.String = _
  var tFoot: HTMLTableSectionElement = _
  var frame: js.String = _
  var borderColor: js.Any = _
  var rows: HTMLCollection = _
  var rules: js.String = _
  var cols: js.Number = _
  var summary: js.String = _
  var caption: HTMLTableCaptionElement = _
  var tBodies: HTMLCollection = _
  var tHead: HTMLTableSectionElement = _
  var align: js.String = _
  var cells: HTMLCollection = _
  var height: js.Any = _
  var cellPadding: js.String = _
  var border: js.String = _
  var borderColorDark: js.Any = _
  def deleteRow(index: js.Number): Unit = ???
  def deleteRow(): Unit = ???
  def createTBody(): HTMLElement = ???
  def deleteCaption(): Unit = ???
  def insertRow(index: js.Number): HTMLElement = ???
  def insertRow(): HTMLElement = ???
  def deleteTFoot(): Unit = ???
  def createTHead(): HTMLElement = ???
  def deleteTHead(): Unit = ???
  def createCaption(): HTMLElement = ???
  def moveRow(indexFrom: js.Number, indexTo: js.Number): Object = ???
  def moveRow(indexFrom: js.Number): Object = ???
  def moveRow(): Object = ???
  def createTFoot(): HTMLElement = ???
}

class HTMLTableDataCellElement extends HTMLTableCellElement {
}

class HTMLBaseElement extends HTMLElement {
  var target: js.String = _
  var href: js.String = _
}

trait HTMLNextIdElement extends HTMLElement {
  var n: js.String = _
}

class HTMLParagraphElement extends HTMLElement {
  var align: js.String = _
}


trait HTMLAreasCollection extends HTMLCollection {
  def remove(index: js.Number): Unit = ???
  def remove(): Unit = ???
  def add(element: HTMLElement, before: js.Any): Unit = ???
  def add(element: HTMLElement): Unit = ???
}

class HTMLAppletElement extends HTMLElement{
  var width: js.Number = _
  var codeType: js.String = _
  var `object`: js.String = _
  var form: HTMLFormElement = _
  var code: js.String = _
  var archive: js.String = _
  var alt: js.String = _
  var standby: js.String = _
  var classid: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var data: js.String = _
  var height: js.String = _
  var altHtml: js.String = _
  var contentDocument: Document = _
  var codeBase: js.String = _
  var declare: js.Boolean = _
  var `type`: js.String = _
  var BaseHref: js.String = _
}

class HTMLOListElement extends HTMLElement {
  var start: js.Number = _
}

class HTMLSelectElement extends HTMLElement {
  var options: HTMLSelectElement = _
  var value: js.String = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var size: js.Number = _
  var length: js.Number = _
  var selectedIndex: js.Number = _
  var multiple: js.Boolean = _
  var `type`: js.String = _
  def remove(index: js.Number): Unit = ???
  def remove(): Unit = ???
  def add(element: HTMLElement, before: js.Any): Unit = ???
  def add(element: HTMLElement): Unit = ???
  def item(name: js.Any, index: js.Any): js.Dynamic = ???
  def item(name: js.Any): js.Dynamic = ???
  def item(): js.Dynamic = ???
  def namedItem(name: js.String): js.Dynamic = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???
  var validationMessage: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var required: js.Boolean = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

trait HTMLBlockElement extends HTMLElement {
  var width: js.Number = _
  var cite: js.String = _
}

class HTMLMetaElement extends HTMLElement {
  var httpEquiv: js.String = _
  var name: js.String = _
  var content: js.String = _
  var url: js.String = _
  var scheme: js.String = _
  var charset: js.String = _
}

class HTMLDDElement extends HTMLElement {
  var noWrap: js.Boolean = _
}

class HTMLLinkElement extends HTMLElement with LinkStyle {
  var rel: js.String = _
  var target: js.String = _
  var href: js.String = _
  var media: js.String = _
  var rev: js.String = _
  var `type`: js.String = _
  var charset: js.String = _
  var hreflang: js.String = _
}

class HTMLFontElement extends HTMLElement {
  var face: js.String = _
}

class HTMLTableCaptionElement extends HTMLElement {
  var align: js.String = _
  var vAlign: js.String = _
}

class HTMLOptionElement extends HTMLElement{
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var value: js.String = _
  var text: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
  def create(): HTMLOptionElement = ???
}

class HTMLMapElement extends HTMLElement {
  var name: js.String = _
  var areas: HTMLAreasCollection = _
}

class HTMLMenuElement extends HTMLElement {
  var `type`: js.String = _
}

class HTMLCollection {
  var length: js.Number = _
  def item(nameOrIndex: js.Any, optionalIndex: js.Any): Element = ???
  def item(nameOrIndex: js.Any): Element = ???
  def item(): Element = ???
  def namedItem(name: js.String): Element = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.Number): Element = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.Number, v: Element): Unit = ???
}

class HTMLImageElement extends HTMLElement {
  var width: js.Number = _
  var vspace: js.Number = _
  var naturalHeight: js.Number = _
  var alt: js.String = _
  var align: js.String = _
  var src: js.String = _
  var useMap: js.String = _
  var naturalWidth: js.Number = _
  var name: js.String = _
  var height: js.Number = _
  var border: js.String = _
  var hspace: js.Number = _
  var longDesc: js.String = _
  var href: js.String = _
  var isMap: js.Boolean = _
  var complete: js.Boolean = _
  def create(): HTMLImageElement = ???
  var msPlayToPrimary: js.Boolean = _
  var msPlayToDisabled: js.Boolean = _
  var msPlayToSource: js.Any = _
}

class HTMLAreaElement extends HTMLElement {
  var protocol: js.String = _
  var search: js.String = _
  var alt: js.String = _
  var coords: js.String = _
  var hostname: js.String = _
  var port: js.String = _
  var pathname: js.String = _
  var host: js.String = _
  var hash: js.String = _
  var target: js.String = _
  var href: js.String = _
  var noHref: js.Boolean = _
  var shape: js.String = _

}

class HTMLButtonElement extends HTMLElement {
  var value: js.String = _
  var status: js.Any = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var `type`: js.String = _
  def createTextRange(): TextRange = ???
  var validationMessage: js.String = _
  var formTarget: js.String = _
  var willValidate: js.Boolean = _
  var formAction: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var formNoValidate: js.String = _
  var formEnctype: js.String = _
  var formMethod: js.String = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

class HTMLSourceElement extends HTMLElement {
  var src: js.String = _
  var media: js.String = _
  var `type`: js.String = _
}

class HTMLScriptElement extends HTMLElement {
  var defer: js.Boolean = _
  var text: js.String = _
  var src: js.String = _
  var htmlFor: js.String = _
  var charset: js.String = _
  var `type`: js.String = _
  var event: js.String = _
  var async: js.Boolean = _
}

class HTMLTableRowElement extends HTMLElement with HTMLTableAlignment {
  var rowIndex: js.Number = _
  var cells: HTMLCollection = _
  var align: js.String = _
  var borderColorLight: js.Any = _
  var sectionRowIndex: js.Number = _
  var borderColor: js.Any = _
  var height: js.Any = _
  var borderColorDark: js.Any = _
  def deleteCell(index: js.Number): Unit = ???
  def deleteCell(): Unit = ???
  def insertCell(index: js.Number): HTMLElement = ???
  def insertCell(): HTMLElement = ???
}

class HTMLHtmlElement extends HTMLElement {
  var version: js.String = _
}

class HTMLFrameElement extends HTMLElement with GetSVGDocument {
  var width: js.Any = _
  var scrolling: js.String = _
  var marginHeight: js.String = _
  var marginWidth: js.String = _
  var borderColor: js.Any = _
  var frameSpacing: js.Any = _
  var frameBorder: js.String = _
  var noResize: js.Boolean = _
  var contentWindow: Window = _
  var src: js.String = _
  var name: js.String = _
  var height: js.Any = _
  var contentDocument: Document = _
  var border: js.String = _
  var longDesc: js.String = _
  var onload: js.Function1[Event, _] = _
  var security: js.Any = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]  ): Unit = ???
}

class HTMLQuoteElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

class HTMLTableHeaderCellElement extends HTMLTableCellElement {
}

class HTMLDListElement extends HTMLElement {
}

class HTMLFrameSetElement extends HTMLElement {
  var ononline: js.Function1[Event, _] = _
  var borderColor: js.Any = _
  var rows: js.String = _
  var cols: js.String = _
  var frameSpacing: js.Any = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var onerror: js.Function1[Event, _] = _
  var frameBorder: js.String = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var name: js.String = _
  var onafterprint: js.Function1[Event, _] = _
  var onbeforeprint: js.Function1[Event, _] = _
  var onoffline: js.Function1[Event, _] = _
  var border: js.String = _
  var onunload: js.Function1[Event, _] = _
  var onhashchange: js.Function1[Event, _] = _
  var onload: js.Function1[Event, _] = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

class HTMLLabelElement extends HTMLElement {
  var htmlFor: js.String = _
  var form: HTMLFormElement = _
}

class HTMLLegendElement extends HTMLElement {
  var align: js.String = _
  var form: HTMLFormElement = _
}

class HTMLDirectoryElement extends HTMLElement {
}

class HTMLLIElement extends HTMLElement {
  var value: js.Number = _
}

class HTMLIFrameElement extends HTMLElement with GetSVGDocument {
  var width: js.String = _
  var scrolling: js.String = _
  var marginHeight: js.String = _
  var marginWidth: js.String = _
  var frameSpacing: js.Any = _
  var frameBorder: js.String = _
  var noResize: js.Boolean = _
  var vspace: js.Number = _
  var contentWindow: Window = _
  var align: js.String = _
  var src: js.String = _
  var name: js.String = _
  var height: js.String = _
  var border: js.String = _
  var contentDocument: Document = _
  var hspace: js.Number = _
  var longDesc: js.String = _
  var security: js.Any = _
  var onload: js.Function1[Event, _] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var sandbox: DOMSettableTokenList = _
}

class HTMLBodyElement extends HTMLElement {
  var scroll: js.String = _
  var ononline: js.Function1[Event, _] = _
  var noWrap: js.Boolean = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var text: js.Any = _
  var onerror: js.Function1[Event, _] = _
  var bgProperties: js.String = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var link: js.Any = _
  var aLink: js.Any = _
  var bottomMargin: js.Any = _
  var topMargin: js.Any = _
  var onafterprint: js.Function1[Event, _] = _
  var vLink: js.Any = _
  var onbeforeprint: js.Function1[Event, _] = _
  var onoffline: js.Function1[Event, _] = _
  var onunload: js.Function1[Event, _] = _
  var onhashchange: js.Function1[Event, _] = _
  var onload: js.Function1[Event, _] = _
  var rightMargin: js.Any = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var leftMargin: js.Any = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  def createTextRange(): TextRange = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onpopstate: js.Function1[PopStateEvent, js.Any] = _
}

class HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment {
  var align: js.String = _
  var rows: HTMLCollection = _
  def deleteRow(index: js.Number): Unit = ???
  def deleteRow(): Unit = ???
  def moveRow(indexFrom: js.Number, indexTo: js.Number): Object = ???
  def moveRow(indexFrom: js.Number): Object = ???
  def moveRow(): Object = ???
  def insertRow(index: js.Number): HTMLElement = ???
  def insertRow(): HTMLElement = ???
}

class HTMLInputElement extends HTMLElement {
  var width: js.String = _
  var status: js.Boolean = _
  var form: HTMLFormElement = _
  var selectionStart: js.Number = _
  var indeterminate: js.Boolean = _
  var readOnly: js.Boolean = _
  var size: js.Number = _
  var loop: js.Number = _
  var selectionEnd: js.Number = _
  var vrml: js.String = _
  var lowsrc: js.String = _
  var vspace: js.Number = _
  var accept: js.String = _
  var alt: js.String = _
  var defaultChecked: js.Boolean = _
  var align: js.String = _
  var value: js.String = _
  var src: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var height: js.String = _
  var border: js.String = _
  var dynsrc: js.String = _
  var checked: js.Boolean = _
  var hspace: js.Number = _
  var maxLength: js.Number = _
  var `type`: js.String = _
  var defaultValue: js.String = _
  var complete: js.Boolean = _
  var start: js.String = _
  def createTextRange(): TextRange = ???
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???
  def select(): Unit = ???
  var validationMessage: js.String = _
  var files: FileList = _
  var max: js.String = _
  var formTarget: js.String = _
  var willValidate: js.Boolean = _
  var step: js.String = _
  var autofocus: js.Boolean = _
  var required: js.Boolean = _
  var formEnctype: js.String = _
  var valueAsNumber: js.Number = _
  var placeholder: js.String = _
  var formMethod: js.String = _
  var list: HTMLElement = _
  var autocomplete: js.String = _
  var min: js.String = _
  var formAction: js.String = _
  var pattern: js.String = _
  var validity: ValidityState = _
  var formNoValidate: js.String = _
  var multiple: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def stepDown(n: js.Number): Unit = ???
  def stepDown(): Unit = ???
  def stepUp(n: js.Number): Unit = ???
  def stepUp(): Unit = ???
  def setCustomValidity(error: js.String): Unit = ???
}

class HTMLAnchorElement extends HTMLElement {
  var rel: js.String = _
  var protocol: js.String = _
  var search: js.String = _
  var coords: js.String = _
  var hostname: js.String = _
  var pathname: js.String = _
  var Methods: js.String = _
  var target: js.String = _
  var protocolLong: js.String = _
  var href: js.String = _
  var name: js.String = _
  var charset: js.String = _
  var hreflang: js.String = _
  var port: js.String = _
  var host: js.String = _
  var hash: js.String = _
  var nameProp: js.String = _
  var urn: js.String = _
  var rev: js.String = _
  var shape: js.String = _
  var `type`: js.String = _
  var mimeType: js.String = _

  var text: js.String = _
}

class HTMLParamElement extends HTMLElement {
  var value: js.String = _
  var name: js.String = _
  var `type`: js.String = _
  var valueType: js.String = _
}

class HTMLPreElement extends HTMLElement {
  var width: js.Number = _
  var cite: js.String = _
}


class HTMLPhraseElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}


class HTMLCanvasElement extends HTMLElement {
  var width: js.Number = _
  var height: js.Number = _
  def toDataURL(`type`: js.String, args: js.Any*): js.String = ???
  def getContext(contextId: js.String, args: js.Any*): js.Dynamic = ???
  def msToBlob(): Blob = ???
}


class HTMLTitleElement extends HTMLElement {
  var text: js.String = _
}


class HTMLStyleElement extends HTMLElement with LinkStyle {
  var media: js.String = _
  var `type`: js.String = _
}


class HTMLUnknownElement extends HTMLElement {
}


class HTMLAudioElement extends HTMLMediaElement {
}


class HTMLTableCellElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Number = _
  var headers: js.String = _
  var cellIndex: js.Number = _
  var align: js.String = _
  var borderColorLight: js.Any = _
  var colSpan: js.Number = _
  var borderColor: js.Any = _
  var axis: js.String = _
  var height: js.Any = _
  var noWrap: js.Boolean = _
  var abbr: js.String = _
  var rowSpan: js.Number = _
  var scope: js.String = _
  var borderColorDark: js.Any = _
}



class HTMLBaseFontElement extends HTMLElement {
  var face: js.String = _
  var size: js.Number = _
}


class HTMLTextAreaElement extends HTMLElement {
  var value: js.String = _
  var status: js.Any = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var selectionStart: js.Number = _
  var rows: js.Number = _
  var cols: js.Number = _
  var readOnly: js.Boolean = _
  var wrap: js.String = _
  var selectionEnd: js.Number = _
  var `type`: js.String = _
  var defaultValue: js.String = _
  def createTextRange(): TextRange = ???
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???
  def select(): Unit = ???
  var validationMessage: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var required: js.Boolean = _
  var maxLength: js.Number = _
  var willValidate: js.Boolean = _
  var placeholder: js.String = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

class HTMLModElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}


class HTMLTableColElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Any = _
  var align: js.String = _
  var span: js.Number = _
}


trait HTMLTableAlignment extends js.Object {
  var ch: js.String = _
  var vAlign: js.String = _
  var chOff: js.String = _
}
class HTMLUListElement extends HTMLElement {
}


class HTMLDivElement extends HTMLElement {
  var align: js.String = _
  var noWrap: js.Boolean = _
}


class HTMLBRElement extends HTMLElement {
  var clear: js.String = _
}


class HTMLMediaElement extends HTMLElement {
  var initialTime: js.Number = _
  var played: TimeRanges = _
  var currentSrc: js.String = _
  var autobuffer: js.Boolean = _
  var loop: js.Boolean = _
  var ended: js.Boolean = _
  var buffered: TimeRanges = _
  var error: MediaError = _
  var seekable: TimeRanges = _
  var autoplay: js.Boolean = _
  var controls: js.Boolean = _
  var volume: js.Number = _
  var src: js.String = _
  var playbackRate: js.Number = _
  var duration: js.Number = _
  var muted: js.Boolean = _
  var defaultPlaybackRate: js.Number = _
  var paused: js.Boolean = _
  var seeking: js.Boolean = _
  var currentTime: js.Number = _
  var preload: js.String = _
  var networkState: js.Number = _
  def pause(): Unit = ???
  def play(): Unit = ???
  def load(): Unit = ???
  def canPlayType(`type`: js.String): js.String = ???
  var HAVE_METADATA: js.Number = _
  var HAVE_CURRENT_DATA: js.Number = _
  var HAVE_NOTHING: js.Number = _
  var NETWORK_NO_SOURCE: js.Number = _
  var HAVE_ENOUGH_DATA: js.Number = _
  var NETWORK_EMPTY: js.Number = _
  var NETWORK_LOADING: js.Number = _
  var NETWORK_IDLE: js.Number = _
  var HAVE_FUTURE_DATA: js.Number = _
  var msAudioCategory: js.String = _
  var msRealTime: js.Boolean = _
  var msPlayToPrimary: js.Boolean = _
  var textTracks: TextTrackList = _
  var msPlayToDisabled: js.Boolean = _
  var audioTracks: AudioTrackList = _
  var msPlayToSource: js.Any = _
  var msAudioDeviceType: js.String = _
  def msClearEffects(): Unit = ???
  def msSetMediaProtectionManager(mediaProtectionManager: js.Any): Unit = ???
  def msSetMediaProtectionManager(): Unit = ???
  def msInsertAudioEffect(activatableClassId: js.String, effectRequired: js.Boolean, config: js.Any): Unit = ???
  def msInsertAudioEffect(activatableClassId: js.String, effectRequired: js.Boolean): Unit = ???
}

object HTMLMediaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMediaElement),List())))) */
  var HAVE_METADATA: js.Number = _
  var HAVE_CURRENT_DATA: js.Number = _
  var HAVE_NOTHING: js.Number = _
  var NETWORK_NO_SOURCE: js.Number = _
  var HAVE_ENOUGH_DATA: js.Number = _
  var NETWORK_EMPTY: js.Number = _
  var NETWORK_LOADING: js.Number = _
  var NETWORK_IDLE: js.Number = _
  var HAVE_FUTURE_DATA: js.Number = _
}

class HTMLDTElement extends HTMLElement {
  var noWrap: js.Boolean = _
}


class HTMLFieldSetElement extends HTMLElement {
  var align: js.String = _
  var form: HTMLFormElement = _
  var validationMessage: js.String = _
  var validity: ValidityState = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}


class HTMLBGSoundElement extends HTMLElement {
  var balance: js.Any = _
  var volume: js.Any = _
  var src: js.String = _
  var loop: js.Number = _
}


class HTMLElement extends Element with ElementCSSInlineStyle {
  var onblur: js.Function1[FocusEvent, _] = _
  var onfocus: js.Function1[FocusEvent, _] = _
  var onmouseleave: js.Function1[MouseEvent, _] = _
  var onbeforecut: js.Function1[DragEvent, _] = _
  var onkeydown: js.Function1[KeyboardEvent, _] = _
  var onkeyup: js.Function1[KeyboardEvent, _] = _
  var onreset: js.Function1[Event, _] = _
  var onhelp: js.Function1[Event, _] = _
  var ondragleave: js.Function1[DragEvent, _] = _
  var className: js.String = _
  var onfocusin: js.Function1[FocusEvent, _] = _
  var onseeked: js.Function1[Event, _] = _
  var recordNumber: js.Any = _
  var title: js.String = _
  var parentTextEdit: Element = _
  var outerHTML: js.String = _
  var ondurationchange: js.Function1[Event, _] = _
  var offsetHeight: js.Number = _
  var all: HTMLCollection = _
  var dir: js.String = _
  var onemptied: js.Function1[Event, _] = _
  var onseeking: js.Function1[Event, _] = _
  var oncanplay: js.Function1[Event, _] = _
  var ondeactivate: js.Function1[UIEvent, js.Any] = _
  var sourceIndex: js.Number = _
  var onloadstart: js.Function1[Event, _] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, _] = _
  var scopeName: js.String = _
  var onchange: js.Function1[Event, _] = _
  var id: js.String = _
  var uniqueID: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplaythrough: js.Function1[Event, _] = _
  var offsetParent: Element = _
  var onsuspend: js.Function1[Event, _] = _
  var readyState: js.Any = _
  var onmouseenter: js.Function1[MouseEvent, js.Any] = _
  var innerText: js.String = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var parentElement: HTMLElement = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, _] = _
  var filters: Object = _
  var children: HTMLCollection = _
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var onbeforepaste: js.Function1[DragEvent, js.Any] = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var offsetTop: js.Number = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var onbeforecopy: js.Function1[DragEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var innerHTML: js.String = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var lang: js.String = _
  var uniqueNumber: js.Number = _
  var onpause: js.Function1[Event, _] = _
  var tagUrn: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var onwaiting: js.Function1[Event, _] = _
  var offsetLeft: js.Number = _
  var isTextEdit: js.Boolean = _
  var isDisabled: js.Boolean = _
  var onpaste: js.Function1[DragEvent, js.Any] = _
  var canHaveHTML: js.Boolean = _
  var language: js.String = _
  var onstalled: js.Function1[Event, _] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var isContentEditable: js.Boolean = _
  var onratechange: js.Function1[Event, _] = _
  var contentEditable: js.String = _
  var tabIndex: js.Number = _
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var onplay: js.Function1[Event, _] = _
  var onplaying: js.Function1[Event, _] = _
  var isMultiLine: js.Boolean = _
  var onfocusout: js.Function1[FocusEvent, _] = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var hideFocus: js.Boolean = _
  var onreadystatechange: js.Function1[Event, _] = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, _] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var outerText: js.String = _
  var disabled: js.Boolean = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var accessKey: js.String = _
  var onselectstart: js.Function1[Event, _] = _
  var ontimeupdate: js.Function1[Event, _] = _
  var oncut: js.Function1[DragEvent, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var offsetWidth: js.Number = _
  var oncopy: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var canHaveChildren: js.Boolean = _
  var oninput: js.Function1[Event, _] = _
  def dragDrop(): js.Boolean = ???
  def scrollIntoView(top: js.Boolean): Unit = ???
  def scrollIntoView(): Unit = ???
  def addFilter(filter: Object): Unit = ???
  def setCapture(containerCapture: js.Boolean): Unit = ???
  def setCapture(): Unit = ???
  def focus(): Unit = ???
  def getAdjacentText(where: js.String): js.String = ???
  def insertAdjacentText(where: js.String, text: js.String): Unit = ???
  def getElementsByClassName(classNames: js.String): NodeList = ???
  def setActive(): Unit = ???
  def removeFilter(filter: Object): Unit = ???
  def blur(): Unit = ???
  def clearAttributes(): Unit = ???
  def releaseCapture(): Unit = ???
  def createControlRange(): ControlRangeCollection = ???
  def removeBehavior(cookie: js.Number): js.Boolean = ???
  def contains(child: HTMLElement): js.Boolean = ???
  def click(): Unit = ???
  def insertAdjacentElement(position: js.String, insertedElement: Element): Element = ???
  def mergeAttributes(source: HTMLElement, preserveIdentity: js.Boolean): Unit = ???
  def mergeAttributes(source: HTMLElement): Unit = ???
  def replaceAdjacentText(where: js.String, newText: js.String): js.String = ???
  def applyElement(apply: Element, where: js.String): Element = ???
  def applyElement(apply: Element): Element = ???
  def addBehavior(bstrUrl: js.String, factory: js.Any): js.Number = ???
  def addBehavior(bstrUrl: js.String): js.Number = ???
  def insertAdjacentHTML(where: js.String, html: js.String): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onmscontentzoom: js.Function1[js.Any, js.Any] = _
  var oncuechange: js.Function1[Event, _] = _
  var spellcheck: js.Boolean = _
  var classList: DOMTokenList = _
  var onmsmanipulationstatechanged: js.Function1[js.Any, js.Any] = _
  var draggable: js.Boolean = _
}


class HTMLHRElement extends HTMLElement {
  var width: js.Number = _
  var align: js.String = _
  var noShade: js.Boolean = _
}


class HTMLObjectElement extends HTMLElement with GetSVGDocument {
  var width: js.String = _
  var codeType: js.String = _
  var `object`: Object = _
  var form: HTMLFormElement = _
  var code: js.String = _
  var archive: js.String = _
  var standby: js.String = _
  var alt: js.String = _
  var classid: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var data: js.String = _
  var height: js.String = _
  var contentDocument: Document = _
  var altHtml: js.String = _
  var codeBase: js.String = _
  var declare: js.Boolean = _
  var `type`: js.String = _
  var BaseHref: js.String = _
  var validationMessage: js.String = _
  var validity: ValidityState = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}


class HTMLEmbedElement extends HTMLElement with GetSVGDocument {
  var width: js.String = _
  var palette: js.String = _
  var src: js.String = _
  var name: js.String = _
  var pluginspage: js.String = _
  var height: js.String = _
  var units: js.String = _
}


class HTMLOptGroupElement extends HTMLElement {
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var text: js.String = _
  var value: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
}


class HTMLIsIndexElement extends HTMLElement {
  var form: HTMLFormElement = _
  var action: js.String = _
  var prompt: js.String = _
}


class HTMLVideoElement extends HTMLMediaElement {
  var width: js.Number = _
  var videoWidth: js.Number = _
  var videoHeight: js.Number = _
  var height: js.Number = _
  var poster: js.String = _
  var msIsStereo3D: js.Boolean = _
  var msStereo3DPackingMode: js.String = _
  var onMSVideoOptimalLayoutChanged: js.Function1[js.Any, _] = _
  var onMSVideoFrameStepCompleted: js.Function1[js.Any, _] = _
  var msStereo3DRenderMode: js.String = _
  var msIsLayoutOptimalForPlayback: js.Boolean = _
  var msHorizontalMirror: js.Boolean = _
  var onMSVideoFormatChanged: js.Function1[js.Any, js.Any] = _
  var msZoom: js.Boolean = _
  def msInsertVideoEffect(activatableClassId: js.String, effectRequired: js.Boolean, config: js.Any): Unit = ???
  def msInsertVideoEffect(activatableClassId: js.String, effectRequired: js.Boolean): Unit = ???
  def msSetVideoRectangle(left: js.Number, top: js.Number, right: js.Number, bottom: js.Number): Unit = ???
  def msFrameStep(forward: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


class HTMLProgressElement extends HTMLElement {
  var value: js.Number = _
  var max: js.Number = _
  var position: js.Number = _
  var form: HTMLFormElement = _
}


class HTMLDataListElement extends HTMLElement {
  var options: HTMLCollection = _
}


class HTMLTrackElement extends HTMLElement {
  var kind: js.String = _
  var src: js.String = _
  var srclang: js.String = _
  var track: TextTrack = _
  var label: js.String = _
}

class HTMLMarqueeElement extends HTMLElement {
  var width: js.String = _
  var onbounce: js.Function1[Event, _] = _
  var vspace: js.Number = _
  var trueSpeed: js.Boolean = _
  var scrollAmount: js.Number = _
  var scrollDelay: js.Number = _
  var behavior: js.String = _
  var height: js.String = _
  var loop: js.Number = _
  var direction: js.String = _
  var hspace: js.Number = _
  var onstart: js.Function1[Event, _] = _
  var onfinish: js.Function1[Event, _] = _
  def stop(): Unit = ???
  def start(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

class HTMLSpanElement extends HTMLElement {
}


class HTMLHeadElement extends HTMLElement {
  var profile: js.String = _
}


class HTMLHeadingElement extends HTMLElement {
  var align: js.String = _
}


class HTMLFormElement extends HTMLElement {
  var length: js.Number = _
  var target: js.String = _
  var acceptCharset: js.String = _
  var enctype: js.String = _
  var elements: HTMLCollection = _
  var action: js.String = _
  var name: js.String = _
  var method: js.String = _
  var encoding: js.String = _
  def reset(): Unit = ???
  def item(name: js.Any, index: js.Any): js.Dynamic = ???
  def item(name: js.Any): js.Dynamic = ???
  def item(): js.Dynamic = ???
  def submit(): Unit = ???
  def namedItem(name: js.String): js.Dynamic = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???
  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???
  var autocomplete: js.String = _
  var noValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
}




