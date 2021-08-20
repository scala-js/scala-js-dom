ThisBuild / semanticdbEnabled          := true
ThisBuild / semanticdbVersion          := "4.4.27"
ThisBuild / scalafixScalaBinaryVersion := CrossVersion.binaryScalaVersion(scalaVersion.value)

ThisBuild / scalacOptions ++= {
  if (scalaVersion.value startsWith "2")
    "-Yrangepos" :: Nil
  else
    Nil
}
