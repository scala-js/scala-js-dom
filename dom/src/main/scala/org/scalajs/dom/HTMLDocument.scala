/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
abstract class HTMLDocument extends Document {

  /** Returns the title of the current document. */
  var title: String = js.native

  /** Gets/sets the domain portion of the origin of the current document, as used by the same origin policy. */
  var domain: String = js.native

  /** The Document.location property returns a Location object, which contains information about the URL of the document
    * and provides methods for changing that URL and load another URL.
    */
  var location: Location = js.native

  /** Returns a string containing the URL of the current document. */
  def URL: String = js.native

  /** Returns the URI of the page that linked to this page. */
  def referrer: String = js.native

  /** Returns a semicolon-separated list of the cookies for that document or sets a single cookie. */
  var cookie: String = js.native

  /** The Document.dir property is a DOMString representing the directionality of the text of the document, whether left
    * to right (default) or right to left. Possible values are 'rtl', right to left, and 'ltr', left to right.
    */
  var dir: String = js.native

  /** Can be used to make any document editable, for example in a &lt;iframe /&gt;: */
  var designMode: String = js.native

  /** Indicates whether the document is rendered in Quirks mode or Strict mode. */
  def compatMode: String = js.native

  /** Returns "loading" while the document is loading, "interactive" once it is finished parsing but still loading
    * sub-resources, and "complete" once it has loaded.
    */
  def readyState: String = js.native

  var uniqueID: String = js.native

  /** In browsers returns the window object associated with the document or null if none available. */
  def defaultView: Window = js.native

  /** Returns the &lt;head&gt; element of the current document. If there are more than one &lt;head&gt; elements, the
    * first one is returned.
    */
  def head: HTMLHeadElement = js.native

  /** Returns the &lt;body&gt; or &lt;frameset&gt; node of the current document, or null if no such element exists. */
  var body: HTMLElement = js.native

  /** Returns the currently focused element, that is, the element that will get keystroke events if the user types any.
    * This attribute is read only.
    */
  def activeElement: Element = js.native

  /** Returns a list of the embedded &lt;embed&gt; elements within the current document. */
  def embeds: HTMLCollection[Element] = js.native

  /** forms returns a collection (an HTMLCollection) of the form elements within the current document. */
  def forms: HTMLCollection[Element] = js.native

  /** The links property returns a collection of all AREA elements and anchor elements in a document with a value for
    * the href attribute.
    */
  def links: HTMLCollection[Element] = js.native

  /** anchors returns a list of all of the anchors in the document. */
  def anchors: HTMLCollection[Element] = js.native

  /** Returns an HTMLCollection object containing one or more HTMLEmbedElements or null which represent the
    * &lt;embed&gt; elements in the current document.
    */
  def plugins: HTMLCollection[Element] = js.native

  /** document.images returns a collection of the images in the current HTML document. */
  def images: HTMLCollection[Element] = js.native

  /** Returns the current value of the current range for a formatting command. */
  def queryCommandValue(commandId: String): String = js.native

  /** Returns true if the formatting command is in an indeterminate state on the current range. */
  def queryCommandIndeterm(commandId: String): Boolean = js.native

  /** This method never did anything but throw an exception, and was removed in Gecko 14.0 (Firefox 14.0 / Thunderbird
    * 14.0 / SeaMonkey 2.11).
    */
  def queryCommandText(commandId: String): String = js.native

  /** Reports whether or not the specified editor query command is supported by the browser. */
  def queryCommandSupported(commandId: String): Boolean = js.native

  /** Returns true if the formatting command can be executed on the current range. */
  def queryCommandEnabled(commandId: String): Boolean = js.native

  /** Returns true if the formatting command has been executed on the current range. */
  def queryCommandState(commandId: String): Boolean = js.native

  /** When an HTML document has been switched to designMode, the document object exposes the execCommand method which
    * allows one to run commands to manipulate the contents of the editable region. Most commands affect the document's
    * selection (bold, italics, etc), while others insert new elements (adding a link) or affect an entire line
    * (indenting). When using contentEditable, calling execCommand will affect the currently active editable element.
    */
  def execCommand(commandId: String, showUI: Boolean = js.native, value: js.Any = js.native): Boolean = js.native

  /** This method never did anything and always threw an exception, so it was removed in Gecko 14.0 (Firefox 14.0 /
    * Thunderbird 14.0 / SeaMonkey 2.11).
    */
  def execCommandShowHelp(commandId: String): Boolean = js.native

  /** Writes a string of text to a document stream opened by document.open(). */
  def write(content: String*): Unit = js.native

