package org.scalajs.dom.experimental

import org.scalajs.dom

/** Implements the Permissions API.
  *
  * [[https://www.w3.org/TR/permissions/ W3C Working Draft]]
  */
package object permissions {

  @deprecated("use dom.PermissionState instead", "2.0.0")
  type PermissionState = dom.PermissionState

  @deprecated("use dom.PermissionState instead", "2.0.0")
  val PermissionState = dom.PermissionState

  @deprecated("use dom.PermissionStatus instead", "2.0.0")
  type PermissionStatus = dom.PermissionStatus

  @deprecated("use dom.PermissionName instead", "2.0.0")
  type PermissionName = dom.PermissionName

  @deprecated("use dom.PermissionName instead", "2.0.0")
  val PermissionName = dom.PermissionName

  @deprecated("use dom.PermissionDescriptor instead", "2.0.0")
  type PermissionDescriptor = dom.PermissionDescriptor

  @deprecated("use dom.PermissionDescriptor instead", "2.0.0")
  val PermissionDescriptor = dom.PermissionDescriptor

  @deprecated("use dom.PushPermissionDescriptor instead", "2.0.0")
  type PushPermissionDescriptor = dom.PushPermissionDescriptor

  @deprecated("use dom.PushPermissionDescriptor instead", "2.0.0")
  val PushPermissionDescriptor = dom.PushPermissionDescriptor

  @deprecated("use dom.Permissions instead", "2.0.0")
  type Permissions = dom.Permissions

  @deprecated("use dom.Navigator instead", "2.0.0")
  type PermissionsNavigator = dom.Navigator

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  def toPermissions(navigator: dom.Navigator): PermissionsNavigator =
    navigator

}
