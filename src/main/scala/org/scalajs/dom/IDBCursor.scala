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
