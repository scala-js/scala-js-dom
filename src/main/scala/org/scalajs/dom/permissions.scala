package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait PermissionState extends js.Any

object PermissionState {
  val granted: PermissionState = "granted".asInstanceOf[PermissionState]
  val denied: PermissionState = "denied".asInstanceOf[PermissionState]
  val prompt: PermissionState = "prompt".asInstanceOf[PermissionState]
}

trait PermissionStatus extends EventTarget {
  val state: PermissionState
  var onchange: js.Function1[Event, _]
}

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

trait PermissionDescriptor extends js.Object {
  val name: PermissionName
}

@deprecated("all the members of PermissionDescriptor are deprecated", "2.0.0")
object PermissionDescriptor {

  @deprecated("use `new PermissionDescriptor { ... }` instead", "2.0.0")
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

@deprecated("all the members of PushPermissionDescriptor are deprecated", "2.0.0")
object PushPermissionDescriptor {

  @deprecated("use `new PushPermissionDescriptor { ... }` instead", "2.0.0")
  @inline
  def apply(permissionUserVisibleOnly: Boolean): PushPermissionDescriptor = {
    new PushPermissionDescriptor {
      val name = PermissionName.push
      val userVisibleOnly = permissionUserVisibleOnly
    }
  }
}

trait Permissions extends js.Object {
  def query(permissionDescriptor: PermissionDescriptor): js.Promise[PermissionStatus]
}
