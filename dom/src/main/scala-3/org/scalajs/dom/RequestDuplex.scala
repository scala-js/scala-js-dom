package org.scalajs.dom

import scala.scalajs.js

/**
  * Fetch APIs [[https://fetch.spec.whatwg.org/#dom-requestinit-duplex RequestDuplex enum]]
  */
opaque type RequestDuplex <: String = String

object RequestDuplex {
  val half: RequestDuplex = "half"
}