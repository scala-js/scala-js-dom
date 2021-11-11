package org.scalajs.dom.tests.shared

import org.junit.Assert.assertEquals
import org.junit.Test
import org.scalajs.dom.tests.shared.AsyncTesting._

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.Thenable.Implicits._

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

  @Test
  final def ReadableStreamTest: AsyncResult = async {
    case class Tuna(color: String)

    val expectedTunas = Seq(
        Tuna("blue"),
        Tuna("red")
    )

    val stream = ReadableStream[Tuna](
        new ReadableStreamUnderlyingSource[Tuna] {
          start = { (controller: ReadableStreamController[Tuna]) =>
            controller.enqueue(Tuna("blue"))
            controller.enqueue(Tuna("red"))
            controller.close()
          }: js.Function1[ReadableStreamController[Tuna], Unit]
        }
    )

    val reader = stream.getReader()

    def read(tunas: Seq[Tuna]): Future[Seq[Tuna]] = {
      reader
        .read()
        .flatMap { chunk =>
          if (chunk.done) {
            Future.successful(tunas)
          } else {
            read(tunas :+ chunk.value)
          }
        }
    }
    read(Seq.empty)
      .map { receivedTunas =>
        assertEquals(receivedTunas, expectedTunas)
      }
  }
}
