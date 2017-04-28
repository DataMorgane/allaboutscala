name := "allaboutscala"

version := "1.0"

scalaVersion := "2.12.2"

val scalaV = "2.12.2"

libraryDependencies ++= Seq (
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.scala-lang"    %   "scala-compiler"      % scalaV,
  "org.scala-lang"    %   "scala-library"       % scalaV,
  "org.scala-lang"    %   "scala-reflect"       % scalaV
)
        