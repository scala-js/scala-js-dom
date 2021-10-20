/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCStatsType]] in W3C spec */
opaque type RTCStatsType <: String = String

object RTCStatsType {

  /** Inbound RTP. */
  val `inbound-rtp`: RTCStatsType = "inbound-rtp"

  /** Outbound RTP. */
  val `outbound-rtp`: RTCStatsType = "outbound-rtp"
}
