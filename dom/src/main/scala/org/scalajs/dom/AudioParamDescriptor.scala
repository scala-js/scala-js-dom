/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js

trait AudioParamDescriptor extends js.Any {

  /** The string which represents the name of the [[AudioParam]]. Under this name the [[AudioParam]] will be available
    * in the parameters property of the node, and under this name the [[AudioWorkletProcessor#process]] method will
    * acquire the calculated values of this [[AudioParam]].
    */
  var name: String
  var minValue: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var automationRate: js.UndefOr[AudioParamAutomationRate] = js.undefined
}
