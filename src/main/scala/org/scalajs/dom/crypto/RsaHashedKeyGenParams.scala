package org.scalajs.dom.crypto

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  val hash: HashAlgorithmIdentifier
}

object RsaHashedKeyGenParams {

  @deprecated("use `new RsaHashedKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyGenParams = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    val hash0 = hash
    new RsaHashedKeyGenParams {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
      val hash = hash0
    }
  }
}
