/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

trait RTCIceCandidateInit extends js.Object {
  var candidate: js.UndefOr[String] = js.undefined
  var sdpMid: js.UndefOr[String] = js.undefined
  var sdpMLineIndex: js.UndefOr[Double] = js.undefined
}

@deprecated("all members of RTCIceCandidateInit are deprecated", "2.0.0")
object RTCIceCandidateInit {

  @deprecated("use `new RTCIceCandidateInit { ... }` instead", "2.0.0")
  @inline
  def apply(
      candidate: js.UndefOr[String] = js.undefined, sdpMid: js.UndefOr[String] = js.undefined,
      sdpMLineIndex: js.UndefOr[Double] = js.undefined
  ): RTCIceCandidateInit = {
    val result = js.Dynamic.literal()
    candidate.foreach(result.candidate = _)
    sdpMid.foreach(result.sdpMid = _)
    sdpMLineIndex.foreach(result.sdpMLineIndex = _)
    result.asInstanceOf[RTCIceCandidateInit]
  }
}
