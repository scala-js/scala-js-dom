package example

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleEventHandler")
object EventHandler{
  @JSExport
  def main(pre: html.Pre) = {
    pre.onmousemove = {
      (e: dom.MouseEvent) =>
        pre.textContent =
          s"""e.clientX ${e.clientX}
             |e.clientY ${e.clientY}
             |e.pageX   ${e.pageX}
             |e.pageY   ${e.pageY}
             |e.screenX ${e.screenX}
             |e.screenY ${e.screenY}
           """.stripMargin
    }
  }
}
