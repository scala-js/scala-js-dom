package org.scalajs.dom.experimental.serviceworkers

import scala.scalajs.js

/** [[https://slightlyoff.github.io/ServiceWorker/spec/service_worker_1/#client ¶4.2 Client]] of Service Workers 1 spec.
  */
@js.native
trait Client extends js.Object {

  /** The url attribute must return the context object's associated service worker client's serialized creation url. */
  def url: String = js.native

  def frameType: FrameType = js.native

  /** The id attribute must return its associated service worker client's id. */
  def id: String = js.native

  /** Allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received
    * in the "message" event on navigator.serviceWorker.
    *
    * @param transfer
    *   A sequence of objects that are transferred with the message. The ownership of these objects is given to the
    *   destination side and they are no longer usable on the sending side.
    */
  def postMessage(message: js.Any, transfer: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native
}
