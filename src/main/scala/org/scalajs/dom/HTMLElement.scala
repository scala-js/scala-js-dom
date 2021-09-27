/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.{MediaSource, MediaStream}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The HTMLElement interface represents any HTML element. Some elements directly implement this interface, other
  * implement it via an interface that inherit it.
  */
@js.native
@JSGlobal
abstract class HTMLElement extends Element {
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

  /** Establishes the text to be displayed in a 'tool tip' popup when the mouse is over the displayed node. */
  var title: String = js.native

  var ondurationchange: js.Function1[Event, _] = js.native

  /** Height of an element relative to the element's offsetParent. */
  def offsetHeight: Double = js.native

  /** The dir attribute gets or sets the text writing directionality of the content of the current element. */
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

  /** offsetParent returns a reference to the object which is the closest (nearest in the containment hierarchy)
    * positioned containing element. If the element is non-positioned, the nearest table cell or root element (html in
    * standards compliant mode; body in quirks rendering mode) is the offsetParent. offsetParent returns null when the
    * element has style.display set to "none". The offsetParent is useful because offsetTop and offsetLeft are relative
    * to its padding edge.
    */
  def offsetParent: Element = js.native

  var onsuspend: js.Function1[Event, _] = js.native
  var readyState: js.Any = js.native
  var onmouseenter: js.Function1[MouseEvent, _] = js.native

  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var parentElement: HTMLElement = js.native
  var onmousewheel: js.Function1[WheelEvent, _] = js.native
  var onwheel: js.Function1[WheelEvent, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var filters: Object = js.native

  /** The ParentNode.children read-only property returns a live HTMLCollection of child elements of the given object.
    *
    * The items in the returned collection are objects and not strings. To get data from those node objects, you must
    * use their properties (e.g. elementNodeReference.children[1].nodeName to get the name, etc.).
    */
  var ondragend: js.Function1[DragEvent, _] = js.native
  var onbeforepaste: js.Function1[DragEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native

  /** offsetTop returns the distance of the current element relative to the top of the offsetParent node. */
  def offsetTop: Double = js.native

  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var onbeforecopy: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native
  var onmouseover: js.Function1[MouseEvent, _] = js.native

  /** This property gets or sets the base language of an element's attribute values and text content. */
  var lang: String = js.native

  var onpause: js.Function1[Event, _] = js.native

  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onclick: js.Function1[MouseEvent, _] = js.native
  var onwaiting: js.Function1[Event, _] = js.native

  /** Returns the number of pixels that the upper left corner of the current element is offset to the left within the
    * offsetParent node.
    */
  def offsetLeft: Double = js.native

  var onstalled: js.Function1[Event, _] = js.native
  var onmousemove: js.Function1[MouseEvent, _] = js.native

  /** isContentEditable returns true if the contents of the element are editable; otherwise it returns false. */
  def isContentEditable: Boolean = js.native
  var onratechange: js.Function1[Event, _] = js.native

  /** contentEditable is used to indicate whether or not the element is editable. This enumerated attribute can have the
    * following values:
    */
  var contentEditable: String = js.native

  /** Gets/sets the tab order of the current element.
    *
    * The '''tabindex''' global attribute is an integer indicating if the element can take input focus (is
    * ''focusable''), if it should participate to sequential keyboard navigation, and if so, at what position. It can
    * take several values:
    *
    *   - a ''negative value'' means that the element should be focusable, but should not be reachable via sequential
    *     keyboard navigation;
    *
    *   - '''0''' means that the element should be focusable and reachable via sequential keyboard navigation, but its
    *     relative order is defined by the platform convention;
    *
    *   - a ''positive value'' which means should be focusable and reachable via sequential keyboard navigation; its
    *     relative order is defined by the value of the attribute: the sequential follow the increasing number of the
    *     '''tabindex'''. If several elements share the same tabindex, their relative order follows their relative
    *     position in the document).
    *
    * An element with a '''0''' value, an invalid value, or no '''tabindex''' value should be placed after elements with
    * a positive '''tabindex''' in the sequential keyboard navigation order.
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

  var onactivate: js.Function1[UIEvent, _] = js.native
  var onselectstart: js.Function1[Event, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native
  var onselect: js.Function1[UIEvent, _] = js.native
  var ondrop: js.Function1[DragEvent, _] = js.native

  /** Returns the layout width of an element. */
  def offsetWidth: Double = js.native

  var onended: js.Function1[Event, _] = js.native
  var onscroll: js.Function1[UIEvent, _] = js.native

  var oninput: js.Function1[Event, _] = js.native

  /** Sets focus on the specified element, if it can be focused. */
  def focus(): Unit = js.native

  /** The blur method removes keyboard focus from the current element. */
  def blur(): Unit = js.native

  def contains(child: HTMLElement): Boolean = js.native

  /** The click method simulates a mouse click on an element. */
  def click(): Unit = js.native

  var oncuechange: js.Function1[Event, _] = js.native
  var spellcheck: Boolean = js.native
  var draggable: Boolean = js.native

  /** Returns an object that represents the element's style attribute. */
  def style: CSSStyleDeclaration = js.native
  def style_=(value: CSSStyleDeclaration): Unit = js.native
  def style_=(value: String): Unit = js.native

  /** Returns the Document that this node belongs to. If no document is associated with it, returns null.
    *
    * This is defined on Node; we override it here because we know (from the fact that this is an HTMLElement) that we
    * are getting an HTMLDocument here.
    */
  override def ownerDocument: HTMLDocument = js.native

  /** The dataset property on the HTMLElement interface provides read/write access to all the custom data attributes
    * (data-*) set on the element. This access is available both in HTML and within the DOM. It is a map of DOMString,
    * one entry for each custom data attribute. Note that the dataset property itself can be read, but not directly
    * written. Instead, all writes must be to the individual properties within the dataset, which in turn represent the
    * data attributes.
    */
  def dataset: js.Dictionary[String] = js.native

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
