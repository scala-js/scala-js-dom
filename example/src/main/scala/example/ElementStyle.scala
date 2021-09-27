package example

import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleElementStyle")
object ElementStyle {
  @JSExport
  def main(div: html.Div) = {
    val colors = Seq(
      "red", "green", "blue"
    )

    val index =
      util.Random.nextInt(colors.length)

    div.style.color = colors(index)
  }
}
