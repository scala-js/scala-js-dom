package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBuffer

/** The FileReaderSync interface allows to read File or Blob objects synchronously.
  *
  * This interface is only available in workers as it enables synchronous I/O that could potentially block.
  */
@js.native
@JSGlobal
class FileReaderSync() extends js.Object {

  /** The readAsArrayBuffer method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains an ArrayBuffer representing the file's data.
    */
  def readAsArrayBuffer(blob: Blob): ArrayBuffer = js.native

  /** The readAsDataURL method is used to starts reading the contents of the specified Blob or File. When the read
    * operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result
    * attribute contains a data: URL representing the file's data as base64 encoded string.
    */
  def readAsDataURL(blob: Blob): URL = js.native

  /** The readAsText method is used to read the contents of the specified Blob or File. When the read operation is
    * complete, the readyState is changed to DONE, the loadend is triggered, and the result attribute contains the
    * contents of the file as a text string.
    */
  def readAsText(blob: Blob, encoding: String = js.native): String = js.native
}
