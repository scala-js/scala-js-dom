/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface of the the WebRTC API represents a candidate internet connectivity establishment (ICE)
  * server for establishing an RTCPeerConnection.
  */
@js.native
@JSGlobal
class RTCIceCandidate(candidateInitDict: RTCIceCandidateInit) extends js.Object {

  /** Returns a transport address for the candidate that can be used for connectivity checks. The format of this address
    * is a candidate-attribute as defined in RFC 5245.
    */
  var candidate: String = js.native

  /** If not null, this contains the identifier of the "media stream identification" (as defined in RFC 5888) for the
    * media component this candidate is associated with.
    */
  var sdpMid: String = js.native

  /** If not null, this indicates the index (starting at zero) of the media description (as defined in RFC 4566) in the
    * SDP this candidate is associated with.
    */
  var sdpMLineIndex: Double = js.native
}
