package example

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleAlert")
object Alert {
  @JSExport
  def main() = {
    import org.scalajs.dom
    dom.window.alert("Hi from Scala-js-dom")
  }
}

@JSExportTopLevel("ExampleNodeAppendChild")
object NodeAppendChild {
  @JSExport
  def main(div: html.Div) = {
    val child = dom.document.createElement("div")
    child.textContent = "Hi from Scala-js-dom"
    div.appendChild(child)
  }
}

@JSExportTopLevel("ExampleNodeReplaceChildren")
object NodeReplaceChildren {
  @JSExport
  def main(div: html.Div): Unit = {
    dom.document.replaceChildren()
    dom.document.replaceChildren("")
    dom.document.replaceChildren(div)
    dom.document.replaceChildren("", div)
  }
}

@JSExportTopLevel("ExampleElementStyle")
object ElementStyle {
  @JSExport
  def main(div: html.Div) = {
    val colors = Seq(
      "red", "green", "blue"
    )

    val index =
      util.Random.nextInt(colors.length)

    div.style.color = colors(index)
  }
}

@JSExportTopLevel("ExampleLocalStorage")
object LocalStorage {
  @JSExport
  def main(in: html.Input, box: html.Div) = {
    val key = "my-key"

    in.value =
      dom.window.localStorage.getItem(key)

    in.onkeyup = { (e: dom.Event) =>
      dom.window.localStorage.setItem(
        key, in.value
      )
      box.textContent =
        "Saved! " + in.value
    }
  }
}

@JSExportTopLevel("ExampleCanvas")
object Canvas {
  @JSExport
  def main(c: html.Canvas) = {
    type Ctx2D =
      dom.CanvasRenderingContext2D
    val ctx = c.getContext("2d")
               .asInstanceOf[Ctx2D]
    val w = 300
    c.width = w
    c.height = w

    ctx.strokeStyle = "red"
    ctx.lineWidth = 3
    ctx.beginPath()
    ctx.moveTo(w/3, 0)
    ctx.lineTo(w/3, w/3)
    ctx.moveTo(w*2/3, 0)
    ctx.lineTo(w*2/3, w/3)
    ctx.moveTo(w, w/2)
    ctx.arc(w/2, w/2, w/2, 0, 3.14)

    ctx.stroke()
  }
}

@JSExportTopLevel("ExampleBase64")
object Base64 {
  @JSExport
  def main(in: html.Input,
           out: html.Div) = {
    in.onkeyup = { (e: dom.Event) =>
      out.textContent =
        dom.window.btoa(in.value)
    }
  }
}

@JSExportTopLevel("ExampleEventHandler")
object EventHandler{
  @JSExport
  def main(pre: html.Pre) = {
    pre.onmousemove = {
      (e: dom.MouseEvent) =>
        pre.textContent =
          s"""e.clientX ${e.clientX}
             |e.clientY ${e.clientY}
             |e.pageX   ${e.pageX}
             |e.pageY   ${e.pageY}
             |e.screenX ${e.screenX}
             |e.screenY ${e.screenY}
           """.stripMargin
    }
  }
}

@JSExportTopLevel("ExampleFetch")
object Fetch {
  @JSExport
  def main(pre: html.Pre) = {
    import scala.concurrent
                .ExecutionContext
                .Implicits
                .global
    import js.Thenable.Implicits._
    val url =
      "https://www.boredapi.com/api/activity"
    val responseText = for {
      response <- dom.fetch(url)
      text <- response.text()
    } yield {
      text
    }
    for (text <- responseText)
      pre.textContent = text
  }
}

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
