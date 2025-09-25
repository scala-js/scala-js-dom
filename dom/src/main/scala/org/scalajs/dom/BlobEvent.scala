package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The BlobEvent interface represents events associated with a Blob. These blobs are typically, but not necessarily,
  * associated with media content.
  */
@JSGlobal
@js.native
class BlobEvent(typeArg: String, init: BlobEventInit) extends Event(typeArg, init) {

  def this(init: BlobEventInit) = {
    this("dataavailable", init)
  }

  /** Represents a Blob associated with the event. */
  def data: Blob = js.native
}
