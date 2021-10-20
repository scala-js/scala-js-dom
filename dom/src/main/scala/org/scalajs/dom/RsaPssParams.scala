package org.scalajs.dom

// RSA-PSS

trait RsaPssParams extends Algorithm {
  val saltLength: Double
}

object RsaPssParams {

  @deprecated("use `new RsaPssParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, saltLength: Long): RsaPssParams = {
    val name0 = name
    val saltLength0 = saltLength
    new RsaPssParams {
      val name = name0
      val saltLength = saltLength0.toDouble
    }
  }
}
