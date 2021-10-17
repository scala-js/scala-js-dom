package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.Uint8Array

/** A PushSubscriptionOptions object represents additional options associated with a push subscription.
  *
  * The userVisibleOnly option, when set to true, indicates that the push subscription will only be used for push
  * messages whose effect is made visible to the user, for example by displaying a Web Notification.
  *
  * The applicationServerKey option defines the public key your application server uses for sending messages to clients
  * via a push server endpoint.
  */
trait PushSubscriptionOptions extends js.Object {
  var userVisibleOnly: js.UndefOr[Boolean] = js.undefined
  var applicationServerKey: js.UndefOr[Uint8Array] = js.undefined
}
