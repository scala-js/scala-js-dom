/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait OscillatorNodeOptions extends js.Object {

  /** The shape of the wave produced by the node. Valid values are 'sine', 'square', 'sawtooth', 'triangle' and
    * 'custom'. The default is 'sine'.
    */
  var `type`: js.UndefOr[OscillatorNodeType] = js.undefined

  /** A detuning value (in cents) which will offset the frequency by the given amount. Its default is 0. */
  var detune: js.UndefOr[Double] = js.undefined

  /** The frequency (in hertz) of the periodic waveform. Its default is 440. */
  var frequency: js.UndefOr[Double] = js.undefined

  /** An arbitrary period waveform described by a PeriodicWave object. */
  var periodicWave: js.UndefOr[PeriodicWave] = js.undefined

  /** Represents an integer used to determine how many channels are used when up-mixing and down-mixing connections to
    * any inputs to the node. (See AudioNode.channelCount for more information.) Its usage and precise definition depend
    * on the value of channelCountMode.
    */
  var channelCount: js.UndefOr[Int] = js.undefined

  /** Represents an enumerated value describing the way channels must be matched between the node's inputs and outputs.
    * (See AudioNode.channelCountMode for more information including default values.)
    */
  var channelCountMode: js.UndefOr[AudioNodeChannelCountMode] = js.undefined

  /** Represents an enumerated value describing the meaning of the channels. This interpretation will define how audio
    * up-mixing and down-mixing will happen. The possible values are "speakers" or "discrete". (See
    * AudioNode.channelCountMode for more information including default values.)
    */
  var channelInterpretation: js.UndefOr[AudioNodeChannelInterpretation] = js.undefined
}
