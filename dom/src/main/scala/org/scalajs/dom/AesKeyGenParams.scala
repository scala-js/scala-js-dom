package org.scalajs.dom

trait AesKeyGenParams extends KeyAlgorithm {
  val length: Int
}

object AesKeyGenParams {

  @deprecated("use `new AesKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesKeyGenParams = {
    val name0 = name
    val length0 = length
    new AesKeyGenParams {
      val name = name0
      val length = length0.toInt
    }
  }
}
