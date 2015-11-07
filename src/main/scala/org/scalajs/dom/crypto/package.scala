package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBufferView, ArrayBuffer, Uint8Array}
import scala.scalajs.js.`|`

import scala.language.implicitConversions

package object crypto {
  val crypto = GlobalCrypto.crypto

  type BigInteger = Uint8Array
  type AlgorithmIdentifier = KeyAlgorithm | String
  type HashAlgorithmIdentifier = HashAlgorithm | String

  @js.native
  sealed trait BufferSource extends js.Any

  implicit def arrayBuffer2BufferSource(b: ArrayBuffer): BufferSource =
    b.asInstanceOf[BufferSource]

  implicit def arrayBufferView2BufferSource(b: ArrayBufferView): BufferSource =
    b.asInstanceOf[BufferSource]
}
