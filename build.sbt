import scalatex.ScalatexReadme

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js DOM"

val scala210Version = "2.10.7"
val scala211Version = "2.11.12"
val scala212Version = "2.12.12"
val scala213Version = "2.13.4"
val scala3Version = "3.0.0-RC1-bin-20210113-8345078-NIGHTLY"

crossScalaVersions in ThisBuild := {
  if (scalaJSVersion.startsWith("1.4.")) Seq(scala3Version, scala211Version, scala212Version, scala213Version)
  else if (scalaJSVersion.startsWith("1.3.")) Seq(scala3Version, scala211Version, scala212Version, scala213Version)
  else if (scalaJSVersion.startsWith("1.2.")) Seq(scala3Version, scala211Version, scala212Version, scala213Version)
  else if (scalaJSVersion.startsWith("1.")) Seq(scala211Version, scala212Version, scala213Version)
  else Seq(scala210Version, scala211Version, scala212Version, scala213Version)
}
scalaVersion in ThisBuild := crossScalaVersions.value.head

val commonSettings = Seq(
  version := "1.2.0.3M3-SNAPSHOT",
  organization := "org.scala-js",
  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, _)) => Seq("-deprecation", "-feature", "-Xfatal-warnings")
    case Some((3, _)) => Seq()
    case _            => Seq()
  })
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
  !version.startsWith("2.10.") &&
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

scalacOptions ++= {
  if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault")
  else Nil
}

scmInfo := Some(ScmInfo(
    url("https://github.com/scala-js/scala-js-dom"),
    "scm:git:git@github.com:scala-js/scala-js-dom.git",
    Some("scm:git:git@github.com:scala-js/scala-js-dom.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
    <developers>
      <developer>
        <id>lihaoyi</id>
        <name>Li Haoyi</name>
        <url>https://github.com/lihaoyi/</url>
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
  scalaVersion := "2.12.12",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),
  (resources in Compile) += (fullOptJS in (example, Compile)).value.data
)

lazy val example = project.
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  dependsOn(root)
