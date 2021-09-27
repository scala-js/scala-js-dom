package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

// AES-CBC

trait AesCbcParams extends Algorithm {
  val iv: BufferSource
}

object AesCbcParams {

  @deprecated("use `new AesCbcParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, iv: BufferSource): AesCbcParams = {
    val name0 = name
    val iv0 = iv
    new AesCbcParams {
      val name = name0
      val iv = iv0
    }
  }
}
