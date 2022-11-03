## scala-js-dom
---
#### Statically typed DOM API for Scala.js

Scala-js-dom provides a nice statically typed interface to the DOM such that it can be called from Scala code without resorting to `js.Dynamic`.
All javascript globals functions, singletons and classes are members of the `org.scalajs.dom`, 
`org.scalajs.dom.html`, `org.scalajs.dom.svg`, etc. packages.

For example:

```scala
import org.scalajs.dom

def main() = {
  dom.window.alert("Hi from scala-js-dom!")
}
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

Most names have been shortened from names of the raw browser APIs, since the namespacing avoids collisions. By convention these types are imported qualified: e.g. as html.Canvas instead of directly as Canvas. There is also the dom.raw namespace which contains everything with their full, un-shortened name.

## Examples

### Appending a child to a Node

```scala mdoc:js
import org.scalajs.dom._

def appendElement(div: html.Div): Unit = {
  val child = document.createElement("div")
  child.textContent = "I can add elements to DOM elements!"
  div.appendChild(child) 
}
```

### Add an EventListener for onmousemove

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