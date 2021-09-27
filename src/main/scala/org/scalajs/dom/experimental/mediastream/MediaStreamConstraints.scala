/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

trait MediaStreamConstraints extends js.Object {
  var video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var peerIdentity: js.UndefOr[String] = js.undefined
}

@deprecated("all the members of MediaStreamConstraints are deprecated", "2.0.0")
object MediaStreamConstraints {

  @deprecated("use `new MediaStreamConstraints { ... }` instead", "2.0.0")
  @inline
  def apply(
      video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined,
      audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined, peerIdentity: js.UndefOr[String] = js.undefined
  ): MediaStreamConstraints = {
    val result = js.Dynamic.literal()
    video.foreach(v => result.video = v.asInstanceOf[js.Any])
    audio.foreach(a => result.audio = a.asInstanceOf[js.Any])
    peerIdentity.foreach(result.peerIdentity = _)
    result.asInstanceOf[MediaStreamConstraints]
  }
}
