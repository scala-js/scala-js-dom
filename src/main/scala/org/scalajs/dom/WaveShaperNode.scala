/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The WaveShaperNode interface represents a non-linear distorter. It is an AudioNode that uses a curve to apply a wave
  * shaping distortion to the signal. Beside obvious distortion effects, it is often used to add a warm feeling to the
  * signal.
  *
  * A WaveShaperNode always has exactly one input and one output.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@js.native
trait WaveShaperNode extends AudioNode {

  /** Is a Float32Array of numbers describing the distortion to apply. */
  var curve: js.typedarray.Float32Array = js.native

  /** Is an enumerated value indicating if oversampling must be used. Oversampling is a technique for creating more
    * samples (up-sampling) before applying the distortion effect to the audio signal.
    */
  var oversample: String = js.native
}
