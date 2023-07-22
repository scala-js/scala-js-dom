/** Documentation is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later. http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

trait AudioBufferSourceNodeOptions extends js.Object {
  var buffer: js.UndefOr[AudioBuffer] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var loopStart: js.UndefOr[Double] = js.undefined
  var loopEnd: js.UndefOr[Double] = js.undefined
  var detune: js.UndefOr[Double] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
}

