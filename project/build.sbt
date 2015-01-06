resolvers += Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/scala-js/scala-js-releases/"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0-M1")

addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.1.0")
