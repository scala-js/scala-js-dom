/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2013/WD-mediacapture-streams-20130903/#widl-MediaStream-onended]] in W3C spec */
@js.native
sealed trait MediaStreamTrackState extends js.Any

object MediaStreamTrackState {

  /** The track is active (the track's underlying media source is making a best-effort attempt to provide data in real
    * time). The output of a track in the live state can be switched on and off with the enabled attribute.
    */
  val live: MediaStreamTrackState = "live".asInstanceOf[MediaStreamTrackState]

  /** The track has ended (the track's underlying media source is no longer providing data, and will never provide more
    * data for this track). Once a track enters this state, it never exits it.
    *
    * For example, a video track in a MediaStream ends if the user unplugs the USB web camera that acts as the track's
    * media source.
    */
  val ended: MediaStreamTrackState = "ended".asInstanceOf[MediaStreamTrackState]
}
