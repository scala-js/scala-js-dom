package org.scalajs.dom.crypto

trait DhImportKeyParams extends Algorithm {
  val prime: BigInteger

  val generator: BigInteger
}

object DhImportKeyParams {

  @deprecated("use `new DhImportKeyParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, prime: BigInteger, generator: BigInteger): DhImportKeyParams = {
    val name0 = name
    val prime0 = prime
    val generator0 = generator
    new DhImportKeyParams {
      val name = name0
      val prime = prime0
      val generator = generator0
    }
  }
}
