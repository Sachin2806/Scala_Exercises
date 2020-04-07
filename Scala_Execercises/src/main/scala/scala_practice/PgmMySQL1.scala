package scala_practice

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object PgmMySQL1 {
  
  def main(args: Array[String]){
  
  val spark = SparkSession
              .builder()
              .appName("PgmMySQL1")
              .config("spark.master", "local")
              .config("spark.sql.warehouse.dir", "file:///C:/Users/CSC/git/SparkSQL/Scala_DataFrames/spark-warehouse")
              .getOrCreate()
  
  val sc = spark.sparkContext
  import spark.implicits._
  
  val connection = "jdbc:mysql://127.0.0.1:3306/classicmodels"
  
  val mysql_props = new java.util.Properties
  mysql_props.setProperty("user","root")
  mysql_props.setProperty("password","root")
   
  val employee = spark.read.jdbc(connection,"employee",mysql_props)
  employee.show
  
  val ordersDF = spark.read.jdbc(connection,"orders",mysql_props)
  ordersDF.show
  
  
  }
}