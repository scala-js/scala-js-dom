package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

@deprecated("use dom.crypto.crypto instead", "2.0.0")
@js.native
@JSGlobalScope
object GlobalCrypto extends js.Object {
  val crypto: Crypto = js.native
}
