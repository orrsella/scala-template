name := "scala-template"

organization := "com.example"

version := "1.0.1-SNAPSHOT"

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfuture", "-Xlint")

incOptions := incOptions.value.withNameHashing(true)

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.specs2" %% "specs2" % "2.3.13" % "test")
