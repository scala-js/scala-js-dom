package example

import scala.scalajs.js.JSApp

import org.scalajs.dom


trait Example {
  // name of example
  val title: String
  // supporting HTML to run the example
  val html: String
  // scala.js code to be executed
  def run: Unit
}


object Alert extends Example {
  val title: String = "alert"
  val html = ""
  def run: Unit = {
    dom.alert("Hi from Scala-js-dom")
  }
}


object NodeAppendChild extends Example {
  val title = "Node.appendChild"
  val html = """<div id="container"><div>"""
  def run: Unit = {
    val container = dom.document.getElementById("container")
    val content = dom.document.createElement("span")
    content.textContent = "Hi from Scala-js-dom"
    container.appendChild(content)
  }
}


/** DemoApp scala-js-dom
  *
  * Left side #examples contains a link for each API example.
  * Right side #output contains the resulting tree of the example execution.
  * TODO: it would be nice to show the original scala code
  */
object DemoApp extends JSApp {
  val examples = dom.document.getElementById("examples")
  val title = dom.document.getElementById("ex-title")
  val sandbox = dom.document.getElementById("ex-sandbox")

  // include given Example in the list of examples
  def addExample(ex: Example){
    val div = dom.document.createElement("div")
    val link = dom.document.createElement("a").asInstanceOf[dom.HTMLAnchorElement]
    link.href = "#" + ex.title
    link.textContent = ex.title
    link.onclick = (_: dom.MouseEvent) => showExample(ex)

    div.appendChild(link)
    examples.appendChild(div)
  }

  // callback to update UI and run given example
  def showExample(ex: Example){
    title.textContent = ex.title
    sandbox.innerHTML = ex.html
    ex.run
  }

  def main(): Unit = {
    addExample(Alert)
    addExample(NodeAppendChild)
  }
}
