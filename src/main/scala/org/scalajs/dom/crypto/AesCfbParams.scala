package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource

// AES-CFB

trait AesCfbParams extends Algorithm {
  val iv: BufferSource
}

object AesCfbParams {

  @deprecated("use `new AesCfbParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, iv: BufferSource): AesCfbParams = {
    val name0 = name
    val iv0 = iv
    new AesCfbParams {
      val name = name0
      val iv = iv0
    }
  }
}
