package example

import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleWebsocket")
object Websocket {
  @JSExport
  def main(in: html.Input,
           pre: html.Pre) = {
    val echo = "wss://echo.websocket.org"
    val socket = new dom.WebSocket(echo)
    socket.onmessage = {
      (e: dom.MessageEvent) =>
        pre.textContent +=
          e.data.toString
    }
    socket.onopen = { (e: dom.Event) =>
      in.onkeyup = { (e: dom.Event) =>
        socket.send(in.value)
      }
    }
  }
}
