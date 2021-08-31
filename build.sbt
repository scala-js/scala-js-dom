ThisBuild / homepage      := Some(url("https://scala-js.org"))
ThisBuild / licenses      += ("MIT", url("https://opensource.org/licenses/mit-license.php"))
ThisBuild / organization  := "org.scala-js"
ThisBuild / shellPrompt   := ((s: State) => Project.extract(s).currentRef.project + "> ")
ThisBuild / versionScheme := Some("early-semver")

val root          = Build.root
val scalafixRules = Build.scalafixRules
val dom           = Build.dom
val example       = Build.example
val readme        = Build.readme
