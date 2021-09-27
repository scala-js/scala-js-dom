package org.scalajs.dom.experimental.webgl.extensions

import scala.scalajs.js

/** Provides timing support to enable profiling of GL calls. (Community Extension)
  *
  * @see
  *   https://www.khronos.org/registry/gles/extensions/EXT/EXT_disjoint_timer_query.txt
  */
@js.native
trait EXTDisjointTimerQuery extends js.Object {
  val QUERY_COUNTER_BITS_EXT: Int = js.native
  val CURRENT_QUERY_EXT: Int = js.native
  val QUERY_RESULT_EXT: Int = js.native
  val QUERY_RESULT_AVAILABLE_EXT: Int = js.native
  val TIME_ELAPSED_EXT: Int = js.native
  val TIMESTAMP_EXT: Int = js.native
  val GPU_DISJOINT_EXT: Int = js.native

  def createQueryEXT(): WebGLTimerQueryEXT = js.native
  def deleteQueryEXT(query: WebGLTimerQueryEXT): Unit = js.native
  def isQueryEXT(query: WebGLTimerQueryEXT): Boolean = js.native
  def beginQueryEXT(target: Int, query: WebGLTimerQueryEXT): Unit = js.native
  def endQueryEXT(target: Int): Unit = js.native
  def queryCounterEXT(query: WebGLTimerQueryEXT, target: Int): Unit = js.native
  def getQueryEXT(target: Int, pname: Int): js.Any = js.native
  def getQueryObjectEXT(target: Int, pname: Int): js.Any = js.native
}
