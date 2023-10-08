package org.scalajs.dom

import scala.scalajs.js

/** The AnimationEvent interface represents events providing information related to animations. */
@js.native
trait BlobEvent extends Event {

  def data: Blob = js.native

}
