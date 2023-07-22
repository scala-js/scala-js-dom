/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait AudioNodeChannelInterpretation extends js.Any

object AudioNodeChannelInterpretation {
  val speakers: AudioNodeChannelInterpretation = "speakers".asInstanceOf[AudioNodeChannelInterpretation]
  val discrete: AudioNodeChannelInterpretation = "discrete".asInstanceOf[AudioNodeChannelInterpretation]
}
