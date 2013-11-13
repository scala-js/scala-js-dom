package scala.scalajs
package js

trait HTMLTableElement extends HTMLElement with MSDataBindingTableExtensions with MSDataBindingExtensions {
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

object HTMLTableElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableElement),List())))) */
}

trait HTMLTableDataCellElement extends HTMLTableCellElement {
}

object HTMLTableDataCellElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableDataCellElement),List())))) */
}

trait HTMLBaseElement extends HTMLElement {
  var target: js.String = _
  var href: js.String = _
}

object HTMLBaseElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBaseElement),List())))) */
}

trait HTMLNextIdElement extends HTMLElement {
  var n: js.String = _
}

object HTMLNextIdElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLNextIdElement),List())))) */
}

trait HTMLParagraphElement extends HTMLElement {
  var align: js.String = _
}

object HTMLParagraphElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLParagraphElement),List())))) */
}

trait HTMLAreasCollection extends HTMLCollection {
  def remove(index: js.Number): Unit = ???
  def remove(): Unit = ???
  def add(element: HTMLElement, before: js.Any): Unit = ???
  def add(element: HTMLElement): Unit = ???
}

object HTMLAreasCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAreasCollection),List())))) */
}

trait HTMLAppletElement extends HTMLElement with MSDataBindingExtensions with MSDataBindingRecordSetExtensions {
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

object HTMLAppletElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAppletElement),List())))) */
}

trait HTMLOListElement extends HTMLElement {
  var start: js.Number = _
}

object HTMLOListElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOListElement),List())))) */
}

trait HTMLSelectElement extends HTMLElement with MSHTMLCollectionExtensions with MSDataBindingExtensions {
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

object HTMLSelectElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSelectElement),List())))) */
}

trait HTMLBlockElement extends HTMLElement {
  var width: js.Number = _
  var cite: js.String = _
}

object HTMLBlockElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBlockElement),List())))) */
}

trait HTMLMetaElement extends HTMLElement {
  var httpEquiv: js.String = _
  var name: js.String = _
  var content: js.String = _
  var url: js.String = _
  var scheme: js.String = _
  var charset: js.String = _
}

object HTMLMetaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMetaElement),List())))) */
}

trait HTMLDDElement extends HTMLElement {
  var noWrap: js.Boolean = _
}

object HTMLDDElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDDElement),List())))) */
}

trait HTMLLinkElement extends HTMLElement with LinkStyle {
  var rel: js.String = _
  var target: js.String = _
  var href: js.String = _
  var media: js.String = _
  var rev: js.String = _
  var `type`: js.String = _
  var charset: js.String = _
  var hreflang: js.String = _
}

object HTMLLinkElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLinkElement),List())))) */
}

trait HTMLFontElement extends HTMLElement {
  var face: js.String = _
}

object HTMLFontElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFontElement),List())))) */
}

trait HTMLTableCaptionElement extends HTMLElement {
  var align: js.String = _
  var vAlign: js.String = _
}

object HTMLTableCaptionElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableCaptionElement),List())))) */
}

trait HTMLOptionElement extends HTMLElement with MSDataBindingExtensions {
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var value: js.String = _
  var text: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
  def create(): HTMLOptionElement = ???
}

object HTMLOptionElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOptionElement),List())))) */
}

trait HTMLMapElement extends HTMLElement {
  var name: js.String = _
  var areas: HTMLAreasCollection = _
}

object HTMLMapElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMapElement),List())))) */
}

trait HTMLMenuElement extends HTMLElement {
  var `type`: js.String = _
}

object HTMLMenuElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMenuElement),List())))) */
}

trait HTMLCollection extends MSHTMLCollectionExtensions {
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

object HTMLCollection extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLCollection),List())))) */
}

trait HTMLImageElement extends HTMLElement with MSImageResourceExtensions with MSDataBindingExtensions with MSResourceMetadata {
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

object HTMLImageElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLImageElement),List())))) */
}

trait HTMLAreaElement extends HTMLElement {
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

object HTMLAreaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAreaElement),List())))) */
}

trait HTMLButtonElement extends HTMLElement with MSDataBindingExtensions {
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

object HTMLButtonElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLButtonElement),List())))) */
}

trait HTMLSourceElement extends HTMLElement {
  var src: js.String = _
  var media: js.String = _
  var `type`: js.String = _
}

object HTMLSourceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSourceElement),List())))) */
}

trait HTMLScriptElement extends HTMLElement {
  var defer: js.Boolean = _
  var text: js.String = _
  var src: js.String = _
  var htmlFor: js.String = _
  var charset: js.String = _
  var `type`: js.String = _
  var event: js.String = _
  var async: js.Boolean = _
}

object HTMLScriptElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLScriptElement),List())))) */
}

trait HTMLTableRowElement extends HTMLElement with HTMLTableAlignment {
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

object HTMLTableRowElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableRowElement),List())))) */
}

trait HTMLHtmlElement extends HTMLElement {
  var version: js.String = _
}

object HTMLHtmlElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHtmlElement),List())))) */
}

trait HTMLFrameElement extends HTMLElement with GetSVGDocument with MSDataBindingExtensions {
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

object HTMLFrameElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFrameElement),List())))) */
}

trait HTMLQuoteElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLQuoteElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLQuoteElement),List())))) */
}

trait HTMLTableHeaderCellElement extends HTMLTableCellElement {
}

object HTMLTableHeaderCellElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableHeaderCellElement),List())))) */
}

trait HTMLDListElement extends HTMLElement {
}

object HTMLDListElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDListElement),List())))) */
}

trait HTMLFrameSetElement extends HTMLElement {
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

object HTMLFrameSetElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFrameSetElement),List())))) */
}

trait HTMLLabelElement extends HTMLElement with MSDataBindingExtensions {
  var htmlFor: js.String = _
  var form: HTMLFormElement = _
}

object HTMLLabelElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLabelElement),List())))) */
}

trait HTMLLegendElement extends HTMLElement with MSDataBindingExtensions {
  var align: js.String = _
  var form: HTMLFormElement = _
}

object HTMLLegendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLegendElement),List())))) */
}

trait HTMLDirectoryElement extends HTMLElement {
}

object HTMLDirectoryElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDirectoryElement),List())))) */
}

trait HTMLLIElement extends HTMLElement {
  var value: js.Number = _
}

object HTMLLIElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLIElement),List())))) */
}

trait HTMLIFrameElement extends HTMLElement with GetSVGDocument with MSDataBindingExtensions {
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

object HTMLIFrameElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLIFrameElement),List())))) */
}

trait HTMLBodyElement extends HTMLElement {
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

object HTMLBodyElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBodyElement),List())))) */
}

trait HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment {
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

object HTMLTableSectionElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableSectionElement),List())))) */
}

trait HTMLInputElement extends HTMLElement with MSDataBindingExtensions {
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

object HTMLInputElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLInputElement),List())))) */
}

trait HTMLAnchorElement extends HTMLElement with MSDataBindingExtensions {
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

object HTMLAnchorElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAnchorElement),List())))) */
}

trait HTMLParamElement extends HTMLElement {
  var value: js.String = _
  var name: js.String = _
  var `type`: js.String = _
  var valueType: js.String = _
}

object HTMLParamElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLParamElement),List())))) */
}
trait HTMLPreElement extends HTMLElement {
  var width: js.Number = _
  var cite: js.String = _
}

object HTMLPreElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLPreElement),List())))) */
}

trait HTMLPhraseElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLPhraseElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLPhraseElement),List())))) */
}

trait HTMLCanvasElement extends HTMLElement {
  var width: js.Number = _
  var height: js.Number = _
  def toDataURL(`type`: js.String, args: js.Any*): js.String = ???
  def getContext(contextId: js.String, args: js.Any*): js.Dynamic = ???
  def msToBlob(): Blob = ???
}

object HTMLCanvasElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLCanvasElement),List())))) */
}

trait HTMLTitleElement extends HTMLElement {
  var text: js.String = _
}

object HTMLTitleElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTitleElement),List())))) */
}

trait HTMLStyleElement extends HTMLElement with LinkStyle {
  var media: js.String = _
  var `type`: js.String = _
}

object HTMLStyleElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLStyleElement),List())))) */
}

trait HTMLUnknownElement extends HTMLElement with MSDataBindingRecordSetReadonlyExtensions {
}

object HTMLUnknownElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLUnknownElement),List())))) */
}

trait HTMLAudioElement extends HTMLMediaElement {
}

object HTMLAudioElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAudioElement),List())))) */
}

