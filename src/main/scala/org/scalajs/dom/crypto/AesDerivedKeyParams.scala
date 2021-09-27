package org.scalajs.dom.crypto

trait AesDerivedKeyParams extends KeyAlgorithm {
  val length: Int
}

object AesDerivedKeyParams {

  @deprecated("use `new AesDerivedKeyParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesDerivedKeyParams = {
    val name0 = name
    val length0 = length
    new AesDerivedKeyParams {
      val name = name0
      val length = length0.toInt
    }
  }
}
