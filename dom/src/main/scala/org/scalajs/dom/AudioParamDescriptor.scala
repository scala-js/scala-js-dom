/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js

/** Specifies properties for AudioParam objects.
  *
  * It is used to create custom AudioParams on an AudioWorkletNode. If the underlying AudioWorkletProcessor has a
  * parameterDescriptors static getter, then the returned array of objects based on this dictionary is used internally
  * by AudioWorkletNode constructor to populate its parameters property accordingly.
  */
trait AudioParamDescriptor extends js.Object {

  /** The string which represents the name of the [[AudioParam]]. Under this name the [[AudioParam]] will be available
    * in the parameters property of the node, and under this name the [[AudioWorkletProcessor#process]] method will
    * acquire the calculated values of this [[AudioParam]].
    */
  var name: String

  /** Defaults to -3.4028235e38. */
  var minValue: js.UndefOr[Double] = js.undefined

  /** Defaults to 3.4028235e38. */
  var maxValue: js.UndefOr[Double] = js.undefined

  /** Represents initial value of the AudioParam. Defaults to 0. */
  var defaultValue: js.UndefOr[Double] = js.undefined

  /** Represents an automation rate of this AudioParam. Defaults to "a-rate". */
  var automationRate: js.UndefOr[AudioParamAutomationRate] = js.undefined
}
