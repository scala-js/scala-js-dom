/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait TextTrackCue extends EventTarget {
  def track: TextTrack = js.native

  var id: String = js.native
  var startTime: Double = js.native
  var endTime: Double = js.native
  var pauseOnExit: Boolean = js.native

  var onenter: js.Function1[Event, Any] = js.native
  var onexit: js.Function1[Event, Any] = js.native
}
