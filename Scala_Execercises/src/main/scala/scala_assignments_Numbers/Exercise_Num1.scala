package scala_assignments_Numbers

import scala.tools.cmd.Opt.Implicit

object Exercise_Num1 {
  
  def main(args: Array[String]){
    
     //Create a Scala program that defines a sequence of numbers from 100 to 110. 
    //The sequence should include the 100 starting number literal, and ends with the 110 number literal.    
    
    val numberRange = 100 to 110    
    println(" Number range from 100 to 110 inclusive : ")
    numberRange.foreach(number => print(s"$number "))
    println()
    
    //Create a Scala program to represent a List with a sequence of number from 100 to 150. 
    //You should omit the last numeric item of 150, and each numeric item should have a 10 numeric interval. 
    //You should then calculate the sum of all the numeric items in the List.
    
    val listRange = List.range(100, 150, 10)
    val listRangeAsStr = listRange.mkString(", ")
    println(s"Elements of List from 100 to 150, excluding the 150 number literal = $listRangeAsStr")
    println("Sum for elements in the List = " + listRange.sum)
    println()
    
    //Create a Vector with the following numeric items: 0, 10, 20, 47, -2, 99, -98. 
    //Write a Scala program to find the smallest and the largest numeric item in the Vector.
    
    val vecNumbers = Vector(0, 10, 20, 47, -2, 99, -98)
    println("The smallest item in the Vector = " + vecNumbers.min)
    println("The largest item in the Vector = " + vecNumbers.max)
    println()
    
    //Let us assume two data structures to represent the following numerals: 
    //(1) 1, 3, 5, 10, 20 and (2) 20, 17, 18, 99, 0. 
    //Write a Scala program to find the number literals that are in the first data structure, 
    //but not in the other one. Conversely, also find the number literals that are in the second data 
    //structure, but not in the first one. You can use whichever data structure from the standard 
    //Scala collection types.
    
    val setOne = Set(1, 3, 5, 10, 20)
    val setTwo = Set(20, 17, 18, 99, 0)
    
    val diffSetOneVSSetTwo = setOne -- setTwo
    val diffSetTwoVSSetOne = setTwo -- setOne
    
    println(s"Number literals in set one but not in set two = " + diffSetOneVSSetTwo)
    println(s"Number literals in set two but not in set one = " + diffSetTwoVSSetOne)
    
    //Write a Scala program and use an appropriate data structure to represent the following number literal: 
    //99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0. 
    //Assume a second data structure with the following number literals: 10.0, 20.0, 30.0, 40.0, 50.0. 
    //Join the two data structures together, and thereafter find the lowest and the largest number literal 
    //from the combined number literals.
    
    val seqOne = Seq(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
    val seqTwo = Seq(10.0, 20.0, 30.0, 40.0, 50.0)
    val combinedNumbers = seqOne ++ seqTwo
    
    val minNumber = combinedNumbers.min
    val maxNumber = combinedNumbers.max

    println("Combined number literals = " + combinedNumbers)
    println("Lowest number literal =  " + minNumber)
    println("Largest number literal = " + maxNumber)
    
    //Write a Scala program and list all the odd numbers between 300 and 350. 
    val oddNumbers = 300 to 350
    val oddNumbersRes= oddNumbers.filter(x => x%2 != 0)
                                 .take(30)
                                 .toList
                                 .mkString(":")
    println()                                                                  
    println("List of all the odd numbers between 300 and 350 : " + oddNumbersRes)
    
  }
}