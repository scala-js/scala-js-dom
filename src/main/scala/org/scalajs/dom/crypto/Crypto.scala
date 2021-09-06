package org.scalajs.dom.crypto

import org.scalajs.dom.BufferSource
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBufferView

@deprecated("use dom.crypto.crypto instead", "2.0.0")
@js.native
@JSGlobalScope
object GlobalCrypto extends js.Object {
  val crypto: Crypto = js.native
}

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

trait Algorithm extends js.Object {
  val name: String
}

/** The KeyAlgorithm dictionary represents information about the contents of a given CryptoKey object.
  *
  * See [[http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-dictionary ¶12 KeyAlgorithm dictionary]] in w3c spec.
  */
trait KeyAlgorithm extends Algorithm

/** A HashAlgorithm type is not defined in the [[http://www.w3.org/TR/WebCryptoAPI/ W3C Web Crypto API]], even though a
  * [[http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-dictionary KeyAlgorithm dictionary]] type is. There are
  * nevertheless a number of indications that HashAlgorithm's are a type of their own, as searching the spec will show.
  */
trait HashAlgorithm extends Algorithm

object HashAlgorithm {

  private def named(name0: String): HashAlgorithm = {
    new HashAlgorithm {
      val name = name0
    }
  }

  val `SHA-1`: HashAlgorithm = named("SHA-1")
  val `SHA-256`: HashAlgorithm = named("SHA-256")
  val `SHA-384`: HashAlgorithm = named("SHA-384")
  val `SHA-512`: HashAlgorithm = named("SHA-512")
}

/** The CryptoKey object represents an opaque reference to keying material that is managed by the user agent.
  *
  * defined at [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 The CryptoKey Interface]]
  */
@js.native
@JSGlobal
final class CryptoKey private[this] () extends js.Object {
  val `type`: String = js.native

  val extractable: Boolean = js.native

  val algorithm: KeyAlgorithm = js.native

  val usages: js.Array[KeyUsage] = js.native
}

/** The CryptoKeyPair dictionary represents an asymmetric key pair that is comprised of both public and private keys.
  * defined at [[http://www.w3.org/TR/WebCryptoAPI/#keypair ¶17 CryptoKeyPair dictionary]] of spec
  */
@js.native
trait CryptoKeyPair extends js.Object {
  val publicKey: CryptoKey = js.native
  val privateKey: CryptoKey = js.native
}

@js.native
trait RsaOtherPrimesInfo extends js.Object {
  var r: String = js.native

  var d: String = js.native

  var t: String = js.native
}

@js.native
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
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, length: Double): js.Promise[js.Any] = js.native

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

// RSASSA-PKCS1-v1_5

trait RsaKeyGenParams extends KeyAlgorithm {
  val modulusLength: Double

  val publicExponent: BigInteger
}

object RsaKeyGenParams {

  @deprecated("use `new RsaKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger): RsaKeyGenParams = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    new RsaKeyGenParams {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
    }
  }
}

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  val hash: HashAlgorithmIdentifier
}

object RsaHashedKeyGenParams {

  @deprecated("use `new RsaHashedKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyGenParams = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    val hash0 = hash
    new RsaHashedKeyGenParams {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
      val hash = hash0
    }
  }
}

trait RsaKeyAlgorithm extends KeyAlgorithm {
  val modulusLength: Double

  val publicExponent: BigInteger
}

object RsaKeyAlgorithm {

  @deprecated("use `new RsaKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    new RsaKeyAlgorithm {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
    }
  }
}

/** see W3C doc
  * [[http://www.w3.org/TR/WebCryptoAPI/#RsaHashedKeyAlgorithm-dictionary 20.6. RsaHashedKeyAlgorithm dictionary]]
  */
trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {

  /** Note that section
    * [[http://www.w3.org/TR/WebCryptoAPI/#RsaHashedKeyAlgorithm-dictionary 20.6. RsaHashedKeyAlgorithm dictionary]] of
    * the W3C documentation uses a KeyAlgorithm here, and not what seems more correct a HashAlgorithmIdentifier.
    */
  val hash: HashAlgorithmIdentifier
}

object RsaHashedKeyAlgorithm {

  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    val name0 = name
    val modulusLength0 = modulusLength
    val publicExponent0 = publicExponent
    val hash0 = hash
    new RsaHashedKeyAlgorithm {
      val name = name0
      val modulusLength = modulusLength0.toDouble
      val publicExponent = publicExponent0
      val hash = hash0
    }
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsassa-pkcs1 ¶20. RSASSA-PKCS1-v1_5]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSASSA-PKCS1-v1_5`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSASSA-PKCS1-v1_5", modulusLength, publicExponent, hash)
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsa-pss ¶21. RSA-PSS]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSA-PSS`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSA-PSS", modulusLength, publicExponent, hash)
  }

  /** see [[http://www.w3.org/TR/WebCryptoAPI/#rsa-pss ¶21. RSA-OAEP]] of w3c spec */
  @deprecated("use `new RsaHashedKeyAlgorithm { ... } instead", "2.0.0")
  def `RSA-OAEP`(modulusLength: Long, publicExponent: BigInteger,
      hash: HashAlgorithmIdentifier): RsaHashedKeyAlgorithm = {
    apply("RSA-OAEP", modulusLength, publicExponent, hash)
  }
}

