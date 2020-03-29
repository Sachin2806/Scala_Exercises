package scala_practice

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Pgm2 {
  
  def main(args: Array[String]){
  
   val conf = new SparkConf().setAppName("WordCount") .setMaster("local")
   val sc = new SparkContext(conf)
   
   val x = sc.parallelize(List("spark flatmap example",  "sample example"), 2)
   val y = x.map(x => x.split(" ")) // split(" ") returns an array of words
   y.take(10).foreach(println)
      
   val z = x.flatMap(x => x.split(" "))
   z.take(10).foreach(println)
  }
}