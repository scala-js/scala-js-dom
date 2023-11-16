/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletGlobalScope extends WorkletGlobalScope {

  def currentFrame: Int

  def currentTime: Double

  def sampleRate: Float

  def registerProcessor(name: String, processorCtor: js.Dynamic): Unit = js.native
}

@js.native
@JSGlobalScope
object AudioWorkletGlobalScope extends js.Object {

  /** See issue https://github.com/whatwg/html/issues/6059 */
  def globalThis: AudioWorkletGlobalScope = js.native
}
