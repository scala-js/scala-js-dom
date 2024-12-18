package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** The WEBGL_compressed_texture_s3tc_srgb extension is part of the WebGL API and exposes four S3TC compressed texture
  * formats.
  *
  * Compressed textures reduce the amount of memory needed to store a texture on the GPU, allowing for higher resolution
  * textures or more of the same resolution textures.
  *
  * WebGL extensions are available using the [[org.scalajs.dom.WebGLRenderingContext.getExtension]] and
  * [[org.scalajs.dom.WebGL2RenderingContext.getExtension]] methods.
  *
  * Note: This extension is available to both WebGL1 and WebGL2 contexts.
  *
  * The compressed texture formats are exposed by four constants and can be used in the
  * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc_srgb/
  * @example
  *   {{{
  * val ext = gl.getExtension("WEBGL_compressed_texture_s3tc_srgb")
  *
  * val texture = gl.createTexture()
  * gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
  *
  * gl.compressedTexImage2D(
  *   WebGLRenderingContext.TEXTURE_2D,
  *   0,
  *   ext.COMPRESSED_SRGB_S3TC_DXT1_EXT,
  *   512,
  *   512,
  *   0,
  *   textureData
  * )
  *
  * gl.texParameteri(WebGLRenderingContext.TEXTURE_2D, WebGLRenderingContext.TEXTURE_MAG_FILTER, WebGLRenderingContext.LINEAR)
  * gl.texParameteri(WebGLRenderingContext.TEXTURE_2D, WebGLRenderingContext.TEXTURE_MIN_FILTER, WebGLRenderingContext.LINEAR)
  *   }}}
  */
@js.native
trait WebGLCompressedTextureS3TCSRGB extends js.Object {

  /** A DXT1-compressed image in an sRGB image format. */
  val COMPRESSED_SRGB_S3TC_DXT1_EXT: Int = js.native

  /** A DXT1-compressed image in an sRGB image format with a simple on/off alpha value. */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: Int = js.native

  /** A DXT3-compressed image in an sRGBA image format. */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: Int = js.native

  /** A DXT5-compressed image in an sRGBA image format. */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: Int = js.native
}
