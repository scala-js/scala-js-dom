package example

import scala.scalajs.js.annotation._

@JSExportTopLevel("ExampleAlert")
object Alert {
  @JSExport
  def main() = {
    import org.scalajs.dom
    dom.window.alert("Hi from Scala-js-dom")
  }
}
