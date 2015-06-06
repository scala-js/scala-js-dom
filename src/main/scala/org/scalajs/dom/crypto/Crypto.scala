package org.scalajs.dom.crypto

import scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.typedarray.ArrayBufferView

object GlobalCrypto extends js.GlobalScope {
  val crypto: Crypto = js.native
}

/**
 * The Crypto interface represents basic cryptography features available in the
 * current context. It allows access to a cryptographically strong random
 * number generator and to cryptographic primitives.
 *
 * MDN
 */
trait Crypto extends js.Object {
  /**
   * Returns a SubtleCrypto object providing access to common cryptographic
   * primitives, like hashing, signing, encryption or decryption.
   *
   * MDN
   */
  val subtle: SubtleCrypto = js.native

  /**
   * Fills the passed TypedArray with cryptographically sound random values.
   *
   * MDN
   */
  def getRandomValues(array: ArrayBufferView): ArrayBufferView = js.native
}

trait Algorithm extends js.Object {
  var name: String = js.native
}

trait KeyAlgorithm extends Algorithm

trait CryptoKey extends js.Object {
  val `type`: String = js.native

  val extractable: Boolean = js.native

  val algorithm: js.Object = js.native

  val usages: js.Object = js.native
}

trait RsaOtherPrimesInfo extends js.Object {
  var r: String = js.native

  var d: String = js.native

  var t: String = js.native
}

trait JsonWebKey extends js.Object {
  var kty: String = js.native

  var use: String = js.native

  var key_ops: js.Array[String] = js.native

  var alg: js.Array[String] = js.native

  var ext: Boolean = js.native

  var crv: String = js.native

  var x: String = js.native

  var y: String = js.native

  var d: String = js.native

  var n: String = js.native

  var e: String = js.native

  var p: String = js.native

  var q: String = js.native

  var dp: String = js.native

  var dq: String = js.native

  var qi: String = js.native

  var oth: js.Array[String] = js.native

  var k: String = js.native
}

/**
 * The SubtleCrypto interface represents a set of cryptographic primitives.
 * It is available via the Crypto.subtle properties available in a window
 * context (via Window.crypto).
 *
 * MDN
 */
trait SubtleCrypto extends js.Object {
  /**
   * Returns a Promise of the encrypted data corresponding to the clear text,
   * algorithm and key given as parameters.
   *
   * MDN
   */
  def encrypt(algorithm: String, key: CryptoKey,
      data: BufferSource): Promise[js.Any] = js.native

  /**
   * Returns a Promise of the clear data corresponding to the encrypted text,
   * algorithm and key given as parameters.
   *
   * MDN
   */
  def decrypt(algorithm: String, key: CryptoKey,
      data: BufferSource): Promise[js.Any] = js.native

  /**
   * Returns a Promise of the signature corresponding to the text, algorithm
   * and key given as parameters.
   *
   * MDN
   */
  def sign(algorithm: String, key: CryptoKey,
      data: BufferSource): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a Boolean value indicating if the signature given as
   * parameter matches the text, algorithm and key also given as parameters.
   *
   * MDN
   */
  def verify(algorithm: String, key: CryptoKey, signature: BufferSource,
      data: BufferSource): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a digest generated from the algorithm and text given
   * as parameters.
   *
   * MDN
   */
  def digest(algorithm: String, data: BufferSource): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a newly generated CryptoKey, for symmetrical
   * algorithms, or a CryptoKeyPair, containing two newly generated keys, for
   * asymmetrical algorithm, that matches the algorithm, the usages and the
   * extractability given as parameters.
   *
   * MDN
   */
  def generateKey(algorithm: String, extractable: Boolean,
      keyUsages: js.Array[String]): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a newly generated CryptoKey derivated from a master
   * key and a specific algorithm given as parameters.
   *
   * MDN
   */
  def deriveKey(algorithm: String, baseKey: CryptoKey,
      derivedKeyType: String, extractable: Boolean,
      keyUsages: js.Array[String]): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a newly generated buffer of pseudo-random bits
   * derivated from a master key and a specific algorithm given as parameters.
   *
   * MDN
   */
  def deriveBits(algorithm: String, baseKey: CryptoKey,
      length: Double): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a CryptoKey corresponding to the format, the
   * algorithm, the raw key data, the usages and the extractability given
   * as parameters.
   *
   * MDN
   */
  def importKey(format: String, keyData: BufferSource,
      algorithm: String, extractable: Boolean,
      keyUsages: js.Array[String]): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a CryptoKey corresponding to the format, the
   * algorithm, the raw key data, the usages and the extractability given as
   * parameters.
   *
   * MDN
   */
  def importKey(format: String, keyData: JsonWebKey,
      algorithm: String, extractable: Boolean,
      keyUsages: js.Array[String]): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a buffer containing the key in the format requested.
   *
   * MDN
   */
  def exportKey(format: String, key: CryptoKey): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a wrapped symmetric key for usage (transfer, storage)
   * in unsecure environments. The wrapped buffer returned is in the format
   * given in parameters, and contained the key wrapped by the give wrapping
   * key with the given algorithm.
   *
   * MDN
   */
  def wrapKey(format: String, key: CryptoKey, wrappingKey: CryptoKey,
      wrapAlgorithm: String): Promise[js.Any] = js.native

