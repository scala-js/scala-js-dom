/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait AudioNodeChannelCountMode extends js.Any

object AudioNodeChannelCountMode {
  val max: AudioNodeChannelCountMode = "max".asInstanceOf[AudioNodeChannelCountMode]
  val `clamped-max`: AudioNodeChannelCountMode = "clamped-max".asInstanceOf[AudioNodeChannelCountMode]
  val explicit: AudioNodeChannelCountMode = "explicit".asInstanceOf[AudioNodeChannelCountMode]

}
