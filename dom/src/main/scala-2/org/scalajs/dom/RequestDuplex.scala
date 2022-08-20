package org.scalajs.dom

import scala.scalajs.js

/**
  * Fetch APIs [[https://fetch.spec.whatwg.org/#dom-requestinit-duplex RequestDuplex enum]]
  */
@js.native
sealed trait RequestDuplex extends js.Any

object RequestDuplex {
  val half: RequestDuplex = "half".asInstanceOf[RequestDuplex]
}