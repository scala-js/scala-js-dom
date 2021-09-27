/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The DynamicsCompressorNode interface provides a compression effect, which lowers the volume of the loudest parts of
  * the signal in order to help prevent clipping and distortion that can occur when multiple sounds are played and
  * multiplexed together at once. This is often used in musical production and game audio. DynamicsCompressorNode is an
  * AudioNode that has exactly one input and one output; it is created using the AudioContext.createDynamicsCompressor
  * method.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "explicit"
  *   - Channel count: 2
  *   - Channel interpretation: "speakers"
  */
@js.native
trait DynamicsCompressorNode extends AudioNode {

  /** Is a k-rate AudioParam representing the decibel value above which the compression will start taking effect. */
  val threshold: AudioParam = js.native

  /** Is a k-rate AudioParam containing a decibel value representing the range above the threshold where the curve
    * smoothly transitions to the compressed portion.
    */
  val knee: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of change, in dB, needed in the input for a 1 dB change in the
    * output.
    */
  val ratio: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of gain reduction currently applied by the compressor to the
    * signal.
    */
  val reduction: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of time, in seconds, required to reduce the gain by 10 dB. */
  val attack: AudioParam = js.native

  /** Is a k-rate AudioParam representing the amount of time, in seconds, required to increase the gain by 10 dB. */
  val release: AudioParam = js.native
}
