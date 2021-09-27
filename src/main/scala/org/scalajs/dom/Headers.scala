package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** [[https://fetch.spec.whatwg.org/#headers-class ¶6.1 Headers Class]] of whatwg spec
  *
  * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
  * These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list,
  * which is initially empty and consists of zero or more name and value pairs. You can add to this using methods like
  * append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte
  * sequence.
  *
  * For security reasons, some headers can only be controller by the user agent. These headers include the forbidden
  * header names and forbidden response header names.
  *
  * A Headers object also has an associated guard, which takes a value of immutable, request, request-no-cors, response,
  * or none. This affects whether the set(), delete(), and append() methods will mutate the header. For more information
  * see Guard.
  *
  * You can retrieve a Headers object via the Request.headers and Response.headers properties, and create a new Headers
  * object using the Headers.Headers() constructor.
  */
@js.native
@JSGlobal
class Headers(map: HeadersInit = js.Array[js.Array[String]]()) extends js.Iterable[js.Array[ByteString]] {

  @JSName(js.Symbol.iterator)
  def jsIterator(): js.Iterator[js.Array[ByteString]] = js.native

  /** The append() method of the Headers interface appends a new value onto an existing header inside a Headers object,
    * or adds the header if it does not already exist.
    *
    * The difference between Headers.set and append() is that if the specified header already exists and accepts
    * multiple values, Headers.set will overwrite the existing value with the new one, whereas append() will append the
    * new value onto the end of the set of values.
    */
  def append(name: ByteString, value: ByteString): Unit = js.native

  /** The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or adds
    * the header if it does not already exist.
    *
    * The difference between set() and Headers.append is that if the specified header already exists and accepts
    * multiple values, set() overwrites the existing value with the new one, whereas Headers.append appends the new
    * value to the end of the set of values.
    *
    * Not all headers can be set. See the list of forbidden header names in
    * https://fetch.spec.whatwg.org/#terminology-headers
    */
  def set(name: ByteString, value: ByteString): Unit = js.native

  /** The delete() method of the Headers interface deletes a header from the current Headers object. */
  def delete(name: ByteString): Unit = js.native

  /** The get() method of the Headers interface returns the first value of a given header from within a Headers object .
    * If the requested header doesn't exist in the Headers object, the call returns null.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def get(name: ByteString): ByteString = js.native

  /** The getAll() method of the Headers interface returns an array of all the values of a header within a Headers
    * object with a given name. If the requested header doesn't exist in the Headers object, it returns an empty array.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def getAll(name: ByteString): Sequence[ByteString] = js.native

  /** The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain
    * header.
    *
    * @param name
    *   a ByteString, ie. only ASCII chars
    */
  def has(name: ByteString): Boolean = js.native
}
