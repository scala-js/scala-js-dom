package org.scalajs.dom

// AES-CTR

trait AesCtrParams extends Algorithm {
  val counter: BufferSource

  val length: Int
}

object AesCtrParams {

  @deprecated("use `new AesCtrParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, counter: BufferSource, length: Short): AesCtrParams = {
    val name0 = name
    val counter0 = counter
    val length0 = length
    new AesCtrParams {
      val name = name0
      val counter = counter0
      val length = length0.toInt
    }
  }
}
