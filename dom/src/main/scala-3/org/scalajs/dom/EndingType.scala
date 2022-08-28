package org.scalajs.dom

import scala.scalajs.js

/**
  * Endings enum for  [[https://w3c.github.io/FileAPI/#enumdef-endingtype]]
  * If set to "native", line endings will be converted to native in any USVString elements in blobParts
  */
opaque type EndingType <: String = String

object EndingType {
  val transparent: EndingType = "transparent"
  val native: EndingType = "native"
}
