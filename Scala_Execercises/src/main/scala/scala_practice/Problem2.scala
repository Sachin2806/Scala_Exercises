package scala_practice

object Problem2 {
  
  def main(args: Array[String])
  {
  
    //How to check if a list is palindrome or not
    val list1 = List(1,2,3,4,5,6,5,4,3,2,1)
    println(isPalindrome1(list1))  
    
    val list2 = List(1,2,3,4,5,6,5,4,3,2,1)
    println("List is Palindrome : " + isPalindrome2(list2)) 
    
    val list3 = List(1,2,3,4,5,6,5,4,3,2,1)
    println(isPalindrome3(list2))
    
    val list4 = List(1,2,3,4,5,6,5,4,3,2,1)
    println(isPalindrome4(list2))
    
    val list5 = List("I’m Adam  or Poor Dan is in a droop")
    println(isPalindrome5(list5))
    
  }
  
  //The recursive solution
  def isPalindrome1(list:List[Int]):Boolean = 
  {
     list match 
     {
        case Nil => true
        case List(a) => true
        case list => (list.head == list.last && isPalindrome1(list.tail.init))
     }
  }
  
  //The procedural solution
  def isPalindrome2(list: List[Int]):Boolean = 
  {
    list == list.reverse   
  }
  
  //A custom operator
  def isPalindrome3(list: List[Int]) = list match 
  {
    case Nil => None
    case _   => Some( (list.init, list.last) )
  }
  
  //Another Solution 
  def isPalindrome4(list: List[Any]): Boolean = list match 
  {
    case Nil => true
    case head :: Nil => true
    case head :: rest if head == rest.last => isPalindrome4(rest.dropRight(1))
    case _ => false
  }
  
  //Another Solution 
  def isPalindrome5(list: List[Any]): Boolean = list match 
  {
    case Nil => true
    case head :: Nil => true
    case head :: list if head == list.last => isPalindrome5(list.dropRight(1))
    case _ => false
  }
  
}
