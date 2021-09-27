package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

// ECDH

trait EcdhKeyDeriveParams extends KeyAlgorithm {
  val public: CryptoKey
}

object EcdhKeyDeriveParams {

  @deprecated("use `new EcdhKeyDeriveParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, public: CryptoKey): EcdhKeyDeriveParams = {
    val name0 = name
    val public0 = public
    new EcdhKeyDeriveParams {
      val name = name0
      val public = public0
    }
  }
}