  /**
   * Returns a Promise of a CryptoKey corresponding to the wrapped key given in
   * parameter.
   *
   * MDN
   */
  def unwrapKey(format: String, wrappedKey: BufferSource,
      unwrappingKey: CryptoKey, unwrapAlgorithm: String,
      unwrappedKeyAlgorithm: String, extractable: Boolean,
      keyUsages: js.Array[String]): Promise[js.Any] = js.native
}

// RSASSA-PKCS1-v1_5

trait RsaKeyGenParams extends Algorithm {
  var modulusLength: Double = js.native

  var publicExponent: BigInteger = js.native
}

object RsaKeyGenParams {
  @inline
  def apply(name: String, modulusLength: Long,
      publicExponent: BigInteger): RsaKeyGenParams = {
    js.Dynamic.literal(name = name, modulusLength = modulusLength.toDouble,
        publicExponent = publicExponent).asInstanceOf[RsaKeyGenParams]
  }
}

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  var hash: String = js.native
}

object RsaHashedKeyGenParams {
  @inline
  def apply(name: String, modulusLength: Long,
      publicExponent: BigInteger, hash: String): RsaHashedKeyGenParams = {
    js.Dynamic.literal(name = name, modulusLength = modulusLength.toDouble,
        publicExponent = publicExponent,
        hash = hash).asInstanceOf[RsaHashedKeyGenParams]
  }
}

trait RsaKeyAlgorithm extends KeyAlgorithm {
  var modulusLength: Double = js.native

  var publicExponent: BigInteger = js.native
}

object RsaKeyAlgorithm {
  @inline
  def apply(name: String, modulusLength: Long,
      publicExponent: BigInteger): RsaKeyAlgorithm = {
    js.Dynamic.literal(name = name, modulusLength = modulusLength.toDouble,
        publicExponent = publicExponent).asInstanceOf[RsaKeyAlgorithm]
  }
}

trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  var hash: KeyAlgorithm = js.native
}

object RsaHashedKeyAlgorithm {
  @inline
  def apply(name: String, modulusLength: Long,
      publicExponent: BigInteger, hash: String): RsaHashedKeyAlgorithm = {
    js.Dynamic.literal(name = name, modulusLength = modulusLength.toDouble,
        publicExponent = publicExponent,
        hash = hash).asInstanceOf[RsaHashedKeyAlgorithm]
  }
}

trait RsaHashedImportParams extends js.Object {
  var hash: String = js.native
}

object RsaHashedImportParams {
  @inline
  def apply(hash: String): RsaHashedImportParams =
    js.Dynamic.literal(hash = hash).asInstanceOf[RsaHashedImportParams]
}

// RSA-PSS

trait RsaPssParams extends Algorithm {
  var saltLength: Double = js.native
}

object RsaPssParams {
  @inline
  def apply(name: String, saltLength: Long): RsaPssParams = {
    js.Dynamic.literal(name = name,
       saltLength = saltLength.toDouble).asInstanceOf[RsaPssParams]
  }
}

// RSA-OAEP

trait RsaOaepParams extends Algorithm {
  var label: BufferSource = js.native
}

object RsaOaepParams {
  @inline
  def apply(name: String, label: BufferSource): RsaOaepParams = {
    js.Dynamic.literal(name = name,
       label = label).asInstanceOf[RsaOaepParams]
  }
}

// ECDSA

trait EcdsaParams extends Algorithm {
  var hash: String = js.native
}

object EcdsaParams {
  @inline
  def apply(name: String, hash: String): EcdsaParams =
    js.Dynamic.literal(name = name, hash = hash).asInstanceOf[EcdsaParams]
}

trait EcKeyGenParams extends Algorithm {
  var namedCurve: String = js.native
}

