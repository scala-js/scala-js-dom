/**
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the EPFL scala-js-dom project.
 * 
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom

import scala.scalajs.js
import js.annotation._

class WebGLContextAttributes extends js.Object {
  var alpha: js.Boolean = ???
  var depth: js.Boolean = ???
  var stencil: js.Boolean = ???
  var antialias: js.Boolean = ???
  var premultipliedAlpha: js.Boolean = ???
  var preserveDrawingBuffer: js.Boolean = ???
}

class WebGLBuffer private () extends js.Object

class WebGLFramebuffer private () extends js.Object

class WebGLProgram private () extends js.Object

class WebGLRenderbuffer private () extends js.Object

class WebGLShader private () extends js.Object

class WebGLTexture private () extends js.Object

class WebGLUniformLocation private () extends js.Object

class WebGLActiveInfo private () extends js.Object {
  def size: js.Number = ???
  def `type`: js.Number = ???
  def name: js.String = ???  
}

class WebGLShaderPrecisionFormat private () extends js.Object {
  def rangeMin: js.Number = ???
  def rangeMax: js.Number = ???
  def precision: js.Number = ???
}

object WebGLRenderingContext extends js.Object {
  /* ClearBufferMask */
  val DEPTH_BUFFER_BIT = 0x00000100
  val STENCIL_BUFFER_BIT = 0x00000400
  val COLOR_BUFFER_BIT = 0x00004000
  
  /* BeginMode */
  val POINTS = 0x0000
  val LINES = 0x0001
  val LINE_LOOP = 0x0002
  val LINE_STRIP = 0x0003
  val TRIANGLES = 0x0004
  val TRIANGLE_STRIP = 0x0005
  val TRIANGLE_FAN = 0x0006
  
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
  val SRC_COLOR = 0x0300
  val ONE_MINUS_SRC_COLOR = 0x0301
  val SRC_ALPHA = 0x0302
  val ONE_MINUS_SRC_ALPHA = 0x0303
  val DST_ALPHA = 0x0304
  val ONE_MINUS_DST_ALPHA = 0x0305
  
  /* BlendingFactorSrc */
  /*    ZERO */
  /*    ONE */
  val DST_COLOR = 0x0306
  val ONE_MINUS_DST_COLOR = 0x0307
  val SRC_ALPHA_SATURATE = 0x0308
  /*    SRC_ALPHA */
  /*    ONE_MINUS_SRC_ALPHA */
  /*    DST_ALPHA */
  /*    ONE_MINUS_DST_ALPHA */
  
  /* BlendEquationSeparate */
  val FUNC_ADD = 0x8006
  val BLEND_EQUATION = 0x8009
  val BLEND_EQUATION_RGB = 0x8009   /* same as BLEND_EQUATION */
  val BLEND_EQUATION_ALPHA = 0x883D
  
  /* BlendSubtract */
  val FUNC_SUBTRACT = 0x800A
  val FUNC_REVERSE_SUBTRACT = 0x800B
  
  /* Separate Blend Functions */
  val BLEND_DST_RGB = 0x80C8
  val BLEND_SRC_RGB = 0x80C9
  val BLEND_DST_ALPHA = 0x80CA
  val BLEND_SRC_ALPHA = 0x80CB
  val CONSTANT_COLOR = 0x8001
  val ONE_MINUS_CONSTANT_COLOR = 0x8002
  val CONSTANT_ALPHA = 0x8003
  val ONE_MINUS_CONSTANT_ALPHA = 0x8004
  val BLEND_COLOR = 0x8005
  
  /* Buffer Objects */
  val ARRAY_BUFFER = 0x8892
  val ELEMENT_ARRAY_BUFFER = 0x8893
  val ARRAY_BUFFER_BINDING = 0x8894
  val ELEMENT_ARRAY_BUFFER_BINDING = 0x8895
  
  val STREAM_DRAW = 0x88E0
  val STATIC_DRAW = 0x88E4
  val DYNAMIC_DRAW = 0x88E8
  
  val BUFFER_SIZE = 0x8764
  val BUFFER_USAGE = 0x8765
  
  val CURRENT_VERTEX_ATTRIB = 0x8626
  
  /* CullFaceMode */
  val FRONT = 0x0404
  val BACK = 0x0405
  val FRONT_AND_BACK = 0x0408
  
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
  val CULL_FACE = 0x0B44
  val BLEND = 0x0BE2
  val DITHER = 0x0BD0
  val STENCIL_TEST = 0x0B90
  val DEPTH_TEST = 0x0B71
  val SCISSOR_TEST = 0x0C11
  val POLYGON_OFFSET_FILL = 0x8037
  val SAMPLE_ALPHA_TO_COVERAGE = 0x809E
  val SAMPLE_COVERAGE = 0x80A0
  
  /* ErrorCode */
  val NO_ERROR = 0
  val INVALID_ENUM = 0x0500
  val INVALID_VALUE = 0x0501
  val INVALID_OPERATION = 0x0502
  val OUT_OF_MEMORY = 0x0505
  
  /* FrontFaceDirection */
  val CW = 0x0900
  val CCW = 0x0901
  
  /* GetPName */
  val LINE_WIDTH = 0x0B21
  val ALIASED_POINT_SIZE_RANGE = 0x846D
  val ALIASED_LINE_WIDTH_RANGE = 0x846E
  val CULL_FACE_MODE = 0x0B45
  val FRONT_FACE = 0x0B46
  val DEPTH_RANGE = 0x0B70
  val DEPTH_WRITEMASK = 0x0B72
  val DEPTH_CLEAR_VALUE = 0x0B73
  val DEPTH_FUNC = 0x0B74
  val STENCIL_CLEAR_VALUE = 0x0B91
  val STENCIL_FUNC = 0x0B92
  val STENCIL_FAIL = 0x0B94
  val STENCIL_PASS_DEPTH_FAIL = 0x0B95
  val STENCIL_PASS_DEPTH_PASS = 0x0B96
  val STENCIL_REF = 0x0B97
  val STENCIL_VALUE_MASK = 0x0B93
  val STENCIL_WRITEMASK = 0x0B98
  val STENCIL_BACK_FUNC = 0x8800
  val STENCIL_BACK_FAIL = 0x8801
  val STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802
  val STENCIL_BACK_PASS_DEPTH_PASS = 0x8803
  val STENCIL_BACK_REF = 0x8CA3
  val STENCIL_BACK_VALUE_MASK = 0x8CA4
  val STENCIL_BACK_WRITEMASK = 0x8CA5
  val VIEWPORT = 0x0BA2
  val SCISSOR_BOX = 0x0C10
  /*    SCISSOR_TEST */
  val COLOR_CLEAR_VALUE = 0x0C22
  val COLOR_WRITEMASK = 0x0C23
  val UNPACK_ALIGNMENT = 0x0CF5
  val PACK_ALIGNMENT = 0x0D05
  val MAX_TEXTURE_SIZE = 0x0D33
  val MAX_VIEWPORT_DIMS = 0x0D3A
  val SUBPIXEL_BITS = 0x0D50
  val RED_BITS = 0x0D52
  val GREEN_BITS = 0x0D53
  val BLUE_BITS = 0x0D54
  val ALPHA_BITS = 0x0D55
  val DEPTH_BITS = 0x0D56
  val STENCIL_BITS = 0x0D57
  val POLYGON_OFFSET_UNITS = 0x2A00
  /*    POLYGON_OFFSET_FILL */
  val POLYGON_OFFSET_FACTOR = 0x8038
  val TEXTURE_BINDING_2D = 0x8069
  val SAMPLE_BUFFERS = 0x80A8
  val SAMPLES = 0x80A9
  val SAMPLE_COVERAGE_VALUE = 0x80AA
  val SAMPLE_COVERAGE_INVERT = 0x80AB
  
  /* GetTextureParameter */
  /*    TEXTURE_MAG_FILTER */
  /*    TEXTURE_MIN_FILTER */
  /*    TEXTURE_WRAP_S */
  /*    TEXTURE_WRAP_T */
  
  val COMPRESSED_TEXTURE_FORMATS = 0x86A3
  
  /* HintMode */
  val DONT_CARE = 0x1100
  val FASTEST = 0x1101
  val NICEST = 0x1102
  
  /* HintTarget */
  val GENERATE_MIPMAP_HINT = 0x8192
  
  /* DataType */
  val BYTE = 0x1400
  val UNSIGNED_BYTE = 0x1401
  val SHORT = 0x1402
  val UNSIGNED_SHORT = 0x1403
  val INT = 0x1404
  val UNSIGNED_INT = 0x1405
  val FLOAT = 0x1406
  
  /* PixelFormat */
  val DEPTH_COMPONENT = 0x1902
  val ALPHA = 0x1906
  val RGB = 0x1907
  val RGBA = 0x1908
  val LUMINANCE = 0x1909
  val LUMINANCE_ALPHA = 0x190A
  
  /* PixelType */
  /*    UNSIGNED_BYTE */
  val UNSIGNED_SHORT_4_4_4_4 = 0x8033
  val UNSIGNED_SHORT_5_5_5_1 = 0x8034
  val UNSIGNED_SHORT_5_6_5 = 0x8363
  
  /* Shaders */
  val FRAGMENT_SHADER = 0x8B30
  val VERTEX_SHADER = 0x8B31
  val MAX_VERTEX_ATTRIBS = 0x8869
  val MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB
  val MAX_VARYING_VECTORS = 0x8DFC
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C
  val MAX_TEXTURE_IMAGE_UNITS = 0x8872
  val MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD
  val SHADER_TYPE = 0x8B4F
  val DELETE_STATUS = 0x8B80
  val LINK_STATUS = 0x8B82
  val VALIDATE_STATUS = 0x8B83
  val ATTACHED_SHADERS = 0x8B85
  val ACTIVE_UNIFORMS = 0x8B86
  val ACTIVE_ATTRIBUTES = 0x8B89
  val SHADING_LANGUAGE_VERSION = 0x8B8C
  val CURRENT_PROGRAM = 0x8B8D
  
  /* StencilFunction */
  val NEVER = 0x0200
  val LESS = 0x0201
  val EQUAL = 0x0202
  val LEQUAL = 0x0203
  val GREATER = 0x0204
  val NOTEQUAL = 0x0205
  val GEQUAL = 0x0206
  val ALWAYS = 0x0207
  
  /* StencilOp */
  /*    ZERO */
  val KEEP = 0x1E00
  val REPLACE = 0x1E01
  val INCR = 0x1E02
  val DECR = 0x1E03
  val INVERT = 0x150A
  val INCR_WRAP = 0x8507
  val DECR_WRAP = 0x8508
  
  /* StringName */
  val VENDOR = 0x1F00
  val RENDERER = 0x1F01
  val VERSION = 0x1F02
  
  /* TextureMagFilter */
  val NEAREST = 0x2600
  val LINEAR = 0x2601
  
  /* TextureMinFilter */
  /*    NEAREST */
  /*    LINEAR */
  val NEAREST_MIPMAP_NEAREST = 0x2700
  val LINEAR_MIPMAP_NEAREST = 0x2701
  val NEAREST_MIPMAP_LINEAR = 0x2702
  val LINEAR_MIPMAP_LINEAR = 0x2703
  
  /* TextureParameterName */
  val TEXTURE_MAG_FILTER = 0x2800
  val TEXTURE_MIN_FILTER = 0x2801
  val TEXTURE_WRAP_S = 0x2802
  val TEXTURE_WRAP_T = 0x2803
  
  /* TextureTarget */
  val TEXTURE_2D = 0x0DE1
  val TEXTURE = 0x1702
  
  val TEXTURE_CUBE_MAP = 0x8513
  val TEXTURE_BINDING_CUBE_MAP = 0x8514
  val TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515
  val TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516
  val TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517
  val TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518
  val TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519
  val TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A
  val MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C
  
  /* TextureUnit */
  val TEXTURE0 = 0x84C0
  val TEXTURE1 = 0x84C1
  val TEXTURE2 = 0x84C2
  val TEXTURE3 = 0x84C3
  val TEXTURE4 = 0x84C4
  val TEXTURE5 = 0x84C5
  val TEXTURE6 = 0x84C6
  val TEXTURE7 = 0x84C7
  val TEXTURE8 = 0x84C8
  val TEXTURE9 = 0x84C9
  val TEXTURE10 = 0x84CA
  val TEXTURE11 = 0x84CB
  val TEXTURE12 = 0x84CC
  val TEXTURE13 = 0x84CD
  val TEXTURE14 = 0x84CE
  val TEXTURE15 = 0x84CF
  val TEXTURE16 = 0x84D0
  val TEXTURE17 = 0x84D1
  val TEXTURE18 = 0x84D2
  val TEXTURE19 = 0x84D3
  val TEXTURE20 = 0x84D4
  val TEXTURE21 = 0x84D5
  val TEXTURE22 = 0x84D6
  val TEXTURE23 = 0x84D7
  val TEXTURE24 = 0x84D8
  val TEXTURE25 = 0x84D9
  val TEXTURE26 = 0x84DA
  val TEXTURE27 = 0x84DB
  val TEXTURE28 = 0x84DC
  val TEXTURE29 = 0x84DD
  val TEXTURE30 = 0x84DE
  val TEXTURE31 = 0x84DF
  val ACTIVE_TEXTURE = 0x84E0
  
  /* TextureWrapMode */
  val REPEAT = 0x2901
  val CLAMP_TO_EDGE = 0x812F
  val MIRRORED_REPEAT = 0x8370
  
  /* Uniform Types */
  val FLOAT_VEC2 = 0x8B50
  val FLOAT_VEC3 = 0x8B51
  val FLOAT_VEC4 = 0x8B52
  val INT_VEC2 = 0x8B53
  val INT_VEC3 = 0x8B54
  val INT_VEC4 = 0x8B55
  val BOOL = 0x8B56
  val BOOL_VEC2 = 0x8B57
  val BOOL_VEC3 = 0x8B58
  val BOOL_VEC4 = 0x8B59
  val FLOAT_MAT2 = 0x8B5A
  val FLOAT_MAT3 = 0x8B5B
  val FLOAT_MAT4 = 0x8B5C
  val SAMPLER_2D = 0x8B5E
  val SAMPLER_CUBE = 0x8B60
  
  /* Vertex Arrays */
  val VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622
  val VERTEX_ATTRIB_ARRAY_SIZE = 0x8623
  val VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624
  val VERTEX_ATTRIB_ARRAY_TYPE = 0x8625
  val VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A
  val VERTEX_ATTRIB_ARRAY_POINTER = 0x8645
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F
  
  /* Shader Source */
  val COMPILE_STATUS = 0x8B81
  
  /* Shader Precision-Specified Types */
  val LOW_FLOAT = 0x8DF0
  val MEDIUM_FLOAT = 0x8DF1
  val HIGH_FLOAT = 0x8DF2
  val LOW_INT = 0x8DF3
  val MEDIUM_INT = 0x8DF4
  val HIGH_INT = 0x8DF5
  
  /* Framebuffer Object. */
  val FRAMEBUFFER = 0x8D40
  val RENDERBUFFER = 0x8D41
  
  val RGBA4 = 0x8056
  val RGB5_A1 = 0x8057
  val RGB565 = 0x8D62
  val DEPTH_COMPONENT16 = 0x81A5
  val STENCIL_INDEX = 0x1901
  val STENCIL_INDEX8 = 0x8D48
  val DEPTH_STENCIL = 0x84F9
  
  val RENDERBUFFER_WIDTH = 0x8D42
  val RENDERBUFFER_HEIGHT = 0x8D43
  val RENDERBUFFER_INTERNAL_FORMAT = 0x8D44
  val RENDERBUFFER_RED_SIZE = 0x8D50
  val RENDERBUFFER_GREEN_SIZE = 0x8D51
  val RENDERBUFFER_BLUE_SIZE = 0x8D52
  val RENDERBUFFER_ALPHA_SIZE = 0x8D53
  val RENDERBUFFER_DEPTH_SIZE = 0x8D54
  val RENDERBUFFER_STENCIL_SIZE = 0x8D55
  
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3
  
  val COLOR_ATTACHMENT0 = 0x8CE0
  val DEPTH_ATTACHMENT = 0x8D00
  val STENCIL_ATTACHMENT = 0x8D20
  val DEPTH_STENCIL_ATTACHMENT = 0x821A
  
  val NONE = 0
  
  val FRAMEBUFFER_COMPLETE = 0x8CD5
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9
  val FRAMEBUFFER_UNSUPPORTED = 0x8CDD
  
  val FRAMEBUFFER_BINDING = 0x8CA6
  val RENDERBUFFER_BINDING = 0x8CA7
  val MAX_RENDERBUFFER_SIZE = 0x84E8
  
  val INVALID_FRAMEBUFFER_OPERATION = 0x0506
  
  /* WebGL-specific enums */
  val UNPACK_FLIP_Y_WEBGL = 0x9240
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241
  val CONTEXT_LOST_WEBGL = 0x9242
  val UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243
  val BROWSER_DEFAULT_WEBGL = 0x9244
}

