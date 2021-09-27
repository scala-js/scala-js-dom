/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The IDBCursor interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records
  * in a database.
  *
  * The cursor has a source that indicates which index or object store it is iterating. It has a position within the
  * range, and moves in a direction that is increasing or decreasing in the order of record keys. The cursor enables an
  * application to asynchronously process all the records in the cursor's range.
  *
  * @tparam S
  *   The type of `.source`
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
  def advance(count: Double): Unit = js.native

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
