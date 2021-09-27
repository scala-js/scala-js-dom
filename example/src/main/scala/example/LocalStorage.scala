package example

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

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
