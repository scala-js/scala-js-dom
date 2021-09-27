package org.scalajs.dom.experimental.webgl.extensions

import scala.scalajs.js

/** Provides Vertex Array Objects (VAOs). (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/
  */
@js.native
trait OESVertexArrayObject extends js.Object {
  val VERTEX_ARRAY_BINDING_OES: Int = js.native
  def createVertexArrayOES(): WebGLVertexArrayObjectOES = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Boolean = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
}
