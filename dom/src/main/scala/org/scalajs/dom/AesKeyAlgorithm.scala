package org.scalajs.dom

trait AesKeyAlgorithm extends KeyAlgorithm {
  val length: Int
}

object AesKeyAlgorithm {

  @deprecated("use `new AesKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesKeyAlgorithm = {
    val name0 = name
    val length0 = length
    new AesKeyAlgorithm {
      val name = name0
      val length = length0.toInt
    }
  }
}
