/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** A MessageEvent is sent to clients using WebSockets when data is received from the server. This is delivered to the
  * listener indicated by the WebSocket object's onmessage attribute.
  */
@js.native
@JSGlobal
class MessageEvent[+T](typeArg: String, init: js.UndefOr[MessageEventInit[T]]) extends Event(typeArg, init) {
  def source: Window = js.native

  def origin: String = js.native

  /** The data you want contained in the MessageEvent.
    *
    * This can be of any data type, and will default to null if not specified.
    */
  def data: T = js.native

  def ports: js.Any = js.native
}
