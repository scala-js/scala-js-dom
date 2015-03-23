package readme

import java.nio.file.{Paths, Files}

import scalatags.Text.all._
import ammonite.ops._
object Main{
  def main(args: Array[String]): Unit = {
    val ghLink = a(
      href:="https://github.com/scala-js/scala-js-dom",
      position.absolute,
      top:=0,right:=0,border:=0,
      img(
        src:="https://camo.githubusercontent.com/a6677b08c955af8400f44c6298f40e7d19cc5b2d/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f72696768745f677261795f3664366436642e706e67",
        alt:="Fork me on GitHub"
      )
    )
    new scalatex.site.Site{
      def content = Map("index.html" -> Index())
      override def autoResources = super.autoResources ++ Seq(
        root/"example-opt.js",
        root/'scalatex/'scrollspy/"scrollspy.js"
      )

      override def bodyFrag(frag: Frag) = {
        Seq(
          ghLink,
          div(
            position.fixed,
            overflow.scroll,
            backgroundColor := "#191818",
            height := "100%",
            width := 250,
            left := 0,
            top := 0,
            a(href:="#menu", id:="menu-link", cls:="menu-link")(
              span
            ),
            div(id:="menu")
          ),
          div(
            marginLeft := 250,
            super.bodyFrag(frag)
          ),
          script(raw(s"""
            scalatex.scrollspy.Controller().main(
              ${upickle.write(sect.structure.children(0))},
              document.getElementById("menu"),
              document.getElementById("menu-link")
          )"""))
        )
      }
      override def generateHtml(outputRoot: Path) = {
        for((path, frag) <- content){
          val txt = html(
            head(headFrags),
            bodyFrag(frag)
          ).render
          write.over(
            outputRoot/path,
            ("<!DOCTYPE html>" + txt).getBytes
          )
        }

      }
    }.renderTo(cwd/'readme/'target/'output)
  }
}
object sect extends scalatex.site.Section()
object hl extends scalatex.site.Highlighter{
  def scala(s: String) = this.highlight(s, "scala")
  def suffixMappings = Map(
    "scala" -> "scala"
  )
  override def pathMappings = Seq(
    root -> "https://github.com/scala-js/scala-js-dom/tree/master"
  )
}
