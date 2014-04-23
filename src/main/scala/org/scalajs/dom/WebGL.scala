/*
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the scala-js-dom project.
 * 
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import js.annotation._

/**
 * Contains drawing surface attributes.
 */
class WebGLContextAttributes extends js.Object {
  /**
   * When `true`, the drawing buffer has an alpha channel.
   */
  var alpha: js.Boolean = ???
  /**
   * When `true`, the drawing buffer has a depth buffer of at least 16 bits.
   */
  var depth: js.Boolean = ???
  /**
   * When `true`, the drawing buffer has a stencil buffer of at least 8 bits.
   */
  var stencil: js.Boolean = ???
  /**
   * When `true` and antialiasing is supported, the drawing buffer will use an antialiasing method if it's choice.
   */
  var antialias: js.Boolean = ???
  /**
   * When `true` the page compositor assumes the buffer's contents is premultiplied.  Used for sensible transparency when using
   * WebGL canvases for overlays.
   */
  var premultipliedAlpha: js.Boolean = ???
  /**
   * When `true`, the drawing buffer is preserved after rendering, otherwise it is cleared.  On some implementations preserving the drawing buffer
   * can dramatically impact performance.
   */
  var preserveDrawingBuffer: js.Boolean = ???
}

/**
 * An opaque type representing a WebGL buffer.
 */
class WebGLBuffer private () extends js.Object

/**
 * An opaque type representing a WebGL framebuffer.
 */
class WebGLFramebuffer private () extends js.Object

/**
 * An opaque type representing a WebGL program.
 */
class WebGLProgram private () extends js.Object

/**
 * An opaque type representing a WebGL renderbuffer.
 */
class WebGLRenderbuffer private () extends js.Object

/**
 * An opaque type representing a WebGL shader.
 */
class WebGLShader private () extends js.Object

/**
 * An opaque type representing a WebGL texture.
 */
class WebGLTexture private () extends js.Object

/**
 * An opaque type representing a WebGL uniform location.
 */
class WebGLUniformLocation private () extends js.Object

/**
 * Holds information returned by [[WebGLRenderingContext#getActiveAttrib]] and [[WebGLRenderingContext#getActiveUniform]]. 
 */
class WebGLActiveInfo private () extends js.Object {
  /**
   * The size of the requested variable.
   */
  val size: js.Number = ???
  /**
   * The type of the requested variable.
   */
  val `type`: js.Number = ???
  /**
   * The name of the requested variable.
   */
  val name: js.String = ???  
}

/**
 * Represents information about the implementation's precision for given parameters.  See [[WebGLRenderingContext#getShaderPrecisionFormat]].
 */
class WebGLShaderPrecisionFormat private () extends js.Object {
  /**
   * The base 2 log of the absolute value of the minimum value that can be represented.
   */
  val rangeMin: js.Number = ???
  
  /**
   * The base 2 log of the absolute value of the maximum value that can be represented.
   */
  val rangeMax: js.Number = ???
  
  /**
   * The number of bits of precision that can be represented. For integer formats this value is always 0.
   */
  val precision: js.Number = ???
}

/**
 * WebGLRenderingContext objects expose the WebGLRenderingContext interface, the principal interface in WebGL 
 * which provides special properties and methods to manipulate the 3D content rendered in an HTML canvas element.
 * 
 * MDN
 */
object WebGLRenderingContext extends js.Object {
  /**
   * Specifies the depth buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  val DEPTH_BUFFER_BIT: js.Number = ???
  
  /**
   * Specifies the stencil buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  val STENCIL_BUFFER_BIT: js.Number = ???
  
  /**
   * Specifies the color buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  val COLOR_BUFFER_BIT: js.Number = ???
  
  /* BeginMode */
  /**
   * Specifies the elements should be drawn as points.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]] 
   */
  val POINTS: js.Number = ???
  
  /**
   * Specifies the elements should be drawn as lines.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val LINES: js.Number = ???
  
  /**
   * Specifies the elements should be drawn as a line loop.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */  
  val LINE_LOOP: js.Number = ???
  
  /**
   * Specifies the elements should be drawn as a line strip.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val LINE_STRIP: js.Number = ???
  
  /**
   * Specifies the elements should be drawn as triangles.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val TRIANGLES: js.Number = ???
  
  /**
   * Specifies the elements should be drawn as a triangle strip.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val TRIANGLE_STRIP: js.Number = ???
  
  
  /**
   * Specifies the elements should be drawn as a triangle fan.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */  
  val TRIANGLE_FAN: js.Number = ???
  
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
  val ZERO = 0
  val ONE = 1
  val SRC_COLOR: js.Number = ???
  val ONE_MINUS_SRC_COLOR: js.Number = ???
  val SRC_ALPHA: js.Number = ???
  val ONE_MINUS_SRC_ALPHA: js.Number = ???
  val DST_ALPHA: js.Number = ???
  val ONE_MINUS_DST_ALPHA: js.Number = ???
  
  /* BlendingFactorSrc */
  /*    ZERO */
  /*    ONE */
  val DST_COLOR: js.Number = ???
  val ONE_MINUS_DST_COLOR: js.Number = ???
  val SRC_ALPHA_SATURATE: js.Number = ???
  /*    SRC_ALPHA */
  /*    ONE_MINUS_SRC_ALPHA */
  /*    DST_ALPHA */
  /*    ONE_MINUS_DST_ALPHA */
  
  /* BlendEquationSeparate */
  val FUNC_ADD: js.Number = ???
  val BLEND_EQUATION: js.Number = ???
  val BLEND_EQUATION_RGB: js.Number = ???   /* same as BLEND_EQUATION */
  val BLEND_EQUATION_ALPHA: js.Number = ???
  
  /* BlendSubtract */
  val FUNC_SUBTRACT: js.Number = ???
  val FUNC_REVERSE_SUBTRACT: js.Number = ???
  
  /* Separate Blend Functions */
  val BLEND_DST_RGB: js.Number = ???
  val BLEND_SRC_RGB: js.Number = ???
  val BLEND_DST_ALPHA: js.Number = ???
  val BLEND_SRC_ALPHA: js.Number = ???
  val CONSTANT_COLOR: js.Number = ???
  val ONE_MINUS_CONSTANT_COLOR: js.Number = ???
  val CONSTANT_ALPHA: js.Number = ???
  val ONE_MINUS_CONSTANT_ALPHA: js.Number = ???
  val BLEND_COLOR: js.Number = ???
  
  /* Buffer Objects */
  val ARRAY_BUFFER: js.Number = ???
  val ELEMENT_ARRAY_BUFFER: js.Number = ???
  val ARRAY_BUFFER_BINDING: js.Number = ???
  val ELEMENT_ARRAY_BUFFER_BINDING: js.Number = ???
  
  val STREAM_DRAW: js.Number = ???
  val STATIC_DRAW: js.Number = ???
  val DYNAMIC_DRAW: js.Number = ???
  
  val BUFFER_SIZE: js.Number = ???
  val BUFFER_USAGE: js.Number = ???
  
