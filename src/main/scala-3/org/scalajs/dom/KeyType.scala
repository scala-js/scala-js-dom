package org.scalajs.dom

import scala.scalajs.js

/** see [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 CryptoKey interface]] in W3C doc */
opaque type KeyType <: String = String

object KeyType {
  val public: KeyType = "public"
  val `private`: KeyType = "private"
  val secret: KeyType = "secret"
}
