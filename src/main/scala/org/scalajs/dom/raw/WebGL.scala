/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 *
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom.raw

import scala.scalajs.js
import scala.scalajs.js.typedarray._

/**
 * Contains drawing surface attributes.
 */
@js.native
class WebGLContextAttributes extends js.Object {

  /**
   * When `true`, the drawing buffer has an alpha channel.
   */
  var alpha: Boolean = js.native

  /**
   * When `true`, the drawing buffer has a depth buffer of at least 16 bits.
   */
  var depth: Boolean = js.native

  /**
   * When `true`, the drawing buffer has a stencil buffer of at least 8 bits.
   */
  var stencil: Boolean = js.native

  /**
   * When `true` and antialiasing is supported, the drawing buffer will use an antialiasing method if it's choice.
   */
  var antialias: Boolean = js.native

  /**
   * When `true` the page compositor assumes the buffer's contents is premultiplied.  Used for sensible transparency when using
   * WebGL canvases for overlays.
   */
  var premultipliedAlpha: Boolean = js.native

  /**
   * When `true`, the drawing buffer is preserved after rendering, otherwise it is cleared.  On some implementations preserving the drawing buffer
   * can dramatically impact performance.
   */
  var preserveDrawingBuffer: Boolean = js.native
}

/**
 * An opaque type representing a WebGL buffer.
 */
@js.native
class WebGLBuffer private[this] () extends js.Object

/**
 * An opaque type representing a WebGL framebuffer.
 */
@js.native
class WebGLFramebuffer private[this] () extends js.Object

/**
 * An opaque type representing a WebGL program.
 */
@js.native
class WebGLProgram private[this] () extends js.Object

/**
 * An opaque type representing a WebGL renderbuffer.
 */
@js.native
class WebGLRenderbuffer private[this] () extends js.Object

/**
 * An opaque type representing a WebGL shader.
 */
@js.native
class WebGLShader private[this] () extends js.Object

/**
 * An opaque type representing a WebGL texture.
 */
@js.native
class WebGLTexture private[this] () extends js.Object

/**
 * An opaque type representing a WebGL uniform location.
 */
@js.native
class WebGLUniformLocation private[this] () extends js.Object

/**
 * Holds information returned by [[WebGLRenderingContext#getActiveAttrib]] and [[WebGLRenderingContext#getActiveUniform]].
 */
@js.native
class WebGLActiveInfo private[this] () extends js.Object {

  /**
   * The size of the requested variable.
   */
  val size: Int = js.native

  /**
   * The type of the requested variable.
   */
  val `type`: Int = js.native

  /**
   * The name of the requested variable.
   */
  val name: String = js.native
}

/**
 * Represents information about the implementation's precision for given parameters.  See [[WebGLRenderingContext#getShaderPrecisionFormat]].
 */
@js.native
class WebGLShaderPrecisionFormat private[this] () extends js.Object {

  /**
   * The base 2 log of the absolute value of the minimum value that can be represented.
   */
  val rangeMin: Int = js.native

  /**
   * The base 2 log of the absolute value of the maximum value that can be represented.
   */
  val rangeMax: Int = js.native

  /**
   * The number of bits of precision that can be represented. For integer formats this value is always 0.
   */
  val precision: Int = js.native
}

/**
 * WebGLRenderingContext objects expose the WebGLRenderingContext interface, the principal interface in WebGL
 * which provides special properties and methods to manipulate the 3D content rendered in an HTML canvas element.
 *
 * MDN
 */
object WebGLRenderingContext {
  /* Note:
   *   Normally we'd make this object @js.native extends js.Object
   *   and declare all these vals as js.native, however Safari does
   *   not store these constants on WebGLRenderingContext, thus we
   *   have to explicitly define them as final vals instead.
   */

  /**
   * Specifies the depth buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  final val DEPTH_BUFFER_BIT = 0x00000100

  /**
   * Specifies the stencil buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  final val STENCIL_BUFFER_BIT = 0x00000400

  /**
   * Specifies the color buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  final val COLOR_BUFFER_BIT = 0x00004000

  /* BeginMode */
  /**
   * Specifies the elements should be drawn as points.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val POINTS = 0x0000

  /**
   * Specifies the elements should be drawn as lines.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val LINES = 0x0001

  /**
   * Specifies the elements should be drawn as a line loop.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val LINE_LOOP = 0x0002

  /**
   * Specifies the elements should be drawn as a line strip.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val LINE_STRIP = 0x0003

  /**
   * Specifies the elements should be drawn as triangles.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val TRIANGLES = 0x0004

  /**
   * Specifies the elements should be drawn as a triangle strip.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val TRIANGLE_STRIP = 0x0005

  /**
   * Specifies the elements should be drawn as a triangle fan.
   *
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  final val TRIANGLE_FAN = 0x0006

  /* AlphaFunction (not supported in ES20) */
  /*    NEVER */
  /*    LESS */
  /*    EQUAL */
  /*    LEQUAL */
  /*    GREATER */
  /*    NOTEQUAL */
  /*    GEQUAL */
  /*    ALWAYS */

  /* BlendingFactorDest */
  final val ZERO = 0
  final val ONE = 1
  final val SRC_COLOR = 0x0300
  final val ONE_MINUS_SRC_COLOR = 0x0301
  final val SRC_ALPHA = 0x0302
  final val ONE_MINUS_SRC_ALPHA = 0x0303
  final val DST_ALPHA = 0x0304
  final val ONE_MINUS_DST_ALPHA = 0x0305

  /* BlendingFactorSrc */
  /*    ZERO */
  /*    ONE */
  final val DST_COLOR = 0x0306
  final val ONE_MINUS_DST_COLOR = 0x0307
  final val SRC_ALPHA_SATURATE = 0x0308
  /*    SRC_ALPHA */
  /*    ONE_MINUS_SRC_ALPHA */
  /*    DST_ALPHA */
  /*    ONE_MINUS_DST_ALPHA */

  /* BlendEquationSeparate */
  final val FUNC_ADD = 0x8006
  final val BLEND_EQUATION = 0x8009
  final val BLEND_EQUATION_RGB = 0x8009 /* same as BLEND_EQUATION */
  final val BLEND_EQUATION_ALPHA = 0x883D

  /* BlendSubtract */
  final val FUNC_SUBTRACT = 0x800A
  final val FUNC_REVERSE_SUBTRACT = 0x800B

  /* Separate Blend Functions */
  final val BLEND_DST_RGB = 0x80C8
  final val BLEND_SRC_RGB = 0x80C9
  final val BLEND_DST_ALPHA = 0x80CA
  final val BLEND_SRC_ALPHA = 0x80CB
  final val CONSTANT_COLOR = 0x8001
  final val ONE_MINUS_CONSTANT_COLOR = 0x8002
  final val CONSTANT_ALPHA = 0x8003
  final val ONE_MINUS_CONSTANT_ALPHA = 0x8004
  final val BLEND_COLOR = 0x8005

  /* Buffer Objects */
  final val ARRAY_BUFFER = 0x8892
  final val ELEMENT_ARRAY_BUFFER = 0x8893
  final val ARRAY_BUFFER_BINDING = 0x8894
  final val ELEMENT_ARRAY_BUFFER_BINDING = 0x8895

  final val STREAM_DRAW = 0x88E0
  final val STATIC_DRAW = 0x88E4
  final val DYNAMIC_DRAW = 0x88E8

  final val BUFFER_SIZE = 0x8764
  final val BUFFER_USAGE = 0x8765

  final val CURRENT_VERTEX_ATTRIB = 0x8626

  /* CullFaceMode */
  /**
   * Specifies front faces.
   */
  final val FRONT = 0x0404

  /**
   * Specifies back faces.
   */
  final val BACK = 0x0405

  /**
   * Specifies both front and back faces.
   */
  final val FRONT_AND_BACK = 0x0408

  /* DepthFunction */
  /*    NEVER */
  /*    LESS */
  /*    EQUAL */
  /*    LEQUAL */
  /*    GREATER */
  /*    NOTEQUAL */
  /*    GEQUAL */
  /*    ALWAYS */

  /* EnableCap */
  /* TEXTURE_2D */
  /**
   * Capability to enable/disable backface culling.
   */
  final val CULL_FACE = 0x0B44

  /**
   * Capability to enable/disable blending.
   */
  final val BLEND = 0x0BE2

  /**
   * Capability to enable/disable dithering.
   */
  final val DITHER = 0x0BD0

  /**
   * Capability to enable/disable the stencil test.
   */
  final val STENCIL_TEST = 0x0B90

  /**
   * Capability to enable/disable the depth test.
   */
  final val DEPTH_TEST = 0x0B71

  /**
   * Capability to enable/disable the scissor test.
   */
  final val SCISSOR_TEST = 0x0C11

  /**
   * Capability to enable/disable polygon offset.
   */
  final val POLYGON_OFFSET_FILL = 0x8037
  final val SAMPLE_ALPHA_TO_COVERAGE = 0x809E
  final val SAMPLE_COVERAGE = 0x80A0

  /* ErrorCode */
  /**
   * No error has occurred.
   */
  final val NO_ERROR = 0

  /**
   * An invalid enumerated name has been passed to an API function.
   */
  final val INVALID_ENUM = 0x0500

  /**
   * An invalid value has been passed to an API function.
   */
  final val INVALID_VALUE = 0x0501

  /**
   * The requested operation is not valid.
   */
  final val INVALID_OPERATION = 0x0502

  /**
   * The operation requested could not be completed because it ran out of memory.
   */
  final val OUT_OF_MEMORY = 0x0505

