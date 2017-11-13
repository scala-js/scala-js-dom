package org.scalajs.dom.experimental

import scala.language.implicitConversions

import org.scalajs.dom

import scala.scalajs.js

/**
 * Implements the Permissions API.
 *
 * [[https://www.w3.org/TR/permissions/ W3C Working Draft]]
 */
package object permissions {

  @js.native
  sealed trait PermissionState extends js.Any

  object PermissionState {
    final val granted = "granted".asInstanceOf[PermissionState]
    final val denied = "denied".asInstanceOf[PermissionState]
    final val prompt = "prompt".asInstanceOf[PermissionState]
  }

  trait PermissionStatus extends dom.raw.EventTarget {
    val state: PermissionState
    val onchange: js.Function1[PermissionState, _]
  }

  @js.native
  trait PermissionName extends js.Any

  object PermissionName {
    val geolocation = "geolocation".asInstanceOf[PermissionName]
    val midi = "midi".asInstanceOf[PermissionName]
    val notifications = "notifications".asInstanceOf[PermissionName]
    val push = "push".asInstanceOf[PermissionName]
    val `persistent-storage` =
      "persistent-storage".asInstanceOf[PermissionName]
  }

  trait PermissionDescriptor extends js.Object {
    val name: PermissionName
  }

  object PermissionDescriptor {
    @inline
    def apply(permissionName: PermissionName): PermissionDescriptor = {
      new PermissionDescriptor {
        val name = permissionName
      }
    }
  }

  trait Permissions extends js.Object {
    def query(
        permissionDescriptor: PermissionDescriptor): js.Promise[PermissionStatus]
  }

  trait PermissionsNavigator extends js.Object {
    val permissions: Permissions
  }

  implicit def toPermissions(
      navigator: dom.raw.Navigator): PermissionsNavigator =
    navigator.asInstanceOf[PermissionsNavigator]

}
