package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** A named channel that any browsing context of a given origin can subscribe to. It allows communication between
  * different documents (in different windows, tabs, frames or iframes) of the same origin. Messages are broadcasted via
  * a message event fired at all BroadcastChannel objects listening to the channel, except the object that sent the
  * message.
  */
@js.native
@JSGlobal
class BroadcastChannel(channelName: String) extends EventTarget {

  /** Uniquely identifies the given channel with its name */
  def name: String = js.native

  /** terminates the connection to the underlying channel, allowing the object to be garbage collected */
  def close(): Unit = js.native

  /** Sends a message, which can be of any kind of Object, to each listener in any browsing context with the same origin
    */
  def postMessage(message: Any): Unit = js.native

  /** The message event is fired on a BroadcastChannel object when a message arrives on that channel */
  var onmessage: js.Function1[MessageEvent, _] = js.native

  /** The messageerror event is fired on a BroadcastChannel object when a message that can't be deserialized arrives on
    * the channel
    */
  var onmessageerror: js.Function1[MessageEvent, _] = js.native

}
