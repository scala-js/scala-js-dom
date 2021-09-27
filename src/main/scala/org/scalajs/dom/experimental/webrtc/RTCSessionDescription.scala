/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

@js.native
@JSGlobal
class RTCSessionDescription(descriptionInitDict: js.UndefOr[RTCSessionDescriptionInit] = js.undefined)
    extends js.Object {

  /** An enum of type RTCSdpType describing the session description's type. */
  var `type`: RTCSdpType = js.native

  /** A DOMString containing the SDP format describing the session. */
  var sdp: String = js.native
}
