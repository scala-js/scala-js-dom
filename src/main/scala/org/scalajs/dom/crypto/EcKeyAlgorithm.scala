package org.scalajs.dom.crypto

trait EcKeyAlgorithm extends KeyAlgorithm {
  val namedCurve: String
}

object EcKeyAlgorithm {

  @deprecated("use `new EcKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyAlgorithm = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyAlgorithm {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}
