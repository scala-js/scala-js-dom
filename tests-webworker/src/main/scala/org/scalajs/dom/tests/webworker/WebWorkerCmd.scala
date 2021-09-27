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
