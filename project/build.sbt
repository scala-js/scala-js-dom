resolvers += Resolver.url("scala-js-snapshots",
    url("http://repo.scala-js.org/repo/snapshots/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.1-SNAPSHOT")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")
