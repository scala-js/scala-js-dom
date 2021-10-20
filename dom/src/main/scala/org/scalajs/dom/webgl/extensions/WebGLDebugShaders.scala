package org.scalajs.dom.webgl.extensions

import org.scalajs.dom.WebGLShader
import scala.scalajs.js

/** Inspect the transpilation output of GLSL onto the underlying shader language. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_shaders/
  */
@js.native
trait WebGLDebugShaders extends js.Object {
  def getTranslatedShaderSource(shader: WebGLShader): String = js.native
}