object EcKeyGenParams {
  @inline
  def apply(name: String, namedCurve: String): EcKeyGenParams = {
    js.Dynamic.literal(name = name,
       namedCurve = namedCurve).asInstanceOf[EcKeyGenParams]
  }
}

trait EcKeyAlgorithm extends KeyAlgorithm {
  var namedCurve: String = js.native
}

object EcKeyAlgorithm {
  @inline
  def apply(name: String, namedCurve: String): EcKeyAlgorithm = {
    js.Dynamic.literal(name = name,
        namedCurve = namedCurve).asInstanceOf[EcKeyAlgorithm]
  }
}

trait EcKeyImportParams extends KeyAlgorithm {
  var namedCurve: String = js.native
}

object EcKeyImportParams {
  @inline
  def apply(name: String, namedCurve: String): EcKeyImportParams = {
    js.Dynamic.literal(name = name,
       namedCurve = namedCurve).asInstanceOf[EcKeyImportParams]
  }
}

// ECDH

trait EcdhKeyDeriveParams extends KeyAlgorithm {
  var `public`: CryptoKey = js.native
}

object EcdhKeyDeriveParams {
  @inline
  def apply(name: String, `public`: CryptoKey): EcdhKeyDeriveParams = {
    js.Dynamic.literal(name = name,
       `public` = `public`).asInstanceOf[EcdhKeyDeriveParams]
  }
}

// AES-CTR

trait AesCtrParams extends Algorithm {
  var counter: BufferSource = js.native

  var length: Short = js.native
}

object AesCtrParams {
  @inline
  def apply(name: String, counter: BufferSource,
      length: Short): AesCtrParams = {
    js.Dynamic.literal(name = name, counter = counter,
        length = length).asInstanceOf[AesCtrParams]
  }
}

trait AesKeyAlgorithm extends KeyAlgorithm {
  var length: Int = js.native
}

object AesKeyAlgorithm {
  @inline
  def apply(name: String, length: Short): AesKeyAlgorithm = {
    js.Dynamic.literal(name = name,
        length = length).asInstanceOf[AesKeyAlgorithm]
  }
}

trait AesKeyGenParams extends KeyAlgorithm {
  var length: Int = js.native
}

object AesKeyGenParams {
  @inline
  def apply(name: String, length: Short): AesKeyGenParams = {
    js.Dynamic.literal(name = name,
        length = length).asInstanceOf[AesKeyGenParams]
  }
}

trait AesDerivedKeyParams extends KeyAlgorithm {
  var length: Int = js.native
}

object AesDerivedKeyParams {
  @inline
  def apply(name: String, length: Short): AesDerivedKeyParams = {
    js.Dynamic.literal(name = name,
        length = length).asInstanceOf[AesDerivedKeyParams]
  }
}

// AES-CBC

trait AesCbcParams extends Algorithm {
  var iv: BufferSource = js.native
}

object AesCbcParams {
  @inline
  def apply(name: String, iv: BufferSource): AesCbcParams =
    js.Dynamic.literal(name = name, iv = iv).asInstanceOf[AesCbcParams]
}

// AES-CMAC

trait AesCmacParams extends Algorithm {
  var length: Int = js.native
}

object AesCmacParams {
  @inline
  def apply(name: String, length: Int): AesCmacParams = {
    js.Dynamic.literal(name = name,
        length = length).asInstanceOf[AesCmacParams]
  }
}

// AES-GCM

trait AesGcmParams extends Algorithm {
  var iv: BufferSource = js.native

  var additionalData: BufferSource = js.native

  var tagLength: Short = js.native
}

object AesGcmParams {
  @inline
  def apply(name: String, iv: BufferSource,
      additionalData: BufferSource, tagLength: Short): AesGcmParams = {
    js.Dynamic.literal(name = name, iv = iv,
        additionalData = additionalData,
        tagLength = tagLength).asInstanceOf[AesGcmParams]
  }
}

// AES-CFB

trait AesCfbParams extends Algorithm {
  var iv: BufferSource = js.native
}

object AesCfbParams {
  @inline
  def apply(name: String, iv: BufferSource): AesCfbParams =
    js.Dynamic.literal(name = name, iv = iv).asInstanceOf[AesCfbParams]
}

// AES-KW

// HMAC

trait HmacImportParams extends Algorithm {
  var hash: String = js.native

  var length: Double = js.native
}

