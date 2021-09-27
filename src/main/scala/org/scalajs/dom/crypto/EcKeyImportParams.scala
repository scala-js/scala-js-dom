package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait EcKeyImportParams extends KeyAlgorithm {
  val namedCurve: String
}

object EcKeyImportParams {

  @deprecated("use `new EcKeyImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyImportParams = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyImportParams {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}
