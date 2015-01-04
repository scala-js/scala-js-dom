/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom

import scala.scalajs.js

/**
 * The IDBObjectStore interface of the IndexedDB API represents an object store in
 * a database. Records within an object store are sorted according to their keys.
 * This sorting enables fast insertion, look-up, and ordered retrieval.
 *
 * MDN
 */
class IDBObjectStore extends js.Object {
  /**
   * A list of the names of indexes on objects in this object store.
   *
   * MDN
   */
  def indexNames: DOMStringList = js.native

  def name: String = js.native

  /**
   * The name of the transaction to which this object store belongs.
   *
   * MDN
   */
  def transaction: IDBTransaction = js.native

  /**
   * The key path of this object store. If this attribute is null, the application must
   * provide a key for each modification operation.
   *
   * MDN
   */
  def keyPath: String = js.native

  def count(key: js.Any = js.native): IDBRequest = js.native

  /**
   * To determine if the add operation has completed successfully, listen for the
   * transaction’s complete event in addition to the IDBObjectStore.add request’s
   * success event, because the transaction may still fail after the success event
   * fires. In other words, the success event is only triggered when the transaction has
   * been successfully queued.
   *
   * MDN
   */
  def add(value: js.Any, key: js.Any = js.native): IDBRequest = js.native

  /**
   * Clearing an object store consists of removing all records from the object store and
   * removing all records in indexes that reference the object store.
   *
   * MDN
   */
  def clear(): IDBRequest = js.native
  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback.
   *
   * MDN
   */
  def createIndex(name: String, keyPath: String, optionalParameters: js.Any = js.native): IDBIndex = js.native

  /**
   * If the record is successfully stored, then a success event is fired on the returned
   * request object with the result set to the key for the stored record, and the
   * transaction set to the transaction in which this object store is opened.
   *
   * MDN
   */
  def put(value: js.Any, key: js.Any = js.native): IDBRequest = js.native

  def openCursor(range: js.Any = js.native, direction: String = js.native): IDBRequest = js.native

  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback. Note that this method synchronously modifies the
   * IDBObjectStore.indexNames property.
   *
   * MDN
   */
  def deleteIndex(indexName: String): Unit = js.native

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def index(name: String): IDBIndex = js.native

  /**
   * If a value is successfully found, then a structured clone of it is created and set as
   * the result of the request object.
   *
   * MDN
   */
  def get(key: js.Any): IDBRequest = js.native

  /**
   * returns an IDBRequest object, and, in a separate thread, deletes the current
   * object store.
   *
   * MDN
   */
  def delete(key: js.Any): IDBRequest = js.native
}

/**
 * The specification has changed and some not up-to-date browsers only support the
 * deprecated unique attribute, version, from an early draft version.
 *
 * MDN
 */
class IDBVersionChangeEvent extends Event {
  /**
   * Returns the new version of the database.
   *
   * MDN
   */
  def newVersion: Int = js.native

  /**
   * Returns the old version of the database.
   *
   * MDN
   */
  def oldVersion: Int = js.native
}


/**
 * The IDBIndex interface of the IndexedDB API provides asynchronous access
 * to an index in a database. An index is a kind of object store for looking
 * up records in another object store, called the referenced object store.
 * You use this interface to retrieve data.
 *
 * You can retrieve records in an object store through their keys or by using
 * an index (cursors provide a third way: see IDBCursor). An index lets you
 * look up records in an object store using properties of the values in the
 * object stores records.
 *
 * The index is a persistent key-value storage where the value part of its
 * records is the key part of a record in the referenced object store. The
 * records in an index are automatically populated whenever records in the
 * referenced object store are inserted, updated, or deleted. Each record in
 * an index can point to only one record in its referenced object store, but
 * several indexes can reference the same object store. When the object store
 * changes, all indexes that refers to the object store are automatically
 * updated.
 *
 * MDN
 */
class IDBIndex extends js.Object {
  /**
   * If true, this index does not allow duplicate values for a key.
   *
   * MDN
   */
  def unique: Boolean = js.native

  def name: String = js.native

  /**
   * The key path of this index. If null, this index is not auto-populated.
   *
   * MDN
   */
  def keyPath: String = js.native

  /**
   * The name of the object store referenced by this index.
   *
   * MDN
   */
  def objectStore: IDBObjectStore = js.native

  def count(key: js.Any): IDBRequest = js.native

  /**
   * If you want to see how many records are between keys 1000 and 2000 in an object store,
   * you can write the following:
   *
   * MDN
   */
  def count(): IDBRequest = js.native

