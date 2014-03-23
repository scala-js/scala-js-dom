/**
 * Copyright (C) 2014 Matt Seddon.  This source is donated in full to the EPFL scala-js-dom project.
 * 
 * Based on https://www.khronos.org/registry/webgl/specs/1.0/
 */

package org.scalajs.dom;
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

class WebGLBuffer private extends js.Object

class WebGLFramebuffer private extends js.Object

class WebGLProgram private extends js.Object

class WebGLRenderbuffer private extends js.Object

class WebGLShader private extends js.Object

class WebGLTexture private extends js.Object

class WebGLUniformLocation private extends js.Object

class WebGLActiveInfo private extends js.Object {
  def size: js.Number = ???
  def `type`: js.Number = ???
  def name: js.String = ???  
}

class WebGLShaderPrecisionFormat private extends js.Object {
  def rangeMin: js.Number = ???
  def rangeMax: js.Number = ???
  def precision: js.Number = ???
}

object WebGLRenderingContext extends js.Object {
  def COLOR_BUFFER_BIT: js.Number = ???
  def DEPTH_BUFFER_BIT: js.Number = ???
  def STATIC_DRAW: js.Number = ???
  def DYNAMIC_DRAW: js.Number = ???
    
  def BUFFER_SIZE: js.Number = ???
  def BUFFER_USAGE: js.Number = ???
    
  def CURRENT_VERTEX_ATTRIB: js.Number = ???
    
  /* CullFaceMode */
  def FRONT: js.Number = ???
  def BACK: js.Number = ???
  def FRONT_AND_BACK: js.Number = ???
    
  /* DepthFunction */
  /*      NEVER */
  /*      LESS */
  /*      EQUAL */
  /*      LEQUAL */
  /*      GREATER */
  /*      NOTEQUAL */
  /*      GEQUAL */
  /*      ALWAYS */
    
  /* EnableCap */
  /* TEXTURE_2D */
  def CULL_FACE: js.Number = ???
  def BLEND: js.Number = ???
  def DITHER: js.Number = ???
  def STENCIL_TEST: js.Number = ???
  def DEPTH_TEST: js.Number = ???
  def SCISSOR_TEST: js.Number = ???
  def POLYGON_OFFSET_FILL: js.Number = ???
  def SAMPLE_ALPHA_TO_COVERAGE: js.Number = ???
  def SAMPLE_COVERAGE: js.Number = ???
    
  /* ErrorCode */
  def NO_ERROR: js.Number = ???
  def INVALID_ENUM: js.Number = ???
  def INVALID_VALUE: js.Number = ???
  def INVALID_OPERATION: js.Number = ???
  def OUT_OF_MEMORY: js.Number = ???
    
  /* FrontFaceDirection */
  def CW: js.Number = ???
  def CCW: js.Number = ???
    
  /* GetPName */
  def LINE_WIDTH: js.Number = ???
  def ALIASED_POINT_SIZE_RANGE: js.Number = ???
  def ALIASED_LINE_WIDTH_RANGE: js.Number = ???
  def CULL_FACE_MODE: js.Number = ???
  def FRONT_FACE: js.Number = ???
  def DEPTH_RANGE: js.Number = ???
  def DEPTH_WRITEMASK: js.Number = ???
  def DEPTH_CLEAR_VALUE: js.Number = ???
  def DEPTH_FUNC: js.Number = ???
  def STENCIL_CLEAR_VALUE: js.Number = ???
  def STENCIL_FUNC: js.Number = ???
  def STENCIL_FAIL: js.Number = ???
  def STENCIL_PASS_DEPTH_FAIL: js.Number = ???
  def STENCIL_PASS_DEPTH_PASS: js.Number = ???
  def STENCIL_REF: js.Number = ???
  def STENCIL_VALUE_MASK: js.Number = ???
  def STENCIL_WRITEMASK: js.Number = ???
  def STENCIL_BACK_FUNC: js.Number = ???
  def STENCIL_BACK_FAIL: js.Number = ???
  def STENCIL_BACK_PASS_DEPTH_FAIL: js.Number = ???
  def STENCIL_BACK_PASS_DEPTH_PASS: js.Number = ???
  def STENCIL_BACK_REF: js.Number = ???
  def STENCIL_BACK_VALUE_MASK: js.Number = ???
  def STENCIL_BACK_WRITEMASK: js.Number = ???
  def VIEWPORT: js.Number = ???
  def SCISSOR_BOX: js.Number = ???
  /*      SCISSOR_TEST */
  def COLOR_CLEAR_VALUE: js.Number = ???
  def COLOR_WRITEMASK: js.Number = ???
  def UNPACK_ALIGNMENT: js.Number = ???
  def PACK_ALIGNMENT: js.Number = ???
  def MAX_TEXTURE_SIZE: js.Number = ???
  def MAX_VIEWPORT_DIMS: js.Number = ???
  def SUBPIXEL_BITS: js.Number = ???
  def RED_BITS: js.Number = ???
  def GREEN_BITS: js.Number = ???
  def BLUE_BITS: js.Number = ???
  def ALPHA_BITS: js.Number = ???
  def DEPTH_BITS: js.Number = ???
  def STENCIL_BITS: js.Number = ???
  def POLYGON_OFFSET_UNITS: js.Number = ???
  /*      POLYGON_OFFSET_FILL */
  def POLYGON_OFFSET_FACTOR: js.Number = ???
  def TEXTURE_BINDING_2D: js.Number = ???
  def SAMPLE_BUFFERS: js.Number = ???
  def SAMPLES: js.Number = ???
  def SAMPLE_COVERAGE_VALUE: js.Number = ???
  def SAMPLE_COVERAGE_INVERT: js.Number = ???
    
