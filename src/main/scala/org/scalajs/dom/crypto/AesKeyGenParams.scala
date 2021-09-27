package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait AesKeyGenParams extends KeyAlgorithm {
  val length: Int
}

object AesKeyGenParams {

  @deprecated("use `new AesKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesKeyGenParams = {
    val name0 = name
    val length0 = length
    new AesKeyGenParams {
      val name = name0
      val length = length0.toInt
    }
  }
}
