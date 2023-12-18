/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait MediaElementAudioSourceNodeOptions extends js.Object {

  /** An HTMLMediaElement that will be used as the source for the audio. */
  var mediaElement: HTMLMediaElement

  /** An integer used to determine how many channels are used when up-mixing and down-mixing connections to any inputs
    * to the node. (See AudioNode.channelCount for more information.) Its usage and precise definition depend on the
    * value of channelCountMode.
    */
  var channelCount: js.UndefOr[Int] = js.undefined

  /** Describes the way channels must be matched between the node's inputs and outputs. (See AudioNode.channelCountMode
    * for more information including default values.)
    */
  var channelCountMode: js.UndefOr[AudioNodeChannelCountMode] = js.undefined

  /** Describes the meaning of the channels. This interpretation will define how audio up-mixing and down-mixing will
    * happen. The possible values are "speakers" or "discrete". (See AudioNode.channelInterpretation for more
    * information including default values.)
    */
  var channelInterpretation: js.UndefOr[AudioNodeChannelInterpretation] = js.undefined
}
