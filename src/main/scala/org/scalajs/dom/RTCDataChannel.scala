/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}
import scala.scalajs.js.|

/** The RTCDataChannel interface represents a bi-directional data channel between two peers of a connection. */
@js.native
trait RTCDataChannel extends EventTarget {

  /** Returns a DOMString containing a name describing the data channel. There is no constraint of uniqueness about it.
    */
  val label: String = js.native

  /** The read-only property RTCDataChannel.ordered returns a Boolean indicating if the order of delivery of the
    * messages is guaranteed or not.
    */
  val ordered: Boolean = js.native
  val maxPacketLifeTime: Double = js.native
  val maxRetransmits: Double = js.native

  /** Returns a DOMString containing the name of the subprotocol in use. If none, it returns "". */
  val protocol: String = js.native
  val negotiated: Boolean = js.native

  /** Returns an unsigned short being a unique id for the channel. It is set at the creation of the RTCDataChannel
    * object.
    */
  val id: Double = js.native

  /** Returns an enum of the type RTCDataChannelState representing the state of the underlying data connection. */
  def readyState: RTCDataChannelState = js.native

  /** Returns an unsigned long containing the amount of bytes that have been queued for sending: that is the amount of
    * data requested to be transmitted via RTCDataChannel.send() that has not been sent yet. Note that if the channel
    * state, as given by RTCDataChannel.readyState is "closed", the buffering continues.
    */
  def bufferedAmount: Double = js.native
  var onopen: js.Function1[Event, Any] = js.native
  var onerror: js.Function1[Event, Any] = js.native

  /** Is the event handler called when the close event is received. Such an event is sent when the underlying data
    * transport has been closed.
    */
  var onclose: js.Function1[Event, Any] = js.native
  def close(): Unit = js.native

  /** Is the event handler called when the message event is received. Such an event is sent when a message is available
    * on the data connection.
    */
  var onmessage: js.Function1[MessageEvent, Any] = js.native

  /** Returns a DOMString indicating the type of binary data transmitted by the connection. This should be either "blob"
    * if Blob objects are being used or "arraybuffer" if ArrayBuffer objects are being used. Initially it is set to
    * "blob".
    *
    * It controls the type of the MessageEvent.data property passed in the parameter of message targetting this
    * RTCDataChannel.
    */
  var binaryType: String = js.native

  /** Sends the data in parameter over the channel. The data can be a DOMString, a Blob, an ArrayBuffer or an
    * ArrayBufferView.
    */
  def send(data: String | Blob | ArrayBuffer | ArrayBufferView): Unit = js.native
}
