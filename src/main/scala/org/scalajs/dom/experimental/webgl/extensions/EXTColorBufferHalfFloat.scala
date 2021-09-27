package org.scalajs.dom.experimental.webgl.extensions

import org.scalajs.dom.WebGLShader
import scala.scalajs.js

/** Enables 16-bit float colour buffer support. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_half_float/
  */
@js.native
trait EXTColorBufferHalfFloat extends js.Object {
  val RGBA16F_EXT: Int = js.native
  val RGB16F_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Int = js.native
  val UNSIGNED_NORMALIZED_EXT: Int = js.native
}
