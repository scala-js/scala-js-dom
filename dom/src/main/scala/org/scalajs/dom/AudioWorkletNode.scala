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
class AudioWorkletNode(context: BaseAudioContext, name: String, options: AudioWorkletNodeOptions = js.native)
    extends AudioNode {

  /** The [[MessagePort]] object that is connecting the [[AudioWorkletNode]] and its associated
    * [[AudioWorkletProcessor]].
    */
  val port: MessagePort = js.native

  /** The [[AudioParamMap]] object containing [[AudioParam]] instances. They can be automated in the same way as with
    * default [[AudioNode]], and their calculated values can be used in the [[AudioWorkletProcessor#process]] method of
    * your [[AudioWorkletProcessor]].
    */
  val parameters: AudioParamMap = js.native

  /** Fires when the underlying [[AudioWorkletProcessor]] behind the node throws an exception in its constructor, the
    * process method, or any user-defined class method.
    */
  var onprocessorerror: js.Function1[Event, _] = js.native

}
