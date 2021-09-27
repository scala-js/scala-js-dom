package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait RsaKeyAlgorithm extends KeyAlgorithm {
  val modulusLength: Double

  val publicExponent: BigInteger
}

object RsaKeyAlgorithm {

  @deprecated("use `new RsaKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    new RsaKeyAlgorithm {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
    }
  }
}
