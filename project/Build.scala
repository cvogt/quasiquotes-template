import sbt._
import Keys._

object ProjectBuild extends Build {

  lazy val proj = Project(id = "project",
                          base = file(".")).dependsOn(quasiquotes)

  lazy val quasiquotes = RootProject(uri("git://github.com/densh/quasiquotes.git"))

  override lazy val settings = super.settings ++ Seq(
    scalaVersion := "2.10.0-RC1",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % "2.10.0-RC1"
    )
  )
}
