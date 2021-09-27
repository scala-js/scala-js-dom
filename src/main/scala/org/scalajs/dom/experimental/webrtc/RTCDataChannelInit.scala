/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

//https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCDataChannelInit
trait RTCDataChannelInit extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.undefined
  var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
  var maxRetransmits: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var negotiated: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
}

@deprecated("all members of RTCDataChannelInit are deprecated", "2.0.0")
object RTCDataChannelInit {

  @deprecated("use `new RTCDataChannelInit { ... }` instead", "2.0.0")
  @inline
  def apply(
      ordered: js.UndefOr[Boolean] = js.undefined, maxPacketLifeTime: js.UndefOr[Double] = js.undefined,
      maxRetransmits: js.UndefOr[Double] = js.undefined, protocol: js.UndefOr[String] = js.undefined,
      negotiated: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[Double] = js.undefined
  ): RTCDataChannelInit = {
    val result = js.Dynamic.literal()
    ordered.foreach(result.ordered = _)
    maxPacketLifeTime.foreach(result.maxPacketLifeTime = _)
    maxRetransmits.foreach(result.maxRetransmits = _)
    protocol.foreach(result.protocol = _)
    negotiated.foreach(result.negotiated = _)
    id.foreach(result.id = _)
    result.asInstanceOf[RTCDataChannelInit]
  }
}
