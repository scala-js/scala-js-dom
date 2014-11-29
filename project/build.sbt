resolvers += Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/scala-js/scala-js-releases/"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0-M1")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
