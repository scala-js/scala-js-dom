/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait AudioBufferSourceNodeOptions extends js.Object {

  /** An instance of [[AudioBuffer]] to be played. */
  var buffer: js.UndefOr[AudioBuffer] = js.undefined

  /** Indicates whether the audio should play in a loop. The default is false. If the loop is dynamically modified
    * during playback, the new value will take effect on the next processing block of audio.
    */
  var loop: js.UndefOr[Boolean] = js.undefined

  /** An optional value in seconds, where looping should begin if the loop attribute is true. The default is 0. It's
    * sensible to set this to a value between 0 and the duration of the buffer. If loopStart is less than 0, looping
    * will begin at 0. If loopStart is greater than the duration of the buffer, looping will begin at the end of the
    * buffer. This attribute is converted to an exact sample frame offset within the buffer, by multiplying by the
    * buffer's sample rate and rounding to the nearest integer value. Thus, its behavior is independent of the value of
    * the playbackRate parameter.
    */
  var loopStart: js.UndefOr[Double] = js.undefined

  /** An optional value, in seconds, where looping should end if the loop attribute is true. The default is 0. Its value
    * is exclusive to the content of the loop. The sample frames, comprising the loop, run from the values loopStart to
    * loopEnd-(1/sampleRate). It's sensible to set this to a value between 0 and the duration of the buffer. If loopEnd
    * is less than 0, looping will end at 0. If loopEnd is greater than the duration of the buffer, looping will end at
    * the end of the buffer. This attribute is converted to an exact sample frame offset within the buffer, by
    * multiplying by the buffer's sample rate and rounding to the nearest integer value. Thus, its behavior is
    * independent of the value of the playbackRate parameter.
    */
  var loopEnd: js.UndefOr[Double] = js.undefined

  /** A value in cents to modulate the speed of audio stream rendering. Its nominal range is (-∞ to +∞). The default is
    * 0.
    */
  var detune: js.UndefOr[Double] = js.undefined

  /** The speed at which to render the audio stream. Its default value is 1. This parameter is k-rate. This is a
    * compound parameter with detune. Its nominal range is (-∞ to +∞).
    */
  var playbackRate: js.UndefOr[Double] = js.undefined
}
