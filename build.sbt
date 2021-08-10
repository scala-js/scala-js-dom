import scalatex.ScalatexReadme

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js DOM"

lazy val scala210 = "2.10.7"
lazy val scala211 = "2.11.12"
lazy val scala212 = "2.12.10"
lazy val scala213 = "2.13.1"
lazy val scalaJS06 = "0.6.28"
lazy val scalaJS1 = "1.0.0"

ThisBuild / crossScalaVersions := {
  if (scalaJSVersion.startsWith("1.")) Seq(scala212, scala211, scala213)
  else Seq(scala212, scala211, scala210, scala213)
}
ThisBuild / scalaVersion := crossScalaVersions.value.head

ThisBuild / githubWorkflowBuildMatrixAdditions += "scalajs" -> List(scalaJS06, scalaJS1)
ThisBuild / githubWorkflowScalaVersions := List(scala210, scala211, scala212, scala213)
ThisBuild / githubWorkflowBuildMatrixExclusions += MatrixExclude(Map("scala" -> scala210, "scalajs" -> scalaJS1))
ThisBuild / githubWorkflowGeneratedCI ~= { _.map(job => job.copy(env = job.env + ("SCALAJS_VERSION" -> "${{ matrix.scalajs }}"))) }
ThisBuild / githubWorkflowBuildMatrixFailFast := Some(false)

ThisBuild / githubWorkflowBuild := Seq(
  WorkflowStep.Sbt(List("package"), name = Some("Build")),
  WorkflowStep.Sbt(List("doc"), name = Some("Test generate documentation")),
  WorkflowStep.Sbt(List("example/compile"), name = Some("Build examples")),
  WorkflowStep.Sbt(List("scalafmtCheck"), name = Some("scalafmt")),
  WorkflowStep.Sbt(List("readme/run"), name = Some("Readme generation"), cond = Some(s"matrix.scalajs == '${scalaJS1}' && matrix.scala == '${scala212}'")),
)

ThisBuild / githubWorkflowGeneratedUploadSteps ~= {
  _.init :+ WorkflowStep.Use(
    name = Some("Upload target directories"),
    ref = UseRef.Public("actions", "upload-artifact", "v2"),
    params = Map("path" -> "targets.tar", "name" -> "target-${{ matrix.os }}-${{ matrix.scala }}-${{ matrix.java }}-${{ matrix.scalajs }}")
  )
}

ThisBuild / githubWorkflowGeneratedCI ~= { jobs =>
  var publish = jobs(1)
  publish = publish.copy(matrixAdds = Map("scalajs" -> List(scalaJS06, scalaJS1)))
  publish = publish.copy(steps = publish.steps.map {
    case step: WorkflowStep.Use if step.name.exists(_.startsWith("Download target directories")) =>
      step.copy(params = step.params.mapValues(_ + "-${{ matrix.scalajs }}"))
        .copy(cond = if (step.name.exists(_.contains(scala210))) Some(s"matrix.scalajs == '${scalaJS06}'") else None)
    case step: WorkflowStep.Run if step.name.exists(_.contains(scala210)) =>
      step.copy(cond = Some(s"matrix.scalajs == '${scalaJS06}'"))
    case step => step
  })
  jobs.updated(1, publish)
}

ThisBuild / githubWorkflowTargetTags ++= Seq("v*")
ThisBuild / githubWorkflowPublishTargetBranches := Seq(RefPredicate.StartsWith(Ref.Tag("v")))
ThisBuild / githubWorkflowPublish := Seq(WorkflowStep.Sbt(List("ci-release")))
ThisBuild / githubWorkflowPublish := Seq(
  WorkflowStep.Sbt(
    List("ci-release"),
    env = Map(
      "PGP_PASSPHRASE" -> "${{ secrets.PGP_PASSPHRASE }}",
      "PGP_SECRET" -> "${{ secrets.PGP_SECRET }}",
      "SONATYPE_PASSWORD" -> "${{ secrets.SONATYPE_PASSWORD }}",
      "SONATYPE_USERNAME" -> "${{ secrets.SONATYPE_USERNAME }}"
    )
  )
)

val commonSettings = Seq(
  organization := "org.scala-js",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")
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
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),
  (Compile / resources) += (example / Compile / fullOptJS).value.data
)

lazy val example = project.
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  dependsOn(root)
