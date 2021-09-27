package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

/** See [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶ 13. CryptoKey Interface]] of w3c spec */
@js.native
sealed trait KeyUsage extends js.Any

object KeyUsage {
  val encrypt: KeyUsage = "encrypt".asInstanceOf[KeyUsage]
  val decrypt: KeyUsage = "decrypt".asInstanceOf[KeyUsage]
  val sign: KeyUsage = "sign".asInstanceOf[KeyUsage]
  val verify: KeyUsage = "verify".asInstanceOf[KeyUsage]
  val deriveKey: KeyUsage = "deriveKey".asInstanceOf[KeyUsage]
  val deriveBits: KeyUsage = "deriveBits".asInstanceOf[KeyUsage]
  val wrapKey: KeyUsage = "wrapKey".asInstanceOf[KeyUsage]
  val unwrapKey: KeyUsage = "unwrapKey".asInstanceOf[KeyUsage]
}
