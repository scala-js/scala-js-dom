package org.scalajs.dom.experimental

import org.scalajs.dom

/**
 * @deprecated
 *
 * WebGL v1 API is graduated from experimental.
 * Use [[org.scalajs.dom.webgl]] instead.
 */
package object webgl {

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  type WebGLRenderingContextOps = dom.webgl.WebGLRenderingContextOps

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  type WebGLExtensionIdentifier[T] = dom.webgl.WebGLExtensionIdentifier[T]

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_texture_float = dom.webgl.OES_texture_float

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_texture_half_float = dom.webgl.OES_texture_half_float

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_lose_context = dom.webgl.WEBGL_lose_context

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_standard_derivatives = dom.webgl.OES_standard_derivatives

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_vertex_array_object = dom.webgl.OES_vertex_array_object

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_debug_renderer_info = dom.webgl.WEBGL_debug_renderer_info

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_debug_shaders = dom.webgl.WEBGL_debug_shaders

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_compressed_texture_s3tc = dom.webgl.WEBGL_compressed_texture_s3tc

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_depth_texture = dom.webgl.WEBGL_depth_texture

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_element_index_uint = dom.webgl.OES_element_index_uint

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_texture_filter_anisotropic = dom.webgl.EXT_texture_filter_anisotropic

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_frag_depth = dom.webgl.EXT_frag_depth

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_draw_buffers = dom.webgl.WEBGL_draw_buffers

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val ANGLE_instanced_arrays = dom.webgl.ANGLE_instanced_arrays

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_texture_float_linear = dom.webgl.OES_texture_float_linear

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val OES_texture_half_float_linear = dom.webgl.OES_texture_half_float_linear

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_blend_minmax = dom.webgl.EXT_blend_minmax

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_shader_texture_lod = dom.webgl.EXT_shader_texture_lod

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_compressed_texture_atc = dom.webgl.WEBGL_compressed_texture_atc

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_compressed_texture_pvrtc = dom.webgl.WEBGL_compressed_texture_pvrtc

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_color_buffer_half_float = dom.webgl.EXT_color_buffer_half_float

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_color_buffer_float = dom.webgl.WEBGL_color_buffer_float

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_sRGB = dom.webgl.EXT_sRGB

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val WEBGL_compressed_texture_etc1 = dom.webgl.WEBGL_compressed_texture_etc1

  @deprecated("Use the one defined in org.scalajs.webgl", "0.9.8")
  val EXT_disjoint_timer_query = dom.webgl.EXT_disjoint_timer_query
}
