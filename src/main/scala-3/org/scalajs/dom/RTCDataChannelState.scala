/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCDataChannelState]] in W3C spec */
opaque type RTCDataChannelState <: String = String

object RTCDataChannelState {

  /** The user agent is attempting to establish the underlying data transport. This is the initial state of a
    * RTCDataChannel object created with createDataChannel().
    */
  val connecting: RTCDataChannelState = "connecting"

  /** The underlying data transport is established and communication is possible. This is the initial state of a
    * RTCDataChannel object dispatched as a part of a RTCDataChannelEvent.
    */
  val open: RTCDataChannelState = "open"

  /** The procedure to close down the underlying data transport has started. */
  val closing: RTCDataChannelState = "closing"

  /** The underlying data transport has been closed or could not be established. */
  val closed: RTCDataChannelState = "closed"
}
