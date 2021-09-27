package org.scalajs.dom.tests.webworker

import scala.language.implicitConversions
import scala.concurrent.Future
import org.junit.Assert._
import org.scalajs.dom.tests.shared.AsyncTesting._

import WebWorkerCmd._

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