  val CURRENT_VERTEX_ATTRIB: js.Number = ???
  
  /* CullFaceMode */
  /**
   * Specifies front faces.
   */
  val FRONT: js.Number = ???
  
  /**
   * Specifies back faces.
   */
  val BACK: js.Number = ???
  
  /**
   * Specifies both front and back faces.
   */
  val FRONT_AND_BACK: js.Number = ???
  
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
  val CULL_FACE: js.Number = ???
  /**
   * Capability to enable/disable blending.
   */
  val BLEND: js.Number = ???
  
  /**
   * Capability to enable/disable dithering.
   */  
  val DITHER: js.Number = ???
  
  /**
   * Capability to enable/disable the stencil test.
   */
  val STENCIL_TEST: js.Number = ???
  
  /**
   * Capability to enable/disable the depth test.
   */  
  val DEPTH_TEST: js.Number = ???
  
  /**
   * Capability to enable/disable the scissor test.
   */  
  val SCISSOR_TEST: js.Number = ???

  /**
   * Capability to enable/disable polygon offset.
   */  
  val POLYGON_OFFSET_FILL: js.Number = ???
  val SAMPLE_ALPHA_TO_COVERAGE: js.Number = ???
  val SAMPLE_COVERAGE: js.Number = ???
  
  /* ErrorCode */
  /**
   * No error has occurred.
   */    
  val NO_ERROR = 0
  
  /**
   * An invalid enumerated name has been passed to an API function.
   */
  val INVALID_ENUM: js.Number = ???
  
  /**
   * An invalid value has been passed to an API function.
   */
  val INVALID_VALUE: js.Number = ???
  
  /**
   * The requested operation is not valid.
   */
  val INVALID_OPERATION: js.Number = ???
  
  /**
   * The operation requested could not be completed because it ran out of memory.
   */
  val OUT_OF_MEMORY: js.Number = ???
  
  /* FrontFaceDirection */
  /**
   * Clockwise wound triangles are front-facing.
   */  
  val CW: js.Number = ???
  /**
   * Counter-Clockwise wound triangles are front-facing.
   */  
  val CCW: js.Number = ???
  
  /* GetPName */
  val LINE_WIDTH: js.Number = ???
  val ALIASED_POINT_SIZE_RANGE: js.Number = ???
  val ALIASED_LINE_WIDTH_RANGE: js.Number = ???
  val CULL_FACE_MODE: js.Number = ???
  val FRONT_FACE: js.Number = ???
  val DEPTH_RANGE: js.Number = ???
  val DEPTH_WRITEMASK: js.Number = ???
  val DEPTH_CLEAR_VALUE: js.Number = ???
  val DEPTH_FUNC: js.Number = ???
  val STENCIL_CLEAR_VALUE: js.Number = ???
  val STENCIL_FUNC: js.Number = ???
  val STENCIL_FAIL: js.Number = ???
  val STENCIL_PASS_DEPTH_FAIL: js.Number = ???
  val STENCIL_PASS_DEPTH_PASS: js.Number = ???
  val STENCIL_REF: js.Number = ???
  val STENCIL_VALUE_MASK: js.Number = ???
  val STENCIL_WRITEMASK: js.Number = ???
  val STENCIL_BACK_FUNC: js.Number = ???
  val STENCIL_BACK_FAIL: js.Number = ???
  val STENCIL_BACK_PASS_DEPTH_FAIL: js.Number = ???
  val STENCIL_BACK_PASS_DEPTH_PASS: js.Number = ???
  val STENCIL_BACK_REF: js.Number = ???
  val STENCIL_BACK_VALUE_MASK: js.Number = ???
  val STENCIL_BACK_WRITEMASK: js.Number = ???
  val VIEWPORT: js.Number = ???
  val SCISSOR_BOX: js.Number = ???
  /*    SCISSOR_TEST */
  val COLOR_CLEAR_VALUE: js.Number = ???
  val COLOR_WRITEMASK: js.Number = ???
  val UNPACK_ALIGNMENT: js.Number = ???
  val PACK_ALIGNMENT: js.Number = ???
  val MAX_TEXTURE_SIZE: js.Number = ???
  val MAX_VIEWPORT_DIMS: js.Number = ???
  val SUBPIXEL_BITS: js.Number = ???
  val RED_BITS: js.Number = ???
  val GREEN_BITS: js.Number = ???
  val BLUE_BITS: js.Number = ???
  val ALPHA_BITS: js.Number = ???
  val DEPTH_BITS: js.Number = ???
  val STENCIL_BITS: js.Number = ???
  val POLYGON_OFFSET_UNITS: js.Number = ???
  /*    POLYGON_OFFSET_FILL */
  val POLYGON_OFFSET_FACTOR: js.Number = ???
  val TEXTURE_BINDING_2D: js.Number = ???
  val SAMPLE_BUFFERS: js.Number = ???
  val SAMPLES: js.Number = ???
  val SAMPLE_COVERAGE_VALUE: js.Number = ???
  val SAMPLE_COVERAGE_INVERT: js.Number = ???
  
  /* GetTextureParameter */
  /*    TEXTURE_MAG_FILTER */
  /*    TEXTURE_MIN_FILTER */
  /*    TEXTURE_WRAP_S */
  /*    TEXTURE_WRAP_T */
  
  val COMPRESSED_TEXTURE_FORMATS: js.Number = ???
  
  /* HintMode */
  val DONT_CARE: js.Number = ???
  val FASTEST: js.Number = ???
  val NICEST: js.Number = ???
  
  /* HintTarget */
  val GENERATE_MIPMAP_HINT: js.Number = ???
  
  /* DataType */
  val BYTE: js.Number = ???
  val UNSIGNED_BYTE: js.Number = ???
  val SHORT: js.Number = ???
  val UNSIGNED_SHORT: js.Number = ???
  val INT: js.Number = ???
  val UNSIGNED_INT: js.Number = ???
  val FLOAT: js.Number = ???
  
  /* PixelFormat */
  val DEPTH_COMPONENT: js.Number = ???
  val ALPHA: js.Number = ???
  val RGB: js.Number = ???
  val RGBA: js.Number = ???
  val LUMINANCE: js.Number = ???
  val LUMINANCE_ALPHA: js.Number = ???
  
  /* PixelType */
  /*    UNSIGNED_BYTE */
  val UNSIGNED_SHORT_4_4_4_4: js.Number = ???
  val UNSIGNED_SHORT_5_5_5_1: js.Number = ???
  val UNSIGNED_SHORT_5_6_5: js.Number = ???
  