  /* FrontFaceDirection */
  /**
   * Clockwise wound triangles are front-facing.
   */
  final val CW = 0x0900

  /**
   * Counter-Clockwise wound triangles are front-facing.
   */
  final val CCW = 0x0901

  /* GetPName */
  final val LINE_WIDTH = 0x0B21
  final val ALIASED_POINT_SIZE_RANGE = 0x846D
  final val ALIASED_LINE_WIDTH_RANGE = 0x846E
  final val CULL_FACE_MODE = 0x0B45
  final val FRONT_FACE = 0x0B46
  final val DEPTH_RANGE = 0x0B70
  final val DEPTH_WRITEMASK = 0x0B72
  final val DEPTH_CLEAR_VALUE = 0x0B73
  final val DEPTH_FUNC = 0x0B74
  final val STENCIL_CLEAR_VALUE = 0x0B91
  final val STENCIL_FUNC = 0x0B92
  final val STENCIL_FAIL = 0x0B94
  final val STENCIL_PASS_DEPTH_FAIL = 0x0B95
  final val STENCIL_PASS_DEPTH_PASS = 0x0B96
  final val STENCIL_REF = 0x0B97
  final val STENCIL_VALUE_MASK = 0x0B93
  final val STENCIL_WRITEMASK = 0x0B98
  final val STENCIL_BACK_FUNC = 0x8800
  final val STENCIL_BACK_FAIL = 0x8801
  final val STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802
  final val STENCIL_BACK_PASS_DEPTH_PASS = 0x8803
  final val STENCIL_BACK_REF = 0x8CA3
  final val STENCIL_BACK_VALUE_MASK = 0x8CA4
  final val STENCIL_BACK_WRITEMASK = 0x8CA5
  final val VIEWPORT = 0x0BA2
  final val SCISSOR_BOX = 0x0C10
  /*    SCISSOR_TEST */
  final val COLOR_CLEAR_VALUE = 0x0C22
  final val COLOR_WRITEMASK = 0x0C23
  final val UNPACK_ALIGNMENT = 0x0CF5
  final val PACK_ALIGNMENT = 0x0D05
  final val MAX_TEXTURE_SIZE = 0x0D33
  final val MAX_VIEWPORT_DIMS = 0x0D3A
  final val SUBPIXEL_BITS = 0x0D50
  final val RED_BITS = 0x0D52
  final val GREEN_BITS = 0x0D53
  final val BLUE_BITS = 0x0D54
  final val ALPHA_BITS = 0x0D55
  final val DEPTH_BITS = 0x0D56
  final val STENCIL_BITS = 0x0D57
  final val POLYGON_OFFSET_UNITS = 0x2A00
  /*    POLYGON_OFFSET_FILL */
  final val POLYGON_OFFSET_FACTOR = 0x8038
  final val TEXTURE_BINDING_2D = 0x8069
  final val SAMPLE_BUFFERS = 0x80A8
  final val SAMPLES = 0x80A9
  final val SAMPLE_COVERAGE_VALUE = 0x80AA
  final val SAMPLE_COVERAGE_INVERT = 0x80AB

  /* GetTextureParameter */
  /*    TEXTURE_MAG_FILTER */
  /*    TEXTURE_MIN_FILTER */
  /*    TEXTURE_WRAP_S */
  /*    TEXTURE_WRAP_T */

  final val COMPRESSED_TEXTURE_FORMATS = 0x86A3

  /* HintMode */
  final val DONT_CARE = 0x1100
  final val FASTEST = 0x1101
  final val NICEST = 0x1102

  /* HintTarget */
  final val GENERATE_MIPMAP_HINT = 0x8192

  /* DataType */
  final val BYTE = 0x1400
  final val UNSIGNED_BYTE = 0x1401
  final val SHORT = 0x1402
  final val UNSIGNED_SHORT = 0x1403
  final val INT = 0x1404
  final val UNSIGNED_INT = 0x1405
  final val FLOAT = 0x1406

  /* PixelFormat */
  final val DEPTH_COMPONENT = 0x1902
  final val ALPHA = 0x1906
  final val RGB = 0x1907
  final val RGBA = 0x1908
  final val LUMINANCE = 0x1909
  final val LUMINANCE_ALPHA = 0x190A

  /* PixelType */
  /*    UNSIGNED_BYTE */
  final val UNSIGNED_SHORT_4_4_4_4 = 0x8033
  final val UNSIGNED_SHORT_5_5_5_1 = 0x8034
  final val UNSIGNED_SHORT_5_6_5 = 0x8363

  /* Shaders */
  final val FRAGMENT_SHADER = 0x8B30
  final val VERTEX_SHADER = 0x8B31
  final val MAX_VERTEX_ATTRIBS = 0x8869
  final val MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB
  final val MAX_VARYING_VECTORS = 0x8DFC
  final val MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D
  final val MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C
  final val MAX_TEXTURE_IMAGE_UNITS = 0x8872
  final val MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD
  final val SHADER_TYPE = 0x8B4F
  final val DELETE_STATUS = 0x8B80
  final val LINK_STATUS = 0x8B82
  final val VALIDATE_STATUS = 0x8B83
  final val ATTACHED_SHADERS = 0x8B85
  final val ACTIVE_UNIFORMS = 0x8B86
  final val ACTIVE_ATTRIBUTES = 0x8B89
  final val SHADING_LANGUAGE_VERSION = 0x8B8C
  final val CURRENT_PROGRAM = 0x8B8D

  /* StencilFunction */
  final val NEVER = 0x0200
  final val LESS = 0x0201
  final val EQUAL = 0x0202
  final val LEQUAL = 0x0203
  final val GREATER = 0x0204
  final val NOTEQUAL = 0x0205
  final val GEQUAL = 0x0206
  final val ALWAYS = 0x0207

  /* StencilOp */
  /*    ZERO */
  final val KEEP = 0x1E00
  final val REPLACE = 0x1E01
  final val INCR = 0x1E02
  final val DECR = 0x1E03
  final val INVERT = 0x150A
  final val INCR_WRAP = 0x8507
  final val DECR_WRAP = 0x8508

  /* StringName */
  final val VENDOR = 0x1F00
  final val RENDERER = 0x1F01
  final val VERSION = 0x1F02

  /* TextureMagFilter */
  /** Specifies nearest neighbour interpolation. */
  final val NEAREST = 0x2600

  /** Specifies linear interpolation. */
  final val LINEAR = 0x2601

  /* TextureMinFilter */
  /*    NEAREST */
  /*    LINEAR */
  /**
   * Specifies nearest neighbour interpolation on the nearest mipmap level.
   */
  final val NEAREST_MIPMAP_NEAREST = 0x2700

  /**
   * Specifies linear interpolation on the nearest mipmap level.
   */
  final val LINEAR_MIPMAP_NEAREST = 0x2701

  /**
   * Specifies nearest neighbour interpolation, linearly blending between mipmap levels.
   */
  final val NEAREST_MIPMAP_LINEAR = 0x2702

  /**
   * Specifies linear interpolation linearly blending between mipmap levels.
   */
  final val LINEAR_MIPMAP_LINEAR = 0x2703

  /* TextureParameterName */
  /**
   * The texture magnification filter.
   *
   * Can be one of [[NEAREST]] or [[LINEAR]].
   */
  final val TEXTURE_MAG_FILTER = 0x2800

  /**
   * The texture minification filter.
   *
   * Can be one of [[NEAREST]], [[LINEAR]], [[NEAREST_MIPMAP_NEAREST]], [[LINEAR_MIPMAP_NEAREST]],
   * [[NEAREST_MIPMAP_LINEAR]], [[LINEAR_MIPMAP_LINEAR]].
   */
  final val TEXTURE_MIN_FILTER = 0x2801

  /**
   * The horizontal texture wrap mode.
   *
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].
   */
  final val TEXTURE_WRAP_S = 0x2802

  /**
   * The vertical texture wrap.
   *
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].
   */
  final val TEXTURE_WRAP_T = 0x2803

  /* TextureTarget */
  /**
   * The target for a simple 2 dimensional texture.
   */
  final val TEXTURE_2D = 0x0DE1
  final val TEXTURE = 0x1702

  /**
   * The target for a cube mapped texture.
   */
  final val TEXTURE_CUBE_MAP = 0x8513
  final val TEXTURE_BINDING_CUBE_MAP = 0x8514
  final val TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515
  final val TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516
  final val TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517
  final val TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518
  final val TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519
  final val TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A
  final val MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C

  /* TextureUnit */
  /** Identifies texture unit 0. This texture unit is guaranteed to exist. */
  final val TEXTURE0 = 0x84C0

  /** Identifies texture unit 1. This texture unit is guaranteed to exist. */
  final val TEXTURE1 = 0x84C1

  /** Identifies texture unit 2. This texture unit is guaranteed to exist. */
  final val TEXTURE2 = 0x84C2

  /** Identifies texture unit 3. This texture unit is guaranteed to exist. */
  final val TEXTURE3 = 0x84C3

  /** Identifies texture unit 4. This texture unit is guaranteed to exist. */
  final val TEXTURE4 = 0x84C4

  /** Identifies texture unit 5. This texture unit is guaranteed to exist. */
  final val TEXTURE5 = 0x84C5

  /** Identifies texture unit 6. This texture unit is guaranteed to exist. */
  final val TEXTURE6 = 0x84C6

  /** Identifies texture unit 7. This texture unit is guaranteed to exist. */
  final val TEXTURE7 = 0x84C7