class WebGLRenderingContext extends js.Object {
  /* ClearBufferMask */
  val canvas: HTMLCanvasElement = ???
  val drawingBufferWidth: js.Number = ???
  val drawingBufferHeight: js.Number = ???
  
  def getContextAttributes(): WebGLContextAttributes = ???
  def isContextLost(): js.Boolean = ???
  def getSupportedExtensions(): js.Array[String] = ???
  def getExtension(): js.Any = ???
  
  def activeTexture(texture: js.Number): Unit = ???
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = ???
  def bindAttribLocation(program: WebGLProgram, index: js.Number, name: js.String): Unit = ???
  def bindBuffer(target: js.Number, buffer: WebGLBuffer): Unit = ???
  def bindFramebuffer(target: js.Number, framebuffer: WebGLFramebuffer): Unit = ???
  def bindRenderbuffer(target: js.Number, renderbuffer: WebGLRenderbuffer): Unit = ???
  def bindTexture(target: js.Number, texture: WebGLTexture): Unit = ???
  def blendColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???
  def blendEquation(mode: js.Number): Unit = ???
  def blendEquationSeparate(modeRGB: js.Number, modeAlpha: js.Number): Unit = ???
  def blendFunc(sfactor: js.Number, dfactor: js.Number): Unit = ???
  def blendFuncSeparate(sfactor: js.Number, dfactor: js.Number): Unit = ???
  def blendFuncSeparate(srcRGB: js.Number, dstRGB: js.Number, srcAlpha: js.Number, dstAlpha: js.Number): Unit = ???
  def bufferData(target: js.Number, size: js.Number, usage: js.Number): Unit = ???
  def bufferData(target: js.Number, size: ArrayBufferView, usage: js.Number): Unit = ???
  def bufferData(target: js.Number, size: ArrayBuffer, usage: js.Number): Unit = ???

