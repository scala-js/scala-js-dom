package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource

// CONCAT

trait ConcatParams extends Algorithm {
  val hash: HashAlgorithmIdentifier

  val algorithmId: BufferSource

  val partyUInfo: BufferSource

  val partyVInfo: BufferSource

  val publicInfo: BufferSource

  val privateInfo: BufferSource
}

object ConcatParams {

  @deprecated("use `new ConcatParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, algorithmId: BufferSource, partyUInfo: BufferSource,
      partyVInfo: BufferSource, publicInfo: BufferSource, privateInfo: BufferSource): ConcatParams = {
    val name0 = name
    val hash0 = hash
    val algorithmId0 = algorithmId
    val partyUInfo0 = partyUInfo
    val partyVInfo0 = partyVInfo
    val publicInfo0 = publicInfo
    val privateInfo0 = privateInfo
    new ConcatParams {
      val name = name0
      val hash = hash0
      val algorithmId = algorithmId0
      val partyUInfo = partyUInfo0
      val partyVInfo = partyVInfo0
      val publicInfo = publicInfo0
      val privateInfo = privateInfo0
    }
  }
}
