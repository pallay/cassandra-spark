# A Sample Spark and Cassandra project

## Prerequisites

JDK and SBT installed. Project has been tested with `java version "1.8.0_45"` and `sbt launcher version 0.13.8`.
Spark and Cassandra installed and IPs available to connect to.

## To build

sbt assembly

## To run

- edit cassandra-example.conf. Set the `master` and `cassandra` connection to your particular environment.

- your-path-to-spark/bin/spark-submit --properties-file cassandra-spark-example.conf --class net.cakesolutions.CassandraSparkExample target/scala-2.10/cassandra-example-assembly-0.1-SNAPSHOT.jar
