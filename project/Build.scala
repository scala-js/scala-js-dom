import sbt._
import sbt.Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import scalafix.sbt.ScalafixPlugin
import scalafix.sbt.ScalafixPlugin.autoImport._
import scalatex.ScalatexReadme
import Dependencies._
import Lib._

object Build {

  // TODO: Change root from {.root => .} and dom from {. => dom}

  lazy val root = project
    .in(file(".root"))
    .configure(commonSettings, crossScala, preventPublication)
    .settings(
      name := "Scala.js DOM",
    )
    .aggregate(
      scalafixRules,
      dom,
      example,
      // readme, // This is a Scala 2.12 only module
    )

  lazy val dom = project
    .in(file("."))
    .dependsOn(scalafixRules % ScalafixConfig)
    .enablePlugins(ScalaJSPlugin, ScalafixPlugin)
    .configure(commonSettings, crossScala, publicationSetttings)
    .settings(
      moduleName := "scalajs-dom",
      Compile / unmanagedSourceDirectories +=
        collectionsEraDependentDirectory(scalaVersion.value, (Compile / sourceDirectory).value),
    )

  lazy val scalafixRules = project
    .in(file("scalafix"))
    .configure(commonSettings, crossScala, preventPublication)
    .settings(
      libraryDependencies += Dep.scalafixCore.value,
    )

  lazy val example = project
    .dependsOn(dom)
    .enablePlugins(ScalaJSPlugin)
    .configure(commonSettings, crossScala, preventPublication)

  lazy val readme =
    ScalatexReadme(
      projectId     = "readme",
      wd            = file(""),
      url           = "https://github.com/scala-js/scala-js-dom/tree/master",
      source        = "Index",
      autoResources = Seq("example-opt.js"),
    )
    .configure(commonSettings, preventPublication)
    .settings(
      scalaVersion := Ver.scala212,
      Compile / resources += (example / Compile / fullOptJS).value.data,
    )

}
