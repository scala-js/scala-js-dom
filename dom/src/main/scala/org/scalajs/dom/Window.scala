/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The window object represents the window itself. The document property of a window points to the DOM document loaded
  * in that window. A window for a given document can be obtained using the document.defaultView property.
  *
  * In a tabbed browser, such as Firefox, each tab contains its own window object (and if you're writing an extension,
  * the browser window itself is a separate window too - see Working with windows in chrome code for more information).
  * That is, the window object is not shared between tabs in the same window. Some methods, namely window.resizeTo and
  * window.resizeBy apply to the whole window and not to the specific tab the window object belongs to. Generally,
  * anything that can't reasonably pertain to a tab pertains to the window instead.
  */
@js.native
@JSGlobal
class Window
    extends EventTarget with WindowLocalStorage with WindowSessionStorage with WindowOrWorkerGlobalScope
    with WindowConsole {
  var ondragend: js.Function1[DragEvent, _] = js.native

  /** An event handler property for keydown events on the window. */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native

  /** An event handler property for keyup events on the window. */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native

  /** An event handler property for reset events on the window. */
  var onreset: js.Function1[Event, _] = js.native

  /** An event handler property for mouseup events on the window. */
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native

  /** Returns the horizontal distance of the left border of the user's browser from the left side of the screen. */
  var screenX: Int = js.native

  /** An event handler property for mouseover events on the window. */
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  var ondragleave: js.Function1[DragEvent, _] = js.native

  /** The Window.history read-only property returns a reference to the History object, which provides an interface for
    * manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
    */
  def history: History = js.native

  /** Returns the number of pixels that the document has already been scrolled horizontally. */
  def pageXOffset: Double = js.native

  /** The name of the window is used primarily for setting targets for hyperlinks and forms. Windows do not need to have
    * names.
    */
  var name: String = js.native

  /** The onafterprint property sets and returns the onafterprint event handler code for the current window. */
  var onafterprint: js.Function1[Event, _] = js.native
  var onpause: js.Function1[Event, _] = js.native

  /** The onbeforeprint property sets and returns the onbeforeprint event handler code for the current window. */
  var onbeforeprint: js.Function1[Event, _] = js.native

  /** Returns a reference to the topmost window in the window hierarchy. This property is read only. */
  def top: Window = js.native

  /** An event handler property for mousedown events on the window. */
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onseeked: js.Function1[Event, _] = js.native

  /** Returns a reference to the window that opened this current window. */
  var opener: Window = js.native

  /** Called when the user clicks the mouse button while the cursor is in the window. This event is fired for any mouse
    * button pressed; you can look at the event properties to find out which button was pressed and where.
    */
  var onclick: js.Function1[MouseEvent, _] = js.native

  /** Gets the width of the content area of the browser window including, if rendered, the vertical scrollbar. */
  def innerWidth: Double = js.native

  /** Gets the height of the content area of the browser window including, if rendered, the horizontal scrollbar. */
  def innerHeight: Double = js.native

  var onwaiting: js.Function1[Event, _] = js.native
  var ononline: js.Function1[Event, _] = js.native
  var ondurationchange: js.Function1[Event, _] = js.native

  /** Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window. */
  def frames: Window = js.native

  /** The onblur property can be used to set the blur handler on the window, which is triggered when the window loses
    * focus.
    */
  var onblur: js.Function1[FocusEvent, _] = js.native
  var onemptied: js.Function1[Event, _] = js.native
  var onseeking: js.Function1[Event, _] = js.native
  var oncanplay: js.Function1[Event, _] = js.native

  /** window.outerWidth gets the width of the outside of the browser window. It represents the width of the whole
    * browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
    */
  def outerWidth: Int = js.native

  var onstalled: js.Function1[Event, _] = js.native

  /** An event handler property for mousemove events on the window. */
  var onmousemove: js.Function1[MouseEvent, _] = js.native

  var onoffline: js.Function1[Event, _] = js.native

  /** Returns the number of frames (either frame or iframe elements) in the window. */
  def length: Int = js.native

  /** Specifies the height of the screen, in pixels, minus permanent or semipermanent user interface features displayed
    * by the operating system, such as the Taskbar on Windows.
    */
  def screen: Screen = js.native

  /** An event that fires when a window is about to unload its resources. The document is still visible and the event is
    * still cancelable.
    */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var onratechange: js.Function1[Event, _] = js.native
  var onstorage: js.Function1[StorageEvent, _] = js.native
  var onloadstart: js.Function1[Event, _] = js.native

  /** Called for an element when the mouse pointer first moves over the element while something is being dragged. This
    * might be used to change the appearance of the element to indicate to the user that the object can be dropped on
    * it.
    */
  var ondragenter: js.Function1[DragEvent, _] = js.native

  /** An event handler property for submits on window forms. */
  var onsubmit: js.Function1[Event, _] = js.native

  /** Returns an object reference to the window object itself. */
  def self: Window = js.native

  /** Returns a reference to the document that the window contains. */
  def document: HTMLDocument = js.native

  var onprogress: js.Function1[js.Any, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native

  /** Returns the number of pixels that the document has already been scrolled vertically. */
  def pageYOffset: Double = js.native

  /** An event handler property for right-click events on the window. */
  var oncontextmenu: js.Function1[MouseEvent, _] = js.native

  /** An event handler property for change events on the window. */
  var onchange: js.Function1[Event, _] = js.native
  var onloadedmetadata: js.Function1[Event, _] = js.native
  var onplay: js.Function1[Event, _] = js.native

  /** An event handler property for errors raised on the window. */
  var onerror: js.Function5[Event, String, Int, Int, Any, _] = js.native
  var onplaying: js.Function1[Event, _] = js.native

  /** Returns a reference to the parent of the current window or subframe. */
  def parent: Window = js.native

  /** The Window.location property returns a Location object with information about the current location of the
    * document.
    */
  var location: Location = js.native
  var oncanplaythrough: js.Function1[Event, _] = js.native

  /** An event handler property for abort events on the window. */
  var onabort: js.Function1[UIEvent, _] = js.native
  var onreadystatechange: js.Function1[Event, _] = js.native

  /** window.outerHeight gets the height in pixels of the whole browser window. It represents the height of the whole
    * browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
    */
  def outerHeight: Int = js.native

  /** An event handler property for keypress events on the window. */
  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /** Returns the element (such as &lt;iframe&gt; or &lt;object&gt;) in which the window is embedded, or null if the
    * window is top-level.
    */
  def frameElement: Element = js.native

  var onloadeddata: js.Function1[Event, _] = js.native
  var onsuspend: js.Function1[Event, _] = js.native

  /** The window property of a window object points to the window object itself. */
  def window: Window = js.native

  /** An event handler property for focus events on the window. */
  var onfocus: js.Function1[FocusEvent, _] = js.native
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native

  /** An event handler for the resize event on the window. */
  var onresize: js.Function1[UIEvent, _] = js.native

  /** An event handler property for window selection. */
  var onselect: js.Function1[UIEvent, _] = js.native

  /** The Window.navigator read-only property returns a reference to the Navigator object, which can be queried for
    * information about the application running the script.
    */
  def navigator: Navigator = js.native

  def styleMedia: StyleMedia = js.native

  var ondrop: js.Function1[DragEvent, _] = js.native

  /** An event handler property for mouseout events on the window. */
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var onended: js.Function1[Event, _] = js.native

  /** An event handler property for hash change events on the window; called when the part of the URL after the hash
    * mark ("#") changes.
    */
  var onhashchange: js.Function1[HashChangeEvent, _] = js.native

  /** The unload event is raised when the window is unloading its content and resources. The resources removal is
    * processed  after the unload event occurs.
    */
  var onunload: js.Function1[Event, _] = js.native

  /** Specifies the function to be called when the window is scrolled. */
  var onscroll: js.Function1[UIEvent, _] = js.native

  /** Returns the vertical distance of the top border of the user's browser from the top edge of the screen. */
  def screenY: Int = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native

  var onwheel: js.Function1[WheelEvent, _] = js.native

  /** An event handler property for window loading. */
  var onload: js.Function1[Event, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var oninput: js.Function1[Event, _] = js.native

  /** The Web Performance API allows web pages access to certain functions for measuring the performance of web pages
    * and web applications, including the Navigation Timing API and high-resolution time data.
    */
  def performance: Performance = js.native

  def alert(message: String): Unit = js.native

  /** The Window.alert() method displays an alert dialog with the optional specified content and an OK button. */
  def alert(): Unit = js.native

  /** Scrolls the window to a particular place in the document. */
  def scroll(x: Int, y: Int): Unit = js.native

  /** Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed
    * to be frontmost before this method returns.
    */
  def focus(): Unit = js.native

  /** Scrolls to a particular set of coordinates in the document. */
  def scrollTo(x: Int, y: Int): Unit = js.native

  /** Opens the Print Dialog to print the current document. */
  def print(): Unit = js.native

  def prompt(message: String, default: String = js.native): String = js.native

  /** The Window.prompt() displays a dialog with an optional message prompting the user to input some text. */
  def prompt(): String = js.native

  /** Loads a resource in a new browsing context or an existing one. */
  def open(url: String = js.native, target: String = js.native, features: String = js.native,
      replace: Boolean = js.native): Window = js.native

  /** Scrolls the document in the window by the given amount. */
  def scrollBy(x: Int, y: Int): Unit = js.native

  /** The Window.confirm() method displays a modal dialog with an optional message and two buttons, OK and Cancel. */
  def confirm(message: String = js.native): Boolean = js.native

  /** Closes the current window, or a referenced window. */
  def close(): Unit = js.native

  def closed: Boolean = js.native

  /** Safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it
    * spawned, or between a page and an iframe embedded within it.
    *
    * Normally, scripts on different pages are allowed to access each other if and only if the pages they originate from
    * share the same protocol, port number, and host (also known as the "same-origin policy"). window.postMessage()
    * provides a controlled mechanism to securely circumvent this restriction (if used properly).
    *
    * Broadly, one window may obtain a reference to another (e.g., via targetWindow = window.opener), and then dispatch
    * a MessageEvent on it with targetWindow.postMessage(). The receiving window is then free to handle this event as
    * needed. The arguments passed to window.postMessage() (i.e., the “message”) are exposed to the receiving window
    * through the event object.
    *
    * @param targetOrigin
    *   Specifies what the origin of targetWindow must be for the event to be dispatched, either as the literal string
    *   "*" (indicating no preference) or as a URI. If at the time the event is scheduled to be dispatched the scheme,
    *   hostname, or port of targetWindow's document does not match that provided in targetOrigin, the event will not be
    *   dispatched; only if all three match will the event be dispatched. This mechanism provides control over where
    *   messages are sent; for example, if postMessage() was used to transmit a password, it would be absolutely
    *   critical that this argument be a URI whose origin is the same as the intended receiver of the message containing
    *   the password, to prevent interception of the password by a malicious third party. Always provide a specific
    *   targetOrigin, not *, if you know where the other window's document should be located. Failing to provide a
    *   specific target discloses the data you send to any interested malicious site.
    *
    * @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  def postMessage(message: js.Any, targetOrigin: String,
      transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  /** The Window.showModalDialog() creates and displays a modal dialog box containing a specified HTML document.
    *
    * @param url
    *   The URI of the document to display in the dialog box
    * @param argument
    *   An optional variant the contains values that should be passed to the dialog box; these are made available in the
    *   `window` object's `dialogArguments` property.
    * @param options
    *   An optional String that specifies window ornamentation
    */
  def showModalDialog(url: String = js.native, argument: js.Any = js.native,
      options: js.Any = js.native): js.Dynamic = js.native

  /** The window.blur() method is the programmatic equivalent of the user shifting focus away from the current window.
    */
  def blur(): Unit = js.native

  /** Returns a selection object representing the range of text selected by the user. */
  def getSelection(): Selection = js.native

  def getComputedStyle(elt: Element, pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /** An OfflineResourceList object providing access to the offline resources for the window. */
  def applicationCache: ApplicationCache = js.native

  /** An event handler property for popstate events, which are fired when navigating to a session history entry
    * representing a state object.
    */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native

  /** An event handler property for pagehide events, which are fired when the browser hides the current page in the
    * process of presenting a different page from the session's history.
    *
    * For example, when the user clicks the browser's Back button, the current page receives a pagehide event before the
    * previous page is shown.
    */
  var onpagehide: js.Function1[PageTransitionEvent, _] = js.native

  /** An event handler property for pageshow events, which are fired when the browser makes the window's document
    * visible due to navigation tasks. This includes the process of initially loading the page, navigating to the page
    * from another page within the same window or tab, or returning to the page using the browser's forward or back
    * buttons.
    *
    * When this event is sent during the page load process, it's sent after the load event.
    */
  var onpageshow: js.Function1[PageTransitionEvent, _] = js.native

  /** Returns a new MediaQueryList object representing the parsed results of the specified media query string. */
  def matchMedia(mediaQuery: String): MediaQueryList = js.native

  /** Cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame(). */
  def cancelAnimationFrame(handle: Int): Unit = js.native

  /** The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests
    * that the browser call a specified function to update an animation before the next repaint. The method takes as an
    * argument a callback to be invoked before the repaint.
    */
  def requestAnimationFrame(callback: js.Function1[Double, _]): Int = js.native

  /** The Window.devicePixelRatio read-only property returns the ratio of the (vertical) size of one physical pixel on
    * the current display device to the size of one device independent pixel (dips).
    */
  def devicePixelRatio: Double = js.native

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

  /** Moves the window to the specified coordinates. */
  def moveTo(x: Int, y: Int): Unit = js.native

  /** Moves the current window by a specified amount. */
  def moveBy(deltaX: Int, deltaY: Int): Unit = js.native

  /** Dynamically resizes window. */
  def resizeTo(width: Int, height: Int): Unit = js.native

  /** Resizes the current window by a certain amount. */
  def resizeBy(deltaX: Int, deltaY: Int): Unit = js.native

  /** The read-only scrollX property of the Window interface returns the number of pixels that the document is currently
    * scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a
    * whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
    */
  def scrollX: Double = js.native

  /** The read-only scrollY property of the Window interface returns the number of pixels that the document is currently
    * scrolled vertically. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole
    * number. You can get the number of pixels the document is scrolled horizontally from the scrollX property.
    */
  def scrollY: Double = js.native

  /** Encodes a URI by replacing each instance of certain characters by one, two, three, or four escape sequences
    * representing the UTF-8 encoding of the character (will only be four escape sequences for characters composed of
    * two "surrogate" characters).
    *
    * @param uriComponent
    *   A string, number, boolean, null, undefined, or any object. Before encoding, the uriComponent gets converted to
    *   string.
    *
    * @return
    *   A new string representing the provided uriComponent encoded as a URI component.
    */
  def encodeURIComponent(uriComponent: Any): String = js.native

  /** Decodes a Uniform Resource Identifier (URI) component previously created by [[encodeURIComponent]] or by a similar
    * routine.
    *
    * Replaces each escape sequence in the encoded URI component with the character that it represents.
    *
    * Throws an URIError ("malformed URI sequence") exception when used wrongly.
    *
    * @param encodedURI
    *   An encoded component of a Uniform Resource Identifier.
    * @return
    *   A new string representing the decoded version of the given encoded Uniform Resource Identifier (URI) component.
    */
  def decodeURIComponent(encodedURI: String): String = js.native
}
