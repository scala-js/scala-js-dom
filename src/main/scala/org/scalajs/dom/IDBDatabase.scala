/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/** The IDBDatabase interface of the IndexedDB API provides asynchronous access to a connection to a database. Use it to
  * create, manipulate, and delete objects in that database. The interface also provides the only way to get a
  * transaction and manage versions on that database.
  *
  * Everything you do in IndexedDB always happens in the context of a transaction, representing interactions with data
  * in the database. All objects in IndexedDB—including object stores, indexes, and cursors—are tied to a particular
  * transaction. Thus, you cannot execute commands, access data, or open anything outside of a transaction.
  */
@js.native
@JSGlobal
class IDBDatabase extends EventTarget {

  /** A 64-bit integer that contains the version of the connected database. When a database is first created or upgraded
    * you should use [[IDBVersionChangeEvent#newVersion]] instead. Webkit returns always integer and the value is 1 when
    * database is first created.
    */
  def version: Int = js.native

  /** A DOMString that contains the name of the connected database. */
  def name: String = js.native

  /** A DOMStringList that contains a list of the names of the object stores currently in the connected database. */
  def objectStoreNames: DOMStringList = js.native

  /** Fires when access to the database fails. */
  var onerror: js.Function1[Event, _] = js.native

  /** Fires when access of the database is aborted. */
  var onabort: js.Function1[Event, _] = js.native

  /** The onversionchange event handler of the IDBDatabase interface handles the versionchange event, fired when a
    * database structure change (IDBOpenDBRequest.onupgradeneeded event or IDBFactory.deleteDatabase) was requested
    * elsewhere (most probably in another window/tab on the same computer).
    */
  var onversionchange: js.Function1[IDBVersionChangeEvent, _] = js.native

  /** The method takes the name of the store as well as a parameter object. The parameter object lets you define
    * important optional properties. You can use the property to uniquely identify individual objects in the store. As
    * the property is an identifier, it should be unique to every object, and every object should have that property.
    */
  def createObjectStore(name: String,
      optionalParameters: js.UndefOr[IDBCreateObjectStoreOptions] = js.native): IDBObjectStore = js.native

  /** The connection is not actually closed until all transactions created using this connection are complete. No new
    * transactions can be created for this connection once this method is called. Methods that create transactions throw
    * an exception if a closing operation is pending.
    */
  def close(): Unit = js.native

  /** Immediately returns a transaction object (IDBTransaction) containing the IDBTransaction.objectStore method, which
    * you can use to access your object store. Runs in a separate thread.
    */
  def transaction(storeNames: String | js.Array[String], mode: js.UndefOr[IDBTransactionMode] = js.native,
      options: js.UndefOr[IDBTransactionOptions] = js.native): IDBTransaction = js.native

  /** As with createObjectStore, this method can be called only within a versionchange transaction. So for WebKit
    * browsers you must call the IDBVersionChangeRequest.setVersion method first before you can remove any object store
    * or index.
    */
  def deleteObjectStore(name: String): Unit = js.native
}
