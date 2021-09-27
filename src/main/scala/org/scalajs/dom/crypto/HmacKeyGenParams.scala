package org.scalajs.dom.crypto

trait HmacKeyGenParams extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacKeyGenParams {

  @deprecated("use `new HmacKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacKeyGenParams = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacKeyGenParams {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}
