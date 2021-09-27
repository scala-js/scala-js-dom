/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait TextTrackCue extends EventTarget {
  var onenter: js.Function1[Event, _] = js.native
  var track: TextTrack = js.native
  var endTime: Double = js.native
  var text: String = js.native
  var pauseOnExit: Boolean = js.native
  var id: String = js.native
  var startTime: Double = js.native
  var onexit: js.Function1[Event, _] = js.native

  def getCueAsHTML(): DocumentFragment = js.native
}
