package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Provides PVRTC texture compression support. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/
  */
@js.native
trait WebGLCompressedTexturePVRTC extends js.Object {
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Int = js.native
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Int = js.native
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Int = js.native
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Int = js.native
}
