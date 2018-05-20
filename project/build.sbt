val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.23")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.2.1")

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.5.1")
