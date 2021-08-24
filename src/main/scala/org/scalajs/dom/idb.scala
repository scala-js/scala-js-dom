package org.scalajs.dom

/**
 * Short aliases of all the dom.IDBThing classes
 */
object idb {
  type Cursor = raw.IDBCursor
  @inline def Cursor = raw.IDBCursor
  type CursorWithValue = raw.IDBCursorWithValue
  type Database = raw.IDBDatabase
  type Factory = raw.IDBFactory
  type Index = raw.IDBIndex
  type KeyRange = raw.IDBKeyRange
  @inline def KeyRange = raw.IDBKeyRange
  type ObjectStore = raw.IDBObjectStore
  type OpenDBRequest = raw.IDBOpenDBRequest
  type Request = raw.IDBRequest
  type Transaction = raw.IDBTransaction
  @inline def Transaction = raw.IDBTransaction
  type VersionChangeEvent = raw.IDBVersionChangeEvent
  @deprecated(
      "Removed. This feature is no longer recommended. Though some browsers might still support it, it may have already been removed from the relevant web standards, may be in the process of being dropped, or may only be kept for compatibility purposes. Avoid using it, and update existing code if possible. See https://developer.mozilla.org/en-US/docs/Web/API/IDBEnvironment",
      "1.2.0")
  type Environment = raw.IDBEnvironment
}
