package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

/** The NDEFRecordInit dictionary is used to initialize an NDEF record with its record type recordType, and optional
  * record identifier id and payload data data.
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/API/NDEFMessage/NDEFMessage
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/API/NDEFRecord/NDEFRecord
  * @see
  *   https://w3c.github.io/web-nfc/#the-ndefrecord-interface
  */
trait NDEFRecordInit extends js.Object {

  /** Contains the data to be transmitted. It can be a string object or literal, an ArrayBuffer, a TypedArray, a
    * DataView, or an array of nested records.
    */
  var data: js.UndefOr[
      String |
        js.typedarray.DataView |
        js.typedarray.ArrayBuffer |
        js.typedarray.TypedArray[_, _] |
        js.typedarray.DataView |
        js.Array[NDEFRecord]
  ] = js.undefined

  /** A string specifying the record's encoding. */
  var encoding: js.UndefOr[String] = js.undefined

  /** A developer-defined identifier for the record. */
  var id: js.UndefOr[String] = js.undefined

  /** A valid language tag according to [RFC 5646: Tags for Identifying Languages (also known as BCP
    * 47)](https://datatracker.ietf.org/doc/html/rfc5646).
    */
  var lang: js.UndefOr[String] = js.undefined

  /** A valid MIME type. */
  var mediaType: js.UndefOr[String] = js.undefined

  /** A string indicating the type of data stored in data.
    *
    * It must be one of the following values:
    *   - "absolute-url" - An absolute URL to the data.
    *   - "empty" - An empty NDEFRecord.
    *   - "mime" - A valid MIME type.
    *   - "smart-poster" - A smart poster as defined by the NDEF-SMARTPOSTER specification.
    *   - "text" - Text as defined by the NDEF-TEXT specification.
    *   - "unknown" - The record type is not known.
    *   - "URL" - A URL as defined by the NDEF-URI specification.
    */
  var recordType: String
}
