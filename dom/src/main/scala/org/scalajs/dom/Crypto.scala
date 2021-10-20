package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBufferView

/** The Crypto interface represents basic cryptography features available in the current context. It allows access to a
  * cryptographically strong random number generator and to cryptographic primitives.
  */
@js.native
trait Crypto extends js.Object {

  /** Returns a SubtleCrypto object providing access to common cryptographic primitives, like hashing, signing,
    * encryption or decryption.
    */
  val subtle: SubtleCrypto = js.native

  /** Fills the passed TypedArray with cryptographically sound random values. */
  def getRandomValues(array: ArrayBufferView): ArrayBufferView = js.native
}
