package org.scalajs.dom

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js

package object webgl {
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

  implicit class WebGLRenderingContextOps(val webGL: WebGLRenderingContext)
      extends AnyVal {

    /**
     * Returns the WebGL extension for the given identifier, if present on this browser.
     *
     * @param id the identifier singleton.
     * @tparam T The type of the result for this extension.
     * @return `Some(extension)` or `None`
     */
    def getExtension[T](id: WebGLExtensionIdentifier[T]): js.UndefOr[T] =
      webGL.getExtension(id.value).asInstanceOf[js.UndefOr[T]]
  }
}
