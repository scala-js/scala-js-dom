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
trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: Int = js.native
}

@js.native
@JSGlobal
object SVGZoomAndPan extends js.Object {
  val SVG_ZOOMANDPAN_MAGNIFY: Int = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Int = js.native
  val SVG_ZOOMANDPAN_DISABLE: Int = js.native
}
