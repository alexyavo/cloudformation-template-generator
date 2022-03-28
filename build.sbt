import sbt.Keys._

name := "cloud-formation-template-generator"

version := "3.11"

organization := "io.github.alexyavo"

startYear := Some(2014)

// scala versions and options

scalaVersion := "2.13.8"
crossScalaVersions := Seq("2.13.8")
releaseCrossBuild := true

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

// These options will be used for *all* versions.

def crossVersionScalaOptions(scalaVersion: String) = {
   CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, 11)) => Seq(
      "-Yclosure-elim",
      "-Yinline"
    )
    case _ => Nil
  }
}
scalacOptions ++= Seq(
    "-unchecked",
    "-deprecation",
    "-Xlint",
    "-Xverify",
    "-encoding", "UTF-8",
    "-feature",
    "-language:postfixOps"
  ) ++ crossVersionScalaOptions(scalaVersion.value)

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

// dependencies

libraryDependencies ++= Seq (
  // -- testing --
   "org.scalatest"  %% "scalatest"     % "3.0.8"  % Test
  // -- json --
  ,"io.spray"       %%  "spray-json"   % "1.3.6"
  // -- reflection --
  ,"org.scala-lang" %  "scala-reflect" % scalaVersion.value
).map(_.force())

resolvers ++= Seq(
  "spray repo" at "https://repo.spray.io",
  Resolver.sonatypeRepo("public")
)

// for sonatype


import ReleaseTransformations._

releaseCrossBuild := true // true if you cross-build the project for multiple Scala versions
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  // For non cross-build projects, use releaseStepCommand("publishSigned")
  releaseStepCommandAndRemaining("+publishSigned"),
  releaseStepCommand("sonatypeBundleRelease"),
  setNextVersion,
  commitNextVersion,
  pushChanges
)


// for ghpages

enablePlugins(GhpagesPlugin, SiteScaladocPlugin)

git.remoteRepo := "git@github.com:alexyavo/cloudformation-template-generator.git"


// --------------------------


sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
sonatypeCredentialHost := "s01.oss.sonatype.org"

// Your profile name of the sonatype account. The default is the same with the organization value
publishMavenStyle := true

publishArtifact in Test := false

sonatypeProfileName := "io.github.alexyavo"

pomIncludeRepository := { _ => false }

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/alexyavo/cloudformation-template-generator"),
    "scm:git@github.alexyavo/cloudformation-template-generator.git"
  )
)

import xerial.sbt.Sonatype._

sonatypeProjectHosting := Some(GitHubHosting(user="alexyavo", repository="cloudformation-template-generator", email="alxndr.yav@gmail.com"))

licenses := Seq("BSD3" -> url("https://opensource.org/licenses/BSD-3-Clause"))

developers := List(
  Developer(id = "alexyavo", name = "Alex Y", url = url("https://github.com/alexyavo"), email="alxndr.yav@gmail.com")
)

publishTo := sonatypePublishToBundle.value
