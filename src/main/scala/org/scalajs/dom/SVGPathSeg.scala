/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class SVGPathSeg extends js.Object {
  def pathSegType: Int = js.native

  def pathSegTypeAsLetter: String = js.native
}

@js.native
@JSGlobal
object SVGPathSeg extends js.Object {

  val PATHSEG_MOVETO_REL: Int = js.native
  val PATHSEG_LINETO_VERTICAL_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_ABS: Int = js.native
  val PATHSEG_LINETO_HORIZONTAL_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_ABS: Int = js.native
  val PATHSEG_LINETO_ABS: Int = js.native
  val PATHSEG_CLOSEPATH: Int = js.native
  val PATHSEG_LINETO_HORIZONTAL_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Int = js.native
  val PATHSEG_LINETO_REL: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Int = js.native
  val PATHSEG_ARC_REL: Int = js.native
  val PATHSEG_CURVETO_CUBIC_REL: Int = js.native
  val PATHSEG_UNKNOWN: Int = js.native
  val PATHSEG_LINETO_VERTICAL_ABS: Int = js.native
  val PATHSEG_ARC_ABS: Int = js.native
  val PATHSEG_MOVETO_ABS: Int = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Int = js.native
}
