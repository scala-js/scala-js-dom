/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The MediaElementAudioSourceNode interface represents an audio destination consisting of a WebRTC MediaStream with a
  * single AudioMediaStreamTrack, which can be used in a similar way to a MediaStream obtained from
  * Navigator.getUserMedia.
  *
  * It is an AudioNode that acts as an audio destination, created using the AudioContext.createMediaStreamDestination
  * method.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 0
  *   - Channel count: 2
  *   - Channel count mode: "explicit"
  *   - Channel count interpretation: "speakers"
  */
@js.native
trait MediaStreamAudioDestinationNode extends AudioNode {

  /** Is a MediaStream containing a single AudioMediaStreamTrack with the same number of channels as the node itself.
    * You can use this property to get a stream out of the audio graph and feed it into another construct, such as a
    * Media Recorder.
    */
  var stream: MediaStream = js.native
}
