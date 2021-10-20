package org.scalajs.dom

import scala.scalajs.js

/** The PushEvent interface of the Push API represents a push message that has been received. This event is sent to the
  * global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
  */
@js.native
trait PushEvent extends ExtendableEvent {

  /** Returns a reference to a PushMessageData object containing data sent to the PushSubscription. Read-only. */
  val data: PushMessageData = js.native
}
