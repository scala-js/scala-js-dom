package org.scalajs.dom

trait DhKeyDeriveParams extends Algorithm {
  val public: CryptoKey
}

object DhKeyDeriveParams {

  @deprecated("use `new DhKeyDeriveParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, public: CryptoKey): DhKeyDeriveParams = {
    val name0 = name
    val public0 = public
    new DhKeyDeriveParams {
      val name = name0
      val public = public0
    }
  }
}
