/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait NavigatorVibration extends js.Object {

  /** Vibrate the device for the specified number of milliseconds. */
  def vibrate(duration: Double): Boolean = js.native

  /** Vibrate the device in the given pattern.
    *
    * @param pattern
    *   the pattern to vibrate. The first number is the initial duration, the subsequent a delay of silence, and so on.
    */
  def vibrate(pattern: js.Array[Double]): Boolean = js.native
}
