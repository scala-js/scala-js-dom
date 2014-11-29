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

class HTMLDocument extends Document {

  /**
   * Returns the title of the current document.
   *
   * MDN
   */
  var title: String = js.native

  /**
   * Gets/sets the domain portion of the origin of the current document, as used by the
   * same origin policy.
   *
   * MDN
   */
  var domain: String = js.native

  /**
   * The Document.location property returns a Location object, which
   * contains information about the URL of the document and provides methods for
   * changing that URL and load another URL.
   *
   * MDN
   */
  var location: Location = js.native

  /**
   * Returns a string containing the URL of the current document.
   *
   * MDN
   */
  def URL: String = js.native

  /**
   * Returns the URI of the page that linked to this page.
   *
   * MDN
   */
  def referrer: String = js.native

  /**
   * Returns a semicolon-separated list of the cookies for that document or sets a
   * single cookie.
   *
   * MDN
   */
  var cookie: String = js.native

  /**
   * The Document.dir property is a DOMString representing the directionality of the
   * text of the document, whether left to right (default) or right to left. Possible
   * values are 'rtl', right to left, and 'ltr', left to right.
   *
   * MDN
   */
  var dir: String = js.native

  /**
   * Can be used to make any document editable, for example in a <iframe />:
   *
   * MDN
   */
  var designMode: String = js.native

  /**
   * Indicates whether the document is rendered in Quirks mode or Strict mode.
   *
   * MDN
   */
  def compatMode: String = js.native

  /**
   * Returns "loading" while the document is loading, "interactive" once it is
   * finished parsing but still loading sub-resources, and "complete" once it has
   * loaded.
   *
   * MDN
   */
  var readyState: String = js.native

  var uniqueID: String = js.native

  /**
   * fgColor gets/sets the foreground color, or text color, of the current document.
   *
   * MDN
   */
  @deprecated("Use the CSS style color instead.", "DOM Level 2")
  var fgColor: String = js.native

  /**
   * The default value for this property in Mozilla Firefox is white (#ffffff in
   * hexadecimal).
   *
   * MDN
   */
  @deprecated("Use the CSS style background-color instead.", "DOM Level 2")
  var bgColor: String = js.native

  /**
   * linkColor gets/sets the color of links within the document.
   *
   * MDN
   */
  @deprecated("Use the CSS style color with the pseudo-class :link instead.", "DOM Level 2")
  var linkColor: String = js.native

  /**
   * color is a string containing the name of the color (e.g., "blue", "darkblue", etc.)
   * or the hexadecimal value of the color (e.g., #0000FF)
   *
   * MDN
   */
  @deprecated("Use the CSS style color with the pseudo-class :active instead.", "DOM Level 2")
  var alinkColor: String = js.native

  @deprecated("Use the CSS style color with the pseudo-class :visited instead.", "DOM Level 2")
  var vlinkColor: String = js.native

  /**
   * In browsers returns the window object associated with the document or null if none
   * available.
   *
   * MDN
   */
  def defaultView: Window = js.native

  /**
   * Returns the <head> element of the current document. If there are more than one
   * <head> elements, the first one is returned.
   *
   * MDN
   */
  def head: HTMLHeadElement = js.native

  /**
   * Returns the <body> or <frameset> node of the current document, or null if no such
   * element exists.
   *
   * MDN
   */
  def body: HTMLElement = js.native

  /**
   * Returns the currently focused element, that is, the element that will get
   * keystroke events if the user types any. This attribute is read only.
   *
   * MDN
   */
  def activeElement: Element = js.native

  /**
   * Returns a list of the embedded <embed> elements within the current document.
   *
   * MDN
   */
  def embeds: HTMLCollection = js.native

  /**
   * forms returns a collection (an HTMLCollection) of the form elements within the
   * current document.
   *
   * MDN
   */
  def forms: HTMLCollection = js.native

  /**
   * The links property returns a collection of all AREA elements and anchor elements in
   * a document with a value for the href attribute.
   *
   * MDN
   */
  def links: HTMLCollection = js.native

  /**
   * anchors returns a list of all of the anchors in the document.
   *
   * MDN
   */
  def anchors: HTMLCollection = js.native

  /**
   * Returns an HTMLCollection object containing one or more HTMLEmbedElements or
   * null which represent the <embed> elements in the current document.
   *
   * MDN
   */
  def plugins: HTMLCollection = js.native

  /**
   * applets returns an ordered list of the applets within a document.
   *
   * MDN
   */
  def applets: HTMLCollection = js.native

  /**
   * document.images returns a collection of the images in the current HTML document.
   *
   * MDN
   */
  def images: HTMLCollection = js.native

  /**
   * Returns the current value of the current range for a formating command.
   *
   * MDN
   */
  def queryCommandValue(commandId: String): String = js.native

  /**
   * Returns true if the formating command is in an indeterminate state on the current
   * range.
   *
   * MDN
   */
  def queryCommandIndeterm(commandId: String): Boolean = js.native

  /**
   * This method never did anything but throw an exception, and was removed in Gecko 14.0
   * (Firefox 14.0 / Thunderbird 14.0 / SeaMonkey 2.11).
   *
   * MDN
   */
  def queryCommandText(commandId: String): String = js.native

  /**
   * Reports whether or not the specified editor query command is supported by the
   * browser.
   *
   * MDN
   */
  def queryCommandSupported(commandId: String): Boolean = js.native

  /**
   * Returns true if the formating command can be executed on the current range.
   *
   * MDN
   */
  def queryCommandEnabled(commandId: String): Boolean = js.native

  /**
   * Returns true if the formating command has been executed on the current range.
   *
   * MDN
   */
  def queryCommandState(commandId: String): Boolean = js.native

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
  def execCommand(commandId: String, showUI: Boolean = js.native, value: js.Any = js.native): Boolean = js.native

  /**
   * This method never did anything and always threw an exception, so it was removed in
   * Gecko 14.0 (Firefox 14.0 / Thunderbird 14.0 / SeaMonkey 2.11).
   *
   * MDN
   */
  def execCommandShowHelp(commandId: String): Boolean = js.native

  /**
   * Writes a string of text to a document stream opened by document.open().
   *
   * MDN
   */
  def write(content: String*): Unit = js.native

  /**
   * Writes a string of text followed by a newline character to a document.
   *
   * MDN
   */
  def writeln(content: String*): Unit = js.native

  /**
   * The document.open() method opens a document for writing.
   *
   * MDN
   */
  def open(url: String = js.native, name: String = js.native, features: String = js.native, replace: Boolean = js.native): js.Dynamic = js.native

  /**
   * The document.close() method finishes writing to a document, opened with
   * document.open().
   *
   * MDN
   */
  def close(): Unit = js.native

  def updateSettings(): Unit = js.native

  def fireEvent(eventName: String, eventObj: js.Any = js.native): Boolean = js.native

  def focus(): Unit = js.native

  /**
   * Returns a Boolean value indicating whether the document or any element inside the
   * document has focus. This method can be used to determine whether the active element
   * in a document has focus.
   *
   * MDN
   */
  def hasFocus(): Boolean = js.native

  /**
   * The DOM getSelection() method is available on the Window and Document interfaces.
   * See window.getSelection() for details.
   *
   * MDN
   */
  def getSelection(): Selection = js.native

  var onbeforeactivate: js.Function1[UIEvent, _] = js.native

  var onactivate: js.Function1[UIEvent, _] = js.native

  var onbeforedeactivate: js.Function1[UIEvent, _] = js.native

  var ondeactivate: js.Function1[UIEvent, _] = js.native

  var onloadstart: js.Function1[Event, _] = js.native

  var onload: js.Function1[Event, _] = js.native

  /**
   * The onchange property sets and returns the event handler for the change event.
   *
   * MDN
   */
  var onchange: js.Function1[Event, _] = js.native

  /**
   * Returns the event handling code for the readystatechange event.
   *
   * MDN
   */
  var onreadystatechange: js.Function1[Event, _] = js.native

  /**
   * The submit event is raised when the user clicks a submit button in a form
   *
   * MDN
   */
  var onsubmit: js.Function1[Event, _] = js.native

  var onfocus: js.Function1[FocusEvent, _] = js.native

  var onblur: js.Function1[FocusEvent, _] = js.native

  var onfocusin: js.Function1[FocusEvent, _] = js.native

  var onfocusout: js.Function1[FocusEvent, _] = js.native

  var onselect: js.Function1[UIEvent, _] = js.native

  var onselectstart: js.Function1[Event, _] = js.native

  var onselectionchange: js.Function1[Event, _] = js.native

  var oninput: js.Function1[Event, _] = js.native

    /**
   * The keydown event is raised when the user presses a keyboard key.
   *
   * MDN
   */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native

  /**
   * The keyup event is raised when the user releases a key that's been pressed.
   *
   * MDN
   */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native

  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /**
   * The onclick property returns the onClick event handler code on the current element.
   *
   * MDN
   */
  var onclick: js.Function1[MouseEvent, _] = js.native

  var ondblclick: js.Function1[MouseEvent, _] = js.native

  var onmouseup: js.Function1[MouseEvent, _] = js.native

  /**
   * The mouseover event is raised when the user moves the mouse over a
   * particular element.
   *
   * MDN
   */
  var onmouseover: js.Function1[MouseEvent, _] = js.native

  /**
   * The mousedown event is raised when the user presses the mouse button.
   *
   * MDN
   */
  var onmousedown: js.Function1[MouseEvent, _] = js.native

  var onmousemove: js.Function1[MouseEvent, _] = js.native

  /**
   * The mouseout event is raised when the mouse leaves an element (e.g, when the
   * mouse moves off of an image in the web page, the mouseout event is raised for
   * that image element).
   *
   * MDN
   */
  var onmouseout: js.Function1[MouseEvent, _] = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native

  var onscroll: js.Function1[UIEvent, _] = js.native

  /**
   * Called periodically throughout the drag and drop operation.
   *
   * MDN
   */
  var ondrag: js.Function1[DragEvent, _] = js.native

  /**
   * Called for an element when the mouse pointer first moves over the element
   * while something is being dragged. This might be used to change the
   * appearance of the element to indicate to the user that the object can be
   * dropped on it.
   *
   * MDN
   */
  var ondragenter: js.Function1[DragEvent, _] = js.native

  var ondragleave: js.Function1[DragEvent, _] = js.native

   /**
   * This event handler is called for an element when something is being dragged
   * over top of it. If the object can be dropped on the element, the drag
   * session should be notified.
   *
   * MDN
   */
  var ondragover: js.Function1[DragEvent, _] = js.native

  /**
   * An alias for ondraggesture; this is the HTML 5 spec name for the event and
   * may be used in HTML or XUL; however, for backward compatibility with older
   * versions of Firefox, you may wish to continue using ondraggesture in XUL.
   *
   * MDN
   */
  var ondragstart: js.Function1[DragEvent, _] = js.native

  /**
   * Called when the drag operation is finished.
   *
   * MDN
   */
  var ondragend: js.Function1[DragEvent, _] = js.native

  var ondrop: js.Function1[DragEvent, _] = js.native

  var onreset: js.Function1[Event, _] = js.native

  var onhelp: js.Function1[Event, _] = js.native

  var onseeked: js.Function1[Event, _] = js.native

  var onemptied: js.Function1[Event, _] = js.native

  var onseeking: js.Function1[Event, _] = js.native

  var oncanplay: js.Function1[Event, _] = js.native

  var ontimeupdate: js.Function1[Event, _] = js.native

  var onended: js.Function1[Event, _] = js.native

  var onsuspend: js.Function1[Event, _] = js.native

  var onpause: js.Function1[Event, _] = js.native

  var onwaiting: js.Function1[Event, _] = js.native

  var onstop: js.Function1[Event, _] = js.native

  var onstalled: js.Function1[Event, _] = js.native

  var onratechange: js.Function1[Event, _] = js.native

  var onvolumechange: js.Function1[Event, _] = js.native

  var onprogress: js.Function1[js.Any, _] = js.native

  var oncontextmenu: js.Function1[MouseEvent, _] = js.native

  var ondurationchange: js.Function1[Event, _] = js.native

  var onloadeddata: js.Function1[Event, _] = js.native

  var onloadedmetadata: js.Function1[Event, _] = js.native

  var onerror: js.Function1[Event, _] = js.native

  var onplay: js.Function1[Event, _] = js.native

  var onplaying: js.Function1[Event, _] = js.native

  var onabort: js.Function1[UIEvent, _] = js.native