object HmacImportParams {
  @inline
  def apply(name: String, hash: String, length: Long): HmacImportParams = {
    js.Dynamic.literal(name = name, hash = hash,
        length = length.toDouble).asInstanceOf[HmacImportParams]
  }
}

trait HmacKeyAlgorithm extends KeyAlgorithm {
  var hash: KeyAlgorithm = js.native

  var length: Double = js.native
}

object HmacKeyAlgorithm {
  @inline
  def apply(name: String, hash: String, length: Long): HmacKeyAlgorithm = {
    js.Dynamic.literal(name = name, hash = hash,
        length = length.toDouble).asInstanceOf[HmacKeyAlgorithm]
  }
}

trait HmacKeyGenParams extends KeyAlgorithm {
  var hash: KeyAlgorithm = js.native

  var length: Double = js.native
}

object HmacKeyGenParams {
  @inline
  def apply(name: String, hash: String, length: Long): HmacKeyGenParams = {
    js.Dynamic.literal(name = name, hash = hash,
        length = length.toDouble).asInstanceOf[HmacKeyGenParams]
  }
}

// Diffie-Hellman

trait DhKeyGenParams extends Algorithm {
  var prime: BigInteger = js.native

  var generator: BigInteger = js.native
}

object DhKeyGenParams {
  @inline
  def apply(name: String, prime: BigInteger,
      generator: BigInteger): DhKeyGenParams = {
    js.Dynamic.literal(name = name, prime = prime,
        generator = generator).asInstanceOf[DhKeyGenParams]
  }
}

trait DhKeyAlgorithm extends KeyAlgorithm {
  var prime: BigInteger = js.native

  var generator: BigInteger = js.native
}

object DhKeyAlgorithm {
  @inline
  def apply(name: String, prime: BigInteger,
      generator: BigInteger): DhKeyAlgorithm = {
    js.Dynamic.literal(name = name, prime = prime,
        generator = generator).asInstanceOf[DhKeyAlgorithm]
  }
}

trait DhKeyDeriveParams extends Algorithm {
  var `public`: CryptoKey = js.native
}

object DhKeyDeriveParams {
  @inline
  def apply(name: String, public: CryptoKey): DhKeyDeriveParams = {
    js.Dynamic.literal(name = name,
        public = public).asInstanceOf[DhKeyDeriveParams]
  }
}

trait DhImportKeyParams extends Algorithm {
  var prime: BigInteger = js.native

  var generator: BigInteger = js.native
}

object DhImportKeyParams {
  @inline
  def apply(name: String, prime: BigInteger,
      generator: BigInteger): DhImportKeyParams = {
    js.Dynamic.literal(name = name, prime = prime,
        generator = generator).asInstanceOf[DhImportKeyParams]
  }
}

// CONCAT

trait ConcatParams extends Algorithm {
  var hash: String = js.native

  var algorithmId: BufferSource = js.native

  var partyUInfo: BufferSource = js.native

  var partyVInfo: BufferSource = js.native

  var publicInfo: BufferSource = js.native

  var privateInfo: BufferSource = js.native
}

object ConcatParams {
  @inline
  def apply(name: String, hash: String, algorithmId: BufferSource,
      partyUInfo: BufferSource, partyVInfo: BufferSource,
      publicInfo: BufferSource, privateInfo: BufferSource): ConcatParams = {
    js.Dynamic.literal(name = name, hash = hash,
        algorithmId = algorithmId, partyUInfo = partyUInfo,
        partyVInfo = partyVInfo, publicInfo = publicInfo,
        privateInfo = privateInfo).asInstanceOf[ConcatParams]
  }
}

// HKDF-CTR

trait HkdfCtrParams extends Algorithm {
  var hash: String = js.native

  var label: BufferSource = js.native

  var context: BufferSource = js.native
}

object HkdfCtrParams {
  @inline
  def apply(name: String, hash: String, label: BufferSource,
      context: BufferSource): HkdfCtrParams = {
    js.Dynamic.literal(name = name, hash = hash, label = label,
        context = context).asInstanceOf[HkdfCtrParams]
  }
}

// PBKDF2

trait Pbkdf2Params extends Algorithm {
  var salt: BufferSource = js.native

  var iterations: Double = js.native

  var hash: String = js.native
}

object Pbkdf2Params {
  @inline
  def apply(name: String, salt: BufferSource, iterations: Long,
      hash: String): Pbkdf2Params = {
    js.Dynamic.literal(name = name, salt = salt,
        iterations = iterations.toDouble,
        hash = hash).asInstanceOf[Pbkdf2Params]
  }
}
