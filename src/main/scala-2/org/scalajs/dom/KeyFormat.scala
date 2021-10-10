package org.scalajs.dom

import scala.scalajs.js

/** see [[http://www.w3.org/TR/WebCryptoAPI/#dfn-KeyFormat ¶14.2 Data Types]] in W3C spec */
@js.native
sealed trait KeyFormat extends js.Any

object KeyFormat {

  /** An unformatted sequence of bytes. Intended for secret keys. */
  val raw: KeyFormat = "raw".asInstanceOf[KeyFormat]

  /** The DER encoding of the PrivateKeyInfo structure from RFC 5208. */
  val pkcs8: KeyFormat = "pkcs8".asInstanceOf[KeyFormat]

  /** The DER encoding of the SubjectPublicKeyInfo structure from RFC 5280. */
  val spki: KeyFormat = "spki".asInstanceOf[KeyFormat]

  /** The key is a JsonWebKey dictionary encoded as a JavaScript object */
  val jwk: KeyFormat = "jwk".asInstanceOf[KeyFormat]
}
