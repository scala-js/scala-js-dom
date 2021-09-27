package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource

// RSA-OAEP

trait RsaOaepParams extends Algorithm {
  val label: BufferSource
}

object RsaOaepParams {

  @deprecated("use `new RsaOaepParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, label: BufferSource): RsaOaepParams = {
    val name0 = name
    val label0 = label
    new RsaOaepParams {
      val name = name0
      val label = label0
    }
  }
}
