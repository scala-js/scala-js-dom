/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

opaque type AudioParamAutomationRate <: String = String

object AudioParamAutomationRate {

  /** An a-rate [[AudioParam]] takes the current audio parameter value for each sample frame of the audio signal. */
  val `a-rate`: AudioParamAutomationRate = "a-rate"

  /** A k-rate [[AudioParam]] uses the same initial audio parameter value for the whole block processed; that is, 128
    * sample frames. In other words, the same value applies to every frame in the audio as it's processed by the node.
    */
  val `k-rate`: AudioParamAutomationRate = "k-rate"
}
