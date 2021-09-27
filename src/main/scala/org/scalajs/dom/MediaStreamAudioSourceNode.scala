/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The MediaStreamAudioSourceNode interface represents an audio source consisting of a WebRTC MediaStream (such as a
  * webcam or microphone). It is an AudioNode that acts as an audio source.
  *
  * A MediaElementSourceNode has no inputs and exactly one output, and is created using the
  * AudioContext.createMediaStreamSource method. The amount of channels in the output equals the number of channels in
  * AudioMediaStreamTrack. If there is no valid media stream, then the number of output channels will be one silent
  * channel.
  *
  *   - Number of inputs: 0
  *   - Number of outputs: 1
  *   - Channel count: defined by the AudioMediaStreamTrack passed to the AudioContext.createMediaStreamSource method
  *     that created it.
  */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode
