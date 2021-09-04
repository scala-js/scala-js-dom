package org.scalajs.dom.experimental

import org.scalajs.dom
import scala.language.implicitConversions

/** Implements the Gamepad API.
  *
  * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
  */
package object gamepad {

  implicit def toGamepad(navigator: dom.Navigator): GamepadNavigator =
    navigator.asInstanceOf[GamepadNavigator]

  final val `unknown`: GamepadMappingType = "".asInstanceOf[GamepadMappingType]

  final val `standard`: GamepadMappingType = "standard".asInstanceOf[GamepadMappingType]
}
