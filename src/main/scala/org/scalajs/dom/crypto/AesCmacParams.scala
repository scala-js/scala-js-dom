package org.scalajs.dom.crypto

// AES-CMAC

trait AesCmacParams extends Algorithm {
  val length: Int
}

object AesCmacParams {

  @deprecated("use `new AesCmacParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Int): AesCmacParams = {
    val name0 = name
    val length0 = length
    new AesCmacParams {
      val name = name0
      val length = length0
    }
  }
}