  /* GetTextureParameter */
  /*      TEXTURE_MAG_FILTER */
  /*      TEXTURE_MIN_FILTER */
  /*      TEXTURE_WRAP_S */
  /*      TEXTURE_WRAP_T */
    
  def COMPRESSED_TEXTURE_FORMATS: js.Number = ???
    
  /* HintMode */
  def DONT_CARE: js.Number = ???
  def FASTEST: js.Number = ???
  def NICEST: js.Number = ???
    
  /* HintTarget */
  def GENERATE_MIPMAP_HINT: js.Number = ???
    
  /* DataType */
  def BYTE: js.Number = ???
  def UNSIGNED_BYTE: js.Number = ???
  def SHORT: js.Number = ???
  def UNSIGNED_SHORT: js.Number = ???
  def INT: js.Number = ???
  def UNSIGNED_INT: js.Number = ???
  def FLOAT: js.Number = ???
    
  /* PixelFormat */
  def DEPTH_COMPONENT: js.Number = ???
  def ALPHA: js.Number = ???
  def RGB: js.Number = ???
  def RGBA: js.Number = ???
  def LUMINANCE: js.Number = ???
  def LUMINANCE_ALPHA: js.Number = ???
    
  /* PixelType */
  /*      UNSIGNED_BYTE */
  def UNSIGNED_SHORT_4_4_4_4: js.Number = ???
  def UNSIGNED_SHORT_5_5_5_1: js.Number = ???
  def UNSIGNED_SHORT_5_6_5: js.Number = ???
    
  /* Shaders */
  def FRAGMENT_SHADER: js.Number = ???
  def VERTEX_SHADER: js.Number = ???
  def MAX_VERTEX_ATTRIBS: js.Number = ???
  def MAX_VERTEX_UNIFORM_VECTORS: js.Number = ???
  def MAX_VARYING_VECTORS: js.Number = ???
  def MAX_COMBINED_TEXTURE_IMAGE_UNITS: js.Number = ???
  def MAX_VERTEX_TEXTURE_IMAGE_UNITS: js.Number = ???
  def MAX_TEXTURE_IMAGE_UNITS: js.Number = ???
  def MAX_FRAGMENT_UNIFORM_VECTORS: js.Number = ???
  def SHADER_TYPE: js.Number = ???
  def DELETE_STATUS: js.Number = ???
  def LINK_STATUS: js.Number = ???
  def VALIDATE_STATUS: js.Number = ???
  def ATTACHED_SHADERS: js.Number = ???
  def ACTIVE_UNIFORMS: js.Number = ???
  def ACTIVE_ATTRIBUTES: js.Number = ???
  def SHADING_LANGUAGE_VERSION: js.Number = ???
  def CURRENT_PROGRAM: js.Number = ???
    
  /* StencilFunction */
  def NEVER: js.Number = ???
  def LESS: js.Number = ???
  def EQUAL: js.Number = ???
  def LEQUAL: js.Number = ???
  def GREATER: js.Number = ???
  def NOTEQUAL: js.Number = ???
  def GEQUAL: js.Number = ???
  def ALWAYS: js.Number = ???
    