  /**
   * Returns an IDBRequest object, and, in a separate thread, finds either the given key
   * or the primary key, if key is a key range.
   *
   * MDN
   */
  def getKey(key: js.Any): IDBRequest = js.native
  /**
   * Returns an IDBRequest object, and, in a separate thread, creates a cursor over the
   * specified key range, as arranged by this index.
   *
   * MDN
   */
  def openKeyCursor(range: IDBKeyRange = js.native, direction: String = js.native): IDBRequest = js.native

  /**
   * Returns an IDBRequest object, and, in a separate thread, finds either the value in
   * the referenced object store that corresponds to the given key or the first
   * corresponding value, if key is a key range.
   *
   * MDN
   */
  def get(key: js.Any): IDBRequest = js.native
  /**
   * The method sets the position of the cursor to the appropriate record, based on the
   * specified direction.
   *
   * MDN
   */
  def openCursor(range: IDBKeyRange = js.native, direction: String = js.native): IDBRequest = js.native

}


/**
 * The IDBCursor interface of the IndexedDB API represents a cursor for traversing
 * or iterating over multiple records in a database.
 *
 * The cursor has a source that indicates which index or object store it is iterating.
 * It has a position within the range, and moves in a direction that is increasing or
 * decreasing in the order of record keys. The cursor enables an application to
 * asynchronously process all the records in the cursor's range.
 *
 * MDN
 */
class IDBCursor extends js.Object {
  /**
   * On getting, this object returns the IDBObjectStore or IDBIndex that the cursor is
   * iterating. This function never returns null or throws an exception, even if the
   * cursor is currently being iterated, has iterated past its end, or its transaction
   * is not active.
   *
   * MDN
   */
  def source: js.Any = js.native

  /**
   * Is a DOMString that, on getting, returns the direction of traversal of the cursor.
   * See Constants for possible values.
   *
   * MDN
   */
  def direction: String = js.native

  /**
   * Returns the key for the record at the cursor's position. If the cursor is outside its
   * range, this is set to undefined. The cursor's key can be any data type.
   *
   * MDN
   */
  def key: js.Any = js.native

  /**
   * Returns the cursor's current effective key. If the cursor is currently being
   * iterated or has iterated outside its range, this is set to undefined. The cursor's
   * primary key can be any data type.
   *
   * MDN
   */
  def primaryKey: js.Any = js.native

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def advance(count: Int): Unit = js.native

  /**
   * Sets cursor to key if specified, otherwise advances cursor by one.
   *
   * @note calling this method twice from the same onsuccess handler results
   *       in a InvalidStateError DOMException being thrown on the second call
   *
   * W3C
   */
  def continue(key: js.Any = ???): Unit = js.native

  /**
   * Returns an IDBRequest object, and, in a separate thread, deletes the record at the
   * cursor's position, without changing the cursor's position.
   *
   * MDN
   */
  def delete(): IDBRequest = js.native

  /**
   * Returns an IDBRequest object, and, in a separate thread, updates the value at the
   * current position of the cursor in the object store.
   *
   * MDN
   */
  def update(value: js.Any): IDBRequest = js.native

}

object IDBCursor extends js.Object {

  val PREV: String = js.native
  val PREV_NO_DUPLICATE: String = js.native
  val NEXT: String = js.native
  val NEXT_NO_DUPLICATE: String = js.native
}

/**
 * Same as IDBCursor with the value property.
 *
 * MDN
 */
class IDBCursorWithValue extends IDBCursor {
  def value: js.Any = js.native
}


/**
 * The IDBEvironment interface of the IndexedDB API provides asynchronous access
 * to a client-side database. It is implemented by window and Worker objects.
 *
 * MDN
 */
trait IDBEnvironment extends js.Object {

  /**
   * an IDBRequest object that communicates back to the requesting application
   * through events. This design means that any number of requests can be active on any
   * database at a time.
   *
   * MDN
   */
  def indexedDB: IDBFactory = js.native
}

/**
 * The IDBKeyRange interface of the IndexedDB API represents a continuous interval
 * over some data type that is used for keys. Records can be retrieved from object
 * stores and indexes using keys or a range of keys. You can limit the range using
 * lower and upper bounds. For example, you can iterate over all values of a key
 * between x and y.
 *
 * A key range can have a single value or a range with upper and lower bounds or
 * endpoints. If the key range has both upper and lower bounds, then it is bounded; if it
 * has no bounds, it is unbounded. A bounded key range can either be open (the endpoints
 * are excluded) or closed (the endpoints are included). To retrieve all keys within a
 * certain range, you can use the following code constructs:
 *
 * MDN
 */
class IDBKeyRange extends js.Object {
  /**
   * The upper bound of the key range (can be any type.)
   *
   * MDN
   */
  def upper: js.Any = js.native

  /**
   * Returns false if the upper-bound value is included in the key range.
   *
   * MDN
   */
  def upperOpen: Boolean = js.native

  /**
   * The lower bound of the key range (can be any type.)
   *
   * MDN
   */
  def lower: js.Any = js.native

