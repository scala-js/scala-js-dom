/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The AudioDestinationNode interface represents the end destination of an audio graph in a given context — usually the
  * speakers of your device. It can also be the node that will "record" the audio data when used with an
  * OfflineAudioContext.
  *
  * AudioDestinationNode has no output (as it is the output, no more AudioNode can be linked after it in the audio
  * graph) and one input. The amount of channels in the input must be between 0 and the maxChannelCount value or an
  * exception is raised.
  *
  * The AudioDestinationNode of a given AudioContext can be retrieved using the AudioContext.destination property.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 0
  *   - Channel count mode: "explicit"
  *   - Channel count: 2
  *   - Channel interpretation: "speakers"
  */
@js.native
trait AudioDestinationNode extends AudioNode {

  /** Is an unsigned long defining the maximum amount of channels that the physical device can handle. */
  var maxChannelCount: Int = js.native
}
