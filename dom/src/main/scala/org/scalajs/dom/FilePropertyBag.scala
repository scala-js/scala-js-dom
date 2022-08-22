package org.scalajs.dom

import scala.scalajs.js

/** An options object containing optional attributes for the file. */
trait FilePropertyBag extends BlobPropertyBag {
  var lastModified: js.UndefOr[Double] = js.undefined
}
