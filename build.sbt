import scalatex.ScalatexReadme

def sourceMapsToGithub: Project => Project =
  p => p.settings(
    scalacOptions ++= {
      val isDotty = scalaVersion.value startsWith "3"
      val ver     = version.value
      if (isSnapshot.value)
        Nil
      else {
        val a = p.base.toURI.toString.replaceFirst("[^/]+/?$", "")
        val g = s"https://raw.githubusercontent.com/scala-js/scala-js-dom"
        val flag = if (isDotty) "-scalajs-mapSourceURI" else "-P:scalajs:mapSourceURI"
        s"$flag:$a->$g/v$ver/" :: Nil
      }
    }
  )

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .configure(sourceMapsToGithub)

name := "Scala.js DOM"

ThisBuild / crossScalaVersions := Seq("2.12.12", "2.11.12", "2.13.4", "3.0.1")
ThisBuild / scalaVersion := crossScalaVersions.value.head

val commonSettings = Seq(
  version := "2.0.0-SNAPSHOT",
  organization := "org.scala-js",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")
)

normalizedName := "scalajs-dom"

commonSettings

homepage := Some(url("http://scala-js.org/"))

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))

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
)

lazy val example = project.
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  dependsOn(root)
