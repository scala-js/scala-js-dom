package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** The EXT_texture_compression_bptc extension is part of the WebGL API and exposes 4 BPTC compressed texture formats.
  * These compression formats are called BC7 and BC6H in Microsoft's DirectX API.
  *
  * WebGL extensions are available using the [[org.scalajs.dom.WebGLRenderingContext.getExtension]] and
  * [[org.scalajs.dom.WebGL2RenderingContext.getExtension]] methods.
  *
  * Note: Support depends on the system's graphics driver. There is no support on Windows.
  *
  * Note: This extension is available to both WebGL1 and WebGL2 contexts.
  *
  * The compressed texture formats are exposed by four constants and can be used in the
  * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_texture_compression_bptc/
  * @see
  *   https://docs.microsoft.com/windows/win32/direct3d11/bc7-format
  * @see
  *   https://docs.microsoft.com/windows/win32/direct3d11/bc6h-format
  * @example
  *   {{{
  * val ext = gl.getExtension("EXT_texture_compression_bptc")
  *
  * val texture = gl.createTexture()
  * gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
  *
  * gl.compressedTexImage2D(
  *   WebGLRenderingContext.TEXTURE_2D,
  *   0,
  *   ext.COMPRESSED_RGBA_BPTC_UNORM_EXT,
  *   128,
  *   128,
  *   0,
  *   textureData
  * )
  *   }}}
  */
@js.native
trait EXTTextureCompressionBPTC extends js.Object {

  /** Compresses 8-bit fixed-point data. Each 4x4 block of texels consists of 128 bits of RGBA or image data. See also
    * BC7 format.
    */
  val COMPRESSED_RGBA_BPTC_UNORM_EXT: Int = js.native

  /** Compresses 8-bit fixed-point data. Each 4x4 block of texels consists of 128 bits of SRGB_ALPHA or image data. See
    * also BC7 format.
    */
  val COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT: Int = js.native

  /** Compresses high dynamic range signed floating point values. Each 4x4 block of texels consists of 128 bits of RGB
    * data. It only contains RGB data, so the returned alpha value is 1.0. See also BC6H format.
    */
  val COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT: Int = js.native

  /** Compresses high dynamic range unsigned floating point values. Each 4x4 block of texels consists of 128 bits of RGB
    * data. It only contains RGB data, so the returned alpha value is 1.0. See also BC6H format.
    */
  val COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT: Int = js.native
}