  var oncanplaythrough: js.Function1[Event, _] = js.native

  var onstoragecommit: js.Function1[StorageEvent, _] = js.native
}

/**
 * The HTMLTableElement interface provides special properties and methods (beyond
 * the regular HTMLElement object interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of tables in an HTML
 * document.
 *
 * MDN
 */
class HTMLTableElement extends HTMLElement {
  /**
   * Is a DOMString containing the length in pixels or in percentage of the desired width
   * fo the entire table. It reflects the obsolete width attribute.
   *
   * MDN
   */
  var width: String = js.native

  /**
   * Is a DOMString containing the width in pixels of the horizontal and vertical
   * separation between cells. It reflects the obsolete cellspacing attribute.
   *
   * MDN
   */
  var cellSpacing: String = js.native
  /**
   * Is an HTMLTableSectionElement representing the first <tfoot> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <tfoot>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree immediately before the first
   * element that is neither a <caption>, a <colgroup>, nor a <thead>, or as the last
   * child if there is no such element, and the first <tfoot> that is a child of this
   * element is removed from the tree, if any.
   *
   * MDN
   */
  var tFoot: HTMLTableSectionElement = js.native
  /**
   * Is a DOMString containing the type of the external borders of the table. It reflects
   * the obsolete frame attribute and can take one of the following values: "void",
   * "above", "below", "hsides", "vsides", "lhs", "rhs", "box", or "border".
   *
   * MDN
   */
  var frame: String = js.native

  /**
   * Returns a live HTMLCollection containing all the rows of the element, that is all
   * <tr> that are a child of the element, or a child or one of its <thead>, <tbody> and
   * <tfoot> children. The rows members of a <thead> appear first, in tree order, and
   * those members of a <tbody> last, also in tree order. The HTMLCollection is live and
   * is automatically updated when the HTMLTableElement changes.
   *
   * MDN
   */
  var rows: HTMLCollection = js.native
  /**
   * Is a DOMString containing the type of the internal borders of the table. It reflects
   * the obsolete rules attribute and can take one of the following values: "none",
   * "groups", "rows", "cols", or "all".
   *
   * MDN
   */
  var rules: String = js.native
  /**
   * Is a DOMString containing a description of the purpose or the structure of the
   * table. It reflects the obsolete summary attribute.
   *
   * MDN
   */
  var summary: String = js.native
  /**
   * Is an HTMLTableCaptionElement representing the first <caption> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <caption>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree as the first child of this element
   * and the first <caption> that is a child of this element is removed from the tree, if
   * any.
   *
   * MDN
   */
  var caption: HTMLTableCaptionElement = js.native
  /**
   * Returns a live HTMLCollection containing all the <tbody> of the element. The
   * HTMLCollection is live and is automatically updated when the HTMLTableElement
   * changes.
   *
   * MDN
   */
  var tBodies: HTMLCollection = js.native
  /**
   * Is an HTMLTableSectionElement representing the first <thead> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <thead>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree immediately before the first
   * element that is neither a <caption>, nor a <colgroup>, or as the last child if there
   * is no such element, and the first <thead> that is a child of this element is removed
   * from the tree, if any.
   *
   * MDN
   */
  var tHead: HTMLTableSectionElement = js.native
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: String = js.native

  /**
   * Is a DOMString containing the width in pixels of the horizontal and vertical sapce
   * between cell content and cell borders. It reflects the obsolete cellpadding
   * attribute.
   *
   * MDN
   */
  var cellPadding: String = js.native
  /**
   * Is a DOMString containing the width in pixels of the border of the table. It reflects
   * the obsolete border attribute.
   *
   * MDN
   */
  var border: String = js.native
  /**
   * Removes the row corresponding to the index given in parameter. If the index value is
   * -1 the last row is removed; if it smaller than -1 or greater than the amount of rows in
   * the collection, a DOMException with the value IndexSizeError is raised.
   *
   * MDN
   */
  def deleteRow(index: Int = js.native): Unit = js.native

  def createTBody(): HTMLElement = js.native

  /**
   * Removes the first <caption> that is a child of the element.
   *
   * MDN
   */
  def deleteCaption(): Unit = js.native
  /**
   * Returns an HTMLElement representing a new row of the table. It inserts it in the rows
   * collection immediately before the <tr> element at the givent index position. If
   * necessary a <tbody> is created. If the index is -1, the new row is appended to the
   * collection. If the index is smaller than -1 or greater than the number of rows in the
   * collection, a DOMException with the value IndexSizeError is raised.
   *
   * MDN
   */
  def insertRow(index: Int = js.native): HTMLElement = js.native



  /**
   * Removes the first <tfoot> that is a child of the element.
   *
   * MDN
   */
  def deleteTFoot(): Unit = js.native

  /**
   * Returns an HTMLElement representing the first <thead> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree immediately
   * before the first element that is neither a <caption>, nor a <colgroup>, or as the
   * last child if there is no such element.
   *
   * MDN
   */
  def createTHead(): HTMLElement = js.native

  /**
   * Removes the first <thead> that is a child of the element.
   *
   * MDN
   */
  def deleteTHead(): Unit = js.native

  /**
   * Returns an HTMLElement representing the first <caption> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree as the first
   * child of the <table> element.
   *
   * MDN
   */
  def createCaption(): HTMLElement = js.native

  def moveRow(indexFrom: Int = js.native, indexTo: Int = js.native): Object = js.native

  /**
   * Returns an HTMLElement representing the first <tfoot> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree immediately
   * before the first element that is neither a <caption>, a <colgroup>, nor a <thead>,
   * or as the last child if there is no such element.
   *
   * MDN
   */
  def createTFoot(): HTMLElement = js.native
}

/**
 * The HTMLTableDataCellElement interface provides special properties and
 * methods (beyond the regular HTMLTableCellElement and HTMLElement interfaces it
 * also has available to it by inheritance) for manipulating the layout and
 * presentation of table data cells in an HTML document.
 *
 * MDN
 */
class HTMLTableDataCellElement extends HTMLTableCellElement {
}

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object
 * inherits all of the properties and methods as described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLBaseElement extends HTMLElement {
  /**
   * Is a DOMString that reflects the target HTML attribute, containing a default
   * target browsing context or frame for elements that do not have a target reference
   * specified.
   *
   * MDN
   */
  var target: String = js.native
  /**
   * Is a DOMString that reflects the href HTML attribute, containing a base URL for
   * relative URLs in the document.
   *
   * MDN
   */
  var href: String = js.native
}

trait HTMLNextIdElement extends HTMLElement {
  var n: String = js.native
}

/**
 * The HTMLParagraphElement interface provides special properties (beyond those
 * of the regular HTMLElement object interface it inherits) for manipulating <p>
 * elements.
 *
 * MDN
 */
class HTMLParagraphElement extends HTMLElement {
  /**
   * Enumerated property indicating alignment of the element's contents with respect
   * to the surrounding context. The possible values are "left", "right", "justify",
   * and "center".
   *
   * MDN
   */
  var align: String = js.native
}


trait HTMLAreasCollection extends HTMLCollection {
  def remove(index: Int = js.native): Unit = js.native

  def add(element: HTMLElement, before: js.Any = js.native): Unit = js.native
}

class HTMLAppletElement extends HTMLElement {
  var width: Double = js.native
  var codeType: String = js.native
  var `object`: String = js.native
  var form: HTMLFormElement = js.native
  var code: String = js.native
  var archive: String = js.native
  var alt: String = js.native
  var standby: String = js.native
  var classid: String = js.native
  var name: String = js.native
  var useMap: String = js.native
  var data: String = js.native
  var height: String = js.native
  var altHtml: String = js.native
  var contentDocument: Document = js.native
  var codeBase: String = js.native
  var declare: Boolean = js.native
  var `type`: String = js.native
  var BaseHref: String = js.native
}

/**
 * The HTMLOListElement interface provides special properties (beyond those
 * defined on the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating ordered list elements.
 *
 * MDN
 */
class HTMLOListElement extends HTMLElement {
  /**
   * Is a long value reflecting the start and defining the value of the first number of the
   * first element of the list.
   *
   * MDN
   */
  var start: Int= js.native
}

/**
 * DOM select elements share all of the properties and methods of other HTML elements
 * described in the element section. They also have the specialized interface
 * HTMLSelectElement (or HTML 4 HTMLSelectElement).
 *
 * MDN
 */
class HTMLSelectElement extends HTMLElement {
  /**
   * The set of <option> elements contained by this element. Read only.
   *
   * MDN
   */
  val options: HTMLSelectElement = js.native
  /**
   * The value of this form control, that is, of the first selected option.
   *
   * MDN
   */
  var value: String = js.native
  /**
   * The form that this element is associated with. If this element is a descendant of a
   * form element, then this attribute is the ID of that form element. If the element is
   * not a descendant of a form element, then: HTML5 The attribute can be the ID of any form
   * element in the same document. HTML 4 The attribute is null. Read only.
   *
   * MDN
   */
  val form: HTMLFormElement = js.native
  /**
   * Reflects the name HTML attribute, containing the name of this control used by
   * servers and DOM search functions.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Reflects the size HTML attribute, which contains the number of visible items in the
   * control. The default is 1, HTML5 unless multiple is true, in which case it is 4.
   *
   * MDN
   */
  var size: Int= js.native
  /**
   * The number of <option> elements in this select element.
   *
   * MDN
   */
  var length: Int = js.native
  /**
   * The index of the first selected <option> element.
   *
   * MDN
   */
  var selectedIndex: Int = js.native
  /**
   * Reflects the multiple HTML attribute, whichindicates whether multiple items can
   * be selected.
   *
   * MDN
   */
  var multiple: Boolean = js.native
  var `type`: String = js.native
  /**
   * Removes the element at the specified index from the options collection for this
   * select element.
   *
   * MDN
   */
  def remove(index: Int = js.native): Unit = js.native
  /**
   * Adds an element to the collection of option elements for this select element.
   *
   * MDN
   */
  def add(element: HTMLElement, before: js.Any = js.native): Unit = js.native

  def item(name: js.Any = js.native, index: js.Any = js.native): js.Dynamic = js.native

  def namedItem(name: String): js.Dynamic = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: String): js.Any = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This attribute is the empty string if the control is not a
   * candidate for constraint validation (willValidate is false), or it satisfies its
   * constraints. Read only. HTML5
   *
   * MDN
   */
  val validationMessage: String = js.native
  /**
   * Reflects the autofocus HTML attribute, which indicates whether the control
   * should have input focus when the page loads, unless the user overrides it, for
   * example by typing in a different control. Only one form-associated element in a
   * document can have this attribute specified. HTML5
   *
   * MDN
   */
  var autofocus: Boolean = js.native
  /**
   * The validity states that this control is in. Read only. HTML5
   *
   * MDN
   */
  val validity: ValidityState = js.native
  /**
   * Reflects the required HTML attribute, which indicates whether the user is
   * required to select a value before submitting the form. HTML5
   *
   * MDN
   */
  var required: Boolean = js.native
  /**
   * Indicates whether the button is a candidate for constraint validation. It is false
   * if any conditions bar it from constraint validation. Read only. HTML5
   *
   * MDN
   */
  val willValidate: Boolean = js.native

  def checkValidity(): Boolean = js.native

  def setCustomValidity(error: String): Unit = js.native
}

trait HTMLBlockElement extends HTMLElement {
  var width: Double = js.native
  var cite: String = js.native
}

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document.
 * Itt inherits all of the properties and methods described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLMetaElement extends HTMLElement {
  /**
   * Gets or sets the name of an HTTP response header to define for a document.
   *
   * MDN
   */
  var httpEquiv: String = js.native
  /**
   * Gets or sets the name of a meta-data property to define for a document.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Gets or sets the value of meta-data property.
   *
   * MDN
   */
  var content: String = js.native
  var url: String = js.native
  /**
   * Gets or sets the name of a scheme used to interpret the value of a meta-data property.
   *
   * MDN
   */
  var scheme: String = js.native
  var charset: String = js.native
}

class HTMLDDElement extends HTMLElement {
  var noWrap: Boolean = js.native
}

