package org.scalajs.dom

// HKDF-CTR

trait HkdfCtrParams extends Algorithm {
  val hash: HashAlgorithmIdentifier

  val label: BufferSource

  val context: BufferSource
}

object HkdfCtrParams {

  @deprecated("use `new HkdfCtrParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, label: BufferSource, context: BufferSource): HkdfCtrParams = {
    val name0 = name
    val hash0 = hash
    val label0 = label
    val context0 = context
    new HkdfCtrParams {
      val name = name0
      val hash = hash0
      val label = label0
      val context = context0
    }
  }
}
