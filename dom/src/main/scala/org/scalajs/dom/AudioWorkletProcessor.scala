/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
abstract class AudioWorkletProcessor(options: AudioWorkletProcessorOptions) extends js.Object {

  /** The [[MessagePort]] object that is connecting the [[AudioWorkletProcessor]] and the associated
    * [[AudioWorkletNode]].
    */
  val port: MessagePort = js.native

  /** Implements the audio processing algorithm for the audio processor worklet.
    *
    * The method is called synchronously from the audio rendering thread, once for each block of audio (also known as a
    * rendering quantum) being directed through the processor's corresponding AudioWorkletNode. In other words, every
    * time a new block of audio is ready for your processor to manipulate, your process() function is invoked to do so.
    * @param inputs
    *   An array of inputs connected to the node, each item of which is, in turn, an array of channels. Each channel is
    *   a Float32Array containing 128 samples. For example, inputs[n][m][i] will access n-th input, m-th channel of that
    *   input, and i-th sample of that channel. Each sample value is in range of [-1 .. 1]. The number of inputs and
    *   thus the length of that array is fixed at the construction of the node (see AudioWorkletNode). If there is no
    *   active node connected to the n-th input of the node, inputs[n] will be an empty array (zero input channels
    *   available). The number of channels in each input may vary, depending on channelCount and channelCountMode
    *   properties.
    * @param outputs
    *   An array of outputs that is similar to the inputs parameter in structure. It is intended to be filled during the
    *   execution of the process() method. Each of the output channels is filled with zeros by default — the processor
    *   will output silence unless the output arrays are modified.
    * @param parameters
    *   An object containing string keys and Float32Array values. For each custom AudioParam defined using the
    *   parameterDescriptors getter, the key in the object is a name of that AudioParam, and the value is a
    *   Float32Array. The values of the array are calculated by taking scheduled automation events into consideration.
    *   If the automation rate of the parameter is "a-rate", the array will contain 128 values — one for each frame in
    *   the current audio block. If there's no automation happening during the time represented by the current block,
    *   the array may contain a single value that is constant for the entire block, instead of 128 identical values. If
    *   the automation rate is "k-rate", the array will contain a single value, which is to be used for each of 128
    *   frames.
    * @return
    *   A Boolean value indicating whether or not to force the AudioWorkletNode to remain active even if the user
    *   agent's internal logic would otherwise decide that it's safe to shut down the node.
    */
  def process(inputs: js.Array[js.Array[js.typedarray.Float32Array]],
      outputs: js.Array[js.Array[js.typedarray.Float32Array]], parameters: js.Object): Boolean

}
