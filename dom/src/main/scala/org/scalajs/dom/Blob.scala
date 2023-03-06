/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** A Blob object represents a file-like object of immutable, raw data; they can be read as text or binary data, or
  * converted into a ReadableStream so its methods can be used for processing the data. Blobs can represent data that
  * isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality
  * and expanding it to support files on the user's system.
  *
  * To construct a Blob from other non-blob objects and data, use the Blob() constructor. To create a blob that contains
  * a subset of another blob's data, use the slice() method. To obtain a Blob object for a file on the user's file
  * system, see the File documentation.
  *
  * The APIs accepting Blob objects are also listed in the File documentation.
  */
@js.native
@JSGlobal
class Blob(blobParts: js.Iterable[BlobPart], options: BlobPropertyBag = js.native) extends js.Object {

  @deprecated("This method seems to have been added in error and not actually exist.", "1.2.0")
  def close(): Unit = js.native

  /** The size, in bytes, of the data contained in the Blob object. */
  def size: Double = js.native

  /** A string indicating the MIME type of the data contained in the Blob. If the type is unknown, this string is empty.
    */
  def `type`: String = js.native

  /** Creates and returns a new Blob object which contains data from a subset of the blob on which it's called.
    */
  def slice(start: Double = js.native, end: Double = js.native, contentType: String = js.native): Blob = js.native

  /** Returns a ReadableStream that can be used to read the contents of the blob. */
  def stream(): ReadableStream[Uint8Array] = js.native

  /** Returns a promise that resolves with a USVString containing the entire contents of the blob interpreted as UTF-8
    * text.
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/API/USVString
    */
  def text(): js.Promise[String] = js.native

  /** Returns a promise that resolves with an ArrayBuffer containing the entire contents of the blob as binary data. */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
}

@js.native
@JSGlobal
object Blob extends js.Object
