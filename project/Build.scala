import sbt._
import Keys._

object QuasiQuotesBuild extends Build {

  // sbt chooses default project according to lexographical
  // order, so prefix before _tests make it a default

  lazy val proj = Project(id = "project",
                          base = file(".")).dependsOn(quasiquotes)

  lazy val quasiquotes = RootProject(uri("git://github.com/densh/quasiquotes.git"))

  override lazy val settings = super.settings ++ Seq(
    scalaVersion := "2.10.0-RC1",
    resolvers += Resolver.sonatypeRepo("snapshots"),
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % "2.10.0-RC1"
    )
  )
}
