package org.scalajs.dom.crypto

import scala.scalajs.js
import scala.scalajs.js.annotation._

@deprecated("use dom.crypto instead", "2.0.0")
@js.native
@JSGlobalScope
object GlobalCrypto extends js.Object {
  val crypto: Crypto = js.native
}
