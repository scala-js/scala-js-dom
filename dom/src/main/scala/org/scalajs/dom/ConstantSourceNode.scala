/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSGlobal
@js.native
/** Represents an audio source (based upon AudioScheduledSourceNode) whose output is single unchanging value. This makes
  * it useful for cases in which you need a constant value coming in from an audio source. In addition, it can be used
  * like a constructible AudioParam by automating the value of its offset or by connecting another node to it; see
  * Controlling multiple parameters with ConstantSourceNode.
  */
class ConstantSourceNode(context: BaseAudioContext, options: ConstantSourceNodeOptions = js.native)
    extends AudioScheduledSourceNode {

  /** Returns a AudioParam object indicating the numeric a-rate value which is always returned by the source when asked
    * for the next sample.
    */
  val offset: AudioParam = js.native

}
