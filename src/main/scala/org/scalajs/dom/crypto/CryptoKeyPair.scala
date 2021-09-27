package org.scalajs.dom.crypto

import scala.scalajs.js

/** The CryptoKeyPair dictionary represents an asymmetric key pair that is comprised of both public and private keys.
  * defined at [[http://www.w3.org/TR/WebCryptoAPI/#keypair ¶17 CryptoKeyPair dictionary]] of spec
  */
@js.native
trait CryptoKeyPair extends js.Object {
  val publicKey: CryptoKey = js.native
  val privateKey: CryptoKey = js.native
}