/**
 * The HTMLLinkElement interface represents reference information for external
 * resources and the relationship of those resources to a document and vice-versa.
 * This object inherits all of the properties and methods of the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLLinkElement extends HTMLElement with LinkStyle {
  /**
   * Gets or sets the forward relationship of the linked resource from the document to
   * the resource.
   *
   * MDN
   */
  var rel: String = js.native
  /**
   * Gets or sets the name of the target frame to which the resource applies.
   *
   * MDN
   */
  var target: String = js.native
  /**
   * Gets or sets the URI for the target resource.
   *
   * MDN
   */
  var href: String = js.native
  /**
   * Gets or sets a list of one or more media formats to which the resource applies.
   *
   * MDN
   */
  var media: String = js.native
  /**
   * Gets or sets the reverse relationship of the linked resource from the resource to
   * the document.
   *
   * MDN
   */
  var rev: String = js.native
  var `type`: String = js.native
  /**
   * Gets or sets the character encoding for the target resource.
   *
   * MDN
   */
  var charset: String = js.native
  /**
   * Gets or sets the language code for the linked resource.
   *
   * MDN
   */
  var hreflang: String = js.native
}

class HTMLFontElement extends HTMLElement {
  var face: String = js.native
}

/**
 * The HTMLTableCaptionElement interface special properties (beyond the regular
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating table caption elements.
 *
 * MDN
 */
class HTMLTableCaptionElement extends HTMLElement {
  /**
   * Enumerated attribute indicating alignment of the caption with respect to the
   * table.
   *
   * MDN
   */
  var align: String = js.native
  var vAlign: String = js.native
}

/**
 * The HTMLOptionElement interface represents <option> elements and inherits all
 * classes and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLOptionElement extends HTMLElement {
  /**
   * The position of the option within the list of options it belongs to, in tree-order.
   * If the option is not part of a list of options, like when it is part of the <datalist>
   * element, the value is 0.
   *
   * MDN
   */
  var index: Int = js.native
  /**
   * Contains the initial value of the selected HTML attribute, indicating whether the
   * option is selected by default or not.
   *
   * MDN
   */
  var defaultSelected: Boolean = js.native
  /**
   * Reflects the value of the value HTML attribute, if it exists; otherwise reflects
   * value of the Node.textContent property.
   *
   * MDN
   */
  var value: String = js.native
  /**
   * Contains the text content of the element.
   *
   * MDN
   */
  var text: String = js.native
  /**
   * If the option is a descendent of a <select> element, then this property has the same
   * value as the form property of the corresponding HTMLSelectElement object;
   * otherwise, it is null.
   *
   * MDN
   */
  var form: HTMLFormElement = js.native
  /**
   * Reflects the value of the label HTML attribute, which provides a label for the
   * option. If this attribute isn't specifically set, reading it returns the
   * element's text content.
   *
   * MDN
   */
  var label: String = js.native
  /**
   * Indicates whether the option is currently selected.
   *
   * MDN
   */
  var selected: Boolean = js.native

  def create(): HTMLOptionElement = js.native
}

/**
 * The HTMLMapElement interface provides special properties and methods (beyond
 * those of the regular object HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of map elements.
 *
 * MDN
 */
class HTMLMapElement extends HTMLElement {
  /**
   * Is a DOMString representing the <map> element for referencing it other context. If
   * the id attribute is set, this must have the same value; and it cannot be null or empty.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Is a live HTMLCollection representing the <area> elements associated to this
   * <map>.
   *
   * MDN
   */
  var areas: HTMLAreasCollection = js.native
}

class HTMLMenuElement extends HTMLElement {
  var `type`: String = js.native
}

/**
 * HTMLCollection is an interface representing a generic collection of elements (in
 * document order) and offers methods and properties for traversing the list.
 *
 * MDN
 */
class HTMLCollection extends DOMList[Element]{

  /**
   * Returns the specific node at the given zero-based index into the list. Returns null
   * if the index is out of range.
   *
   * MDN
   */
  def item(nameOrIndex: js.Any = js.native, optionalIndex: js.Any = js.native): Element = js.native


  /**
   * Returns the specific node whose ID or, as a fallback, name matches the string
   * specified by name. Matching by name is only done as a last resort, only in HTML, and
   * only if the referenced element supports the name attribute. Returns null if no node
   * exists by the given name.
   *
   * MDN
   */
  def namedItem(name: String): Element = js.native

}

/**
 * The HTMLImageElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of <img> elements.
 *
 * MDN
 */
class HTMLImageElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, indicating the rendered width of the image in
   * CSS pixels.
   *
   * MDN
   */
  var width: Int = js.native
  var vspace: Int = js.native
  /**
   * Intrinsic height of the image in CSS pixels, if it is available; otherwise, 0.
   *
   * MDN
   */
  var naturalHeight: Int = js.native
  /**
   * Reflects the alt HTML attribute, indicating fallback context for the image.
   *
   * MDN
   */
  var alt: String = js.native
  /**
   * Indicates the alignment of the image with respect to the surrounding context.
   *
   * MDN
   */
  var align: String = js.native
  /**
   * Reflects the src HTML attribute, containing the URL of the image.
   *
   * MDN
   */
  var src: String = js.native
  /**
   * Reflects the usemap HTML attribute, containing a partial URL of a map element.
   *
   * MDN
   */
  var useMap: String = js.native
  /**
   * Intrinsic width of the image in CSS pixels, if it is available; otherwise, 0.
   *
   * MDN
   */
  var naturalWidth: Int = js.native
  var name: String = js.native
  /**
   * Reflects the height HTML attribute, indicating the rendered height of the image in
   * CSS pixels.
   *
   * MDN
   */
  var height: Int = js.native
  /**
   * Width of the border around the image.
   *
   * MDN
   */
  var border: String = js.native
  /**
   * Space to the left and right of the image.
   *
   * MDN
   */
  var hspace: Int = js.native
  /**
   * URI of a long description of the image.
   *
   * MDN
   */
  var longDesc: String = js.native
  var href: String = js.native
  /**
   * Reflects the ismap HTML attribute, indicating that the image is part of a
   * server-side image map.
   *
   * MDN
   */
  var isMap: Boolean = js.native
  /**
   * True if the browser has fetched the image, and it is in a supported image type that was
   * decoded without errors.
   *
   * MDN
   */
  var complete: Boolean = js.native

  def create(): HTMLImageElement = js.native

}

/**
 * The HTMLAreaElement interface provides special properties and methods (beyond
 * those of the regular object HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of area elements.
 *
 * MDN
 */
class HTMLAreaElement extends HTMLElement {
  /**
   * Is a DOMString containing the protocol component (including trailing colon ':'),
   * of the referenced URL.
   *
   * MDN
   */
  var protocol: String = js.native
  /**
   * Is a DOMString containing tThe search element (including leading question mark
   * '?'), if any, of the referenced URL.
   *
   * MDN
   */
  var search: String = js.native
  /**
   * Is a DOMString that reflects the alt HTML attribute, containing alternative text
   * for the element.
   *
   * MDN
   */
  var alt: String = js.native
  /**
   * Is a DOMString that reflects the coords HTML attribute, containing coordinates to
   * define the hot-spot region.
   *
   * MDN
   */
  var coords: String = js.native
  /**
   * Is a DOMString containing the hostname in the referenced URL.
   *
   * MDN
   */
  var hostname: String = js.native
  /**
   * Is a DOMString containing the port component, if any, of the referenced URL.
   *
   * MDN
   */
  var port: String = js.native
  /**
   * Is a DOMString containing the path name component, if any, of the referenced URL.
   *
   * MDN
   */
  var pathname: String = js.native
  /**
   * Is a DOMString containing the hostname and port (if it's not the default port) in the
   * referenced URL.
   *
   * MDN
   */
  var host: String = js.native
  /**
   * Is a DOMString containing the fragment identifier (including the leading hash
   * mark (#)), if any, in the referenced URL.
   *
   * MDN
   */
  var hash: String = js.native
  /**
   * Is a DOMString that reflects the target HTML attribute, indicating the browsing
   * context in which to open the linked resource.
   *
   * MDN
   */
  var target: String = js.native
  /**
   * Is a DOMString containing that reflects the href HTML attribute, containing a
   * valid URL of a linked resource.
   *
   * MDN
   */
  var href: String = js.native
  /**
   * Is a Boolean flag indicating if the area is inactive (true) or active (false).
   *
   * MDN
   */
  var noHref: Boolean = js.native
  /**
   * Is a DOMString teflects the shape HTML attribute, indicating the shape of the
   * hot-spot, limited to known values.
   *
   * MDN
   */
  var shape: String = js.native

}

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the
 * <button> object interface it also has available to them by inheritance) for
 * manipulating the layout and presentation of button elements.
 *
 * MDN
 */
class HTMLButtonElement extends HTMLElement {
  /**
   * The current form control value of the button.
   *
   * MDN
   */
  var value: String = js.native
  var status: js.Any = js.native
  /**
   * The form that this button is associated with. If the button is a descendant of a form
   * element, then this attribute is the ID of that form element. If the button is not a
   * descendant of a form element, then the attribute can be the ID of any form element in
   * the same document it is related to, or the null value if none matches.
   *
   * MDN
   */
  var form: HTMLFormElement = js.native
  /**
   * The name of the object when submitted with a form. HTML5 If specified, it must not be
   * the empty string.
   *
   * MDN
   */
  var name: String = js.native
  var `type`: String = js.native
  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This attribute is the empty string if the control is not a
   * candidate for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: String = js.native
  /**
   * A name or keyword indicating where to display the response that is received after
   * submitting the form. If specified, this attribute overrides the target attribute
   * of the <form> element that owns this element.
   *
   * MDN
   */
  var formTarget: String = js.native
  /**
   * Indicates whether the button is a candidate for constraint validation. It is false
   * if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: Boolean = js.native
  /**
   * The URI of a resource that processes information submitted by the button. If
   * specified, this attribute overrides the action attribute of the <form> element
   * that owns this element.
   *
   * MDN
   */
  var formAction: String = js.native
  /**
   * The control should have input focus when the page loads, unless the user overrides
   * it, for example by typing in a different control. Only one form-associated element
   * in a document can have this attribute specified.
   *
   * MDN
   */
  var autofocus: Boolean = js.native
  /**
   * The validity states that this button is in.
   *
   * MDN
   */
  var validity: ValidityState = js.native
  /**
   * Indicates that the form is not to be validated when it is submitted. If specified,
   * this attribute overrides the enctype attribute of the <form> element that owns
   * this element.
   *
   * MDN
   */
  var formNoValidate: String = js.native
  var formEnctype: String = js.native
  /**
   * The HTTP method that the browser uses to submit the form. If specified, this
   * attribute overrides the method attribute of the <form> element that owns this
   * element.
   *
   * MDN
   */
  var formMethod: String = js.native

  def checkValidity(): Boolean = js.native

  def setCustomValidity(error: String): Unit = js.native
}

/**
 * The HTMLSourceElement interface provides special properties (beyond the
 * regular HTMLElement object interface it also has available to it by inheritance)
 * for manipulating <source> elements.
 *
 * MDN
 */
class HTMLSourceElement extends HTMLElement {
  /**
   * Reflects the src HTML attribute, containing the URL for the media resource.
   *
   * MDN
   */
  var src: String = js.native
  /**
   * Reflects the media HTML attribute, containing the intended type of the media
   * resource.
   *
   * MDN
   */
  var media: String = js.native
  var `type`: String = js.native
}

/**
 * DOM Script objects expose the HTMLScriptElement (or HTML 4 HTMLScriptElement)
 * interface, which provides special properties and methods (beyond the regular
 * element object interface they also have available to them by inheritance) for
 * manipulating the layout and presentation of <script> elements.
 *
 * MDN
 */
class HTMLScriptElement extends HTMLElement {
  var defer: Boolean = js.native
  /**
   * The IDL attribute text must return a concatenation of the contents of all the Text
   * nodes that are children of the <script> element (ignoring any other nodes such as
   * comments or elements), in tree order. On setting, it must act the same way as the
   * textContent IDL attribute. Note: When inserted using the document.write()
   * method, <script> elements execute (typically synchronously), but when inserted
   * using innerHTML and outerHTML attributes, they do not execute at all.
   *
   * MDN
   */
  var text: String = js.native
  /**
   * Represents gives the address of the external script resource to use. It reflects
   * the src attribute.
   *
   * MDN
   */
  var src: String = js.native
  var htmlFor: String = js.native
  /**
   * Represents the character encoding of the external script resource. It reflects
   * the charset attribute.
   *
   * MDN
   */
  var charset: String = js.native
  var `type`: String = js.native
  var event: String = js.native
  /**
   * The async and defer attributes are boolean attributes that indicate how the script
   * should be executed. The defer and async attributes must not be specified if the src
   * attribute is not present. There are three possible modes that can be selected using
   * these attributes. If the async attribute is present, then the script will be
   * executed asynchronously, as soon as it is available. If the async attribute is not
   * present but the defer attribute is present, then the script is executed when the
   * page has finished parsing. If neither attribute is present, then the script is
   * fetched and executed immediately, before the user agent continues parsing the
   * page. Note: The exact processing details for these attributes are, for mostly
   * historical reasons, somewhat non-trivial, involving a number of aspects of HTML.
   * The implementation requirements are therefore by necessity scattered
   * throughout the specification. These algorithms describe the core of this
   * processing, but these algorithms reference and are referenced by the parsing
   * rules for <script> start and end tags in HTML, in foreign content, and in XML, the
   * rules for the document.write() method, the handling of scripting, etc. The defer
   * attribute may be specified even if the async attribute is specified, to cause
   * legacy Web browsers that only support defer (and not async) to fall back to the defer
   * behavior instead of the synchronous blocking behavior that is the default.
   *
   * MDN
   */
  var async: Boolean = js.native
}

