lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js DOM"

normalizedName := "scalajs-dom"

version := "0.7.0-SNAPSHOT"

organization := "org.scala-js"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions ++= Seq("-deprecation", "-feature")

homepage := Some(url("http://scala-js.org/"))

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))
