package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

// ECDSA

trait EcdsaParams extends Algorithm {
  val hash: HashAlgorithmIdentifier
}

object EcdsaParams {

  @deprecated("use `new EcdsaParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier): EcdsaParams = {
    val name0 = name
    val hash0 = hash
    new EcdsaParams {
      val name = name0
      val hash = hash0
    }
  }
}
