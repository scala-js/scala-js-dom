package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait AesDerivedKeyParams extends KeyAlgorithm {
  val length: Int
}

object AesDerivedKeyParams {

  @deprecated("use `new AesDerivedKeyParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesDerivedKeyParams = {
    val name0 = name
    val length0 = length
    new AesDerivedKeyParams {
      val name = name0
      val length = length0.toInt
    }
  }
}
