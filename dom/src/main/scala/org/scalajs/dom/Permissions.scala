package org.scalajs.dom

import scala.scalajs.js

trait Permissions extends js.Object {
  def query(permissionDescriptor: PermissionDescriptor): js.Promise[PermissionStatus]
}
