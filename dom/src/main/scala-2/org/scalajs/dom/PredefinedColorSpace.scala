package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait PredefinedColorSpace extends js.Any

object PredefinedColorSpace {
  val srgb: PredefinedColorSpace = "srgb".asInstanceOf[PredefinedColorSpace]

  val `display-p3`: PredefinedColorSpace = "display-p3".asInstanceOf[PredefinedColorSpace]
}
