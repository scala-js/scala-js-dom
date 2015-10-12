package example

import org.scalajs.dom
import dom.html
import scala.scalajs.js.annotation.JSExport

@JSExport
object Alert {
  @JSExport
  def main() = {
    import org.scalajs.dom
    dom.window.alert("Hi from Scala-js-dom")
  }
}

@JSExport
object NodeAppendChild {
  @JSExport
  def main(div: html.Div) = {
    val child = dom.document
                   .createElement("div")

    child.textContent =
      "Hi from Scala-js-dom"

    div.appendChild(child)
  }
}

@JSExport
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

@JSExport
object LocalStorage {
  @JSExport
  def main(in: html.Input, box: html.Div) = {
    val key = "my-key"

    in.value =
      dom.window.localStorage.getItem(key)

    in.onkeyup = (e: dom.Event) => {
      dom.window.localStorage.setItem(
        key, in.value
      )
      box.textContent =
        "Saved! " + in.value
    }
  }
}

@JSExport
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

@JSExport
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

@JSExport
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

@JSExport
object XMLHttpRequest{
  @JSExport
  def main(pre: html.Pre) = {
    val xhr = new dom.XMLHttpRequest()
    xhr.open("GET",
      "http://api.openweathermap.org/" +
      "data/2.5/weather?q=Singapore"
    )
    xhr.onload = (e: dom.Event) => {
      if (xhr.status == 200) {
        pre.textContent =
          xhr.responseText
      }
    }
    xhr.send()
  }
}

@JSExport
object Websocket {
  @JSExport
  def main(in: html.Input,
           pre: html.Pre) = {
    val echo = "ws://echo.websocket.org"
    val socket = new dom.WebSocket(echo)
    socket.onmessage = {
      (e: dom.MessageEvent) =>
        pre.textContent +=
          e.data.toString
    }
    socket.onopen = (e: dom.Event) => {
      in.onkeyup = (e: dom.Event) => {
        socket.send(in.value)
      }
    }
  }
}

@JSExport
object AjaxExtension {
  @JSExport
  def main(pre: html.Pre) = {
    import dom.ext.Ajax
    import scalajs.concurrent
                  .JSExecutionContext
                  .Implicits
                  .runNow
    val url =
      "http://api.openweathermap.org/" +
      "data/2.5/weather?q=Singapore"
    Ajax.get(url).onSuccess{ case xhr =>
      pre.textContent = xhr.responseText
    }
  }
}