  /** Identifies texture unit 8. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE8 = 0x84C8

  /** Identifies texture unit 9. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE9 = 0x84C9

  /** Identifies texture unit 10. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE10 = 0x84CA

  /** Identifies texture unit 11. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE11 = 0x84CB

  /** Identifies texture unit 12. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE12 = 0x84CC

  /** Identifies texture unit 13. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE13 = 0x84CD

  /** Identifies texture unit 14. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE14 = 0x84CE

  /** Identifies texture unit 15. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE15 = 0x84CF

  /** Identifies texture unit 16. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE16 = 0x84D0

  /** Identifies texture unit 17. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE17 = 0x84D1

  /** Identifies texture unit 18. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE18 = 0x84D2

  /** Identifies texture unit 19. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE19 = 0x84D3

  /** Identifies texture unit 20. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE20 = 0x84D4

  /** Identifies texture unit 21. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE21 = 0x84D5

  /** Identifies texture unit 22. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE22 = 0x84D6

  /** Identifies texture unit 23. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE23 = 0x84D7

  /** Identifies texture unit 24. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE24 = 0x84D8

  /** Identifies texture unit 25. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE25 = 0x84D9

  /** Identifies texture unit 26. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE26 = 0x84DA

  /** Identifies texture unit 27. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE27 = 0x84DB

  /** Identifies texture unit 28. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE28 = 0x84DC

  /** Identifies texture unit 29. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE29 = 0x84DD

  /** Identifies texture unit 30. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE30 = 0x84DE

  /** Identifies texture unit 31. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_IMAGE_UNITS before using it. */
  final val TEXTURE31 = 0x84DF

  /** The currently active texture unit. */
  final val ACTIVE_TEXTURE = 0x84E0

  /* TextureWrapMode */
  /**
   * Repeat the texture along this axis.
   */
  final val REPEAT = 0x2901

  /**
   * Clamp the texture along this axis.  The colour of the edge pixels will be replicated to infinity.
   */
  final val CLAMP_TO_EDGE = 0x812F

  /**
   * Repeat the texture along this axis, mirroring it each step.
   */
  final val MIRRORED_REPEAT = 0x8370

  /* Uniform Types */
  final val FLOAT_VEC2 = 0x8B50
  final val FLOAT_VEC3 = 0x8B51
  final val FLOAT_VEC4 = 0x8B52
  final val INT_VEC2 = 0x8B53
  final val INT_VEC3 = 0x8B54
  final val INT_VEC4 = 0x8B55
  final val BOOL = 0x8B56
  final val BOOL_VEC2 = 0x8B57
  final val BOOL_VEC3 = 0x8B58
  final val BOOL_VEC4 = 0x8B59
  final val FLOAT_MAT2 = 0x8B5A
  final val FLOAT_MAT3 = 0x8B5B
  final val FLOAT_MAT4 = 0x8B5C
  final val SAMPLER_2D = 0x8B5E
  final val SAMPLER_CUBE = 0x8B60

  /* Vertex Arrays */
  final val VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622
  final val VERTEX_ATTRIB_ARRAY_SIZE = 0x8623
  final val VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624
  final val VERTEX_ATTRIB_ARRAY_TYPE = 0x8625
  final val VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A
  final val VERTEX_ATTRIB_ARRAY_POINTER = 0x8645
  final val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F

  /* Read Format */
  final val IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A
  final val IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B

  /* Shader Source */
  final val COMPILE_STATUS = 0x8B81

  /* Shader Precision-Specified Types */
  /**
   * Specifies a low precision float.
   */
  final val LOW_FLOAT = 0x8DF0

  /**
   * Specifies a medium precision float.
   */
  final val MEDIUM_FLOAT = 0x8DF1

  /**
   * Specifies a high precision float.
   */
  final val HIGH_FLOAT = 0x8DF2

  /**
   * Specifies a low precision integer.
   */
  final val LOW_INT = 0x8DF3

  /**
   * Specifies a medium precision float.
   */
  final val MEDIUM_INT = 0x8DF4

  /**
   * Specifies a high precision float.
   */
  final val HIGH_INT = 0x8DF5

  /* Framebuffer Object. */
  /**
   * The framebuffer target.
   */
  final val FRAMEBUFFER = 0x8D40

  /**
   * The renderbuffer target.
   */
  final val RENDERBUFFER = 0x8D41

  final val RGBA4 = 0x8056
  final val RGB5_A1 = 0x8057
  final val RGB565 = 0x8D62
  final val DEPTH_COMPONENT16 = 0x81A5
  final val STENCIL_INDEX = 0x1901
  final val STENCIL_INDEX8 = 0x8D48
  final val DEPTH_STENCIL = 0x84F9

  final val RENDERBUFFER_WIDTH = 0x8D42
  final val RENDERBUFFER_HEIGHT = 0x8D43
  final val RENDERBUFFER_INTERNAL_FORMAT = 0x8D44
  final val RENDERBUFFER_RED_SIZE = 0x8D50
  final val RENDERBUFFER_GREEN_SIZE = 0x8D51
  final val RENDERBUFFER_BLUE_SIZE = 0x8D52
  final val RENDERBUFFER_ALPHA_SIZE = 0x8D53
  final val RENDERBUFFER_DEPTH_SIZE = 0x8D54
  final val RENDERBUFFER_STENCIL_SIZE = 0x8D55

  final val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0
  final val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1
  final val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2
  final val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3

  final val COLOR_ATTACHMENT0 = 0x8CE0
  final val DEPTH_ATTACHMENT = 0x8D00
  final val STENCIL_ATTACHMENT = 0x8D20
  final val DEPTH_STENCIL_ATTACHMENT = 0x821A

  final val NONE = 0

  final val FRAMEBUFFER_COMPLETE = 0x8CD5
  final val FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6
  final val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7
  final val FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9
  final val FRAMEBUFFER_UNSUPPORTED = 0x8CDD

  final val FRAMEBUFFER_BINDING = 0x8CA6
  final val RENDERBUFFER_BINDING = 0x8CA7
  final val MAX_RENDERBUFFER_SIZE = 0x84E8

  final val INVALID_FRAMEBUFFER_OPERATION = 0x0506

  /* WebGL-specific enums */
  final val UNPACK_FLIP_Y_WEBGL = 0x9240
  final val UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241
  final val CONTEXT_LOST_WEBGL = 0x9242
  final val UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243
  final val BROWSER_DEFAULT_WEBGL = 0x9244
}

@js.native
class WebGLRenderingContext extends js.Object {

  /**
   * The canvas object this WebGLRenderingContext is associated with.
   */
  val canvas: HTMLCanvasElement = js.native

  /**
   * The actual width of the drawing buffer.
   * This may be different than the underlying HTMLCanvasElement width.
   */
  val drawingBufferWidth: Int = js.native

  /**
   * The actual height of the drawing buffer.
   * This may be different than the underlying HTMLCanvasElement height.
   */
  val drawingBufferHeight: Int = js.native

  /**
   * Returns `null` if [[isContextLost]] would return `false`, otherwise returns a copy of the context parameters.
   */
  def getContextAttributes(): WebGLContextAttributes = js.native

  /**
   * Returns `true` if the context has been lost,  `false` otherwise.
   */
  def isContextLost(): Boolean = js.native

  /**
   * Returns an array of strings naming supported WebGL extensions.
   */
  def getSupportedExtensions(): js.Array[String] = js.native

  /**
   * Returns an object for the named extension, or `null` if no such extension exists.
   *
   * @param name  the name of the extension
   */
  def getExtension(name: String): js.Any = js.native

  /**
   * Selects the active texture unit.
   *
   * @param texture  an integer specifying the texture unit to make active. Must be in 0 .. MAX_COMBINED_TEXTURE_IMAGE_UNITS-1
   */
  def activeTexture(texture: Int): Unit = js.native

  /**
   * Attaches a shader (fragment or vertex) to a [[WebGLProgram]].
   */
  def attachShader(program: WebGLProgram,
      shader: WebGLShader): Unit = js.native

  /**
   * Associates a vertex attribute index with a named attribute variable.
   */
  def bindAttribLocation(program: WebGLProgram, index: Int,
      name: String): Unit = js.native

  /**
   * Loads a a target into a [[WebGLBuffer]].
   *
   * @param target the target to bind the buffer to.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   */
  def bindBuffer(target: Int, buffer: WebGLBuffer): Unit = js.native

  /**
   * Loads a a target into a [[WebGLFramebuffer]].
   *
   * @param target  the target to bind the framebuffer to.  Must be [[WebGLRenderingContext.FRAMEBUFFER]].
   * @param framebuffer  a framebuffer object, or null to bind the default framebuffer.
   */
  def bindFramebuffer(target: Int,
      framebuffer: WebGLFramebuffer): Unit = js.native

  /**
   * Loads a a target into a [[WebGLRenderbuffer]].
   *
   * @param target  target to bind to, must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param renderbuffer the renderbuffer to bind.  If `null`, any object bound to `target` us unbound.
   */
  def bindRenderbuffer(target: Int,
      renderbuffer: WebGLRenderbuffer): Unit = js.native

  /**
   * Loads a the active texture unit into a [[WebGLTexture]].
   *
   * @param target  the target to bind to.  Must be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param texture  the texture to bind.
   */
  def bindTexture(target: Int, texture: WebGLTexture): Unit = js.native

  /**
   * Sets the blend color used in [[WebGLRenderingContext.BLEND_COLOR]].
   */
  def blendColor(red: Double, green: Double, blue: Double,
      alpha: Double): Unit = js.native

