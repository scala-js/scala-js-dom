package org.scalajs.dom.crypto

trait EcKeyGenParams extends Algorithm {
  val namedCurve: String
}

object EcKeyGenParams {

  @deprecated("use `new EcKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyGenParams = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyGenParams {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}
