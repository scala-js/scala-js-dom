package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait WriteCommandType extends js.Any

object WriteCommandType {
  val write: WriteCommandType = "write".asInstanceOf[WriteCommandType]
  val seek: WriteCommandType = "seek".asInstanceOf[WriteCommandType]
  val truncate: WriteCommandType = "truncate".asInstanceOf[WriteCommandType]
}