  /* Shaders */
  val FRAGMENT_SHADER: js.Number = ???
  val VERTEX_SHADER: js.Number = ???
  val MAX_VERTEX_ATTRIBS: js.Number = ???
  val MAX_VERTEX_UNIFORM_VECTORS: js.Number = ???
  val MAX_VARYING_VECTORS: js.Number = ???
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS: js.Number = ???
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS: js.Number = ???
  val MAX_TEXTURE_IMAGE_UNITS: js.Number = ???
  val MAX_FRAGMENT_UNIFORM_VECTORS: js.Number = ???
  val SHADER_TYPE: js.Number = ???
  val DELETE_STATUS: js.Number = ???
  val LINK_STATUS: js.Number = ???
  val VALIDATE_STATUS: js.Number = ???
  val ATTACHED_SHADERS: js.Number = ???
  val ACTIVE_UNIFORMS: js.Number = ???
  val ACTIVE_ATTRIBUTES: js.Number = ???
  val SHADING_LANGUAGE_VERSION: js.Number = ???
  val CURRENT_PROGRAM: js.Number = ???
  
  /* StencilFunction */
  val NEVER: js.Number = ???
  val LESS: js.Number = ???
  val EQUAL: js.Number = ???
  val LEQUAL: js.Number = ???
  val GREATER: js.Number = ???
  val NOTEQUAL: js.Number = ???
  val GEQUAL: js.Number = ???
  val ALWAYS: js.Number = ???
  
  /* StencilOp */
  /*    ZERO */
  val KEEP: js.Number = ???
  val REPLACE: js.Number = ???
  val INCR: js.Number = ???
  val DECR: js.Number = ???
  val INVERT: js.Number = ???
  val INCR_WRAP: js.Number = ???
  val DECR_WRAP: js.Number = ???
  
  /* StringName */
  val VENDOR: js.Number = ???
  val RENDERER: js.Number = ???
  val VERSION: js.Number = ???
  
  /* TextureMagFilter */
  /** Specifies nearest neighbour interpolation. */
  val NEAREST: js.Number = ???
  /** Specifies linear interpolation. */
  val LINEAR: js.Number = ???
  
  /* TextureMinFilter */
  /*    NEAREST */
  /*    LINEAR */
  /**
   * Specifies nearest neighbour interpolation on the nearest mipmap level.
   */
  val NEAREST_MIPMAP_NEAREST: js.Number = ???
  
  /**
   * Specifies linear interpolation on the nearest mipmap level.
   */
  val LINEAR_MIPMAP_NEAREST: js.Number = ???
  
  /**
   * Specifies nearest neighbour interpolation, linearly blending between mipmap levels.
   */
  val NEAREST_MIPMAP_LINEAR: js.Number = ???
  
  /**
   * Specifies linear interpolation linearly blending between mipmap levels.
   */
  val LINEAR_MIPMAP_LINEAR: js.Number = ???
  
  /* TextureParameterName */
  /**
   * The texture magnification filter.
   * 
   * Can be one of [[NEAREST]] or [[LINEAR]].
   */
  val TEXTURE_MAG_FILTER: js.Number = ???

  /**
   * The texture minification filter.
   * 
   * Can be one of [[NEAREST]], [[LINEAR]], [[NEAREST_MIPMAP_NEAREST]], [[LINEAR_MIPMAP_NEAREST]],
   * [[NEAREST_MIPMAP_LINEAR]], [[LINEAR_MIPMAP_LINEAR]].
   */

  val TEXTURE_MIN_FILTER: js.Number = ???
  
  /**
   * The horizontal texture wrap mode.
   * 
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].  
   */
  val TEXTURE_WRAP_S: js.Number = ???
  
  /**
   * The vertical texture wrap.
   *
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].  
   */
  val TEXTURE_WRAP_T: js.Number = ???
  
  /* TextureTarget */
  /**
   * The target for a simple 2 dimensional texture.
   */
  val TEXTURE_2D: js.Number = ???
  val TEXTURE: js.Number = ???
  
  /**
   * The target for a cube mapped texture.
   */
  val TEXTURE_CUBE_MAP: js.Number = ???
  val TEXTURE_BINDING_CUBE_MAP: js.Number = ???
  val TEXTURE_CUBE_MAP_POSITIVE_X: js.Number = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_X: js.Number = ???
  val TEXTURE_CUBE_MAP_POSITIVE_Y: js.Number = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_Y: js.Number = ???
  val TEXTURE_CUBE_MAP_POSITIVE_Z: js.Number = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_Z: js.Number = ???
  val MAX_CUBE_MAP_TEXTURE_SIZE: js.Number = ???
  
  /* TextureUnit */
  /** Identifies texture unit 0. This texture unit is guaranteed to exist. */
  val TEXTURE0: js.Number = ???
  
  /** Identifies texture unit 1. This texture unit is guaranteed to exist. */
  val TEXTURE1: js.Number = ???
  
  /** Identifies texture unit 2. This texture unit is guaranteed to exist. */  
  val TEXTURE2: js.Number = ???
  
  /** Identifies texture unit 3. This texture unit is guaranteed to exist. */  
  val TEXTURE3: js.Number = ???
  
  /** Identifies texture unit 4. This texture unit is guaranteed to exist. */  
  val TEXTURE4: js.Number = ???
  
  /** Identifies texture unit 5. This texture unit is guaranteed to exist. */  
  val TEXTURE5: js.Number = ???
  
  /** Identifies texture unit 6. This texture unit is guaranteed to exist. */  
  val TEXTURE6: js.Number = ???
  
  /** Identifies texture unit 7. This texture unit is guaranteed to exist. */  
  val TEXTURE7: js.Number = ???
  
  /** Identifies texture unit 8. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */  
  val TEXTURE8: js.Number = ???
  
  /** Identifies texture unit 9. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE9: js.Number = ???
  
  /** Identifies texture unit 10. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE10: js.Number = ???
  
  /** Identifies texture unit 11. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE11: js.Number = ???
  
  /** Identifies texture unit 12. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE12: js.Number = ???
  
  /** Identifies texture unit 13. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE13: js.Number = ???
  
  /** Identifies texture unit 14. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE14: js.Number = ???
  
  /** Identifies texture unit 15. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE15: js.Number = ???
  
  /** Identifies texture unit 16. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE16: js.Number = ???
  
  /** Identifies texture unit 17. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE17: js.Number = ???
  
  /** Identifies texture unit 18. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE18: js.Number = ???
  
  /** Identifies texture unit 19. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE19: js.Number = ???
  
  /** Identifies texture unit 20. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE20: js.Number = ???
  
  /** Identifies texture unit 21. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE21: js.Number = ???
  
  /** Identifies texture unit 22. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE22: js.Number = ???
  
  /** Identifies texture unit 23. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE23: js.Number = ???
  
  /** Identifies texture unit 24. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE24: js.Number = ???
  
  /** Identifies texture unit 25. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE25: js.Number = ???
  
  /** Identifies texture unit 26. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE26: js.Number = ???
  
  /** Identifies texture unit 27. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE27: js.Number = ???
  
  /** Identifies texture unit 28. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE28: js.Number = ???
  
  /** Identifies texture unit 29. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE29: js.Number = ???
  
  /** Identifies texture unit 30. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE30: js.Number = ???
  
  /** Identifies texture unit 31. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE31: js.Number = ???
  
  /** The currently active texture unit. */
  val ACTIVE_TEXTURE: js.Number = ???
  
