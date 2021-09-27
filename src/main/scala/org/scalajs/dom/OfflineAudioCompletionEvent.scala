/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

/** The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an
  * OfflineAudioContext is terminated. The complete event implements this interface.
  */
@js.native
trait OfflineAudioCompletionEvent extends Event {

  /** The buffer containing the result of the processing of an OfflineAudioContext. */
  val renderedBuffer: AudioBuffer = js.native
}
