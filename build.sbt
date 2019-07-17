organization := "com.github.fdietze"
name := "scala-js-fontawesome"
version := "master-SNAPSHOT"

scalaVersion in ThisBuild := "2.12.8"
crossScalaVersions := Seq("2.11.12", "2.12.8")

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= (
  "org.scala-js" %%% "scalajs-dom" % "0.9.7" ::
  "io.monix" %%% "minitest" % "2.1.1" % "test" ::
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
requiresDOM := true // still required by bundler: https://github.com/scalacenter/scalajs-bundler/issues/181

scalacOptions ++=
  "-encoding" :: "UTF-8" ::
  "-unchecked" ::
  "-deprecation" ::
  "-explaintypes" ::
  "-feature" ::
  "-language:_" ::
  "-Xfuture" ::
  "-Xlint" ::
  "-Ypartial-unification" ::
  "-Yno-adapted-args" ::
  "-Ywarn-infer-any" ::
  "-Ywarn-value-discard" ::
  "-Ywarn-nullary-override" ::
  "-Ywarn-nullary-unit" ::
  "-P:scalajs:sjsDefinedByDefault" ::
  Nil


scalacOptions ++= git.gitHeadCommit.value.map { headCommit =>
  val local = baseDirectory.value.toURI
  val remote = s"https://raw.githubusercontent.com/fdietze/scala-js-fontawesome/${headCommit}/"
  s"-P:scalajs:mapSourceURI:$local->$remote"
}