  /** Writes a string of text followed by a newline character to a document. */
  def writeln(content: String*): Unit = js.native

  /** The document.open() method opens a document for writing. */
  def open(url: String = js.native, name: String = js.native, features: String = js.native,
      replace: Boolean = js.native): js.Dynamic = js.native

  /** The document.close() method finishes writing to a document, opened with document.open(). */
  def close(): Unit = js.native

  def updateSettings(): Unit = js.native

  def fireEvent(eventName: String, eventObj: js.Any = js.native): Boolean = js.native

  def focus(): Unit = js.native

  /** Returns a Boolean value indicating whether the document or any element inside the document has focus. This method
    * can be used to determine whether the active element in a document has focus.
    */
  def hasFocus(): Boolean = js.native

  /** The DOM getSelection() method is available on the Window and Document interfaces. See window.getSelection() for
    * details.
    */
  def getSelection(): Selection = js.native

  var onbeforeactivate: js.Function1[UIEvent, _] = js.native

  var onactivate: js.Function1[UIEvent, _] = js.native

  var onbeforedeactivate: js.Function1[UIEvent, _] = js.native

  var ondeactivate: js.Function1[UIEvent, _] = js.native

  var onloadstart: js.Function1[Event, _] = js.native

  var onload: js.Function1[Event, _] = js.native

  /** The onchange property sets and returns the event handler for the change event. */
  var onchange: js.Function1[Event, _] = js.native

  /** Returns the event handling code for the readystatechange event. */
  var onreadystatechange: js.Function1[Event, _] = js.native

  /** The submit event is raised when the user clicks a submit button in a form */
  var onsubmit: js.Function1[Event, _] = js.native

  var onfocus: js.Function1[FocusEvent, _] = js.native

  var onblur: js.Function1[FocusEvent, _] = js.native

  var onfocusin: js.Function1[FocusEvent, _] = js.native

  var onfocusout: js.Function1[FocusEvent, _] = js.native

  var onselect: js.Function1[UIEvent, _] = js.native

  var onselectstart: js.Function1[Event, _] = js.native

  var onselectionchange: js.Function1[Event, _] = js.native

  var oninput: js.Function1[Event, _] = js.native

  /** The keydown event is raised when the user presses a keyboard key. */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native

  /** The keyup event is raised when the user releases a key that's been pressed. */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native

  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /** The onclick property returns the onClick event handler code on the current element. */
  var onclick: js.Function1[MouseEvent, _] = js.native

  var ondblclick: js.Function1[MouseEvent, _] = js.native

  var onmouseup: js.Function1[MouseEvent, _] = js.native

  /** The mouseover event is raised when the user moves the mouse over a particular element. */
  var onmouseover: js.Function1[MouseEvent, _] = js.native

  /** The mousedown event is raised when the user presses the mouse button. */
  var onmousedown: js.Function1[MouseEvent, _] = js.native

  var onmousemove: js.Function1[MouseEvent, _] = js.native

  /** The mouseout event is raised when the mouse leaves an element (e.g, when the mouse moves off of an image in the
    * web page, the mouseout event is raised for that image element).
    */
  var onmouseout: js.Function1[MouseEvent, _] = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native

  var onwheel: js.Function1[WheelEvent, _] = js.native

  var onscroll: js.Function1[UIEvent, _] = js.native

  /** Called periodically throughout the drag and drop operation. */
  var ondrag: js.Function1[DragEvent, _] = js.native

  /** Called for an element when the mouse pointer first moves over the element while something is being dragged. This
    * might be used to change the appearance of the element to indicate to the user that the object can be dropped on
    * it.
    */
  var ondragenter: js.Function1[DragEvent, _] = js.native

  var ondragleave: js.Function1[DragEvent, _] = js.native

  /** This event handler is called for an element when something is being dragged over top of it. If the object can be
    * dropped on the element, the drag session should be notified.
    */
  var ondragover: js.Function1[DragEvent, _] = js.native

  /** An alias for ondraggesture; this is the HTML 5 spec name for the event and may be used in HTML or XUL; however,
    * for backward compatibility with older versions of Firefox, you may wish to continue using ondraggesture in XUL.
    */
  var ondragstart: js.Function1[DragEvent, _] = js.native

  /** Called when the drag operation is finished. */
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

  var onerror: js.Function1[ErrorEvent, _] = js.native

  var onplay: js.Function1[Event, _] = js.native

  var onplaying: js.Function1[Event, _] = js.native

  var onabort: js.Function1[UIEvent, _] = js.native

  var oncanplaythrough: js.Function1[Event, _] = js.native

  var onstoragecommit: js.Function1[StorageEvent, _] = js.native

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
}
