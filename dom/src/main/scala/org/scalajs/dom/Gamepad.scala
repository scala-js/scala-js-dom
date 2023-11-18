/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package org.scalajs.dom

import scala.scalajs.js

/** Represents the state of a connected gamepad device. */
trait Gamepad extends js.Any {

  /** The identification string for the gamepad. */
  val id: String

  /** The index of the gamepad as returned by Navigator.getGamepads */
  val index: Double

  /** True if this gamepad is currently connected. */
  val connected: Boolean

  /** Last time the data for this gamepad was updated. */
  val timestamp: Double

  /** An array containing the state of all of the gamepad's axes, from -1 .. 1.
    */
  val axes: js.Array[Double]

  /** The current state of all the gamepad's buttons. */
  val buttons: js.Array[GamepadButton]

  /** The layout of the gamepad. Either "standard" or unknown (""). */
  val mapping: GamepadMappingType
}
