package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.{WebGLRenderingContext, WebGL2RenderingContext}

import scala.scalajs.js

/** The EXT_texture_compression_rgtc extension is part of the WebGL API and exposes 4 RGTC compressed texture formats.
  * RGTC is a block-based texture compression format suited for unsigned and signed red and red-green textures
  * (Red-Green Texture Compression).
  *
  * WebGL extensions are available using the [[WebGLRenderingContext.getExtension]] and
  * [[WebGL2RenderingContext.getExtension]] methods.
  *
  * Note: Support depends on the system's graphics driver. There is no support on Windows.
  *
  * Note: This extension is available to both WebGL1 and WebGL2 contexts.
  *
  * The compressed texture formats are exposed by four constants and can be used in the
  * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_texture_compression_rgtc/
  * @see
  *   https://docs.microsoft.com/windows/win32/direct3d10/d3d10-graphics-programming-guide-resources-block-compression#bc4
  * @see
  *   https://docs.microsoft.com/windows/win32/direct3d10/d3d10-graphics-programming-guide-resources-block-compression#bc5
  * @example
  *   {{{
  * val ext = gl.getExtension("EXT_texture_compression_rgtc")
  *
  * val texture = gl.createTexture()
  * gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
  *
  * gl.compressedTexImage2D(
  *   WebGLRenderingContext.TEXTURE_2D,
  *   0,
  *   ext.COMPRESSED_RED_RGTC1_EXT,
  *   128,
  *   128,
  *   0,
  *   textureData
  * )
  *   }}}
  */
@js.native
trait EXTTextureCompressionRGTC extends js.Object {

  /** Each 4x4 block of texels consists of 64 bits of unsigned red image data. See also BC4 unsigned. */
  val COMPRESSED_RED_RGTC1_EXT: Int = js.native

  /** Each 4x4 block of texels consists of 64 bits of signed red image data. See also BC4 signed. */
  val COMPRESSED_SIGNED_RED_RGTC1_EXT: Int = js.native

  /** Each 4x4 block of texels consists of 64 bits of compressed unsigned red image data followed by 64 bits of
    * compressed unsigned green image data. See also BC5 unsigned.
    */
  val COMPRESSED_RED_GREEN_RGTC2_EXT: Int = js.native

  /** Each 4x4 block of texels consists of 64 bits of compressed signed red image data followed by 64 bits of compressed
    * signed green image data. See also BC5 signed.
    */
  val COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: Int = js.native
}
