import sbt._
import sbt.Keys._
import org.scalajs.sbtplugin.ScalaJSJUnitPlugin
import Dependencies._

object Lib {

  val inCI = sys.props.get("CI").exists(_.contains("1"))

  def commonSettings: Project => Project = _
    .configure(sourceMapsToGithub)
    .settings(
      scalacOptions ++= Seq(
        "-feature",
      ),
      scalacOptions ++= (if (!inCI) Seq.empty else Seq(
        "-Xfatal-warnings",
      )),
      scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, 11)) => "-Ywarn-unused-import" :: Nil
        case Some((2, 12)) => "-deprecation" :: "-Ywarn-unused:imports,patvars,locals,implicits" :: Nil
        case Some((2, 13)) => "-deprecation" :: "-Wunused:imports,patvars,locals,implicits" :: Nil
        case _             => "-deprecation" :: Nil
      }),
      testOptions += Tests.Argument(TestFramework("com.novocode.junit.JUnitFramework"), "-v"),
    )

  def crossScala: Project => Project = _
    .settings(
      crossScalaVersions := Seq(
        Ver.scala211,
        Ver.scala212,
        Ver.scala213,
        Ver.scala3,
      ),
      scalaVersion := Ver.scala213,
    )

  val publicationSetttings: Project => Project =
    _.settings(
      pomExtra := (
        <developers>
          <developer>
            <id>japgolly</id>
            <name>David Barri</name>
            <url>https://github.com/japgolly</url>
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
          <developer>
            <id>lihaoyi</id>
            <name>Li Haoyi</name>
            <url>https://github.com/lihaoyi/</url>
          </developer>
        </developers>
      ),
      pomIncludeRepository := { _ => false },
    )

  val preventPublication: Project => Project =
    _.settings(publish / skip := true)

  private def sourceMapsToGithub: Project => Project =
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

  def hasNewCollections(version: String): Boolean =
    !version.startsWith("2.11.") && !version.startsWith("2.12.")

  /** Returns the appropriate subdirectory of `sourceDir` depending on whether
    * the `scalaVer` uses the new collections (introduced in 2.13) or not.
    */
  def collectionsEraDependentDirectory(scalaVer: String, sourceDir: File): File =
    if (hasNewCollections(scalaVer))
      sourceDir / "scala-new-collections"
    else
      sourceDir / "scala-old-collections"

  def moveTestLibsToCompile: Project => Project =
    _.settings(
      libraryDependencies ~= { _.map(m =>
        if (m.configurations.contains(Test.name))
          m.withConfigurations(Some(Compile.name))
        else
          m
      )},
    )
}
