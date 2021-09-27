package org.scalajs.dom.experimental.push

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBuffer

/** The PushSubscription interface of the Push API provides a subcription's URL endpoint and allows unsubscription from
  * a push service.
  *
  * An instance of this interface can be serialized.
  */
@js.native
trait PushSubscription extends js.Object {

  /** The endpoint read-only property of the PushSubscription interface returns a USVString containing the endpoint
    * associated with the push subscription. The endpoint takes the form of a custom URL pointing to a push server,
    * which can be used to send a push message to the particular service worker instance that subscribed to the push
    * service. For this reason, it is a good idea to keep your endPoint a secret, so others do not hijack it and abuse
    * the push functionality.
    */
  val endpoint: String = js.native

  /** The expirationTime read-only property of the PushSubscription interface returns a DOMHighResTimeStamp of the
    * subscription expiration time associated with the push subscription, if there is one, or null otherwise.
    */
  val expirationTime: java.lang.Double = js.native

  /** The options read-only property of the PushSubscription interface is an object containing containing the options
    * used to create the subscription.
    */
  val options: PushSubscriptionOptions = js.native

  /** The getKey method retrieves keying material that can be used for encrypting and authenticating messages. */
  def getKey(name: PushEncryptionKeyName): ArrayBuffer = js.native

  /** The unsubscribe() method of the PushSubscription interface returns a Promise that resolves to a Boolean when the
    * current subscription is successfully unsubscribed.
    */
  def unsubscribe(): js.Promise[Boolean] = js.native

  /** The toJSON() method of the PushSubscription interface is a standard serializer: it returns a JSON representation
    * of the subscription properties, providing a useful shortcut.
    */
  def toJSON(): PushSubscriptionJSON = js.native
}
