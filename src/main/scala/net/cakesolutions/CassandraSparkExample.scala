package net.cakesolutions

import org.apache.spark._
import com.datastax.spark.connector._
import org.apache.spark.rdd.RDD

import scala.util.Random

object CassandraSparkExample extends App {

  def randomHellos(sc: SparkContext, hellos: Int): RDD[(String, String, String)] = {
    sc.parallelize(0 until hellos).map { s =>

      val language = s"language_${Math.abs(Random.nextInt())}"

      val greeting = s"greeting_${Math.abs(Random.nextInt())}"

      val name = s"name_${Math.abs(Random.nextInt())}"

      (language, greeting, name)
    }
  }


  val conf = new SparkConf().setAppName("cassandra-spark-example")

  val sc = new SparkContext(conf)

  val hellos = 5
  randomHellos(sc, hellos).saveToCassandra("test", "hellos", SomeColumns("language", "name", "greeting"))

  val hello = sc.cassandraTable("test", "hello")

  sc.stop()

  println(hello.first())

}
