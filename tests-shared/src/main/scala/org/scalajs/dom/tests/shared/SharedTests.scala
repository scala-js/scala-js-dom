package org.scalajs.dom.tests.shared

import org.scalajs.dom.tests.shared.AsyncTesting._
import org.junit.Test

trait SharedTests {

  // ===================================================================================================================
  // Tests WITHOUT org.scalajs.dom._ in scope

  // This tests that ops are always implicitly available, no imports required
  @Test final def NodeListOpsTest(): Unit =
    org.scalajs.dom.document.body.childNodes.mkString

  // This tests that ops are always implicitly available, no imports required
  @Test final def DOMTokenListOpsTest(): Unit = {
    org.scalajs.dom.document
      .querySelectorAll("*")
      .iterator
      .collect { case e: org.scalajs.dom.html.Element => e }
      .map(_.classList.mkString)
  }

  // ===================================================================================================================
  // Tests WITH org.scalajs.dom._ in scope
  import org.scalajs.dom._

  // https://github.com/scala-js/scala-js-dom/issues/411 - console doesn't work in web workers
  @Test final def ConsoleLogTest(): Unit =
    console.log("Testing console.log")

  // https://github.com/scala-js/scala-js-dom/pull/432 - Avoid forcing evaluation of crypto
  @Test final def CryptoNonStrictTest(): Unit = {
    val _ = HashAlgorithm
  }

  @Test final def WindowIdbTest(): AsyncResult =
    IdbTest(window.indexedDB)

  @Test final def encodeDecodeUriTest(): Unit = {
    val input = "?=/&:шеллы"
    val encoded = window.encodeURIComponent(input)
    val decoded = window.decodeURIComponent(encoded)
    org.junit.Assert.assertEquals(input, decoded)
  }
}
