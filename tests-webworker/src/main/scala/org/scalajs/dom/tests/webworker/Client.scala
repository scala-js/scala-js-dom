package org.scalajs.dom.tests.webworker

import org.scalajs.dom._
import scala.concurrent._
import scala.scalajs.js
import scala.util.Success

final class Client(worker: Worker) {
  import Protocol._

  private var preInit = new js.Array[Message]
  private var promises = new js.Array[Promise[String]]

  worker.onmessage = (e: MessageEvent[Any]) => {
    val m = e.data.asInstanceOf[Message]
    if (m._1 == ServerStarted) {
      preInit.foreach(worker.postMessage(_))
      preInit = null
    } else
      promises(m._1).complete(Success(m._2))
  }

  def send(cmd: WebWorkerCmd): Future[String] = {
    val id = promises.length
    val p = Promise[String]()
    val m = Message(id, cmd.id)
    promises.push(p)
    if (preInit eq null)
      worker.postMessage(m)
    else
      preInit.push(m)
    p.future
  }
}

object Client {

  def workerUrl: String =
    "file://" + BuildInfo.wwJsPath

  lazy val global =
    new Client(new Worker(workerUrl))
}
