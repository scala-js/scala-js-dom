/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The PositionError interface represents the reason of an error occuring when using the geolocating device. */
@js.native
trait PositionError extends js.Object {

  /** Returns an unsigned short representing the error code. The following values are possible: Value Associated
    * constant Description 1 PERMISSION_DENIED The acquisition of the geolocation information failed because the page
    * didn't had the permission to do it. 2 POSITION_UNAVAILABLE The acquisition of the geolocation failed because one
    * or several internal source of position returned an internal error. 3 TIMEOUT The time allowed to acquire the
    * geolocation, defined by PositionOptions.timeout information was reached before the information was obtained.
    */
  def code: Int = js.native

  /** The PositionError.message read-only property returns a human-readable DOMString describing the details of the
    * error.
    */
  def message: String = js.native
}

@js.native
@JSGlobal
object PositionError extends js.Object {

  val POSITION_UNAVAILABLE: Int = js.native
  val PERMISSION_DENIED: Int = js.native
  val TIMEOUT: Int = js.native
}
