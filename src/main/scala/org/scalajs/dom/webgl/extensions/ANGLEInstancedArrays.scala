package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Enables array instancing (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/
  */
@js.native
trait ANGLEInstancedArrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: Int = js.native

  def drawArraysInstancedANGLE(mode: Int, first: Int, count: Int, primcount: Int): Unit = js.native

  def drawElementsInstancedANGLE(mode: Int, count: Int, `type`: Int, offset: Int, primcount: Int): Unit = js.native

  def vertexAttribDivisorANGLE(index: Int, divisor: Int): Unit = js.native
}
