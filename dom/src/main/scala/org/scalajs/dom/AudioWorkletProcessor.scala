/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
abstract class AudioWorkletProcessor(options: AudioWorkletProcessorOptions) extends js.Object {

  /** The [[MessagePort]] object that is connecting the [[AudioWorkletProcessor]] and the associated
    * [[AudioWorkletNode]].
    */
  val port: MessagePort = js.native

  def process(inputs: js.typedarray.Float32Array, outputs: js.typedarray.Float32Array, parameters: js.Object): Boolean

}
