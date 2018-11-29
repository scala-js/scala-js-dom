package org.scalajs.dom.experimental

import org.scalajs.dom.DOMError
import org.scalajs.dom.experimental.mediastream._
import scala.scalajs.js
import scala.language.implicitConversions

package object webrtc {
  implicit def toWebRTC(n: org.scalajs.dom.Navigator): NavigatorMediaStream =
    n.asInstanceOf[NavigatorMediaStream]

  @js.native
  trait NavigatorMediaStream extends js.Object {

    /**
     * The MediaDevices getUserMedia() method prompts the user for permission to use a media input
     * which produces a MediaStream with tracks containing the requested types of media. That stream
     * can include, for example, a video track (produced by either a hardware or virtual video source
     * such as a camera, video recording device, screen sharing service, and so forth), an audio track
     * (similarly, produced by a physical or virtual audio source like a microphone, A/D converter, or
     * the like), and possibly other track types.
     *
     * MDN
     *
     * @see [[https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia]]
     */
    def mediaDevices: MediaDevices

    @deprecated(
        "Navigator.getUserMedia() is deprecated, use Navigator.mediaDevices.getUserMedia() instead.",
        "2014-05-28")
    def getUserMedia(constraints: MediaStreamConstraints,
        success: js.Function1[MediaStream, Any],
        error: js.Function1[DOMError, Any]): Unit = js.native
  }
}
