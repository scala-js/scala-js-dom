package example

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom
import dom.html

@JSExportTopLevel("ExampleFetch")
object Fetch {
  @JSExport
  def main(pre: html.Pre) = {
    import scala.concurrent
                .ExecutionContext
                .Implicits
                .global
    import js.Thenable.Implicits._
    val url =
      "https://www.boredapi.com/api/activity"
    val responseText = for {
      response <- dom.fetch(url)
      text <- response.text()
    } yield {
      text
    }
    for (text <- responseText)
      pre.textContent = text
  }
}
