/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom.experimental.mediastream

import org.scalajs.dom._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait MediaDeviceInfo extends js.Object {

  /** Returns a DOMString that is an identifier for the represented device that is persisted across sessions. It is
    * un-guessable by other applications and unique to the origin of the calling application. It is reset when the user
    * clears cookies (for Private Browsing, a different identifier is used that is not persisted across sessions).
    */
  val deviceId: String = js.native

  /** Returns a DOMString that is a group identifier. Two devices have the same group identifier if they belong to the
    * same physical device; for example a monitor with both a built-in camera and microphone.
    */
  val groupId: String = js.native

  /** enum MediaDevicesInfoKind Returns an enumerated value that is either "videoinput", "audioinput" or "audiooutput".
    */
  val kind: MediaDeviceKind = js.native

  /** Returns a DOMString that is a label describing this device (for example "External USB Webcam"). Only available
    * during active MediaStream use or when persistent permissions have been granted.
    */
  val label: String = js.native
}

@deprecated("all the members of MediaDeviceInfo are deprecated", "2.0.0")
object MediaDeviceInfo {

  @deprecated("MediaDeviceInfo's cannot be created manually", "2.0.0")
  @inline
  def apply(
      deviceId: js.UndefOr[String] = js.undefined, groupId: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[String] = js.undefined, label: js.UndefOr[String] = js.undefined
  ): MediaDeviceInfo = {
    val result = js.Dynamic.literal()
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    kind.foreach(result.kind = _)
    label.foreach(result.label = _)
    result.asInstanceOf[MediaDeviceInfo]
  }
}
