package org.scalajs.dom

import scala.scalajs.js

opaque type PermissionState <: String = String

object PermissionState {
  val granted: PermissionState = "granted"
  val denied: PermissionState = "denied"
  val prompt: PermissionState = "prompt"
}
