resolvers +=  Resolver.url("scala-js-releases", url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(  Resolver.ivyStylePatterns) //for scalatools

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.4.3")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
