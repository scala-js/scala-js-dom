package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.{WebGLRenderingContext, WebGL2RenderingContext}

import scala.scalajs.js

/** The WEBGL_compressed_texture_etc extension is part of the WebGL API and exposes 10 ETC/EAC compressed texture
  * formats.
  *
  * Compressed textures reduce the amount of memory needed to store a texture on the GPU, allowing for higher resolution
  * textures or more of the same resolution textures.
  *
  * WebGL extensions are available using the [[WebGLRenderingContext.getExtension]] and
  * [[WebGL2RenderingContext.getExtension]] methods.
  *
  * Note: This extension is available to both WebGL1 and WebGL2 contexts.
  *
  * The compressed texture formats are exposed by 10 constants and can be used in the
  * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_etc/
  *
  * @example
  *   {{{
  * val ext = gl.getExtension("WEBGL_compressed_texture_etc")
  *
  * val texture = gl.createTexture()
  * gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
  *
  * gl.compressedTexImage2D(
  *   WebGLRenderingContext.TEXTURE_2D,
  *   0,
  *   ext.COMPRESSED_RGBA8_ETC2_EAC,
  *   512,
  *   512,
  *   0,
  *   textureData
  * )
  *   }}}
  */
@js.native
trait WebGLCompressedTextureETC extends js.Object {

  /** One-channel (red) unsigned format compression. */
  val COMPRESSED_R11_EAC: Int = js.native

  /** One-channel (red) signed format compression. */
  val COMPRESSED_SIGNED_R11_EAC: Int = js.native

  /** Two-channel (red and green) unsigned format compression. */
  val COMPRESSED_RG11_EAC: Int = js.native

  /** Two-channel (red and green) signed format compression. */
  val COMPRESSED_SIGNED_RG11_EAC: Int = js.native

  /** Compresses RGB8 data with no alpha channel. */
  val COMPRESSED_RGB8_ETC2: Int = js.native

  /** Compresses RGBA8 data. The RGB part is encoded the same as RGB_ETC2, but the alpha part is encoded separately. */
  val COMPRESSED_RGBA8_ETC2_EAC: Int = js.native

  /** Compresses sRGB8 data with no alpha channel. */
  val COMPRESSED_SRGB8_ETC2: Int = js.native

  /** Compresses sRGBA8 data. The sRGB part is encoded the same as SRGB_ETC2, but the alpha part is encoded separately.
    */
  val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: Int = js.native

  /** Similar to RGB8_ETC, but with ability to punch through the alpha channel, which means to make it completely opaque
    * or transparent.
    */
  val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = js.native

  /** Similar to SRGB8_ETC, but with ability to punch through the alpha channel, which means to make it completely
    * opaque or transparent.
    */
  val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = js.native
}
