package org.scalajs.dom

import scala.scalajs.js

/** see [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 CryptoKey interface]] in W3C doc */
@js.native
sealed trait KeyType extends js.Any

object KeyType {
  val public: KeyType = "public".asInstanceOf[KeyType]
  val `private`: KeyType = "private".asInstanceOf[KeyType]
  val secret: KeyType = "secret".asInstanceOf[KeyType]
}
