package org.scalajs.dom

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.typedarray.ArrayBufferView

package object crypto {

  /** Returns a SubtleCrypto object providing access to common cryptographic primitives, like hashing, signing,
    * encryption or decryption.
    */
  @JSGlobal("crypto.subtle")
  @js.native
  val subtle: dom.SubtleCrypto = js.native

  /** Fills the passed TypedArray with cryptographically sound random values. */
  @JSGlobal("crypto.subtle")
  @js.native
  def getRandomValues(array: ArrayBufferView): ArrayBufferView = js.native

  @deprecated("use dom.crypto instead", "2.0.0")
  @inline def crypto: Crypto = GlobalCrypto.crypto

  @deprecated("use dom.BigInteger instead", "2.0.0")
  type BigInteger = dom.BigInteger

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] of the
    * WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise here and specify an
    * Algorithm. note: it may be that we can do only with KeyAlgorithmIdentifier and HashAlgorithmIdentifier
    */
  @deprecated("use dom.AlgorithmIdentifier instead", "2.0.0")
  type AlgorithmIdentifier = dom.AlgorithmIdentifier

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] of the
    * WebCryptoAPI an AlgorithmIdentifier is an `object or DOMString`. We make this more precise here and distinguish
    * the non overlapping classes of Key and Hash Algorithms.
    */
  @deprecated("use dom.AlgorithmIdentifier instead", "2.0.0")
  type KeyAlgorithmIdentifier = dom.KeyAlgorithmIdentifier

  /** According to [[http://www.w3.org/TR/WebCryptoAPI/#algorithm-dictionary ¶11 Algorithm Identifier]] a
    * HashAlgorithmIdentifier is an AlgorithmIdentifier. Here we distinguish between Hash and Key Algorithm Identifiers.
    * At the JS layer these have the same structure.
    */
  @deprecated("use dom.HashAlgorithmIdentifier instead", "2.0.0")
  type HashAlgorithmIdentifier = dom.HashAlgorithmIdentifier

  @deprecated("use dom.AesCbcParams instead", "2.0.0")
  type AesCbcParams = dom.AesCbcParams

  @deprecated("use dom.AesCbcParams instead", "2.0.0")
  val AesCbcParams = dom.AesCbcParams

  @deprecated("use dom.AesCfbParams instead", "2.0.0")
  type AesCfbParams = dom.AesCfbParams

  @deprecated("use dom.AesCfbParams instead", "2.0.0")
  val AesCfbParams = dom.AesCfbParams

  @deprecated("use dom.AesCmacParams instead", "2.0.0")
  type AesCmacParams = dom.AesCmacParams

  @deprecated("use dom.AesCmacParams instead", "2.0.0")
  val AesCmacParams = dom.AesCmacParams

  @deprecated("use dom.AesCtrParams instead", "2.0.0")
  type AesCtrParams = dom.AesCtrParams

  @deprecated("use dom.AesCtrParams instead", "2.0.0")
  val AesCtrParams = dom.AesCtrParams

  @deprecated("use dom.AesDerivedKeyParams instead", "2.0.0")
  type AesDerivedKeyParams = dom.AesDerivedKeyParams

  @deprecated("use dom.AesDerivedKeyParams instead", "2.0.0")
  val AesDerivedKeyParams = dom.AesDerivedKeyParams

  @deprecated("use dom.AesGcmParams instead", "2.0.0")
  type AesGcmParams = dom.AesGcmParams

  @deprecated("use dom.AesGcmParams instead", "2.0.0")
  val AesGcmParams = dom.AesGcmParams

  @deprecated("use dom.AesKeyAlgorithm instead", "2.0.0")
  type AesKeyAlgorithm = dom.AesKeyAlgorithm

  @deprecated("use dom.AesKeyAlgorithm instead", "2.0.0")
  val AesKeyAlgorithm = dom.AesKeyAlgorithm

  @deprecated("use dom.AesKeyGenParams instead", "2.0.0")
  type AesKeyGenParams = dom.AesKeyGenParams

  @deprecated("use dom.AesKeyGenParams instead", "2.0.0")
  val AesKeyGenParams = dom.AesKeyGenParams

  @deprecated("use dom.Algorithm instead", "2.0.0")
  type Algorithm = dom.Algorithm

  @deprecated("use dom.ConcatParams instead", "2.0.0")
  type ConcatParams = dom.ConcatParams

  @deprecated("use dom.ConcatParams instead", "2.0.0")
  val ConcatParams = dom.ConcatParams

  @deprecated("use dom.CryptoKeyPair instead", "2.0.0")
  type CryptoKeyPair = dom.CryptoKeyPair

  @deprecated("use dom.CryptoKey instead", "2.0.0")
  type CryptoKey = dom.CryptoKey

  @deprecated("use dom.Crypto instead", "2.0.0")
  type Crypto = dom.Crypto

  @deprecated("use dom.DhImportKeyParams instead", "2.0.0")
  type DhImportKeyParams = dom.DhImportKeyParams

  @deprecated("use dom.DhImportKeyParams instead", "2.0.0")
  val DhImportKeyParams = dom.DhImportKeyParams

  @deprecated("use dom.DhKeyAlgorithm instead", "2.0.0")
  type DhKeyAlgorithm = dom.DhKeyAlgorithm

  @deprecated("use dom.DhKeyAlgorithm instead", "2.0.0")
  val DhKeyAlgorithm = dom.DhKeyAlgorithm

  @deprecated("use dom.DhKeyDeriveParams instead", "2.0.0")
  type DhKeyDeriveParams = dom.DhKeyDeriveParams

  @deprecated("use dom.DhKeyDeriveParams instead", "2.0.0")
  val DhKeyDeriveParams = dom.DhKeyDeriveParams

  @deprecated("use dom.DhKeyGenParams instead", "2.0.0")
  type DhKeyGenParams = dom.DhKeyGenParams

  @deprecated("use dom.DhKeyGenParams instead", "2.0.0")
  val DhKeyGenParams = dom.DhKeyGenParams

  @deprecated("use dom.EcdhKeyDeriveParams instead", "2.0.0")
  type EcdhKeyDeriveParams = dom.EcdhKeyDeriveParams

  @deprecated("use dom.EcdhKeyDeriveParams instead", "2.0.0")
  val EcdhKeyDeriveParams = dom.EcdhKeyDeriveParams

  @deprecated("use dom.EcdsaParams instead", "2.0.0")
  type EcdsaParams = dom.EcdsaParams

  @deprecated("use dom.EcdsaParams instead", "2.0.0")
  val EcdsaParams = dom.EcdsaParams

  @deprecated("use dom.EcKeyAlgorithm instead", "2.0.0")
  type EcKeyAlgorithm = dom.EcKeyAlgorithm

  @deprecated("use dom.EcKeyAlgorithm instead", "2.0.0")
  val EcKeyAlgorithm = dom.EcKeyAlgorithm

  @deprecated("use dom.EcKeyGenParams instead", "2.0.0")
  type EcKeyGenParams = dom.EcKeyGenParams

  @deprecated("use dom.EcKeyGenParams instead", "2.0.0")
  val EcKeyGenParams = dom.EcKeyGenParams

  @deprecated("use dom.EcKeyImportParams instead", "2.0.0")
  type EcKeyImportParams = dom.EcKeyImportParams

  @deprecated("use dom.EcKeyImportParams instead", "2.0.0")
  val EcKeyImportParams = dom.EcKeyImportParams

  @deprecated("use dom.HashAlgorithm instead", "2.0.0")
  type HashAlgorithm = dom.HashAlgorithm

  @deprecated("use dom.HashAlgorithm instead", "2.0.0")
  val HashAlgorithm = dom.HashAlgorithm

  @deprecated("use dom.HkdfCtrParams instead", "2.0.0")
  type HkdfCtrParams = dom.HkdfCtrParams

  @deprecated("use dom.HkdfCtrParams instead", "2.0.0")
  val HkdfCtrParams = dom.HkdfCtrParams

  @deprecated("use dom.HmacImportParams instead", "2.0.0")
  type HmacImportParams = dom.HmacImportParams

  @deprecated("use dom.HmacImportParams instead", "2.0.0")
  val HmacImportParams = dom.HmacImportParams

  @deprecated("use dom.HmacKeyAlgorithm instead", "2.0.0")
  type HmacKeyAlgorithm = dom.HmacKeyAlgorithm

  @deprecated("use dom.HmacKeyAlgorithm instead", "2.0.0")
  val HmacKeyAlgorithm = dom.HmacKeyAlgorithm

  @deprecated("use dom.HmacKeyGenParams instead", "2.0.0")
  type HmacKeyGenParams = dom.HmacKeyGenParams

  @deprecated("use dom.HmacKeyGenParams instead", "2.0.0")
  val HmacKeyGenParams = dom.HmacKeyGenParams

  @deprecated("use dom.JsonWebKey instead", "2.0.0")
  type JsonWebKey = dom.JsonWebKey

  @deprecated("use dom.KeyAlgorithm instead", "2.0.0")
  type KeyAlgorithm = dom.KeyAlgorithm

  @deprecated("use dom.KeyFormat instead", "2.0.0")
  type KeyFormat = dom.KeyFormat

  @deprecated("use dom.KeyFormat instead", "2.0.0")
  val KeyFormat = dom.KeyFormat

  @deprecated("use dom.KeyType instead", "2.0.0")
  type KeyType = dom.KeyType

  @deprecated("use dom.KeyType instead", "2.0.0")
  val KeyType = dom.KeyType

  @deprecated("use dom.KeyUsage instead", "2.0.0")
  type KeyUsage = dom.KeyUsage

  @deprecated("use dom.KeyUsage instead", "2.0.0")
  val KeyUsage = dom.KeyUsage

  @deprecated("use dom.Pbkdf2Params instead", "2.0.0")
  type Pbkdf2Params = dom.Pbkdf2Params

  @deprecated("use dom.Pbkdf2Params instead", "2.0.0")
  val Pbkdf2Params = dom.Pbkdf2Params

  @deprecated("use dom.RsaHashedImportParams instead", "2.0.0")
  type RsaHashedImportParams = dom.RsaHashedImportParams

  @deprecated("use dom.RsaHashedImportParams instead", "2.0.0")
  val RsaHashedImportParams = dom.RsaHashedImportParams

  @deprecated("use dom.RsaHashedKeyAlgorithm instead", "2.0.0")
  type RsaHashedKeyAlgorithm = dom.RsaHashedKeyAlgorithm

  @deprecated("use dom.RsaHashedKeyAlgorithm instead", "2.0.0")
  val RsaHashedKeyAlgorithm = dom.RsaHashedKeyAlgorithm

  @deprecated("use dom.RsaHashedKeyGenParams instead", "2.0.0")
  type RsaHashedKeyGenParams = dom.RsaHashedKeyGenParams

  @deprecated("use dom.RsaHashedKeyGenParams instead", "2.0.0")
  val RsaHashedKeyGenParams = dom.RsaHashedKeyGenParams

  @deprecated("use dom.RsaKeyAlgorithm instead", "2.0.0")
  type RsaKeyAlgorithm = dom.RsaKeyAlgorithm

  @deprecated("use dom.RsaKeyAlgorithm instead", "2.0.0")
  val RsaKeyAlgorithm = dom.RsaKeyAlgorithm

  @deprecated("use dom.RsaKeyGenParams instead", "2.0.0")
  type RsaKeyGenParams = dom.RsaKeyGenParams

  @deprecated("use dom.RsaKeyGenParams instead", "2.0.0")
  val RsaKeyGenParams = dom.RsaKeyGenParams

  @deprecated("use dom.RsaOaepParams instead", "2.0.0")
  type RsaOaepParams = dom.RsaOaepParams

  @deprecated("use dom.RsaOaepParams instead", "2.0.0")
  val RsaOaepParams = dom.RsaOaepParams

  @deprecated("use dom.RsaOtherPrimesInfo instead", "2.0.0")
  type RsaOtherPrimesInfo = dom.RsaOtherPrimesInfo

  @deprecated("use dom.RsaPssParams instead", "2.0.0")
  type RsaPssParams = dom.RsaPssParams

  @deprecated("use dom.RsaPssParams instead", "2.0.0")
  val RsaPssParams = dom.RsaPssParams

  @deprecated("use dom.SubtleCrypto instead", "2.0.0")
  type SubtleCrypto = dom.SubtleCrypto

}
