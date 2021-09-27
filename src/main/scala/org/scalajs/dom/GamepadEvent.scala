/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSGlobal("GamepadEvent")
@js.native
class GamepadEvent(typeArg: String, init: js.UndefOr[GamepadEventInit] = js.undefined) extends Event(typeArg, init) {
  val gamepad: Gamepad = js.native
}
