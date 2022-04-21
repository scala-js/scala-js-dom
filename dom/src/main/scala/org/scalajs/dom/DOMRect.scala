/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A DOMRect describes the size and position of a rectangle. */
@js.native
@JSGlobal
class DOMRect extends DOMRectReadOnly {
  def width_=(width: Double): Unit = js.native
  def height_=(height: Double): Unit = js.native
  def x_=(x: Double): Unit = js.native
  def y_=(y: Double): Unit = js.native
}
