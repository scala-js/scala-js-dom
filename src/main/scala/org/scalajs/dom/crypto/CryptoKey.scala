package org.scalajs.dom.crypto

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The CryptoKey object represents an opaque reference to keying material that is managed by the user agent.
  *
  * defined at [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 The CryptoKey Interface]]
  */
@js.native
@JSGlobal
final class CryptoKey private[this] () extends js.Object {
  val `type`: String = js.native

  val extractable: Boolean = js.native

  val algorithm: KeyAlgorithm = js.native

  val usages: js.Array[KeyUsage] = js.native
}
