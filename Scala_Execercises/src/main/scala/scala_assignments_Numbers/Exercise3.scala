package scala_assignments_Numbers

import scala.io.StdIn

object Exercise3 {
  
  def main(args: Array[String]){
   
    //Problem 1: Create a Scala program that defines a sequence of numbers from 100 to 110. 
    //The sequence should include the 100 starting number literal, and ends with the 110 number literal.    
    val numberRange = 100 to 110    
    println(" Number range from 100 to 110 inclusive : ")
    numberRange.foreach(number => print(s"$number "))
    
    
    
  }
}