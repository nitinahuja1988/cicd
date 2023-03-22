ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.12.0"
libraryDependencies +="org.scala-lang.modules"%%"scala-parallel-collections"%"1.0.4"


lazy val root = (project in file("."))
  .settings(
    name := "testScalademo"
  )

