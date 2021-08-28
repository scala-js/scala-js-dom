import _root_.scalafix.sbt.BuildInfo.scalafixVersion
import scalatex.ScalatexReadme

ThisBuild / shellPrompt := ((s: State) => Project.extract(s).currentRef.project + "> ")

lazy val scalafixRules = project
  .in(file("scalafix"))
  .settings(
    libraryDependencies += "ch.epfl.scala" %% "scalafix-core" % scalafixVersion,
  )

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalafixPlugin)
  .dependsOn(scalafixRules % ScalafixConfig)

name := "Scala.js DOM"

ThisBuild / crossScalaVersions := Seq("2.12.10", "2.11.12", "2.13.1", "3.0.1")
ThisBuild / scalaVersion := crossScalaVersions.value.head

val commonSettings = Seq(
  organization := "org.scala-js",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")
)

val noPublishSettings = Seq(
  publish / skip := true
)

normalizedName := "scalajs-dom"

commonSettings

homepage := Some(url("http://scala-js.org/"))

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))

scalacOptions ++= {
  if (isSnapshot.value)
    Seq.empty
  else {
    val a = baseDirectory.value.toURI
    val g = "https://raw.githubusercontent.com/scala-js/scala-js-dom"
    Seq(s"-P:scalajs:mapSourceURI:$a->$g/v${version.value}/")
  }
}

def hasNewCollections(version: String): Boolean = {
  !version.startsWith("2.11.") &&
  !version.startsWith("2.12.")
}

/** Returns the appropriate subdirectory of `sourceDir` depending on whether
 *  the `scalaV` uses the new collections (introduced in 2.13) or not.
 */
def collectionsEraDependentDirectory(scalaV: String, sourceDir: File): File =
  if (hasNewCollections(scalaV)) sourceDir / "scala-new-collections"
  else sourceDir / "scala-old-collections"

inConfig(Compile)(Def.settings(
  unmanagedSourceDirectories +=
    collectionsEraDependentDirectory(scalaVersion.value, sourceDirectory.value)
))

versionScheme := Some("early-semver")

pomExtra := (
    <developers>
      <developer>
        <id>japgolly</id>
        <name>David Barri</name>
        <url>https://github.com/japgolly</url>
      </developer>
      <developer>
        <id>lihaoyi</id>
        <name>Li Haoyi</name>
        <url>https://github.com/lihaoyi/</url>
      </developer>
      <developer>
        <id>armanbilge</id>
        <name>Arman Bilge</name>
        <url>https://github.com/armanbilge</url>
      </developer>
      <developer>
        <id>sjrd</id>
        <name>Sébastien Doeraene</name>
        <url>https://github.com/sjrd/</url>
      </developer>
      <developer>
        <id>gzm0</id>
        <name>Tobias Schlatter</name>
        <url>https://github.com/gzm0/</url>
      </developer>
    </developers>
)

pomIncludeRepository := { _ => false }

lazy val readme = ScalatexReadme(
  projectId = "readme",
  wd = file(""),
  url = "https://github.com/scala-js/scala-js-dom/tree/master",
  source = "Index",
  autoResources = Seq("example-opt.js")
).settings(
  scalaVersion := "2.12.10",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),
  (Compile / resources) += (example / Compile / fullOptJS).value.data
).settings(noPublishSettings: _*)

lazy val example = project.
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(noPublishSettings: _*).
  dependsOn(root)

addCommandAlias("prePR", "+prePR_nonCross")

val prePR_nonCross = taskKey[Unit]("Performs all necessary work required before submitting a PR, for a single version of Scala.")

ThisBuild / prePR_nonCross := Def.sequential(
  root / clean,
  root / Compile / scalafmt,
  root / Compile / compile,
  example / Compile / compile,
).value
