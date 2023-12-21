package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The [[NDEFRecord]] interface of the Web NFC API provides data that can be read from, or written to, compatible NFC
  * devices, e.g. NFC tags supporting NDEF.
  *
  * @see
  *   https://w3c.github.io/web-nfc/#the-ndefrecord-interface
  */
@js.native
@JSGlobal
class NDEFRecord(init: NDEFRecordInit) extends js.Object {

  /** Returns the record type of the record. Records must have either a standardized well-known type name such as
    * "empty", "text", "url", "smart-poster", "absolute-url", "mime", or "unknown" or else an external type name, which
    * consists of a domain name and custom type name separated by a colon (":").
    */
  def recordType: String = js.native

  /** Returns the MIME type of the record. This value will be null if recordType is not equal to "mime". */
  def mediaType: js.UndefOr[String] = js.native

  /** Returns the record identifier, which is an absolute or relative URL used to identify the record.
    *
    * Note: The uniqueness of the identifier is enforced only by the generator of the record.
    */
  def id: js.UndefOr[String] = js.native

  /** Returns a DataView containing the raw bytes of the record's payload. */
  def data: js.typedarray.DataView = js.native

  /** Returns the encoding of a textual payload, or null otherwise. */
  def encoding: js.UndefOr[String] = js.native

  /** Returns the language of a textual payload, or null if one was not supplied. */
  def lang: js.UndefOr[String] = js.native

  /** Converts [[NDEFRecord.data]] to a sequence of records. This allows parsing the payloads of record types which may
    * contain nested records, such as smart poster and external type records.
    */
  def toRecords(): js.UndefOr[js.Array[NDEFRecord]] = js.native
}
