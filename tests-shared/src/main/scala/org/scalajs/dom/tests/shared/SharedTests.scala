package org.scalajs.dom.tests.shared

import java.util.UUID
import org.junit.Test
import org.scalajs.dom._
import org.scalajs.dom.raw._

trait SharedTests {
  import SharedTests._

  // https://github.com/scala-js/scala-js-dom/issues/411 - console doesn't work in web workers
  @Test final def ConsoleLogTest(): Unit =
    console.log("Testing console.log")

  // https://github.com/scala-js/scala-js-dom/pull/432 - Avoid forcing evaluation of crypto
  @Test final def CryptoNonStrictTest(): Unit = {
    val _ = crypto.HashAlgorithm
  }

  @Test final def WindowIdbTest(): Unit =
    window.indexedDB.foreach(testIdb)

}

object SharedTests {
  def testIdb(idb: IDBFactory): Unit = {
    val open = idb.open(UUID.randomUUID().toString())
    open.onerror = (e: Event) => sys.error("idb open failed: " + e)
    // TODO: Test properly in a different PR
  }
}
