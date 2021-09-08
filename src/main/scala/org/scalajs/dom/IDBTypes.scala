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

/** @tparam A Type of `.target.result` */
@js.native
@JSGlobal("Event")
class IDBEvent[+A](typeArg: String, init: js.UndefOr[EventInit] = js.undefined) extends Event(typeArg, init) {
  override def target: IDBEventTarget[A] = js.native
}

@js.native
@JSGlobal("EventTarget")
class IDBEventTarget[+A] extends EventTarget {
  def result: A = js.native
}

/** IndexedDB transaction mode Provides constants for IDB Transaction modes These constants have been removed from
  * browser support and replaced by String values
  */
@js.native
sealed trait IDBTransactionMode extends js.Any

object IDBTransactionMode {

  /** Allows data to be read but not changed. It is the default transaction mode. */
  @inline def readonly: IDBTransactionMode = "readonly".asInstanceOf[IDBTransactionMode]

  /** Allows any operation to be performed, including ones that delete and create object stores and indexes. This mode
    * is for updating the version number of transactions that were started using the setVersion() method of IDBDatabase
    * objects. Transactions of this mode cannot run concurrently with other transactions.
    */
  @inline def versionchange: IDBTransactionMode = "versionchange".asInstanceOf[IDBTransactionMode]

  /** Allows reading and writing of data in existing data stores to be changed. */
  @inline def readwrite: IDBTransactionMode = "readwrite".asInstanceOf[IDBTransactionMode]
}

@js.native
sealed trait IDBTransactionDurability extends js.Any

object IDBTransactionDurability {
  @inline def default: IDBTransactionDurability = "default".asInstanceOf[IDBTransactionDurability]
  @inline def strict: IDBTransactionDurability = "strict".asInstanceOf[IDBTransactionDurability]
  @inline def relaxed: IDBTransactionDurability = "relaxed".asInstanceOf[IDBTransactionDurability]
}

/** Common members shared between [[IDBObjectStore]] and [[IDBIndex]].
  *
  * @tparam S
  *   The type of `.source`
  */
@js.native
trait IDBStoreLike[S] extends js.Object {

  def count(query: IDBKey | IDBKeyRange = js.native): IDBRequest[S, Int] = js.native

  /** Returns an [[IDBRequest]] object, and, in a separate thread, returns the object store selected by the specified
    * key. This is for retrieving specific records from an object store.
    *
    * Note: This method produces the same result for: a) a record that doesn't exist in the database and b) a record
    * that has an undefined value. To tell these situations apart, call the [[openCursor()]] method with the same key.
    * That method provides a cursor if the record exists, and no cursor if it does not.
    */
  def get(key: IDBKey | IDBKeyRange): IDBRequest[S, IDBValue] = js.native

  /** Returns an [[IDBRequest]] object containing all objects in the object store matching the specified parameter or
    * all objects in the store if no parameters are given.
    *
    * If a value is successfully found, then a structured clone of it is created and set as the result of the request
    * object.
    *
    * This method produces the same result for:
    *
    *   - a record that doesn't exist in the database
    *   - a record that has an undefined value
    *
    * To tell these situations apart, you either call
    *
    *   - the [[openCursor()]] method with the same key. That method provides a cursor if the record exists, and no
    *     cursor if it does not.
    *   - the [[count()]] method with the same key, which will return 1 if the row exists and 0 if it doesn't.
    */
  def getAll(query: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      count: js.UndefOr[Int] = js.native): IDBRequest[S, js.Array[IDBValue]] = js.native

  /** Returns an [[IDBRequest]] object retrieves record keys for all objects in the object store matching the specified
    * parameter or all objects in the store if no parameters are given.
    *
    * If a value is successfully found, then a structured clone of it is created and set as the result of the request
    * object.
    *
    * This method produces the same result for:
    *
    *   - a record that doesn't exist in the database
    *   - a record that has an undefined value
    *
    * To tell these situations apart, you need to call the [[openCursor()]] method with the same key. That method
    * provides a cursor if the record exists, and no cursor if it does not.
    */
  def getAllKeys(query: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      count: js.UndefOr[Int] = js.native): IDBRequest[S, js.Array[IDBKey]] = js.native

