organization := "com.github.fdietze"
name := "scala-js-fontawesome"
version := "master-SNAPSHOT"

scalaVersion in ThisBuild := crossScalaVersions.value.last
crossScalaVersions := Seq("2.12.14", "2.13.3")

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= (
  "org.scala-js" %%% "scalajs-dom" % "1.1.0" ::
  "io.monix" %%% "minitest" % "2.9.1" % "test" ::
  Nil
)

testFrameworks += new TestFramework("minitest.runner.Framework")

val fontawesomeVersion = "5.6.3"
npmDependencies in Compile ++= (
  // https://fontawesome.com/how-to-use/with-the-api/setup/library
  "@fortawesome/fontawesome-svg-core" -> "1.2.12" ::
  "@fortawesome/free-solid-svg-icons" -> fontawesomeVersion ::
  "@fortawesome/free-regular-svg-icons" -> fontawesomeVersion ::
  "@fortawesome/free-brands-svg-icons" -> fontawesomeVersion ::
  Nil
)

useYarn := true
requireJsDomEnv in Test := true

scalacOptions ++=
  "-encoding" :: "UTF-8" ::
  "-unchecked" ::
  "-deprecation" ::
  "-explaintypes" ::
  "-feature" ::
  "-language:_" ::
  "-Xfuture" ::
  "-Xlint" ::
  Nil


scalacOptions ++= git.gitHeadCommit.value.map { headCommit =>
  val local = baseDirectory.value.toURI
  val remote = s"https://raw.githubusercontent.com/fdietze/scala-js-fontawesome/${headCommit}/"
  s"-P:scalajs:mapSourceURI:$local->$remote"
}
