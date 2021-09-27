package org.scalajs.dom.crypto

// AES-KW

// HMAC

trait HmacImportParams extends Algorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacImportParams {

  @deprecated("use `new HmacImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacImportParams = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacImportParams {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}
