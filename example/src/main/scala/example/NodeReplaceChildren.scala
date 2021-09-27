package example

import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

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
