package scala_practice

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Pgm1 {
  
  def main(args: Array[String]){
  
   val conf = new SparkConf().setAppName("WordCount") .setMaster("local")
   val sc = new SparkContext(conf)
   
   val data = sc.textFile("C:/Users/CSC/git/Scala_Exercises/Scala_Execercises/Files/Input/sc.txt")
   data.foreach(println)
   
   val mapRDD = data.map(line => line.split(" "))
   val flatMapRDD = data.flatMap(line => line.split(" "))
   
   //mapRDD.take(20).foreach(println)
   println("Demo of map : " + mapRDD.collect())
   flatMapRDD.foreach(println)
  }
}