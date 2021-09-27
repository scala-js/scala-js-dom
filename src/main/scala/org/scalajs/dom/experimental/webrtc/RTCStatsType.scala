/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCStatsType]] in W3C spec */
sealed trait RTCStatsType extends js.Any

object RTCStatsType {

  /** Inbound RTP. */
  val `inbound-rtp` = "inbound-rtp".asInstanceOf[RTCStatsType]

  /** Outbound RTP. */
  val `outbound-rtp` = "outbound-rtp".asInstanceOf[RTCStatsType]
}