  /** Returns an [[IDBRequest]] object, and, in a separate thread, returns the key selected by the specified query. This
    * is for retrieving specific records from an object store.
    */
  def getKey(key: IDBKey): IDBRequest[S, js.UndefOr[IDBKey]] = js.native

  /** The key path of this object store. If this attribute is null, the application must provide a key for each
    * modification operation.
    */
  def keyPath: IDBKeyPath = js.native

  def name: String = js.native

  /** The method sets the position of the cursor to the appropriate record, based on the specified direction.
    *
    * @return
    *   [[IDBRequest]] with the `target` value being a new cursor or `null`.
    */
  def openCursor(range: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      direction: js.UndefOr[IDBCursorDirection] = js.native): IDBRequest[S, IDBCursor[S]] = js.native

  /** The method sets the position of the cursor to the appropriate key, based on the specified direction.
    *
    * @return
    *   [[IDBRequest]] with the `target` value being a new cursor or `null`.
    */
  def openKeyCursor(range: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      direction: js.UndefOr[IDBCursorDirection] = js.native): IDBRequest[S, IDBCursorReadOnly[S]] = js.native
}

/** The IDBObjectStore interface of the IndexedDB API represents an object store in a database. Records within an object
  * store are sorted according to their keys. This sorting enables fast insertion, look-up, and ordered retrieval.
  */
@js.native
@JSGlobal
class IDBObjectStore extends IDBStoreLike[IDBObjectStore] {

  /** To determine if the add operation has completed successfully, listen for the transaction’s complete event in
    * addition to the IDBObjectStore.add request’s success event, because the transaction may still fail after the
    * success event fires. In other words, the success event is only triggered when the transaction has been
    * successfully queued.
    *
    * @return
    *   [[IDBRequest]] with the key as the `target` value
    */
  def add(value: IDBValue, key: IDBKey = js.native): IDBRequest[IDBObjectStore, IDBKey] = js.native

  /** Clearing an object store consists of removing all records from the object store and removing all records in
    * indexes that reference the object store.
    */
  def clear(): IDBRequest[IDBObjectStore, Unit] = js.native

  /** Note that this method must be called only from a VersionChange transaction mode callback. */
  def createIndex(name: String, keyPath: IDBKeyPath,
      optionalParameters: IDBCreateIndexOptions = js.native): IDBIndex = js.native

  /** Returns an [[IDBRequest]] object, and, in a separate thread, deletes the specified record or records.
    *
    * Either a key or an [[IDBKeyRange]] can be passed, allowing one or multiple records to be deleted from a store. To
    * delete all records in a store, use [[clear()]].
    *
    * Bear in mind that if you are using an [[IDBCursor]], you can use the [[IDBCursor.delete()]] method to more
    * efficiently delete the current record — without having to explicitly look up the record's key.
    */
  def delete(key: IDBKey | IDBKeyRange): IDBRequest[IDBObjectStore, Unit] = js.native

  /** Note that this method must be called only from a VersionChange transaction mode callback. Note that this method
    * synchronously modifies the IDBObjectStore.indexNames property.
    */
  def deleteIndex(indexName: String): Unit = js.native

  /** This method may raise a DOMException of one of the following types: */
  def index(name: String): IDBIndex = js.native

  /** A list of the names of indexes on objects in this object store. */
  def indexNames: DOMStringList = js.native

  /** If the record is successfully stored, then a success event is fired on the returned request object with the result
    * set to the key for the stored record, and the transaction set to the transaction in which this object store is
    * opened.
    *
    * @return
    *   [[IDBRequest]] with the key as the `target` value
    */
  def put(value: IDBValue, key: IDBKey = js.native): IDBRequest[IDBObjectStore, IDBKey] = js.native

