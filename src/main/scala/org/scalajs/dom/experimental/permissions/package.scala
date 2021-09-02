package org.scalajs.dom.experimental

import org.scalajs.dom
import scala.language.implicitConversions
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
    val granted = "granted".asInstanceOf[PermissionState]
    val denied = "denied".asInstanceOf[PermissionState]
    val prompt = "prompt".asInstanceOf[PermissionState]
  }

  trait PermissionStatus extends dom.EventTarget {
    val state: PermissionState
    var onchange: js.Function1[dom.Event, _]
  }

  @js.native
  sealed trait PermissionName extends js.Any

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

  trait PushPermissionDescriptor extends PermissionDescriptor {
    val userVisibleOnly: Boolean
  }

  object PushPermissionDescriptor {
    @inline
    def apply(permissionUserVisibleOnly: Boolean): PushPermissionDescriptor = {
      new PushPermissionDescriptor {
        val name = PermissionName.push
        val userVisibleOnly = permissionUserVisibleOnly
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

  implicit def toPermissions(navigator: dom.Navigator): PermissionsNavigator =
    navigator.asInstanceOf[PermissionsNavigator]

}
