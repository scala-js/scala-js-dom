package org.scalajs.dom.tests.shared

import org.junit.Assert.assertEquals
import org.junit.Test
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.ReadableStreamController
import org.scalajs.dom.ReadableStreamUnderlyingSource
import org.scalajs.dom.tests.shared.AsyncTesting.AsyncResult
import org.scalajs.dom.tests.shared.AsyncTesting._
import org.scalajs.dom.tests.shared.AsyncTesting.async

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.Thenable.Implicits._
import scala.scalajs.js.|

trait BrowserTests {

  @Test
  final def ReadableStreamTest: AsyncResult = async {
    case class Tuna(color: String)

    val expectedTunas = Seq(
        Tuna("blue"),
        Tuna("red")
    )

    val stream = ReadableStream[Tuna](
        new ReadableStreamUnderlyingSource[Tuna] {
          start = js.defined({ (controller: ReadableStreamController[Tuna]) =>
            controller.enqueue(Tuna("blue"))
            controller.enqueue(Tuna("red"))
            controller.close(): Unit | js.Promise[Unit]
          }): js.UndefOr[js.Function1[ReadableStreamController[Tuna], Unit | js.Promise[Unit]]]
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
