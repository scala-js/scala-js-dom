import Build._

addCommandAlias("prePR", "+prePR_nonCross")

val prePR_nonCross = taskKey[Unit]("Performs all necessary work required before submitting a PR, for a single version of Scala.")

ThisBuild / prePR_nonCross := Def.sequential(
  root / clean,
  dom / Compile / scalafmt,
  Def.taskDyn {
    if (scalaVersion.value.startsWith("2."))
      (dom / Compile / scalafix).toTask("")
    else
      Def.task[Unit]((dom / Compile / compile).value)
  },
  root / Compile / compile,
).value
