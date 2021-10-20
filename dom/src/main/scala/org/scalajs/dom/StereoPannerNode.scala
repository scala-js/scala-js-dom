/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The StereoPannerNode interface of the Web Audio API represents a simple stereo panner node that can be used to pan
  * an audio stream left or right. It is an AudioNode audio-processing module that positions an incoming audio stream in
  * a stereo image using a low-cost equal-power panning algorithm.
  *
  * The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan).
  *
  * This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full
  * PannerNode.
  */
@js.native
trait StereoPannerNode extends AudioNode {

  /** Is an a-rate AudioParam representing the amount of panning to apply. */
  val pan: AudioParam = js.native
}
