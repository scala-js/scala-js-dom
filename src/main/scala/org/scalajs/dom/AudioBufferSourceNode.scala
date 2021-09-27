/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** AudioBufferSourceNode has no input and exactly one output. The number of channels in the output corresponds to the
  * number of channels of the AudioBuffer that is set to the AudioBufferSourceNode.buffer property. If there is no
  * buffer set—that is, if the attribute's value is NULL—the output contains one channel consisting of silence. An
  * AudioBufferSourceNode can only be played once; that is, only one call to AudioBufferSourceNode.start() is allowed.
  * If the sound needs to be played again, another AudioBufferSourceNode has to be created. Those nodes are cheap to
  * create, and AudioBuffers can be reused across plays. It is often said that AudioBufferSourceNodes have to be used in
  * a "fire and forget" fashion: once it has been started, all references to the node can be dropped, and it will be
  * garbage-collected automatically.
  *
  * Multiple calls to AudioBufferSourceNode.stop() are allowed. The most recent call replaces the previous one, granted
  * the AudioBufferSourceNode has not already reached the end of the buffer.
  *
  *   - Number of inputs: 0
  *   - Number of outputs: 1
  *   - Channel count: defined by the associated AudioBuffer
  */
@js.native
trait AudioBufferSourceNode extends AudioNode {

  /** Is an AudioBuffer that defines the audio asset to be played, or when set to the value null, defines a single
    * channel of silence.
    */
  var buffer: AudioBuffer = js.native

  /** Is an a-rate AudioParam that defines the speed factor at which the audio asset will be played. Since no pitch
    * correction is applied on the output, this can be used to change the pitch of the sample.
    */
  val playbackRate: AudioParam = js.native

  /** Is a Boolean attribute indicating if the audio asset must be replayed when the end of the AudioBuffer is reached.
    * Its default value is false.
    */
  var loop: Boolean = js.native

  /** Is a double value indicating, in seconds, where in the AudioBuffer the restart of the play must happen. Its
    * default value is 0.
    */
  var loopStart: Double = js.native

  /** Is a double value indicating, in seconds, where in the AudioBuffer the replay of the play must stop (and
    * eventually loop again). Its default value is 0.
    */
  var loopEnd: Double = js.native

  /** Schedules the start of the playback of the audio asset.
    *
    * @param when
    *   The when parameter defines when the play will start. If when represents a time in the past, the play will start
    *   immediately. If the method is called more than one time, or after a call to AudioBufferSourceNode.stop(), an
    *   exception is raised.
    * @param offset
    *   The offset parameter, which defaults to 0, defines where the playback will start.
    * @param duration
    *   The duration parameter, which defaults to the length of the asset minus the value of offset, defines the length
    *   of the portion of the asset to be played.
    */
  def start(when: Double = js.native, offset: Double = js.native, duration: Double = js.native): Unit = js.native

  /** Schedules the end of the playback of an audio asset.
    *
    * @param when
    *   The when parameter defines when the playback will stop. If it represents a time in the past, the playback will
    *   end immediately. If this method is called twice or more, an exception is raised.
    */
  def stop(when: Double = js.native): Unit = js.native

  /** Is an EventHandler containing the callback associated with the ended event. */
  var onended: js.Function1[Event, _] = js.native
}
