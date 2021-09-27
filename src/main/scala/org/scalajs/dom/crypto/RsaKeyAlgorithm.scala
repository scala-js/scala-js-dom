package org.scalajs.dom.crypto

trait RsaKeyAlgorithm extends KeyAlgorithm {
  val modulusLength: Double

  val publicExponent: BigInteger
}

object RsaKeyAlgorithm {

  @deprecated("use `new RsaKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    new RsaKeyAlgorithm {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
    }
  }
}
