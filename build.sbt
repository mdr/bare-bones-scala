name := "bare-bones-scala"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.6" % "test")

scalacOptions ++= Seq("-deprecation", "-feature")

// == Eclipse integration =====================================================================

EclipseKeys.withSource := true

EclipseKeys.eclipseOutput := Some("bin")

