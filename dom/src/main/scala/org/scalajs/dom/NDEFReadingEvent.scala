package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The NDEFReadingEvent interface of the Web NFC API represents events dispatched on new NFC readings obtained by
  * NDEFReader.
  *
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/API/NDEFReadingEvent
  * @see
  *   https://w3c.github.io/web-nfc/#the-ndefreader-object
  */
@js.native
@JSGlobal
class NDEFReadingEvent(typeArg: String, init: NDEFReadingEventInit) extends Event(typeArg, init) {

  /** Returns an NDEFMessage object containing the received message. */
  def message: NDEFMessage = js.native

  /** Returns the serial number of the device, which is used for anti-collision and identification, or an empty string
    * if no serial number is available.
    */
  def serialNumber: String = js.native
}
