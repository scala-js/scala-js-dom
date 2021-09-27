/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

/** Common members shared between [[IDBObjectStore]] and [[IDBIndex]].
  *
  * @tparam S
  *   The type of `.source`
  */
@js.native
trait IDBStoreLike[S] extends js.Object {

  def count(query: IDBKey | IDBKeyRange = js.native): IDBRequest[S, Double] = js.native

  /** Returns an [[IDBRequest]] object, and, in a separate thread, returns the object store selected by the specified
    * key. This is for retrieving specific records from an object store.
    *
    * Note: This method produces the same result for: a) a record that doesn't exist in the database and b) a record
    * that has an undefined value. To tell these situations apart, call the [[openCursor]] method with the same key.
    * That method provides a cursor if the record exists, and no cursor if it does not.
    */
  def get(key: IDBKey | IDBKeyRange): IDBRequest[S, IDBValue] = js.native

  /** Returns an [[IDBRequest]] object containing all objects in the object store matching the specified parameter or
    * all objects in the store if no parameters are given.
    *
    * If a value is successfully found, then a structured clone of it is created and set as the result of the request
    * object.
    *
    * This method produces the same result for:
    *
    *   - a record that doesn't exist in the database
    *   - a record that has an undefined value
    *
    * To tell these situations apart, you either call
    *
    *   - the [[openCursor]] method with the same key. That method provides a cursor if the record exists, and no cursor
    *     if it does not.
    *   - the [[count]] method with the same key, which will return 1 if the row exists and 0 if it doesn't.
    */
  def getAll(query: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      count: js.UndefOr[Double] = js.native): IDBRequest[S, js.Array[IDBValue]] = js.native

  /** Returns an [[IDBRequest]] object retrieves record keys for all objects in the object store matching the specified
    * parameter or all objects in the store if no parameters are given.
    *
    * If a value is successfully found, then a structured clone of it is created and set as the result of the request
    * object.
    *
    * This method produces the same result for:
    *
    *   - a record that doesn't exist in the database
    *   - a record that has an undefined value
    *
    * To tell these situations apart, you need to call the [[openCursor]] method with the same key. That method provides
    * a cursor if the record exists, and no cursor if it does not.
    */
  def getAllKeys(query: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      count: js.UndefOr[Double] = js.native): IDBRequest[S, js.Array[IDBKey]] = js.native

  /** Returns an [[IDBRequest]] object, and, in a separate thread, returns the key selected by the specified query. This
    * is for retrieving specific records from an object store.
    */
  def getKey(key: IDBKey): IDBRequest[S, js.UndefOr[IDBKey]] = js.native

  /** The key path of this object store. If this attribute is null, the application must provide a key for each
    * modification operation.
    */
  def keyPath: IDBKeyPath = js.native

  def name: String = js.native

  /** The method sets the position of the cursor to the appropriate record, based on the specified direction.
    *
    * @return
    *   [[IDBRequest]] with the `target` value being a new cursor or `null`.
    */
  def openCursor(range: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      direction: js.UndefOr[IDBCursorDirection] = js.native): IDBRequest[S, IDBCursor[S]] = js.native

  /** The method sets the position of the cursor to the appropriate key, based on the specified direction.
    *
    * @return
    *   [[IDBRequest]] with the `target` value being a new cursor or `null`.
    */
  def openKeyCursor(range: js.UndefOr[IDBKeyRange | IDBKey] = js.native,
      direction: js.UndefOr[IDBCursorDirection] = js.native): IDBRequest[S, IDBCursorReadOnly[S]] = js.native
}
