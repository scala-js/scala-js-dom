/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The IDBTransaction interface of the IndexedDB API provides a static, asynchronous transaction on a database using
  * event handler attributes. All reading and writing of data are done within transactions. You actually use IDBDatabase
  * to start transactions and use IDBTransaction to set the mode of the transaction and access an object store and make
  * your request. You can also use it to abort transactions.
  */
@js.native
@JSGlobal
class IDBTransaction extends EventTarget {

  /** The event handler for the oncomplete event. */
  var oncomplete: js.Function1[Event, _] = js.native

  /** The database connection with which this transaction is associated. */
  def db: IDBDatabase = js.native

  /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible
    * values, see Constants. The default value is readonly.
    */
  def mode: IDBTransactionMode = js.native

  /** Returns a DOMException indicating the type of error that occured when there is an unsuccessful transaction. This
    * property is null if the transaction is not finished, is finished and successfully committed, or was aborted with
    * IDBTransaction.abort function.
    */
  def error: DOMException = js.native

  /** The event handler for the onerror event. */
  var onerror: js.Function1[Event, _] = js.native

  /** The event handler for the onabort event. */
  var onabort: js.Function1[Event, _] = js.native

  /** Returns immediately, and rolls back all the changes to objects in the database associated with this transaction.
    * If this transaction has been aborted or completed, then this method throws an error event.
    */
  def abort(): Unit = js.native

  /** Every call to this method on the same transaction object, with the same name, returns the same IDBObjectStore
    * instance. If this method is called on a different transaction object, a different IDBObjectStore instance is
    * returned.
    */
  def objectStore(name: String): IDBObjectStore = js.native
}
