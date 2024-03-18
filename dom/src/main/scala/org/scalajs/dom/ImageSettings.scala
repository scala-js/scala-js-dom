package org.scalajs.dom

import scala.scalajs.js

trait ImageSettings extends js.Object {
  var colorSpace: js.UndefOr[String] = js.undefined
}

object ImageSettings {
  lazy val sRGB: ImageSettings = js.Dynamic.literal(colorSpace = "srgb").asInstanceOf[ImageSettings]
  lazy val displayP3: ImageSettings = js.Dynamic.literal(colorSpace = "display-p3").asInstanceOf[ImageSettings]
}
