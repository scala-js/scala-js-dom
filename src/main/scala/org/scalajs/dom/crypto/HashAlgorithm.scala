package org.scalajs.dom.crypto

/** A HashAlgorithm type is not defined in the [[http://www.w3.org/TR/WebCryptoAPI/ W3C Web Crypto API]], even though a
  * [[http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-dictionary KeyAlgorithm dictionary]] type is. There are
  * nevertheless a number of indications that HashAlgorithm's are a type of their own, as searching the spec will show.
  */
trait HashAlgorithm extends Algorithm

object HashAlgorithm {

  private def named(name0: String): HashAlgorithm = {
    new HashAlgorithm {
      val name = name0
    }
  }

  val `SHA-1`: HashAlgorithm = named("SHA-1")
  val `SHA-256`: HashAlgorithm = named("SHA-256")
  val `SHA-384`: HashAlgorithm = named("SHA-384")
  val `SHA-512`: HashAlgorithm = named("SHA-512")
}
