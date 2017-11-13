package org.scalajs.dom.experimental

import language.implicitConversions
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Implements the Permissions API.
  *
  * [[https://www.w3.org/TR/permissions/ W3C Working Draft]]
  */
package object permissions {

  @js.native
  trait PermissionState extends js.Any

  final val `granted` = "granted".asInstanceOf[PermissionState]
  final val `denied` = "denied".asInstanceOf[PermissionState]
  final val `prompt` = "prompt".asInstanceOf[PermissionState]

  @ScalaJSDefined
  trait PermissionStatus extends dom.raw.EventTarget {
    val state: PermissionState
    val onchange: js.Function1[PermissionState, _]
  }

  @ScalaJSDefined
  trait Permissions extends js.Any {
    def query(permissionDescriptor: js.Object): js.Promise[PermissionStatus]
  }

  @ScalaJSDefined
  trait PermissionsNavigator extends js.Any {
    val permissions: Permissions
  }

  implicit def toPermissions(navigator: dom.raw.Navigator): PermissionsNavigator =
    navigator.asInstanceOf[PermissionsNavigator]

}
