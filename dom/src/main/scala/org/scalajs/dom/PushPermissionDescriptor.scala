package org.scalajs.dom

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
