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
  val size:  Int = ???
  /**
   * The type of the requested variable.
   */
  val `type`:  Int = ???
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
  val rangeMin:  Int = ???
  
  /**
   * The base 2 log of the absolute value of the maximum value that can be represented.
   */
  val rangeMax:  Int = ???
  
  /**
   * The number of bits of precision that can be represented. For integer formats this value is always 0.
   */
  val precision:  Int = ???
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
  val DEPTH_BUFFER_BIT:  Int = ???
  
  /**
   * Specifies the stencil buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  val STENCIL_BUFFER_BIT:  Int = ???
  
  /**
   * Specifies the color buffer should be cleared.
   * @see [[WebGLRenderingContext#clear]]
   */
  val COLOR_BUFFER_BIT:  Int = ???
  
  /* BeginMode */
  /**
   * Specifies the elements should be drawn as points.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]] 
   */
  val POINTS:  Int = ???
  
  /**
   * Specifies the elements should be drawn as lines.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val LINES:  Int = ???
  
  /**
   * Specifies the elements should be drawn as a line loop.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */  
  val LINE_LOOP:  Int = ???
  
  /**
   * Specifies the elements should be drawn as a line strip.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val LINE_STRIP:  Int = ???
  
  /**
   * Specifies the elements should be drawn as triangles.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val TRIANGLES:  Int = ???
  
  /**
   * Specifies the elements should be drawn as a triangle strip.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */
  val TRIANGLE_STRIP:  Int = ???
  
  
  /**
   * Specifies the elements should be drawn as a triangle fan.
   * 
   * @see [[WebGLRenderingContext#drawArrays]]
   * @see [[WebGLRenderingContext#drawElements]]
   */  
  val TRIANGLE_FAN:  Int = ???
  
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
  val SRC_COLOR:  Int = ???
  val ONE_MINUS_SRC_COLOR:  Int = ???
  val SRC_ALPHA:  Int = ???
  val ONE_MINUS_SRC_ALPHA:  Int = ???
  val DST_ALPHA:  Int = ???
  val ONE_MINUS_DST_ALPHA:  Int = ???
  
  /* BlendingFactorSrc */
  /*    ZERO */
  /*    ONE */
  val DST_COLOR:  Int = ???
  val ONE_MINUS_DST_COLOR:  Int = ???
  val SRC_ALPHA_SATURATE:  Int = ???
  /*    SRC_ALPHA */
  /*    ONE_MINUS_SRC_ALPHA */
  /*    DST_ALPHA */
  /*    ONE_MINUS_DST_ALPHA */
  
  /* BlendEquationSeparate */
  val FUNC_ADD:  Int = ???
  val BLEND_EQUATION:  Int = ???
  val BLEND_EQUATION_RGB:  Int = ???   /* same as BLEND_EQUATION */
  val BLEND_EQUATION_ALPHA:  Int = ???
  
  /* BlendSubtract */
  val FUNC_SUBTRACT:  Int = ???
  val FUNC_REVERSE_SUBTRACT:  Int = ???
  
  /* Separate Blend Functions */
  val BLEND_DST_RGB:  Int = ???
  val BLEND_SRC_RGB:  Int = ???
  val BLEND_DST_ALPHA:  Int = ???
  val BLEND_SRC_ALPHA:  Int = ???
  val CONSTANT_COLOR:  Int = ???
  val ONE_MINUS_CONSTANT_COLOR:  Int = ???
  val CONSTANT_ALPHA:  Int = ???
  val ONE_MINUS_CONSTANT_ALPHA:  Int = ???
  val BLEND_COLOR:  Int = ???
  
  /* Buffer Objects */
  val ARRAY_BUFFER:  Int = ???
  val ELEMENT_ARRAY_BUFFER:  Int = ???
  val ARRAY_BUFFER_BINDING:  Int = ???
  val ELEMENT_ARRAY_BUFFER_BINDING:  Int = ???
  
  val STREAM_DRAW:  Int = ???
  val STATIC_DRAW:  Int = ???
  val DYNAMIC_DRAW:  Int = ???
  
  val BUFFER_SIZE:  Int = ???
  val BUFFER_USAGE:  Int = ???
  
  val CURRENT_VERTEX_ATTRIB:  Int = ???
  
  /* CullFaceMode */
  /**
   * Specifies front faces.
   */
  val FRONT:  Int = ???
  
  /**
   * Specifies back faces.
   */
  val BACK:  Int = ???
  
  /**
   * Specifies both front and back faces.
   */
  val FRONT_AND_BACK:  Int = ???
  
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
  val CULL_FACE:  Int = ???
  /**
   * Capability to enable/disable blending.
   */
  val BLEND:  Int = ???
  
  /**
   * Capability to enable/disable dithering.
   */  
  val DITHER:  Int = ???
  
  /**
   * Capability to enable/disable the stencil test.
   */
  val STENCIL_TEST:  Int = ???
  
  /**
   * Capability to enable/disable the depth test.
   */  
  val DEPTH_TEST:  Int = ???
  
  /**
   * Capability to enable/disable the scissor test.
   */  
  val SCISSOR_TEST:  Int = ???

  /**
   * Capability to enable/disable polygon offset.
   */  
  val POLYGON_OFFSET_FILL:  Int = ???
  val SAMPLE_ALPHA_TO_COVERAGE:  Int = ???
  val SAMPLE_COVERAGE:  Int = ???
  
  /* ErrorCode */
  /**
   * No error has occurred.
   */    
  val NO_ERROR = 0
  
  /**
   * An invalid enumerated name has been passed to an API function.
   */
  val INVALID_ENUM:  Int = ???
  
  /**
   * An invalid value has been passed to an API function.
   */
  val INVALID_VALUE:  Int = ???
  
  /**
   * The requested operation is not valid.
   */
  val INVALID_OPERATION:  Int = ???
  
  /**
   * The operation requested could not be completed because it ran out of memory.
   */
  val OUT_OF_MEMORY:  Int = ???
  
  /* FrontFaceDirection */
  /**
   * Clockwise wound triangles are front-facing.
   */  
  val CW:  Int = ???
  /**
   * Counter-Clockwise wound triangles are front-facing.
   */  
  val CCW:  Int = ???
  
  /* GetPName */
  val LINE_WIDTH:  Int = ???
  val ALIASED_POINT_SIZE_RANGE:  Int = ???
  val ALIASED_LINE_WIDTH_RANGE:  Int = ???
  val CULL_FACE_MODE:  Int = ???
  val FRONT_FACE:  Int = ???
  val DEPTH_RANGE:  Int = ???
  val DEPTH_WRITEMASK:  Int = ???
  val DEPTH_CLEAR_VALUE:  Int = ???
  val DEPTH_FUNC:  Int = ???
  val STENCIL_CLEAR_VALUE:  Int = ???
  val STENCIL_FUNC:  Int = ???
  val STENCIL_FAIL:  Int = ???
  val STENCIL_PASS_DEPTH_FAIL:  Int = ???
  val STENCIL_PASS_DEPTH_PASS:  Int = ???
  val STENCIL_REF:  Int = ???
  val STENCIL_VALUE_MASK:  Int = ???
  val STENCIL_WRITEMASK:  Int = ???
  val STENCIL_BACK_FUNC:  Int = ???
  val STENCIL_BACK_FAIL:  Int = ???
  val STENCIL_BACK_PASS_DEPTH_FAIL:  Int = ???
  val STENCIL_BACK_PASS_DEPTH_PASS:  Int = ???
  val STENCIL_BACK_REF:  Int = ???
  val STENCIL_BACK_VALUE_MASK:  Int = ???
  val STENCIL_BACK_WRITEMASK:  Int = ???
  val VIEWPORT:  Int = ???
  val SCISSOR_BOX:  Int = ???
  /*    SCISSOR_TEST */
  val COLOR_CLEAR_VALUE:  Int = ???
  val COLOR_WRITEMASK:  Int = ???
  val UNPACK_ALIGNMENT:  Int = ???
  val PACK_ALIGNMENT:  Int = ???
  val MAX_TEXTURE_SIZE:  Int = ???
  val MAX_VIEWPORT_DIMS:  Int = ???
  val SUBPIXEL_BITS:  Int = ???
  val RED_BITS:  Int = ???
  val GREEN_BITS:  Int = ???
  val BLUE_BITS:  Int = ???
  val ALPHA_BITS:  Int = ???
  val DEPTH_BITS:  Int = ???
  val STENCIL_BITS:  Int = ???
  val POLYGON_OFFSET_UNITS:  Int = ???
  /*    POLYGON_OFFSET_FILL */
  val POLYGON_OFFSET_FACTOR:  Int = ???
  val TEXTURE_BINDING_2D:  Int = ???
  val SAMPLE_BUFFERS:  Int = ???
  val SAMPLES:  Int = ???
  val SAMPLE_COVERAGE_VALUE:  Int = ???
  val SAMPLE_COVERAGE_INVERT:  Int = ???
  
  /* GetTextureParameter */
  /*    TEXTURE_MAG_FILTER */
  /*    TEXTURE_MIN_FILTER */
  /*    TEXTURE_WRAP_S */
  /*    TEXTURE_WRAP_T */
  
  val COMPRESSED_TEXTURE_FORMATS:  Int = ???
  
  /* HintMode */
  val DONT_CARE:  Int = ???
  val FASTEST:  Int = ???
  val NICEST:  Int = ???
  
  /* HintTarget */
  val GENERATE_MIPMAP_HINT:  Int = ???
  
  /* DataType */
  val BYTE:  Int = ???
  val UNSIGNED_BYTE:  Int = ???
  val SHORT:  Int = ???
  val UNSIGNED_SHORT:  Int = ???
  val INT:  Int = ???
  val UNSIGNED_INT:  Int = ???
  val FLOAT:  Int = ???
  
  /* PixelFormat */
  val DEPTH_COMPONENT:  Int = ???
  val ALPHA:  Int = ???
  val RGB:  Int = ???
  val RGBA:  Int = ???
  val LUMINANCE:  Int = ???
  val LUMINANCE_ALPHA:  Int = ???
  
  /* PixelType */
  /*    UNSIGNED_BYTE */
  val UNSIGNED_SHORT_4_4_4_4:  Int = ???
  val UNSIGNED_SHORT_5_5_5_1:  Int = ???
  val UNSIGNED_SHORT_5_6_5:  Int = ???
  
  /* Shaders */
  val FRAGMENT_SHADER:  Int = ???
  val VERTEX_SHADER:  Int = ???
  val MAX_VERTEX_ATTRIBS:  Int = ???
  val MAX_VERTEX_UNIFORM_VECTORS:  Int = ???
  val MAX_VARYING_VECTORS:  Int = ???
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS:  Int = ???
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS:  Int = ???
  val MAX_TEXTURE_IMAGE_UNITS:  Int = ???
  val MAX_FRAGMENT_UNIFORM_VECTORS:  Int = ???
  val SHADER_TYPE:  Int = ???
  val DELETE_STATUS:  Int = ???
  val LINK_STATUS:  Int = ???
  val VALIDATE_STATUS:  Int = ???
  val ATTACHED_SHADERS:  Int = ???
  val ACTIVE_UNIFORMS:  Int = ???
  val ACTIVE_ATTRIBUTES:  Int = ???
  val SHADING_LANGUAGE_VERSION:  Int = ???
  val CURRENT_PROGRAM:  Int = ???
  
  /* StencilFunction */
  val NEVER:  Int = ???
  val LESS:  Int = ???
  val EQUAL:  Int = ???
  val LEQUAL:  Int = ???
  val GREATER:  Int = ???
  val NOTEQUAL:  Int = ???
  val GEQUAL:  Int = ???
  val ALWAYS:  Int = ???
  
  /* StencilOp */
  /*    ZERO */
  val KEEP:  Int = ???
  val REPLACE:  Int = ???
  val INCR:  Int = ???
  val DECR:  Int = ???
  val INVERT:  Int = ???
  val INCR_WRAP:  Int = ???
  val DECR_WRAP:  Int = ???
  
  /* StringName */
  val VENDOR:  Int = ???
  val RENDERER:  Int = ???
  val VERSION:  Int = ???
  
  /* TextureMagFilter */
  /** Specifies nearest neighbour interpolation. */
  val NEAREST:  Int = ???
  /** Specifies linear interpolation. */
  val LINEAR:  Int = ???
  
  /* TextureMinFilter */
  /*    NEAREST */
  /*    LINEAR */
  /**
   * Specifies nearest neighbour interpolation on the nearest mipmap level.
   */
  val NEAREST_MIPMAP_NEAREST:  Int = ???
  
  /**
   * Specifies linear interpolation on the nearest mipmap level.
   */
  val LINEAR_MIPMAP_NEAREST:  Int = ???
  
  /**
   * Specifies nearest neighbour interpolation, linearly blending between mipmap levels.
   */
  val NEAREST_MIPMAP_LINEAR:  Int = ???
  
  /**
   * Specifies linear interpolation linearly blending between mipmap levels.
   */
  val LINEAR_MIPMAP_LINEAR:  Int = ???
  
  /* TextureParameterName */
  /**
   * The texture magnification filter.
   * 
   * Can be one of [[NEAREST]] or [[LINEAR]].
   */
  val TEXTURE_MAG_FILTER:  Int = ???

  /**
   * The texture minification filter.
   * 
   * Can be one of [[NEAREST]], [[LINEAR]], [[NEAREST_MIPMAP_NEAREST]], [[LINEAR_MIPMAP_NEAREST]],
   * [[NEAREST_MIPMAP_LINEAR]], [[LINEAR_MIPMAP_LINEAR]].
   */

  val TEXTURE_MIN_FILTER:  Int = ???
  
  /**
   * The horizontal texture wrap mode.
   * 
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].  
   */
  val TEXTURE_WRAP_S:  Int = ???
  
  /**
   * The vertical texture wrap.
   *
   * Can be one of [[REPEAT]], [[CLAMP_TO_EDGE]], [[MIRRORED_REPEAT]].  
   */
  val TEXTURE_WRAP_T:  Int = ???
  
  /* TextureTarget */
  /**
   * The target for a simple 2 dimensional texture.
   */
  val TEXTURE_2D:  Int = ???
  val TEXTURE:  Int = ???
  
  /**
   * The target for a cube mapped texture.
   */
  val TEXTURE_CUBE_MAP:  Int = ???
  val TEXTURE_BINDING_CUBE_MAP:  Int = ???
  val TEXTURE_CUBE_MAP_POSITIVE_X:  Int = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_X:  Int = ???
  val TEXTURE_CUBE_MAP_POSITIVE_Y:  Int = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_Y:  Int = ???
  val TEXTURE_CUBE_MAP_POSITIVE_Z:  Int = ???
  val TEXTURE_CUBE_MAP_NEGATIVE_Z:  Int = ???
  val MAX_CUBE_MAP_TEXTURE_SIZE:  Int = ???
  
  /* TextureUnit */
  /** Identifies texture unit 0. This texture unit is guaranteed to exist. */
  val TEXTURE0:  Int = ???
  
  /** Identifies texture unit 1. This texture unit is guaranteed to exist. */
  val TEXTURE1:  Int = ???
  
  /** Identifies texture unit 2. This texture unit is guaranteed to exist. */  
  val TEXTURE2:  Int = ???
  
  /** Identifies texture unit 3. This texture unit is guaranteed to exist. */  
  val TEXTURE3:  Int = ???
  
  /** Identifies texture unit 4. This texture unit is guaranteed to exist. */  
  val TEXTURE4:  Int = ???
  
  /** Identifies texture unit 5. This texture unit is guaranteed to exist. */  
  val TEXTURE5:  Int = ???
  
  /** Identifies texture unit 6. This texture unit is guaranteed to exist. */  
  val TEXTURE6:  Int = ???
  
  /** Identifies texture unit 7. This texture unit is guaranteed to exist. */  
  val TEXTURE7:  Int = ???
  
  /** Identifies texture unit 8. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */  
  val TEXTURE8:  Int = ???
  
  /** Identifies texture unit 9. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE9:  Int = ???
  
  /** Identifies texture unit 10. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE10:  Int = ???
  
  /** Identifies texture unit 11. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE11:  Int = ???
  
  /** Identifies texture unit 12. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE12:  Int = ???
  
  /** Identifies texture unit 13. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE13:  Int = ???
  
  /** Identifies texture unit 14. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE14:  Int = ???
  
  /** Identifies texture unit 15. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE15:  Int = ???
  
  /** Identifies texture unit 16. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE16:  Int = ???
  
  /** Identifies texture unit 17. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE17:  Int = ???
  
  /** Identifies texture unit 18. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE18:  Int = ???
  
  /** Identifies texture unit 19. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE19:  Int = ???
  
  /** Identifies texture unit 20. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE20:  Int = ???
  
  /** Identifies texture unit 21. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE21:  Int = ???
  
  /** Identifies texture unit 22. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE22:  Int = ???
  
  /** Identifies texture unit 23. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE23:  Int = ???
  
  /** Identifies texture unit 24. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE24:  Int = ???
  
  /** Identifies texture unit 25. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE25:  Int = ???
  
  /** Identifies texture unit 26. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE26:  Int = ???
  
  /** Identifies texture unit 27. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE27:  Int = ???
  
  /** Identifies texture unit 28. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE28:  Int = ???
  
  /** Identifies texture unit 29. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE29:  Int = ???
  
  /** Identifies texture unit 30. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE30:  Int = ???
  
  /** Identifies texture unit 31. This texture unit ''may not exist in a given implementation''. You should examine MAX_COMBINED_TEXTURE_UNITS before using it. */
  val TEXTURE31:  Int = ???
  
  /** The currently active texture unit. */
  val ACTIVE_TEXTURE:  Int = ???
  
  /* TextureWrapMode */
  /**
   * Repeat the texture along this axis.
   */  
  val REPEAT:  Int = ???
  /**
   * Clamp the texture along this axis.  The colour of the edge pixels will be replicated to infinity.
   */    
  val CLAMP_TO_EDGE:  Int = ???
  /**
   * Repeat the texture along this axis, mirroring it each step.
   */    
  val MIRRORED_REPEAT:  Int = ???
  
  /* Uniform Types */
  val FLOAT_VEC2:  Int = ???
  val FLOAT_VEC3:  Int = ???
  val FLOAT_VEC4:  Int = ???
  val INT_VEC2:  Int = ???
  val INT_VEC3:  Int = ???
  val INT_VEC4:  Int = ???
  val BOOL:  Int = ???
  val BOOL_VEC2:  Int = ???
  val BOOL_VEC3:  Int = ???
  val BOOL_VEC4:  Int = ???
  val FLOAT_MAT2:  Int = ???
  val FLOAT_MAT3:  Int = ???
  val FLOAT_MAT4:  Int = ???
  val SAMPLER_2D:  Int = ???
  val SAMPLER_CUBE:  Int = ???
  
  /* Vertex Arrays */
  val VERTEX_ATTRIB_ARRAY_ENABLED:  Int = ???
  val VERTEX_ATTRIB_ARRAY_SIZE:  Int = ???
  val VERTEX_ATTRIB_ARRAY_STRIDE:  Int = ???
  val VERTEX_ATTRIB_ARRAY_TYPE:  Int = ???
  val VERTEX_ATTRIB_ARRAY_NORMALIZED:  Int = ???
  val VERTEX_ATTRIB_ARRAY_POINTER:  Int = ???
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING:  Int = ???
  
  /* Shader Source */
  val COMPILE_STATUS:  Int = ???
  
  /* Shader Precision-Specified Types */
  /**
   * Specifies a low precision float.
   */
  val LOW_FLOAT:  Int = ???
  /**
   * Specifies a medium precision float.
   */
  val MEDIUM_FLOAT:  Int = ???
  /**
   * Specifies a high precision float.
   */  
  val HIGH_FLOAT:  Int = ???
  /**
   * Specifies a low precision integer.
   */  
  val LOW_INT:  Int = ???
  /**
   * Specifies a medium precision float.
   */  
  val MEDIUM_INT:  Int = ???
  /**
   * Specifies a high precision float.
   */
  val HIGH_INT:  Int = ???
  
  /* Framebuffer Object. */
  /**
   * The framebuffer target.
   */
  val FRAMEBUFFER:  Int = ???
  
  /**
   * The renderbuffer target.
   */
  val RENDERBUFFER:  Int = ???
  
  val RGBA4:  Int = ???
  val RGB5_A1:  Int = ???
  val RGB565:  Int = ???
  val DEPTH_COMPONENT16:  Int = ???
  val STENCIL_INDEX:  Int = ???
  val STENCIL_INDEX8:  Int = ???
  val DEPTH_STENCIL:  Int = ???
  
  val RENDERBUFFER_WIDTH:  Int = ???
  val RENDERBUFFER_HEIGHT:  Int = ???
  val RENDERBUFFER_INTERNAL_FORMAT:  Int = ???
  val RENDERBUFFER_RED_SIZE:  Int = ???
  val RENDERBUFFER_GREEN_SIZE:  Int = ???
  val RENDERBUFFER_BLUE_SIZE:  Int = ???
  val RENDERBUFFER_ALPHA_SIZE:  Int = ???
  val RENDERBUFFER_DEPTH_SIZE:  Int = ???
  val RENDERBUFFER_STENCIL_SIZE:  Int = ???
  
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE:  Int = ???
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME:  Int = ???
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL:  Int = ???
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE:  Int = ???
  
  val COLOR_ATTACHMENT0:  Int = ???
  val DEPTH_ATTACHMENT:  Int = ???
  val STENCIL_ATTACHMENT:  Int = ???
  val DEPTH_STENCIL_ATTACHMENT:  Int = ???
  
  val NONE = 0
  
  val FRAMEBUFFER_COMPLETE:  Int = ???
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT:  Int = ???
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT:  Int = ???
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS:  Int = ???
  val FRAMEBUFFER_UNSUPPORTED:  Int = ???
  
  val FRAMEBUFFER_BINDING:  Int = ???
  val RENDERBUFFER_BINDING:  Int = ???
  val MAX_RENDERBUFFER_SIZE:  Int = ???
  
  val INVALID_FRAMEBUFFER_OPERATION:  Int = ???
  
  /* WebGL-specific enums */
  val UNPACK_FLIP_Y_WEBGL:  Int = ???
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL:  Int = ???
  val CONTEXT_LOST_WEBGL:  Int = ???
  val UNPACK_COLORSPACE_CONVERSION_WEBGL:  Int = ???
  val BROWSER_DEFAULT_WEBGL:  Int = ???
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
  val drawingBufferWidth:  Int = ???
  
  /**
   * The actual height of the drawing buffer. 
   * This may be different than the underlying HTMLCanvasElement height.
   */
  val drawingBufferHeight:  Int = ???
  
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
  def activeTexture(texture:  Int): Unit = ???
  
  /**
   * Attaches a shader (fragment or vertex) to a [[WebGLProgram]].
   */
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = ???
  
  /**
   * Associates a vertex attribute index with a named attribute variable.
   */
  def bindAttribLocation(program: WebGLProgram, index:  Int, name: js.String): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLBuffer]].
   * 
   * @param target the target to bind the buffer to.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   */
  def bindBuffer(target: Int, buffer: WebGLBuffer): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLFramebuffer]].
   * 
   * @param target  the target to bind the framebuffer to.  Must be [[WebGLRenderingContext.FRAMEBUFFER]].
   * @param framebuffer  a framebuffer object, or null to bind the default framebuffer.
   */
  def bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer): Unit = ???
  
  /**
   * Loads a a target into a [[WebGLRenderbuffer]].
   * 
   * @param target  target to bind to, must be [[WebGLRenderingContext.RENDERBUFFER]]
   * @param renderbuffer the renderbuffer to bind.  If `null`, any object bound to `target` us unbound.
   */
  def bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer): Unit = ???
  
  /**
   * Loads a the active texture unit into a [[WebGLTexture]].
   * 
   * @param target  the target to bind to.  Must be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param texture  the texture to bind. 
   */
  def bindTexture(target: Int, texture: WebGLTexture): Unit = ???
  
  /**
   * Sets the blend color used in [[WebGLRenderingContext.BLEND_COLOR]].
   */
  def blendColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???
  
  /**
   * Specifies the equation used for RGB and Alpha blending.
   * 
   * @param mode  blend equation to use.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquation(mode: Int): Unit = ???
  
  /**
   * Specifies the equation used for RGB and Alpha blending separately.
   * 
   * @param modeRGB  blend equation to use for RGB components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   * @param modeAlpha  blend equation to use for alpha components.  Can be one of [[WebGLRenderingContext.FUNC_ADD]], [[WebGLRenderingContext.FUNC_SUBTRACT]], or [[WebGLRenderingContext.FUNC_REVERSE_SUBTRACT]]
   */
  def blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = ???
  
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
  def blendFunc(sfactor: Int, dfactor: Int): Unit = ???

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
  def blendFuncSeparate(srcRGB: Int, dstRGB:  Int, srcAlpha:  Int, dstAlpha:  Int): Unit = ???
  
  /**
   * Sets the size of the bound [[WebGLBuffer]] for the given `target`.  The contents of the buffer are cleared to 0.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param size  The size of the new buffer
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target:  Int, size:  Int, usage:  Int): Unit = ???
  
  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target:  Int, data: ArrayBufferView, usage:  Int): Unit = ???
  
  /**
   * Resizes the bound [[WebGLBuffer]] for the given `target` to the size of the passed buffer, and replaces its contents with the contents of the buffer.
   * 
   * @param target  The target to resize.  May be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]].
   * @param data the source data for the new buffer.
   * @param usage  The specified usage for this buffer.  May be [[WebGLRenderingContext.STREAM_DRAW]], [[WebGLRenderingContext.STATIC_DRAW]] or [[WebGLRenderingContext.DYNAMIC_DRAW]].
   */
  def bufferData(target:  Int, data: ArrayBuffer, usage:  Int): Unit = ???

  def bufferSubData(target:  Int, offset:  Int, data: ArrayBufferView): Unit = ???
  
  def bufferSubData(target:  Int, offset:  Int, data: ArrayBuffer): Unit = ???

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
  def checkFramebufferStatus(target:  Int):  Int = ???
  
  /**
   * Clears the buffers specified in `mask` with the current [[WebGLRenderingContext#clearColor]], [[WebGLRenderingContext#clearDepth]] and [[WebGLRenderingContext#clearStencil]].
   * 
   * @param mask  The buffers to clear, a bitmask of one or more of [[WebGLRenderingContext.COLOR_BUFFER_BIT]], [[WebGLRenderingContext.DEPTH_BUFFER_BIT]] and [[WebGLRenderingContext.STENCIL_BUFFER_BIT]].
   */
  def clear(mask:  Int): Unit = ???

  /**
   * Sets the clear color to use with [[WebGLRenderingContext#clear]].
   */
  def clearColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???

  /**
   * Sets the clear depth to use with [[WebGLRenderingContext#clear]].
   */
  def clearDepth(depth:  Int): Unit = ???
  
  /**
   * Sets the stencil value to use with [[WebGLRenderingContext#clear]].
   */  
  def clearStencil(s:  Int): Unit = ???
  
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
  def compressedTexImage2D(target:  Int, level:  Int, internalformat:  Int, width:  Int, height:  Int, border:  Int, data: ArrayBufferView): Unit = ???
  
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
  def compressedTexSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, width:  Int, height:  Int, format:  Int, data: ArrayBufferView): Unit = ???
    
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
  def copyTexImage2D(target:  Int, level:  Int, internalformat:  Int, x:  Int, y:  Int, width:  Int, height:  Int, border:  Int): Unit = ???

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
  def copyTexSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, x:  Int, y:  Int, width:  Int, height:  Int): Unit = ???
 
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
  def createShader(`type`:  Int): WebGLShader = ???
  
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
  def cullFace(mode:  Int): Unit = ???
  
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
  def depthFunc(func:  Int): Unit = ???
  
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
  def disable(cap:  Int): Unit = ???

  /**
   * Disables the generic vertex attribute array specified by index.
   */
  def disableVertexAttribArray(index:  Int): Unit = ???
  
  /**
   * Renders the primitives in the active arrays.
   * 
   * @param mode  the kind of primitives to render.  May be [[WebGLRenderingContext.POINTS]], [[WebGLRenderingContext.LINES]], [[WebGLRenderingContext.LINE_STRIP]], [[WebGLRenderingContext.LINE_LOOP]], [[WebGLRenderingContext.TRIANGLES]], [[WebGLRenderingContext.TRIANGLE_STRIP]], [[WebGLRenderingContext.TRIANGLE_FAN]], or [[WebGLRenderingContext.TRIANGLES]]
   * @param first  the starting index into the arrays.
   * @param count  the number of indices to draw.
   */
  def drawArrays(mode:  Int, first:  Int, count:  Int): Unit = ???
  
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
  def drawElements(mode:  Int, count:  Int, `type`:  Int, offset:  Int): Unit = ???
  
  /**
   * Enables a GL capability.
   * 
   * @param cap  the capability to enable.  May be [[WebGLRenderingContext.BLEND]], [[WebGLRenderingContext.CULL_FACE]],
   *             [[WebGLRenderingContext.DEPTH_TEST]], [[WebGLRenderingContext.DITHER]], [[WebGLRenderingContext.POLYGON_OFFSET_FILL]],
   *             [[WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE]], [[WebGLRenderingContext.SAMPLE_COVERAGE]],
   *             [[WebGLRenderingContext.SCISSOR_TEST]], or [[WebGLRenderingContext.STENCIL_TEST]]. 
   */
  def enable(cap:  Int): Unit = ???
  
  /**
   * Enables the generic vertex attribute array specified by index.
   */
  def enableVertexAttribArray(index:  Int): Unit = ???
  
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
  def framebufferRenderbuffer(target:  Int, attachment:  Int, renderbuffertarget:  Int, renderbuffer: WebGLRenderbuffer): Unit = ???
  
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
  def framebufferTexture2D(target:  Int, attachment:  Int, textarget:  Int, texture: WebGLTexture, level:  Int): Unit = ???

  /**
   * Specifies the winding that is considered front-facing for the purposes of CULL_FACE.
   * 
   * @param mode  The winding to consider front-facing.  May be [[WebGLRenderingContext.CW]] or [[WebGLRenderingContext.CCW]]
   */
  def frontFace(mode:  Int): Unit = ???
  
  /**
   * Generate the complete set of mipmaps for the active texture derived from level 0.
   * 
   * @param target  the texture target, may be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]].
   */
  def generateMipmap(target:  Int): Unit = ???
  
  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given attribute at `index`.
   */
  def getActiveAttrib(program: WebGLProgram, index:  Int): WebGLActiveInfo = ???

  /**
   * Returns a new [[WebGLActiveInfo]] object describing the given uniform at `index`.
   */
  def getActiveUniform(program: WebGLProgram, index:  Int): WebGLActiveInfo = ???
  
  /**
   * Returns a new array containing the shaders attached to the given program. 
   */
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] = ???
  
  /**
   * Returns the index of the named attribute, or -1 on error.
   */
  def getAttribLocation(program: WebGLProgram, name: js.String):  Int = ???
  
  /**
   * Returns the value of the requested parameter for a buffer.
   * 
   * @param target  must be [[WebGLRenderingContext.ARRAY_BUFFER]] or [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]
   * @param value  the buffer parameter to retrieve, may be [[WebGLRenderingContext.BUFFER_SIZE]] or [[WebGLRenderingContext.BUFFER_USAGE]]
   * 
   */
  def getBufferParameter(target:  Int, pname:  Int):  Int = ???
  
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
  def getParameter(pname:  Int): js.Any = ???
  
  /**
   * Returns the error value, and resets the error to [[WebGLRenderingContext.NO_ERROR]].
   * 
   * Only the first error is recorded, new errors are not stored until the error value is reset
   * to [[WebGLRenderingContext.NO_ERROR]] by a call to this method.
   * 
   * @return the error code.  One of [[WebGLRenderingContext.NO_ERROR]], [[WebGLRenderingContext.INVALID_ENUM]], [[WebGLRenderingContext.INVALID_VALUE]], [[WebGLRenderingContext.INVALID_OPERATION]], [[WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION]], or [[WebGLRenderingContext.OUT_OF_MEMORY]].
   */
  def getError():  Int = ???
    
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
  def getFramebufferAttachmentParameter(target:  Int, attachment:  Int, pname:  Int): js.Any = ???
  
  /**
   * Returns the value for the given parameter name for the program.
   * The return type is dependent on the requested parameter.
   * 
   * @param program the program to query.
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.DELETE_STATUS]], [[WebGLRenderingContext.LINK_STATUS]],
   *               [[WebGLRenderingContext.VALIDATE_STATUS]], [[WebGLRenderingContext.ATTACHED_SHADERS]],
   *               [[WebGLRenderingContext.ACTIVE_ATTRIBUTES]], or [[WebGLRenderingContext.ACTIVE_UNIFORMS]].
   */
  def getProgramParameter(program: WebGLProgram, pname:  Int): js.Any = ???
  
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
  def getRenderbufferParameter(target:  Int, pname:  Int): js.Any = ???
    
  /**
   * Returns the value of a parameter on the specified [[WebGLShader]].
   * The return type is dependent on the requested parameter.
   * 
   * @param shader  the shader to query
   * @param pname  the parameter to get, may be one of [[WebGLRenderingContext.SHADER_TYPE]],
   *               [[WebGLRenderingContext.DELETE_STATUS]] or [[WebGLRenderingContext.COMPILE_STATUS]]
   * 
   */
  def getShaderParameter(shader: WebGLShader, pname:  Int): js.Any = ???
 
  /**
   * Returns a new [[WebGLShaderPrecisionFormat]] for the given shader type and precision type.
   * 
   * @param shadertype the type of shader, may be [[WebGLRenderingContext.FRAGMENT_SHADER]] or [[WebGLRenderingContext.VERTEX_SHADER]].
   * @param precisiontype the precision type to query, may be [[WebGLRenderingContext.LOW_FLOAT]],
   *                      [[WebGLRenderingContext.MEDIUM_FLOAT]], [[WebGLRenderingContext.HIGH_FLOAT]], [[WebGLRenderingContext.LOW_INT]],
   *                      [[WebGLRenderingContext.MEDIUM_INT]], or [[WebGLRenderingContext.HIGH_INT]]. 
   */
  def getShaderPrecisionFormat(shadertype:  Int, precisiontype:  Int): WebGLShaderPrecisionFormat = ???
  
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
  def getTexParameter(target:  Int, pname:  Int): js.Any = ???
    
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
  def getVertexAttrib(index:  Int, pname:  Int): js.Any = ???
  /**
   * Returns the offset of the vertex attribute.
   * 
   * @param index  the index of the vertex attribute to retrieve
   * @param pname  must be [[WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER]]
   */
  def getVertexAttribOffset(index:  Int, pname:  Int):  Int = ???
   
  /**
   * Specifies implementation specific hints.
   * 
   * @param target  the hint to specify.  Must be [[WebGLRenderingContext.GENERATE_MIPMAP_HINT]]
   * @param mode  the desired mode.  Must be one of [[WebGLRenderingContext.FASTEST]],
   *              [[WebGLRenderingContext.NICEST]], or [[WebGLRenderingContext.DONT_CARE]].
   */
  def hint(target:  Int, mode:  Int): Unit = ???
  
  /**
   * Returns `true` if the `buffer` is valid, `false` otherwise.
   */
  def isBuffer(buffer: js.Any): js.Boolean = ???
  
  /**
   * Returns `true` if the specified capability is enabled, `false` otherwise.
   * @see [[WebGLRenderingContext#enable]]
   */
  def isEnabled(cap:  Int): js.Boolean = ???
  
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
  def lineWidth(width:  Int): Unit = ???
  
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
  def pixelStorei(pname:  Int, param:  Int): Unit = ???
  
  /**
   * Specifies the polygon offset.  When [[WebGLRenderingContext.POLYGON_OFFSET_FILL]] is enabled, depth values for a fragment have an offset applied
   * to them, calculated as `factor`*DZ + r*`units`, where DZ is the change in z based on the polygon's screen area, and r is the minimum value that
   * is guaranteed produce a measurable offset. 
   */
  def polygonOffset(factor:  Int, units:  Int): Unit = ???
  
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
  def readPixels(x: Int, y: Int, width:  Int, height:  Int, format:  Int, `type`:  Int, pixels: ArrayBufferView): Unit = ???
  
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
  def renderbufferStorage(target:  Int, internalformat:  Int, width:  Int, height:  Int): Unit = ???
  
  /**
   * Sets the sampling coverage parameters for primitive antialiasing.
   * 
   * The OpenGL multisampling algorithm is too involved to concisely explain here.
   * Please consult [[http://www.opengl.org/registry/specs/SGIS/multisample.txt]].
   * 
   * @param value  the sample coverage value, clamped to 0..1.
   * @param invert  if true, the mask will be bitwise-inverted.
   */
  def sampleCoverage(value:  Int, invert: js.Boolean): Unit = ???
  
  /**
   * Sets the scissor rectangle.  When [[WebGLRenderingContext.SCISSOR_TEST]] is enabled, rendering will be restricted to this rectangle.
   */
  def scissor(x:  Int, y:  Int, width:  Int, height:  Int): Unit = ???
  
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
  def stencilFunc(func:  Int, ref:  Int, mask:  Int): Unit = ???
  
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
  def stencilFuncSeparate(face:  Int, func:  Int, ref:  Int, mask:  Int): Unit = ???
  
  /**
   * Configure which bits in the stencil buffer may be written to by front or back faces.
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMask(mask:  Int): Unit = ???

  /**
   * Configure which bits in the stencil buffer may be written to by the given face type.
   * @param face the face(s) to configure the mask for.  May be [[WebGLRenderingContext.FRONT]], [[WebGLRenderingContext.BACK]]
   *             or [[WebGLRenderingContext.FRONT_AND_BACK]].
   * @param mask  the write mask.  Set bits are allowed to be written to the corresponding stencil buffer bit.
   */
  def stencilMaskSeparate(face:  Int, mask:  Int): Unit = ???
  
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
  def stencilOp(fail:  Int, zfail:  Int, zpass:  Int): Unit = ???
  
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
  def stencilOpSeparate(face:  Int, fail:  Int, zfail:  Int, zpass:  Int): Unit = ???
  
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
  def texImage2D(target:  Int, level:  Int, internalformat:  Int, width:  Int, height:  Int, border:  Int, format:  Int, `type`:  Int, pixels: ArrayBufferView): Unit = ???

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
  def texImage2D(target:  Int, level:  Int, internalformat:  Int, format:  Int, `type`:  Int, pixels: ImageData): Unit = ???

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
  def texImage2D(target:  Int, level:  Int, internalformat:  Int, format:  Int, `type`:  Int, pixels: HTMLImageElement): Unit = ???

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
  def texImage2D(target:  Int, level:  Int, internalformat:  Int, format:  Int, `type`:  Int, pixels: HTMLCanvasElement): Unit = ???

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
  def texImage2D(target:  Int, level:  Int, internalformat:  Int, format:  Int, `type`:  Int, pixels: HTMLVideoElement): Unit = ???

  /**
   * Sets the texture parameter for the active texture unit.
   * 
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameterf(target:  Int, pname:  Int, param:  Int): Unit = ???
  
  /**
   * Sets the texture parameter for the active texture unit.
   * 
   * @param target  the texture target to configure.  May be [[WebGLRenderingContext.TEXTURE_2D]] or [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]
   * @param pname  the parameter to change.  May be [[WebGLRenderingContext.TEXTURE_MIN_FILTER]], [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]
   *               [[WebGLRenderingContext.TEXTURE_WRAP_S]], or [[WebGLRenderingContext.TEXTURE_WRAP_T]]
   * @param param  the value to set.  See the corresponding parameters for valid values.
   */
  def texParameteri(target:  Int, pname:  Int, param:  Int): Unit = ???

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
  def texSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, width:  Int, height:  Int, format:  Int, `type`:  Int, pixels: ArrayBufferView): Unit = ???

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
  def texSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, format:  Int, `type`:  Int, pixels: ImageData): Unit = ???

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
  def texSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, format:  Int, `type`:  Int, pixels: HTMLImageElement): Unit = ???

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
  def texSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, format:  Int, `type`:  Int, pixels: HTMLCanvasElement): Unit = ???

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
  def texSubImage2D(target:  Int, level:  Int, xoffset:  Int, yoffset:  Int, format:  Int, `type`:  Int, pixels: HTMLVideoElement): Unit = ???

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
  def uniform1i(location: WebGLUniformLocation, x:  Int): Unit = ???

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
  def uniform1iv(location: WebGLUniformLocation, v: js.Array[ Int]): Unit = ???

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
  def uniform2i(location: WebGLUniformLocation, x:  Int, y:  Int): Unit = ???

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
  def uniform2iv(location: WebGLUniformLocation, v: js.Array[ Int]): Unit = ???

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
  def uniform3i(location: WebGLUniformLocation, x: Int, y:  Int, z:  Int): Unit = ???

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
  def uniform3iv(location: WebGLUniformLocation, v: js.Array[ Int]): Unit = ???

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
  def uniform4i(location: WebGLUniformLocation, x: Int, y: Int, z: Int, w: Int): Unit = ???

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
  def uniform4iv(location: WebGLUniformLocation, v: js.Array[Int]): Unit = ???

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
  def vertexAttrib1f(indx: Int, x: js.Number): Unit = ???

  /**
   * Loads a scalar into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: Int, values: Float32Array): Unit = ???

  /**
   * Loads a scalar into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib1fv(indx: Int, values: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   */
  def vertexAttrib2f(indx: Int, x: js.Number, y: js.Number): Unit = ???

  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: Int, values: Float32Array): Unit = ???

  /**
   * Loads a 2-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib2fv(indx: Int, values: js.Array[js.Number]): Unit = ???
 
  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   * @param z  the third component. 
   */
  def vertexAttrib3f(indx: Int, x: js.Number, y: js.Number, z: js.Number): Unit = ???

  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: Int, values: Float32Array): Unit = ???

  /**
   * Loads a 3-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib3fv(indx: Int, values: js.Array[js.Number]): Unit = ???
  
  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param x  the first component.
   * @param y  the second component. 
   * @param z  the third component. 
   * @param w  the fourth component. 
   */
  def vertexAttrib4f(indx: Int, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???

  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: Int, values: Float32Array): Unit = ???

  /**
   * Loads a 4-vector into a vertex attribute.
   * 
   * @param indx the index of the attribute.
   * @param values the source array for the attribute.
   */
  def vertexAttrib4fv(indx: Int, values: js.Array[js.Number]): Unit = ???
  
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
  def vertexAttribPointer(indx: Int, size: Int, `type`: Int, normalized: js.Boolean, stride: Int, offset: Int): Unit = ???
  
  /**
   * Sets the OpenGL viewport to render within.
   */
  def viewport(x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
}
