package org.scalajs.dom

import scala.scalajs.js

/** This represents a JavaScript enumeration describing the state of permissions for pushing described here:
  * [[http://www.w3.org/TR/push-api/#idl-def-PushPermissionState]]
  */
opaque type PushPermissionState <: String = String

/** Static definitions for [[PushPermissionState]] */
object PushPermissionState {

  /** The webapp has permission to use the Push API. */
  val granted: PushPermissionState = "granted"

  /** The webapp has been denied permission to use the Push API. */
  val denied: PushPermissionState = "denied"

  /** The webapp needs to ask for permission in order to use the Push API. */
  val prompt: PushPermissionState = "prompt"
}
