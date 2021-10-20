/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

trait RTCStats extends js.Object {
  val timestamp: Double
  val `type`: RTCStatsType
  val id: String
}
