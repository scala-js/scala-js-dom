package readme

import scalatex.site

object Main extends site.Main(
  "https://github.com/scala-js/scala-js-dom/tree/master",
  ammonite.ops.cwd,
  ammonite.ops.cwd/'target/'site,
  readme.Index()
)
