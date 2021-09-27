/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The MediaDevices interface provides access to connected media input devices like cameras and microphones, as well as
  * screen sharing. In essence, it lets you obtain access to any hardware source of media data.
  */
@js.native
trait MediaDevices extends EventTarget {

  /** The event handler for the devicechange event. This event is delivered to the MediaDevices object when a media
    * input or output device is attached to or removed from the user's computer.
    */
  var ondevicechange: js.Function1[Event, Any] = js.native

  /** Obtains an array of information about the media input and output devices available on the system. */
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native

  /** Returns an object conforming to MediaTrackSupportedConstraints indicating which constrainable properties are
    * supported on the MediaStreamTrack interface. See "Capabilities and constraints" in Media Capture and Streams API
    * (Media Streams) to learn more about constraints and how to use them.
    */
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native

  /** With the user's permission through a prompt, turns on a camera or screensharing and/or a microphone on the system
    * and provides a MediaStream containing a video track and/or an audio track with the input.
    */
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native

}
