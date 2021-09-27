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

/** A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener
  * indicated by the WebSocket object's onclose attribute.
  */
@js.native
trait CloseEvent extends Event {

  /** Indicates whether or not the connection was cleanly closed. */
  def wasClean: Boolean = js.native

  /** A string indicating the reason the server closed the connection. This is specific to the particular server and
    * sub-protocol.
    */
  def reason: String = js.native

  /** The WebSocket connection close code provided by the server. See Close codes for possible values. */
  def code: Int = js.native
}
