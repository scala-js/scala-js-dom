import sbt._
import sbt.Keys._
import java.util.concurrent.TimeUnit
import org.openqa.selenium.{Capabilities, WebDriver}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.firefox.{FirefoxOptions, FirefoxProfile}
import org.openqa.selenium.remote.server.{DriverFactory, DriverProvider}
import org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv
import org.scalajs.jsenv.selenium.SeleniumJSEnv
import org.scalajs.sbtplugin.ScalaJSJUnitPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbtbuildinfo.BuildInfoPlugin
import sbtbuildinfo.BuildInfoPlugin.autoImport._
import scalafix.sbt.ScalafixPlugin
import scalafix.sbt.ScalafixPlugin.autoImport._
import scalatex.ScalatexReadme
import Dependencies._
import Lib._
import mdoc.MdocPlugin
import sbtdynver.DynVerPlugin.autoImport.previousStableVersion
import mdoc.MdocPlugin.autoImport._

object Build {

  // TODO: Change root from {.root => .} and dom from {. => dom}

  lazy val root = project
    .in(file("."))
    .configure(commonSettings, crossScala, preventPublication)
    .settings(
      name := "Scala.js DOM",
    )
    .aggregate(
      scalafixRules,
      dom,
      testsShared,
      testsWebworker,
      testsChrome,
      testsFirefox,
      testsNodeJsdom,
      example,
    )

  lazy val dom = project
    .dependsOn(scalafixRules % ScalafixConfig)
    .enablePlugins(ScalaJSPlugin, ScalafixPlugin)
    .configure(commonSettings, crossScala, publicationSetttings)
    .settings(
      moduleName := "scalajs-dom",
      Compile / unmanagedSourceDirectories +=
        collectionsEraDependentDirectory(scalaVersion.value, (Compile / sourceDirectory).value),
    )

  lazy val scalafixRules = project
    .in(file("scalafix"))
    .configure(commonSettings, crossScala, preventPublication)
    .settings(
      libraryDependencies += Dep.scalafixCore.value,
    )

  lazy val testsShared = project
    .in(file("tests-shared"))
    .dependsOn(dom)
    .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin)
    .configure(commonSettings, crossScala, preventPublication, moveTestLibsToCompile)

  lazy val testsWebworker = project
    .in(file("tests-webworker"))
    .dependsOn(testsShared)
    .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin, BuildInfoPlugin)
    .configure(commonSettings, crossScala, preventPublication, moveTestLibsToCompile)
    .settings(
      buildInfoKeys := Seq[BuildInfoKey](
        "wwJsPath" -> (Compile / fastOptJS / artifactPath).value.absolutePath,
      ),
      buildInfoPackage := "org.scalajs.dom.tests.webworker",
      scalaJSUseMainModuleInitializer := true,
    )

  def testsWebworkers: Project => Project = _
    .dependsOn(testsWebworker)
    .settings(
      Test / test := {
        val _ = (testsWebworker / Compile / fastOptJS).value
        (Test / test).value
      },
    )

  lazy val testsChrome = project
    .in(file("tests-chrome"))
    .dependsOn(testsShared % Test)
    .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin)
    .configure(commonSettings, crossScala, preventPublication, testsWebworkers)
    .settings(
      Test / jsEnv := {
        System.setProperty("webdriver.chrome.silentOutput", "true")
        val o = new ChromeOptions()
        o.setHeadless(true)
        o.addArguments("--allow-file-access-from-files")
        val df = new DriverFactory {
          private[this] val default = SeleniumJSEnv.Config().driverFactory
          override def newInstance(c: Capabilities): WebDriver = {
            val d = default.newInstance(c).asInstanceOf[ChromeDriver]
            d.manage.timeouts.pageLoadTimeout(if (inCI) 10 else 1, TimeUnit.MINUTES)
            d.manage.timeouts.setScriptTimeout(if (inCI) 10 else 1, TimeUnit.MINUTES)
            d
          }
          override def registerDriverProvider(p: DriverProvider): Unit =
            default.registerDriverProvider(p)
        }
        new SeleniumJSEnv(o, SeleniumJSEnv.Config().withDriverFactory(df))
      },
    )

  lazy val testsFirefox = project
    .in(file("tests-firefox"))
    .dependsOn(testsShared % Test)
    .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin)
    .configure(commonSettings, crossScala, preventPublication, testsWebworkers)
    .settings(
      Test / jsEnv := {
        val p = new FirefoxProfile()
        p.setPreference("privacy.file_unique_origin", false)
        val o = new FirefoxOptions()
        o.setProfile(p)
        o.setHeadless(true)
        new SeleniumJSEnv(o)
      },
    )

  lazy val testsNodeJsdom = project
    .in(file("tests-node-jsdom"))
    .dependsOn(testsShared % Test)
    .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin)
    .configure(commonSettings, crossScala, preventPublication)
    .settings(
      Test / jsEnv := new JSDOMNodeJSEnv,
    )

  lazy val example = project
    .dependsOn(dom)
    .enablePlugins(ScalaJSPlugin)
    .configure(commonSettings, crossScala, preventPublication)

  lazy val jsdocs = project
    .in(file("mdocs-js"))
    .dependsOn(dom)
    .enablePlugins(ScalaJSPlugin)
    .configure(commonSettings, crossScala, preventPublication)

  lazy val docs = project
    .in(file("mdocs"))
    .settings(
      mdocJS := Some(jsdocs),
      mdocVariables := Map(
        "VERSION" -> previousStableVersion.value.getOrElse("2.3.0")
      )
    )
    .enablePlugins(MdocPlugin)
    .configure(commonSettings, crossScala, preventPublication)
}
