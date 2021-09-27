package example

import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleNodeAppendChild")
object NodeAppendChild {
  @JSExport
  def main(div: html.Div) = {
    val child = dom.document.createElement("div")
    child.textContent = "Hi from Scala-js-dom"
    div.appendChild(child)
  }
}
