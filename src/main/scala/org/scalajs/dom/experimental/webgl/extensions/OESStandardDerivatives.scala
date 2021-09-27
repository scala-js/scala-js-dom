package org.scalajs.dom.experimental.webgl.extensions

import org.scalajs.dom.WebGLShader
import scala.scalajs.js

/** Provides additional first derivative information in fragment shaders. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/OES_standard_derivatives/
  */
@js.native
trait OESStandardDerivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: Int = js.native
}
