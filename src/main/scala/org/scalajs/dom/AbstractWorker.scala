package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The AbstractWorker interface abstracts properties and methods common to all kind of workers, being Worker or
  * SharedWorker.
  */
@js.native
trait AbstractWorker extends EventTarget {

  /** The AbstractWorker.onerror property represents an EventHandler, that is a function to be called when the error
    * event occurs and bubbles through the Worker.
    */
  var onerror: js.Function1[ErrorEvent, _] = js.native
}
