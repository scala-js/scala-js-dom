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
