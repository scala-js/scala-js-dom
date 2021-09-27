package org.scalajs.dom.crypto

trait HmacKeyAlgorithm extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacKeyAlgorithm {

  @deprecated("use `new HmacKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacKeyAlgorithm = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacKeyAlgorithm {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}
