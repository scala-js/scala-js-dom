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

/** XMLHttpRequest Level 2 adds support for the new FormData interface. FormData objects provide a way to easily
  * construct a set of key/value pairs representing form fields and their values, which can then be easily sent using
  * the XMLHttpRequest send() method.
  */
@js.native
@JSGlobal
class FormData(form: HTMLFormElement = js.native) extends js.Iterable[js.Tuple2[String, String]] {

  /** The `append()` method of the `FormData` interface appends a new value onto an existing key inside a `FormData`
    * object, or adds the key if it does not already exist.
    *
    * @param name
    *   The name of the field whose data is contained in value.
    * @param value
    *   The field's value. This can be a string or `Blob` (including subclasses such as File). If none of these are
    *   specified the value is converted to a string.
    */
  def append(name: String, value: String): Unit = js.native

  /** The `append()` method of the `FormData` interface appends a new value onto an existing key inside a `FormData`
    * object, or adds the key if it does not already exist.
    *
    * @param name
    *   The name of the field whose data is contained in value.
    * @param value
    *   The field's value. This can be a string or `Blob` (including subclasses such as File). If none of these are
    *   specified the value is converted to a string.
    * @param blobName
    *   The filename reported to the server (a string), when a `Blob` or `File` is passed as the second parameter. The
    *   default filename for `Blob` objects is "blob". The default filename for `File` objects is the file's filename.
    */
  def append(name: String, value: Blob, blobName: String): Unit = js.native

  /** The `delete()` method of the `FormData` interface deletes a key and its value(s) from a `FormData` object.
    * @param name
    *   The name of the key you want to delete.
    */
  def delete(name: String): Unit = js.native

  /** The `get()` method of the `FormData` interface returns the first value associated with a given key from within a
    * `FormData` object. If you expect multiple values and want all of them, use the `getAll()` method instead.
    *
    * @param name
    *   A string representing the name of the key you want to retrieve.
    * @return
    *   A value whose key matches the specified name. Otherwise, `null`.
    */
  def get(name: String): String | Blob = js.native

  /** The `has()` method of the `FormData` interface returns whether a `FormData` object contains a certain key.
    *
    * @param name
    *   A string representing the name of the key you want to test for.
    * @return
    *   `true` if a key of `FormData` matches the specified name. Otherwise, `false`.
    */
  def has(name: String): Boolean = js.native

  /** The `set()` method of the `FormData` interface sets a new value for an existing key inside a `FormData` object, or
    * adds the key/value if it does not already exist.
    *
    * @param name
    *   The name of the field whose data is contained in value.
    * @param value
    *   The field's value.
    */
  def set(
      name: String, value: String
  ): Unit = js.native

  /** The `set()` method of the `FormData` interface sets a new value for an existing key inside a `FormData` object, or
    * adds the key/value if it does not already exist.
    *
    * @param name
    *   The name of the field whose data is contained in value.
    * @param value
    *   The field's value.
    */
  def set(
      name: String, value: Blob, blobName: String
  ): Unit = js.native

  @JSName(js.Symbol.iterator)
  override def jsIterator(): js.Iterator[js.Tuple2[String, String]] = js.native

  /** The `FormData.entries()` method returns an iterator which iterates through all key/value pairs contained in the
    * `FormData`. The key of each pair is a string object, and the value is either a string or a `Blob`.
    */
  def entries(): js.Iterator[js.Tuple2[String, String | Blob]] = js.native

  /** The `getAll()` method of the `FormData` interface returns all the values associated with a given key from within a
    * `FormData` object.
    */
  def getAll(name: String): js.Array[String | Blob] = js.native

  /** The `FormData.keys()` method returns an iterator which iterates through all keys contained in the `FormData`. The
    * keys are strings.
    */
  def keys(): js.Iterator[String] = js.native

  /** The `FormData.values()` method returns an iterator which iterates through all values contained in the `FormData`.
    * The values are strings or `Blob` objects.
    */
  def values(): js.Iterator[String | Blob] = js.native
}

@js.native
@JSGlobal
object FormData extends js.Object
