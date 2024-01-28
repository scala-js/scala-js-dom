/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait OscillatorNodeOptions extends js.Object {

  /** The shape of the wave produced by the node. Valid values are 'sine', 'square', 'sawtooth', 'triangle' and
    * 'custom'. The default is 'sine'.
    */
  var `type`: js.UndefOr[OscillatorNodeType] = js.undefined

  /** A detuning value (in cents) which will offset the frequency by the given amount. Its default is 0. */
  var detune: js.UndefOr[Double] = js.undefined

  /** The frequency (in hertz) of the periodic waveform. Its default is 440. */
  var frequency: js.UndefOr[Double] = js.undefined

  /** An arbitrary period waveform described by a PeriodicWave object. */
  var periodicWave: js.UndefOr[PeriodicWave] = js.undefined
}
