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

  /** Appends a key/value pair to the FormData object. */
  def append(name: js.Any, value: js.Any, blobName: String = js.native): Unit = js.native

  /** Deletes a key/value pair from the FormData object. */
  def delete(name: String): Unit = js.native

  /** Returns the first value associated with a given key from within a FormData object. */
  def get(name: String): String | Blob = js.native

  /** Returns whether a FormData object contains a certain key. */
  def has(name: String): Boolean = js.native

  /** Sets a new value for an existing key inside a FormData object, or adds the key/value if it does not already exist.
    */
  def set(
      name: String, value: String | Blob, blobName: String = js.native
  ): Unit = js.native

  @JSName(js.Symbol.iterator)
  override def jsIterator(): js.Iterator[js.Tuple2[String, String]] = js.native

  /** Returns an iterator that iterates through all key/value pairs contained in the FormData. */
  def entries(): js.Iterator[js.Tuple2[String, String | Blob]] = js.native

  /** Returns an array of all the values associated with a given key from within a FormData. */
  def getAll(name: String): js.Array[String | Blob] = js.native

  /** Returns an iterator iterates through all keys of the key/value pairs contained in the FormData. */
  def keys(): js.Iterator[String] = js.native

  /** Returns an iterator that iterates through all values contained in the FormData. */
  def values(): js.Iterator[String | Blob] = js.native
}

@js.native
@JSGlobal
object FormData extends js.Object
