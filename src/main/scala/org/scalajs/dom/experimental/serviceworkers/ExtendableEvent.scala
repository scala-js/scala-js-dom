package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** See
  * [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#extendable-event-interface ¶4.4 ExtendableEvent]]
  * of whatwg ServiceWorker spec.
  *
  * An ExtendableEvent object has an associated extend lifetime promises (an array of promises). It is initially set to
  * null.
  */
@js.native
@JSGlobal
class ExtendableEvent(typeArg: String, init: js.UndefOr[ExtendableEventInit]) extends Event(typeArg, init) {
  def waitUntil(promise: js.Promise[Any]): Unit = js.native
}
