package scala_assignments_Numbers

import scala.io.StdIn

object NumbeExercise1 {
  
  def main(args: Array[String]){
   
    //Problem 1: Create a Scala program that defines a sequence of numbers from 100 to 110. 
    //The sequence should include the 100 starting number literal, and ends with the 110 number literal.    
    
    val numberRange = 100 to 110    
    println(" Number range from 100 to 110 inclusive : ")
    numberRange.foreach(number => print(s"$number "))    
    
    //Problem 2: Create a Scala program to represent a List with a sequence of number from 100 to 150. 
    //You should omit the last numeric item of 150, and each numeric item should have a 10 numeric interval. 
    //You should then calculate the sum of all the numeric items in the List.
    
//    val listRange = List.range(100, 150, 10)
//    val listRangeAsStr = listRange.mkString(", ")
//    println(s"Elements of List from 100 to 150, excluding the 150 number literal = $listRangeAsStr")
//    println(s"Sum for elements in the List = ${listRange.sum}")
//    
    
    
    
  }
}