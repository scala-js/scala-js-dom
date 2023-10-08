package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The AnimationEvent interface represents events providing information related to animations. */
@JSGlobal
@js.native
class BlobEvent(typeArg: String, init: BlobEventInit) extends Event(typeArg, init) {

  def this(init: BlobEventInit) = {
    this("dataavailable", init)
  }

  def data: Blob = js.native
}