/**
 * The HTMLTableRowElement interface provides special properties and methods
 * (beyond the HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of rows in an HTML table.
 *
 * MDN
 */
class HTMLTableRowElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Returns a long value which gives the logical position of the row within the entire
   * table. If the row is not part of a table, returns -1.
   *
   * MDN
   */
  var rowIndex: Int = js.native
  /**
   * Returns a live HTMLCollection containing the cells in the row. The HTMLCollection
   * is live and is automatically updated when cells are added or removed.
   *
   * MDN
   */
  var cells: HTMLCollection = js.native
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: String = js.native
  var borderColorLight: js.Any = js.native
  /**
   * Returns a long value which gives the logical position of the row within the table
   * section it belongs to. If the row is not part of a section, returns -1.
   *
   * MDN
   */
  var sectionRowIndex: Int = js.native
  var borderColor: js.Any = js.native
  var height: js.Any = js.native
  var borderColorDark: js.Any = js.native
  /**
   * Removes the cell at the given position in the row. If the given position is greater
   * (or equal as it starts at zero) than the amount of cells in the row, or is smaller than
   * 0, it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def deleteCell(index: Int = js.native): Unit = js.native
  /**
   * Inserts a new cell just before the given position in the row. If the given position is
   * not given or is -1, it appends the cell to the row. If the given position is greater (or
   * equal as it starts at zero) than the amount of cells in the row, or is smaller than -1,
   * it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def insertCell(index: Int = js.native): HTMLElement = js.native
}

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. 
 * This object inherits the properties and methods described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLHtmlElement extends HTMLElement {
  /**
   * Version of the HTML Document Type Definition (DTD) that governs this document.
   * This property should not be used any more as it is non-conforming. Simply omit it.
   *
   * MDN
   */
  var version: String = js.native
}

class HTMLFrameElement extends HTMLElement with GetSVGDocument {
  var width: js.Any = js.native
  var scrolling: String = js.native
  var marginHeight: String = js.native
  var marginWidth: String = js.native
  var borderColor: js.Any = js.native
  var frameSpacing: js.Any = js.native
  var frameBorder: String = js.native
  var noResize: Boolean = js.native
  var contentWindow: Window = js.native
  var src: String = js.native
  var name: String = js.native
  var height: js.Any = js.native
  var contentDocument: Document = js.native
  var border: String = js.native
  var longDesc: String = js.native
  var onload: js.Function1[Event, _] = js.native
  var security: js.Any = js.native


}

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating quoting elements, like <blockquote> and <q>, but not the <cite>
 * element.
 *
 * MDN
 */
class HTMLQuoteElement extends HTMLElement {
  var dateTime: String = js.native
  /**
   * Reflects the cite HTML attribute, containing a URL for the source of the quotation.
   *
   * MDN
   */
  var cite: String = js.native
}

/**
 * The HTMLTableHeaderCellElement interface provides special properties and
 * methods (beyond the regular HTMLTableCellElement and HTMLElement interfaces it
 * also has available to it by inheritance) for manipulating the layout and
 * presentation of table header cells in an HTML document.
 *
 * MDN
 */
class HTMLTableHeaderCellElement extends HTMLTableCellElement {
}

/**
 * The HTMLDListElement interface provides special properties (beyond those of the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating definition list elements.
 *
 * MDN
 */
class HTMLDListElement extends HTMLElement {
}

class HTMLFrameSetElement extends HTMLElement {
  var ononline: js.Function1[Event, _] = js.native
  var borderColor: js.Any = js.native
  var rows: String = js.native
  var cols: String = js.native
  var frameSpacing: js.Any = js.native
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var onerror: js.Function1[Event, _] = js.native
  var frameBorder: String = js.native
  var onresize: js.Function1[UIEvent, _] = js.native
  var name: String = js.native
  var onafterprint: js.Function1[Event, _] = js.native
  var onbeforeprint: js.Function1[Event, _] = js.native
  var onoffline: js.Function1[Event, _] = js.native
  var border: String = js.native
  var onunload: js.Function1[Event, _] = js.native
  var onhashchange: js.Function1[HashChangeEvent, _] = js.native
  var onload: js.Function1[Event, _] = js.native
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var onstorage: js.Function1[StorageEvent, _] = js.native


}

/**
 * The HTMLLabelElement interface gives access to properties specific to <label>
 * elements. It inherits from HTMLElement.
 *
 * MDN
 */
class HTMLLabelElement extends HTMLElement {
  /**
   * The ID of the labeled control. Reflects the for attribute.
   *
   * MDN
   */
  var htmlFor: String = js.native

  def form: HTMLFormElement = js.native
}

/**
 * The HTMLLegendElement is an interface allowing to access properties of the
 * <legend> elements. It inherits properties and methods from the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLLegendElement extends HTMLElement {
  var align: String = js.native

  def form: HTMLFormElement = js.native
}

class HTMLDirectoryElement extends HTMLElement {
}

/**
 * The HTMLLIElement interface expose specific properties and methods (beyond
 * those defined by regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating list elements.
 *
 * MDN
 */
class HTMLLIElement extends HTMLElement {
  /**
   * Indicates the ordinal position of the list element inside a given <ol>. It reflects
   * the value attribute of the HTML <li> element, and can be smaller than 0. If the <li>
   * element is not a child of an <ol> element, the property has no meaning.
   *
   * MDN
   */
  var value: Int = js.native
}

/**
 * The HTMLIFrameElement interface provides special properties and methods
 * (beyond those of the HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of inline frame
 * elements.
 *
 * MDN
 */
class HTMLIFrameElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, indicating the width of the frame.
   *
   * MDN
   */
  var width: String = js.native


  /**
   * The window proxy for the nested browsing context.
   *
   * MDN
   */
  var contentWindow: Window = js.native

  /**
   * Reflects the src HTML attribute, containing the address of the content to be
   * embedded.
   *
   * MDN
   */
  var src: String = js.native
  /**
   * Reflects the name HTML attribute, containing a name by which to refer to the frame.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Reflects the height HTML attribute, indicating the height of the frame.
   *
   * MDN
   */
  var height: String = js.native
  var border: String = js.native
  /**
   * The active document in the inline frame's nested browsing context.
   *
   * MDN
   */
  var contentDocument: Document = js.native

  /**
   * URI of a long description of the frame.
   *
   * MDN
   */
  var longDesc: String = js.native
  var security: js.Any = js.native
  var onload: js.Function1[Event, _] = js.native


  /**
   * Reflects the sandbox HTML attribute, indicating extra restrictions on the
   * behavior of the nested content.
   *
   * MDN
   */
  var sandbox: DOMSettableTokenList = js.native
}

/**
 * The HTMLBodyElement interface provides special properties (beyond those of the
 * regular HTMLElement interface they also inherit) for manipulating body
 * elements.
 *
 * MDN
 */
class HTMLBodyElement extends HTMLElement {
  var scroll: String = js.native
  /**
   * Reflects the ononline HTML attribute value for a function to call when network
   * communication is restored.
   *
   * MDN
   */
  var ononline: js.Function1[Event, _] = js.native

  /**
   * Reflects the onmessage HTML attribute value for a function to call when the
   * document receives a message.
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var text: js.Any = js.native
  /**
   * Exposes the window.onerror event handler to call when the document fails to load
   * properly. Note: This handler is triggered when the event reaches the window, not
   * the body element. Use addEventListener() to attach an event listener to the body
   * element.
   *
   * MDN
   */
  var onerror: js.Function1[Event, _] = js.native

  /**
   * Reflects the onresize HTML attribute value for a function to call when the
   * document has been resized.
   *
   * MDN
   */
  var onresize: js.Function1[UIEvent, _] = js.native
  var link: js.Any = js.native
  var aLink: js.Any = js.native

  /**
   * Reflects the onafterprint HTML attribute value for a function to call after the
   * user has printed the document.
   *
   * MDN
   */
  var onafterprint: js.Function1[Event, _] = js.native
  var vLink: js.Any = js.native
  /**
   * Reflects the onbeforeprint HTML attribute value for a function to call when the
   * user has requested printing the document.
   *
   * MDN
   */
  var onbeforeprint: js.Function1[Event, _] = js.native
  /**
   * Reflects the onoffline HTML attribute value for a function to call when network
   * communication fails.
   *
   * MDN
   */
  var onoffline: js.Function1[Event, _] = js.native
  /**
   * Reflects the onunload HTML attribute value for a function to call when when the
   * document is going away.
   *
   * MDN
   */
  var onunload: js.Function1[Event, _] = js.native
  /**
   * Reflects the onhashchange HTML attribute value for a function to call when the
   * fragment identifier in the address of the document changes.
   *
   * MDN
   */
  var onhashchange: js.Function1[Event, _] = js.native
  /**
   * Exposes the window.onload event handler to call when the window gains focus. Note:
   * This handler is triggered when the event reaches the window, not the body element.
   * Use addEventListener() to attach an event listener to the body element.
   *
   * MDN
   */
  var onload: js.Function1[Event, _] = js.native
  var rightMargin: js.Any = js.native
  /**
   * Reflects the onbeforeunload HTML attribute value for a function to call when the
   * document is about to be unloaded.
   *
   * MDN
   */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var leftMargin: js.Any = js.native
  /**
   * Reflects the onpopstate HTML attribute value for a function to call when the
   * storage area has changed.
   *
   * MDN
   */
  var onstorage: js.Function1[StorageEvent, _] = js.native


  /**
   * Reflects the onpopstate HTML attribute value for a function to call when the user
   * has navigated session history.
   *
   * MDN
   */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native
}

/**
 * The HTMLTableSectionElement interface provides special properties and methods
 * (beyond the HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of sections, that is headers, footers
 * and bodies, in an HTML table.
 *
 * MDN
 */
class HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: String = js.native
  /**
   * Returns a live HTMLCollection containing the rows in the section. The
   * HTMLCollection is live and is automatically updated when rows are added or
   * removed.
   *
   * MDN
   */
  var rows: HTMLCollection = js.native
  /**
   * Removes the cell at the given position in the section. If the given position is
   * greater (or equal as it starts at zero) than the amount of rows in the section, or is
   * smaller than 0, it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def deleteRow(index: Int = js.native): Unit = js.native

  def moveRow(indexFrom: Int = js.native, indexTo: Int = js.native): Object = js.native


  def insertRow(index: Int = js.native): HTMLElement = js.native

}

/**
 * The HTMLInputElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of input elements.
 *
 * MDN
 */
class HTMLInputElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, which defines the width of the image displayed
   * for the button, if the value of type is image.
   *
   * MDN
   */
  var width: String = js.native
  var status: Boolean = js.native

  /**
   * The containing form element, if this element is in a form. If this element is not
   * contained in a form element: HTML5 this can be the id attribute of any <form> element
   * in the same document. Even if the attribute is set on <input>, this property will be
   * null, if it isn't the id of a <form> element. HTML 4 this must be null.
   *
   * MDN
   */
  def form: HTMLFormElement = js.native

  /**
   * The index of the beginning of selected text.
   *
   * MDN
   */
  var selectionStart: Int = js.native
  /**
   * Indicates that a checkbox is neither on nor off.
   *
   * MDN
   */
  var indeterminate: Boolean = js.native
  /**
   * Reflects the readonly HTML attribute, indicating that the user cannot modify the
   * value of the control. HTML5This is ignored if the value of the type attribute is
   * hidden, range, color, checkbox, radio, file, or a button type.
   *
   * MDN
   */
  var readOnly: Boolean = js.native
  /**
   * Reflects the size HTML attribute, containing size of the control. This value is in
   * pixels unless the value of type is text or password, in which case, it is an integer
   * number of characters. HTML5 Applies only when type is set to text, search, tel, url,
   * email, or password; otherwise it is ignored.
   *
   * MDN
   */
  var size: Int = js.native

  /**
   * The index of the end of selected text.
   *
   * MDN
   */
  var selectionEnd: Int = js.native

  /**
   * Reflects the accept HTML attribute, containing comma-separated list of file
   * types accepted by the server when type is file.
   *
   * MDN
   */
  var accept: String = js.native
  /**
   * Reflects the alt HTML attribute, containing alternative text to use when type is
   * image.
   *
   * MDN
   */
  var alt: String = js.native
  /**
   * The default state of a radio button or checkbox as originally specified in HTML that
   * created this object.
   *
   * MDN
   */
  var defaultChecked: Boolean = js.native
  /**
   * Current value in the control.
   *
   * MDN
   */
  var value: String = js.native
  /**
   * Reflects the src HTML attribute, which specifies a URI for the location of an image
   * to display on the graphical submit button, if the value of type is image; otherwise
   * it is ignored.
   *
   * MDN
   */
  var src: String = js.native
  /**
   * Reflects the name HTML attribute, containing a name that identifies the element
   * when submitting the form.
   *
   * MDN
   */
  var name: String = js.native

  /**
   * Reflects the height HTML attribute, which defines the height of the image
   * displayed for the button, if the value of type is image.
   *
   * MDN
   */
  var height: String = js.native


  /**
   * The current state of the element when type is checkbox or radio.
   *
   * MDN
   */
  var checked: Boolean = js.native

  /**
   * Reflects the maxlength HTML attribute, containing the maximum length of text (in
   * Unicode code points) that the value can be changed to. The constraint is evaluated
   * only when the value is changed Note: If you set maxLength to a negative value
   * programmatically, an exception will be thrown.
   *
   * MDN
   */
  var maxLength: Int = js.native
  /**
   * Reflects the type HTML attribute, indicating the type of control to display.
   * See type attribute of <input> for possible values.
   */
  var `type`: String = js.native
  /**
   * The default value as originally specified in HTML that created this object.
   *
   * MDN
   */
  var defaultValue: String = js.native

  /**
   * Selects a range of text in the element (but does not focus it). The optional
   * selectionDirection parameter may be "forward" or "backward" to establish the
   * direction in which selection was set, or "none" if the direction is unknown or not
   * relevant. The default is "none". Specifying a selectionDirection parameter sets
   * the value of the selectionDirection property.
   *
   * MDN
   */
  def setSelectionRange(start: Int, end: Int): Unit = js.native

  /**
   * Selects the input text in the element, and focuses it so the user can subsequently
   * replace the whole entry.
   *
   * MDN
   */
  def select(): Unit = js.native

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willvalidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: String = js.native
  var files: FileList = js.native
  /**
   * Reflects the max HTML attribute, containing the maximum (numeric or date-time)
   * value for this item, which must not be less than its minimum (min attribute) value.
   *
   * MDN
   */
  var max: String = js.native
  /**
   * Reflects the formtarget HTML attribute, containing a name or keyword indicating
   * where to display the response that is received after submitting the form. If
   * specified, this attribute overrides the target attribute of the <form> element
   * that owns this element.
   *
   * MDN
   */
  var formTarget: String = js.native
  /**
   * Indicates whether the element is a candidate for constraint validation. It is
   * false if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: Boolean = js.native
  /**
   * Reflects the step HTML attribute, which works with min and max to limit the
   * increments at which a numeric or date-time value can be set. It can be the string any
   * or a positive floating point number. If this is not set to any, the control accepts
   * only values at multiples of the step value greater than the minimum.
   *
   * MDN
   */
  var step: String = js.native
  /**
   * Reflects the autofocus HTML attribute, which specifies that a form control
   * should have input focus when the page loads, unless the user overrides it, for
   * example by typing in a different control. Only one form element in a document can
   * have the autofocus attribute. It cannot be applied if the type attribute is set to
   * hidden (that is, you cannot automatically set focus to a hidden control).
   *
   * MDN
   */
  var autofocus: Boolean = js.native
  /**
   * Reflects the required HTML attribute, indicating that the user must fill in a
   * value before submitting a form.
   *
   * MDN
   */
  var required: Boolean = js.native
  /**
   * Reflects the formenctype HTML attribute, containing the type of content that
   * is used to submit the form to the server. If specified, this attribute
   * overrides the enctype attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formEnctype: String = js.native
  /**
   * The value of the element, interpreted as one of the following in order: a time value a
   * number null if conversion is not possible
   *
   * MDN
   */
  var valueAsNumber: Int = js.native
  /**
   * Reflects the placeholder HTML attribute, containing a hint to the user of what can
   * be entered in the control. The placeholder text must not contain carriage returns
   * or line-feeds. This attribute applies when the value of the type attribute is text,
   * search, tel, url or email; otherwise it is ignored.
   *
   * MDN
   */
  var placeholder: String = js.native
  /**
   * Reflects the formmethod HTML attribute, containing the HTTP method that the
   * browser uses to submit the form. If specified, this attribute overrides the method
   * attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formMethod: String = js.native
  /**
   * Identifies a list of pre-defined options to suggest to the user. The value must be
   * the id of a <datalist> element in the same document. The browser displays only
   * options that are valid values for this input element. This attribute is ignored
   * when the type attribute's value is hidden, checkbox, radio, file, or a button type.
   *
   * MDN
   */
  var list: HTMLElement = js.native
  /**
   * Reflects the autocomplete HTML attribute, indicating whether the value of the
   * control can be automatically completed by the browser. Ignored if the value of the
   * type attribute is hidden, checkbox, radio, file, or a button type (button, submit,
   * reset, image). Possible values are: off: The user must explicitly enter a value
   * into this field for every use, or the document provides its own auto-completion
   * method; the browser does not automatically complete the entry. on: The browser can
   * automatically complete the value based on values that the user has entered during
   * previous uses.
   *
   * MDN
   */
  var autocomplete: String = js.native
  /**
   * Reflects the min HTML attribute, containing the minimum (numeric or date-time)
   * value for this item, which must not be greater than its maximum (max attribute)
   * value.
   *
   * MDN
   */
  var min: String = js.native
  /**
   * Reflects the formaction HTML attribute, containing the URI of a program that
   * processes information submitted by the element. If specified, this attribute
   * overrides the action attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formAction: String = js.native
  /**
   * Reflects the pattern HTML attribute, containing a regular expression that the
   * control's value is checked against. The pattern must match the entire value, not
   * just some subset. Use the title attribute to describe the pattern to help the user.
   * This attribute applies when the value of the type attribute is text, search, tel,
   * url or email; otherwise it is ignored.
   *
   * MDN
   */
  var pattern: String = js.native
  /**
   * The validity state that this element is in. 
   *
   * MDN
   */
  var validity: ValidityState = js.native
  /**
   * Reflects the formnovalidate HTML attribute, indicating that the form is not to
   * be validated when it is submitted. If specified, this attribute overrides the
   * novalidate attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formNoValidate: String = js.native
  /**
   * Reflects the multiple HTML attribute, indicating whether more than one value is
   * possible (e.g., multiple files).
   *
   * MDN
   */
  var multiple: Boolean = js.native

  /**
   * Returns false if the element is a candidate for constraint validation, and it does
   * not satisfy its constraints. In this case, it also fires an invalid event at the
   * element. It returns true if the element is not a candidate for constraint
   * validation, or if it satisfies its constraints.
   *
   * MDN
   */
  def checkValidity(): Boolean = js.native
  /**
   * Decrements the value by (step * n), where n defaults to 1 if not specified. Throws an
   * INVALID_STATE_ERR exception: if the method is not applicable to for the current
   * type value. if the element has no step value. if the value cannot be converted to a
   * number. if the resulting value is above the max or below the min. 
   *
   * MDN
   */
  def stepDown(n: Int = js.native): Unit = js.native

  /**
   * Increments the value by (step * n), where n defaults to 1 if not specified. Throws an
   * INVALID_STATE_ERR exception: if the method is not applicable to for the current
   * type value. if the element has no step value. if the value cannot be converted to a
   * number. if the resulting value is above the max or below the min.
   *
   * MDN
   */
  def stepUp(n: Int = js.native): Unit = js.native

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: String): Unit = js.native
}

/**
 * The HTMLAnchorElement interface represents hyperlink elements and provides
 * special properties and methods (beyond those of the regular HTMLElement object
 * interface they also have available to them by inheritance) for manipulating the
 * layout and presentation of such elements.
 *
 * MDN
 */
class HTMLAnchorElement extends HTMLElement {
  /**
   * Is a DOMString that reflects the rel HTML attribute, specifying the relationship
   * of the target object to the link object.
   *
   * MDN
   */
  var rel: String = js.native
  /**
   * Is a DOMString representing the protocol component, including trailing colon
   * (':'), of the referenced URL.
   *
   * MDN
   */
  var protocol: String = js.native
  /**
   * Is a DOMString representing tThe search element, including leading question mark
   * ('?'), if any, of the referenced URL.
   *
   * MDN
   */
  var search: String = js.native
  /**
   * Is a DOMString representing a comma-separated list of coordinates.
   *
   * MDN
   */
  var coords: String = js.native
  /**
   * Is a DOMString representing the hostname in the referenced URL.
   *
   * MDN
   */
  var hostname: String = js.native
  /**
   * Is a DOMString representing the path name component, if any, of the referenced URL.
   *
   * MDN
   */
  var pathname: String = js.native

  /**
   * Is a DOMString that reflects the target HTML attribute, indicating where to
   * display the linked resource.
   *
   * MDN
   */
  var target: String = js.native

  /**
   * Is a DOMString that reflects the href HTML attribute, containing a valid URL of a
   * linked resource.
   *
   * MDN
   */
  var href: String = js.native
  /**
   * Is a DOMString representing the anchor name.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Is a DOMString representing the character encoding of the linked resource.
   *
   * MDN
   */
  var charset: String = js.native
  /**
   * Is a DOMString that reflects the hreflang HTML attribute, indicating the language
   * of the linked resource.
   *
   * MDN
   */
  var hreflang: String = js.native
  /**
   * Is a DOMString representing the port component, if any, of the referenced URL.
   *
   * MDN
   */
  var port: String = js.native
  /**
   * Is a DOMString representing the hostname and port (if it's not the default port) in
   * the referenced URL.
   *
   * MDN
   */
  var host: String = js.native
  /**
   * Is a DOMString representing the fragment identifier, including the leading hash
   * mark ('#'), if any, in the referenced URL.
   *
   * MDN
   */
  var hash: String = js.native

  /**
   * Is a DOMString representing that the rev HTML attribute, specifying the
   * relationship of the link object to the target object.
   *
   * MDN
   */
  var rev: String = js.native
  /**
   * Is a DOMString representing the shape of the active area.
   *
   * MDN
   */
  var shape: String = js.native
  var `type`: String = js.native
  var mimeType: String = js.native

  /**
   * Is a DOMString being a synonym for the Node.textContent property.
   *
   * MDN
   */
  var text: String = js.native
}

/**
 * The HTMLParamElement interface provides special properties (beyond those of the
 * regular HTMLElement object interface it inherits) for manipulating <param>
 * elements, representing a pair of a key and a value that acts as a parameter for an
 * <object> element.
 *
 * MDN
 */
class HTMLParamElement extends HTMLElement {
  /**
   * Is a DOMString representing the value associated to the parameter. It reflects the
   * value attribute.
   *
   * MDN
   */
  var value: String = js.native
  /**
   * Is a DOMString representing the name of the parameter. It reflects the name
   * attribute.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Is a DOMString that reflects the type HTML attribute, indicating the MIME
   * type of the linked resource
   *
   * MDN
   */
  var `type`: String = js.native
  /**
   * Is a DOMString containing the type of the value. It reflects the valuetype
   * attribute and has one of the values: "data", "ref", or "object".
   *
   * MDN
   */
  var valueType: String = js.native
}

/**
 * The HTMLPreElement interface expose specific properties and methods (beyond
 * those defined by regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating block of preformatted text.
 *
 * MDN
 */
class HTMLPreElement extends HTMLElement {
  /**
   * Is a long value reflecting the obsolete width attribute, containing a fixed-size
   * length for the <pre> element.
   *
   * MDN
   */
  var width: Int = js.native
}


