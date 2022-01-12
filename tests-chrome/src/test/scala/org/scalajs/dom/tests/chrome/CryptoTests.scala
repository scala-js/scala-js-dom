package org.scalajs.dom.tests.chrome

import org.junit.Test

class CryptoTests {
  import org.scalajs.dom
  import scala.scalajs.js.typedarray._

  @Test final def cryptoGetRandomValuesWork(): Unit = {
    // This fails
    dom.crypto.getRandomValues(Array.ofDim[Byte](8).toTypedArray)
  }

  @Test final def webcryptoGetRandomValuesWork(): Unit = {
    dom.webcrypto.getRandomValues(Array.ofDim[Byte](8).toTypedArray)
  }

  @Test final def cryptoCryptoGetRandomValuesWork(): Unit = {
    dom.crypto.crypto.getRandomValues(Array.ofDim[Byte](8).toTypedArray)
  }
}
