package org.scalajs.dom

import scala.scalajs.js

/** The AbortSignal interface represents a signal object that allows you to communicate with a DOM request (such as a
  * Fetch) and abort it if required via an AbortController object.
  */
@js.native
trait AbortSignal extends EventTarget {

  /** A Boolean that indicates whether the request(s) the signal is communicating with is/are aborted (true) or not
    * (false).
    */
  def aborted: Boolean = js.native

  /** Invoked when an abort event fires, i.e. when the DOM request(s) the signal is communicating with is/are aborted.
    */
  var onabort: js.Function0[Any] = js.native
}
