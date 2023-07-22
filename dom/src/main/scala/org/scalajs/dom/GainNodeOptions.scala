/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait GainNodeOptions extends js.Object {
  var gain: js.UndefOr[Double] = js.undefined
  var channelCount: js.UndefOr[Int] = js.undefined
  var channelCountMode: js.UndefOr[AudioNodeChannelCountMode] = js.undefined
  var channelInterpretation: js.UndefOr[AudioNodeChannelInterpretation] = js.undefined
}
