package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait FileSystemHandleKind extends js.Any

object FileSystemHandleKind {
  val file: FileSystemHandleKind = "file".asInstanceOf[FileSystemHandleKind]
  val directory: FileSystemHandleKind = "directory".asInstanceOf[FileSystemHandleKind]
}
