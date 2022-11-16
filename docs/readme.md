## scala-js-dom

---

#### Statically typed DOM API for Scala.js

Scala-js-dom provides a nice statically typed interface to the DOM such that it can be called from Scala code without resorting to `js.Dynamic`.
All javascript globals functions, singletons and classes are members of the `org.scalajs.dom`,
`org.scalajs.dom.html`, `org.scalajs.dom.svg`, etc. packages.

For example:

```scala
import org.scalajs.dom

def main() = dom.window.alert("Hi from scala-js-dom!")
```

## Usage

Add the following to your sbt build definition:

```scala
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "@VERSION@"
```

then enjoy the types available in org.scalajs.dom. scalajs-dom @VERSION@ is built and published for Scala.js 1.5+ with Scala 2.11, 2.12, 2.13, and 3.0+.

To begin with, scala-js-dom organizes the full-list of DOM APIs into a number of buckets:

- dom.html: HTML element APIs
- dom.svg: SVG element APIs
- dom.idb: IndexedDB APIs
- dom.css: CSS APIs
- dom: Miscellanious, unclassified APIs

Most names have been shortened from names of the raw browser APIs, since the namespacing avoids collisions. By convention these types are imported qualified: e.g. as `html.Canvas` instead of directly as `Canvas`. There is also the `dom.raw` namespace which contains everything with their full, un-shortened name.

## Examples

### Appending a child to a `Node`

```scala mdoc:js
import org.scalajs.dom._

def appendElement(div: html.Div): Unit = {
  val child = document.createElement("div")
  child.textContent = "I can add elements to DOM elements!"
  div.appendChild(child)
}
```

### Add an EventListener for `onmousemove`

```scala mdoc:js
import org.scalajs.dom._

def showOnMouseCoordinates(pre: html.Pre): Unit = {
  pre.onmousemove = (ev: MouseEvent) =>
    pre.textContent = s"""
      |ev.clientX: ${ev.clientX}
      |ev.clientY: ${ev.clientY}
      |ev.pageX:   ${ev.pageX}
      |ev.screenX: ${ev.screenX}
      |ev.screenY: ${ev.screenY}
    """.stripMargin
}
```

### Storing an item in `localStorage`

```scala mdoc:js
def storeInputInLocalStorage(input: html.Input, box: html.Div) = {
  val key = "myKey"
  input.value = dom.window.localStorage.getItem(key)

  input.onkeyup = { (e: dom.Event) =>
    dom.window.localStorage.setItem(
      key, input.value
    )

    output.textContent = s"Saved: ${input.value} to local storage!"
  }
}
```

### Using `Canvas` to draw

```scala mdoc:js

type Context2D = dom.CanvasRenderingContext2D

def drawCuteSmiley(canvas: html.Canvas) = {
  val context = canvas.getContext("2d").asInstanceOf[Context2D]

  val size = 300
  canvas.width = size
  canvas.height = size

  context.strokeStyle = "red"
  context.lineWidth = 3
  context.beginPath()
  context.moveTo(size/3, 0)
  context.lineTo(size/3, size/3)
  context.moveTo(size*2/3, 0)
  context.lineTo(size*2/3, size/3)
  context.moveTo(size, size/2)
  context.arc(size/2, size/2, size/2, 0, 3.14)

  context.stroke()
}
```

### Using `Fetch` to make API calls in the browser

```scala mdoc:js
def fetchBoredApi(element: html.Pre) = {
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
```

### Using Websockets

```scala mdoc:js
def echoWebSocket(input: html.Input, pre: html.Pre) = {
  val echo = "wss://echo.websocket.org"
  val socket = new dom.WebSocket(echo)

  socket.onmessage = {
    (e: dom.MessageEvent) =>
      pre.textContent +=
        e.data.toString
  }

  socket.onopen = { (e: dom.Event) =>
    in.onkeyup = { (e: dom.Event) =>
      socket.send(input.value)
    }
  }
}
```

### Styling an HTML element

```scala mdoc:js
def changeColor(div: html.Div) = {
  val colors = Seq("red", "green", "blue")

  val index = util.Random.nextInt(colors.length)

  div.style.color = colors(index)
}
```

## Contributing

The DOM API is always evolving, and `scala-js-dom` tries to provide a thin-but-idiomatic Scala interface to modern browser APIs, without breaking the spec.

If you see something that you think can be improved, feel free to send a pull request. See our [Contributing Guide](https://github.com/scala-js/scala-js-dom/blob/main/CONTRIBUTING.md) for a detailed overview for starting hacking on `scala-js-dom` and making a PR!
