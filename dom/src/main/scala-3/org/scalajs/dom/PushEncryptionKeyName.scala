package org.scalajs.dom

import scala.scalajs.js

/** This represents a JavaScript enumeration representing the various keys you an request from a [[PushSubscription]] as
  * described here: [[http://www.w3.org/TR/push-api/#idl-def-PushEncryptionKeyName]]
  */
opaque type PushEncryptionKeyName <: String = String

/** Static definitions for [[PushEncryptionKeyName]] */
object PushEncryptionKeyName {

  /** used to retrieve the P-256 ECDH Diffie-Hellman public key described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val p256dh: PushEncryptionKeyName = "p256dh"

  /** used to retrieve the authentication secret described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val auth: PushEncryptionKeyName = "auth"
}
