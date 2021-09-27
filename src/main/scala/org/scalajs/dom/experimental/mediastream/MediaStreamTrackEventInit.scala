/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js

trait MediaStreamTrackEventInit extends EventInit {
  var track: js.UndefOr[MediaStreamTrack] = js.undefined
}
