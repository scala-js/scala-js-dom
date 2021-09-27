package org.scalajs.dom.experimental.webgl.extensions

import org.scalajs.dom.WebGLShader
import scala.scalajs.js

/** Adds anisotropic texture filtering support. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_texture_filter_anisotropic/
  */
@js.native
trait EXTTextureFilterAnisotropic extends js.Object {
  val TEXTURE_MAX_ANISOTROPY_EXT: Int = js.native
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: Int = js.native
}
