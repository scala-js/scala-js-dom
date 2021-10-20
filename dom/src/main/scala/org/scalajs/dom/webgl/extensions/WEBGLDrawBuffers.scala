package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Enables multiple draw buffer support. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/
  */
@js.native
trait WEBGLDrawBuffers extends js.Object {
  val COLOR_ATTACHMENT0_WEBGL: Int = js.native
  val COLOR_ATTACHMENT1_WEBGL: Int = js.native
  val COLOR_ATTACHMENT2_WEBGL: Int = js.native
  val COLOR_ATTACHMENT3_WEBGL: Int = js.native
  val COLOR_ATTACHMENT4_WEBGL: Int = js.native
  val COLOR_ATTACHMENT5_WEBGL: Int = js.native
  val COLOR_ATTACHMENT6_WEBGL: Int = js.native
  val COLOR_ATTACHMENT7_WEBGL: Int = js.native
  val COLOR_ATTACHMENT8_WEBGL: Int = js.native
  val COLOR_ATTACHMENT9_WEBGL: Int = js.native
  val COLOR_ATTACHMENT10_WEBGL: Int = js.native
  val COLOR_ATTACHMENT11_WEBGL: Int = js.native
  val COLOR_ATTACHMENT12_WEBGL: Int = js.native
  val COLOR_ATTACHMENT13_WEBGL: Int = js.native
  val COLOR_ATTACHMENT14_WEBGL: Int = js.native
  val COLOR_ATTACHMENT15_WEBGL: Int = js.native

  val DRAW_BUFFER0_WEBGL: Int = js.native
  val DRAW_BUFFER1_WEBGL: Int = js.native
  val DRAW_BUFFER2_WEBGL: Int = js.native
  val DRAW_BUFFER3_WEBGL: Int = js.native
  val DRAW_BUFFER4_WEBGL: Int = js.native
  val DRAW_BUFFER5_WEBGL: Int = js.native
  val DRAW_BUFFER6_WEBGL: Int = js.native
  val DRAW_BUFFER7_WEBGL: Int = js.native
  val DRAW_BUFFER8_WEBGL: Int = js.native
  val DRAW_BUFFER9_WEBGL: Int = js.native
  val DRAW_BUFFER10_WEBGL: Int = js.native
  val DRAW_BUFFER11_WEBGL: Int = js.native
  val DRAW_BUFFER12_WEBGL: Int = js.native
  val DRAW_BUFFER13_WEBGL: Int = js.native
  val DRAW_BUFFER14_WEBGL: Int = js.native
  val DRAW_BUFFER15_WEBGL: Int = js.native

  val MAX_COLOR_ATTACHMENTS_WEBGL: Int = js.native
  val MAX_DRAW_BUFFERS_WEBGL: Int = js.native

  def drawBuffersWEBGL(buffers: js.Array[Int]): Unit = js.native
}