trait RsaHashedImportParams extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier
}

object RsaHashedImportParams {

  @deprecated("use `new RsaHashedImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier): RsaHashedImportParams = {
    val name0 = name
    val hash0 = hash
    new RsaHashedImportParams {
      val name = name0
      val hash = hash0
    }
  }
}

// RSA-PSS

trait RsaPssParams extends Algorithm {
  val saltLength: Double
}

object RsaPssParams {

  @deprecated("use `new RsaPssParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, saltLength: Long): RsaPssParams = {
    val name0 = name
    val saltLength0 = saltLength
    new RsaPssParams {
      val name = name0
      val saltLength = saltLength0.toDouble
    }
  }
}

// RSA-OAEP

trait RsaOaepParams extends Algorithm {
  val label: BufferSource
}

object RsaOaepParams {

  @deprecated("use `new RsaOaepParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, label: BufferSource): RsaOaepParams = {
    val name0 = name
    val label0 = label
    new RsaOaepParams {
      val name = name0
      val label = label0
    }
  }
}

// ECDSA

trait EcdsaParams extends Algorithm {
  val hash: HashAlgorithmIdentifier
}

object EcdsaParams {

  @deprecated("use `new EcdsaParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier): EcdsaParams = {
    val name0 = name
    val hash0 = hash
    new EcdsaParams {
      val name = name0
      val hash = hash0
    }
  }
}

trait EcKeyGenParams extends Algorithm {
  val namedCurve: String
}

object EcKeyGenParams {

