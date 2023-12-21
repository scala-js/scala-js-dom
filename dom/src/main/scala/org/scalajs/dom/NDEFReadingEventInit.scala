package org.scalajs.dom

import scala.scalajs.js

/** NDEFReadingEventInit is used to initialize a new event with a serial number and the NDEFMessageInit data via the
  * message member. If serialNumber is not present or is null, empty string will be used to init the event.
  *
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/API/NDEFReadingEvent/NDEFReadingEvent#parameters
  * @see
  *   https://w3c.github.io/web-nfc/#the-ndefreader-object
  */
trait NDEFReadingEventInit extends EventInit {

  /** A string with the name of the event. It is case-sensitive and browsers always set it to reading. Default is "" an
    * empty string
    */
  var serialNumber: js.UndefOr[String] = js.undefined

  /** An object that, in addition of the properties defined in Event(), can have the following properties: serialNumber;
    * message
    */
  var message: NDEFRecordInit
}
