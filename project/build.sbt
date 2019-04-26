val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.27")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.3.9")

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.6.8")
