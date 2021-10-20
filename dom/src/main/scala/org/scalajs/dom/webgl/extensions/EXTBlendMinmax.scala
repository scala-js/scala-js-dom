package org.scalajs.dom.webgl.extensions

import scala.scalajs.js

/** Extends `blendEquation` to support `MIN_EXT` and `MAX_EXT`. (Khronos Extension)
  *
  * @see
  *   https://www.khronos.org/registry/webgl/extensions/EXT_blend_minmax/
  */
@js.native
trait EXTBlendMinmax extends js.Object {
  val MIN_EXT: Int = js.native
  val MAX_EXT: Int = js.native
}
