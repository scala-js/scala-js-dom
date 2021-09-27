package example

import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

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
