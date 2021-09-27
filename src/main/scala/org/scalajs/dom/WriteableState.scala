package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

// the stream API is defined in https://streams.spec.whatwg.org/

/** [[https://streams.spec.whatwg.org/#ws-state ¶4.2.4.3. get state]] of whatwg streams spec */
@js.native
sealed trait WriteableState extends js.Any

object WriteableState {

  /** The stream’s internal queue is full; that is, the stream is exerting backpressure. Use .ready to be notified of
    * when the pressure subsides.
    */
  val waiting: WriteableState = "waiting".asInstanceOf[WriteableState]

  /** The stream’s internal queue is not full; call .write() until backpressure is exerted. */
  val writable: WriteableState = "writable".asInstanceOf[WriteableState]

  /** The stream’s .close() method has been called, and a command to close is in the queue or being processed by the
    * underlying sink; attempts to write will now fail.
    */
  val closing: WriteableState = "closing".asInstanceOf[WriteableState]

  /** The underlying sink has been closed; writing is no longer possible. */
  val closed: WriteableState = "closed".asInstanceOf[WriteableState]

  /** An error occurred interacting with the underlying sink or the stream has been aborted, so the stream is now dead.
    */
  val errored: WriteableState = "errored".asInstanceOf[WriteableState]
}