  /* TextureWrapMode */
  /**
   * Repeat the texture along this axis.
   */  
  val REPEAT: js.Number = ???
  /**
   * Clamp the texture along this axis.  The colour of the edge pixels will be replicated to infinity.
   */    
  val CLAMP_TO_EDGE: js.Number = ???
  /**
   * Repeat the texture along this axis, mirroring it each step.
   */    
  val MIRRORED_REPEAT: js.Number = ???
  
  /* Uniform Types */
  val FLOAT_VEC2: js.Number = ???
  val FLOAT_VEC3: js.Number = ???
  val FLOAT_VEC4: js.Number = ???
  val INT_VEC2: js.Number = ???
  val INT_VEC3: js.Number = ???
  val INT_VEC4: js.Number = ???
  val BOOL: js.Number = ???
  val BOOL_VEC2: js.Number = ???
  val BOOL_VEC3: js.Number = ???
  val BOOL_VEC4: js.Number = ???
  val FLOAT_MAT2: js.Number = ???
  val FLOAT_MAT3: js.Number = ???
  val FLOAT_MAT4: js.Number = ???
  val SAMPLER_2D: js.Number = ???
  val SAMPLER_CUBE: js.Number = ???
  
  /* Vertex Arrays */
  val VERTEX_ATTRIB_ARRAY_ENABLED: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_SIZE: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_STRIDE: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_TYPE: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_NORMALIZED: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_POINTER: js.Number = ???
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: js.Number = ???
  
  /* Shader Source */
  val COMPILE_STATUS: js.Number = ???
  
  /* Shader Precision-Specified Types */
  /**
   * Specifies a low precision float.
   */
  val LOW_FLOAT: js.Number = ???
  /**
   * Specifies a medium precision float.
   */
  val MEDIUM_FLOAT: js.Number = ???
  /**
   * Specifies a high precision float.
   */  
  val HIGH_FLOAT: js.Number = ???
  /**
   * Specifies a low precision integer.
   */  
  val LOW_INT: js.Number = ???
  /**
   * Specifies a medium precision float.
   */  
  val MEDIUM_INT: js.Number = ???
  /**
   * Specifies a high precision float.
   */
  val HIGH_INT: js.Number = ???
  
  /* Framebuffer Object. */
  /**
   * The framebuffer target.
   */
  val FRAMEBUFFER: js.Number = ???
  
  /**
   * The renderbuffer target.
   */
  val RENDERBUFFER: js.Number = ???
  
  val RGBA4: js.Number = ???
  val RGB5_A1: js.Number = ???
  val RGB565: js.Number = ???
  val DEPTH_COMPONENT16: js.Number = ???
  val STENCIL_INDEX: js.Number = ???
  val STENCIL_INDEX8: js.Number = ???
  val DEPTH_STENCIL: js.Number = ???
  
  val RENDERBUFFER_WIDTH: js.Number = ???
  val RENDERBUFFER_HEIGHT: js.Number = ???
  val RENDERBUFFER_INTERNAL_FORMAT: js.Number = ???
  val RENDERBUFFER_RED_SIZE: js.Number = ???
  val RENDERBUFFER_GREEN_SIZE: js.Number = ???
  val RENDERBUFFER_BLUE_SIZE: js.Number = ???
  val RENDERBUFFER_ALPHA_SIZE: js.Number = ???
  val RENDERBUFFER_DEPTH_SIZE: js.Number = ???
  val RENDERBUFFER_STENCIL_SIZE: js.Number = ???
  
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: js.Number = ???
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: js.Number = ???
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: js.Number = ???
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: js.Number = ???
  
  val COLOR_ATTACHMENT0: js.Number = ???
  val DEPTH_ATTACHMENT: js.Number = ???
  val STENCIL_ATTACHMENT: js.Number = ???
  val DEPTH_STENCIL_ATTACHMENT: js.Number = ???
  
  val NONE = 0
  
  val FRAMEBUFFER_COMPLETE: js.Number = ???
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: js.Number = ???
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: js.Number = ???
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: js.Number = ???
  val FRAMEBUFFER_UNSUPPORTED: js.Number = ???
  
  val FRAMEBUFFER_BINDING: js.Number = ???
  val RENDERBUFFER_BINDING: js.Number = ???
  val MAX_RENDERBUFFER_SIZE: js.Number = ???
  
  val INVALID_FRAMEBUFFER_OPERATION: js.Number = ???
  
  /* WebGL-specific enums */
  val UNPACK_FLIP_Y_WEBGL: js.Number = ???
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL: js.Number = ???
  val CONTEXT_LOST_WEBGL: js.Number = ???
  val UNPACK_COLORSPACE_CONVERSION_WEBGL: js.Number = ???
  val BROWSER_DEFAULT_WEBGL: js.Number = ???
}

class WebGLRenderingContext extends js.Object {
  /**
   * The canvas object this WebGLRenderingContext is associated with. 
   */
  val canvas: HTMLCanvasElement = ???
  
  /**
   * The actual width of the drawing buffer.
   * This may be different than the underlying HTMLCanvasElement width.
   */
  val drawingBufferWidth: js.Number = ???
  
  /**
   * The actual height of the drawing buffer. 
   * This may be different than the underlying HTMLCanvasElement height.
   */
  val drawingBufferHeight: js.Number = ???
  
  /**
   * Returns `null` if [[isContextLost]] would return `false`, otherwise returns a copy of the context parameters.
   */
  def getContextAttributes(): WebGLContextAttributes = ???
  
  /**
   * Returns `true` if the context has been lost,  `false` otherwise.
   */
  def isContextLost(): js.Boolean = ???
  
  /**
   * Returns an array of strings naming supported WebGL extensions.
   */
  def getSupportedExtensions(): js.Array[String] = ???
  
  /**
   * Returns an object for the named extension, or `null` if no such extension exists.
   * 
   * @param name  the name of the extension
   */
  def getExtension(name: js.String): js.Any = ???
  
  /**
   * Selects the active texture unit.
   * 
   * @param texture  an integer specifying the texture unit to make active. Must be in 0 .. MAX_COMBINED_TEXTURE_UNITS-1
   */
  def activeTexture(texture: js.Number): Unit = ???
  
  /**
   * Attaches a shader (fragment or vertex) to a [[WebGLProgram]].
   */
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = ???
  