class HTMLPhraseElement extends HTMLElement {
  var dateTime: String = js.native
}


/**
 * The HTMLCanvasElement interface provides properties and methods for
 * manipulating the layout and presentation of canvas elements. The
 * HTMLCanvasElement interface also inherits the properties and methods of the
 * HTMLElement interface.
 *
 * MDN
 */
class HTMLCanvasElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, specifying the width of the coordinate space in
   * CSS pixels.
   *
   * MDN
   */
  var width: Int = js.native
  /**
   * Reflects the height HTML attribute, specifying the height of the coordinate space
   * in CSS pixels.
   *
   * MDN
   */
  var height: Int = js.native

  /**
   * Returns a data: URL containing a representation of the image in the format
   * specified by type (defaults to PNG). The returned image is 96dpi. If the height or
   * width of the canvas is 0, "data:," representing the empty string, is returned. If
   * the type requested is not image/png, and the returned value starts with
   * data:image/png, then the requested type is not supported. Chrome supports the
   * image/webp type. If the requested type is image/jpeg or image/webp, then the
   * second argument, if it is between 0.0 and 1.0, is treated as indicating image
   * quality; if the second argument is anything else, the default value for image
   * quality is used. Other arguments are ignored.
   *
   * MDN
   */
  def toDataURL(`type`: String, args: js.Any*): String = js.native

  /**
   * Returns a drawing context on the canvas, or null if the context ID is not supported. A
   * drawing context lets you draw on the canvas. Calling getContext with "2d" returns a
   * CanvasRenderingContext2D object, whereas calling it with
   * "experimental-webgl" (or "webgl") returns a WebGLRenderingContext object.
   * This context is only available on browsers that implement WebGL.
   *
   * MDN
   */
  def getContext(contextId: String, args: js.Any*): js.Dynamic = js.native
}


/**
 * The HTMLTitleElement interface contains the title for a document. This element
 * inherits all of the properties and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLTitleElement extends HTMLElement {
  /**
   * DOMString representing the text of the document's title.
   *
   * MDN
   */
  var text: String = js.native
}


/**
 * The HTMLStyleElement interface represents a <style> element. It inherits
 * properties and methods from its parent, HTMLElement, and from LinkStyle.
 *
 * MDN
 */
class HTMLStyleElement extends HTMLElement with LinkStyle {
  /**
   * Is a DOMString representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  var media: String = js.native
  /**
   * Returns the type of the current style.
   *
   * MDN
   */
  var `type`: String = js.native
}


/**
 * The HTMLUnknownElement interface represents an invalid HTML element and derives
 * from the HTMLElement interface, but without implementing any additional
 * properties or methods.
 *
 * MDN
 */
class HTMLUnknownElement extends HTMLElement {
}


/**
 * The HTMLAudioElement interface provides access to the properties of <audio>
 * elements, as well as methods to manipulate them. It derives from the
 * HTMLMediaElement interface.
 *
 * MDN
 */
class HTMLAudioElement extends HTMLMediaElement {
}


/**
 * The HTMLTableCellElement interface provides special properties and methods
 * (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of table cells, either
 * header or data cells, in an HTML document.
 *
 * MDN
 */
class HTMLTableCellElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Is a DOMString containing a length of pixel of the hinted width of the cell. It
   * reflects the obsolete width attribute.
   *
   * MDN
   */
  var width: Int = js.native
  /**
   * Is a DOMSettableTokenList describing a list of id of <th> elements that represents
   * headers associated with the cell. It reflects the headers attribute.
   *
   * MDN
   */
  var headers: String = js.native
  /**
   * Is a long representing the cell position in the cells collection of the <tr> it
   * belongs to. If the cell doesn't belong to a <tr>, it returns -1.
   *
   * MDN
   */
  var cellIndex: Int = js.native
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: String = js.native

  /**
   * Is an unsigned long that represents the number of columns this cell must span. It
   * reflects the colspan attribute.
   *
   * MDN
   */
  var colSpan: Int = js.native

  /**
   * Is a DOMString containing a name grouping cells in virtual. It reflects the
   * obsolete axis attribute.
   *
   * MDN
   */
  var axis: String = js.native
  /**
   * Is a DOMString containing a length of pixel of the hinted height of the cell. It
   * reflects the obsolete height attribute.
   *
   * MDN
   */
  var height: js.Any = js.native
  /**
   * Is a Boolean value reflecting the nowrap attribute and indicating if cell content
   * can be broken in several lines.
   *
   * MDN
   */
  var noWrap: Boolean = js.native

  /**
   * Is an unsigned long that represents the number of rows this cell must span. It
   * reflects the rowspan attribute.
   *
   * MDN
   */
  var rowSpan: Int = js.native


}


/**
 * The HTMLBaseFontElement interface provides special properties (beyond the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating <basefont> elements.
 *
 * MDN
 */
class HTMLBaseFontElement extends HTMLElement {
  /**
   * Is a DOMString representing a list of one or more font names. The document text in the
   * default style is rendered in the first font face that the client's browser
   * supports. If no font listed is installed on the local system, the browser typically
   * defaults to the proportional or fixed-width font for that system.
   *
   * MDN
   */
  var face: String = js.native
  /**
   * Is a DOMString representing the font size as either a numeric or relative value.
   * Numeric values range from 1 to 7 with 1 being the smallest and 3 the default. Relative
   * value starts with a '+' or a '-'.
   *
   * MDN
   */
  var size: Int = js.native
}


/**
 * The HTMLTextAreaElement interface, which provides special properties and
 * methods (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <textarea>
 * elements.
 *
 * MDN
 */
class HTMLTextAreaElement extends HTMLElement {
  /**
   * The raw value contained in the control.
   *
   * MDN
   */
  var value: String = js.native
  var status: js.Any = js.native
  /**
   * The containing form element, if this element is in a form. If this element is not
   * contained in a form element, it can be the id attribute of any <form> element in the
   * same document or the value null.
   *
   * MDN
   */
  var form: HTMLFormElement = js.native
  /**
   * Reflects name HTML attribute, containing the name of the control.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * The index of the beginning of selected text. If no text is selected, contains the
   * index of the character that follows the input cursor. On being set, the control
   * behaves as if setSelectionRange() had been called with this as the first argument,
   * and selectionEnd as the second argument.
   *
   * MDN
   */
  var selectionStart: Int = js.native
  /**
   * Reflects the rows HTML attribute, indicating the number of visible text lines for
   * the control.
   *
   * MDN
   */
  var rows: Int = js.native
  /**
   * Reflects the cols HTML attribute, indicating the visible width of the text area.
   *
   * MDN
   */
  var cols: Int = js.native
  /**
   * Reflects the readonly HTML attribute, indicating that the user cannot modify the
   * value of the control.
   *
   * MDN
   */
  var readOnly: Boolean = js.native
  /**
   * Reflects the wrap HTML attribute, indicating how the control wraps text.
   *
   * MDN
   */
  var wrap: String = js.native
  /**
   * The index of the end of selected text. If no text is selected, contains the index of
   * the character that follows the input cursor. On being set, the control behaves as if
   * setSelectionRange() had been called with this as the second argument, and
   * selectionStart as the first argument.
   *
   * MDN
   */
  var selectionEnd: Int = js.native

  /**
   * The string textarea.
   */
  def `type`: String = js.native

  /**
   * The control's default value, which behaves like the element.textContent
   * property.
   *
   * MDN
   */
  var defaultValue: String = js.native

  /**
   * Selects a range of text, and sets selectionStart and selectionEnd. If either
   * argument is greater than the length of the value, it is treated as pointing to the end
   * of the value. If end is less than start, then both are treated as the value of end.
   *
   * MDN
   */
  def setSelectionRange(start: Int, end: Int): Unit = js.native

  /**
   * Selects the contents of the control.
   *
   * MDN
   */
  def select(): Unit = js.native

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: String = js.native
  /**
   * Reflects the autofocus HTML attribute, indicating that the control should have
   * input focus when the page loads
   *
   * MDN
   */
  var autofocus: Boolean = js.native
  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  var validity: ValidityState = js.native
  /**
   * Reflects the required HTML attribute, indicating that the user must specify a
   * value before submitting the form.
   *
   * MDN
   */
  var required: Boolean = js.native
  /**
   * Reflects the maxlength HTML attribute, indicating the maximum number of
   * characters the user can enter. This constraint is evaluated only when the value
   * changes.
   *
   * MDN
   */
  var maxLength: Int = js.native
  /**
   * Indicates whether the element is a candidate for constraint validation. It is
   * false if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: Boolean = js.native
  /**
   * Reflects the placeholder HTML attribute, containing a hint to the user about what
   * to enter in the control.
   *
   * MDN
   */
  var placeholder: String = js.native

  /**
   * Returns false if the button is a candidate for constraint validation, and it does
   * not satisfy its constraints. In this case, it also fires an invalid event at the
   * control. It returns true if the control is not a candidate for constraint
   * validation, or if it satisfies its constraints.
   *
   * MDN
   */
  def checkValidity(): Boolean = js.native

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: String): Unit = js.native
}

/**
 * The HTMLModElement interface provides special properties (beyond the regular
 * methods and properties available through the HTMLElement interface they also
 * have available to them by inheritance) for manipulating modification elements,
 * that is <del> and <ins>.
 *
 * MDN
 */
class HTMLModElement extends HTMLElement {
  var dateTime: String = js.native
  /**
   * Reflects the cite HTML attribute, containing a URI of a resource explaining the
   * change.
   *
   * MDN
   */
  var cite: String = js.native
}


/**
 * The HTMLTableColElement interface provides special properties (beyond the
 * HTMLElement interface it also has available to it inheritance) for manipulating
 * single or grouped table column elements.
 *
 * MDN
 */
class HTMLTableColElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Any = js.native
  /**
   * Indicates the horizontal alignment of the cell data in the column.
   *
   * MDN
   */
  var align: String = js.native
  /**
   * Reflects the span HTML attribute, indicating the number of columns to apply this
   * object's attributes to. Must be a positive integer.
   *
   * MDN
   */
  var span: Int = js.native
}


trait HTMLTableAlignment extends js.Object {
  var ch: String = js.native
  var vAlign: String = js.native
  var chOff: String = js.native
}

/**
 * The HTMLUListElement interface provides special properties (beyond those
 * defined on the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating unordered list elements.
 *
 * MDN
 */
class HTMLUListElement extends HTMLElement {
}


/**
 * The HTMLDivElement interface provides special properties (beyond the regular
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating div elements.
 *
 * MDN
 */
class HTMLDivElement extends HTMLElement {
  /**
   * Enumerated property indicating alignment of the element's contents with respect
   * to the surrounding context. The possible values are "left", "right", "justify",
   * and "center".
   *
   * MDN
   */
  var align: String = js.native

}


/**
 * The HTMLBRElement interface represents a HTML line break element (<br>). It
 * inherits from HTMLElement.
 *
 * MDN
 */
class HTMLBRElement extends HTMLElement {
  /**
   * Indicates flow of text around floating objects.
   *
   * MDN
   */
  var clear: String = js.native
}


/**
 * The HTMLMediaElement interface has special properties and methods (beyond the
 * properties and methods available for all children of HTMLElement), that are
 * common to all media-related objects.
 *
 * MDN
 */
class HTMLMediaElement extends HTMLElement {
  /**
   * The initial playback position in seconds.
   *
   * MDN
   */
  var initialTime: Double = js.native
  /**
   * The ranges of the media source that the browser has played, if any.
   *
   * MDN
   */
  var played: TimeRanges = js.native
  /**
   * The absolute URL of the chosen media resource (if, for example, the server selects a
   * media file based on the resolution of the user's display), or an empty string if the
   * networkState is EMPTY.
   *
   * MDN
   */
  var currentSrc: String = js.native

