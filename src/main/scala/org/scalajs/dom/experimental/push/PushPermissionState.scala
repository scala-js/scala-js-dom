package org.scalajs.dom.experimental.push

import org.scalajs.dom.Blob
import org.scalajs.dom.experimental.serviceworkers.ExtendableEvent
import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

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
