package org.scalajs.dom

import scala.scalajs.js

opaque type WriteCommandType <: String = String

object WriteCommandType {
  val write: WriteCommandType = "write"
  val seek: WriteCommandType = "seek"
  val truncate: WriteCommandType = "truncate"
}