  @deprecated("use `new EcKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyGenParams = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyGenParams {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}

trait EcKeyAlgorithm extends KeyAlgorithm {
  val namedCurve: String
}

object EcKeyAlgorithm {

  @deprecated("use `new EcKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyAlgorithm = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyAlgorithm {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}

trait EcKeyImportParams extends KeyAlgorithm {
  val namedCurve: String
}

object EcKeyImportParams {

  @deprecated("use `new EcKeyImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, namedCurve: String): EcKeyImportParams = {
    val name0 = name
    val namedCurve0 = namedCurve
    new EcKeyImportParams {
      val name = name0
      val namedCurve = namedCurve0
    }
  }
}

// ECDH

trait EcdhKeyDeriveParams extends KeyAlgorithm {
  val public: CryptoKey
}

object EcdhKeyDeriveParams {

  @deprecated("use `new EcdhKeyDeriveParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, public: CryptoKey): EcdhKeyDeriveParams = {
    val name0 = name
    val public0 = public
    new EcdhKeyDeriveParams {
      val name = name0
      val public = public0
    }
  }
}

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

trait AesKeyAlgorithm extends KeyAlgorithm {
  val length: Int
}

object AesKeyAlgorithm {

  @deprecated("use `new AesKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesKeyAlgorithm = {
    val name0 = name
    val length0 = length
    new AesKeyAlgorithm {
      val name = name0
      val length = length0.toInt
    }
  }
}

trait AesKeyGenParams extends KeyAlgorithm {
  val length: Int
}

object AesKeyGenParams {

  @deprecated("use `new AesKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesKeyGenParams = {
    val name0 = name
    val length0 = length
    new AesKeyGenParams {
      val name = name0
      val length = length0.toInt
    }
  }
}

trait AesDerivedKeyParams extends KeyAlgorithm {
  val length: Int
}

object AesDerivedKeyParams {

  @deprecated("use `new AesDerivedKeyParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Short): AesDerivedKeyParams = {
    val name0 = name
    val length0 = length
    new AesDerivedKeyParams {
      val name = name0
      val length = length0.toInt
    }
  }
}

// AES-CBC

trait AesCbcParams extends Algorithm {
  val iv: BufferSource
}

object AesCbcParams {

  @deprecated("use `new AesCbcParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, iv: BufferSource): AesCbcParams = {
    val name0 = name
    val iv0 = iv
    new AesCbcParams {
      val name = name0
      val iv = iv0
    }
  }
}

// AES-CMAC

trait AesCmacParams extends Algorithm {
  val length: Int
}

object AesCmacParams {

  @deprecated("use `new AesCmacParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, length: Int): AesCmacParams = {
    val name0 = name
    val length0 = length
    new AesCmacParams {
      val name = name0
      val length = length0
    }
  }
}

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

// AES-CFB

trait AesCfbParams extends Algorithm {
  val iv: BufferSource
}

object AesCfbParams {

  @deprecated("use `new AesCfbParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, iv: BufferSource): AesCfbParams = {
    val name0 = name
    val iv0 = iv
    new AesCfbParams {
      val name = name0
      val iv = iv0
    }
  }
}

// AES-KW

// HMAC

trait HmacImportParams extends Algorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacImportParams {

  @deprecated("use `new HmacImportParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacImportParams = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacImportParams {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}

trait HmacKeyAlgorithm extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacKeyAlgorithm {

  @deprecated("use `new HmacKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacKeyAlgorithm = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacKeyAlgorithm {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}

trait HmacKeyGenParams extends KeyAlgorithm {
  val hash: HashAlgorithmIdentifier

  val length: Double
}

object HmacKeyGenParams {

  @deprecated("use `new HmacKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, hash: HashAlgorithmIdentifier, length: Long): HmacKeyGenParams = {
    val name0 = name
    val hash0 = hash
    val length0 = length
    new HmacKeyGenParams {
      val name = name0
      val hash = hash0
      val length = length0.toDouble
    }
  }
}

// Diffie-Hellman

trait DhKeyGenParams extends Algorithm {
  val prime: BigInteger

  val generator: BigInteger
}

object DhKeyGenParams {

  @deprecated("use `new DhKeyGenParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, prime: BigInteger, generator: BigInteger): DhKeyGenParams = {
    val name0 = name
    val prime0 = prime
    val generator0 = generator
    new DhKeyGenParams {
      val name = name0
      val prime = prime0
      val generator = generator0
    }
  }
}

trait DhKeyAlgorithm extends KeyAlgorithm {
  val prime: BigInteger

  val generator: BigInteger
}

object DhKeyAlgorithm {

  @deprecated("use `new DhKeyAlgorithm { ... } instead", "2.0.0")
  @inline
  def apply(name: String, prime: BigInteger, generator: BigInteger): DhKeyAlgorithm = {
    val name0 = name
    val prime0 = prime
    val generator0 = generator
    new DhKeyAlgorithm {
      val name = name0
      val prime = prime0
      val generator = generator0
    }
  }
}

trait DhKeyDeriveParams extends Algorithm {
  val public: CryptoKey
}

object DhKeyDeriveParams {

  @deprecated("use `new DhKeyDeriveParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, public: CryptoKey): DhKeyDeriveParams = {
    val name0 = name
    val public0 = public
    new DhKeyDeriveParams {
      val name = name0
      val public = public0
    }
  }
}

trait DhImportKeyParams extends Algorithm {
  val prime: BigInteger

  val generator: BigInteger
}

object DhImportKeyParams {

  @deprecated("use `new DhImportKeyParams { ... } instead", "2.0.0")
  @inline
  def apply(name: String, prime: BigInteger, generator: BigInteger): DhImportKeyParams = {
    val name0 = name
    val prime0 = prime
    val generator0 = generator
    new DhImportKeyParams {
      val name = name0
      val prime = prime0
      val generator = generator0
    }
  }
}

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

/** See [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶ 13. CryptoKey Interface]] of w3c spec */
@js.native
sealed trait KeyUsage extends js.Any

object KeyUsage {
  val encrypt: KeyUsage = "encrypt".asInstanceOf[KeyUsage]
  val decrypt: KeyUsage = "decrypt".asInstanceOf[KeyUsage]
  val sign: KeyUsage = "sign".asInstanceOf[KeyUsage]
  val verify: KeyUsage = "verify".asInstanceOf[KeyUsage]
  val deriveKey: KeyUsage = "deriveKey".asInstanceOf[KeyUsage]
  val deriveBits: KeyUsage = "deriveBits".asInstanceOf[KeyUsage]
  val wrapKey: KeyUsage = "wrapKey".asInstanceOf[KeyUsage]
  val unwrapKey: KeyUsage = "unwrapKey".asInstanceOf[KeyUsage]
}

/** see [[http://www.w3.org/TR/WebCryptoAPI/#cryptokey-interface ¶13 CryptoKey interface]] in W3C doc */
@js.native
sealed trait KeyType extends js.Any

object KeyType {
  val public: KeyType = "public".asInstanceOf[KeyType]
  val `private`: KeyType = "private".asInstanceOf[KeyType]
  val secret: KeyType = "secret".asInstanceOf[KeyType]
}

/** see [[http://www.w3.org/TR/WebCryptoAPI/#dfn-KeyFormat ¶14.2 Data Types]] in W3C spec */
@js.native
sealed trait KeyFormat extends js.Any

object KeyFormat {

  /** An unformatted sequence of bytes. Intended for secret keys. */
  val raw: KeyFormat = "raw".asInstanceOf[KeyFormat]

  /** The DER encoding of the PrivateKeyInfo structure from RFC 5208. */
  val pkcs8: KeyFormat = "pkcs8".asInstanceOf[KeyFormat]

  /** The DER encoding of the SubjectPublicKeyInfo structure from RFC 5280. */
  val spki: KeyFormat = "spki".asInstanceOf[KeyFormat]

  /** The key is a JsonWebKey dictionary encoded as a JavaScript object */
  val jwk: KeyFormat = "jwk".asInstanceOf[KeyFormat]
}
