package org.scalajs.dom.experimental.webgl.extensions

import scala.scalajs.js

/** Enables nonlinear sRGB blending over framebuffers. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_sRGB/
  */
@js.native
trait EXTsRGB extends js.Object {
  val SRGB_EXT: Int = js.native
  val SRGB_ALPHA_EXT: Int = js.native
  val SRGB8_ALPHA8_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: Int = js.native
}
