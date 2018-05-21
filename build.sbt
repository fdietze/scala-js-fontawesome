name := "scala-js-fontawesome"
version := "master-SNAPSHOT"

scalaVersion in ThisBuild := "2.12.6"
crossScalaVersions := Seq("2.11.12", "2.12.6")

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= (
  "org.scala-js" %%% "scalajs-dom" % "0.9.5" ::
  Nil
)

val fontawesomeVersion = "5.0.13"
npmDependencies in Compile ++= (
  // https://fontawesome.com/how-to-use/js-component-packages
  "@fortawesome/fontawesome" -> "1.1.8" ::
  "@fortawesome/fontawesome-free-solid" -> fontawesomeVersion ::
  "@fortawesome/fontawesome-free-regular" -> fontawesomeVersion ::
  "@fortawesome/fontawesome-free-brands" -> fontawesomeVersion ::
  Nil
)

useYarn := true

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