  /**
   * Specifies the equation used for RGB and Alpha blending.
   *
   * @param mode  blend equation to use.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquation(mode: Int): Unit = js.native

  /**
   * Specifies the equation used for RGB and Alpha blending separately.
   *
   * @param modeRGB  blend equation to use for RGB components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   * @param modeAlpha  blend equation to use for alpha components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = js.native

  /**
   * Specifies how the blending factors are computed for source and destination pixels.
   *
   * @param sfactor  The source blending factors. May be one of [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.ONE]], [[WebGLRenderingContext.SRC_COLOR]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_COLOR]], [[WebGLRenderingContext.DST_COLOR]], [[WebGLRenderingContext.ONE_MINUS_DST_COLOR]], [[WebGLRenderingContext.SRC_ALPHA]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_ALPHA]], [[WebGLRenderingContext.DST_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_DST_ALPHA]], [[WebGLRenderingContext.CONSTANT_COLOR]],
   *                 [[WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR]], [[WebGLRenderingContext.CONSTANT_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA]],
   *                 or [[WebGLRenderingContext.SRC_ALPHA_SATURATE]]. Initially this value is [[WebGLRenderingContext.ONE]].
   * @param dfactor  The destination blending factors. May be one of [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.ONE]], [[WebGLRenderingContext.SRC_COLOR]],
   *                  [[WebGLRenderingContext.ONE_MINUS_SRC_COLOR]], [[WebGLRenderingContext.DST_COLOR]], [[WebGLRenderingContext.ONE_MINUS_DST_COLOR]], [[WebGLRenderingContext.SRC_ALPHA]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_ALPHA]], [[WebGLRenderingContext.DST_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_DST_ALPHA]], [[WebGLRenderingContext.CONSTANT_COLOR]],
   *                 ` ONE_MINUS_CONSTANT_COLOR`, [[WebGLRenderingContext.CONSTANT_ALPHA]], or [[WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA]].
   *                 This value is initially [[WebGLRenderingContext.ZERO]].
   */
  def blendFunc(sfactor: Int, dfactor: Int): Unit = js.native

