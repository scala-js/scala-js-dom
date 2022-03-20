package org.scalajs.dom.tests.webworker

import org.scalajs.dom._
import scala.concurrent.ExecutionContext.Implicits.global

object Server extends ServerResponses {
  import Protocol._

  def main(args: Array[String]): Unit = {
    val ww = DedicatedWorkerGlobalScope.self

    ww.onmessage = (e: MessageEvent[Any]) => {
      val msgIn = e.data.asInstanceOf[Message]
      val id = msgIn._1
      val cmdId = msgIn._2
      val cmd = WebWorkerCmd.byId(cmdId)
      respond(cmd).onComplete { t =>
        val output = t.getOrElse(t.failed.get.toString)
        val msgOut = Message(id, output)
        ww.postMessage(msgOut)
      }
    }

    ww.postMessage(Message(ServerStarted, ""))
  }
}
