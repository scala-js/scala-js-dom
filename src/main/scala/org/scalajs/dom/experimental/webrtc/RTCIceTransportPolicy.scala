/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.{Blob, DOMException, Event, EventInit, EventTarget, MessageEvent}
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCIceTransportPolicy]] in W3C spec */
sealed trait RTCIceTransportPolicy extends js.Any

object RTCIceTransportPolicy {

  /** The ICE engine must not send or receive any packets at this point. */
  val none: RTCIceTransportPolicy = "none".asInstanceOf[RTCIceTransportPolicy]

  /** The ICE engine must only use media relay candidates such as candidates passing through a TURN server. This can be
    * used to reduce leakage of IP addresses in certain use cases.
    */
  val relay: RTCIceTransportPolicy = "relay".asInstanceOf[RTCIceTransportPolicy]

  /** The ICE engine may use any type of candidates when this value is specified. */
  val all: RTCIceTransportPolicy = "all".asInstanceOf[RTCIceTransportPolicy]
}
