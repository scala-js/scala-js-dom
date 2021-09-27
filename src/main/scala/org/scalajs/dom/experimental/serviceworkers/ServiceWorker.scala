package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import scala.scalajs.js

/** The ServiceWorker interface of the ServiceWorker API provides a reference to a service worker. Multiple browsing
  * contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique
  * ServiceWorker object.
  */
@js.native
trait ServiceWorker extends EventTarget {

  /** Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration. Must be on the same
    * origin as the document that registers the ServiceWorker.
    */
  def scriptURL: String = js.native

  /** The state read-only property of the ServiceWorker interface returns a string representing the current state of the
    * service worker. It can be one of the following values: installing, installed, activating, activated, or redundant.
    */
  def state: String = js.native

  /** @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  var onstatechange: js.Function1[Event, _] = js.native

  /** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#service-worker-postmessage ¶3.1.3 postMessage]]
    * on whatwg ServiceWorker spec.
    */
  def postMessage(message: js.Any, transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}
