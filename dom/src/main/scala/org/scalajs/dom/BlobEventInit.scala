package org.scalajs.dom

import scala.scalajs.js

@js.native
trait BlobEventInit extends EventInit {

  /** The Blob associated with the event. */
  var data: Blob
}
