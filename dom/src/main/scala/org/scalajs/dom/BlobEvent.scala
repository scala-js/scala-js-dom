package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The AnimationEvent interface represents events providing information related to animations. */
@JSGlobal
@js.native
class BlobEvent(typeArg: String, init: js.UndefOr[BlobEventInit]) extends Event(typeArg, init) {

  def this(typeArg: String) = {
    this(typeArg, js.undefined)
  }

  def this() = {
    this("dataavailable", js.undefined)
  }

  val data: Blob = js.native
}
