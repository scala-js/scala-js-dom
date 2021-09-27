package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

// Diffie-Hellman

trait DhKeyGenParams extends Algorithm {
  val prime: BigInteger

  val generator: BigInteger
}

object DhKeyGenParams {

  @deprecated("use `new DhKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, prime: BigInteger, generator: BigInteger): DhKeyGenParams = {
    val name0 = name
    val prime0 = prime
    val generator0 = generator
    new DhKeyGenParams {
      val name = name0
      val prime = prime0
      val generator = generator0
    }
  }
}
