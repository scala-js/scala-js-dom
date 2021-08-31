package org.scalajs.dom.tests.webworker

import org.scalajs.dom.webworkers._

object Server extends ServerResponses {
  import Protocol._

  def main(args: Array[String]): Unit = {
    val ww = DedicatedWorkerGlobalScope.self

    ww.onmessage = e => {
      val msgIn  = e.data.asInstanceOf[Message]
      val id     = msgIn._1
      val cmdId  = msgIn._2
      val cmd    = WebWorkerCmd.byId(cmdId)
      val output = respond(cmd)
      val msgOut = Message(id, output)
      ww.postMessage(msgOut)
    }

    ww.postMessage(Message(ServerStarted, ""))
  }
}
