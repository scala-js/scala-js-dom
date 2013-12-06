publishTo := {
  val isSnapshot = version.value.endsWith("-SNAPSHOT")
  val snapshotsOrReleases = if (isSnapshot) "snapshots" else "releases"
  val resolver = Resolver.sftp(
      s"scala-js-$snapshotsOrReleases-publish",
      "repo.scala-js.org",
      s"/home/scalajsrepo/www/repo/$snapshotsOrReleases")(Resolver.ivyStylePatterns)
  Seq("PUBLISH_USER", "PUBLISH_PASS").map(scala.util.Properties.envOrNone) match {
    case Seq(Some(user), Some(pass)) =>
      Some(resolver as (user, pass))
    case _ =>
      None
  }
}

publishMavenStyle := false
