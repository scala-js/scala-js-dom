package org.scalajs.dom.experimental.push

import org.scalajs.dom.Blob
import org.scalajs.dom.experimental.serviceworkers.ExtendableEvent
import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** The PushManager interface of the Push API provides a way to receive notifications from third-party servers as well
  * as request URLs for push notifications.
  *
  * This interface is accessed via the ServiceWorkerRegistration.pushManager property.
  *
  * The Push API is currently specified here: [[https://www.w3.org/TR/2018/WD-push-api-20181026/]]
  */
@js.native
trait PushManager extends js.Object {

  /** Retrieves an existing push subscription. It returns a Promise that resolves to a PushSubscription object
    * containing details of an existing subscription. If no existing subscription exists, this resolves to a null value.
    */
  def getSubscription(): js.Promise[PushSubscription] = js.native

  /** The permissionState() method of the PushManager interface returns a Promise that resolves to a DOMString
    * indicating the permission state of the push manager. Possible values are 'prompt', 'denied', or 'granted'.
    *
    * @param options
    *   An object containing optional configuration parameters. It can have the following properties:
    *   - userVisibleOnly: A boolean indicating that the returned push subscription will only be used for messages whose
    *     effect is made visible to the user.
    */
  def permissionState(options: PushSubscriptionOptions = js.native): js.Promise[PushPermissionState] = js.native

  /** The subscribe() method of the PushManager interface subscribes to a push service.
    *
    * It returns a Promise that resolves to a PushSubscription object containing details of a push subscription. A new
    * push subscription is created if the current service worker does not have an existing subscription.
    */
  def subscribe(options: PushSubscriptionOptions = js.native): js.Promise[PushSubscription] = js.native
}

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

/** A PushSubscriptionJSON dictionary represents the JSON type of a PushSubscription. In ECMAScript this can be
  * converted into a JSON string through the JSON.stringify function.
  */
@js.native
trait PushSubscriptionJSON extends js.Object {

  /** The endpoint contains the underlying value of the endpoint attribute. */
  val endpoint: String = js.native

  /** The endpoint contains the underlying value of the endpoint attribute. */
  val expirationTime: java.lang.Double = js.native

  /** The keys record contains an entry for each of the supported PushEncryptionKeyName entries to the URL-safe base64
    * encoded representation [RFC4648] of its value.
    */
  val keys: js.Dictionary[String] = js.native
}

/** The PushEvent interface of the Push API represents a push message that has been received. This event is sent to the
  * global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
  */
@js.native
trait PushEvent extends ExtendableEvent {

  /** Returns a reference to a PushMessageData object containing data sent to the PushSubscription. Read-only. */
  val data: PushMessageData = js.native
}

/** The PushMessageData interface of the Push API provides methods which let you retrieve the push data sent by a server
  * in various formats.
  *
  * Unlike the similar methods in the Fetch API, which only allow the method to be invoked once, these methods can be
  * called multiple times.
  */
@js.native
trait PushMessageData extends js.Object {

  /** Extracts the data as an ArrayBuffer object. */
  def arrayBuffer(): ArrayBuffer = js.native

  /** Extracts the data as a Blob object. */
  def blob(): Blob = js.native

  /** Extracts the data as a JSON object. */
  def json(): js.Any = js.native

  /** Extracts the data as a plain text string. */
  def text(): String = js.native
}

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

/** This represents a JavaScript enumeration describing the state of permissions for pushing described here:
  * [[http://www.w3.org/TR/push-api/#idl-def-PushPermissionState]]
  */
@js.native
sealed trait PushPermissionState extends js.Any

/** Static definitions for [[PushPermissionState]] */
object PushPermissionState {

  /** The webapp has permission to use the Push API. */
  val granted: PushPermissionState = "granted".asInstanceOf[PushPermissionState]

  /** The webapp has been denied permission to use the Push API. */
  val denied: PushPermissionState = "denied".asInstanceOf[PushPermissionState]

  /** The webapp needs to ask for permission in order to use the Push API. */
  val prompt: PushPermissionState = "prompt".asInstanceOf[PushPermissionState]
}

/** This represents a JavaScript enumeration representing the various keys you an request from a [[PushSubscription]] as
  * described here: [[http://www.w3.org/TR/push-api/#idl-def-PushEncryptionKeyName]]
  */
@js.native
sealed trait PushEncryptionKeyName extends js.Any

/** Static definitions for [[PushEncryptionKeyName]] */
object PushEncryptionKeyName {

  /** used to retrieve the P-256 ECDH Diffie-Hellman public key described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val p256dh: PushEncryptionKeyName = "p256dh".asInstanceOf[PushEncryptionKeyName]

  /** used to retrieve the authentication secret described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val auth: PushEncryptionKeyName = "auth".asInstanceOf[PushEncryptionKeyName]
}
