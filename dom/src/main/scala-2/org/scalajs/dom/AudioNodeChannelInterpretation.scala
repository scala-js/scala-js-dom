/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
/** Represents an enumerated value describing how input channels are mapped to output channels when the number of
  * inputs/outputs is different. For example, this setting defines how a mono input will be up-mixed to a stereo or 5.1
  * channel output, or how a quad channel input will be down-mixed to a stereo or mono output.
  */
sealed trait AudioNodeChannelInterpretation extends js.Any

object AudioNodeChannelInterpretation {

  /** Use set of "standard" mappings for combinations of common speaker input and outputs setups (mono, stereo, quad,
    * 5.1). For example, with this setting a mono channel input will output to both channels of a stereo output.
    */
  val speakers: AudioNodeChannelInterpretation = "speakers".asInstanceOf[AudioNodeChannelInterpretation]

  /** Input channels are mapped to output channels in order. If there are more inputs that outputs the additional inputs
    * are dropped; if there are fewer than the unused outputs are silent.
    */
  val discrete: AudioNodeChannelInterpretation = "discrete".asInstanceOf[AudioNodeChannelInterpretation]
}
