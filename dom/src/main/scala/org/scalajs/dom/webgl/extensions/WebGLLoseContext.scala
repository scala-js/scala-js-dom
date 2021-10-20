package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Allows simulation of losing the WebGL context to aid debugging. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/
  */
@js.native
trait WebGLLoseContext extends js.Object {
  def loseContext(): Unit = js.native

  def restoreContext(): Unit = js.native
}
