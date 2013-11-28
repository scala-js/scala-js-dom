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
  var indexNames: DOMStringList = _
  var name: js.String = _
  /**
   * The name of the transaction to which this object store belongs.
   *
   * MDN
   */
  var transaction: IDBTransaction = _
  /**
   * The key path of this object store. If this attribute is null, the application must
   * provide a key for each modification operation.
   *
   * MDN
   */
  var keyPath: js.String = _

  def count(key: js.Any): IDBRequest = ???

  def count(): IDBRequest = ???

  def add(value: js.Any, key: js.Any): IDBRequest = ???

  /**
   * To determine if the add operation has completed successfully, listen for the
   * transaction’s complete event in addition to the IDBObjectStore.add request’s
   * success event, because the transaction may still fail after the success event
   * fires. In other words, the success event is only triggered when the transaction has
   * been successfully queued.
   *
   * MDN
   */
  def add(value: js.Any): IDBRequest = ???

  /**
   * Clearing an object store consists of removing all records from the object store and
   * removing all records in indexes that reference the object store.
   *
   * MDN
   */
  def clear(): IDBRequest = ???

  def createIndex(name: js.String, keyPath: js.String, optionalParameters: js.Any): IDBIndex = ???

  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback.
   *
   * MDN
   */
  def createIndex(name: js.String, keyPath: js.String): IDBIndex = ???

  def put(value: js.Any, key: js.Any): IDBRequest = ???

  /**
   * If the record is successfully stored, then a success event is fired on the returned
   * request object with the result set to the key for the stored record, and the
   * transaction set to the transaction in which this object store is opened.
   *
   * MDN
   */
  def put(value: js.Any): IDBRequest = ???

  def openCursor(range: js.Any, direction: js.String): IDBRequest = ???

  def openCursor(range: js.Any): IDBRequest = ???

  def openCursor(): IDBRequest = ???

  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback. Note that this method synchronously modifies the
   * IDBObjectStore.indexNames property.
   *
   * MDN
   */
  def deleteIndex(indexName: js.String): Unit = ???

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def index(name: js.String): IDBIndex = ???

  /**
   * If a value is successfully found, then a structured clone of it is created and set as
   * the result of the request object.
   *
   * MDN
   */
  def get(key: js.Any): IDBRequest = ???

  /**
   * returns an IDBRequest object, and, in a separate thread, deletes the current
   * object store.
   *
   * MDN
   */
  def delete(key: js.Any): IDBRequest = ???
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
  var newVersion: js.Number = _
  /**
   * Returns the old version of the database.
   *
   * MDN
   */
  var oldVersion: js.Number = _
}


/**
 * You can retrieve records in an object store either through their keys or by using an
 * index. An index lets you look up records in an object store using properties of the
 * values in the object stores records.
 *
 * MDN
 */
class IDBIndex extends js.Object {
  /**
   * If true, this index does not allow duplicate values for a key.
   *
   * MDN
   */
  var unique: js.Boolean = _
  var name: js.String = _
  /**
   * The key path of this index. If null, this index is not auto-populated.
   *
   * MDN
   */
  var keyPath: js.String = _
  /**
   * The name of the object store referenced by this index.
   *
   * MDN
   */
  var objectStore: IDBObjectStore = _

  def count(key: js.Any): IDBRequest = ???

  /**
   * If you want to see how many records are between keys 1000 and 2000 in an object store,
   * you can write the following:
   *
   * MDN
   */
  def count(): IDBRequest = ???

  /**
   * Returns an IDBRequest object, and, in a separate thread, finds either the given key
   * or the primary key, if key is a key range.
   *
   * MDN
   */
  def getKey(key: js.Any): IDBRequest = ???

  def openKeyCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???

  def openKeyCursor(range: IDBKeyRange): IDBRequest = ???

  /**
   * Returns an IDBRequest object, and, in a separate thread, creates a cursor over the
   * specified key range, as arranged by this index.
   *
   * MDN
   */
  def openKeyCursor(): IDBRequest = ???

  /**
   * Returns an IDBRequest object, and, in a separate thread, finds either the value in
   * the referenced object store that corresponds to the given key or the first
   * corresponding value, if key is a key range.
   *
   * MDN
   */
  def get(key: js.Any): IDBRequest = ???

  def openCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???

  def openCursor(range: IDBKeyRange): IDBRequest = ???

  /**
   * The method sets the position of the cursor to the appropriate record, based on the
   * specified direction.
   *
   * MDN
   */
  def openCursor(): IDBRequest = ???
}


