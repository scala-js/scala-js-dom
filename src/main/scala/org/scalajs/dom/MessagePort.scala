/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The MessagePort interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing
  * sending of messages from one port and listening out for them arriving at the other.
  */
@js.native
trait MessagePort extends EventTarget {

  /** An EventListener, called whenever an MessageEvent of type message is fired on the port — that is, when the port
    * receives a message.
    */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** Disconnects the port,so it is no longer active. This stops the flow of messages to that port. */
  def close(): Unit = js.native

  /** Sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
    *
    * @param transferList
    *   Transferable objects to be transferred — these objects have their ownership transferred to the receiving
    *   browsing context, so are no longer usable by the sending browsing context.
    */
  def postMessage(message: js.Any, transferList: js.UndefOr[js.Array[Transferable]] = js.native): Unit = js.native

  def start(): Unit = js.native
}
