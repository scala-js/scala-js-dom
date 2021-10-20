package org.scalajs.dom

import scala.scalajs.js

/** See [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶ 13. CryptoKey Interface]] of w3c spec */
opaque type KeyUsage <: String = String

object KeyUsage {
  val encrypt: KeyUsage = "encrypt"
  val decrypt: KeyUsage = "decrypt"
  val sign: KeyUsage = "sign"
  val verify: KeyUsage = "verify"
  val deriveKey: KeyUsage = "deriveKey"
  val deriveBits: KeyUsage = "deriveBits"
  val wrapKey: KeyUsage = "wrapKey"
  val unwrapKey: KeyUsage = "unwrapKey"
}
