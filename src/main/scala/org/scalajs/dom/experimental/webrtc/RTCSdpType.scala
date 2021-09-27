/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCSdpType]] in W3C spec */
sealed trait RTCSdpType extends js.Any

object RTCSdpType {

  /** An RTCSdpType of "offer" indicates that a description should be treated as an [SDP] offer. */
  val offer: RTCSdpType = "offer".asInstanceOf[RTCSdpType]

  /** An RTCSdpType of "pranswer" indicates that a description should be treated as an [SDP] answer, but not a final
    * answer. A description used as an SDP "pranswer" may be applied as a response to a SDP offer, or an update to a
    * previously sent SDP "pranswer".
    */
  val pranswer: RTCSdpType = "pranswer".asInstanceOf[RTCSdpType]

  /** An RTCSdpType of "answer" indicates that a description should be treated as an [SDP] final answer, and the
    * offer-answer exchange should be considered complete. A description used as an SDP answer may be applied as a
    * response to an SDP offer or as an update to a previously sent SDP "pranswer".
    */
  val answer: RTCSdpType = "answer".asInstanceOf[RTCSdpType]
}
