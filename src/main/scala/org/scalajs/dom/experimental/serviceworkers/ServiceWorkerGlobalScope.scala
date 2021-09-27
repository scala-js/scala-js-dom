package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The ServiceWorkerGlobalScope interface of the ServiceWorker API represents the global execution context of a service
  * worker.
  *
  * Developers should keep in mind that the ServiceWorker.state is not persisted across the termination/restart cycle,
  * so each event handler should assume it's being invoked with a bare, default global state.
  *
  * Once successfully registered, a service worker can and will be terminated when idle to conserve memory and processor
  * power. An active service worker is automatically restarted to respond to events, such as
  * ServiceWorkerGlobalScope.onfetch or ServiceWorkerGlobalScope.onmessage.
  *
  * Additionally, synchronous requests are not allowed from within a service worker — only asynchronous requests, like
  * those initiated via the fetch() method, can be used.
  */
@js.native
trait ServiceWorkerGlobalScope extends WorkerGlobalScope {

  /** Returns the Clients object associated with the service worker. */
  def clients: Clients = js.native

  /** The registration read-only property of the ServiceWorkerGlobalScope interface returns a reference to the
    * ServiceWorkerRegistration object, which represents the service worker's registration.
    */
  def registration: ServiceWorkerRegistration = js.native

  /** An event handler fired whenever an activate event occurs (when the service worker activates). This happens after
    * installation, when the page to be controlled by the service worker refreshes.
    */
  var onactivate: js.Function1[ExtendableEvent, _] = js.native

  /** An event handler fired whenever a fetch event occurs — when a fetch() is called. */
  var onfetch: js.Function1[FetchEvent, _] = js.native

  /** An event handler fired whenever an install event occurs — when a ServiceWorkerRegistration acquires a new
    * ServiceWorkerRegistration.installing worker.
    */
  var oninstall: js.Function1[ExtendableEvent, _] = js.native

  /** An event handler fired whenever a message event occurs — when incoming messages are received. Controlled pages can
    * use the MessagePort.postMessage method to send messages to service workers. The service worker can optionally send
    * a response back via the MessagePort exposed in event.data.port, corresponding to the controlled page.
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** Forces the waiting service worker to become the active service worker. This method can be used with
    * [[Clients.claim]] to ensure that updates to the underlying service worker take effect immediately for both the
    * current client and all other active clients.
    */
  def skipWaiting(): js.Promise[Unit] = js.native
}

@js.native
@JSGlobalScope
object ServiceWorkerGlobalScope extends js.Object {
  def self: ServiceWorkerGlobalScope = js.native
}
