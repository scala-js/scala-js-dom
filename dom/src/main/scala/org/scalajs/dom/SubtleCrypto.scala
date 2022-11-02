package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBuffer

/** [[http://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface w3c ¶14 Subtle Crytpo interface]]
  *
  * The SubtleCrypto interface represents a set of cryptographic primitives. It is available via the Crypto.subtle
  * properties available in a window context (via Window.crypto).
  */
@js.native
trait SubtleCrypto extends js.Object {

  /** Returns a Promise of the encrypted data corresponding to the clear text, algorithm and key given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt ¶14.3.1 The encrypt method]]
    */
  def encrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.Any] = js.native

  /** Returns a Promise of the clear data corresponding to the encrypted text, algorithm and key given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt ¶14.3.2 The decrypt method]]
    */
  def decrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.Any] = js.native

  /** Returns a Promise of the signature corresponding to the text, algorithm and key given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-sign ¶14.3.3 The sign method]]
    */
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.Any] = js.native

  /** Returns a Promise of a Boolean value indicating if the signature given as parameter matches the text, algorithm
    * and key also given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-verify ¶14.3.4 The verify method]]
    */
  def verify(algorithm: AlgorithmIdentifier, key: CryptoKey, signature: BufferSource,
      data: BufferSource): js.Promise[js.Any] = js.native

  /** Returns a Promise of a digest generated from the algorithm and text given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-digest ¶14.3.5 The digest method]] We are a
    * bit more precise than the official definition by requiring a HashAlgorithmIdentifier rather than an
    * AlgorithmIdentifier for the algorithm parameter.
    */
  def digest(algorithm: HashAlgorithmIdentifier, data: BufferSource): js.Promise[js.Any] = js.native

  /** Returns a Promise of a newly generated CryptoKey, for symmetrical algorithms, or a CryptoKeyPair, containing two
    * newly generated keys, for asymmetrical algorithm, that matches the algorithm, the usages and the extractability
    * given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-generateKey ¶14.3.6 The generateKey method]]
    *
    * We are being a bit more precise than the official definition by requiring a KeyAlgorithmIdentifier rather than an
    * AlgorithmIdentifier for the algorithm field.
    */
  def generateKey(algorithm: KeyAlgorithmIdentifier, extractable: Boolean,
      keyUsages: js.Array[KeyUsage]): js.Promise[js.Any] = js.native

  /** Returns a Promise of a newly generated CryptoKey derivated from a master key and a specific algorithm given as
    * parameters. MDF
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-deriveKey ¶14.3.7 The deriveKey method]]
    *
    * We are being a bit more precise than the official definition by requiring KeyAlgorithmIdentifier for
    * derivedKeyType
    */
  def deriveKey(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, derivedKeyType: KeyAlgorithmIdentifier,
      extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[js.Any] = js.native

  /** Returns a Promise of a newly generated buffer of pseudo-random bits derivated from a master key and a specific
    * algorithm given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-deriveBits ¶14.3.8 The deriveBits method]]
    */
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey,
      length: Double): js.Promise[ArrayBuffer] = js.native

  /** Returns a Promise of a CryptoKey corresponding to the format, the algorithm, the raw key data, the usages and the
    * extractability given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-importKey ¶14.3.9 The importKey method]]
    *
    * We are being a bit more precise than the official definition by requiring a KeyAlgorithmIdentifier rather than an
    * AlgorithmIdentifier for the algorithm field.
    */
  def importKey(format: KeyFormat, keyData: BufferSource, algorithm: KeyAlgorithmIdentifier, extractable: Boolean,
      keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native

  /** Returns a Promise of a CryptoKey corresponding to the format, the algorithm, the raw key data, the usages and the
    * extractability given as parameters.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-importKey ¶14.3.9 The importKey method]]
    *
    * We are being a bit more precise than the official definition by requiring a KeyAlgorithmIdentifier rather than an
    * AlgorithmIdentifier for the algorithm field.
    */
  def importKey(format: KeyFormat, keyData: JsonWebKey, algorithm: KeyAlgorithmIdentifier, extractable: Boolean,
      keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native

  /** Returns a Promise of a buffer containing the key in the format requested.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-exportKey ¶14.3.10 The exportKey method]]
    */
  def exportKey(format: KeyFormat, key: CryptoKey): js.Promise[js.Any] = js.native

  /** Returns a Promise of a wrapped symmetric key for usage (transfer, storage) in unsecure environments. The wrapped
    * buffer returned is in the format given in parameters, and contained the key wrapped by the give wrapping key with
    * the given algorithm.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-wrapKey ¶14.3.11 The wrapKey method]]
    */
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey,
      wrapAlgorithm: AlgorithmIdentifier): js.Promise[js.Any] = js.native

  /** Returns a Promise of a CryptoKey corresponding to the wrapped key given in parameter.
    *
    * Defined at [[http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-unwrapKey ¶14.3.12 The unwrapKey method]]
    *
    * We are being a bit more precise than the official definition by requiring a KeyAlgorithmIdentifier rather than an
    * AlgorithmIdentifier.
    */
  def unwrapKey(format: String, wrappedKey: BufferSource, unwrappingKey: CryptoKey,
      unwrapAlgorithm: AlgorithmIdentifier, unwrappedKeyAlgorithm: AlgorithmIdentifier, extractable: Boolean,
      keyUsages: js.Array[KeyUsage]): js.Promise[js.Any] = js.native
}
