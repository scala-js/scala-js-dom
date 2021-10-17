package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait AppendMode extends js.Any

object AppendMode {
  val segments: AppendMode = "segments".asInstanceOf[AppendMode]
  val sequence: AppendMode = "sequence".asInstanceOf[AppendMode]
}
