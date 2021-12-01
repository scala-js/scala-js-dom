How to Perform a Release
========================

1. The first step is to create a tag, push it, and let GitHub Actions do the release.

    ```sh
    # For v1.x.y
    ver=1.2.0 # change this to new version
    git checkout series/1.x
    git checkout -b topic/v$ver
    echo "ThisBuild / version := \"$ver\" // Workaround for #504" > version.sbt
    git add version.sbt
    git commit -m "Setting version to v$ver"
    git tag -s v$ver
    git push --tags

    # For v2.x onwards
    ver=2.0.0 # change this to new version
    git checkout main
    git tag -s v$ver
    git push --tags
    ```


2. Wait for the release to complete.
   https://github.com/scala-js/scala-js-dom/actions/workflows/release.yml

3. Go to GitHub releases (https://github.com/scala-js/scala-js-dom/releases),
   edit the auto-generated draft release,
   revise,
   and click Publish.

4. Advertise the new release in the following places:

    * Reddit
      Example: https://old.reddit.com/r/scala/comments/pc9k5y/scalajsdom_120_released_this_is_the_first_release

    * Scala.js Discord
      Example: https://discord.com/channels/632150470000902164/635668814956068864/880575154516819978

    * Scala.js gitter
      Example: https://gitter.im/scala-js/scala-js?at=612811ec1179346966e36def

    * scala-users
      Example: https://users.scala-lang.org/t/scala-js-dom-v1-2-0-released/7745

    * Twitter
      Example: https://twitter.com/japgolly/status/1431011200771379200?s=20
