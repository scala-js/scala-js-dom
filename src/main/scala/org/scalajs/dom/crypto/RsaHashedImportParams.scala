package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

trait RsaHashedImportParams extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier
}

object RsaHashedImportParams {

  @deprecated("use `new RsaHashedImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier): RsaHashedImportParams = {
    val name0 = name
    val hash0 = hash
    new RsaHashedImportParams {
      val name = name0
      val hash = hash0
    }
  }
}
