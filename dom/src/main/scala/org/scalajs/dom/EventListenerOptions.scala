/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** An options object that specifies characteristics about the event listener. */
trait EventListenerOptions extends js.Object {

  /** A Boolean indicating that events of this type will be dispatched to the registered listener before being
    * dispatched to any EventTarget beneath it in the DOM tree.
    */
  var capture: js.UndefOr[Boolean] = js.undefined

  /** A Boolean indicating that the listener should be invoked at most once after being added. If true, the listener
    * would be automatically removed when invoked.
    */
  var once: js.UndefOr[Boolean] = js.undefined

  /** A Boolean which, if true, indicates that the function specified by listener will never call preventDefault(). If a
    * passive listener does call preventDefault(), the user agent will do nothing other than generate a console warning.
    * See Improving scrolling performance with passive listeners to learn more.
    */
  var passive: js.UndefOr[Boolean] = js.undefined

  /** An AbortSignal. The listener will be removed when the given AbortSignal object's abort() method is called. If not
    * specified, no AbortSignal is associated with the listener.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
