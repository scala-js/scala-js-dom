package org.scalajs.dom.experimental.push

import org.scalajs.dom.Blob
import org.scalajs.dom.experimental.serviceworkers.ExtendableEvent
import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** The PushMessageData interface of the Push API provides methods which let you retrieve the push data sent by a server
  * in various formats.
  *
  * Unlike the similar methods in the Fetch API, which only allow the method to be invoked once, these methods can be
  * called multiple times.
  */
@js.native
trait PushMessageData extends js.Object {

  /** Extracts the data as an ArrayBuffer object. */
  def arrayBuffer(): ArrayBuffer = js.native

  /** Extracts the data as a Blob object. */
  def blob(): Blob = js.native

  /** Extracts the data as a JSON object. */
  def json(): js.Any = js.native

  /** Extracts the data as a plain text string. */
  def text(): String = js.native
}