/**
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
  var source: js.Any = _
  /**
   * Is a DOMString that, on getting, returns the direction of traversal of the cursor.
   * See Constants for possible values.
   *
   * MDN
   */
  var direction: js.String = _
  /**
   * Returns the key for the record at the cursor's position. If the cursor is outside its
   * range, this is set to undefined. The cursor's key can be any data type.
   *
   * MDN
   */
  var key: js.Any = _
  /**
   * Returns the cursor's current effective key. If the cursor is currently being
   * iterated or has iterated outside its range, this is set to undefined. The cursor's
   * primary key can be any data type.
   *
   * MDN
   */
  var primaryKey: js.Any = _

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def advance(count: js.Number): Unit = ???

  /**
   * Returns an IDBRequest object, and, in a separate thread, deletes the record at the
   * cursor's position, without changing the cursor's position.
   *
   * MDN
   */
  def delete(): IDBRequest = ???

  /**
   * Returns an IDBRequest object, and, in a separate thread, updates the value at the
   * current position of the cursor in the object store.
   *
   * MDN
   */
  def update(value: js.Any): IDBRequest = ???

  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}

/**
 * The cursor has a source that indicates which index or object store it is iterating.
 * It has a position within the range, and moves in a direction that is increasing or
 * decreasing in the order of record keys. The cursor enables an application to
 * asynchronously process all the records in the cursor's range.
 *
 * MDN
 */
object IDBCursor extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBCursor),List())))) */
  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}

/**
 * Same as IDBCursor with the value property.
 *
 * MDN
 */
class IDBCursorWithValue extends IDBCursor {
  var value: js.Any = _
}


/**
 * The following code opens a database asynchronously and makes a request.
 *
 * MDN
 */
trait IDBEnvironment extends js.Object {
  var msIndexedDB: IDBFactory = _
  /**
   * an IDBRequest object that communicates back to the requesting application
   * through events. This design means that any number of requests can be active on any
   * database at a time.
   *
   * MDN
   */
  var indexedDB: IDBFactory = _
}

/**
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
  var upper: js.Any = _
  /**
   * Returns false if the upper-bound value is included in the key range.
   *
   * MDN
   */
  var upperOpen: js.Boolean = _
  /**
   * The lower bound of the key range (can be any type.)
   *
   * MDN
   */
  var lower: js.Any = _
  /**
   * Returns false if the lower-bound value is included in the key range.
   *
   * MDN
   */
  var lowerOpen: js.Boolean = _

  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean, upperOpen: js.Boolean): IDBKeyRange = ???

  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean): IDBKeyRange = ???

  /**
   * The bounds can be open (that is, the bounds exclude the endpoint values) or closed
   * (that is, the bounds include the endpoint values). By default, the bounds are
   * closed.
   *
   * MDN
   */
  def bound(lower: js.Any, upper: js.Any): IDBKeyRange = ???

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def only(value: js.Any): IDBKeyRange = ???

  def lowerBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???

  /**
   * By default, it includes the lower endpoint value and is closed.
   *
   * MDN
   */
  def lowerBound(bound: js.Any): IDBKeyRange = ???

  def upperBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???

  /**
   * By default, it includes the upper endpoint value and is closed.
   *
   * MDN
   */
  def upperBound(bound: js.Any): IDBKeyRange = ???
}


/**
 * The following are key concepts that you must understand when accessing data in
 * IndexedDB:
 *
 * MDN
 */
class IDBTransaction extends EventTarget {
  /**
   * The event handler for the oncomplete event.
   *
   * MDN
   */
  var oncomplete: js.Function1[Event, js.Any] = _
  /**
   * The database connection with which this transaction is associated.
   *
   * MDN
   */
  var db: IDBDatabase = _
  /**
   * The mode for isolating access to data in the object stores that are in the scope of the
   * transaction. For possible values, see Constants. The default value is readonly.
   *
   * MDN
   */
  var mode: js.String = _
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
  var error: DOMError = _
  /**
   * The event handler for the onerror event.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  /**
   * The event handler for the onabort event.
   *
   * MDN
   */
  var onabort: js.Function1[js.Any, js.Any] = _

  /**
   * Returns immediately, and rolls back all the changes to objects in the database
   * associated with this transaction. If this transaction has been aborted or
   * completed, then this method throws an error event.
   *
   * MDN
   */
  def abort(): Unit = ???

  /**
   * Every call to this method on the same transaction object, with the same name,
   * returns the same IDBObjectStore instance. If this method is called on a different
   * transaction object, a different IDBObjectStore instance is returned.
   *
   * MDN
   */
  def objectStore(name: js.String): IDBObjectStore = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???

  var READ_ONLY: js.String = _
  var VERSION_CHANGE: js.String = _
  var READ_WRITE: js.String = _
}

/**
 * The following are key concepts that you must understand when accessing data in
 * IndexedDB:
 *
 * MDN
 */
