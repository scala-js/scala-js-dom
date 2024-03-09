package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.{WebGLRenderingContext, WebGL2RenderingContext}

import scala.scalajs.js

/** The WEBGL_compressed_texture_astc extension is part of the WebGL API and exposes Adaptive Scalable Texture
  * Compression (ASTC) compressed texture formats to WebGL.
  *
  * For more information, see the article ''Using ASTC Texture Compression for Game Assets'' by NVIDIA.
  *
  * WebGL extensions are available using the [[WebGLRenderingContext.getExtension]] and
  * [[WebGL2RenderingContext.getExtension]] methods.
  *
  * Note: ASTC compression is typically available on Mali ARM GPUs, Intel GPUs, and NVIDIA Tegra chips.
  *
  * Note: This extension is available to both WebGL1 and WebGL2 contexts.
  *
  * The compressed texture formats are exposed by 28 constants and can be used in the
  * WebGL2RenderingContext.compressedTexImage2D and WebGL2RenderingContext.compressedTexSubImage2D functions.
  *
  * @example
  *   {{{
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
  *   }}}
  */
@js.native
trait WebGLCompressedTextureASTC extends js.Object {

  /** Returns an array of strings containing the names of the ASTC profiles supported by the implementation. */
  def getSupportedProfiles: js.Array[String] = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 4x4    | 8.00           | floor((width + 3) / 4) * floor((height + 3) / 4) * 16 | 262144                            |
    */
  val COMPRESSED_RGBA_ASTC_4x4_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 4x4    | 8.00           | floor((width + 3) / 4) * floor((height + 3) / 4) * 16 | 262144                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 5x4    | 6.40           | floor((width + 4) / 5) * floor((height + 3) / 4) * 16 | 210944                            |
    */
  val COMPRESSED_RGBA_ASTC_5x4_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 5x4    | 6.40           | floor((width + 4) / 5) * floor((height + 3) / 4) * 16 | 210944                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 5x5    | 5.12           | floor((width + 4) / 5) * floor((height + 4) / 5) * 16 | 169744                            |
    */
  val COMPRESSED_RGBA_ASTC_5x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 5x5    | 5.12           | floor((width + 4) / 5) * floor((height + 4) / 5) * 16 | 169744                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 6x5    | 4.27           | floor((width + 5) / 6) * floor((height + 4) / 5) * 16 | 141728                            |
    */
  val COMPRESSED_RGBA_ASTC_6x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 6x5    | 4.27           | floor((width + 5) / 6) * floor((height + 4) / 5) * 16 | 141728                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 6x6    | 3.56           | floor((width + 5) / 6) * floor((height + 5) / 6) * 16 | 118336                            |
    */
  val COMPRESSED_RGBA_ASTC_6x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 6x6    | 3.56           | floor((width + 5) / 6) * floor((height + 5) / 6) * 16 | 118336                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x5    | 3.20           | floor((width + 7) / 8) * floor((height + 4) / 5) * 16 | 105472                            |
    */
  val COMPRESSED_RGBA_ASTC_8x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x5    | 3.20           | floor((width + 7) / 8) * floor((height + 4) / 5) * 16 | 105472                            |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x6    | 2.67           | floor((width + 7) / 8) * floor((height + 5) / 6) * 16 | 88064                             |
    */
  val COMPRESSED_RGBA_ASTC_8x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x6    | 2.67           | floor((width + 7) / 8) * floor((height + 5) / 6) * 16 | 88064                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x8    | 2.00           | floor((width + 7) / 8) * floor((height + 7) / 8) * 16 | 65536                             |
    */
  val COMPRESSED_RGBA_ASTC_8x8_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                | bytes if height and width are 512 |
    * |:-------|:---------------|:------------------------------------------------------|:----------------------------------|
    * | 8x8    | 2.00           | floor((width + 7) / 8) * floor((height + 7) / 8) * 16 | 65536                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x5   | 2.56           | floor((width + 9) / 10) * floor((height + 4) / 5) * 16 | 85696                             |
    */
  val COMPRESSED_RGBA_ASTC_10x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x5   | 2.56           | floor((width + 9) / 10) * floor((height + 4) / 5) * 16 | 85696                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x6   | 2.13           | floor((width + 9) / 10) * floor((height + 5) / 6) * 16 | 71552                             |
    */
  val COMPRESSED_RGBA_ASTC_10x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x6   | 2.13           | floor((width + 9) / 10) * floor((height + 5) / 6) * 16 | 71552                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x8   | 1.60           | floor((width + 9) / 10) * floor((height + 7) / 8) * 16 | 53248                             |
    */
  val COMPRESSED_RGBA_ASTC_10x8_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                 | bytes if height and width are 512 |
    * |:-------|:---------------|:-------------------------------------------------------|:----------------------------------|
    * | 10x8   | 1.60           | floor((width + 9) / 10) * floor((height + 7) / 8) * 16 | 53248                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                  | bytes if height and width are 512 |
    * |:-------|:---------------|:--------------------------------------------------------|:----------------------------------|
    * | 10x10  | 1.28           | floor((width + 9) / 10) * floor((height + 9) / 10) * 16 | 43264                             |
    */
  val COMPRESSED_RGBA_ASTC_10x10_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                  | bytes if height and width are 512 |
    * |:-------|:---------------|:--------------------------------------------------------|:----------------------------------|
    * | 10x10  | 1.28           | floor((width + 9) / 10) * floor((height + 9) / 10) * 16 | 43264                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                   | bytes if height and width are 512 |
    * |:-------|:---------------|:---------------------------------------------------------|:----------------------------------|
    * | 12x10  | 1.07           | floor((width + 11) / 12) * floor((height + 9) / 10) * 16 | 35776                             |
    */
  val COMPRESSED_RGBA_ASTC_12x10_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                   | bytes if height and width are 512 |
    * |:-------|:---------------|:---------------------------------------------------------|:----------------------------------|
    * | 12x10  | 1.07           | floor((width + 11) / 12) * floor((height + 9) / 10) * 16 | 35776                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                    | bytes if height and width are 512 |
    * |:-------|:---------------|:----------------------------------------------------------|:----------------------------------|
    * | 12x12  | 0.89           | floor((width + 11) / 12) * floor((height + 11) / 12) * 16 | 29584                             |
    */
  val COMPRESSED_RGBA_ASTC_12x12_KHR: Int = js.native

  /** | Blocks | Bits per pixel | ArrayBuffer bytelength                                    | bytes if height and width are 512 |
    * |:-------|:---------------|:----------------------------------------------------------|:----------------------------------|
    * | 12x12  | 0.89           | floor((width + 11) / 12) * floor((height + 11) / 12) * 16 | 29584                             |
    */
  val COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR: Int = js.native
}
