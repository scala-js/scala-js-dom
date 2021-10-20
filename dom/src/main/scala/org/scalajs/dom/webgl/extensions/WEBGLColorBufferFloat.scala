package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Enables 32-bit float colour buffer support. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_float/
  */
@js.native
trait WEBGLColorBufferFloat extends js.Object {
  val RGBA32F_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Int = js.native
  val UNSIGNED_NORMALIZED_EXT: Int = js.native
}
