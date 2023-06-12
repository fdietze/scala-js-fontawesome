organization := "com.github.fdietze"
name         := "scala-js-fontawesome"
version      := "master-SNAPSHOT"

crossScalaVersions        := Seq("2.12.18", "2.13.10", "3.1.3")
scalaVersion in ThisBuild := crossScalaVersions.value.last

scalacOptions --= Seq("-Xfatal-warnings") // overwrite sbt-tpolecat setting
enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= (
  "org.scala-js" %%% "scalajs-dom" % "2.4.0" ::
    "io.monix"   %%% "minitest"    % "2.9.6" % "test" ::
    Nil
)

testFrameworks += new TestFramework("minitest.runner.Framework")

val fontawesomeVersion = "5.6.3"
npmDependencies in Compile ++= (
  // https://fontawesome.com/how-to-use/with-the-api/setup/library
  "@fortawesome/fontawesome-svg-core"     -> "1.2.12" ::
    "@fortawesome/free-solid-svg-icons"   -> fontawesomeVersion ::
    "@fortawesome/free-regular-svg-icons" -> fontawesomeVersion ::
    "@fortawesome/free-brands-svg-icons"  -> fontawesomeVersion ::
    Nil
)

useYarn                 := true
requireJsDomEnv in Test := true
