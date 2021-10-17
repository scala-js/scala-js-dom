package org.scalajs.dom

import scala.scalajs.js

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
