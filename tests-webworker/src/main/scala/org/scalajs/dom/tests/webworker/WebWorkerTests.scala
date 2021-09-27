package org.scalajs.dom.tests.webworker

import scala.language.implicitConversions
import scala.concurrent.Future
import org.junit.Assert._
import org.junit.Test
import org.scalajs.dom.tests.shared.AsyncTesting._

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
