package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The AbortController interface represents a controller object that allows you to abort one or more DOM requests as
  * and when desired.
  */
@js.native
@JSGlobal
class AbortController() extends js.Object {

  /** Returns a AbortSignal object instance, which can be used to communicate with/abort a DOM request */
  val signal: AbortSignal = js.native

  /** Aborts a DOM request before it has completed. This is able to abort fetch requests, consumption of any response
    * Body, and streams.
    */
  def abort(): Unit = js.native
}
