/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class RTCSessionDescription(descriptionInitDict: js.UndefOr[RTCSessionDescriptionInit] = js.undefined)
    extends js.Object {

  /** An enum of type RTCSdpType describing the session description's type. */
  var `type`: RTCSdpType = js.native

  /** A DOMString containing the SDP format describing the session. */
  var sdp: String = js.native
}
