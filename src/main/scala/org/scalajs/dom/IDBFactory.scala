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
