package scala_assignments_Strings_Literals

import scala.io.StdIn

object Exercise1 {
  
  def main(args: Array[String]){
   
    //Problem 1: Create a Scala program to reverse, and then format to upper case, the given
    val strFrmt = "NAVAHC NIHCAS"
    println(strFrmt.reverse.toLowerCase())
    
    //Create a Scala program to find the 8th character in the String: "http://allaboutscala".
    val str1 = "http://allaboutscala"
    val charToFind = str1.charAt(7)
    println("8th character in the literal : " + charToFind)
    
    //Create a Scala program that will ask the following question to a customer:
    //"What is your favorite movie of all times?".
    val favoriteMovie = readLine("What is your favorite movie of all times?")
    println(s"$favoriteMovie is totally awesome!")
    
    // Create a Scala program to output your name and favorite movie.
    val firstName = "Sachin"
    val lastName =  "Chavan"
    val favoriteMovie1 = "Hum Apke Hain Koun"
    
    val output = s""" First Name: $firstName Last Name: $lastName Favorite Movie: $favoriteMovie """.stripMargin
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}