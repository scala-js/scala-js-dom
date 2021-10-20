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
    * delete all records in a store, use [[clear]].
    *
    * Bear in mind that if you are using an [[IDBCursor]], you can use the [[IDBCursor.delete]] method to more
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
