package org.scalajs.dom.tests.webworker

import scala.language.implicitConversions
import scala.concurrent.Future
import org.junit.Assert._
import org.junit.Test
import org.scalajs.dom.tests.shared.AsyncTesting._

// =====================================================================================================================
sealed abstract class WebWorkerCmd {
  def id = toString
}

object WebWorkerCmd {

  case object SayHello extends WebWorkerCmd
  case object TestConsole extends WebWorkerCmd
  case object TestIdb extends WebWorkerCmd

  def byId(id: String): WebWorkerCmd =
    id match {
      case "SayHello"    => SayHello
      case "TestConsole" => TestConsole
      case "TestIdb"     => TestIdb
    }
}

import WebWorkerCmd._

// =====================================================================================================================
trait WebWorkerTests {
  import Client.{global => client}

  final protected def webWorkerTest(test: (WebWorkerCmd, String)) = async {
    client.send(test._1).assertEquals(test._2)
  }

  @Test final def WebWorkerHelloTest() =
    webWorkerTest(SayHello -> "hello")

  @Test final def WebWorkerConsoleTest() =
    webWorkerTest(TestConsole -> "ok")

  @Test final def WebWorkerIdbTest() =
    webWorkerTest(TestIdb -> "ok")
}

// =====================================================================================================================
trait ServerResponses {
  import org.scalajs.dom._
  import org.scalajs.dom.tests.shared._
  import org.scalajs.dom.DedicatedWorkerGlobalScope.self

  private implicit def autoLift(s: => String): Future[String] =
    Future(s)

  private implicit class AsyncOps(r: AsyncResult) {

    def andReturn(s: String): Future[String] =
      r.map { t =>
        t.get
        s
      }
  }

  final val respond: WebWorkerCmd => Future[String] = {

    case SayHello =>
      "hello"

    case TestConsole =>
      console.log("WW console.log test")
      "ok"

    case TestIdb =>
      assertTrue(self.indexedDB.isDefined)
      IdbTest(self.indexedDB.get).andReturn("ok")
  }
}
