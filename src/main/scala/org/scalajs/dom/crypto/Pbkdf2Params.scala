package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

// PBKDF2

trait Pbkdf2Params extends HashAlgorithm {
  val salt: BufferSource

  val iterations: Double

  val hash: HashAlgorithmIdentifier
}

object Pbkdf2Params {

  @deprecated("use `new Pbkdf2Params { ... } instead", "2.0.0")
  @inline
  def apply(name: String, salt: BufferSource, iterations: Long, hash: HashAlgorithmIdentifier): Pbkdf2Params = {
    val name0 = name
    val salt0 = salt
    val iterations0 = iterations
    val hash0 = hash
    new Pbkdf2Params {
      val name = name0
      val salt = salt0
      val iterations = iterations0.toDouble
      val hash = hash0
    }
  }
}
