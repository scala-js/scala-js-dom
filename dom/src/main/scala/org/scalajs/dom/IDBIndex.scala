/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

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