  /* StencilOp */
  /*      ZERO */
  def KEEP: js.Number = ???
  def REPLACE: js.Number = ???
  def INCR: js.Number = ???
  def DECR: js.Number = ???
  def INVERT: js.Number = ???
  def INCR_WRAP: js.Number = ???
  def DECR_WRAP: js.Number = ???
    
  /* StringName */
  def VENDOR: js.Number = ???
  def RENDERER: js.Number = ???
  def VERSION: js.Number = ???
    
  /* TextureMagFilter */
  def NEAREST: js.Number = ???
  def LINEAR: js.Number = ???
    
  /* TextureMinFilter */
  /*      NEAREST */
  /*      LINEAR */
  def NEAREST_MIPMAP_NEAREST: js.Number = ???
  def LINEAR_MIPMAP_NEAREST: js.Number = ???
  def NEAREST_MIPMAP_LINEAR: js.Number = ???
  def LINEAR_MIPMAP_LINEAR: js.Number = ???
    
  /* TextureParameterName */
  def TEXTURE_MAG_FILTER: js.Number = ???
  def TEXTURE_MIN_FILTER: js.Number = ???
  def TEXTURE_WRAP_S: js.Number = ???
  def TEXTURE_WRAP_T: js.Number = ???
    
  /* TextureTarget */
  def TEXTURE_2D: js.Number = ???
  def TEXTURE: js.Number = ???
    
  def TEXTURE_CUBE_MAP: js.Number = ???
  def TEXTURE_BINDING_CUBE_MAP: js.Number = ???
  def TEXTURE_CUBE_MAP_POSITIVE_X: js.Number = ???
  def TEXTURE_CUBE_MAP_NEGATIVE_X: js.Number = ???
  def TEXTURE_CUBE_MAP_POSITIVE_Y: js.Number = ???
  def TEXTURE_CUBE_MAP_NEGATIVE_Y: js.Number = ???
  def TEXTURE_CUBE_MAP_POSITIVE_Z: js.Number = ???
  def TEXTURE_CUBE_MAP_NEGATIVE_Z: js.Number = ???
  def MAX_CUBE_MAP_TEXTURE_SIZE: js.Number = ???
    
  /* TextureUnit */
  def TEXTURE0: js.Number = ???
  def TEXTURE1: js.Number = ???
  def TEXTURE2: js.Number = ???
  def TEXTURE3: js.Number = ???
  def TEXTURE4: js.Number = ???
  def TEXTURE5: js.Number = ???
  def TEXTURE6: js.Number = ???
  def TEXTURE7: js.Number = ???
  def TEXTURE8: js.Number = ???
  def TEXTURE9: js.Number = ???
  def TEXTURE10: js.Number = ???
  def TEXTURE11: js.Number = ???
  def TEXTURE12: js.Number = ???
  def TEXTURE13: js.Number = ???
  def TEXTURE14: js.Number = ???
  def TEXTURE15: js.Number = ???
  def TEXTURE16: js.Number = ???
  def TEXTURE17: js.Number = ???
  def TEXTURE18: js.Number = ???
  def TEXTURE19: js.Number = ???
  def TEXTURE20: js.Number = ???
  def TEXTURE21: js.Number = ???
  def TEXTURE22: js.Number = ???
  def TEXTURE23: js.Number = ???
  def TEXTURE24: js.Number = ???
  def TEXTURE25: js.Number = ???
  def TEXTURE26: js.Number = ???
  def TEXTURE27: js.Number = ???
  def TEXTURE28: js.Number = ???
  def TEXTURE29: js.Number = ???
  def TEXTURE30: js.Number = ???
  def TEXTURE31: js.Number = ???
  def ACTIVE_TEXTURE: js.Number = ???
    
  /* TextureWrapMode */
  def REPEAT: js.Number = ???
  def CLAMP_TO_EDGE: js.Number = ???
  def MIRRORED_REPEAT: js.Number = ???
    
  /* Uniform Types */
  def FLOAT_VEC2: js.Number = ???
  def FLOAT_VEC3: js.Number = ???
  def FLOAT_VEC4: js.Number = ???
  def INT_VEC2: js.Number = ???
  def INT_VEC3: js.Number = ???
  def INT_VEC4: js.Number = ???
  def BOOL: js.Number = ???
  def BOOL_VEC2: js.Number = ???
  def BOOL_VEC3: js.Number = ???
  def BOOL_VEC4: js.Number = ???
  def FLOAT_MAT2: js.Number = ???
  def FLOAT_MAT3: js.Number = ???
  def FLOAT_MAT4: js.Number = ???
  def SAMPLER_2D: js.Number = ???
  def SAMPLER_CUBE: js.Number = ???
    
