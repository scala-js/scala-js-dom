/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait GamepadMappingType extends js.Any

object GamepadMappingType {
  final val `unknown`: GamepadMappingType = "".asInstanceOf[GamepadMappingType]

  final val `standard`: GamepadMappingType = "standard".asInstanceOf[GamepadMappingType]
}
