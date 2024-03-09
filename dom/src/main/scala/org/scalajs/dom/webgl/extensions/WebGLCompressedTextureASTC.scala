package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.{WebGLRenderingContext, WebGL2RenderingContext}

import scala.scalajs.js

/** The WEBGL_compressed_texture_astc extension is part of the WebGL API and exposes Adaptive Scalable Texture Compression (ASTC) compressed texture formats to WebGL.
 *
 * For more information, see the article ''Using ASTC Texture Compression for Game Assets'' by NVIDIA.
 *
 * WebGL extensions are available using the [[WebGLRenderingContext.getExtension]] and [[WebGL2RenderingContext.getExtension]] methods.
 *
 * Note: ASTC compression is typically available on Mali ARM GPUs, Intel GPUs, and NVIDIA Tegra chips.
 *
 * Note: This extension is available to both WebGL1 and WebGL2 contexts.
 *
 * The compressed texture formats are exposed by 28 constants and can be used in the
 * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
 *
 * @example
 * {{{
 * val ext = gl.getExtension("WEBGL_compressed_texture_astc")
 *
 * val texture = gl.createTexture()
 * gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, texture)
 *
 * gl.compressedTexImage2D(
 *   WebGLRenderingContext.TEXTURE_2D,
 *   0,
 *   ext.COMPRESSED_RGBA_ASTC_12x12_KHR,
 *   512,
 *   512,
 *   0,
 *   textureData
 * )
 * }}}
 */
@js.native
trait WebGLCompressedTextureASTC extends js.Object {
  /** Returns an array of strings containing the names of the ASTC profiles supported by the implementation. */
  def getSupportedProfiles: js.Array[String] = js.native

