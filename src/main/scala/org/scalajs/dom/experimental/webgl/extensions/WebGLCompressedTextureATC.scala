package org.scalajs.dom.experimental.webgl.extensions

import scala.scalajs.js

/** Provides ATC texture compression support. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_atc/
  */
@js.native
trait WebGLCompressedTextureATC extends js.Object {
  val COMPRESSED_RGB_ATC_WEBGL: Int = js.native
  val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Int = js.native
  val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Int = js.native
}
