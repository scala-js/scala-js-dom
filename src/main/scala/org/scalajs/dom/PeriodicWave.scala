/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The PeriodicWave interface defines a periodic waveform that can be used to shape the output of an OscillatorNode.
  *
  * PeriodicWave has no inputs or outputs; it is used to create custom oscillators via OscillatorNode.setPeriodicWave.
  * The PeriodicWave itself is created/returned by AudioContext.createPeriodicWave.
  */
@js.native
trait PeriodicWave extends js.Object