  /* Vertex Arrays */
  def VERTEX_ATTRIB_ARRAY_ENABLED: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_SIZE: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_STRIDE: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_TYPE: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_NORMALIZED: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_POINTER: js.Number = ???
  def VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: js.Number = ???
    
  /* Shader Source */
  def COMPILE_STATUS: js.Number = ???
    
  /* Shader Precision-Specified Types */
  def LOW_FLOAT: js.Number = ???
  def MEDIUM_FLOAT: js.Number = ???
  def HIGH_FLOAT: js.Number = ???
  def LOW_INT: js.Number = ???
  def MEDIUM_INT: js.Number = ???
  def HIGH_INT: js.Number = ???
    
  /* Framebuffer Object. */
  def FRAMEBUFFER: js.Number = ???
  def RENDERBUFFER: js.Number = ???
    
  def RGBA4: js.Number = ???
  def RGB5_A1: js.Number = ???
  def RGB565: js.Number = ???
  def DEPTH_COMPONENT16: js.Number = ???
  def STENCIL_INDEX: js.Number = ???
  def STENCIL_INDEX8: js.Number = ???
  def DEPTH_STENCIL: js.Number = ???
    
  def RENDERBUFFER_WIDTH: js.Number = ???
  def RENDERBUFFER_HEIGHT: js.Number = ???
  def RENDERBUFFER_INTERNAL_FORMAT: js.Number = ???
  def RENDERBUFFER_RED_SIZE: js.Number = ???
  def RENDERBUFFER_GREEN_SIZE: js.Number = ???
  def RENDERBUFFER_BLUE_SIZE: js.Number = ???
  def RENDERBUFFER_ALPHA_SIZE: js.Number = ???
  def RENDERBUFFER_DEPTH_SIZE: js.Number = ???
  def RENDERBUFFER_STENCIL_SIZE: js.Number = ???
    
  def FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: js.Number = ???
  def FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: js.Number = ???
  def FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: js.Number = ???
  def FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: js.Number = ???
    
  def COLOR_ATTACHMENT0: js.Number = ???
  def DEPTH_ATTACHMENT: js.Number = ???
  def STENCIL_ATTACHMENT: js.Number = ???
  def DEPTH_STENCIL_ATTACHMENT: js.Number = ???
    
  def NONE: js.Number = ???
    
  def FRAMEBUFFER_COMPLETE: js.Number = ???
  def FRAMEBUFFER_INCOMPLETE_ATTACHMENT: js.Number = ???
  def FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: js.Number = ???
  def FRAMEBUFFER_INCOMPLETE_DIMENSIONS: js.Number = ???
  def FRAMEBUFFER_UNSUPPORTED: js.Number = ???
    
  def FRAMEBUFFER_BINDING: js.Number = ???
  def RENDERBUFFER_BINDING: js.Number = ???
  def MAX_RENDERBUFFER_SIZE: js.Number = ???
    
  def INVALID_FRAMEBUFFER_OPERATION: js.Number = ???
    
  /* WebGL-specific enums */
  def UNPACK_FLIP_Y_WEBGL: js.Number = ???
  def UNPACK_PREMULTIPLY_ALPHA_WEBGL: js.Number = ???
  def CONTEXT_LOST_WEBGL: js.Number = ???
  def UNPACK_COLORSPACE_CONVERSION_WEBGL: js.Number = ???
  def BROWSER_DEFAULT_WEBGL: js.Number = ???    
}

class WebGLRenderingContext extends js.Object {
  /* ClearBufferMask */
  var canvas: HTMLCanvasElement = ???
  var drawingBufferWidth: js.Number = ???
  var drawingBufferHeight: js.Number = ???
  
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

  // WebGLHandlesContextLoss
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
  
  // TODO: these are weird.
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
  // TODO: We need HTMLVideoElement!
  //def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

  def texParameterf(target: js.Number, pname: js.Number, param: js.Number): Unit = ???
  def texParameteri(target: js.Number, pname: js.Number, param: js.Number): Unit = ???

  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, `type`: js.Number, pixels: ArrayBufferView): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: ImageData): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLImageElement): Unit = ???
  def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLCanvasElement): Unit = ???
  // TODO: We need HTMLVideoElement!
  // def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, `type`: js.Number, pixels: HTMLVideoElement): Unit = ???

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