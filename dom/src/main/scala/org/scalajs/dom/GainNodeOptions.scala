/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait GainNodeOptions extends js.Object {

  /** The amount of gain to apply. This parameter is a- rate and it's nominal range is (-∞,+∞). The default is 1 */
  var gain: js.UndefOr[Double] = js.undefined

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