trait HTMLTableCellElement extends HTMLElement with HTMLTableAlignment {
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

object HTMLTableCellElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableCellElement),List())))) */
}


trait HTMLBaseFontElement extends HTMLElement {
  var face: js.String = _
  var size: js.Number = _
}

object HTMLBaseFontElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBaseFontElement),List())))) */
}

trait HTMLTextAreaElement extends HTMLElement with MSDataBindingExtensions {
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

object HTMLTextAreaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTextAreaElement),List())))) */
}
trait HTMLModElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLModElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLModElement),List())))) */
}

trait HTMLTableColElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Any = _
  var align: js.String = _
  var span: js.Number = _
}

object HTMLTableColElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableColElement),List())))) */
}

trait HTMLTableAlignment extends js.Object {
  var ch: js.String = _
  var vAlign: js.String = _
  var chOff: js.String = _
}
trait HTMLUListElement extends HTMLElement {
}

object HTMLUListElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLUListElement),List())))) */
}

trait HTMLDivElement extends HTMLElement with MSDataBindingExtensions {
  var align: js.String = _
  var noWrap: js.Boolean = _
}

object HTMLDivElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDivElement),List())))) */
}

trait HTMLBRElement extends HTMLElement {
  var clear: js.String = _
}

object HTMLBRElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBRElement),List())))) */
}

trait HTMLMediaElement extends HTMLElement {
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

trait HTMLDTElement extends HTMLElement {
  var noWrap: js.Boolean = _
}

object HTMLDTElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDTElement),List())))) */
}

trait HTMLFieldSetElement extends HTMLElement {
  var align: js.String = _
  var form: HTMLFormElement = _
  var validationMessage: js.String = _
  var validity: ValidityState = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLFieldSetElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFieldSetElement),List())))) */
}

trait HTMLBGSoundElement extends HTMLElement {
  var balance: js.Any = _
  var volume: js.Any = _
  var src: js.String = _
  var loop: js.Number = _
}

object HTMLBGSoundElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBGSoundElement),List())))) */
}

trait HTMLElement extends Element with ElementCSSInlineStyle with MSEventAttachmentTarget with MSNodeExtensions {
  var onblur: js.Function1[FocusEvent, _] = _
  var onfocus: js.Function1[FocusEvent, _] = _
  var onmouseleave: js.Function1[MouseEvent, _] = _
  var onbeforecut: js.Function1[DragEvent, _] = _
  var onkeydown: js.Function1[KeyboardEvent, _] = _
  var onmove: js.Function1[MSEventObj, _] = _
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
  var ondatasetchanged: js.Function1[MSEventObj, js.Any] = _
  var onrowsdelete: js.Function1[MSEventObj, js.Any] = _
  var sourceIndex: js.Number = _
  var onloadstart: js.Function1[Event, _] = _
  var onlosecapture: js.Function1[MSEventObj, js.Any] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var oncontrolselect: js.Function1[MSEventObj, js.Any] = _
  var onsubmit: js.Function1[Event, _] = _
  var behaviorUrns: MSBehaviorUrnsCollection = _
  var scopeName: js.String = _
  var onchange: js.Function1[Event, _] = _
  var id: js.String = _
  var onlayoutcomplete: js.Function1[MSEventObj, js.Any] = _
  var uniqueID: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplaythrough: js.Function1[Event, _] = _
  var onbeforeupdate: js.Function1[MSEventObj, js.Any] = _
  var onfilterchange: js.Function1[MSEventObj, js.Any] = _
  var offsetParent: Element = _
  var ondatasetcomplete: js.Function1[MSEventObj, js.Any] = _
  var onsuspend: js.Function1[Event, _] = _
  var readyState: js.Any = _
  var onmouseenter: js.Function1[MouseEvent, js.Any] = _
  var innerText: js.String = _
  var onerrorupdate: js.Function1[MSEventObj, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var parentElement: HTMLElement = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, _] = _
  var oncellchange: js.Function1[MSEventObj, js.Any] = _
  var onrowexit: js.Function1[MSEventObj, js.Any] = _
  var onrowsinserted: js.Function1[MSEventObj, js.Any] = _
  var onpropertychange: js.Function1[MSEventObj, js.Any] = _
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
  var onresizestart: js.Function1[MSEventObj, js.Any] = _
  var offsetLeft: js.Number = _
  var isTextEdit: js.Boolean = _
  var isDisabled: js.Boolean = _
  var onpaste: js.Function1[DragEvent, js.Any] = _
  var canHaveHTML: js.Boolean = _
  var onmoveend: js.Function1[MSEventObj, js.Any] = _
  var language: js.String = _
  var onstalled: js.Function1[Event, _] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var style: MSStyleCSSProperties = _
  var isContentEditable: js.Boolean = _
  var onbeforeeditfocus: js.Function1[MSEventObj, js.Any] = _
  var onratechange: js.Function1[Event, _] = _
  var contentEditable: js.String = _
  var tabIndex: js.Number = _
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, _] = _
  var onafterupdate: js.Function1[MSEventObj, js.Any] = _
  var onplay: js.Function1[Event, _] = _
  var onresizeend: js.Function1[MSEventObj, js.Any] = _
  var onplaying: js.Function1[Event, _] = _
  var isMultiLine: js.Boolean = _
  var onfocusout: js.Function1[FocusEvent, _] = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var ondataavailable: js.Function1[MSEventObj, js.Any] = _
  var hideFocus: js.Boolean = _
  var onreadystatechange: js.Function1[Event, _] = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, _] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var outerText: js.String = _
  var disabled: js.Boolean = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var accessKey: js.String = _
  var onmovestart: js.Function1[MSEventObj, js.Any] = _
  var onselectstart: js.Function1[Event, _] = _
  var ontimeupdate: js.Function1[Event, _] = _
  var oncut: js.Function1[DragEvent, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var offsetWidth: js.Number = _
  var oncopy: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, _] = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var onrowenter: js.Function1[MSEventObj, js.Any] = _
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

object HTMLElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLElement),List())))) */
}

trait HTMLHRElement extends HTMLElement {
  var width: js.Number = _
  var align: js.String = _
  var noShade: js.Boolean = _
}

object HTMLHRElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHRElement),List())))) */
}

trait HTMLObjectElement extends HTMLElement with GetSVGDocument with MSDataBindingExtensions with MSDataBindingRecordSetExtensions {
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

object HTMLObjectElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLObjectElement),List())))) */
}

trait HTMLEmbedElement extends HTMLElement with GetSVGDocument {
  var width: js.String = _
  var palette: js.String = _
  var src: js.String = _
  var name: js.String = _
  var pluginspage: js.String = _
  var height: js.String = _
  var units: js.String = _
}

object HTMLEmbedElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLEmbedElement),List())))) */
}

trait HTMLOptGroupElement extends HTMLElement with MSDataBindingExtensions {
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var text: js.String = _
  var value: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
}

object HTMLOptGroupElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOptGroupElement),List())))) */
}

trait HTMLIsIndexElement extends HTMLElement {
  var form: HTMLFormElement = _
  var action: js.String = _
  var prompt: js.String = _
}

object HTMLIsIndexElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLIsIndexElement),List())))) */
}

trait HTMLVideoElement extends HTMLMediaElement {
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

object HTMLVideoElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLVideoElement),List())))) */
}

trait HTMLProgressElement extends HTMLElement {
  var value: js.Number = _
  var max: js.Number = _
  var position: js.Number = _
  var form: HTMLFormElement = _
}

object HTMLProgressElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLProgressElement),List())))) */
}

trait HTMLDataListElement extends HTMLElement {
  var options: HTMLCollection = _
}

object HTMLDataListElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDataListElement),List())))) */
}

trait HTMLTrackElement extends HTMLElement {
  var kind: js.String = _
  var src: js.String = _
  var srclang: js.String = _
  var track: TextTrack = _
  var label: js.String = _
}

object HTMLTrackElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTrackElement),List())))) */
}
trait HTMLMarqueeElement extends HTMLElement with MSDataBindingExtensions  {
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

object HTMLMarqueeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMarqueeElement),List())))) */
}


trait HTMLSpanElement extends HTMLElement with MSDataBindingExtensions {
}

object HTMLSpanElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSpanElement),List())))) */
}

trait HTMLHeadElement extends HTMLElement {
  var profile: js.String = _
}

object HTMLHeadElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHeadElement),List())))) */
}

trait HTMLHeadingElement extends HTMLElement {
  var align: js.String = _
}

object HTMLHeadingElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHeadingElement),List())))) */
}

trait HTMLFormElement extends HTMLElement with MSHTMLCollectionExtensions {
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

object HTMLFormElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFormElement),List())))) */
}