  /**
   * Returns false if the lower-bound value is included in the key range.
   *
   * MDN
   */
  def lowerOpen: Boolean = js.native
}

object IDBKeyRange extends js.Object {
  /**
   * The bounds can be open (that is, the bounds exclude the endpoint values) or closed
   * (that is, the bounds include the endpoint values). By default, the bounds are
   * closed.
   *
   * MDN
   */
  def bound(lower: js.Any, upper: js.Any, lowerOpen: Boolean = js.native, upperOpen: Boolean = js.native): IDBKeyRange = js.native


  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def only(value: js.Any): IDBKeyRange = js.native
  /**
   * By default, it includes the lower endpoint value and is closed.
   *
   * MDN
   */
  def lowerBound(bound: js.Any, open: Boolean = js.native): IDBKeyRange = js.native

  /**
   * By default, it includes the upper endpoint value and is closed.
   *
   * MDN
   */
  def upperBound(bound: js.Any, open: Boolean = js.native): IDBKeyRange = js.native
}


/**
 * The IDBTransaction interface of the IndexedDB API provides a static,
 * asynchronous transaction on a database using event handler attributes. All
 * reading and writing of data are done within transactions. You actually use
 * IDBDatabase to start transactions and use IDBTransaction to set the mode of
 * the transaction and access an object store and make your request. You can
 * also use it to abort transactions.
 *
 * MDN
 */
class IDBTransaction extends EventTarget {
  /**
   * The event handler for the oncomplete event.
   *
   * MDN
   */
  var oncomplete: js.Function1[Event, _] = js.native

  /**
   * The database connection with which this transaction is associated.
   *
   * MDN
   */
  def db: IDBDatabase = js.native

  /**
   * The mode for isolating access to data in the object stores that are in the scope of the
   * transaction. For possible values, see Constants. The default value is readonly.
   *
   * MDN
   */
  def mode: String = js.native

  /**
   * The error returned in the event of an unsuccessful transaction. Null if the
   * transaction is not finished, is finished and successfully committed, or was
   * aborted with IDBTransaction.abort function. Returns the same DOMError as the
   * request object which caused the transaction to be aborted due to a failed request,
   * or a DOMError for the transaction failure not due to a failed request (such as
   * QuotaExceededError or UnknownError).
   *
   * MDN
   */
  def error: DOMError = js.native

  /**
   * The event handler for the onerror event.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native
  /**
   * The event handler for the onabort event.
   *
   * MDN
   */
  var onabort: js.Function1[Event, _] = js.native

  /**
   * Returns immediately, and rolls back all the changes to objects in the database
   * associated with this transaction. If this transaction has been aborted or
   * completed, then this method throws an error event.
   *
   * MDN
   */
  def abort(): Unit = js.native

  /**
   * Every call to this method on the same transaction object, with the same name,
   * returns the same IDBObjectStore instance. If this method is called on a different
   * transaction object, a different IDBObjectStore instance is returned.
   *
   * MDN
   */
  def objectStore(name: String): IDBObjectStore = js.native


}

object IDBTransaction extends js.Object {
  /**
   * Allows data to be read but not changed.
   *
   * MDN
   */
  val READ_ONLY: String = js.native
  /**
   * Allows any operation to be performed, including ones that delete and create object
   * stores and indexes. This mode is for updating the version number of transactions
   * that were started using the setVersion() method of IDBDatabase objects.
   * Transactions of this mode cannot run concurrently with other transactions.
   *
   * MDN
   */
  val VERSION_CHANGE: String = js.native
  /**
   * Allows reading and writing of data in existing data stores to be changed.
   *
   * MDN
   */
  val READ_WRITE: String = js.native
}

/**
 * The IDBDatabase interface of the IndexedDB API provides asynchronous access
 * to a connection to a database. Use it to create, manipulate, and delete
 * objects in that database. The interface also provides the only way to get a
 * transaction and manage versions on that database.
 *
 * Everything you do in IndexedDB always happens in the context of a transaction,
 * representing interactions with data in the database. All objects in
 * IndexedDB—including object stores, indexes, and cursors—are tied to a
 * particular transaction. Thus, you cannot execute commands, access data, or open
 * anything outside of a transaction.
 *
 * MDN
 */
class IDBDatabase extends EventTarget {
  /**
   * A 64-bit integer that contains the version of the connected database.
   * When a database is first created or upgraded you should use
   * [[org.scalajs.dom.IDBVersionChangeEvent#newVersion]] instead.
   * Webkit returns always integer and the value is 1 when
   * database is first created.
   */
  def version: Int = js.native

  /**
   * A DOMString that contains the name of the connected database.
   *
   * MDN
   */
  def name: String = js.native