  /** The name of the transaction to which this object store belongs. */
  def transaction: IDBTransaction = js.native
}

trait IDBVersionChangeEventInit extends EventInit {
  var newVersion: js.UndefOr[Integer] = js.undefined
  var oldVersion: js.UndefOr[Int] = js.undefined
}

/** The specification has changed and some not up-to-date browsers only support the deprecated unique attribute,
  * version, from an early draft version.
  */
@js.native
@JSGlobal
class IDBVersionChangeEvent(typeArg: String, init: js.UndefOr[IDBVersionChangeEventInit])
    extends IDBEvent[IDBDatabase](typeArg, init) {

  /** Returns the new version of the database.
    *
    * This is null when the database is being deleted.
    */
  def newVersion: Integer = js.native

  /** Returns the old version of the database. */
  def oldVersion: Int = js.native
}

/** The IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a
  * kind of object store for looking up records in another object store, called the referenced object store. You use
  * this interface to retrieve data.
  *
  * You can retrieve records in an object store through their keys or by using an index (cursors provide a third way:
  * see IDBCursor). An index lets you look up records in an object store using properties of the values in the object
  * stores records.
  *
  * The index is a persistent key-value storage where the value part of its records is the key part of a record in the
  * referenced object store. The records in an index are automatically populated whenever records in the referenced
  * object store are inserted, updated, or deleted. Each record in an index can point to only one record in its
  * referenced object store, but several indexes can reference the same object store. When the object store changes, all
  * indexes that refers to the object store are automatically updated.
  */
@js.native
@JSGlobal
class IDBIndex extends IDBStoreLike[IDBIndex] {

  /** The name of the object store referenced by this index. */
  def objectStore: IDBObjectStore = js.native

  /** Returns a boolean value that affects how the index behaves when the result of evaluating the index's key path
    * yields an array.
    *
    * This is decided when the index is created, using the `IDBObjectStore.createIndex` method. This method takes an
    * optional options parameter whose `multiEntry` property is set to `true`/`false`.
    */
  val multiEntry: Boolean = js.native

  /** If true, this index does not allow duplicate values for a key. */
  def unique: Boolean = js.native
}

/** The IDBCursor interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records
  * in a database.
  *
  * The cursor has a source that indicates which index or object store it is iterating. It has a position within the
  * range, and moves in a direction that is increasing or decreasing in the order of record keys. The cursor enables an
  * application to asynchronously process all the records in the cursor's range.
  */
@js.native
@JSGlobal
class IDBCursorReadOnly[+S] extends js.Object {

  /** On getting, this object returns the IDBObjectStore or IDBIndex that the cursor is iterating. This function never
    * returns null or throws an exception, even if the cursor is currently being iterated, has iterated past its end, or
    * its transaction is not active.
    */
  def source: S = js.native

  /** Is a DOMString that, on getting, returns the direction of traversal of the cursor. See Constants for possible
    * values.
    */
  def direction: IDBCursorDirection = js.native

  /** Returns the key for the record at the cursor's position. If the cursor is outside its range, this is set to
    * undefined. The cursor's key can be any data type.
    */
  def key: IDBKey = js.native

  /** Returns the cursor's current effective key. If the cursor is currently being iterated or has iterated outside its
    * range, this is set to undefined. The cursor's primary key can be any data type.
    */
  def primaryKey: IDBKey = js.native

  /** This method may raise a DOMException of one of the following types: */
  def advance(count: Int): Unit = js.native

  /** Sets cursor to key if specified, otherwise advances cursor by one.
    *
    * @note
    *   calling this method twice from the same onsuccess handler results in a InvalidStateError DOMException being
    *   thrown on the second call
    *
    * W3C
    */
  def continue(key: IDBKey = js.native): Unit = js.native
}

/** The IDBCursor interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records
  * in a database.
  *
  * The cursor has a source that indicates which index or object store it is iterating. It has a position within the
  * range, and moves in a direction that is increasing or decreasing in the order of record keys. The cursor enables an
  * application to asynchronously process all the records in the cursor's range.
  */
