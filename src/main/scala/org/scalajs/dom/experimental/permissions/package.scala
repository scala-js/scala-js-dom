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
  trait PermissionState extends js.Any

  object PermissionState {
    final val granted = "granted".asInstanceOf[PermissionState]
    final val denied = "denied".asInstanceOf[PermissionState]
    final val prompt = "prompt".asInstanceOf[PermissionState]
  }

  trait PermissionStatus extends dom.raw.EventTarget {
    val state: PermissionState
    val onchange: js.Function1[PermissionState, _]
  }

  trait Permissions extends js.Any {
    def query(permissionDescriptor: js.Object): js.Promise[PermissionStatus]
  }

  trait PermissionsNavigator extends js.Any {
    val permissions: Permissions
  }

  implicit def toPermissions(
      navigator: dom.raw.Navigator): PermissionsNavigator =
    navigator.asInstanceOf[PermissionsNavigator]

}
