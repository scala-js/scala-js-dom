/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBuffer

/** The WebSocket object provides the API for creating and managing a WebSocket connection to a server, as well as for
  * sending and receiving data on the connection.
  *
  * @param url
  *   The URL as resolved by the constructor. This is always an absolute URL. Read only.
  * @param protocol
  *   A string indicating the name of the sub-protocol the server selected; this will be one of the strings specified in
  *   the protocols parameter when creating the WebSocket object.
  */
@js.native
@JSGlobal
class WebSocket(var url: String = js.native, var protocol: String = js.native) extends EventTarget {
  def this(url: String, protocol: js.Array[String]) = this("", "")

  /** The current state of the connection; this is one of the Ready state constants. Read only. */
  def readyState: Int = js.native

  /** The number of bytes of data that have been queued using calls to send() but not yet transmitted to the network.
    * This value does not reset to zero when the connection is closed; if you keep calling send(), this will continue to
    * climb. Read only.
    */
  def bufferedAmount: Int = js.native

  /** An event listener to be called when the WebSocket connection's readyState changes to OPEN; this indicates that the
    * connection is ready to send and receive data. The event is a simple one with the name "open".
    */
  var onopen: js.Function1[Event, _] = js.native

  /** The extensions selected by the server. This is currently only the empty string or a list of extensions as
    * negotiated by the connection.
    */
  def extensions: String = js.native

  /** An event listener to be called when a message is received from the server. The listener receives a MessageEvent
    * named "message".
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** An event listener to be called when the WebSocket connection's readyState changes to CLOSED. The listener receives
    * a CloseEvent named "close".
    */
  var onclose: js.Function1[CloseEvent, _] = js.native

  /** An event listener to be called when an error occurs. This is a simple event named "error". */
  var onerror: js.Function1[Event, _] = js.native

  /** A string indicating the type of binary data being transmitted by the connection. This should be either "blob" if
    * DOM Blob objects are being used or "arraybuffer" if ArrayBuffer objects are being used.
    */
  var binaryType: String = js.native

  /** Closes the WebSocket connection or connection attempt, if any. If the connection is already CLOSED, this method
    * does nothing.
    */
  def close(code: Int = js.native, reason: String = js.native): Unit = js.native

  /** Transmits data to the server over the WebSocket connection. */
  def send(data: String): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
}

@js.native
@JSGlobal
object WebSocket extends js.Object {

  /** The connection is open and ready to communicate. */
  val OPEN: Int = js.native

  /** The connection is in the process of closing. */
  val CLOSING: Int = js.native
  val CONNECTING: Int = js.native

  /** The connection is closed or couldn't be opened. */
  val CLOSED: Int = js.native
}