@js.native
@JSGlobal
class IDBCursor[+S] extends IDBCursorReadOnly[S] {

  /** Returns an IDBRequest object, and, in a separate thread, deletes the record at the cursor's position, without
    * changing the cursor's position.
    */
  def delete(): IDBRequest[S, Unit] = js.native

  /** Returns an IDBRequest object, and, in a separate thread, updates the value at the current position of the cursor
    * in the object store.
    */
  def update(value: IDBValue): IDBRequest[S, IDBKey] = js.native
}

@js.native
sealed trait IDBCursorDirection extends js.Any

object IDBCursorDirection {

  /** The cursor shows all records, including duplicates. It starts at the upper bound of the key range and moves
    * downwards (monotonically decreasing in the order of keys).
    */
  @inline def prev: IDBCursorDirection = "prev".asInstanceOf[IDBCursorDirection]

  /** The cursor shows all records, excluding duplicates. If multiple records exist with the same key, only the first
    * one iterated is retrieved. It starts at the upper bound of the key range and moves downwards.
    */
  @inline def prevunique: IDBCursorDirection = "prevunique".asInstanceOf[IDBCursorDirection]

  /** The cursor shows all records, including duplicates. It starts at the lower bound of the key range and moves
    * upwards (monotonically increasing in the order of keys).
    */
  @inline def next: IDBCursorDirection = "next".asInstanceOf[IDBCursorDirection]

  /** The cursor shows all records, excluding duplicates. If multiple records exist with the same key, only the first
    * one iterated is retrieved. It starts at the lower bound of the key range and moves upwards.
    */
  @inline def nextunique: IDBCursorDirection = "nextunique".asInstanceOf[IDBCursorDirection]
}

/** Same as IDBCursor with the value property. */
@js.native
@JSGlobal
class IDBCursorWithValue extends IDBCursor {
  def value: IDBValue = js.native
}

/** The IDBKeyRange interface of the IndexedDB API represents a continuous interval over some data type that is used for
  * keys. Records can be retrieved from object stores and indexes using keys or a range of keys. You can limit the range
  * using lower and upper bounds. For example, you can iterate over all values of a key between x and y.
  *
  * A key range can have a single value or a range with upper and lower bounds or endpoints. If the key range has both
  * upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be
  * open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain
  * range, you can use the following code constructs:
  */
@js.native
@JSGlobal
class IDBKeyRange extends js.Object {

  /** The upper bound of the key range (can be any type.) */
  def upper: IDBKey = js.native

  /** Returns false if the upper-bound value is included in the key range. */
  def upperOpen: Boolean = js.native

  /** The lower bound of the key range (can be any type.) */
  def lower: IDBKey = js.native

  /** Returns false if the lower-bound value is included in the key range. */
  def lowerOpen: Boolean = js.native
}

@js.native
@JSGlobal
object IDBKeyRange extends js.Object {

  /** The bounds can be open (that is, the bounds exclude the endpoint values) or closed (that is, the bounds include
    * the endpoint values). By default, the bounds are closed.
    */
  def bound(lower: IDBKey, upper: IDBKey, lowerOpen: Boolean = js.native,
      upperOpen: Boolean = js.native): IDBKeyRange = js.native

  /** This method may raise a DOMException of the following types: */
  def only(value: IDBValue): IDBKeyRange = js.native

  /** By default, it includes the lower endpoint value and is closed. */
  def lowerBound(bound: IDBKey, open: Boolean = js.native): IDBKeyRange = js.native

  /** By default, it includes the upper endpoint value and is closed. */
  def upperBound(bound: IDBKey, open: Boolean = js.native): IDBKeyRange = js.native
}

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

/** The IDBOpenDBRequest interface of the IndexedDB API provides access to results of requests to open databases using
  * specific event handler attributes.
  *
  * @tparam A
  *   Type of `.target.result` on events
  */
