/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */

package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Represents a global execution context for user-supplied code, which defines custom AudioWorkletProcessor-derived
  * classes.
  *
  * Each BaseAudioContext has a single AudioWorklet available under the audioWorklet property, which runs its code in a
  * single AudioWorkletGlobalScope.
  *
  * As the global execution context is shared across the current BaseAudioContext, it's possible to define any other
  * variables and perform any actions allowed in worklets — apart from defining AudioWorkletProcessor derived classes.
  */
@js.native
trait AudioWorkletGlobalScope extends WorkletGlobalScope {

  /** Returns an integer that represents the ever-increasing current sample-frame of the audio block being processed. It
    * is incremented by 128 (the size of a render quantum) after the processing of each audio block.
    */
  def currentFrame: Int

  /** Returns a double that represents the ever-increasing context time of the audio block being processed. It is equal
    * to the currentTime property of the BaseAudioContext the worklet belongs to.
    */
  def currentTime: Double

  /** Returns a float that represents the sample rate of the associated BaseAudioContext. */
  def sampleRate: Float

  /** Registers a class derived from the AudioWorkletProcessor interface. The class can then be used by creating an
    * AudioWorkletNode, providing its registered name.
    */
  def registerProcessor(name: String, processorCtor: js.Dynamic): Unit = js.native
}

@js.native
@JSGlobalScope
object AudioWorkletGlobalScope extends js.Object {

  /** See issue https://github.com/whatwg/html/issues/6059 */
  def globalThis: AudioWorkletGlobalScope = js.native
}
