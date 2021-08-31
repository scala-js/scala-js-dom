import Build._

addCommandAlias("prePR", "+prePR_nonCross")

val prePR_nonCross = taskKey[Unit]("Performs all necessary work required before submitting a PR, for a single version of Scala.")

// Unfortunately we can't just call `root/Test/compile` because it doesn't take aggregation into account :(
ThisBuild / prePR_nonCross := Def.sequential(

  Def.task {
    (root           / clean).value
    (scalafixRules  / clean).value
    (dom            / clean).value
    (testsShared    / clean).value
    (testsWebworker / clean).value
    (testsChrome    / clean).value
    (testsFirefox   / clean).value
    (testsNodeJsdom / clean).value
    (example        / clean).value
  },

  dom / Compile / scalafmt,
  Def.taskDyn {
    if (scalaVersion.value.startsWith("2."))
      (dom / Compile / scalafix).toTask("")
    else
      Def.task[Unit]((dom / Compile / compile).value)
  },

  Def.task {
    (testsShared    / Test / compile).value
    (testsWebworker / Test / compile).value
    (testsChrome    / Test / compile).value
    (testsFirefox   / Test / compile).value
    (testsNodeJsdom / Test / compile).value
    (example        / Test / compile).value
  },

  Def.taskDyn {
    if (scalaVersion.value.startsWith("2.12."))
      Def.task[Unit]((readme / Compile / compile).value)
    else
      Def.task(())
  },

).value
