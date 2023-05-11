---
layout: doc
title: scalajs-dom
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

then enjoy the types available in org.scalajs.dom. scalajs-dom @VERSION@ is built and published for Scala.js 1.7+ with Scala 2.11, 2.12, 2.13, and 3.1+.

To begin with, scala-js-dom organizes the full-list of DOM APIs into a number of buckets:

- dom.html: HTML element APIs
- dom.svg: SVG element APIs
- dom.idb: IndexedDB APIs
- dom.css: CSS APIs
- dom: Miscellanious, unclassified APIs

Most names have been shortened from names of the raw browser APIs, since the namespacing avoids collisions. By convention these types are imported qualified: e.g. as `html.Canvas` instead of directly as `Canvas`. There is also the `dom.raw` namespace which contains everything with their full, un-shortened name.

## Examples

You can start using the bindings using the following import:

```scala mdoc:js:shared
import org.scalajs.dom._
```

### Appending a child to a `Node`

```scala mdoc:js:shared
def appendElement(div: html.Div): Unit = {
  val child = document.createElement("div")
  child.textContent = "I can add elements to DOM elements!"
  div.appendChild(child)
}
```

```scala mdoc:js:invisible
<div id="outer-container"></div>
<button id="demo1-btn" class="button-run">Run</button>
---
document.getElementById("demo1-btn").addEventListener("click", (ev: Event) => {
  appendElement(document.getElementById("outer-container").asInstanceOf[html.Div])
})
```

### Add an EventListener for `onmousemove`

```scala mdoc:js:shared
def showOnMouseCoordinates(mouseArea: html.Div, info: html.Pre): Unit = {
  mouseArea.onmousemove = (ev: MouseEvent) =>
    info.textContent = s"""
      |ev.clientX: ${ev.clientX}
      |ev.clientY: ${ev.clientY}
      |ev.pageX:   ${ev.pageX}
      |ev.screenX: ${ev.screenX}
      |ev.screenY: ${ev.screenY}
    """.stripMargin
}
```

```scala mdoc:js:invisible
<div id="demo2-container" style="display: flex; gap: 3em; margin-bottom: 1rem;">
  <div id="mouse-container" style="width:300px;height:300px;border: 5px solid black;"></div>
  <pre id="demo2-output"></pre>
</div>
---
val mouseArea = document.getElementById("mouse-container").asInstanceOf[html.Div]
val info = document.getElementById("demo2-output").asInstanceOf[html.Pre]
showOnMouseCoordinates(mouseArea, info)
```

### Storing an item in `localStorage`

```scala mdoc:js:shared
def storeInputInLocalStorage(input: html.Input, box: html.Div) = {
  val key = "myKey"
  input.value = window.localStorage.getItem(key)

  input.onkeyup = { (e: Event) =>
    window.localStorage.setItem(key, input.value)

    box.textContent = s"Saved: ${input.value} to local storage!"
  }
}
```

```scala mdoc:js:invisible
<input id="demo3-input" type="text" />
<div id="demo3-output"></div>
<button id="demo3-btn" class="button-run">Run</button>
---
val input = document.getElementById("demo3-input").asInstanceOf[html.Input]
val output = document.getElementById("demo3-output").asInstanceOf[html.Div]
storeInputInLocalStorage(input, output)
```

### Using `Canvas` to draw

```scala mdoc:js:shared
type Context2D = CanvasRenderingContext2D

def drawCuteSmiley(canvas: html.Canvas) = {
  val context = canvas.getContext("2d").asInstanceOf[Context2D]

  val size = 150
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

```scala mdoc:js:invisible
<canvas id="demo4-canvas"></canvas>
---

val canvas = document.getElementById("demo4-canvas").asInstanceOf[html.Canvas]
drawCuteSmiley(canvas)
```

### Using `Fetch` to make API calls in the browser

```scala mdoc:js:shared
import scala.concurrent.ExecutionContext.Implicits.global

def fetchBoredApi(element: html.Pre) = {
  val url = "https://www.boredapi.com/api/activity"

  val responseText = for {
    response <- fetch(url).toFuture
    text <- response.text().toFuture
  } yield {
    text
  }

  for (text <- responseText)
    element.textContent = text
}
```

```scala mdoc:js:invisible
<pre id="demo5-output"></pre>
<button id="demo5-btn" class="button-run">Run</button>
---
val output = document.getElementById("demo5-output").asInstanceOf[html.Pre]
document.getElementById("demo5-btn").addEventListener("click", (ev: Event) => {
  fetchBoredApi(output)
})
```

### Styling an HTML element

```scala mdoc:js:shared
def changeColor(div: html.Div) = {
  val colors = Seq("red", "green", "blue")
  val index = util.Random.nextInt(colors.length)

  div.style.color = colors(index)
}
```

```scala mdoc:js:invisible
<div id="demo6-text">Color me!</div>
<button id="demo6-btn" class="button-run">Run</button>
---
document.getElementById("demo6-btn").addEventListener("click", (ev: Event) => {
  changeColor(document.getElementById("demo6-text").asInstanceOf[html.Div])
})
```

### Encode in base64

```scala mdoc:js:shared
def encodeBase64(in: html.Input, out: html.Div) = {
  in.onkeyup = { (e: Event) =>
    out.textContent = window.btoa(in.value)
  }
}
```

```scala mdoc:js:invisible
<input id="demo7-input"/>
<div id="demo7-output"></div>
---
val input = document.getElementById("demo7-input").asInstanceOf[html.Input]
val output = document.getElementById("demo7-output").asInstanceOf[html.Div]
encodeBase64(input, output)
```

## Contributing

The DOM API is always evolving, and `scala-js-dom` tries to provide a thin-but-idiomatic Scala interface to modern browser APIs, without breaking the spec.

If you see something that you think can be improved, feel free to send a pull request.
See our [Contributing Guide](https://github.com/scala-js/scala-js-dom/blob/main/CONTRIBUTING.md) for a detailed overview for starting hacking on `scala-js-dom` and making a PR!
