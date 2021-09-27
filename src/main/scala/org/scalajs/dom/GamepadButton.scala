/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Represents the state of a button. */
trait GamepadButton extends js.Any {

  /** True if the button is pressed, false otherwise. */
  val pressed: Boolean

  /** The value of this gamepad button, 0 is fully unpressed, 1 is fully pressed. */
  val value: Double
}
