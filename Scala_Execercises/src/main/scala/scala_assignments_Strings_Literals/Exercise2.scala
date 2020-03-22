package scala_assignments_Strings_Literals

import scala.io.StdIn

object Exercise2 {
  
  def main(args: Array[String]){
   
    //Problem 1: Create a Scala program to reverse, and then format to upper case, the given
    val strFrmt = "NAVAHC NIHCAS"
    println(strFrmt.reverse.toLowerCase())
    
    //Create a Scala program to prompt customers for their name and age. The format for the name and age 
    //labels should be in bold. And, the name literal should be underlined.
    val name = readLine("Enter your name: ")
    println("Enter your age: ")
    val age = readInt()
    println(Console.BOLD)
    print("Name: ")
    print(Console.UNDERLINED)
    print(name)
    println(Console.BOLD)
    print("Age: ")
    print(Console.RESET)
    print(age)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}