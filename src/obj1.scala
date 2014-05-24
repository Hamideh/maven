/**
 * Created by hamideh on 5/21/14.
 */
/**
 * Created by hamideh on 5/7/14.
 */


import org.apache.spark.SparkContext
object obj1 {

  def main(args: Array[String]) = {
    println("Hello World!")
    val sc = new SparkContext("local", "obj1.scala", System.getenv("SPARK_HOME"), SparkContext.jarOfClass(this.getClass))
    val data = List(1,2,3,4,5)
    val num = sc.parallelize(data)
    val squares = num.map(x => x * x)
    val sum=squares.reduce(_+_)
    num.foreach(println)
    squares.foreach(println)
    squares.foreach(println)
    println(sum)
  }



}
