/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The BiquadFilterNode interface represents a simple low-order filter, and is created using the
  * AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone
  * control devices, and graphic equalizers. A BiquadFilterNode always has exactly one input and one output.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@js.native
trait BiquadFilterNode extends AudioNode {

  /** Is a k-rate AudioParam, a double representing a frequency in the current filtering algorithm measured in hertz
    * (Hz).
    */
  val frequency: AudioParam = js.native

  /** Is an a-rate AudioParam representing detuning of the frequency in cents. */
  val detune: AudioParam = js.native

  /** Is a k-rate AudioParam, a double representing a Q factor, or quality factor. */
  val Q: AudioParam = js.native

  /** Is a k-rate AudioParam, a double representing the gain used in the current filtering algorithm. */
  val gain: AudioParam = js.native

  /** Is a string value defining the kind of filtering algorithm the node is implementing. */
  var `type`: String = js.native

  /** From the current filter parameter settings this method calculates the frequency response for frequencies specified
    * in the provided array of frequencies.
    *
    * @param frequencyHz
    *   A Float32Array containing hertz values that you want the frequency response for.
    * @param magResponse
    *   A Float32Array that will contain the outputted magnitude of the frequency response for each inputted frequency
    *   (hertz) value. The magnitude values are unitless.
    * @param phaseResponse
    *   A Float32Array that will contain the outputted phase of the frequency response for each inputted frequency
    *   (hertz) value, measured in radians.
    */
  def getFrequencyResponse(frequencyHz: js.typedarray.Float32Array, magResponse: js.typedarray.Float32Array,
      phaseResponse: js.typedarray.Float32Array): Unit = js.native
}
