/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The OfflineAudioContext interface is an AudioContext interface representing an audio-processing graph built from
  * linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the
  * audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer.
  *
  * It is important to note that, whereas you can create a new AudioContext using the new AudioContext() constructor
  * with no arguments, the new OfflineAudioContext() constructor requires three arguments:
  *
  * @example
  *   {{{new OfflineAudioContext(numOfChannels, length, sampleRate)}}}
  *
  * This works in exactly the same way as when you create a new AudioBuffer with the AudioContext.createBuffer method.
  * For more detail, read Audio buffers: frames, samples and channels from our Basic concepts guide.
  *
  * @param numOfChannels
  *   An integer representing the number of channels this buffer should have. Implementations must support a minimum 32
  *   channels.
  * @param length
  *   An integer representing the size of the buffer in sample-frames.
  * @param sampleRate
  *   The sample-rate of the linear audio data in sample-frames per second. An implementation must support sample-rates
  *   in at least the range 22050 to 96000, with 44100 being the most commonly used.
  */
@js.native
@JSGlobal
class OfflineAudioContext(numOfChannels: Int, length: Int, sampleRate: Int) extends AudioContext {

  /** The promise-based startRendering() method of the OfflineAudioContext Interface starts rendering the audio graph,
    * taking into account the current connections and the current scheduled changes.
    *
    * When the method is invoked, the rendering is started and a promise is raised. When the rendering is completed, the
    * promise resolves with an AudioBuffer containing the rendered audio.
    */
  def startRendering(): js.Promise[AudioBuffer] = js.native
}
