package org.scalajs.dom

import scala.scalajs.js

opaque type FileSystemHandleKind <: String = String

object FileSystemHandleKind {
  val file: FileSystemHandleKind = "file"
  val directory: FileSystemHandleKind = "directory"
}
