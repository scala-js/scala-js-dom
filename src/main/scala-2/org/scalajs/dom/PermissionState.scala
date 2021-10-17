package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait PermissionState extends js.Any

object PermissionState {
  val granted: PermissionState = "granted".asInstanceOf[PermissionState]
  val denied: PermissionState = "denied".asInstanceOf[PermissionState]
  val prompt: PermissionState = "prompt".asInstanceOf[PermissionState]
}
