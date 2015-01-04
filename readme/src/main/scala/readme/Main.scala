package readme

import java.nio.file.{Paths, Files}

import scalatags.Text.all._

object Main{
  def main(args: Array[String]): Unit = {
    new scalatex.site.Site{
      def content = Map("index.html" -> Index())
      override def autoResources = super.autoResources + "example-opt.js"
      override def generateHtml(outputRoot: String) = {
        for((path, frag) <- content){
          val txt = html(
            head(headFrags),
            bodyFrag(frag)
          ).render
          Files.write(
            Paths.get(outputRoot + path),
            ("<!DOCTYPE html>" + txt).getBytes
          )
        }

      }
    }.renderTo("readme/target/output/")
  }
}
object sect extends scalatex.site.Section()
object hl extends scalatex.site.Highlighter{
  def scala(s: String) = this.highlight(s, "scala")
  def suffixMappings = Map(
    "scala" -> "scala"
  )
  override def pathMappings = Seq(
    "" -> "https://github.com/scala-js/scala-js-dom/tree/master"
  )
}