  /**
   * Specifies how the blending factors are computed for source and destination pixels, separately for alpha and RGB.
   *
   * @param srcRGB  The source blending factor for RGB. May be one of [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.ONE]], [[WebGLRenderingContext.SRC_COLOR]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_COLOR]], [[WebGLRenderingContext.DST_COLOR]], [[WebGLRenderingContext.ONE_MINUS_DST_COLOR]], [[WebGLRenderingContext.SRC_ALPHA]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_ALPHA]], [[WebGLRenderingContext.DST_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_DST_ALPHA]], [[WebGLRenderingContext.CONSTANT_COLOR]],
   *                 [[WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR]], [[WebGLRenderingContext.CONSTANT_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA]],
   *                 or [[WebGLRenderingContext.SRC_ALPHA_SATURATE]]. Initially this value is [[WebGLRenderingContext.ONE]].
   * @param dstRGB  The destination blending factor for RGB. May be one of [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.ONE]], [[WebGLRenderingContext.SRC_COLOR]],
   *                  [[WebGLRenderingContext.ONE_MINUS_SRC_COLOR]], [[WebGLRenderingContext.DST_COLOR]], [[WebGLRenderingContext.ONE_MINUS_DST_COLOR]], [[WebGLRenderingContext.SRC_ALPHA]],
   *                 [[WebGLRenderingContext.ONE_MINUS_SRC_ALPHA]], [[WebGLRenderingContext.DST_ALPHA]], [[WebGLRenderingContext.ONE_MINUS_DST_ALPHA]], [[WebGLRenderingContext.CONSTANT_COLOR]],
   *                 ` ONE_MINUS_CONSTANT_COLOR`, [[WebGLRenderingContext.CONSTANT_ALPHA]], or [[WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA]].
   *                 This value is initially [[WebGLRenderingContext.ZERO]].
   * @param srcAlpha The source blending factor for Alpha.  Accepted values are the same as srcRGB.
   *                 The initial value is [[WebGLRenderingContext.ONE]].
   * @param dstAlpha The destination blending factor for Alpha.  Accepted values are the same as srcRGB.
   *                 The initial value is [[WebGLRenderingContext.ZERO]].
   */
  def blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int,
      dstAlpha: Int): Unit = js.native

  /**
   * Sets the size of the bound [[WebGLBuffer]] for the given `target`.  The contents of the buffer are cleared to 0.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param size  The size of the new buffer
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: Int, size: Int, usage: Int): Unit = js.native

  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: Int, data: ArrayBufferView,
      usage: Int): Unit = js.native

  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   *
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: Int, data: ArrayBuffer, usage: Int): Unit = js.native

  def bufferSubData(target: Int, offset: Int,
      data: ArrayBufferView): Unit = js.native

  def bufferSubData(target: Int, offset: Int,
      data: ArrayBuffer): Unit = js.native

  /**
   * Returns the completeness status for the framebuffer.
   *
   * The possible results are:
   *
   *  - [[WebGLRenderingContext.FRAMEBUFFER_COMPLETE]] - the framebuffer is complete.
   *  - [[WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_ATTACHMENT]] - one or more attachment points are not complete in the framebuffer.
   *  - [[WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_DIMENSIONS]] - one or more attached images do not have a specified width and height.
   *  - [[WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT]] - there are no images attached to the framebuffer.
   *  - [[WebGLRenderingContext.FRAMEBUFFER_UNSUPPORTED]] - the attached image format combinations are not supported on this platform.
   *
   * @param target  the target framebuffer object, must be [[WebGLRenderingContext.FRAMEBUFFER]].
   * @return the framebuffer status.
   */
  def checkFramebufferStatus(target: Int): Int = js.native

  /**
   * Clears the buffers specified in `mask` with the current [[WebGLRenderingContext#clearColor]], [[WebGLRenderingContext#clearDepth]] and [[WebGLRenderingContext#clearStencil]].
   *
   * @param mask  The buffers to clear, a bitmask of one or more of [[WebGLRenderingContext.COLOR_BUFFER_BIT]], [[WebGLRenderingContext.DEPTH_BUFFER_BIT]] and [[WebGLRenderingContext.STENCIL_BUFFER_BIT]].
   */
  def clear(mask: Int): Unit = js.native

  /**
   * Sets the clear color to use with [[WebGLRenderingContext#clear]].
   */
  def clearColor(red: Double, green: Double, blue: Double,
      alpha: Double): Unit = js.native

  /**
   * Sets the clear depth to use with [[WebGLRenderingContext#clear]].
   */
  def clearDepth(depth: Double): Unit = js.native

  /**
   * Sets the stencil value to use with [[WebGLRenderingContext#clear]].
   */
  def clearStencil(s: Int): Unit = js.native

  /**
   * Enable and disable writing to the given channels.  For each channel, `true` will allow writing, `false` will prevent it.
   */
  def colorMask(red: Boolean, green: Boolean, blue: Boolean,
      alpha: Boolean): Unit = js.native

  /**
   * Compiles the provided shader.
   *
   * The [[WebGLRenderingContext#getShaderParameter]] can be used to determine if this operation succeeded.
   */
  def compileShader(shader: WebGLShader): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit, compressed with the specified algorithm.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the compressed data.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param data  the compressed image data.
   */
  def compressedTexImage2D(target: Int, level: Int, internalformat: Int,
      width: Int, height: Int, border: Int,
      data: ArrayBufferView): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit, compressed with the specified algorithm.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param format the format of the compressed image data
   *  @param data  the compressed image data.
   */
  def compressedTexSubImage2D(target: Int, level: Int, xoffset: Int,
      yoffset: Int, width: Int, height: Int, format: Int,
      data: ArrayBufferView): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from the current framebuffer.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the data.  May be [[WebGLRenderingContext.ALPHA]], [[WebGLRenderingContext.LUMINANCE]], [[WebGLRenderingContext.LUMINANCE_ALPHA]], [[WebGLRenderingContext.RGB]], or [[WebGLRenderingContext.RGBA]].
   *  @param x the window coordinates of the lower left corner of the framebuffer.
   *  @param y the window coordinates of the lower left corner of the framebuffer.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   */
  def copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int,
      y: Int, width: Int, height: Int, border: Int): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from the current framebuffer.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param x the window coordinates of the lower left corner of the framebuffer.
   *  @param y the window coordinates of the lower left corner of the framebuffer.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   */
  def copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      x: Int, y: Int, width: Int, height: Int): Unit = js.native

  /**
   * Creates a new [[WebGLBuffer]].
   */
  def createBuffer(): WebGLBuffer = js.native

  /**
   * Creates a new [[WebGLFramebuffer]].
   */
  def createFramebuffer(): WebGLFramebuffer = js.native

  /**
   * Creates a new [[WebGLProgram]].
   */
  def createProgram(): WebGLProgram = js.native

  /**
   * Creates a new [[WebGLRenderbuffer]].
   */
  def createRenderbuffer(): WebGLRenderbuffer = js.native

  /**
   * Creates a new [[WebGLShader]].
   */
  def createShader(`type`: Int): WebGLShader = js.native

  /**
   * Creates a new [[WebGLTexture]].
   */
  def createTexture(): WebGLTexture = js.native

  /**
   * Set the culling mode for front and back facing polygons.
   *
   * @param mode the culling mode, may be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]] or [[WebGLRenderingContext.FRONT_AND_BACK]].
   *             When [[WebGLRenderingContext.FRONT_AND_BACK]] is set, no triangles are drawn, however lines and points will.
   */
  def cullFace(mode: Int): Unit = js.native

  /**
   * Flags the specified [[WebGLBuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the buffer, it is not mandatory to call this method.
   */
  def deleteBuffer(buffer: WebGLBuffer): Unit = js.native

  /**
   * Flags the specified [[WebGLFramebuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the framebuffer, it is not mandatory to call this method.
   */
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = js.native

  /**
   * Flags the specified [[WebGLProgram]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the program, it is not mandatory to call this method.
   */
  def deleteProgram(program: WebGLProgram): Unit = js.native

  /**
   * Flags the specified [[WebGLRenderbuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the renderbuffer, it is not mandatory to call this method.
   */
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = js.native

  /**
   * Flags the specified [[WebGLShader]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the shader, it is not mandatory to call this method.
   */
  def deleteShader(shader: WebGLShader): Unit = js.native

  /**
   * Flags the specified [[WebGLTexture]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   *
   * ''Note'': garbage collection will also delete the texture, it is not mandatory to call this method.
   */
  def deleteTexture(texture: WebGLTexture): Unit = js.native

  /**
   * Set the function used to discard fragments.  When depth testing is enabled, the fragment depth is compared with
   * the current depth, and is allowed onto the framebuffer.
   *
   * @param func  the function to allow the fragment to be drawn.  Values are [[WebGLRenderingContext.NEVER]], [[WebGLRenderingContext.LESS]], [[WebGLRenderingContext.EQUAL]], [[WebGLRenderingContext.LEQUAL]]
   *              [[WebGLRenderingContext.GREATER]], [[WebGLRenderingContext.NOTEQUAL]], [[WebGLRenderingContext.GEQUAL]], and [[WebGLRenderingContext.ALWAYS]].
   */
  def depthFunc(func: Int): Unit = js.native

  /**
   * Enables/disables writing to the depth buffer.
   *
   * @param flag  when `false`, depth writing is disabled, otherwise it is enabled.
   */
  def depthMask(flag: Boolean): Unit = js.native

  /**
   * Sets the mapping from normalized device coordinates to window coordinates.
   * "normalized device coordinates" in this context really means "normalized depth map values".
   *
   * ''note'' there is no requirement that zNear &lt; zFar.
   *
   * Both parameters are clamped to -1 .. 1
   * @param zNear the near clipping plane, initially 0.
   * @param zFar the far clipping plane, initially 1
   */
  def depthRange(zNear: Double, zFar: Double): Unit = js.native

  /**
   * Detaches a [[WebGLShader]] from a [[WebGLProgram]].
   *
   * If the shader has been flagged as deleted by a call to [[WebGLRenderingContext#deleteShader]], it will be deleted.
   */
  def detachShader(program: WebGLProgram,
      shader: WebGLShader): Unit = js.native

  /**
   * Disables a GL capability.
   *
   * @param cap  the capability to disable.  May be [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.CULL_FACE]],
   *             [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]],
   *             [[WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE]], [[WebGLRenderingContext.SAMPLE_COVERAGE]],
   *             [[WebGLRenderingContext.SCISSOR_TEST]], or [[WebGLRenderingContext.STENCIL_TEST]].
   */
  def disable(cap: Int): Unit = js.native

  /**
   * Disables the generic vertex attribute array specified by index.
   */
  def disableVertexAttribArray(index: Int): Unit = js.native

  /**
   * Renders the primitives in the active arrays.
   *
   * @param mode  the kind of primitives to render.  May be [[WebGLRenderingContext.POINTS]], [[WebGLRenderingContext.LINES]], [[WebGLRenderingContext.LINE_STRIP]], [[WebGLRenderingContext.LINE_LOOP]], [[WebGLRenderingContext.TRIANGLES]], [[WebGLRenderingContext.TRIANGLE_STRIP]], [[WebGLRenderingContext.TRIANGLE_FAN]], or [[WebGLRenderingContext.TRIANGLES]]
   * @param first  the starting index into the arrays.
   * @param count  the number of indices to draw.
   */
  def drawArrays(mode: Int, first: Int, count: Int): Unit = js.native

  /**
   * Renders the primitives in the active arrays using an [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]] to index them.
   *
   * @param mode   the kind of primitives to render.  May be [[WebGLRenderingContext.POINTS]], [[WebGLRenderingContext.LINES]],
   *               [[WebGLRenderingContext.LINE_STRIP]], [[WebGLRenderingContext.LINE_LOOP]], [[WebGLRenderingContext.TRIANGLES]],
   *               [[WebGLRenderingContext.TRIANGLE_STRIP]], [[WebGLRenderingContext.TRIANGLE_FAN]],
   *                or [[WebGLRenderingContext.TRIANGLES]]
   * @param count  the number of elements to render.
   * @param type   the type of index value in the [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].  May be
   *               [[WebGLRenderingContext.UNSIGNED_BYTE]] or [[WebGLRenderingContext.UNSIGNED_SHORT]]
   * @param offset the offset into the [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]] to begin drawing from.
   */
  def drawElements(mode: Int, count: Int, `type`: Int,
      offset: Int): Unit = js.native

  /**
   * Enables a GL capability.
   *
   * @param cap  the capability to enable.  May be [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.CULL_FACE]],
   *             [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]],
   *             [[WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE]], [[WebGLRenderingContext.SAMPLE_COVERAGE]],
   *             [[WebGLRenderingContext.SCISSOR_TEST]], or [[WebGLRenderingContext.STENCIL_TEST]].
   */
  def enable(cap: Int): Unit = js.native

  /**
   * Enables the generic vertex attribute array specified by index.
   */
  def enableVertexAttribArray(index: Int): Unit = js.native

  /**
   * Block until all GL execution is complete.
   */
  def finish(): Unit = js.native

  /**
   * Force all pending GL execution to complete as soon as possible.
   */
  def flush(): Unit = js.native

  /**
   * Attach a [[WebGLRenderbuffer]] to a [[WebGLFramebuffer]].
   *
   * @param target  must be [[WebGLRenderingContext.FRAMEBUFFER]]
   * @param attachment  the attachment point on the framebuffer to attach the renderbuffer.  May be [[WebGLRenderingContext.COLOR_ATTACHMENT0]],
   *                    [[WebGLRenderingContext.DEPTH_ATTACHMENT]], [[WebGLRenderingContext.STENCIL_ATTACHMENT]], or
   *                    [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]].
   * @param renderbuffertarget  must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param renderbuffer  the renderbuffer to attach.
   */
  def framebufferRenderbuffer(target: Int, attachment: Int,
      renderbuffertarget: Int,
      renderbuffer: WebGLRenderbuffer): Unit = js.native

  /**
   * Attach a [[WebGLTexture]] to a [[WebGLFramebuffer]].
   *
   * @param target  must be [[WebGLRenderingContext.FRAMEBUFFER]]
   * @param attachment  the attachment point on the framebuffer to attach the texture.  May be [[WebGLRenderingContext.COLOR_ATTACHMENT0]], [[WebGLRenderingContext.DEPTH_ATTACHMENT]], [[WebGLRenderingContext.STENCIL_ATTACHMENT]], or [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]].
   * @param textarget  the texture target.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]],
   *                   [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   * @param texture  the texture to be attached
   * @param level  the miplevel to be attached
   */
  def framebufferTexture2D(target: Int, attachment: Int, textarget: Int,
      texture: WebGLTexture, level: Int): Unit = js.native

  /**
   * Specifies the winding that is considered front-facing for the purposes of CULL_FACE.
   *
   * @param mode  The winding to consider front-facing.  May be [[WebGLRenderingContext.CW]] or [[WebGLRenderingContext.CCW]]
   */
  def frontFace(mode: Int): Unit = js.native

  /**
   * Generate the complete set of mipmaps for the active texture derived from level 0.
   *
   * @param target  the texture target, may be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]].
   */
  def generateMipmap(target: Int): Unit = js.native

  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given attribute at `index`.
   */
  def getActiveAttrib(program: WebGLProgram,
      index: Int): WebGLActiveInfo = js.native

  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given uniform at `index`.
   */
  def getActiveUniform(program: WebGLProgram,
      index: Int): WebGLActiveInfo = js.native

  /**
   * Returns a new array containing the shaders attached to the given program.
   */
  def getAttachedShaders(
      program: WebGLProgram): js.Array[WebGLShader] = js.native

  /**
   * Returns the index of the named attribute, or -1 on error.
   */
  def getAttribLocation(program: WebGLProgram, name: String): Int = js.native

  /**
   * Returns the value of the requested parameter for a buffer.
   *
   * @param target  must be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   * @param pname  the buffer parameter to retrieve, may be [[WebGLRenderingContext.BUFFER_SIZE]] or [[WebGLRenderingContext.BUFFER_USAGE]]
   *
   */
  def getBufferParameter(target: Int, pname: Int): Int = js.native

  /**
   * Returns the value for the given `pname`.  Returns a value who's type depends on the requested parameter.
   *
   * @param pname  The parameter to query.  May be [[WebGLRenderingContext.ACTIVE_TEXTURE]], [[WebGLRenderingContext.ALIASED_LINE_WIDTH_RANGE]], [[WebGLRenderingContext.ALIASED_POINT_SIZE_RANGE]],
   *               [[WebGLRenderingContext.ALPHA_BITS]], [[WebGLRenderingContext.ARRAY_BUFFER_BINDING]], [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.BLEND_COLOR]], [[WebGLRenderingContext.BLEND_DST_ALPHA]], [[WebGLRenderingContext.BLEND_DST_RGB]],
   *               [[WebGLRenderingContext.BLEND_EQUATION_ALPHA]], [[WebGLRenderingContext.BLEND_EQUATION_RGB]], [[WebGLRenderingContext.BLEND_SRC_ALPHA]], [[WebGLRenderingContext.BLEND_SRC_RGB]], [[WebGLRenderingContext.BLUE_BITS]], [[WebGLRenderingContext.COLOR_CLEAR_VALUE]],
   *               [[WebGLRenderingContext.COLOR_WRITEMASK]], [[WebGLRenderingContext.COMPRESSED_TEXTURE_FORMATS]], [[WebGLRenderingContext.CULL_FACE]], [[WebGLRenderingContext.CULL_FACE_MODE]], [[WebGLRenderingContext.CURRENT_PROGRAM]], [[WebGLRenderingContext.DEPTH_BITS]],
   *               [[WebGLRenderingContext.DEPTH_CLEAR_VALUE]], [[WebGLRenderingContext.DEPTH_FUNC]], `DEPTH-RANGE`, [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DEPTH_WRITEMASK]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER_BINDING]],
   *               [[WebGLRenderingContext.FRAMEBUFFER_BINDING]], [[WebGLRenderingContext.FRONT_FACE]], [[WebGLRenderingContext.GENERATE_MIPMAP_HINT]], [[WebGLRenderingContext.GREEN_BITS]], [[WebGLRenderingContext.LINE_WIDTH]], [[WebGLRenderingContext.MAX_COMBINED_TEXTURE_IMAGE_UNITS]],
   *               [[WebGLRenderingContext.MAX_CUBE_MAP_TEXTURE_SIZE]], [[WebGLRenderingContext.MAX_FRAGMENT_UNIFORM_VECTORS]], [[WebGLRenderingContext.MAX_RENDERBUFFER_SIZE]], [[WebGLRenderingContext.MAX_TEXTURE_IMAGE_UNITS]], [[WebGLRenderingContext.MAX_TEXTURE_SIZE]],
   *               [[WebGLRenderingContext.MAX_VARYING_VECTORS]], [[WebGLRenderingContext.MAX_VERTEX_ATTRIBS]], [[WebGLRenderingContext.MAX_VERTEX_TEXTURE_IMAGE_UNITS]], [[WebGLRenderingContext.MAX_VERTEX_UNIFORM_VECTORS]],
   *               [[WebGLRenderingContext.MAX_VIEWPORT_DIMS]], [[WebGLRenderingContext.PACK_ALIGNMENT]], [[WebGLRenderingContext.POLYGON_OFFSET_FACTOR]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]], [[WebGLRenderingContext.POLYGON_OFFSET_UNITS]],
   *               [[WebGLRenderingContext.RED_BITS]], [[WebGLRenderingContext.RENDERBUFFER_BINDING]], [[WebGLRenderingContext.RENDERER]], [[WebGLRenderingContext.SAMPLE_BUFFERS]], [[WebGLRenderingContext.SAMPLE_COVERAGE_INVERT]], [[WebGLRenderingContext.SAMPLE_COVERAGE_VALUE]],
   *               [[WebGLRenderingContext.SAMPLES]], [[WebGLRenderingContext.SCISSOR_BOX]], [[WebGLRenderingContext.SCISSOR_TEST]], [[WebGLRenderingContext.SHADING_LANGUAGE_VERSION]], [[WebGLRenderingContext.STENCIL_BACK_FAIL]], [[WebGLRenderingContext.STENCIL_BACK_FUNC]],
   *               [[WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_FAIL]], [[WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_PASS]], [[WebGLRenderingContext.STENCIL_BACK_REF]], [[WebGLRenderingContext.STENCIL_BACK_VALUE_MASK]],
   *               [[WebGLRenderingContext.STENCIL_BACK_WRITEMASK]], [[WebGLRenderingContext.STENCIL_BITS]], [[WebGLRenderingContext.STENCIL_CLEAR_VALUE]], [[WebGLRenderingContext.STENCIL_FAIL]], [[WebGLRenderingContext.STENCIL_FUNC]], [[WebGLRenderingContext.STENCIL_PASS_DEPTH_FAIL]],
   *               [[WebGLRenderingContext.STENCIL_PASS_DEPTH_PASS]], [[WebGLRenderingContext.STENCIL_REF]], [[WebGLRenderingContext.STENCIL_TEST]], [[WebGLRenderingContext.STENCIL_VALUE_MASK]], [[WebGLRenderingContext.STENCIL_WRITEMASK]], [[WebGLRenderingContext.SUBPIXEL_BITS]],
   *               [[WebGLRenderingContext.TEXTURE_BINDING_2D]], [[WebGLRenderingContext.TEXTURE_BINDING_CUBE_MAP]], [[WebGLRenderingContext.UNPACK_ALIGNMENT]], [[WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL]], [[WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL]],
   *               [[WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL]], [[WebGLRenderingContext.VENDOR]], [[WebGLRenderingContext.VERSION]] or [[WebGLRenderingContext.VIEWPORT]].
   */
  def getParameter(pname: Int): js.Any = js.native

  /**
   * Returns the error value, and resets the error to [[WebGLRenderingContext.NO_ERROR]].
   *
   * Only the first error is recorded, new errors are not stored until the error value is reset
   * to [[WebGLRenderingContext.NO_ERROR]] by a call to this method.
   *
   * @return the error code.  One of [[WebGLRenderingContext.NO_ERROR]], [[WebGLRenderingContext.INVALID_ENUM]], [[WebGLRenderingContext.INVALID_VALUE]], [[WebGLRenderingContext.INVALID_OPERATION]], [[WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION]], or [[WebGLRenderingContext.OUT_OF_MEMORY]].
   */
  def getError(): Int = js.native

  /**
   * Returns the value for the given parameter name on for the target and attachment.
   * The return type is dependent on the requested parameter.
   *
   * @param target must be FRAMEBUFFER
   * @param attachment the attachment to examine.  May be [[WebGLRenderingContext.COLOR_ATTACHMENT0]], [[WebGLRenderingContext.DEPTH_ATTACHMENT]],
   *  				   [[WebGLRenderingContext.STENCIL_ATTACHMENT]], or [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]].
   * @param pname the framebuffer attachment parameter.  May be [[WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE]],
   *              [[WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME]], [[WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL]], or
   *              [[WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE]]
   */
  def getFramebufferAttachmentParameter(target: Int, attachment: Int,
      pname: Int): js.Any = js.native

  /**
   * Returns the value for the given parameter name for the program.
   * The return type is dependent on the requested parameter.
   *
   * @param program the program to query.
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.DELETE_STATUS]], [[WebGLRenderingContext.LINK_STATUS]],
   *               [[WebGLRenderingContext.VALIDATE_STATUS]], [[WebGLRenderingContext.ATTACHED_SHADERS]],
   *               [[WebGLRenderingContext.ACTIVE_ATTRIBUTES]], or [[WebGLRenderingContext.ACTIVE_UNIFORMS]].
   */
  def getProgramParameter(program: WebGLProgram,
      pname: Int): js.Any = js.native

  /**
   * Returns a string containing information about the last link or validation operation for a program.
   */
  def getProgramInfoLog(program: WebGLProgram): String = js.native

  /**
   * Returns the value of a parameter on the active renderbuffer.
   * The return type is dependent on the requested parameter.
   *
   * @param target  must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param pname  the parameter to query, may be [[WebGLRenderingContext.RENDERBUFFER_WIDTH]],
   *               [[WebGLRenderingContext.RENDERBUFFER_HEIGHT]], [[WebGLRenderingContext.RENDERBUFFER_INTERNAL_FORMAT]],
   *               [[WebGLRenderingContext.RENDERBUFFER_RED_SIZE]], [[WebGLRenderingContext.RENDERBUFFER_GREEN_SIZE]],
   *               [[WebGLRenderingContext.RENDERBUFFER_BLUE_SIZE]], [[WebGLRenderingContext.RENDERBUFFER_ALPHA_SIZE]],
   *               [[WebGLRenderingContext.RENDERBUFFER_STENCIL_SIZE]], or [[WebGLRenderingContext.RENDERBUFFER_DEPTH_SIZE]]
   */
  def getRenderbufferParameter(target: Int, pname: Int): js.Any = js.native

  /**
   * Returns the value of a parameter on the specified [[WebGLShader]].
   * The return type is dependent on the requested parameter.
   *
   * @param shader  the shader to query
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.SHADER_TYPE]],
   *               [[WebGLRenderingContext.DELETE_STATUS]] or [[WebGLRenderingContext.COMPILE_STATUS]]
   *
   */
  def getShaderParameter(shader: WebGLShader, pname: Int): js.Any = js.native

  /**
   * Returns a new [[WebGLShaderPrecisionFormat]] for the given shader type and precision type.
   *
   * @param shadertype the type of shader, may be [[WebGLRenderingContext.FRAGMENT_SHADER]] or [[WebGLRenderingContext.VERTEX_SHADER]].
   * @param precisiontype the precision type to query, may be [[WebGLRenderingContext.LOW_FLOAT]],
   *                      [[WebGLRenderingContext.MEDIUM_FLOAT]], [[WebGLRenderingContext.HIGH_FLOAT]], [[WebGLRenderingContext.LOW_INT]],
   *                      [[WebGLRenderingContext.MEDIUM_INT]], or [[WebGLRenderingContext.HIGH_INT]].
   */
  def getShaderPrecisionFormat(shadertype: Int,
      precisiontype: Int): WebGLShaderPrecisionFormat = js.native

  /**
   * Returns the information log from the last compile of the shader.
   */
  def getShaderInfoLog(shader: WebGLShader): String = js.native

  /**
   * Returns the source of the given shader.
   */
  def getShaderSource(shader: WebGLShader): String = js.native

  /**
   * Returns the value of the given texture parameter on the target of the active texture.
   *
   *  @param target  the target to query.  May be either [[WebGLRenderingContext.TEXTURE_2D]] or `TEXTURE_CUBE_MAP`.
   *  @param pname  the parameter to query.  May be either [[WebGLRenderingContext.TEXTURE_MAG_FILTER]],
   *                [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_WRAP_S]],
   *                 or [[WebGLRenderingContext.TEXTURE_WRAP_T]].
   */
  def getTexParameter(target: Int, pname: Int): js.Any = js.native

  /**
   * Returns the value of the uniform in the given program and location.  The return type is dependent
   * on the uniform type.
   */
  def getUniform(program: WebGLProgram,
      location: WebGLUniformLocation): js.Any = js.native

  /**
   * Returns a new [[WebGLUniformLocation]] that represents the location of the given uniform in the specified program.
   * If the uniform does not exist, or another error occurs, returns `null`.
   */
  def getUniformLocation(program: WebGLProgram,
      name: String): WebGLUniformLocation = js.native

  /**
   * Returns the value of the named parameter for a given vertex attribute index.
   *
   * @param index  the index of the vertex attribute to query.
   * @param pname  the requested parameter, may be [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING]],
   * 			   [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_ENABLED]], [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_SIZE]],
   *               [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_STRIDE]], [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_TYPE]],
   *               [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_NORMALIZED]], [[WebGLRenderingContext.CURRENT_VERTEX_ATTRIB]]
   *
   */
  def getVertexAttrib(index: Int, pname: Int): js.Any = js.native

  /**
   * Returns the offset of the vertex attribute.
   *
   * @param index  the index of the vertex attribute to retrieve
   * @param pname  must be [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER]]
   */
  def getVertexAttribOffset(index: Int, pname: Int): Int = js.native

  /**
   * Specifies implementation specific hints.
   *
   * @param target  the hint to specify.  Must be [[WebGLRenderingContext.GENERATE_MIPMAP_HINT]]
   * @param mode  the desired mode.  Must be one of [[WebGLRenderingContext.FASTEST]],
   *              [[WebGLRenderingContext.NICEST]], or [[WebGLRenderingContext.DONT_CARE]].
   */
  def hint(target: Int, mode: Int): Unit = js.native

  /**
   * Returns `true` if the `buffer` is valid, `false` otherwise.
   */
  def isBuffer(buffer: js.Any): Boolean = js.native

  /**
   * Returns `true` if the specified capability is enabled, `false` otherwise.
   * @see [[WebGLRenderingContext#enable]]
   */
  def isEnabled(cap: Int): Boolean = js.native

  /**
   * Returns `true` if the `framebuffer` is valid, `false` otherwise.
   */
  def isFramebuffer(framebuffer: js.Any): Boolean = js.native

  /**
   * Returns `true` if the `program` is valid, `false` otherwise.
   */
  def isProgram(program: js.Any): Boolean = js.native

  /**
   * Returns `true` if the `renderbuffer` is valid, `false` otherwise.
   */
  def isRenderbuffer(renderbuffer: js.Any): Boolean = js.native

  /**
   * Returns `true` if the `shader` is valid, `false` otherwise.
   */
  def isShader(shader: js.Any): Boolean = js.native

  /**
   * Returns `true` if the `texture` is valid, `false` otherwise.
   */
  def isTexture(texture: js.Any): Boolean = js.native

  /**
   * Specifies the line width.
   */
  def lineWidth(width: Double): Unit = js.native

  /**
   * Attempts to link the specified [[WebGLProgram]].
   */
  def linkProgram(program: WebGLProgram): Unit = js.native

  /**
   * Sets the pixel store mode, used when copying image data such as framebuffers or textures.
   *
   * @param pname  the property to change.  May be one of [[WebGLRenderingContext.PACK_ALIGNMENT]],
   *               [[WebGLRenderingContext.UNPACK_ALIGNMENT]], [[WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL]],
   *               [[WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL]] or [[WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL]].
   */
  def pixelStorei(pname: Int, param: Int): Unit = js.native

  /**
   * Specifies the polygon offset.  When [[WebGLRenderingContext.POLYGON_OFFSET_FILL]] is enabled, depth values for a fragment have an offset applied
   * to them, calculated as `factor`*DZ + r*`units`, where DZ is the change in z based on the polygon's screen area, and r is the minimum value that
   * is guaranteed produce a measurable offset.
   */
  def polygonOffset(factor: Double, units: Double): Unit = js.native

  /**
   * Reads pixels from the framebuffer into `pixels`.
   *
   * @param x  the x coordinate of the bottom left of the area to read.
   * @param y  the y coordinate of the bottom left of the area to read.
   * @param width  the width of the area to read.
   * @param height  the height of the area to read.
   * @param format  the format of the desired output.  Must be one of [[WebGLRenderingContext.UNSIGNED_BYTE]],
   *             [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]], [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]],
   *             [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]
   */
  def readPixels(x: Int, y: Int, width: Int, height: Int, format: Int,
      `type`: Int, pixels: ArrayBufferView): Unit = js.native

  /**
   * Create renderbuffer image storage.
   *
   * Initializes the renderbuffer to use the new storage format, replacing any previous store.
   *
   * @param target  must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param internalformat  specifies the format of the renderbuffer.  May be one of [[WebGLRenderingContext.RGBA4]], [[WebGLRenderingContext.RGB565]],
   *                        [[WebGLRenderingContext.RGB5_A1]], [[WebGLRenderingContext.DEPTH_COMPONENT16]], [[WebGLRenderingContext.STENCIL_INDEX8]] or
   *                        [[WebGLRenderingContext.DEPTH_STENCIL]].
   */
  def renderbufferStorage(target: Int, internalformat: Int, width: Int,
      height: Int): Unit = js.native

  /**
   * Sets the sampling coverage parameters for primitive antialiasing.
   *
   * The OpenGL multisampling algorithm is too involved to concisely explain here.
   * Please consult [[http://www.opengl.org/registry/specs/SGIS/multisample.txt]].
   *
   * @param value  the sample coverage value, clamped to 0..1.
   * @param invert  if true, the mask will be bitwise-inverted.
   */
  def sampleCoverage(value: Int, invert: Boolean): Unit = js.native

  /**
   * Sets the scissor rectangle.  When [[WebGLRenderingContext.SCISSOR_TEST]] is enabled, rendering will be restricted to this rectangle.
   */
  def scissor(x: Int, y: Int, width: Int, height: Int): Unit = js.native

  /**
   * Sets the GLSL source for the given shader.
   */
  def shaderSource(shader: WebGLShader, source: String): Unit = js.native

  /**
   * Sets the stencil test for front and back faces.
   * @param func the test function.  One of [[WebGLRenderingContext.NEVER]], [[WebGLRenderingContext.LESS]],
   * 			 [[WebGLRenderingContext.LEQUAL]], [[WebGLRenderingContext.GREATER]], [[WebGLRenderingContext.GEQUAL]],
   *             [[WebGLRenderingContext.EQUAL]], [[WebGLRenderingContext.NOTEQUAL]], and [[WebGLRenderingContext.ALWAYS]]
   * @param ref  the reference value to test against in the stencil buffer
   * @param mask mask that is ANDed with `ref` and the tested value and stored in the stencil buffer.
   */
  def stencilFunc(func: Int, ref: Int, mask: Int): Unit = js.native

  /**
   * Sets the stencil test for the given face type.
   * @param face the face(s) to configure the test for.  May be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]]
   *             or [[WebGLRenderingContext.FRONT_AND_BACK]].
   * @param func the test function.  One of [[WebGLRenderingContext.NEVER]], [[WebGLRenderingContext.LESS]],
   * 			 [[WebGLRenderingContext.LEQUAL]], [[WebGLRenderingContext.GREATER]], [[WebGLRenderingContext.GEQUAL]],
   *             [[WebGLRenderingContext.EQUAL]], [[WebGLRenderingContext.NOTEQUAL]], and [[WebGLRenderingContext.ALWAYS]]
   * @param ref  the reference value to test against in the stencil buffer
   * @param mask mask that is ANDed with `ref` and the tested value and stored in the stencil buffer.
   */
  def stencilFuncSeparate(face: Int, func: Int, ref: Int,
      mask: Int): Unit = js.native

  /**
   * Configure which bits in the stencil buffer may be written to by front or back faces.
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMask(mask: Int): Unit = js.native

  /**
   * Configure which bits in the stencil buffer may be written to by the given face type.
   * @param face the face(s) to configure the mask for.  May be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]]
   *             or [[WebGLRenderingContext.FRONT_AND_BACK]].
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMaskSeparate(face: Int, mask: Int): Unit = js.native

  /**
   * Configure the effect of a stencil or depth test failing for front or back faces.
   *
   * @param fail  the effect of the stencil test failing.  May be one of
   *        [[WebGLRenderingContext.KEEP]], [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.REPLACE]],
   *        [[WebGLRenderingContext.INCR]], [[WebGLRenderingContext.INCR_WRAP]], [[WebGLRenderingContext.DECR]],
   *        [[WebGLRenderingContext.DECR_WRAP]], and [[WebGLRenderingContext.INVERT]]
   *
   * @param zfail  the effect of the stencil test passing but the depth test failing.  Parameters are as fail.
   * @param zpass  the effect of the stencil test failing but the depth test passing.  Parameters are as fail.
   */
  def stencilOp(fail: Int, zfail: Int, zpass: Int): Unit = js.native

  /**
   * Configure the effect of a stencil or depth test failing for the specified faces.
   *
   * @param face the face(s) to configure the stencil operation for.  May be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]]
   *             or [[WebGLRenderingContext.FRONT_AND_BACK]].
   * @param fail  the effect of the stencil test failing.  May be one of
   *        [[WebGLRenderingContext.KEEP]], [[WebGLRenderingContext.ZERO]], [[WebGLRenderingContext.REPLACE]],
   *        [[WebGLRenderingContext.INCR]], [[WebGLRenderingContext.INCR_WRAP]], [[WebGLRenderingContext.DECR]],
   *        [[WebGLRenderingContext.DECR_WRAP]], and [[WebGLRenderingContext.INVERT]]
   *
   * @param zfail  the effect of the stencil test passing but the depth test failing.  Parameters are as fail.
   * @param zpass  the effect of the stencil test failing but the depth test passing.  Parameters are as fail.
   */
  def stencilOpSeparate(face: Int, fail: Int, zfail: Int,
      zpass: Int): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from source data.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the target pixel data.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: Int, level: Int, internalformat: Int, width: Int,
      height: Int, border: Int, format: Int, `type`: Int,
      pixels: ArrayBufferView): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from an ImageData object.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the target pixel data.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the source image data.
   */
  def texImage2D(target: Int, level: Int, internalformat: Int, format: Int,
      `type`: Int, pixels: ImageData): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLImageElement object.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the target pixel data.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the source image data.
   */
  def texImage2D(target: Int, level: Int, internalformat: Int, format: Int,
      `type`: Int, pixels: HTMLImageElement): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLCanvasElement object.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the target pixel data.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the source image data.
   */
  def texImage2D(target: Int, level: Int, internalformat: Int, format: Int,
      `type`: Int, pixels: HTMLCanvasElement): Unit = js.native

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLVideoElement object.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the target pixel data.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the source image data.
   */
  def texImage2D(target: Int, level: Int, internalformat: Int, format: Int,
      `type`: Int, pixels: HTMLVideoElement): Unit = js.native

  /**
   * Sets the texture parameter for the active texture unit.
   *
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameterf(target: Int, pname: Int, param: Double): Unit = js.native

  /**
   * Sets the texture parameter for the active texture unit.
   *
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameteri(target: Int, pname: Int, param: Int): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `ArrayBufferView`.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      width: Int, height: Int, format: Int, `type`: Int,
      pixels: ArrayBufferView): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `ImageData` object.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      format: Int, `type`: Int, pixels: ImageData): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLImageElement`.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      format: Int, `type`: Int, pixels: HTMLImageElement): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLCanvasElement`.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the image data..
   */
  def texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      format: Int, `type`: Int, pixels: HTMLCanvasElement): Unit = js.native

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLVideoElement`.
   *
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param format  the format of the incoming pixel data.
   *  @param type the data type of the pixel data.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int,
      format: Int, `type`: Int, pixels: HTMLVideoElement): Unit = js.native

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the scalar to bind to.
   */
  def uniform1f(location: WebGLUniformLocation, x: Double): Unit = js.native

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a `Float32Array` to bind to
   */
  def uniform1fv(location: WebGLUniformLocation,
      v: Float32Array): Unit = js.native

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform1fv(location: WebGLUniformLocation,
      v: js.Array[Double]): Unit = js.native

  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the scalar to bind to.
   */
  def uniform1i(location: WebGLUniformLocation, x: Int): Unit = js.native

  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  an `Int32Array` to bind to
   */
  def uniform1iv(location: WebGLUniformLocation,
      v: Int32Array): Unit = js.native

  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform1iv(location: WebGLUniformLocation,
      v: js.Array[Int]): Unit = js.native

  /**
   * Loads a a 2-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first float component
   * @param y  the second float component
   */
  def uniform2f(location: WebGLUniformLocation, x: Double,
      y: Double): Unit = js.native

  /**
   * Loads a a 2-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a `Float32Array` to bind to
   */
  def uniform2fv(location: WebGLUniformLocation,
      v: Float32Array): Unit = js.native

  /**
   * Loads a a 2-vector of floats
   *
   * @param location  the location to bind into a [[WebGLUniformLocation]].
   * @param v  a js.Array to bind to.
   */
  def uniform2fv(location: WebGLUniformLocation,
      v: js.Array[Double]): Unit = js.native

  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   */
  def uniform2i(location: WebGLUniformLocation, x: Int,
      y: Int): Unit = js.native

  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  an `Int32Array` to bind to
   */
  def uniform2iv(location: WebGLUniformLocation,
      v: Int32Array): Unit = js.native

  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform2iv(location: WebGLUniformLocation,
      v: js.Array[Int]): Unit = js.native

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first float component.
   * @param y  the second float component.
   * @param z  the third float component.
   */
  def uniform3f(location: WebGLUniformLocation, x: Double, y: Double,
      z: Double): Unit = js.native

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a `Float32Array` to bind to
   */
  def uniform3fv(location: WebGLUniformLocation,
      v: Float32Array): Unit = js.native

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform3fv(location: WebGLUniformLocation,
      v: js.Array[Double]): Unit = js.native

  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   * @param z  the third integer component
   */
  def uniform3i(location: WebGLUniformLocation, x: Int, y: Int,
      z: Int): Unit = js.native

  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  an `Int32Array` to bind to
   */
  def uniform3iv(location: WebGLUniformLocation,
      v: Int32Array): Unit = js.native

  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform3iv(location: WebGLUniformLocation,
      v: js.Array[Int]): Unit = js.native

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first float component.
   * @param y  the second float component.
   * @param z  the third float component.
   * @param w  the fourth float component.
   */
  def uniform4f(location: WebGLUniformLocation, x: Double, y: Double,
      z: Double, w: Double): Unit = js.native

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a `Float32Array` to bind to
   */
  def uniform4fv(location: WebGLUniformLocation,
      v: Float32Array): Unit = js.native

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform4fv(location: WebGLUniformLocation,
      v: js.Array[Double]): Unit = js.native

  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   * @param z  the third integer component
   * @param w  the third integer component
   */
  def uniform4i(location: WebGLUniformLocation, x: Int, y: Int, z: Int,
      w: Int): Unit = js.native

  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  an `Int32Array` to bind to
   */
  def uniform4iv(location: WebGLUniformLocation,
      v: Int32Array): Unit = js.native

  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform4iv(location: WebGLUniformLocation,
      v: js.Array[Int]): Unit = js.native

  /**
   * Loads a a 4x2 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `Float32Array` containing the matrix data.
   */
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean,
      value: Float32Array): Unit = js.native

  /**
   * Loads a a 4x2 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean,
      value: js.Array[Double]): Unit = js.native

  /**
   * Loads a a 4x3 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `Float32Array` containing the matrix data.
   */
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean,
      value: Float32Array): Unit = js.native

  /**
   * Loads a a 4x3 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean,
      value: js.Array[Double]): Unit = js.native

  /**
   * Loads a a 4x4 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `Float32Array` containing the matrix data.
   */
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean,
      value: Float32Array): Unit = js.native

  /**
   * Loads a a 4x4 matrix into a [[WebGLUniformLocation]].
   *
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean,
      value: js.Array[Double]): Unit = js.native

  /**
   * Makes a [[WebGLProgram]] become the active program.
   */
  def useProgram(program: WebGLProgram): Unit = js.native

  /**
   * Validates a [[WebGLProgram]].
   */
  def validateProgram(program: WebGLProgram): Unit = js.native

  /**
   * Loads a scalar into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param x  the scalar to load.
   */
  def vertexAttrib1f(indx: Int, x: Double): Unit = js.native

  /**
   * Loads a scalar into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: Int, values: Float32Array): Unit = js.native

  /**
   * Loads a scalar into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: Int, values: js.Array[Double]): Unit = js.native

  /**
   * Loads a 2-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component.
   */
  def vertexAttrib2f(indx: Int, x: Double, y: Double): Unit = js.native

  /**
   * Loads a 2-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: Int, values: Float32Array): Unit = js.native

  /**
   * Loads a 2-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: Int, values: js.Array[Double]): Unit = js.native

  /**
   * Loads a 3-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component.
   * @param z  the third component.
   */
  def vertexAttrib3f(indx: Int, x: Double, y: Double,
      z: Double): Unit = js.native

  /**
   * Loads a 3-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: Int, values: Float32Array): Unit = js.native

  /**
   * Loads a 3-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: Int, values: js.Array[Double]): Unit = js.native

  /**
   * Loads a 4-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component.
   * @param z  the third component.
   * @param w  the fourth component.
   */
  def vertexAttrib4f(indx: Int, x: Double, y: Double, z: Double,
      w: Double): Unit = js.native

  /**
   * Loads a 4-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: Int, values: Float32Array): Unit = js.native

  /**
   * Loads a 4-vector into a vertex attribute.
   *
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: Int, values: js.Array[Double]): Unit = js.native

  /**
   * Defines an array of generic vertex attribute data.
   *
   * @param indx the index of the attribute
   * @param size the number of components per attribute.  Must be 1..4
   * @param type the datatype for each component, may be [[WebGLRenderingContext.BYTE]],  [[WebGLRenderingContext.UNSIGNED_BYTE]],
   * 			  [[WebGLRenderingContext.SHORT]], [[WebGLRenderingContext.UNSIGNED_SHORT]], or
   *               [[WebGLRenderingContext.FLOAT]].
   * @param normalized if `true`, values are normalized on access, otherwise they are converted to fixed point values on access.
   * @param stride the gap between attributes.  0 would be packed together.
   * @param offset the offset to the first component in the array.
   */
  def vertexAttribPointer(indx: Int, size: Int, `type`: Int,
      normalized: Boolean, stride: Int, offset: Int): Unit = js.native

  /**
   * Sets the OpenGL viewport to render within.
   */
  def viewport(x: Double, y: Double, width: Double,
      height: Double): Unit = js.native
}
