/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The MediaElementAudioSourceNode interface represents an audio source consisting of an HTML5 &lt;audio&gt; or
  * &lt;video&gt; element. It is an AudioNode that acts as an audio source.
  *
  * A MediaElementSourceNode has no inputs and exactly one output, and is created using the
  * AudioContext.createMediaElementSource method. The amount of channels in the output equals the number of channels of
  * the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has
  * no audio.
  *
  *   - Number of inputs: 0
  *   - Number of outputs: 1
  *   - Channel count: defined by the media in the HTMLMediaElement passed to the AudioContext.createMediaElementSource
  *     method that created it.
  */
@js.native
trait MediaElementAudioSourceNode extends AudioNode {
  val mediaElement: HTMLMediaElement = js.native
}

object MediaElementAudioSourceNode {

  import js.`|`.undefOr2jsAny

  def apply(context: BaseAudioContext,
      options: js.UndefOr[MediaElementAudioSourceNodeOptions] = js.undefined): MediaElementAudioSourceNode = {
    js.Dynamic
      .newInstance(js.Dynamic.global.MediaElementAudioSourceNode)(context, options)
      .asInstanceOf[MediaElementAudioSourceNode]
  }
}
