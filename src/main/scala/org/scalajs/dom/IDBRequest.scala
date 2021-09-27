/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The IDBRequest interface of the IndexedDB API provides access to results of asynchronous requests to databases and
  * database objects using event handler attributes. Each reading and writing operation on a database is done using a
  * request.
  *
  * The request object does not initially contain any information about the result of the operation, but once
  * information becomes available, an event is fired on the request, and the information becomes available through the
  * properties of the IDBRequest instance.
  *
  * @tparam A
  *   Type of `.target.result` on events
  */
@js.native
@JSGlobal
class IDBRequest[+S, A] extends EventTarget {

  /** The source of the request, such as an Index or a ObjectStore. If no source exists (such as when calling
    * IDBFactory.open), it returns null.
    */
  def source: S = js.native

  /** The event handler for the success event. */
  var onsuccess: js.Function1[IDBEvent[A], _] = js.native

  /** Returns a DOMException in the event of an unsuccessful request, indicating what went wrong. */
  def error: DOMException = js.native

  /** The transaction for the request. This property can be null for certain requests, such as for request returned from
    * IDBFactory.open (You're just connecting to a database, so there is no transaction to return).
    */
  def transaction: IDBTransaction = js.native

  /** The event handler for the error event. */
  var onerror: js.Function1[Event, _] = js.native

  /** The state of the request. Every request starts in the pending state. The state changes to done when the request
    * completes successfully or when an error occurs.
    */
  def readyState: String = js.native

  /** Returns the result of the request. If the the request failed and the result is not available,
    * the InvalidStateError exception is thrown.
    */
  def result: A = js.native
}
