lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js DOM"

normalizedName := "scalajs-dom"

version := "0.7.1-SNAPSHOT"

organization := "org.scala-js"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions ++= Seq("-deprecation", "-feature")

homepage := Some(url("http://scala-js.org/"))

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))

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

lazy val readme = project
  .settings(scalatex.SbtPlugin.projectSettings:_*)
  .settings(
    scalaVersion := "2.11.4",
    libraryDependencies += "com.lihaoyi" %% "scalatex-site" % "0.1.0",
    (resources in Compile) += (fullOptJS in (example, Compile)).value.data
  )

lazy val example = project
  .dependsOn(root)
  .enablePlugins(ScalaJSPlugin)
  .settings(scalaVersion := "2.11.2")
