package org.scalajs.dom

import scala.scalajs.js

opaque type PredefinedColorSpace <: String = String

object PredefinedColorSpace {
  val srgb: PredefinedColorSpace = "srgb"

  val `display-p3`: PredefinedColorSpace = "display-p3"
}