@js.native
@JSGlobal
class IDBOpenDBRequest[A] extends IDBRequest[Null, A] {

  /** The event handler for the upgradeneeded event, fired when a database of a bigger version number than the existing
    * stored database is loaded.
    */
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, _] = js.native

  /** The event handler for the blocked event. This event is triggered when the upgradeneeded should be triggered
    * because of a version change but the database is still in use (ie not closed) somewhere, even after the
    * versionchange event was sent.
    */
  var onblocked: js.Function1[IDBVersionChangeEvent, _] = js.native
}

/** The IDBFactory interface of the IndexedDB API lets applications asynchronously access the indexed databases. The
  * object that implements the interface is window.indexedDB. You open — that is, create and access — and delete a
  * database with the object and not directly with IDBFactory. see
  * [[https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory IDBFactory on MDN]]
  *
  * official documentation [[http://www.w3.org/TR/IndexedDB/#idl-def-IDBFactory IDBFactory]] in w3c spec
  */
@js.native
@JSGlobal
class IDBFactory extends js.Object {

  /** The open() method of the IDBFactory interface requests opening a connection to a database. see
    * [[https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/open IDBFactory.open() on MDN]]
    *
    * w3c spec [[http://www.w3.org/TR/IndexedDB/#requests ¶3.2.3 Opening a database]]
    */
  def open(name: String, version: Int = js.native): IDBOpenDBRequest[IDBDatabase] = js.native

  /** Compares two values as keys to determine equality and ordering for IndexedDB operations, such as storing and
    * iterating.
    *
    * @return
    *   One of the following:
    *   - `-1` means 1st key is less than the 2nd key
    *   - `0` means 1st key is equal to the 2nd key
    *   - `1` means 1st key is greater than the 2nd key
    */
  def cmp(first: IDBValue, second: IDBValue): Int = js.native

  /** Returns a promise which resolves to a list of objects giving a snapshot of the names and versions of databases
    * within the origin.
    *
    * This API is intended for web applications to introspect the use of databases, for example to clean up from earlier
    * versions of a site’s code. Note that the result is a snapshot; there are no guarantees about the sequencing of the
    * collection of the data or the delivery of the response with respect to requests to create, upgrade, or delete
    * databases by this context or others.
    */
  def databases(): js.Promise[js.Array[IDBDatabaseInfo]] = js.native

  /** The deletion operation (performed in a different thread) consists of the following steps: */
  def deleteDatabase(name: String): IDBOpenDBRequest[Unit] = js.native
}

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

@js.native
trait IDBDatabaseInfo extends js.Object {
  val name: String = js.native
  val version: Int = js.native
}

trait IDBCreateObjectStoreOptions extends js.Object {
  val keyPath: IDBKeyPath = js.undefined
  val autoIncrement: js.UndefOr[Boolean] = js.undefined
}

trait IDBCreateIndexOptions extends js.Object {
  val unique: js.UndefOr[Boolean] = js.undefined
  val multiEntry: js.UndefOr[Boolean] = js.undefined
  val locale: js.UndefOr[String] = js.undefined
}

trait IDBTransactionOptions extends js.Object {
  val durability: js.UndefOr[IDBTransactionDurability] = js.undefined
}

/** The IDBEvironment interface of the IndexedDB API provides asynchronous access to a client-side database. It is
  * implemented by window and Worker objects.
  */
@deprecated(
    "Removed. This feature is no longer recommended. Though some browsers might still support it, it may have already been removed from the relevant web standards, may be in the process of being dropped, or may only be kept for compatibility purposes. Avoid using it, and update existing code if possible. See https://developer.mozilla.org/en-US/docs/Web/API/IDBEnvironment",
    "1.2.0")
@js.native
trait IDBEnvironment extends js.Object {

  /** an IDBRequest object that communicates back to the requesting application through events. This design means that
    * any number of requests can be active on any database at a time.
    */
  @deprecated("Use window.indexedDB", "1.2.0")
  def indexedDB: IDBFactory = js.native
}
