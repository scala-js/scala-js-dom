/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

/** The RTCDataChannelEvent interface represents events that occur while attaching a RTCDataChannel to a
  * RTCPeerConnection. The only event sent with this interface is datachannel.
  */
@js.native
@JSGlobal
class RTCDataChannelEvent(typeArg: String, init: js.UndefOr[RTCDataChannelEventInit]) extends Event(typeArg, init) {
  def this(init: RTCDataChannelEventInit) = this("datachannel", init)

  /** Contains the RTCDataChannel containing the data channel associated with the event. */
  val channel: RTCDataChannel = js.native
}
