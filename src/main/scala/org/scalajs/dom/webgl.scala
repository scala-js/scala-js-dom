package org.scalajs.dom

/**
 * Short aliases of all the dom.WebGLThing classes
 */
object webgl {
  type ActiveInfo = raw.WebGLActiveInfo
  type Buffer = raw.WebGLBuffer
  type ContextAttributes = raw.WebGLContextAttributes
  type Framebuffer = raw.WebGLFramebuffer
  type Program = raw.WebGLProgram
  type Renderbuffer = raw.WebGLRenderbuffer
  type RenderingContext = raw.WebGLRenderingContext
  type Shader = raw.WebGLShader
  type ShaderPrecisionFormat = raw.WebGLShaderPrecisionFormat
  type Texture = raw.WebGLTexture
  type UniformLocation = raw.WebGLUniformLocation
  @inline def RenderingContext = raw.WebGLRenderingContext
}
