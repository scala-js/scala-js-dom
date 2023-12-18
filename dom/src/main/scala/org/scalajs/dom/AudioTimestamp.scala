/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait AudioTimestamp extends js.Object {

  /** The time of the sample frame currently being rendered by the audio output device (i.e., output audio stream
    * position), in the same units and origin as the context's AudioContext.currentTime. Basically, this is the time
    * after the audio context was first created.
    */
  var contextTime: Double

  /** An estimation of the moment when the sample frame corresponding to the stored contextTime value was rendered by
    * the audio output device, in the same units and origin as performance.now(). This is the time after the document
    * containing the audio context was first rendered.
    */
  var performanceTime: Double
}
