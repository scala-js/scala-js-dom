/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The ConvolverNode interface is an AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to
  * achieve a reverb effect. A ConvolverNode always has exactly one input and one output.
  *
  * Note: For more information on the theory behind Linear Convolution, see the W3C Web Audio API spec section, Linear
  * Effects Using Convolution, or read the The Wikipedia Linear Convolution Article.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "clamped-max"
  *   - Channel count: 2
  *   - Channel interpretation: "speakers"
  */
@js.native
trait ConvolverNode extends AudioNode {

  /** A mono, stereo, or 4-channel AudioBuffer containing the (possibly multichannel) impulse response used by the
    * ConvolverNode to create the reverb effect.
    */
  var buffer: AudioBuffer = js.native

  /** A boolean that controls whether the impulse response from the buffer will be scaled by an equal-power
    * normalization when the buffer attribute is set, or not.
    */
  var normalize: Boolean = js.native
}