  def checkFramebufferStatus(target: js.Number): js.Number = ???
  def clear(mask: js.Number): Unit = ???
  def clearColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number): Unit = ???
  def clearDepth(depth: js.Number): Unit = ???
  def clearStencil(s: js.Number): Unit = ???
  def colorMask(red: js.Boolean, green: js.Boolean, blue: js.Boolean, alpha: js.Boolean): Unit = ???
  def compileShader(shader: WebGLShader): Unit = ???
  def compressedTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, data: ArrayBufferView): Unit = ???
  def compressedTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, data: ArrayBufferView): Unit = ???
  def copyTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number, border: js.Number): Unit = ???
  def copyTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
 
  def createBuffer(): WebGLBuffer = ???
  def createFramebuffer(): WebGLFramebuffer = ???
  def createProgram(): WebGLProgram = ???
  def createRenderBuffer(): WebGLRenderbuffer = ???
  def createShader(`type`: js.Number): WebGLShader = ???
  def createTexture(): WebGLTexture = ???
  
  def cullFace(mode: js.Number): Unit = ???
  
  def deleteBuffer(buffer: WebGLBuffer): Unit = ???
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = ???
  def deleteProgram(program: WebGLProgram): Unit = ???
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = ???
  def deleteShader(shader: WebGLShader): Unit = ???
  def deleteTexture(texture: WebGLTexture): Unit = ???
  
  def depthFunc(func: js.Number): Unit = ???
  def depthMask(flag: js.Boolean): Unit = ???
  def depthRange(zNear: js.Number, zFar: js.Number): Unit = ???
  def detatchShader(program: WebGLProgram, shader: WebGLShader): Unit = ???
  def disable(cap: js.Number): Unit = ???
  def disableVertexAttribArray(index: js.Number): Unit = ???
  def drawArrays(mode: js.Number, first: js.Number, count: js.Number): Unit = ???
  def drawElements(mode: js.Number, count: js.Number, `type`: js.Number, offset: js.Number): Unit = ???
  
  def enable(cap: js.Number): Unit = ???
  def enableVertexAttribArray(index: js.Number): Unit = ???
  def finish(): Unit = ???
  def flush(): Unit = ???
  def framebufferRenderbuffer(target: js.Number, attachment: js.Number, renderbuffertarget: js.Number, renderbuffer: WebGLRenderbuffer): Unit = ???
  def framebufferTexture2D(target: js.Number, attachment: js.Number, textarget: js.Number, texture: WebGLTexture, level: js.Number): Unit = ???
  def frontFace(mode: js.Number): Unit = ???
  
  def generateMipmap(target: js.Number): Unit = ???
  
  def getActiveAttrib(program: WebGLProgram, index: js.Number): Unit = ???
  def getActiveUniform(program: WebGLProgram, index: js.Number): Unit = ???
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] = ???
  
  def getAttribLocation(program: WebGLProgram, name: js.String): js.Number = ???
  
  def getBufferParameter(target: js.Number, pname: js.Number): js.Any = ???
  def getParameter(pname: js.Number): js.Any = ???
  
  def getError(): js.Number = ???
  
  def getFramebufferAttachmentParameter(target: js.Number, attachment: js.Number, pname: js.Number): js.Any = ???
  def getProgramParameter(program: WebGLProgram, pname: js.Number): js.Any = ???
  def getProgramInfoLog(program: WebGLProgram): js.String = ???
  def getRenderbufferParameter(target: js.Number, pname: js.Number): js.Any = ???
  def getShaderParameter(shader: WebGLShader, pname: js.Number): js.Any = ???
  def getShaderPrecisionFormat(shadertype: js.Number, precisiontype: js.Number): WebGLShaderPrecisionFormat = ???
  def getShaderInfoLog(shader: WebGLShader): js.String = ???
  
  def getShaderSource(shader: WebGLShader): js.String = ???
  
  def getTexParameter(target: js.Number, pname: js.Number): js.Any = ???
  
  def getUniform(program: WebGLProgram, location: WebGLUniformLocation): js.Any = ???
  
  def getUniformLocation(program: WebGLProgram, name: js.String): WebGLUniformLocation = ???
  
  def getVertexAttrib(index: js.Number, pname: js.Number): js.Any = ???
  
  def getVertexAttribOffset(index: js.Number, pname: js.Number): js.Any = ???
  
  def hint(target: js.Number, mode: js.Number): js.Any = ???
  
  def isBuffer(buffer: js.Any): js.Boolean = ???
  def isEnabled(cap: js.Number): js.Boolean = ???
  def isFramebuffer(framebuffer: js.Any): js.Boolean = ???
  def isProgram(program: js.Any): js.Boolean = ???
  def isRenderbuffer(renderbuffer: js.Any): js.Boolean = ???
  def isShader(shader: js.Any): js.Boolean = ???
  def isTexture(texture: js.Any): js.Boolean = ???
  def lineWidth(width: js.Number): Unit = ???
  def linkProgram(program: WebGLProgram): Unit = ???
  def pixelStorei(pname: js.Number, param: js.Number): Unit = ???
  def polygonOffset(factor: js.Number, units: js.Number): Unit = ???
  def readPixels(x: js.Number, y: js.Number, width: js.Number, height: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???
  def renderbufferStorage(target: js.Number, internalformat: js.Number, width: js.Number, height: js.Number): Unit = ???
  def sampleCoverage(value: js.Number, invert: js.Boolean): Unit = ???
  def scissor(x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
  
  def shaderSource(shader: WebGLShader, source: js.String): Unit = ???
  
  def stencilFunc(func: js.Number, ref: js.Number, mask: js.Number): Unit = ???
  def stencilFuncSeparate(face: js.Number, func: js.Number, ref: js.Number, mask: js.Number): Unit = ???
  def stencilMask(mask: js.Number): Unit = ???
  def stencilMaskSeperate(face: js.Number, mask: js.Number): Unit = ???
  def stencilOp(fail: js.Number, zfail: js.Number, zpass: js.Number): Unit = ???
  def stencilOpSeperate(face: js.Number, fail: js.Number, zfail: js.Number, zpass: js.Number): Unit = ???
  
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: ImageData): Unit = ???
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLImageElement): Unit = ???  
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLCanvasElement): Unit = ???
  def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

  def texParameterf(target: js.Number, pname: js.Number, param: js.Number): Unit = ???
  def texParameteri(target: js.Number, pname: js.Number, param: js.Number): Unit = ???

  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: ImageData): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLImageElement): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLCanvasElement): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

  def uniform1f(location: WebGLUniformLocation, x: js.Number): Unit = ???
  def uniform1fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???
  def uniform1fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  def uniform1i(location: WebGLUniformLocation, x: js.Number): Unit = ???
  def uniform1iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???
  def uniform1iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  def uniform2f(location: WebGLUniformLocation, x: js.Number, y: js.Number): Unit = ???
  def uniform2fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???
  def uniform2fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  def uniform2i(location: WebGLUniformLocation, x: js.Number, y: js.Number): Unit = ???
  def uniform2iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???
  def uniform2iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  def uniform3f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number): Unit = ???
  def uniform3fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???
  def uniform3fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  def uniform3i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number): Unit = ???
  def uniform3iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???
  def uniform3iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  def uniform4f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???
  def uniform4fv(location: WebGLUniformLocation, v: Float32Array): Unit = ???
  def uniform4fv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???
  def uniform4i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???
  def uniform4iv(location: WebGLUniformLocation, v: Int32Array): Unit = ???
  def uniform4iv(location: WebGLUniformLocation, v: js.Array[js.Number]): Unit = ???

  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array): Unit = ???
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]): Unit = ???
  
  def useProgram(program: WebGLProgram): Unit = ???
  def validateProgram(program: WebGLProgram): Unit = ???
  
  def vertexAttrib1f(indx: js.Number, x: js.Number): Unit = ???
  def vertexAttrib1fv(indx: js.Number, values: Float32Array): Unit = ???
  def vertexAttrib1fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
  def vertexAttrib2f(indx: js.Number, x: js.Number, y: js.Number): Unit = ???
  def vertexAttrib2fv(indx: js.Number, values: Float32Array): Unit = ???
  def vertexAttrib2fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
 
  def vertexAttrib3f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number): Unit = ???
  def vertexAttrib3fv(indx: js.Number, values: Float32Array): Unit = ???
  def vertexAttrib3fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
  def vertexAttrib4f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number, w: js.Number): Unit = ???
  def vertexAttrib4fv(indx: js.Number, values: Float32Array): Unit = ???
  def vertexAttrib4fv(indx: js.Number, values: js.Array[js.Number]): Unit = ???
  
  def vertexAttribPointer(indx: js.Number, size: js.Number, `type`: js.Number, normalized: js.Boolean, stride: js.Number, offset: js.Number): Unit = ???
  
  def viewport(x: js.Number, y: js.Number, width: js.Number, height: js.Number): Unit = ???
}
