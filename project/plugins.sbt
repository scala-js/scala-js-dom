libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0"
libraryDependencies += "org.scala-js" %% "scalajs-env-selenium"     % "1.1.1"

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix"        % "0.10.4")
addSbtPlugin("com.eed3si9n"  % "sbt-buildinfo"       % "0.12.0")
addSbtPlugin("com.github.sbt"  % "sbt-ci-release"      % "1.7.0")
addSbtPlugin("com.lihaoyi"   % "scalatex-sbt-plugin" % "0.3.11")
addSbtPlugin("org.scala-js"  % "sbt-scalajs"         % "1.7.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"        % "2.5.2")
