name := "cassandra-spark"

version := "0.1-SNAPSHOT"

organization := "net.cakesolutions"

description := "Example cassandra and spark application"

scalacOptions ++= Seq("-feature", "-deprecation")

sbtVersion in Global := "0.13.8"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "com.datastax.spark" %% "spark-cassandra-connector" % "1.4.0-M1",
  "org.apache.spark"   %% "spark-catalyst"            % "1.4.0",
  "org.scalatest"      %% "scalatest"                 % "2.2.1"     % "test"
)

resolvers += Opts.resolver.sonatypeReleases

parallelExecution in Test := false