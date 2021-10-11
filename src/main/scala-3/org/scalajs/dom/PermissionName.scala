package org.scalajs.dom

import scala.scalajs.js

opaque type PermissionName = String

object PermissionName {
  val geolocation: PermissionName = "geolocation"
  val midi: PermissionName = "midi"
  val notifications: PermissionName = "notifications"
  val push: PermissionName = "push"

  val `persistent-storage`: PermissionName =
    "persistent-storage"
}