  /**
   * A DOMStringList that contains a list of the names of the object stores currently in
   * the connected database.
   *
   * MDN
   */
  def objectStoreNames: DOMStringList = js.native

  /**
   * Fires when access to the database fails.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native
  /**
   * Fires when access of the database is aborted.
   *
   * MDN
   */
  var onabort: js.Function1[Event, _] = js.native
  /**
   * The method takes the name of the store as well as a parameter object. The parameter
   * object lets you define important optional properties. You can use the property to
   * uniquely identify individual objects in the store. As the property is an
   * identifier, it should be unique to every object, and every object should have that
   * property.
   *
   * MDN
   */
  def createObjectStore(name: String, optionalParameters: js.Any = js.native): IDBObjectStore = js.native


  /**
   * The connection is not actually closed until all transactions created using this
   * connection are complete. No new transactions can be created for this connection
   * once this method is called. Methods that create transactions throw an exception if
   * a closing operation is pending.
   *
   * MDN
   */
  def close(): Unit = js.native
  /**
   * Immediately returns a transaction object (IDBTransaction) containing the
   * IDBTransaction.objectStore method, which you can use to access your object
   * store. Runs in a separate thread.
   *
   * MDN
   */
  def transaction(storeNames: js.Any, mode: String = js.native): IDBTransaction = js.native


  /**
   * As with createObjectStore, this method can be called only within a versionchange
   * transaction. So for WebKit browsers you must call the
   * IDBVersionChangeRequest.setVersion method first before you can remove any
   * object store or index.
   *
   * MDN
   */
  def deleteObjectStore(name: String): Unit = js.native


}


/**
 * The IDBOpenDBRequest interface of the IndexedDB API provides access to results
 * of requests to open databases using specific event handler attributes.
 *
 * MDN
 */
class IDBOpenDBRequest extends IDBRequest {
  /**
   * The event handler for the upgradeneeded event, fired when a database of a bigger
   * version number than the existing stored database is loaded.
   *
   * MDN
   */
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, _] = js.native
  /**
   * The event handler for the blocked event. This event is triggered when the
   * upgradeneeded should be triggered because of a version change but the database is
   * still in use (ie not closed) somewhere, even after the versionchange event was
   * sent.
   *
   * MDN
   */
  var onblocked: js.Function1[Event, _] = js.native


}


/**
 * The IDBFactory interface of the IndexedDB API lets applications asynchronously
 * access the indexed databases. The object that implements the interface is
 * window.indexedDB. You open — that is, create and access — and delete a
 * database with the object and not directly with IDBFactory.
 *
 * MDN
 */
class IDBFactory extends js.Object {
  def open(name: String, version: Int): IDBOpenDBRequest = js.native

  /**
   * An obsolete method to request opening a connection to a database, still
   * implemented by some browsers.
   *
   * MDN
   */
  def open(name: String): IDBOpenDBRequest = js.native

  /**
   * A method that compares two keys and returns a result indicating which one is greater
   * in value.
   *
   * MDN
   */
  def cmp(first: js.Any, second: js.Any): Int = js.native

  /**
   * The deletion operation (performed in a different thread) consists of the
   * following steps:
   *
   * MDN
   */
  def deleteDatabase(name: String): IDBOpenDBRequest = js.native
}


/**
 * The IDBRequest interface of the IndexedDB API provides access to results of
 * asynchronous requests to databases and database objects using event handler
 * attributes. Each reading and writing operation on a database is done using
 * a request.
 *
 * The request object does not initially contain any information about the result of
 * the operation, but once information becomes available, an event is fired on the
 * request, and the information becomes available through the properties of the
 * IDBRequest instance.
 *
 * MDN
 */
class IDBRequest extends EventTarget {
  /**
   * The source of the request, such as an Index or a ObjectStore. If no source exists
   * (such as when calling IDBFactory.open), it returns null.
   *
   * MDN
   */
  def source: js.Any = js.native

  /**
   * The event handler for the success event.
   *
   * MDN
   */
  var onsuccess: js.Function1[Event, _] = js.native

  /**
   * A DOMError containing the relevant error. The following error codes are returned
   * under certain conditions:
   *
   * MDN
   */
  def error: DOMError = js.native

  /**
   * The transaction for the request. This property can be null for certain requests,
   * such as for request returned from IDBFactory.open (You're just connecting to a
   * database, so there is no transaction to return).
   *
   * MDN
   */
  def transaction: IDBTransaction = js.native

  /**
   * The event handler for the error event.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _] = js.native

  /**
   * The state of the request. Every request starts in the pending state. The state
   * changes to done when the request completes successfully or when an error occurs.
   *
   * MDN
   */
  def readyState: String = js.native

  /**
   * Returns the result of the request. If the the request failed and the result is not
   * available, the InvalidStateError exception is thrown.
   *
   * MDN
   */
  def result: js.Any = js.native


}

