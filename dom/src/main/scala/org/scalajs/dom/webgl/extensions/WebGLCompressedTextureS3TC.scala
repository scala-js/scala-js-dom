package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Provides S3TC texture compression support. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc/
  */
@js.native
trait WebGLCompressedTextureS3TC extends js.Object {
  val COMPRESSED_RGB_S3TC_DXT1_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = js.native
}
