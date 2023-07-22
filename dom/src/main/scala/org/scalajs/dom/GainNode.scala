/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The GainNode interface represents a change in volume. It is an AudioNode audio-processing module that causes a given
  * gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input
  * and one output, both with the same number of channels.
  *
  * The gain is a unitless value, changing with time, that is multiplied to each corresponding sample of all input
  * channels. If modified, the new gain is applied using a de-zippering algorithm in order to prevent unaesthetic
  * 'clicks' from appearing in the resulting audio.
  *
  * The GainNode is increasing the gain of the output.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@JSGlobal
@js.native
class GainNode(context: BaseAudioContext, options: GainNodeOptions = js.native) extends AudioNode {

  /** Is an a-rate AudioParam representing the amount of gain to apply. */
  val gain: AudioParam = js.native
}
