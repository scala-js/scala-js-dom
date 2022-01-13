package org.scalajs.dom.tests.shared

import org.junit.Assert._
import org.junit.Test
import org.scalajs.dom
import org.scalajs.dom.tests.shared.AsyncTesting._

import scala.scalajs.js
import scala.scalajs.js.typedarray._

trait WebCryptoApiTests {

  @Test final def getRandomValuesWork: Unit = {
    dom.webcrypto.getRandomValues(Array.ofDim[Byte](8).toTypedArray)
  }

  @Test final def generateAESEncryptionKeyWorks: AsyncResult = async {
    generateAESEncryptionKey()
  }

  @Test final def aesEncryptionDecryptionTest: AsyncResult = async {
    val data = "data"
    for {
      key <- generateAESEncryptionKey()
      iv = generateAESInitializationVector()
      encrypted <- aesEncrypt(key, iv, data)
      decrypted <- aesDecrypt(key, iv, encrypted)
    } yield assertEquals(data, decrypted)
  }

  @Test final def aesKeyDerivationWorks: AsyncResult = async {
    val derivationAlgorithm = "PBKDF2"
    val pbdkf2 = new dom.Pbkdf2Params {
      val name = derivationAlgorithm
      val salt = "salt".getBytes.toTypedArray.buffer
      val iterations = 100.toDouble
      val hash = "SHA-512"
    }
    val aesCtr = new dom.AesDerivedKeyParams {
      val name = "AES-GCM"
      val length = 256
    }

    for {
      pbkdf2Key <- dom.crypto.subtle
        .importKey(
            dom.KeyFormat.raw,
            "password".getBytes.toTypedArray.buffer,
            derivationAlgorithm,
            false,
            js.Array(dom.KeyUsage.deriveKey, dom.KeyUsage.deriveBits)
        )
        .toFuture

      aesKey <- dom.crypto.subtle
        .deriveKey(
            pbdkf2,
            pbkdf2Key,
            aesCtr,
            true,
            js.Array(dom.KeyUsage.encrypt, dom.KeyUsage.decrypt)
        )
        .toFuture
        .map(_.asInstanceOf[dom.CryptoKey])
    } yield assertNotNull(aesKey)
  }

  private def generateAESEncryptionKey() = {
    dom.crypto.subtle
      .generateKey(
          new dom.AesKeyAlgorithm {
            val name = "AES-GCM"
            val length = 256
          },
          true,
          js.Array(dom.KeyUsage.encrypt, dom.KeyUsage.decrypt)
      )
      .toFuture
      .map(_.asInstanceOf[dom.CryptoKey])
  }

  private def generateAESInitializationVector() = {
    dom.webcrypto.getRandomValues(Array.ofDim[Byte](12).toTypedArray)
  }

  private def aesEncrypt(key: dom.CryptoKey, iv0: dom.BufferSource, data: String) = {
    dom.crypto.subtle
      .encrypt(
          new dom.AesGcmParams {
            val name = "AES-GCM"
            val iv = iv0
            val tagLength = 128
            val additionalData = "".getBytes.toTypedArray.buffer
          },
          key,
          data.getBytes().toTypedArray
      )
      .toFuture
      .map(_.asInstanceOf[ArrayBuffer])
  }

  private def aesDecrypt(key: dom.CryptoKey, iv0: dom.BufferSource, encrypted: dom.BufferSource) = {
    dom.crypto.subtle
      .decrypt(
          new dom.AesGcmParams {
            val name = "AES-GCM"
            val iv = iv0
            val tagLength = 128
            val additionalData = "".getBytes.toTypedArray.buffer
          },
          key,
          encrypted
      )
      .toFuture
      .map(_.asInstanceOf[ArrayBuffer])
      .map { buffer =>
        val arr = Array.ofDim[Byte](buffer.byteLength)
        TypedArrayBuffer.wrap(buffer).get(arr)
        new String(arr, "UTF-8")
      }
  }
}
