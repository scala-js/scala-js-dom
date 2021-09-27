package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait EcKeyGenParams extends Algorithm {
  val namedCurve: String
}

object EcKeyGenParams {

  @deprecated("use `new EcKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyGenParams = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyGenParams {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}
