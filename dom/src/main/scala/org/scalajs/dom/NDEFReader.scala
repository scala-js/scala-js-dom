package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The [[NDEFReader]] interface of the Web NFC API (https://developer.mozilla.org/en-US/docs/Web/API/Web_NFC_API) is
  * used to read from and write data to compatible NFC devices, e.g. NFC tags supporting NDEF, when these devices are
  * within the reader's magnetic induction field.
  *
  * @see
  *   https://w3c.github.io/web-nfc/#the-ndefreader-object
  */
@JSGlobal("NDEFReader")
@js.native
class NDEFReader() extends EventTarget {

  /** Activates a reading device and returns a Promise that either resolves when an NFC tag read operation is scheduled
    * or rejects if a hardware or permission error is encountered. This method triggers a permission prompt if the "nfc"
    * permission has not been previously granted.
    *
    * @return
    *   a Promise that resolves immediately after scheduling read operations for the NFC adapter.
    */
  def scan(options: NDEFScanOptions = js.native): js.Promise[Unit] = js.native

  /** Attempts to write an NDEF message to a tag and returns a Promise that either resolves when a message has been
    * written to the tag or rejects if a hardware or permission error is encountered. This method triggers a permission
    * prompt if the "nfc" permission has not been previously granted.
    *
    * @param message
    *   The message to be written, either a string object or literal, an ArrayBuffer, a TypedArray, a DataView, or an
    *   array of records. A record has the following members:
    * @param options
    *   An object with the following properties:
    *
    * @return
    *   a Promise that either resolves when a message has been written to the tag or rejects if a hardware or permission
    *   error is encountered.
    */
  def write(message: String, options: NDEFWriteOptions): js.Promise[Unit] = js.native
  def write(message: js.typedarray.ArrayBuffer, options: NDEFWriteOptions): js.Promise[Unit] = js.native

  def write(message: js.typedarray.TypedArray[_, _],
      options: NDEFWriteOptions = js.native): js.Promise[Unit] = js.native
  def write(message: js.typedarray.DataView, options: NDEFWriteOptions): js.Promise[Unit] = js.native
  def write(message: js.Array[NDEFRecord], options: NDEFWriteOptions): js.Promise[Unit] = js.native

  def write(message: String): js.Promise[Unit] = js.native
  def write(message: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  // def write(message:js.typedarray.TypedArray[NDEFRecord, ???]): js.Promise[Unit] = js.native
  def write(message: js.typedarray.DataView): js.Promise[Unit] = js.native
  def write(message: js.Array[NDEFRecord]): js.Promise[Unit] = js.native

  /** The reading event of the NDEFReader interface is fired whenever a new reading is available from compatible NFC
    * devices (e.g. NFC tags supporting NDEF) when these devices are within the reader's magnetic induction field.
    */
  var onreading: js.Function1[NDEFReadingEvent, Any] = js.native

  /** The readingerror event of the NDEFReader interface is fired whenever an error occurs during reading of NFC tags,
    * e.g. when tags leave the reader's magnetic induction field.
    */
  var onreadingerror: js.Function1[Event, Any] = js.native
}