object IDBTransaction extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBTransaction),List())))) */
  /**
   * Allows data to be read but not changed.
   *
   * MDN
   */
  var READ_ONLY: js.String = _
  /**
   * Allows any operation to be performed, including ones that delete and create object
   * stores and indexes. This mode is for updating the version number of transactions
   * that were started using the setVersion() method of IDBDatabase objects.
   * Transactions of this mode cannot run concurrently with other transactions.
   *
   * MDN
   */
  var VERSION_CHANGE: js.String = _
  /**
   * Allows reading and writing of data in existing data stores to be changed.
   *
   * MDN
   */
  var READ_WRITE: js.String = _
}

/**
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
   * A 64-bit integer that contains the version of the connected database. When a
   * database is first created, this attribute is the empty string.
   *
   * MDN
   */
  var version: js.String = _
  /**
   * A DOMString that contains the name of the connected database.
   *
   * MDN
   */
  var name: js.String = _
  /**
   * A DOMStringList that contains a list of the names of the object stores currently in
   * the connected database.
   *
   * MDN
   */
  var objectStoreNames: DOMStringList = _
  /**
   * Fires when access to the database fails.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  /**
   * Fires when access of the database is aborted.
   *
   * MDN
   */
  var onabort: js.Function1[js.Any, js.Any] = _

  def createObjectStore(name: js.String, optionalParameters: js.Any): IDBObjectStore = ???

  /**
   * The method takes the name of the store as well as a parameter object. The parameter
   * object lets you define important optional properties. You can use the property to
   * uniquely identify individual objects in the store. As the property is an
   * identifier, it should be unique to every object, and every object should have that
   * property.
   *
   * MDN
   */
  def createObjectStore(name: js.String): IDBObjectStore = ???

  /**
   * The connection is not actually closed until all transactions created using this
   * connection are complete. No new transactions can be created for this connection
   * once this method is called. Methods that create transactions throw an exception if
   * a closing operation is pending.
   *
   * MDN
   */
  def close(): Unit = ???

  def transaction(storeNames: js.Any, mode: js.String): IDBTransaction = ???

  /**
   * Immediately returns a transaction object (IDBTransaction) containing the
   * IDBTransaction.objectStore method, which you can use to access your object
   * store. Runs in a separate thread.
   *
   * MDN
   */
  def transaction(storeNames: js.Any): IDBTransaction = ???

  /**
   * As with createObjectStore, this method can be called only within a versionchange
   * transaction. So for WebKit browsers you must call the
   * IDBVersionChangeRequest.setVersion method first before you can remove any
   * object store or index.
   *
   * MDN
   */
  def deleteObjectStore(name: js.String): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * In the following code snippet, we open a database asynchronously and make a
 * request. Event handlers are registered for responding to various situations.
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
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, js.Any] = _
  /**
   * The event handler for the blocked event. This event is triggered when the
   * upgradeneeded should be triggered because of a version change but the database is
   * still in use (ie not closed) somewhere, even after the versionchange event was
   * sent.
   *
   * MDN
   */
  var onblocked: js.Function1[Event, js.Any] = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
 * In the following code snippet, we open a database asynchronously and make a
 * request. Event handlers are registered for responding to various situations.
 *
 * MDN
 */
class IDBFactory extends js.Object {
  def open(name: js.String, version: js.Number): IDBOpenDBRequest = ???

  /**
   * An obsolete method to request opening a connection to a database, still
   * implemented by some browsers.
   *
   * MDN
   */
  def open(name: js.String): IDBOpenDBRequest = ???

  /**
   * A method that compares two keys and returns a result indicating which one is greater
   * in value.
   *
   * MDN
   */
  def cmp(first: js.Any, second: js.Any): js.Number = ???

  /**
   * The deletion operation (performed in a different thread) consists of the
   * following steps:
   *
   * MDN
   */
  def deleteDatabase(name: js.String): IDBOpenDBRequest = ???
}


/**
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
  var source: js.Any = _
  /**
   * The event handler for the success event.
   *
   * MDN
   */
  var onsuccess: js.Function1[Event, js.Any] = _
  /**
   * A DOMError containing the relevant error. The following error codes are returned
   * under certain conditions:
   *
   * MDN
   */
  var error: DOMError = _
  /**
   * The transaction for the request. This property can be null for certain requests,
   * such as for request returned from IDBFactory.open (You're just connecting to a
   * database, so there is no transaction to return).
   *
   * MDN
   */
  var transaction: IDBTransaction = _
  /**
   * The event handler for the error event.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  /**
   * The state of the request. Every request starts in the pending state. The state
   * changes to done when the request completes successfully or when an error occurs.
   *
   * MDN
   */
  var readyState: js.String = _
  /**
   * Returns the result of the request. If the the request failed and the result is not
   * available, the InvalidStateError exception is thrown.
   *
   * MDN
   */
  var result: js.Any = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