  /**
   * Reflects the loop HTML attribute, indicating whether the media element should
   * start over when it reaches the end.
   *
   * MDN
   */
  var loop: Boolean = js.native
  /**
   * Indicates whether the media element has ended playback.
   *
   * MDN
   */
  var ended: Boolean = js.native
  /**
   * The ranges of the media source that the browser has buffered (if any) at the moment
   * the buffered property is accessed. The returned TimeRanges object is normalized.
   *
   * MDN
   */
  var buffered: TimeRanges = js.native
  /**
   * The MediaError object for the most recent error, or null if there has not been an
   * error.
   *
   * MDN
   */
  var error: MediaError = js.native
  /**
   * The time ranges that the user is able to seek to, if any.
   *
   * MDN
   */
  var seekable: TimeRanges = js.native
  /**
   * Reflects the autoplay HTML attribute, indicating whether playback should
   * automatically begin as soon as enough media is available to do so without
   * interruption.
   *
   * MDN
   */
  var autoplay: Boolean = js.native
  /**
   * Reflects the controls HTML attribute, indicating whether user interface items
   * for controlling the resource should be displayed.
   *
   * MDN
   */
  var controls: Boolean = js.native
  /**
   * The audio volume, from 0.0 (silent) to 1.0 (loudest).
   *
   * MDN
   */
  var volume: Double = js.native
  /**
   * Reflects the src HTML attribute, containing the URL of a media resource to use.
   * Gecko implements a similar functionality is available for streams:
   * mozSrcObject.
   *
   * MDN
   */
  var src: String = js.native
  /**
   * The current rate at which the media is being played back. This is used to implement
   * user controls for fast forward, slow motion, and so forth. The normal playback rate
   * is multiplied by this value to obtain the current rate, so a value of 1.0 indicates
   * normal speed. If the playbackRate is negative, the media is played backwards. The
   * audio is muted when the media plays backwards or if the fast forward or slow motion is
   * outside a useful range (E.g. Gecko mute the sound outside the range 0.25 and 5.0).
   * The pitch of the audio is corrected by default and is the same for every speed. Some
   * navigators implement the non-standard preservespitch property to control this.
   *
   * MDN
   */
  var playbackRate: Double = js.native
  /**
   * The length of the media in seconds, or zero if no media data is available.  If the
   * media data is available but the length is unknown, this value is NaN.  If the media is
   * streamed and has no predefined length, the value is Inf.
   *
   * MDN
   */
  var duration: Double = js.native
  /**
   * true if the audio is muted, and false otherwise.
   *
   * MDN
   */
  var muted: Boolean = js.native
  /**
   * The default playback rate for the media. 1.0 is "normal speed," values lower than
   * 1.0 make the media play slower than normal, higher values make it play faster. The
   * value 0.0 is invalid and throws a NOT_SUPPORTED_ERR exception.
   *
   * MDN
   */
  var defaultPlaybackRate: Double = js.native
  /**
   * Indicates whether the media element is paused.
   *
   * MDN
   */
  var paused: Boolean = js.native
  /**
   * Indicates whether the media is in the process of seeking to a new position.
   *
   * MDN
   */
  var seeking: Boolean = js.native
  /**
   * The current playback time, in seconds. Setting this value seeks the media to the new
   * time.
   *
   * MDN
   */
  var currentTime: Double = js.native
  /**
   * Reflects the preload HTML attribute, indicating what data should be preloaded, if
   * any. Possible values are: none, metadata, auto. See preload attribute
   * documentation for details.
   *
   * MDN
   */
  var preload: String = js.native
  /**
   * The current state of fetching the media over the network. Constant Value
   * Description NETWORK_EMPTY 0 There is no data yet.  The readyState is also
   * HAVE_NOTHING. NETWORK_IDLE 1   NETWORK_LOADING 2 The media is loading.
   * NETWORK_NO_SOURCE[1] 3  
   *
   * MDN
   */
  var networkState: Int = js.native

  def pause(): Unit = js.native

  /**
   * Begins playback of the media. If you have changed the src attribute of the media
   * element since the page was loaded, you must call load() before play(), otherwise
   * the original media plays again.
   *
   * MDN
   */
  def play(): Unit = js.native

  /**
   * Begins loading the media content from the server.
   *
   * MDN
   */
  def load(): Unit = js.native

  /**
   * Determines whether the specified media type can be played back.
   *
   * MDN
   */
  def canPlayType(`type`: String): String = js.native

  /**
   * Represents the list of TextTrack objects contained in the element.
   *
   * MDN
   */
  var textTracks: TextTrackList = js.native
  /**
   * Represents the list of AudioTrack objects contained in the element.
   *
   * MDN
   */
  var audioTracks: AudioTrackList = js.native
}

object HTMLMediaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMediaElement),List())))) */
  /**
   * Enough of the media resource has been retrieved that the metadata attributes are
   * initialized.  Seeking will no longer raise an exception.
   *
   * MDN
   */
  val HAVE_METADATA: Int = js.native
  /**
   * Data is available for the current playback position, but not enough to actually
   * play more than one frame.
   *
   * MDN
   */
  val HAVE_CURRENT_DATA: Int = js.native
  /**
   * No information is available about the media resource.
   *
   * MDN
   */
  val HAVE_NOTHING: Int = js.native
  val NETWORK_NO_SOURCE: Int = js.native
  /**
   * Enough data is available—and the download rate is high enough—that the media can be
   * played through to the end without interruption.
   *
   * MDN
   */
  val HAVE_ENOUGH_DATA: Int = js.native
  /**
   * There is no data yet.  The readyState is also HAVE_NOTHING.
   *
   * MDN
   */
  val NETWORK_EMPTY: Int = js.native
  val NETWORK_LOADING: Int = js.native
  val NETWORK_IDLE: Int = js.native
  /**
   * Data for the current playback position as well as for at least a little bit of time
   * into the future is available (in other words, at least two frames of video, for
   * example).
   *
   * MDN
   */
  val HAVE_FUTURE_DATA: Int = js.native
}

class HTMLDTElement extends HTMLElement {
  var noWrap: Boolean = js.native
}


/**
 * The HTMLFieldSetElement interface special properties and methods (beyond the
 * regular HTMLelement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of field-set elements.
 *
 * MDN
 */
class HTMLFieldSetElement extends HTMLElement {
  var align: String = js.native

  /**
   * The containing form element, if this element is in a form. If the button is not a
   * descendant of a form element, then the attribute can be the ID of any form element in
   * the same document it is related to, or the null value if none matches.
   *
   * MDN
   */
  def form: HTMLFormElement = js.native

  /**
   * A localized message that describes the validation constraints that the element
   * does not satisfy (if any). This is the empty string if the element is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  def validationMessage: String = js.native

  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  var validity: ValidityState = js.native
  /**
   * Always false because <fieldset> objects are never candidates for constraint
   * validation.
   *
   * MDN
   */
  var willValidate: Boolean = js.native

  /**
   * Always returns true because <fieldset> objects are never candidates for
   * constraint validation.
   *
   * MDN
   */
  def checkValidity(): Boolean = js.native

  /**
   * Sets a custom validity message for the field set. If this message is not the empty
   * string, then the field set is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: String): Unit = js.native
}


class HTMLBGSoundElement extends HTMLElement {
  var balance: js.Any = js.native
  var volume: js.Any = js.native
  var src: String = js.native
  var loop: Double = js.native
}


/**
 * The HTMLElement interface represents any HTML element. Some elements directly
 * implement this interface, other implement it via an interface that inherit it.
 *
 * MDN
 */
class HTMLElement extends Element {
  var onblur: js.Function1[FocusEvent, _] = js.native
  var onfocus: js.Function1[FocusEvent, _] = js.native
  var onmouseleave: js.Function1[MouseEvent, _] = js.native
  var onbeforecut: js.Function1[DragEvent, _] = js.native
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native
  var onreset: js.Function1[Event, _] = js.native
  var onhelp: js.Function1[Event, _] = js.native
  var ondragleave: js.Function1[DragEvent, _] = js.native
  var className: String = js.native
  var onfocusin: js.Function1[FocusEvent, _] = js.native
  var onseeked: js.Function1[Event, _] = js.native
  var recordNumber: js.Any = js.native
  /**
   * Establishes the text to be displayed in a 'tool tip' popup when the mouse is over the
   * displayed node.
   *
   * MDN
   */
  var title: String = js.native


  var ondurationchange: js.Function1[Event, _] = js.native

  /**
   * Height of an element relative to the element's offsetParent.
   *
   * MDN
   */
  def offsetHeight: Double = js.native

  /**
   * The dir attribute gets or sets the text writing directionality of the content of the
   * current element.
   *
   * MDN
   */
  var dir: String = js.native
  var onemptied: js.Function1[Event, _] = js.native
  var onseeking: js.Function1[Event, _] = js.native
  var oncanplay: js.Function1[Event, _] = js.native
  var ondeactivate: js.Function1[UIEvent, _] = js.native

  var onloadstart: js.Function1[Event, _] = js.native
  var ondragenter: js.Function1[DragEvent, _] = js.native
  var onsubmit: js.Function1[Event, _] = js.native

  var onchange: js.Function1[Event, _] = js.native

  var onbeforeactivate: js.Function1[UIEvent, _] = js.native
  var oncanplaythrough: js.Function1[Event, _] = js.native

  /**
   * offsetParent returns a reference to the object which is the closest (nearest in the
   * containment hierarchy) positioned containing element. If the element is
   * non-positioned, the nearest table cell or root element (html in standards
   * compliant mode; body in quirks rendering mode) is the offsetParent. offsetParent
   * returns null when the element has style.display set to "none". The offsetParent is
   * useful because offsetTop and offsetLeft are relative to its padding edge.
   *
   * MDN
   */
  def offsetParent: Element = js.native

