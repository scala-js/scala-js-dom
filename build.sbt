ThisBuild / homepage      := Some(url("https://scala-js.org"))
ThisBuild / licenses      += ("MIT", url("https://opensource.org/licenses/mit-license.php"))
ThisBuild / organization  := "org.scala-js"
ThisBuild / shellPrompt   := ((s: State) => Project.extract(s).currentRef.project + "> ")
ThisBuild / versionScheme := Some("early-semver")

val root           = Build.root
val scalafixRules  = Build.scalafixRules
val dom            = Build.dom
val testsShared    = Build.testsShared
val testsWebworker = Build.testsWebworker
val testsChrome    = Build.testsChrome
val testsFirefox   = Build.testsFirefox
val testsNodeJsdom = Build.testsNodeJsdom
val example        = Build.example
val readme         = Build.readme

// TODO: Remove after dom project get it's own directory
Global / onLoad ~= (_.andThen("project root" :: _))
