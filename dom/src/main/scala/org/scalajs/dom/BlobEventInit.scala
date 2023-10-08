package org.scalajs.dom

import scala.scalajs.js

@js.native
trait BlobEventInit extends EventInit {
  var data: js.UndefOr[Blob]
}
