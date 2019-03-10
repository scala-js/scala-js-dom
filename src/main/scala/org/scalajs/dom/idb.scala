package org.scalajs.dom

/**
 * Short aliases of all the dom.IDBThing classes
 */
object idb {
  type Cursor = raw.IDBCursor
  @inline def Cursor = raw.IDBCursor
  type CursorWithValue = raw.IDBCursorWithValue
  type Database = raw.IDBDatabase
  type Environment = raw.IDBEnvironment
  type Factory = raw.IDBFactory
  type Index = raw.IDBIndex
  type KeyRange = raw.IDBKeyRange
  @inline def KeyRange = raw.IDBKeyRange
  type ObjectStore = raw.IDBObjectStore
  type OpenDBRequest = raw.IDBOpenDBRequest
  type Request = raw.IDBRequest
  type Transaction = raw.IDBTransaction
  type VersionChangeEvent = raw.IDBVersionChangeEvent
}
