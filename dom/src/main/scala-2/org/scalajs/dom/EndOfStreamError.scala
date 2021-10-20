package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait EndOfStreamError extends js.Any

object EndOfStreamError {
  val decode: EndOfStreamError = "decode".asInstanceOf[EndOfStreamError]
  val network: EndOfStreamError = "network".asInstanceOf[EndOfStreamError]
}
