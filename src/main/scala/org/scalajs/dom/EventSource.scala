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

/** EventSource enables servers to push data to Web pages over HTTP or using dedicated server-push protocols. Event
  * streams requests can be redirected using HTTP 301 and 307 redirects as with normal HTTP requests. Clients will
  * reconnect if the connection is closed; a client can be told to stop reconnecting using the HTTP 204 No Content
  * response code. W3C 2012
  * @param URL
  * @param settings
  */
@js.native
@JSGlobal
class EventSource(URL: String, settings: js.Dynamic = null) extends EventTarget {

  /** The url attribute must return the absolute URL that resulted from resolving the value that was passed to the
    * constructor. W3C 2012
    * @return
    */
  def url: String = js.native

  /** The withCredentials attribute must return the value to which it was last initialized. When the object is created
    * without withCredentials presents in the settings, it must be initialized to false. If it has the value true, then
    * set CORS mode to Use Credentials and initialize the new EventSource object's withCredentials attribute. W3C 2012
    */
  def withCredentials: Boolean = js.native

  /** The readyState attribute represents the state of the connection. W3C 2012 */
  def readyState: Int = js.native

  var onopen: js.Function1[Event, _] = js.native

  var onmessage: js.Function1[MessageEvent, _] = js.native

  var onerror: js.Function1[Event, _] = js.native

  /** The close() method must abort any instances of the fetch algorithm started for this EventSource object, and must
    * set the readyState attribute to CLOSED. W3C 2012
    */
  def close(): Unit = js.native
}

@js.native
@JSGlobal
object EventSource extends js.Object {

  /** The connection has not yet been established, or it was closed and the user agent is reconnecting. W3C 2012 */
  val CONNECTING: Int = js.native

  /** The user agent has an open connection and is dispatching events as it receives them. W3C 2012 */
  val OPEN: Int = js.native

  /** The connection is not open, and the user agent is not trying to reconnect. Either there was a fatal error or the
    * close() method was invoked. W3C 2012
    */
  val CLOSED: Int = js.native
}
