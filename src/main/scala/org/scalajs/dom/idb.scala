package org.scalajs.dom

/** Short aliases of all the dom.IDBThing classes */
object idb {
  type CreateIndexOptions = IDBCreateIndexOptions
  type CreateObjectStoreOptions = IDBCreateObjectStoreOptions
  type Cursor = IDBCursor
  @inline def CursorDirection = IDBCursorDirection
  type CursorReadOnly = IDBCursorReadOnly
  type CursorWithValue = IDBCursorWithValue
  type Database = IDBDatabase
  type DatabaseInfo = IDBDatabaseInfo
  type Event[+A] = IDBEvent[A]
  type EventTarget[+A] = IDBEventTarget[A]
  type Factory = IDBFactory
  type Index = IDBIndex
  type KeyRange = IDBKeyRange
  @inline def KeyRange = IDBKeyRange
  type ObjectStore = IDBObjectStore
  type OpenDBRequest[A] = IDBOpenDBRequest[A]
  type Request[A] = IDBRequest[A]
  type Transaction = IDBTransaction
  @inline def TransactionMode = IDBTransactionMode
  type VersionChangeEvent = IDBVersionChangeEvent

  @deprecated(
      "Removed. This feature is no longer recommended. Though some browsers might still support it, it may have already been removed from the relevant web standards, may be in the process of being dropped, or may only be kept for compatibility purposes. Avoid using it, and update existing code if possible. See https://developer.mozilla.org/en-US/docs/Web/API/IDBEnvironment",
      "1.2.0")
  type Environment = IDBEnvironment
}
