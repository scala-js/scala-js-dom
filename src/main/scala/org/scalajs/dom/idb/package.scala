package org.scalajs.dom

/** Short aliases of all the dom.IDBThing classes */
package object idb {

  type CreateIndexOptions = IDBCreateIndexOptions
  type CreateObjectStoreOptions = IDBCreateObjectStoreOptions
  type Cursor[+Source] = IDBCursor[Source]
  type CursorReadOnly[+Source] = IDBCursorReadOnly[Source]
  type CursorWithValue[+Source] = IDBCursorWithValue[Source]
  type Database = IDBDatabase
  type DatabaseInfo = IDBDatabaseInfo
  type Event[+TargetResult] = IDBEvent[TargetResult]
  type EventTarget[+Result] = IDBEventTarget[Result]
  type Factory = IDBFactory
  type Index = IDBIndex
  type Key = IDBKey
  type KeyPath = IDBKeyPath
  type KeyRange = IDBKeyRange
  type ObjectStore = IDBObjectStore
  type OpenDBRequest[TargetResult] = IDBOpenDBRequest[TargetResult]
  type Request[+Source, TargetResult] = IDBRequest[Source, TargetResult]
  type Transaction = IDBTransaction
  type Value = IDBValue
  type VersionChangeEvent = IDBVersionChangeEvent

  @inline def CursorDirection = IDBCursorDirection
  @inline def KeyRange = IDBKeyRange
  @inline def TransactionMode = IDBTransactionMode

  @deprecated(
      "Removed. This feature is no longer recommended. Though some browsers might still support it, it may have already been removed from the relevant web standards, may be in the process of being dropped, or may only be kept for compatibility purposes. Avoid using it, and update existing code if possible. See https://developer.mozilla.org/en-US/docs/Web/API/IDBEnvironment",
      "1.2.0")
  type Environment = IDBEnvironment
}