  var onsuspend: js.Function1[Event, _] = js.native
  var readyState: js.Any = js.native
  var onmouseenter: js.Function1[MouseEvent, _] = js.native

  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var parentElement: HTMLElement = js.native
  var onmousewheel: js.Function1[WheelEvent, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var filters: Object = js.native
  /**
   * The ParentNode.children read-only property returns a live HTMLCollection of
   * child elements of the given object.
   *
   * The items in the returned collection are objects and not strings. To get data
   * from those node objects, you must use their properties (e.g.
   * elementNodeReference.children[1].nodeName to get the name, etc.).
   *
   * MDN
   */

  var ondragend: js.Function1[DragEvent, _] = js.native
  var onbeforepaste: js.Function1[DragEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native

  /**
   * offsetTop returns the distance of the current element relative to the top of
   * the offsetParent node.
   *
   * MDN
   */
  def offsetTop: Double = js.native

  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var onbeforecopy: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  /**
   * This property gets or sets the base language of an element's attribute values and
   * text content.
   *
   * MDN
   */
  var lang: String = js.native

  var onpause: js.Function1[Event, _] = js.native

  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onclick: js.Function1[MouseEvent, _] = js.native
  var onwaiting: js.Function1[Event, _] = js.native
  /**
   * Returns the number of pixels that the upper left corner of the current element is
   * offset to the left within the offsetParent node.
   *
   * MDN
   */
  var offsetLeft: Double = js.native

  var onstalled: js.Function1[Event, _] = js.native
  var onmousemove: js.Function1[MouseEvent, _] = js.native
  /**
   * isContentEditable returns true if the contents of the element are editable;
   * otherwise it returns false.
   *
   * MDN
   */
  var isContentEditable: Boolean = js.native
  var onratechange: js.Function1[Event, _] = js.native
  /**
   * contentEditable is used to indicate whether or not the element is editable. This
   * enumerated attribute can have the following values:
   *
   * MDN
   */
  var contentEditable: String = js.native
  /**
   * Gets/sets the tab order of the current element.
   *
   * MDN
   */
  var tabIndex: Int = js.native

  var onprogress: js.Function1[js.Any, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native
  var oncontextmenu: js.Function1[MouseEvent, _] = js.native
  var onloadedmetadata: js.Function1[Event, _] = js.native
  var onplay: js.Function1[Event, _] = js.native
  var onplaying: js.Function1[Event, _] = js.native

  var onfocusout: js.Function1[FocusEvent, _] = js.native
  var onabort: js.Function1[UIEvent, _] = js.native

  var onreadystatechange: js.Function1[Event, _] = js.native
  var onkeypress: js.Function1[KeyboardEvent, _] = js.native
  var onloadeddata: js.Function1[Event, _] = js.native
  var onbeforedeactivate: js.Function1[UIEvent, _] = js.native

  var disabled: Boolean = js.native
  var onactivate: js.Function1[UIEvent, _] = js.native
  var onselectstart: js.Function1[Event, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native
  var onselect: js.Function1[UIEvent, _] = js.native
  var ondrop: js.Function1[DragEvent, _] = js.native

  /**
   * Returns the layout width of an element.
   *
   * MDN
   */
  def offsetWidth: Double = js.native

  var onended: js.Function1[Event, _] = js.native
  var onscroll: js.Function1[UIEvent, _] = js.native

  var oninput: js.Function1[Event, _] = js.native

  /**
   * Sets focus on the specified element, if it can be focused.
   *
   * MDN
   */
  def focus(): Unit = js.native

  /**
   * The blur method removes keyboard focus from the current element.
   *
   * MDN
   */
  def blur(): Unit = js.native

  def contains(child: HTMLElement): Boolean = js.native

  /**
   * The click method simulates a mouse click on an element.
   *
   * MDN
   */
  def click(): Unit = js.native

  var oncuechange: js.Function1[Event, _] = js.native
  var spellcheck: Boolean = js.native
  var draggable: Boolean = js.native

  /**
   * Returns an object that represents the element's style attribute.
   *
   * MDN
   */
  var style: CSSStyleDeclaration = js.native
}


/**
 * The HTMLHRElement interface provides special properties (beyond those of the
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating <hr> elements.
 *
 * MDN
 */
class HTMLHRElement extends HTMLElement {
  var width: Double = js.native
  /**
   * Enumerated attribute indicating alignment of the rule with respect to the
   * surrounding context.
   *
   * MDN
   */
  var align: String = js.native

}


/**
 * The HTMLObjectElement interface provides special properties and methods
 * (beyond those on the HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <object> element,
 * representing external resources.
 *
 * MDN
 */
class HTMLObjectElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, specifying the displayed width of the resource
   * in CSS pixels.
   *
   * MDN
   */
  var width: String = js.native
  /**
   * Reflects the codetype HTML attribute, specifying the content type of the data.
   *
   * MDN
   */
  var codeType: String = js.native
  var `object`: Object = js.native
  /**
   * The object element's form owner, or null if there isn't one.
   *
   * MDN
   */
  var form: HTMLFormElement = js.native
  /**
   * The name of an applet class file, containing either the applet's subclass, or the
   * path to get to the class, including the class file itself.
   *
   * MDN
   */
  var code: String = js.native
  /**
   * Reflects the archive HTML attribute, containing a list of archives for resources
   * for this object.
   *
   * MDN
   */
  var archive: String = js.native
  /**
   * Reflects the standby HTML attribute, specifying a message to display while the
   * object loads.
   *
   * MDN
   */
  var standby: String = js.native
  var alt: String = js.native
  var classid: String = js.native
  /**
   * Reflects the name HTML attribute, specifying the name of the object (HTML 4, or of a
   * browsing context (HTML5.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * Reflects the usemap HTML attribute, specifying a <map> element to use.
   *
   * MDN
   */
  var useMap: String = js.native
  /**
   * Reflects the data HTML attribute, specifying the address of a resource's data.
   *
   * MDN
   */
  var data: String = js.native
  /**
   * Reflects the height HTML attribute, specifying the displayed height of the
   * resource in CSS pixels.
   *
   * MDN
   */
  var height: String = js.native
  /**
   * The active document of the object element's nested browsing context, if any;
   * otherwise null.
   *
   * MDN
   */
  var contentDocument: Document = js.native
  var altHtml: String = js.native
  /**
   * Reflects the codebase HTML attribute, specifying the base path to use to resolve
   * relative URIs.
   *
   * MDN
   */
  var codeBase: String = js.native
  /**
   * Reflects the declare HTML attribute, indicating that this is a declaration, not an
   * instantiation, of the object.
   *
   * MDN
   */
  var declare: Boolean = js.native
  var `type`: String = js.native
  var BaseHref: String = js.native
  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: String = js.native

  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  def validity: ValidityState = js.native

  /**
   * Indicates whether the element is a candidate for constraint validation. Always
   * false for HTMLObjectElement objects.
   *
   * MDN
   */
  var willValidate: Boolean = js.native

  /**
   * Always returns true, because object objects are never candidates for constraint
   * validation.
   *
   * MDN
   */
  def checkValidity(): Boolean = js.native

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: String): Unit = js.native
}


/**
 * The HTMLEmbedElement interface, which provides special properties (beyond the
 * regular <htmlelement> interface it also has available to it by inheritance) for
 * manipulating <embed> elements.
 *
 * MDN
 */
class HTMLEmbedElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, containing the displayed width of the
   * resource.
   *
   * MDN
   */
  var width: String = js.native

  /**
   * Reflects the src HTML attribute, containing the address of the resource.
   *
   * MDN
   */
  var src: String = js.native

  /**
   * Reflects the height HTML attribute, containing the displayed height of the
   * resource.
   *
   * MDN
   */
  var height: String = js.native

}


/**
 * The HTMLOptGroupElement interface provides special properties and methods
 * (beyond the regular HTMLElement object interface they also have available to them
 * by inheritance) for manipulating the layout and presentation of <optgroup>
 * elements.
 *
 * MDN
 */
class HTMLOptGroupElement extends HTMLElement {

  /**
   * Set or get the label for the group.
   *
   * MDN
   */
  var label: String = js.native

}


/**
 * The HTMLIsIndexElement interface provides special properties (beyond the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating <isindex> elements.
 *
 * MDN
 */
class HTMLIsIndexElement extends HTMLElement {
  /**
   * Is a HTMLFormElement representing the <form> element it belongs too. It can have
   * the null value, if <isindex> isn't part of any form.
   *
   * MDN
   */
  var form: HTMLFormElement = js.native
  var action: String = js.native
  /**
   * Is a DOMString representing a text to be prompted for the field.
   *
   * MDN
   */
  var prompt: String = js.native
}


/**
 * The HTMLVideoElement interface provides special properties and methods for
 * manipulating video objects. It also inherits properties and methods of
 * HTMLMediaElement and HTMLElement.
 *
 * MDN
 */
class HTMLVideoElement extends HTMLMediaElement {
  /**
   * Is a DOMString that reflects the width HTML attribute, which specifies the width of
   * the display area, in CSS pixels.
   *
   * MDN
   */
  var width: Int = js.native
  /**
   * Returns an unsigned long containing the intrinsic width of the resource in CSS
   * pixels, taking into account the dimensions, aspect ratio, clean aperture,
   * resolution, and so forth, as defined for the format used by the resource. If the
   * element's ready state is HAVE_NOTHING, the value is 0.
   *
   * MDN
   */
  var videoWidth: Int = js.native
  /**
   * Returns an unsigned long containing the intrinsic height of the resource in CSS
   * pixels, taking into account the dimensions, aspect ratio, clean aperture,
   * resolution, and so forth, as defined for the format used by the resource. If the
   * element's ready state is HAVE_NOTHING, the value is 0.
   *
   * MDN
   */
  var videoHeight: Int = js.native
  /**
   * Is a DOMString that reflects the height HTML attribute, which specifies the height
   * of the display area, in CSS pixels.
   *
   * MDN
   */
  var height: Int = js.native
  /**
   * Is a DOMString that reflects the poster HTML attribute, which specifies an image to
   * show while no video data is available.
   *
   * MDN
   */
  var poster: String = js.native


}


/**
 * The HTMLProgressElement interface provides special properties and methods
 * (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <progress>
 * elements.
 *
 * MDN
 */
class HTMLProgressElement extends HTMLElement {
  /**
   * If the progress bar is an indeterminate progress bar, then this property return 0.
   * Otherwise, it returns the current value.
   *
   * MDN
   */
  var value: Double = js.native
  /**
   * This property reflect the content attribute of the same name, limited to numbers
   * greater than zero. Its default value is 1.0.
   *
   * MDN
   */
  var max: Double = js.native
  /**
   * If the progress bar is an indeterminate progress bar, then the position property
   * return −1. Otherwise, it returns the result of dividing the current value by the
   * maximum value.
   *
   * MDN
   */
  var position: Double = js.native
  var form: HTMLFormElement = js.native
}


/**
 * The HTMLDataListElement interface provides special properties (beyond the
 * HTMLElement object interface it also has available to it by inheritance) to
 * manipulate <datalist> elements and their content.
 *
 * MDN
 */
class HTMLDataListElement extends HTMLElement {
  /**
   * A collection of the contained option elements.
   *
   * MDN
   */
  var options: HTMLCollection = js.native
}


/**
 * The HTMLTrackElement interface provides access to the properties of <track>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class HTMLTrackElement extends HTMLElement {
  var kind: String = js.native
  var src: String = js.native
  var srclang: String = js.native
  var track: TextTrack = js.native
  var label: String = js.native
}

class HTMLMarqueeElement extends HTMLElement {
  var width: String = js.native
  var onbounce: js.Function1[Event, _] = js.native
  var vspace: Int = js.native
  var trueSpeed: Boolean = js.native
  var scrollAmount: Double = js.native
  var scrollDelay: Double = js.native
  var behavior: String = js.native
  var height: String = js.native
  var loop: Int = js.native
  var direction: String = js.native
  var hspace: Int = js.native
  var onstart: js.Function1[Event, _] = js.native
  var onfinish: js.Function1[Event, _] = js.native

  def stop(): Unit = js.native

  def start(): Unit = js.native


}

/**
 * The HTMLSpanElement interface represents a <span> element and derives from the
 * HTMLElement interface, but without implementing any additional properties or
 * methods.
 *
 * MDN
 */
class HTMLSpanElement extends HTMLElement {
}


/**
 * The HTMLHeadElement interface contains the descriptive information, or
 * metadata, for a document. This object inherits all of the properties and methods
 * described in the HTMLElement interface.
 *
 * MDN
 */
class HTMLHeadElement extends HTMLElement {
  /**
   * The URIs of one or more metadata profiles (white space separated).
   *
   * MDN
   */
  var profile: String = js.native
}


/**
 * The HTMLHeadingElement interface represents the different heading elements. It
 * inherits methods and properties from the HTMLElement interface.
 *
 * MDN
 */
class HTMLHeadingElement extends HTMLElement {
  /**
   * Enumerated attribute indicating alignment of the heading with respect to the
   * surrounding context.
   *
   * MDN
   */
  var align: String = js.native
}


/**
 * The HTMLFormElement interface provides methods to create and modify <form>
 * elements; it inherits from properties and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLFormElement extends HTMLElement {
  /**
   * length returns the number of controls in the FORM element.
   *
   * MDN
   */
  var length: Int = js.native
  /**
   * target gets/sets the target of the action (i.e., the frame to render its output in).
   *
   * MDN
   */
  var target: String = js.native
  /**
   * acceptCharset returns a list of the supported character encodings for the given
   * FORM element. This list can be comma- or space-separated.
   *
   * MDN
   */
  var acceptCharset: String = js.native
  /**
   * enctype gets/sets the content type of the FORM element.
   *
   * MDN
   */
  var enctype: String = js.native
  /**
   * elements returns an HTMLFormControlsCollection (HTML 4 HTMLCollection) of all
   * the form controls contained in the FORM element, with the exception of input
   * elements which have a type attribute of image.
   *
   * MDN
   */
  var elements: HTMLCollection = js.native
  /**
   * action gets/sets the action of the <form> element.
   *
   * MDN
   */
  var action: String = js.native
  /**
   * name returns the name of the current form element as a string.
   *
   * MDN
   */
  var name: String = js.native
  /**
   * method gets/sets the HTTP method used to submit the form.
   *
   * MDN
   */
  var method: String = js.native
  /**
   * encoding is an alternative name for the enctype element on the DOM HTMLFormElement
   * object.
   *
   * MDN
   */
  var encoding: String = js.native

  /**
   * reset restores a form element's default values.
   *
   * MDN
   */
  def reset(): Unit = js.native
  /**
   * Gets the item in the elements collection at the specified index, or null if there is
   * no item at that index. You can also specify the index in array-style brackets or
   * parentheses after the form object name, without calling this method explicitly.
   *
   * MDN
   */
  def item(name: js.Any = js.native, index: js.Any = js.native): js.Dynamic = js.native

  /**
   * This method does something similar to activating a submit button of the form.
   *
   * MDN
   */
  def submit(): Unit = js.native

  /**
   * Gets the item or list of items in elements collection whose name or id match the
   * specified name, or null if no items match. You can also specify the name in
   * array-style brackets or parentheses after the form object name, without calling
   * this method explicitly.
   *
   * MDN
   */
  def namedItem(name: String): js.Dynamic = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: String): js.Any = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native

  /**
   * Reflects the autocomplete HTML attribute, containing a string that indicates
   * whether the controls in this form can have their values automatically populated by
   * the browser.
   *
   * MDN
   */
  var autocomplete: String = js.native
  /**
   * Reflects the novalidate HTML attribute, indicating that the form should not be
   * validated.
   *
   * MDN
   */
  var noValidate: Boolean = js.native

  def checkValidity(): Boolean = js.native
}



