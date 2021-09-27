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
trait SVGException extends js.Object {
  def code: Int = js.native

  def message: String = js.native

  def name: String = js.native
}

@js.native
@JSGlobal
object SVGException extends js.Object {
  val SVG_MATRIX_NOT_INVERTABLE: Int = js.native
  val SVG_WRONG_TYPE_ERR: Int = js.native
  val SVG_INVALID_VALUE_ERR: Int = js.native
}
