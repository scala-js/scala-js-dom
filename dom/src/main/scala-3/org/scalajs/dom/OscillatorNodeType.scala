/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

opaque type OscillatorNodeType <: String = String

object OscillatorNodeType {

  /** A sine wave. This is the default value. */
  val sine: OscillatorNodeType = "sine"

  /** A square wave with a duty cycle of 0.5; that is, the signal is "high" for half of each period. */
  val square: OscillatorNodeType = "square"

  /** A sawtooth wave. */
  val sawtooth: OscillatorNodeType = "sawtooth"

  /** A triangle wave. */
  val triangle: OscillatorNodeType = "triangle"

  /** A custom waveform. You never set type to custom manually; instead, use the setPeriodicWave() method to provide the
    * data representing the waveform. Doing so automatically sets the type to custom.
    */
  val custom: OscillatorNodeType = "custom"
}
