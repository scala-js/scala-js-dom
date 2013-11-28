package org.scalajs.dom
import scala.scalajs.js

class IDBObjectStore extends js.Object {
  var indexNames: DOMStringList = _
  var name: js.String = _
  var transaction: IDBTransaction = _
  var keyPath: js.String = _
  def count(key: js.Any): IDBRequest = ???
  def count(): IDBRequest = ???
  def add(value: js.Any, key: js.Any): IDBRequest = ???
  def add(value: js.Any): IDBRequest = ???
  def clear(): IDBRequest = ???
  def createIndex(name: js.String, keyPath: js.String, optionalParameters: js.Any): IDBIndex = ???
  def createIndex(name: js.String, keyPath: js.String): IDBIndex = ???
  def put(value: js.Any, key: js.Any): IDBRequest = ???
  def put(value: js.Any): IDBRequest = ???
  def openCursor(range: js.Any, direction: js.String): IDBRequest = ???
  def openCursor(range: js.Any): IDBRequest = ???
  def openCursor(): IDBRequest = ???
  def deleteIndex(indexName: js.String): Unit = ???
  def index(name: js.String): IDBIndex = ???
  def get(key: js.Any): IDBRequest = ???
  def delete(key: js.Any): IDBRequest = ???
}

class IDBVersionChangeEvent extends Event {
  var newVersion: js.Number = _
  var oldVersion: js.Number = _
}



class IDBIndex extends js.Object {
  var unique: js.Boolean = _
  var name: js.String = _
  var keyPath: js.String = _
  var objectStore: IDBObjectStore = _
  def count(key: js.Any): IDBRequest = ???
  def count(): IDBRequest = ???
  def getKey(key: js.Any): IDBRequest = ???
  def openKeyCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???
  def openKeyCursor(range: IDBKeyRange): IDBRequest = ???
  def openKeyCursor(): IDBRequest = ???
  def get(key: js.Any): IDBRequest = ???
  def openCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???
  def openCursor(range: IDBKeyRange): IDBRequest = ???
  def openCursor(): IDBRequest = ???
}


class IDBCursor extends js.Object {
  var source: js.Any = _
  var direction: js.String = _
  var key: js.Any = _
  var primaryKey: js.Any = _
  def advance(count: js.Number): Unit = ???
  def delete(): IDBRequest = ???
  def update(value: js.Any): IDBRequest = ???
  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}

object IDBCursor extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBCursor),List())))) */
  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}
class IDBCursorWithValue extends IDBCursor {
  var value: js.Any = _
}



trait IDBEnvironment extends js.Object {
  var msIndexedDB: IDBFactory = _
  var indexedDB: IDBFactory = _
}
class IDBKeyRange extends js.Object {
  var upper: js.Any = _
  var upperOpen: js.Boolean = _
  var lower: js.Any = _
  var lowerOpen: js.Boolean = _
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean, upperOpen: js.Boolean): IDBKeyRange = ???
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean): IDBKeyRange = ???
  def bound(lower: js.Any, upper: js.Any): IDBKeyRange = ???
  def only(value: js.Any): IDBKeyRange = ???
  def lowerBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???
  def lowerBound(bound: js.Any): IDBKeyRange = ???
  def upperBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???
  def upperBound(bound: js.Any): IDBKeyRange = ???
}


class IDBTransaction extends EventTarget {
  var oncomplete: js.Function1[Event, js.Any] = _
  var db: IDBDatabase = _
  var mode: js.String = _
  var error: DOMError = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  def abort(): Unit = ???
  def objectStore(name: js.String): IDBObjectStore = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var READ_ONLY: js.String = _
  var VERSION_CHANGE: js.String = _
  var READ_WRITE: js.String = _
}

object IDBTransaction extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBTransaction),List())))) */
  var READ_ONLY: js.String = _
  var VERSION_CHANGE: js.String = _
  var READ_WRITE: js.String = _
}
class IDBDatabase extends EventTarget {
  var version: js.String = _
  var name: js.String = _
  var objectStoreNames: DOMStringList = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  def createObjectStore(name: js.String, optionalParameters: js.Any): IDBObjectStore = ???
  def createObjectStore(name: js.String): IDBObjectStore = ???
  def close(): Unit = ???
  def transaction(storeNames: js.Any, mode: js.String): IDBTransaction = ???
  def transaction(storeNames: js.Any): IDBTransaction = ???
  def deleteObjectStore(name: js.String): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}



class IDBOpenDBRequest extends IDBRequest {
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, js.Any] = _
  var onblocked: js.Function1[Event, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


class IDBFactory extends js.Object {
  def open(name: js.String, version: js.Number): IDBOpenDBRequest = ???
  def open(name: js.String): IDBOpenDBRequest = ???
  def cmp(first: js.Any, second: js.Any): js.Number = ???
  def deleteDatabase(name: js.String): IDBOpenDBRequest = ???
}


class IDBRequest extends EventTarget {
  var source: js.Any = _
  var onsuccess: js.Function1[Event, js.Any] = _
  var error: DOMError = _
  var transaction: IDBTransaction = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var readyState: js.String = _
  var result: js.Any = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


