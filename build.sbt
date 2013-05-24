name := "scala-template"

organization := "com.example"

version := "1.0.1-SNAPSHOT"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "ch.qos.logback"  %   "logback-classic"   % "1.0.13",
  "org.scalatest"   %%  "scalatest"         % "1.9.1" % "test"
)