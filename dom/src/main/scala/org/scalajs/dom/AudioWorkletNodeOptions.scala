/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js

trait AudioWorkletNodeOptions extends js.Any {

  /** The value to initialize the [[AudioNode#numberOfInputs]] property. Defaults to 1. */
  var numberOfInputs: js.UndefOr[Int] = js.undefined
  /** The value to initialize the [[AudioNode#numberOfOutputs]] property. Defaults to 1. */
  var numberOfOutputs: js.UndefOr[Int] = js.undefined
  var outputChannelCount: js.UndefOr[js.Array[Int]] = js.undefined
  var parameterData: js.UndefOr[js.Object] = js.undefined
  var processorOptions: js.UndefOr[js.Any] = js.undefined
}
