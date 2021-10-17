package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait PermissionName extends js.Any

object PermissionName {
  val geolocation: PermissionName = "geolocation".asInstanceOf[PermissionName]
  val midi: PermissionName = "midi".asInstanceOf[PermissionName]
  val notifications: PermissionName = "notifications".asInstanceOf[PermissionName]
  val push: PermissionName = "push".asInstanceOf[PermissionName]

  val `persistent-storage` =
    "persistent-storage".asInstanceOf[PermissionName]
}
