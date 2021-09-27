package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

/** see [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 CryptoKey interface]] in W3C doc */
@js.native
sealed trait KeyType extends js.Any

object KeyType {
  val public: KeyType = "public".asInstanceOf[KeyType]
  val `private`: KeyType = "private".asInstanceOf[KeyType]
  val secret: KeyType = "secret".asInstanceOf[KeyType]
}
