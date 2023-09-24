/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The OscillatorNode interface represents a periodic waveform, like a sine wave. It is an AudioNode audio-processing
  * module that causes a given frequency of sine wave to be created — in effect, a constant tone.
  *
  * An OscillatorNode is created using the AudioContext.createOscillator method. It always has exactly one output and no
  * inputs, both with the same amount of channels. Its basic property defaults (see AudioNode for definitions) are:
  *
  *   - Number of inputs: 0
  *   - Number of outputs: 1
  *   - Channel count mode: max
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: speakers
  */
@js.native
trait OscillatorNode extends AudioScheduledSourceNode {

  /** An a-rate AudioParam representing the frequency of oscillation in hertz (though the AudioParam returned is
    * read-only, the value it represents is not.)
    */
  var frequency: AudioParam = js.native

  /** An a-rate AudioParam representing detuning of oscillation in cents (though the AudioParam returned is read-only,
    * the value it represents is not.)
    */
  var detune: AudioParam = js.native

  /** Represents the shape of the oscillator wave generated. Different waves will produce different tones. */
  var `type`: OscillatorNodeType = js.native // Not sure if this is correct ...

  /** Used to point to a PeriodicWave defining a periodic waveform that can be used to shape the oscillator's output,
    * when type = "custom" is used.
    *
    * This replaces the now-obsolete OscillatorNode.setWaveTable.
    */
  def setPeriodicWave(wave: PeriodicWave): Unit = js.native
}

object OscillatorNode {

  import js.`|`.undefOr2jsAny

  def apply(context: BaseAudioContext, options: js.UndefOr[OscillatorNodeOptions] = js.undefined): OscillatorNode =
    js.Dynamic.newInstance(js.Dynamic.global.OscillatorNode)(context, options).asInstanceOf[OscillatorNode]
}
