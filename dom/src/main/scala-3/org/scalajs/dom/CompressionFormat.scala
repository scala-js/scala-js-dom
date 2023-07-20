package org.scalajs.dom

import scala.scalajs.js

opaque type CompressionFormat <: String = String

object CompressionFormat {
  val deflate: CompressionFormat = "deflate"

  val `deflate-raw`: CompressionFormat = "deflate-raw"

  val gzip: CompressionFormat = "gzip"
}
