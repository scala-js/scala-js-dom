/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package org.scalajs.dom.experimental.gamepad

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom
import org.scalajs.dom.raw.EventInit

@js.native
trait GamepadMappingType extends js.Any

/**
 * Represents the state of a button.
 */
trait GamepadButton extends js.Any {

  /**
   * True if the button is pressed, false otherwise.
   */
  val pressed: Boolean

  /**
   * The value of this gamepad button, 0 is fully unpressed, 1 is
   * fully pressed.
   */
  val value: Double
}

/**
 * Represents the state of a connected gamepad device.
 */
trait Gamepad extends js.Any {

  /** The identification string for the gamepad. */
  val id: String

  /** The index of the gamepad as returned by Navigator.getGamepads */
  val index: Double

  /** True if this gamepad is currently connected. */
  val connected: Boolean

  /** Last time the data for this gamepad was updated. */
  val timestamp: Double

  /**
   * An array containing the state of all of the gamepad's axes, from
   * -1 .. 1.
   */
  val axes: js.Array[Double]

  /**
   * The current state of all the gamepad's buttons.
   */
  val buttons: js.Array[GamepadButton]

  /**
   * The layout of the gamepad.  Either "standard" or unknown ("").
   */
  val mapping: GamepadMappingType
}

trait GamepadEventInit extends EventInit {
  var gamepad: js.UndefOr[Gamepad]
}

@JSGlobal("GamepadEvent")
@js.native
class GamepadEvent(typeArg: String,
    init: js.UndefOr[GamepadEventInit] = js.undefined)
    extends dom.Event(typeArg, init) {
  val gamepad: Gamepad = js.native
}

@js.native
trait GamepadNavigator extends js.Any {
  def getGamepads(): js.Array[Gamepad] = js.native
}
