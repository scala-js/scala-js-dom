val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_ != "").getOrElse("1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.3.11")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.0")
