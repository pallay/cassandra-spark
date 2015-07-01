package net.cakesolutions

import org.apache.spark._
import org.scalatest.FunSuite

class CassandraSparkExampleTest extends FunSuite {

  test("randomHello") {
    val sc: SparkContext = new SparkContext("local", "test")
    val stores = CassandraSparkExample.randomHellos(sc, hellos = 5)

    assert(stores.count === 5)
  }

}
