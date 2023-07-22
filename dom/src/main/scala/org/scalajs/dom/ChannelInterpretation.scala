/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ChannelInterpretation extends js.Any

object ChannelInterpretation {
  val speakers: ChannelInterpretation = "speakers".asInstanceOf[ChannelInterpretation]
  val discrete: ChannelInterpretation = "discrete".asInstanceOf[ChannelInterpretation]
}
