package scala_practice

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object revision1 {
  
  def main(args: Array[String]){
    
    val conf = new SparkConf()
                  .setAppName("ProgramJson2")
                  .setMaster("local")
    
    val spark = SparkSession
               .builder()
               .appName("ProgramJson2")
               .config(conf)
               .config("spark.master", "local")
               .config("spark.sql.warehouse.dir", "file:///C:/Users/CSC/git/SparkSQL/Scala_DataFrames/spark-warehouse")
               .getOrCreate()
               
    val sc = spark.sparkContext
    import spark.implicits._
    
    
    val textFile =  sc.textFile("C:/Users/CSC/workspace/Scala_Execercises/Files/Input/sample.txt")
    println(textFile.first())
    textFile.count()
    
    val linesWithSpark = textFile.filter(x => x.contains("Spark"))
    println(textFile.filter(x => x.contains("Spark")).count())
    
    //Caching
    println(linesWithSpark.cache())
    println(linesWithSpark.count())
  }
  
}