  /**
   * Associates a vertex attribute index with a named attribute variable.
   */
  def bindAttribLocation(program: WebGLProgram, index: js.Number, name: js.String): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLBuffer]].
   * 
   * @param target the target to bind the buffer to.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   */
  def bindBuffer(target: js.Number, buffer: WebGLBuffer): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLFramebuffer]].
   * 
   * @param target  the target to bind the framebuffer to.  Must be [[WebGLRenderingContext.FRAMEBUFFER]].
   * @param framebuffer  a framebuffer object, or null to bind the default framebuffer.
   */
  def bindFramebuffer(target: js.Number, framebuffer: WebGLFramebuffer): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLRenderbuffer]].
   * 
   * @param target  target to bind to, must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param renderbuffer the renderbuffer to bind.  If `null`, any object bound to `target` us unbound.
   */
  def bindRenderbuffer(target: js.Number, renderbuffer: WebGLRenderbuffer): Unit = ???
  
  /**
   * Loads a the active texture unit into a [[WebGLTexture]].
   * 
   * @param target  the target to bind to.  Must be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param texture  the texture to bind. 
   */
  def bindTexture(target: js.Number, texture: WebGLTexture): Unit = ???
  
  /**
   * Sets the blend color used in [[WebGLRenderingContext.BLEND_COLOR]].
   */
  def blendColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???
  
  /**
   * Specifies the equation used for RGB and Alpha blending.
   * 
   * @param mode  blend equation to use.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquation(mode: js.Number): Unit = ???
  
  /**
   * Specifies the equation used for RGB and Alpha blending separately.
   * 
   * @param modeRGB  blend equation to use for RGB components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   * @param modeAlpha  blend equation to use for alpha components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquationSeparate(modeRGB: js.Number, modeAlpha: js.Number): Unit = ???
  
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
  def blendFunc(sfactor: js.Number, dfactor: js.Number): Unit = ???

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
  def blendFuncSeparate(srcRGB: js.Number, dstRGB: js.Number, srcAlpha: js.Number, dstAlpha: js.Number): Unit = ???
  
  /**
   * Sets the size of the bound [[WebGLBuffer]] for the given `target`.  The contents of the buffer are cleared to 0.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param size  The size of the new buffer
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: js.Number, size: js.Number, usage: js.Number): Unit = ???
  
  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: js.Number, data: ArrayBufferView, usage: js.Number): Unit = ???
  
  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   * 
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target: js.Number, data: ArrayBuffer, usage: js.Number): Unit = ???

  def bufferSubData(target: js.Number, offset: js.Number, data: ArrayBufferView): Unit = ???
  
  def bufferSubData(target: js.Number, offset: js.Number, data: ArrayBuffer): Unit = ???

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
  def checkFramebufferStatus(target: js.Number): js.Number = ???
  
  /**
   * Clears the buffers specified in `mask` with the current [[WebGLRenderingContext#clearColor]], [[WebGLRenderingContext#clearDepth]] and [[WebGLRenderingContext#clearStencil]].
   * 
   * @param mask  The buffers to clear, a bitmask of one or more of [[WebGLRenderingContext.COLOR_BUFFER_BIT]], [[WebGLRenderingContext.DEPTH_BUFFER_BIT]] and [[WebGLRenderingContext.STENCIL_BUFFER_BIT]].
   */
  def clear(mask: js.Number): Unit = ???

  /**
   * Sets the clear color to use with [[WebGLRenderingContext#clear]].
   */
  def clearColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???

  /**
   * Sets the clear depth to use with [[WebGLRenderingContext#clear]].
   */
  def clearDepth(depth: js.Number): Unit = ???
  
  /**
   * Sets the stencil value to use with [[WebGLRenderingContext#clear]].
   */  
  def clearStencil(s: js.Number): Unit = ???
  
  /**
   * Enable and disable writing to the given channels.  For each channel, `true` will allow writing, `false` will prevent it.
   */
  def colorMask(red: js.Boolean, green: js.Boolean, blue: js.Boolean, alpha: js.Boolean): Unit = ???
  
  /**
   * Compiles the provided shader.
   * 
   * The [[WebGLRenderingContext#getShaderParameter]] can be used to determine if this operation succeeded.
   */
  def compileShader(shader: WebGLShader): Unit = ???
  
  
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
  def compressedTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, data: ArrayBufferView): Unit = ???
  
  /**
   * Loads a 2-dimensional texture subimage into a texture unit, compressed with the specified algorithm.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the compressed data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param data  the compressed image data.
   */
  def compressedTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, data: ArrayBufferView): Unit = ???
    
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
  def copyTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number, border: js.Number): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from the current framebuffer.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the data.  May be [[WebGLRenderingContext.ALPHA]], [[WebGLRenderingContext.LUMINANCE]], [[WebGLRenderingContext.LUMINANCE_ALPHA]], [[WebGLRenderingContext.RGB]], or [[WebGLRenderingContext.RGBA]].
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param x the window coordinates of the lower left corner of the framebuffer.
   *  @param y the window coordinates of the lower left corner of the framebuffer.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   */
  def copyTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
 
  /**
   * Creates a new [[WebGLBuffer]].
   */
  def createBuffer(): WebGLBuffer = ???

  /**
   * Creates a new [[WebGLFramebuffer]].
   */
  def createFramebuffer(): WebGLFramebuffer = ???
  
  /**
   * Creates a new [[WebGLProgram]].
   */
  def createProgram(): WebGLProgram = ???

  /**
   * Creates a new [[WebGLRenderbuffer]].
   */
  def createRenderbuffer(): WebGLRenderbuffer = ???
  
  /**
   * Creates a new [[WebGLShader]].
   */
  def createShader(`type`: js.Number): WebGLShader = ???
  
  /**
   * Creates a new [[WebGLTexture]].
   */
  def createTexture(): WebGLTexture = ???
  
  /**
   * Set the culling mode for front and back facing polygons.
   * 
   * @param mode the culling mode, may be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]] or [[WebGLRenderingContext.FRONT_AND_BACK]].
   *             When [[WebGLRenderingContext.FRONT_AND_BACK]] is set, no triangles are drawn, however lines and points will.
   */
  def cullFace(mode: js.Number): Unit = ???
  
  /**
   * Flags the specified [[WebGLBuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the buffer, it is not mandatory to call this method.
   */
  def deleteBuffer(buffer: WebGLBuffer): Unit = ???

  /**
   * Flags the specified [[WebGLFramebuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the framebuffer, it is not mandatory to call this method.
   */
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = ???
  
  /**
   * Flags the specified [[WebGLProgram]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the program, it is not mandatory to call this method.
   */
  def deleteProgram(program: WebGLProgram): Unit = ???
  
  /**
   * Flags the specified [[WebGLRenderbuffer]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the renderbuffer, it is not mandatory to call this method.
   */  
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = ???
  
  /**
   * Flags the specified [[WebGLShader]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the shader, it is not mandatory to call this method.
   */
  def deleteShader(shader: WebGLShader): Unit = ???
  
  /**
   * Flags the specified [[WebGLTexture]] for deletion.  When it is no longer used by the WebGL system it
   * will be deleted.
   * 
   * ''Note'': garbage collection will also delete the texture, it is not mandatory to call this method.
   */
  def deleteTexture(texture: WebGLTexture): Unit = ???
  
  /**
   * Set the function used to discard fragments.  When depth testing is enabled, the fragment depth is compared with
   * the current depth, and is allowed onto the framebuffer.
   * 
   * @param func  the function to allow the fragment to be drawn.  Values are [[WebGLRenderingContext.NEVER]], [[WebGLRenderingContext.LESS]], [[WebGLRenderingContext.EQUAL]], [[WebGLRenderingContext.LEQUAL]]
   *              [[WebGLRenderingContext.GREATER]], [[WebGLRenderingContext.NOTEQUAL]], [[WebGLRenderingContext.GEQUAL]], and [[WebGLRenderingContext.ALWAYS]].
   */
  def depthFunc(func: js.Number): Unit = ???
  
  /**
   * Enables/disables writing to the depth buffer.
   * 
   * @param flag  when `false`, depth writing is disabled, otherwise it is enabled.
   */
  def depthMask(flag: js.Boolean): Unit = ???
  
  /**
   * Sets the mapping from normalized device coordinates to window coordinates.
   * "normalized device coordinates" in this context really means "normalized depth map values".
   *  
   * ''note'' there is no requirement that zNear < zFar.
   * 
   * Both parameters are clamped to -1 .. 1
   * @param zNear the near clipping plane, initially 0.
   * @param zFar the far clipping plane, initially 1
   */
  def depthRange(zNear: js.Number, zFar: js.Number): Unit = ???
  
  /**
   * Detaches a [[WebGLShader]] from a [[WebGLProgram]].
   * 
   * If the shader has been flagged as deleted by a call to [[WebGLRenderingContext#deleteShader]], it will be deleted.
   */
  def detachShader(program: WebGLProgram, shader: WebGLShader): Unit = ???
  
  /**
   * Disables a GL capability.
   * 
   * @param cap  the capability to disable.  May be [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.CULL_FACE]],
   *             [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]],
   *             [[WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE]], [[WebGLRenderingContext.SAMPLE_COVERAGE]],
   *             [[WebGLRenderingContext.SCISSOR_TEST]], or [[WebGLRenderingContext.STENCIL_TEST]]. 
   */
  def disable(cap: js.Number): Unit = ???

  /**
   * Disables the generic vertex attribute array specified by index.
   */
  def disableVertexAttribArray(index: js.Number): Unit = ???
  
  /**
   * Renders the primitives in the active arrays.
   * 
   * @param mode  the kind of primitives to render.  May be [[WebGLRenderingContext.POINTS]], [[WebGLRenderingContext.LINES]], [[WebGLRenderingContext.LINE_STRIP]], [[WebGLRenderingContext.LINE_LOOP]], [[WebGLRenderingContext.TRIANGLES]], [[WebGLRenderingContext.TRIANGLE_STRIP]], [[WebGLRenderingContext.TRIANGLE_FAN]], or [[WebGLRenderingContext.TRIANGLES]]
   * @param first  the starting index into the arrays.
   * @param count  the number of indices to draw.
   */
  def drawArrays(mode: js.Number, first: js.Number, count: js.Number): Unit = ???
  
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
  def drawElements(mode: js.Number, count: js.Number, `type`: js.Number, offset: js.Number): Unit = ???
  
  /**
   * Enables a GL capability.
   * 
   * @param cap  the capability to enable.  May be [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.CULL_FACE]],
   *             [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]],
   *             [[WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE]], [[WebGLRenderingContext.SAMPLE_COVERAGE]],
   *             [[WebGLRenderingContext.SCISSOR_TEST]], or [[WebGLRenderingContext.STENCIL_TEST]]. 
   */
  def enable(cap: js.Number): Unit = ???
  
  /**
   * Enables the generic vertex attribute array specified by index.
   */
  def enableVertexAttribArray(index: js.Number): Unit = ???
  
  /**
   * Block until all GL execution is complete.
   */
  def finish(): Unit = ???
  
  /**
   * Force all pending GL execution to complete as soon as possible.
   */
  def flush(): Unit = ???
  
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
  def framebufferRenderbuffer(target: js.Number, attachment: js.Number, renderbuffertarget: js.Number, renderbuffer: WebGLRenderbuffer): Unit = ???
  
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
  def framebufferTexture2D(target: js.Number, attachment: js.Number, textarget: js.Number, texture: WebGLTexture, level: js.Number): Unit = ???

  /**
   * Specifies the winding that is considered front-facing for the purposes of CULL_FACE.
   * 
   * @param mode  The winding to consider front-facing.  May be [[WebGLRenderingContext.CW]] or [[WebGLRenderingContext.CCW]]
   */
  def frontFace(mode: js.Number): Unit = ???
  
  /**
   * Generate the complete set of mipmaps for the active texture derived from level 0.
   * 
   * @param target  the texture target, may be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]].
   */
  def generateMipmap(target: js.Number): Unit = ???
  
  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given attribute at `index`.
   */
  def getActiveAttrib(program: WebGLProgram, index: js.Number): WebGLActiveInfo = ???

  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given uniform at `index`.
   */
  def getActiveUniform(program: WebGLProgram, index: js.Number): WebGLActiveInfo = ???
  
  /**
   * Returns a new array containing the shaders attached to the given program. 
   */
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] = ???
  
  /**
   * Returns the index of the named attribute, or -1 on error.
   */
  def getAttribLocation(program: WebGLProgram, name: js.String): js.Number = ???
  
  /**
   * Returns the value of the requested parameter for a buffer.
   * 
   * @param target  must be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   * @param value  the buffer parameter to retrieve, may be [[WebGLRenderingContext.BUFFER_SIZE]] or [[WebGLRenderingContext.BUFFER_USAGE]]
   * 
   */
  def getBufferParameter(target: js.Number, pname: js.Number): js.Number = ???
  
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
  def getParameter(pname: js.Number): js.Any = ???
  
  /**
   * Returns the error value, and resets the error to [[WebGLRenderingContext.NO_ERROR]].
   * 
   * Only the first error is recorded, new errors are not stored until the error value is reset
   * to [[WebGLRenderingContext.NO_ERROR]] by a call to this method.
   * 
   * @return the error code.  One of [[WebGLRenderingContext.NO_ERROR]], [[WebGLRenderingContext.INVALID_ENUM]], [[WebGLRenderingContext.INVALID_VALUE]], [[WebGLRenderingContext.INVALID_OPERATION]], [[WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION]], or [[WebGLRenderingContext.OUT_OF_MEMORY]].
   */
  def getError(): js.Number = ???
    
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
  def getFramebufferAttachmentParameter(target: js.Number, attachment: js.Number, pname: js.Number): js.Any = ???
  
  /**
   * Returns the value for the given parameter name for the program.
   * The return type is dependent on the requested parameter.
   * 
   * @param program the program to query.
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.DELETE_STATUS]], [[WebGLRenderingContext.LINK_STATUS]],
   *               [[WebGLRenderingContext.VALIDATE_STATUS]], [[WebGLRenderingContext.ATTACHED_SHADERS]],
   *               [[WebGLRenderingContext.ACTIVE_ATTRIBUTES]], or [[WebGLRenderingContext.ACTIVE_UNIFORMS]].
   */
  def getProgramParameter(program: WebGLProgram, pname: js.Number): js.Any = ???
  
  /**
   * Returns a string containing information about the last link or validation operation for a program.
   */
  def getProgramInfoLog(program: WebGLProgram): js.String = ???
  
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
  def getRenderbufferParameter(target: js.Number, pname: js.Number): js.Any = ???
    
  /**
   * Returns the value of a parameter on the specified [[WebGLShader]].
   * The return type is dependent on the requested parameter.
   * 
   * @param shader  the shader to query
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.SHADER_TYPE]],
   *               [[WebGLRenderingContext.DELETE_STATUS]] or [[WebGLRenderingContext.COMPILE_STATUS]]
   * 
   */
  def getShaderParameter(shader: WebGLShader, pname: js.Number): js.Any = ???
 
  /**
   * Returns a new [[WebGLShaderPrecisionFormat]] for the given shader type and precision type.
   * 
   * @param shadertype the type of shader, may be [[WebGLRenderingContext.FRAGMENT_SHADER]] or [[WebGLRenderingContext.VERTEX_SHADER]].
   * @param precisiontype the precision type to query, may be [[WebGLRenderingContext.LOW_FLOAT]],
   *                      [[WebGLRenderingContext.MEDIUM_FLOAT]], [[WebGLRenderingContext.HIGH_FLOAT]], [[WebGLRenderingContext.LOW_INT]],
   *                      [[WebGLRenderingContext.MEDIUM_INT]], or [[WebGLRenderingContext.HIGH_INT]]. 
   */
  def getShaderPrecisionFormat(shadertype: js.Number, precisiontype: js.Number): WebGLShaderPrecisionFormat = ???
  
  /**
   * Returns the information log from the last compile of the shader.
   */
  def getShaderInfoLog(shader: WebGLShader): js.String = ???
  
  /**
   * Returns the source of the given shader.
   */
  def getShaderSource(shader: WebGLShader): js.String = ???
  
  /**
   * Returns the value of the given texture parameter on the target of the active texture.
   * 
   *  @param target  the target to query.  May be either [[WebGLRenderingContext.TEXTURE_2D]] or `TEXTURE_CUBE_MAP'.
   *  @param pname  the parameter to query.  May be either [[WebGLRenderingContext.TEXTURE_MAG_FILTER]],
   *                [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_WRAP_S]],
   *                 or [[WebGLRenderingContext.TEXTURE_WRAP_T]].
   */
  def getTexParameter(target: js.Number, pname: js.Number): js.Any = ???
    
  /**
   * Returns the value of the uniform in the given program and location.  The return type is dependent
   * on the uniform type.
   */
  def getUniform(program: WebGLProgram, location: WebGLUniformLocation): js.Any = ???
  
  /**
   * Returns a new [[WebGLUniformLocation]] that represents the location of the given uniform in the specified program.
   * If the uniform does not exist, or another error occurs, returns `null`. 
   */
  def getUniformLocation(program: WebGLProgram, name: js.String): WebGLUniformLocation = ???
  
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
  def getVertexAttrib(index: js.Number, pname: js.Number): js.Any = ???
  /**
   * Returns the offset of the vertex attribute.
   * 
   * @param index  the index of the vertex attribute to retrieve
   * @param pname  must be [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER]]
   */
  def getVertexAttribOffset(index: js.Number, pname: js.Number): js.Number = ???
   
  /**
   * Specifies implementation specific hints.
   * 
   * @param target  the hint to specify.  Must be [[WebGLRenderingContext.GENERATE_MIPMAP_HINT]]
   * @param mode  the desired mode.  Must be one of [[WebGLRenderingContext.FASTEST]],
   *              [[WebGLRenderingContext.NICEST]], or [[WebGLRenderingContext.DONT_CARE]].
   */
  def hint(target: js.Number, mode: js.Number): Unit = ???
  
  /**
   * Returns `true` if the `buffer` is valid, `false` otherwise.
   */
  def isBuffer(buffer: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the specified capability is enabled, `false` otherwise.
   * @see [[WebGLRenderingContext#enable]]
   */
  def isEnabled(cap: js.Number): js.Boolean = ???
  
  /**
   * Returns `true` if the `framebuffer` is valid, `false` otherwise.
   */
  def isFramebuffer(framebuffer: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the `program` is valid, `false` otherwise.
   */
  def isProgram(program: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the `renderbuffer` is valid, `false` otherwise.
   */
  def isRenderbuffer(renderbuffer: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the `shader` is valid, `false` otherwise.
   */
  def isShader(shader: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the `texture` is valid, `false` otherwise.
   */  
  def isTexture(texture: js.Any): js.Boolean = ???
  
  /**
   * Specifies the line width.
   */
  def lineWidth(width: js.Number): Unit = ???
  
  /**
   * Attempts to link the specified [[WebGLProgram]].
   */
  def linkProgram(program: WebGLProgram): Unit = ???
  
  /**
   * Sets the pixel store mode, used when copying image data such as framebuffers or textures.
   * 
   * @param pname  the property to change.  May be one of [[WebGLRenderingContext.PACK_ALIGNMENT]],
   *               [[WebGLRenderingContext.UNPACK_ALIGNMENT]], [[WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL]],
   *               [[WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL]] or [[WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL]].
   */
  def pixelStorei(pname: js.Number, param: js.Number): Unit = ???
  
  /**
   * Specifies the polygon offset.  When [[WebGLRenderingContext.POLYGON_OFFSET_FILL]] is enabled, depth values for a fragment have an offset applied
   * to them, calculated as `factor`*DZ + r*`units`, where DZ is the change in z based on the polygon's screen area, and r is the minimum value that
   * is guaranteed produce a measurable offset. 
   */
  def polygonOffset(factor: js.Number, units: js.Number): Unit = ???
  
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
  def readPixels(x: js.Number, y: js.Number, width: js.Number, height: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???
  
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
  def renderbufferStorage(target: js.Number, internalformat: js.Number, width: js.Number, height: js.Number): Unit = ???
  
  /**
   * Sets the sampling coverage parameters for primitive antialiasing.
   * 
   * The OpenGL multisampling algorithm is too involved to concisely explain here.
   * Please consult [[http://www.opengl.org/registry/specs/SGIS/multisample.txt]].
   * 
   * @param value  the sample coverage value, clamped to 0..1.
   * @param invert  if true, the mask will be bitwise-inverted.
   */
  def sampleCoverage(value: js.Number, invert: js.Boolean): Unit = ???
  
  /**
   * Sets the scissor rectangle.  When [[WebGLRenderingContext.SCISSOR_TEST]] is enabled, rendering will be restricted to this rectangle.
   */
  def scissor(x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
  
  /**
   * Sets the GLSL source for the given shader.
   */
  def shaderSource(shader: WebGLShader, source: js.String): Unit = ???
  
  /**
   * Sets the stencil test for front and back faces.
   * @param func the test function.  One of [[WebGLRenderingContext.NEVER]], [[WebGLRenderingContext.LESS]],
   * 			 [[WebGLRenderingContext.LEQUAL]], [[WebGLRenderingContext.GREATER]], [[WebGLRenderingContext.GEQUAL]],
   *             [[WebGLRenderingContext.EQUAL]], [[WebGLRenderingContext.NOTEQUAL]], and [[WebGLRenderingContext.ALWAYS]]
   * @param ref  the reference value to test against in the stencil buffer
   * @param mask mask that is ANDed with `ref` and the tested value and stored in the stencil buffer.
   */
  def stencilFunc(func: js.Number, ref: js.Number, mask: js.Number): Unit = ???
  
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
  def stencilFuncSeparate(face: js.Number, func: js.Number, ref: js.Number, mask: js.Number): Unit = ???
  
  /**
   * Configure which bits in the stencil buffer may be written to by front or back faces.
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMask(mask: js.Number): Unit = ???

  /**
   * Configure which bits in the stencil buffer may be written to by the given face type.
   * @param face the face(s) to configure the mask for.  May be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]]
   *             or [[WebGLRenderingContext.FRONT_AND_BACK]].
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMaskSeparate(face: js.Number, mask: js.Number): Unit = ???
  
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
  def stencilOp(fail: js.Number, zfail: js.Number, zpass: js.Number): Unit = ???
  
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
  def stencilOpSeparate(face: js.Number, fail: js.Number, zfail: js.Number, zpass: js.Number): Unit = ???
  
  /**
   * Loads a 2-dimensional texture into a texture unit from source data.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format the image is stored in.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???

  /**
   * Loads a 2-dimensional texture into a texture unit from an ImageData object.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format to store the image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: ImageData): Unit = ???

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLImageElement object.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format to store the image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLImageElement): Unit = ???  

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLCanvasElement object.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format to store the image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLCanvasElement): Unit = ???

  /**
   * Loads a 2-dimensional texture into a texture unit from an HTMLVideoElement object.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format to store the image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param border the border width.  Must be 0.
   *  @param pixels the source image data.
   */
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

  /**
   * Sets the texture parameter for the active texture unit.
   * 
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameterf(target: js.Number, pname: js.Number, param: js.Number): Unit = ???
  
  /**
   * Sets the texture parameter for the active texture unit.
   * 
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameteri(target: js.Number, pname: js.Number, param: js.Number): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an [[ArrayBufferView]].
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  the format of the image data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `ImageData` object.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  desired the format of the image data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: ImageData): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLImageElement`.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  desired the format of the image data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLImageElement): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLCanvasElement`.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  desired the format of the image data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLCanvasElement): Unit = ???

  /**
   * Loads a 2-dimensional texture subimage into a texture unit from an `HTMLVideoElement`.
   * 
   *  @param target  the target on the active texture unit.  May be [[WebGLRenderingContext.TEXTURE_2D]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]], [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]],
   *                 [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]], or [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]
   *  @param level  the mipmap level of detail.  0 is the base image.
   *  @param internalformat  desired the format of the image data.
   *  @param xoffset the x texel offset into the texture image.
   *  @param yoffset the y texel offset into the texture image.
   *  @param width  the width of the texture image.
   *  @param height the height of the texture image.
   *  @param pixels the image data.
   */
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the scalar to bind to.
   */
  def uniform1f(location: WebGLUniformLocation, x: js.Number): Unit = ???

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a [[Float32Array]] to bind to
   */
  def uniform1fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???

  /**
   * Loads a a scalar float into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform1fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the scalar to bind to.
   */
  def uniform1i(location: WebGLUniformLocation, x: js.Number): Unit = ???

  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  an [[Int32Array]] to bind to
   */
  def uniform1iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???

  /**
   * Loads a a scalar integer into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform1iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  /**
   * Loads a a 2-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first float component
   * @param y  the second float component
   */
  def uniform2f(location: WebGLUniformLocation, x: js.Number, y: js.Number): Unit = ???

  /**
   * Loads a a 2-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a [[Float32Array]] to bind to
   */
  def uniform2fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???

  /**
   * Loads a a 2-vector of floats
   * 
   * @param location  the location to bind into a [[WebGLUniformLocation]].
   * @param v  a js.Array to bind to.
   */
  def uniform2fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   */
  def uniform2i(location: WebGLUniformLocation, x: js.Number, y: js.Number): Unit = ???

  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  an [[Int32Array]] to bind to
   */
  def uniform2iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???

  /**
   * Loads a a 2-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform2iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first float component.
   * @param y  the second float component. 
   * @param z  the third float component. 
   */
  def uniform3f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number): Unit = ???

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a [[Float32Array]] to bind to
   */
  def uniform3fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???

  /**
   * Loads a a 3-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform3fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   * @param z  the third integer component
   */
  def uniform3i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number): Unit = ???

  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  an [[Int32Array]] to bind to
   */
  def uniform3iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???

  /**
   * Loads a a 3-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform3iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first float component.
   * @param y  the second float component. 
   * @param z  the third float component. 
   * @param w  the fourth float component. 
   */
  def uniform4f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a [[Float32Array]] to bind to
   */
  def uniform4fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???

  /**
   * Loads a a 4-vector of floats into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to.
   */
  def uniform4fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param x  the first integer component
   * @param y  the second integer component
   * @param z  the third integer component
   * @param w  the third integer component
   */
  def uniform4i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???

  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  an [[Int32Array]] to bind to
   */
  def uniform4iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???

  /**
   * Loads a a 4-vector of integers into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param v  a js.Array to bind to
   */
  def uniform4iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  /**
   * Loads a a 4x2 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source [[Float32Array]] containing the matrix data.
   */
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???

  /**
   * Loads a a 4x2 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a a 4x3 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source [[Float32Array]] containing the matrix data.
   */
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???
  
  /**
   * Loads a a 4x3 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */  
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???

  /**
   * Loads a a 4x4 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source [[Float32Array]] containing the matrix data.
   */
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???
  
  /**
   * Loads a a 4x4 matrix into a [[WebGLUniformLocation]].
   * 
   * @param location  the location to bind.
   * @param transpose  if `true`, the matrix will loaded into the uniform transposed.
   * @param value  the source `js.Array` containing the matrix data.
   */  
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???
  
  /**
   * Makes a [[WebGLProgram]] become the active program. 
   */
  def useProgram(program: WebGLProgram): Unit = ???
  
  /**
   * Validates a [[WebGLProgram]].
   */
  def validateProgram(program: WebGLProgram): Unit = ???
  
  /**
   * Loads a scalar into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the scalar to load.
   */
  def vertexAttrib1f(indx: js.Number, x: js.Number): Unit = ???

  /**
   * Loads a scalar into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: js.Number, values: Float32Array): Unit = ???

  /**
   * Loads a scalar into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   */
  def vertexAttrib2f(indx: js.Number, x: js.Number, y: js.Number): Unit = ???

  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: js.Number, values: Float32Array): Unit = ???

  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
 
  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   * @param z  the third component. 
   */
  def vertexAttrib3f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number): Unit = ???

  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: js.Number, values: Float32Array): Unit = ???

  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   * @param z  the third component. 
   * @param w  the fourth component. 
   */
  def vertexAttrib4f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???

  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: js.Number, values: Float32Array): Unit = ???

  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
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
  def vertexAttribPointer(indx: js.Number, size: js.Number, `type`: js.Number, normalized: js.Boolean, stride: js.Number, offset: js.Number): Unit = ???
  
  /**
   * Sets the OpenGL viewport to render within.
   */
  def viewport(x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
}
