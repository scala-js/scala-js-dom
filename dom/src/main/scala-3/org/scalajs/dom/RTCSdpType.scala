/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCSdpType]] in W3C spec */
opaque type RTCSdpType <: String = String

object RTCSdpType {

  /** An RTCSdpType of "offer" indicates that a description should be treated as an [SDP] offer. */
  val offer: RTCSdpType = "offer"

  /** An RTCSdpType of "pranswer" indicates that a description should be treated as an [SDP] answer, but not a final
    * answer. A description used as an SDP "pranswer" may be applied as a response to a SDP offer, or an update to a
    * previously sent SDP "pranswer".
    */
  val pranswer: RTCSdpType = "pranswer"

  /** An RTCSdpType of "answer" indicates that a description should be treated as an [SDP] final answer, and the
    * offer-answer exchange should be considered complete. A description used as an SDP answer may be applied as a
    * response to an SDP offer or as an update to a previously sent SDP "pranswer".
    */
  val answer: RTCSdpType = "answer"
}
