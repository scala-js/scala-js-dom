/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait AudioWorkletProcessorOptions extends js.Object {

  /** The value to initialize the [[AudioNode#numberOfInputs]] property. Defaults to 1. */
  var numberOfInputs: Int

  /** The value to initialize the [[AudioNode#numberOfOutputs]] property. Defaults to 1. */
  var numberOfOutputs: Int

  /** An array defining the number of channels for each output. For example, outputChannelCount: [n, m] specifies the
    * number of channels in the first output to be n and the second output to be m. The array length must match
    * numberOfOutputs.
    */
  var outputChannelCount: js.Array[Int]

  /** An object containing the initial values of custom AudioParam objects on this node (in its parameters property),
    * with key being the name of a custom parameter and value being its initial value.
    */
  var parameterData: js.UndefOr[js.Object] = js.undefined

  /** Any additional data that can be used for custom initialization of the underlying AudioWorkletProcessor. */
  var processorOptions: js.UndefOr[js.Any] = js.undefined
}
