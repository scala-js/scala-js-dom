package org.scalajs.dom

// ECDH

trait EcdhKeyDeriveParams extends KeyAlgorithm {
  val public: CryptoKey
}

object EcdhKeyDeriveParams {

  @deprecated("use `new EcdhKeyDeriveParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, public: CryptoKey): EcdhKeyDeriveParams = {
    val name0 = name
    val public0 = public
    new EcdhKeyDeriveParams {
      val name = name0
      val public = public0
    }
  }
}
