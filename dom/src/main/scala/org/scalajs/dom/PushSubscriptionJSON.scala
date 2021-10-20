package org.scalajs.dom

import scala.scalajs.js

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
