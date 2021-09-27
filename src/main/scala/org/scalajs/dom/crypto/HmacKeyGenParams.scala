package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait HmacKeyGenParams extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacKeyGenParams {

  @deprecated("use `new HmacKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacKeyGenParams = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacKeyGenParams {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}
