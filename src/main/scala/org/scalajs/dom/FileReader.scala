/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.collection.mutable
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}
import scala.scalajs.js.|

/** The FileReader object lets web applications asynchronously read the contents of files (or raw data buffers) stored
  * on the user's computer, using File or Blob objects to specify the file or data to read.
  */
@js.native
@JSGlobal
class FileReader() extends EventTarget {

  /** A DOMException representing the error that occurred while reading the file. */
  def error: DOMException = js.native

  /** A number indicating the state of the FileReader. This will be one of the State constants. EMPTY : 0 : No data has
    * been loaded yet. LOADING : 1 : Data is currently being loaded. DONE : 2 : The entire read request has been
    * completed.
    */
  def readyState: Short = js.native

  /** The file's contents. This property is only valid after the read operation is complete, and the format of the data
    * depends on which of the methods was used to initiate the read operation.
    */
  def result: js.Any = js.native

  /** A handler for the abort event. This event is triggered each time the reading operation is aborted. */
  var onabort: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the error event. This event is triggered each time the reading operation encounter an error. */
  var onerror: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the load event. This event is triggered each time the reading operation is successfully completed.
    */
  var onload: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the loadstart event. This event is triggered each time the reading is starting. */
  var onloadstart: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the loadend event. This event is triggered each time the reading operation is completed (either in
    * success or failure).
    */
  var onloadend: js.Function1[ProgressEvent, _] = js.native

  /** A handler for the progress event. This event is triggered while reading a Blob content. */
  var onprogress: js.Function1[ProgressEvent, _] = js.native

  /** Aborts the read operation. Upon return, the readyState will be DONE. */
  def abort(): Unit = js.native

  /** The readAsArrayBuffer method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains an ArrayBuffer representing the file's data.
    */
  def readAsArrayBuffer(blob: Blob): Unit = js.native

  /** The readAsDataURL method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains a data: URL representing the file's data as base64 encoded string.
    */
  def readAsDataURL(blob: Blob): Unit = js.native

  /** The readAsText method is used to read the contents of the specified Blob or File. When the read operation is
    * complete, the readyState is changed to DONE, the loadend is triggered, and the result attribute contains the
    * contents of the file as a text string.
    */
  def readAsText(blob: Blob, encoding: String = js.native): Unit = js.native
}

@js.native
@JSGlobal
object FileReader extends js.Object {
  //states
  val EMPTY: Short = js.native
  val LOADING: Short = js.native
  val DONE: Short = js.native
}
