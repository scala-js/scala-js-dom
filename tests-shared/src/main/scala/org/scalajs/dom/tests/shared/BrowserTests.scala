package org.scalajs.dom.tests.shared

import org.junit.Assert.assertEquals
import org.junit.Test
import org.scalajs.dom.QueuingStrategy
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.ReadableStreamController
import org.scalajs.dom.ReadableStreamUnderlyingSource
import org.scalajs.dom.tests.shared.AsyncTesting.AsyncResult
import org.scalajs.dom.tests.shared.AsyncTesting._
import org.scalajs.dom.tests.shared.AsyncTesting.async

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.Thenable.Implicits._

trait BrowserTests {

  @Test
  final def ReadableStreamConstructionAndConsumptionTest: AsyncResult = async {
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
            controller.close(): js.UndefOr[js.Promise[Unit]]
          }): js.UndefOr[js.Function1[ReadableStreamController[Tuna], js.UndefOr[js.Promise[Unit]]]]
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

  @Test
  final def ReadableStreamQueueingStrategyTest: AsyncResult = async {
    val expectedStrings = Seq(
        "short one",
        "definitely a longer one"
    )

    val stream = ReadableStream[String](
        new ReadableStreamUnderlyingSource[String] {
          start = js.defined({ (controller: ReadableStreamController[String]) =>
            controller.enqueue("short one")
            controller.enqueue("definitely a longer one")
            controller.close(): js.UndefOr[js.Promise[Unit]]
          }): js.UndefOr[js.Function1[ReadableStreamController[String], js.UndefOr[js.Promise[Unit]]]]
        },
        new QueuingStrategy[String] {
          var highWaterMark = 1
          var size: js.Function1[String, Int] = { (chunk: String) =>
            chunk.length
          }
        }
    )

    val reader = stream.getReader()

    def read(strings: Seq[String]): Future[Seq[String]] = {
      reader
        .read()
        .flatMap { chunk =>
          if (chunk.done) {
            Future.successful(strings)
          } else {
            read(strings :+ chunk.value)
          }
        }
    }
    read(Seq.empty)
      .map { receivedStrings =>
        assertEquals(receivedStrings, expectedStrings)
      }
  }
}
