package org.scalajs
package dom.experimental

import scala.language.implicitConversions

package object gamepad {

  @deprecated("use dom.GamepadMappingType instead", "2.0.0")
  type GamepadMappingType = dom.GamepadMappingType

  @deprecated("use dom.GamepadButton instead", "2.0.0")
  type GamepadButton = dom.GamepadButton

  @deprecated("use dom.Gamepad instead", "2.0.0")
  type Gamepad = dom.Gamepad

  @deprecated("use dom.GamepadEventInit instead", "2.0.0")
  type GamepadEventInit = dom.GamepadEventInit

  @deprecated("use dom.GamepadEvent instead", "2.0.0")
  type GamepadEvent = dom.GamepadEvent

  @deprecated("use dom.Navigator instead", "2.0.0")
  type GamepadNavigator = dom.Navigator

  @deprecated("use dom.Navigator directly instead", "2.0.0")
  implicit def toGamepad(navigator: dom.Navigator): GamepadNavigator =
    navigator

  @deprecated("use dom.GamepadMappingType.`unknown` instead", "2.0.0")
  def `unknown`: dom.GamepadMappingType = dom.GamepadMappingType.`unknown`

  @deprecated("use dom.GamepadMappingType.`standard` instead", "2.0.0")
  def `standard`: dom.GamepadMappingType = dom.GamepadMappingType.`standard`
}
