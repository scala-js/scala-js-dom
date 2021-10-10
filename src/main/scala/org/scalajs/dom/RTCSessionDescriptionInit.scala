/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

trait RTCSessionDescriptionInit extends js.Object {
  var `type`: js.UndefOr[RTCSdpType] = js.undefined
  var sdp: js.UndefOr[String] = js.undefined
}

@deprecated("all members of RTCSessionDescriptionInit are deprecated", "2.0.0")
object RTCSessionDescriptionInit {

  @deprecated("use `new RTCSessionDescriptionInit { ... }` instead", "2.0.0")
  @inline
  def apply(`type`: js.UndefOr[RTCSdpType] = js.undefined,
      sdp: js.UndefOr[String] = js.undefined): RTCSessionDescriptionInit = {
    val result = js.Dynamic.literal()
    `type`.map(_.asInstanceOf[js.Any]).foreach(result.`type` = _)
    sdp.foreach(result.sdp = _)
    result.asInstanceOf[RTCSessionDescriptionInit]
  }
}
