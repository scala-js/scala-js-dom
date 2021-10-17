/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class MediaStreamTrackEvent(typeArg: String, init: js.UndefOr[MediaStreamTrackEventInit]) extends Event(typeArg, init) {
  val track: MediaStreamTrack = js.native
}