  /** Blocks: 4x4
   * Bits per pixel: 8.00
   * ArrayBuffer bytelength: floor((width + 3) / 4) * floor((height + 3) / 4) * 16
   * bytes if height and width are 512: 262144
  */
  val COMPRESSED_RGBA_ASTC_4x4_KHR: Int = js.native
  /** Blocks: 4x4
   * Bits per pixel: 8.00
   * ArrayBuffer bytelength: floor((width + 3) / 4) * floor((height + 3) / 4) * 16
   * bytes if height and width are 512: 262144
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR: Int = js.native
  /** Blocks: 5x4
   * Bits per pixel: 6.40
   * ArrayBuffer bytelength: floor((width + 4) / 5) * floor((height + 3) / 4) * 16
   * bytes if height and width are 512: 210944
  */
  val COMPRESSED_RGBA_ASTC_5x4_KHR: Int = js.native
  /** Blocks: 5x4
   * Bits per pixel: 6.40
   * ArrayBuffer bytelength: floor((width + 4) / 5) * floor((height + 3) / 4) * 16
   * bytes if height and width are 512: 210944
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR: Int = js.native
  /** Blocks: 5x5
   * Bits per pixel: 5.12
   * ArrayBuffer bytelength: floor((width + 4) / 5) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 169744
  */
  val COMPRESSED_RGBA_ASTC_5x5_KHR: Int = js.native
  /** Blocks: 5x5
   * Bits per pixel: 5.12
   * ArrayBuffer bytelength: floor((width + 4) / 5) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 169744
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR: Int = js.native
  /** Blocks: 6x5
   * Bits per pixel: 4.27
   * ArrayBuffer bytelength: floor((width + 5) / 6) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 141728
  */
  val COMPRESSED_RGBA_ASTC_6x5_KHR: Int = js.native
  /** Blocks: 6x5
   * Bits per pixel: 4.27
   * ArrayBuffer bytelength: floor((width + 5) / 6) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 141728
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR: Int = js.native
  /** Blocks: 6x6
   * Bits per pixel: 3.56
   * ArrayBuffer bytelength: floor((width + 5) / 6) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 118336
  */
  val COMPRESSED_RGBA_ASTC_6x6_KHR: Int = js.native
  /** Blocks: 6x6
   * Bits per pixel: 3.56
   * ArrayBuffer bytelength: floor((width + 5) / 6) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 118336
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR: Int = js.native
  /** Blocks: 8x5
   * Bits per pixel: 3.20
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 105472
  */
  val COMPRESSED_RGBA_ASTC_8x5_KHR: Int = js.native
  /** Blocks: 8x5
   * Bits per pixel: 3.20
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 105472
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR: Int = js.native
  /** Blocks: 8x6
   * Bits per pixel: 2.67
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 88064
  */
  val COMPRESSED_RGBA_ASTC_8x6_KHR: Int = js.native
  /** Blocks: 8x6
   * Bits per pixel: 2.67
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 88064
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR: Int = js.native
  /** Blocks: 8x8
   * Bits per pixel: 2.00
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 7) / 8) * 16
   * bytes if height and width are 512: 65536
  */
  val COMPRESSED_RGBA_ASTC_8x8_KHR: Int = js.native
  /** Blocks: 8x8
   * Bits per pixel: 2.00
   * ArrayBuffer bytelength: floor((width + 7) / 8) * floor((height + 7) / 8) * 16
   * bytes if height and width are 512: 65536
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR: Int = js.native
  /** Blocks: 10x5
   * Bits per pixel: 2.56
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 85696
  */
  val COMPRESSED_RGBA_ASTC_10x5_KHR: Int = js.native
  /** Blocks: 10x5
   * Bits per pixel: 2.56
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 4) / 5) * 16
   * bytes if height and width are 512: 85696
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR: Int = js.native
  /** Blocks: 10x6
   * Bits per pixel: 2.13
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 71552
   */
  val COMPRESSED_RGBA_ASTC_10x6_KHR: Int = js.native
  /** Blocks: 10x6
   * Bits per pixel: 2.13
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 5) / 6) * 16
   * bytes if height and width are 512: 71552
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR: Int = js.native
  /** Blocks: 10x8
   * Bits per pixel: 1.60
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 7) / 8) * 16
   * bytes if height and width are 512: 53248
  */
  val COMPRESSED_RGBA_ASTC_10x8_KHR: Int = js.native
  /** Blocks: 10x8
   * Bits per pixel: 1.60
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 7) / 8) * 16
   * bytes if height and width are 512: 53248
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR: Int = js.native
  /** Blocks: 10x10
   * Bits per pixel: 1.28
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 9) / 10) * 16
   * bytes if height and width are 512: 43264
  */
  val COMPRESSED_RGBA_ASTC_10x10_KHR: Int = js.native
  /** Blocks: 10x10
   * Bits per pixel: 1.28
   * ArrayBuffer bytelength: floor((width + 9) / 10) * floor((height + 9) / 10) * 16
   * bytes if height and width are 512: 43264
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR: Int = js.native
  /** Blocks: 12x10
   * Bits per pixel: 1.07
   * ArrayBuffer bytelength: floor((width + 11) / 12) * floor((height + 9) / 10) * 16
   * bytes if height and width are 512: 35776
  */
  val COMPRESSED_RGBA_ASTC_12x10_KHR: Int = js.native
  /** Blocks: 12x10
   * Bits per pixel: 1.07
   * ArrayBuffer bytelength: floor((width + 11) / 12) * floor((height + 9) / 10) * 16
   * bytes if height and width are 512: 35776
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR: Int = js.native
  /** Blocks: 12x12
   * Bits per pixel: 0.89
   * ArrayBuffer bytelength: floor((width + 11) / 12) * floor((height + 11) / 12) * 16
   * bytes if height and width are 512: 29584
  */
  val COMPRESSED_RGBA_ASTC_12x12_KHR: Int = js.native
  /** Blocks: 12x12
   * Bits per pixel: 0.89
   * ArrayBuffer bytelength: floor((width + 11) / 12) * floor((height + 11) / 12) * 16
   * bytes if height and width are 512: 29584
  */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR: Int = js.native
}
