/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait OscillatorNodeType extends js.Any

object OscillatorNodeType {
  val sine: OscillatorNodeType = "sine".asInstanceOf[OscillatorNodeType]
  val square: OscillatorNodeType = "square".asInstanceOf[OscillatorNodeType]
  val sawtooth: OscillatorNodeType = "sawtooth".asInstanceOf[OscillatorNodeType]
  val triangle: OscillatorNodeType = "triangle".asInstanceOf[OscillatorNodeType]
  val custom: OscillatorNodeType = "custom".asInstanceOf[OscillatorNodeType]
}
