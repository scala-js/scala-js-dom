package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource

// AES-GCM

trait AesGcmParams extends Algorithm {
  val iv: BufferSource

  val additionalData: BufferSource

  val tagLength: Int
}

object AesGcmParams {

  @deprecated("use `new AesGcmParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, iv: BufferSource, additionalData: BufferSource, tagLength: Short): AesGcmParams = {
    val name0 = name
    val iv0 = iv
    val additionalData0 = additionalData
    val tagLength0 = tagLength
    new AesGcmParams {
      val name = name0
      val iv = iv0
      val additionalData = additionalData0
      val tagLength = tagLength0.toInt
    }
  }
}
