/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLBodyElement interface provides special properties (beyond those of the regular HTMLElement interface they
  * also inherit) for manipulating body elements.
  */
@js.native
@JSGlobal
abstract class HTMLBodyElement extends HTMLElement {
  var scroll: String = js.native

  /** Reflects the ononline HTML attribute value for a function to call when network communication is restored. */
  var ononline: js.Function1[Event, _] = js.native

  /** Reflects the onmessage HTML attribute value for a function to call when the document receives a message. */
  var onmessage: js.Function1[MessageEvent[Any], _] = js.native

  /** Exposes the window.onerror event handler to call when the document fails to load properly. Note: This handler is
    * triggered when the event reaches the window, not the body element. Use addEventListener() to attach an event
    * listener to the body element.
    */
  var onerror: js.Function1[ErrorEvent, _] = js.native

  /** Reflects the onresize HTML attribute value for a function to call when the document has been resized. */
  var onresize: js.Function1[UIEvent, _] = js.native

  /** Reflects the onafterprint HTML attribute value for a function to call after the user has printed the document. */
  var onafterprint: js.Function1[Event, _] = js.native

  /** Reflects the onbeforeprint HTML attribute value for a function to call when the user has requested printing the
    * document.
    */
  var onbeforeprint: js.Function1[Event, _] = js.native

  /** Reflects the onoffline HTML attribute value for a function to call when network communication fails. */
  var onoffline: js.Function1[Event, _] = js.native

  /** Reflects the onunload HTML attribute value for a function to call when when the document is going away. */
  var onunload: js.Function1[Event, _] = js.native

  /** Reflects the onhashchange HTML attribute value for a function to call when the fragment identifier in the address
    * of the document changes.
    */
  var onhashchange: js.Function1[Event, _] = js.native

  /** Exposes the window.onload event handler to call when the window gains focus. Note: This handler is triggered when
    * the event reaches the window, not the body element. Use addEventListener() to attach an event listener to the body
    * element.
    */
  var onload: js.Function1[Event, _] = js.native

  /** Reflects the onbeforeunload HTML attribute value for a function to call when the document is about to be unloaded.
    */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native

  /** Reflects the onpopstate HTML attribute value for a function to call when the storage area has changed. */
  var onstorage: js.Function1[StorageEvent, _] = js.native

  /** Reflects the onpopstate HTML attribute value for a function to call when the user has navigated session history.
    */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native
}
