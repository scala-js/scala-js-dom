package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.raw.WebGLShader

import scala.scalajs.js

/**
 * Provides 32-bit floating point texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_texture_float/
 */
@js.native
trait OESTextureFloat extends js.Object

/**
 * Provides 32-bit floating point texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_texture_float/
 */
@js.native
trait OESTextureHalfFloat extends js.Object {
  val HALF_FLOAT_OES: Int = js.native
}

/**
 * Allows simulation of losing the WebGL context to aid debugging.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/
 */
@js.native
trait WebGLLoseContext extends js.Object {
  def loseContext(): Unit = js.native

  def restoreContext(): Unit = js.native
}

/**
 * Provides additional first derivative information in fragment shaders.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_standard_derivatives/
 */
@js.native
trait OESStandardDerivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: Int = js.native
}

/**
 * A vertex array object, as used by `OES_vertex_array_object`.
 */
@js.native
trait WebGLVertexArrayObjectOES extends js.Object

/**
 * Provides Vertex Array Objects (VAOs).
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/
 */
@js.native
trait OESVertexArrayObject extends js.Object {
  val VERTEX_ARRAY_BINDING_OES: Int = js.native
  def createVertexArrayOES(): WebGLVertexArrayObjectOES = js.native
  def deleteVertexArrayOES(
      arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  def isVertexArrayOES(
      arrayObject: WebGLVertexArrayObjectOES): Boolean = js.native
  def bindVertexArrayOES(
      arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
}

/**
 * Provides additional driver and renderer information.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_renderer_info/
 */
@js.native
trait WebGLDebugRendererInfo extends js.Object {
  val UNMASKED_VENDOR_WEBGL: Int = js.native
  val UNMASKED_RENDERER_WEBGL: Int = js.native
}

/**
 * Inspect the transpilation output of GLSL onto the underlying shader language.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_shaders/
 */
@js.native
trait WebGLDebugShaders extends js.Object {
  def getTranslatedShaderSource(shader: WebGLShader): String = js.native
}

/**
 * Provides S3TC texture compression support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc/
 */
@js.native
trait WebGLCompressedTextureS3TC extends js.Object {
  val COMPRESSED_RGB_S3TC_DXT1_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = js.native
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = js.native
}

/**
 * Provides depth and stencil texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/
 */
@js.native
trait WebGLDepthTexture extends js.Object {
  val UNSIGNED_INT_24_8_WEBGL: Int = js.native
}

/**
 * Adds anisotropic texture filtering support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_texture_filter_anisotropic/
 */
@js.native
trait EXTTextureFilterAnisotropic extends js.Object {
  val TEXTURE_MAX_ANISOTROPY_EXT: Int = js.native
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: Int = js.native
}

/**
 * Extends `drawElements` to support the type `UNSIGNED_INT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/
 */
@js.native
trait OESElementIndexUint extends js.Object

/**
 * Extends GLSL to support assigning the fragments depth via `gl_FragDepthEXT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_frag_depth/
 */
@js.native
trait EXTFragDepth extends js.Object

/**
 * Enables multiple draw buffer support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/
 */
@js.native
trait WEBGLDrawBuffers extends js.Object {
  val COLOR_ATTACHMENT0_WEBGL: Int = js.native
  val COLOR_ATTACHMENT1_WEBGL: Int = js.native
  val COLOR_ATTACHMENT2_WEBGL: Int = js.native
  val COLOR_ATTACHMENT3_WEBGL: Int = js.native
  val COLOR_ATTACHMENT4_WEBGL: Int = js.native
  val COLOR_ATTACHMENT5_WEBGL: Int = js.native
  val COLOR_ATTACHMENT6_WEBGL: Int = js.native
  val COLOR_ATTACHMENT7_WEBGL: Int = js.native
  val COLOR_ATTACHMENT8_WEBGL: Int = js.native
  val COLOR_ATTACHMENT9_WEBGL: Int = js.native
  val COLOR_ATTACHMENT10_WEBGL: Int = js.native
  val COLOR_ATTACHMENT11_WEBGL: Int = js.native
  val COLOR_ATTACHMENT12_WEBGL: Int = js.native
  val COLOR_ATTACHMENT13_WEBGL: Int = js.native
  val COLOR_ATTACHMENT14_WEBGL: Int = js.native
  val COLOR_ATTACHMENT15_WEBGL: Int = js.native

  val DRAW_BUFFER0_WEBGL: Int = js.native
  val DRAW_BUFFER1_WEBGL: Int = js.native
  val DRAW_BUFFER2_WEBGL: Int = js.native
  val DRAW_BUFFER3_WEBGL: Int = js.native
  val DRAW_BUFFER4_WEBGL: Int = js.native
  val DRAW_BUFFER5_WEBGL: Int = js.native
  val DRAW_BUFFER6_WEBGL: Int = js.native
  val DRAW_BUFFER7_WEBGL: Int = js.native
  val DRAW_BUFFER8_WEBGL: Int = js.native
  val DRAW_BUFFER9_WEBGL: Int = js.native
  val DRAW_BUFFER10_WEBGL: Int = js.native
  val DRAW_BUFFER11_WEBGL: Int = js.native
  val DRAW_BUFFER12_WEBGL: Int = js.native
  val DRAW_BUFFER13_WEBGL: Int = js.native
  val DRAW_BUFFER14_WEBGL: Int = js.native
  val DRAW_BUFFER15_WEBGL: Int = js.native

  val MAX_COLOR_ATTACHMENTS_WEBGL: Int = js.native
  val MAX_DRAW_BUFFERS_WEBGL: Int = js.native

  def drawBuffersWEBGL(buffers: js.Array[Int]): Unit = js.native
}

/**
 * Enables array instancing
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/
 */
@js.native
trait ANGLEInstancedArrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: Int = js.native

  def drawArraysInstancedANGLE(mode: Int, first: Int, count: Int,
      primcount: Int): Unit = js.native

  def drawElementsInstancedANGLE(mode: Int, count: Int, `type`: Int,
      offset: Int, primcount: Int): Unit = js.native

  def vertexAttribDivisorANGLE(index: Int, divisor: Int): Unit = js.native
}

/**
 * Extends OES_texture_float to support linear and mipmap minification filters.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt
 */
@js.native
trait OESTextureFloatLinear extends js.Object

/**
 * Extends OES_texture_half_float to support linear and mipmap minification filters.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt
 */
@js.native
trait OESTextureHalfFloatLinear extends js.Object

/**
 * Extends `blendEquation` to support `MIN_EXT` and `MAX_EXT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_blend_minmax/
 */
@js.native
trait EXTBlendMinmax extends js.Object {
  val MIN_EXT: Int = js.native
  val MAX_EXT: Int = js.native
}

/**
 * Provides fragment shaders with explicit LOD control for texture reads.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_shader_texture_lod/
 */
@js.native
trait EXTShaderTextureLOD extends js.Object

/**
 * Provides ATC texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_atc/
 */
@js.native
trait WebGLCompressedTextureATC extends js.Object {
  val COMPRESSED_RGB_ATC_WEBGL: Int = js.native
  val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Int = js.native
  val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Int = js.native
}

/**
 * Provides PVRTC texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/
 */
@js.native
trait WebGLCompressedTexturePVRTC extends js.Object {
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Int = js.native
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Int = js.native
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Int = js.native
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Int = js.native
}

/**
 * Enables 16-bit float colour buffer support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_half_float/
 */
@js.native
trait EXTColorBufferHalfFloat extends js.Object {
  val RGBA16F_EXT: Int = js.native
  val RGB16F_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Int = js.native
  val UNSIGNED_NORMALIZED_EXT: Int = js.native
}

/**
 * Enables 32-bit float colour buffer support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_float/
 */
@js.native
trait WEBGLColorBufferFloat extends js.Object {
  val RGBA32F_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Int = js.native
  val UNSIGNED_NORMALIZED_EXT: Int = js.native
}

/**
 * Enables nonlinear sRGB blending over framebuffers.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_sRGB/
 */
@js.native
trait EXTsRGB extends js.Object {
  val SRGB_EXT: Int = js.native
  val SRGB_ALPHA_EXT: Int = js.native
  val SRGB8_ALPHA8_EXT: Int = js.native
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: Int = js.native
}

/**
 * Provides ETC1 texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/
 */
@js.native
trait WEBGLCompressedTextureETC1 extends js.Object {
  val COMPRESSED_RGB_ETC1_WEBGL: Int = js.native
}

/** A WebGL timer query.  As used by `EXT_disjoint_timer_query` */
@js.native
trait WebGLTimerQueryEXT extends js.Object

/**
 * Provides timing support to enable profiling of GL calls.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/EXT/EXT_disjoint_timer_query.txt
 */
@js.native
trait EXTDisjointTimerQuery extends js.Object {
  val QUERY_COUNTER_BITS_EXT: Int = js.native
  val CURRENT_QUERY_EXT: Int = js.native
  val QUERY_RESULT_EXT: Int = js.native
  val QUERY_RESULT_AVAILABLE_EXT: Int = js.native
  val TIME_ELAPSED_EXT: Int = js.native
  val TIMESTAMP_EXT: Int = js.native
  val GPU_DISJOINT_EXT: Int = js.native

  def createQueryEXT(): WebGLTimerQueryEXT = js.native
  def deleteQueryEXT(query: WebGLTimerQueryEXT): Unit = js.native
  def isQueryEXT(query: WebGLTimerQueryEXT): Boolean = js.native
  def beginQueryEXT(target: Int, query: WebGLTimerQueryEXT): Unit = js.native
  def endQueryEXT(target: Int): Unit = js.native
  def queryCounterEXT(query: WebGLTimerQueryEXT, target: Int): Unit = js.native
  def getQueryEXT(target: Int, pname: Int): js.Any = js.native
  def getQueryObjectEXT(target: Int, pname: Int): js.Any = js.native
}
