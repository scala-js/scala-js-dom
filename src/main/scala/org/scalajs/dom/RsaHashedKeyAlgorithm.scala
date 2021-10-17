package org.scalajs.dom

/** see W3C doc
  * [[http://www.w3.org/TR/WebCryptoAPI/#RsaHashedKeyAlgorithm-dictionary 20.6. RsaHashedKeyAlgorithm dictionary]]
  */
trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {

  /** Note that section
    * [[http://www.w3.org/TR/WebCryptoAPI/#RsaHashedKeyAlgorithm-dictionary 20.6. RsaHashedKeyAlgorithm dictionary]] of
    * the W3C documentation uses a KeyAlgorithm here, and not what seems more correct a HashAlgorithmIdentifier.
    */
  val hash: HashAlgorithmIdentifier
}

object RsaHashedKeyAlgorithm {

  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    val hash0 = hash
    new RsaHashedKeyAlgorithm {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
      val hash = hash0
    }
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsassa-pkcs1 ¶20. RSASSA-PKCS1-v1_5]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSASSA-PKCS1-v1_5`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSASSA-PKCS1-v1_5", modulusLength, publicExponent, hash)
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsa-pss ¶21. RSA-PSS]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSA-PSS`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSA-PSS", modulusLength, publicExponent, hash)
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsa-pss ¶21. RSA-OAEP]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSA-OAEP`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSA-OAEP", modulusLength, publicExponent, hash)
  }
}
