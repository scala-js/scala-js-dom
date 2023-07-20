package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait CompressionFormat extends js.Any

object CompressionFormat {
  val deflate: CompressionFormat = "deflate".asInstanceOf[CompressionFormat]

  val `deflate-raw`: CompressionFormat = "deflate-raw".asInstanceOf[CompressionFormat]

  val gzip: CompressionFormat = "gzip".asInstanceOf[CompressionFormat]
}
