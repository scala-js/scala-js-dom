package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture
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
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc/
  *
  * @example
  *   {{{
  * Option(gl.getExtension("WEBGL_compressed_texture_s3tc")).orElse(
  *   Option(gl.getExtension("MOZ_WEBGL_compressed_texture_s3tc").orElse(
  *   Option(gl.getExtension("WEBKIT_WEBGL_compressed_texture_s3tc")) match {
  *     case None => console.log("Your browser does not support the WEBGL_compressed_texture_s3tc extension.")
  *     case Some(extAny) =>
  *        val ext = extAny.asInstanceOf[WebGLCompressedTextureS3TC]
  *       val texture = gl.createTexture()
  *       gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
  *
  *       gl.compressedTexImage2D(
  *         WebGLRenderingContext.TEXTURE_2D,
  *         0,
  *         ext.COMPRESSED_RGBA_S3TC_DXT5_EXT,
  *         512,
  *         512,
  *         0,
  *         textureData,
  *       )
  *
  *       gl.texParameteri(WebGL2RenderingContext.TEXTURE_2D, WebGLRenderingContext.TEXTURE_MAG_FILTER, WebGLRenderingContext.LINEAR)
  *       gl.texParameteri(WebGL2RenderingContext.TEXTURE_2D, WebGLRenderingContext.TEXTURE_MIN_FILTER, WebGLRenderingContext.LINEAR)
  * }
  *   }}}
  */
@js.native
trait WebGLCompressedTextureS3TC extends js.Object {

  /** A DXT1-compressed image in an RGB image format. */
  val COMPRESSED_RGB_S3TC_DXT1_EXT: Int = js.native

  /** A DXT3-compressed image in an RGBA image format. Compared to a 32-bit RGBA texture, it offers 4:1 compression. */
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = js.native

  /** A DXT1-compressed image in an RGB image format with a simple on/off alpha value. */
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = js.native

  /** A DXT5-compressed image in an RGBA image format. It also provides a 4:1 compression, but differs to the DXT3
    * compression in how the alpha compression is done.
    */
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = js.native
}
