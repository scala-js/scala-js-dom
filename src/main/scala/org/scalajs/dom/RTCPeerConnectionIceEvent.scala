/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The RTCPeerConnectionIceEvent interface represents events that occurs in relation to ICE candidates with the target,
  * usually an RTCPeerConnection. Only one event is of this type: icecandidate.
  */
@js.native
@JSGlobal
class RTCPeerConnectionIceEvent(typeArg: String, init: js.UndefOr[RTCPeerConnectionIceEventInit])
    extends Event(typeArg, init) {

  /** Contains the RTCIceCandidate containing the candidate associated with the event. */
  var candidate: RTCIceCandidate = js.native
}
