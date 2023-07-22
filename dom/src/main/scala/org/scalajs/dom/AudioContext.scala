/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The AudioContext interface represents an audio-processing graph built from audio modules linked together, each
  * represented by an AudioNode. An audio context controls both the creation of the nodes it contains and the execution
  * of the audio processing, or decoding. You need to create an AudioContext before you do anything else, as everything
  * happens inside a context.
  *
  * An AudioContext can be a target of events, therefore it implements the EventTarget interface.
  */
@js.native
@JSGlobal
class AudioContext extends BaseAudioContext {

  // Returns the number of seconds of processing latency incurred by the AudioContext passing the audio from the AudioDestinationNode to the aud  io subsystem.
  def baseLatency: Double = js.native

  /** Returns an estimation of the output latency of the current audio context. */
  def outputLatency: Double = js.native

  /** Creates a MediaElementAudioSourceNode associated with an HTMLMediaElement. This can be used to play and manipulate
    * audio from &lt;video&gt; or &lt;audio&gt; elements.
    *
    * @param myMediaElement
    *   An HTMLMediaElement object that you want to feed into an audio processing graph to manipulate.
    */
  def createMediaElementSource(myMediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native

  /** Creates a MediaStreamAudioSourceNode associated with a MediaStream representing an audio stream which may come
    * from the local computer microphone or other sources.
    *
    * @param stream
    *   A MediaStream object that you want to feed into an audio processing graph to manipulate.
    */
  def createMediaStreamSource(stream: MediaStream): MediaStreamAudioSourceNode = js.native

  /** Creates a MediaStreamAudioDestinationNode associated with a MediaStream representing an audio stream which may be
    * stored in a local file or sent to another computer.
    */
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native

  /** Resumes the progression of time in an audio context that has previously been suspended. */
  def resume(): js.Promise[Unit] = js.native

  /** Suspends the progression of time in the audio context, temporarily halting audio hardware access and reducing
    * CPU/battery usage in the process.
    */
  def suspend(): js.Promise[Unit] = js.native

  /** Closes the audio context, releasing any system audio resources that it uses. */
  def close(): js.Promise[Unit] = js.native

  // TODO docs
  def getOutputTimestamp: AudioTimestamp = js.native
}
