package org.scalajs.dom.webgl

/**
 * Abstract class that maps a string enum onto a WebGL extension type
 *
 * @param value the string enum to pass the underlying `getExtension`
 * @tparam T the type that will be returned by the `getExtension`
 */
abstract class WebGLExtensionIdentifier[T](val value: String)

/**
 * Provides 32-bit floating point texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_texture_float/
 */
object OES_texture_float
    extends WebGLExtensionIdentifier[extensions.OESTextureFloat](
        "OES_texture_float")

/**
 * Provides 16-bit floating point texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_texture_half_float/
 */
object OES_texture_half_float
    extends WebGLExtensionIdentifier[extensions.OESTextureHalfFloat](
        "OES_texture_half_float")

/**
 * Allows simulation of losing the WebGL context to aid debugging.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/
 */
object WEBGL_lose_context
    extends WebGLExtensionIdentifier[extensions.WebGLLoseContext](
        "WEBGL_lose_context")

/**
 * Provides additional first derivative information in fragment shaders.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_standard_derivatives/
 */
object OES_standard_derivatives
    extends WebGLExtensionIdentifier[extensions.OESStandardDerivatives](
        "OES_standard_derivatives")

/**
 * Provides Vertex Array Objects (VAOs).
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/
 */
object OES_vertex_array_object
    extends WebGLExtensionIdentifier[extensions.OESVertexArrayObject](
        "OES_vertex_array_object")

/**
 * Provides additional driver and renderer information.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_renderer_info/
 */
object WEBGL_debug_renderer_info
    extends WebGLExtensionIdentifier[extensions.WebGLDebugRendererInfo](
        "WEBGL_debug_renderer_info")

/**
 * Inspect the transpilation output of GLSL onto the underlying shader language.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_shaders/
 */
object WEBGL_debug_shaders
    extends WebGLExtensionIdentifier[extensions.WebGLDebugShaders](
        "WEBGL_debug_shaders")

/**
 * Provides S3TC texture compression support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc/
 */
object WEBGL_compressed_texture_s3tc
    extends WebGLExtensionIdentifier[extensions.WebGLCompressedTextureS3TC](
        "WEBGL_compressed_texture_s3tc")

/**
 * Provides depth and stencil texture support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/
 */
object WEBGL_depth_texture
    extends WebGLExtensionIdentifier[extensions.WebGLDepthTexture](
        "WEBGL_depth_texture")

/**
 * Extends `drawElements` to support the type `UNSIGNED_INT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/
 */
object OES_element_index_uint
    extends WebGLExtensionIdentifier[extensions.OESElementIndexUint](
        "OES_element_index_uint")

/**
 * Adds anisotropic texture filtering support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_texture_filter_anisotropic/
 */
object EXT_texture_filter_anisotropic
    extends WebGLExtensionIdentifier[extensions.EXTTextureFilterAnisotropic](
        "EXT_texture_filter_anisotropic")

/**
 * Extends GLSL to support assigning the fragments depth via `gl_FragDepthEXT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_frag_depth/
 */
object EXT_frag_depth
    extends WebGLExtensionIdentifier[extensions.EXTFragDepth]("EXT_frag_depth")

/**
 * Enables multiple draw buffer support.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/
 */
object WEBGL_draw_buffers
    extends WebGLExtensionIdentifier[extensions.WEBGLDrawBuffers](
        "WEBGL_draw_buffers")

/**
 * Enables array instancing
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/
 */
object ANGLE_instanced_arrays
    extends WebGLExtensionIdentifier[extensions.ANGLEInstancedArrays](
        "ANGLE_instanced_arrays")

/**
 * Extends OES_texture_float to support linear and mipmap minification filters.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt
 */
object OES_texture_float_linear
    extends WebGLExtensionIdentifier[extensions.OESTextureFloatLinear](
        "OES_texture_float_linear")

/**
 * Extends OES_texture_half_float to support linear and mipmap minification filters.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt
 */
object OES_texture_half_float_linear
    extends WebGLExtensionIdentifier[extensions.OESTextureHalfFloatLinear](
        "OES_texture_half_float_linear")

/**
 * Extends `blendEquation` to support `MIN_EXT` and `MAX_EXT`.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_blend_minmax/
 */
object EXT_blend_minmax
    extends WebGLExtensionIdentifier[extensions.EXTBlendMinmax](
        "EXT_blend_minmax")

/**
 * Provides fragment shaders with explicit LOD control for texture reads.
 * (Khronos Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_shader_texture_lod/
 */
object EXT_shader_texture_lod
    extends WebGLExtensionIdentifier[extensions.EXTShaderTextureLOD](
        "EXT_shader_texture_lod")

/**
 * Provides ATC texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_atc/
 */
object WEBGL_compressed_texture_atc
    extends WebGLExtensionIdentifier[extensions.WebGLCompressedTextureATC](
        "WEBGL_compressed_texture_atc")

/**
 * Provides PVRTC texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/
 */
object WEBGL_compressed_texture_pvrtc
    extends WebGLExtensionIdentifier[extensions.WebGLCompressedTexturePVRTC](
        "WEBGL_compressed_texture_pvrtc")

/**
 * Enables 16-bit float colour buffer support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_half_float/
 */
object EXT_color_buffer_half_float
    extends WebGLExtensionIdentifier[extensions.EXTColorBufferHalfFloat](
        "EXT_color_buffer_half_float")

/**
 * Enables 32-bit float colour buffer support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_float/
 */
object WEBGL_color_buffer_float
    extends WebGLExtensionIdentifier[extensions.WEBGLColorBufferFloat](
        "WEBGL_color_buffer_float")

/**
 * Enables nonlinear sRGB blending over framebuffers.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/EXT_sRGB/
 */
object EXT_sRGB
    extends WebGLExtensionIdentifier[extensions.EXTsRGB]("EXT_sRGB")

/**
 * Provides ETC1 texture compression support.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/
 */
object WEBGL_compressed_texture_etc1
    extends WebGLExtensionIdentifier[extensions.WEBGLCompressedTextureETC1](
        "WEBGL_compressed_texture_etc1")

/**
 * Provides timing support to enable profiling of GL calls.
 * (Community Extension)
 *
 * @see https://www.khronos.org/registry/gles/extensions/EXT/EXT_disjoint_timer_query.txt
 */
object EXT_disjoint_timer_query
    extends WebGLExtensionIdentifier[extensions.EXTDisjointTimerQuery](
        "EXT_disjoint_timer_query")
