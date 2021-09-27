/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The DelayNode interface represents a delay-line; an AudioNode audio-processing module that causes a delay between
  * the arrival of an input data and its propagation to the output. A DelayNode always has exactly one input and one
  * output, both with the same amount of channels.
  *
  * When creating a graph that has a cycle, it is mandatory to have at least one DelayNode in the cycle, or the nodes
  * taking part in the cycle will be muted.
  *
  *   - Number of inputs: 1
  *   - Number of outputs: 1
  *   - Channel count mode: "max"
  *   - Channel count: 2 (not used in the default count mode)
  *   - Channel interpretation: "speakers"
  */
@js.native
trait DelayNode extends AudioNode {

  /** Is an a-rate AudioParam representing the amount of delay to apply. */
  val delayTime: AudioParam = js.native
}
