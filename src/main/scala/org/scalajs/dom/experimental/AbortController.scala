package org.scalajs.dom.experimental

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * The AbortController interface represents a controller object that allows you
 * to abort one or more DOM requests as and when desired.
 *
 * MDN
 */
@js.native
@JSGlobal
class AbortController() extends js.Object {

  /**
   * Returns a AbortSignal object instance, which can be used to communicate
   * with/abort a DOM request
   *
   * MDN
   */
  val signal: AbortSignal = js.native

  /**
   * Aborts a DOM request before it has completed. This is able to abort fetch
   * requests, consumption of any response Body, and streams.
   *
   * MDN
   */
  def abort(): Unit = js.native
}

/**
 * The AbortSignal interface represents a signal object that allows you to
 * communicate with a DOM request (such as a Fetch) and abort it if required
 * via an AbortController object.
 *
 * MDN
 */
@js.native
trait AbortSignal extends EventTarget {

  /**
   * A Boolean that indicates whether the request(s) the signal is
   * communicating with is/are aborted (true) or not (false).
   *
   * MDN
   */
  def aborted: Boolean = js.native

  /**
   * Invoked when an abort event fires, i.e. when the DOM request(s) the signal
   * is communicating with is/are aborted.
   *
   * MDN
   */
  var onabort: js.Function0[Any] = js.native
}
