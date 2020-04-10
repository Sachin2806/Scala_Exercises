package scala_practice

object Problem5 {
  
  def main(args: Array[String])
  {
    val list1 = List('a, 'b, 'c, 'c, 'd)
    val list2 = List('a, 'b, 'c, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    val list3 = List(1,3,4,5,11,46,2,3,98,100)
    val list4 = List(11, 22, 33, 66, 77, 88, 99)
    val list5 = (1 to 10).toList
    
    println("Duplicate the elements of a list 		   : " + list1.flatMap(e => List(e,e))) 
    println("Duplicate the elements of a list given no of Times : " + list1.flatMap(e => List.fill(2)(e)))
    println("Duplicate the elements of a list given no of Times : " + list1.flatMap(e => List.fill(3)(e)))
    println("Drop every Nth element from a list 		   : " + drop(3,list2))
    println("Demo of Split a list into two parts		   : " + split(3,list2))
    println("Demo of Slice in a list 			   : " + list2.slice(2,5))
    println("Demo of  Rotate a list N places to the left        : " + circ(list1,2))
    println("Demo of  remove the nthe element in a list         : " + removeAt(3, list1))
    println("Insert an element at a given position into a list  : " + insertAt(2,1,list3))
    println("Insert an element at a given position into a list  : " + insertAt(36,4,list3))
    println("Insert an element at a given position into a list  : " + insert(55,3,list4))
    println("Create a list containing all integers within a given range : " + list5)
    
  }
  
 //Drop every Nth element from a list.
 def drop[A](n:Int, list:List[A]):List[A] = 
 {
   list.grouped(n).flatMap { _.take(n - 1) }.toList
 }
 
 //Split a list into two parts.
 def split[A](n: Int, l: List[A]): (List[A], List[A]) = l.splitAt(n)
 
 //Rotate a list N places to the left
 def circ[A](list: List[A], n: Int ): List[A] = 
 {
    if ( n == 0 || list.size < 2 ) list
    else circ(list.drop(1) :+ list.head , n-1)
 }
 
 //Remove the Kth element from a list. Return the list and the removed element in a Tuple. 
 //Elements are numbered from 0.
 
 def removeAt[A](n:Int, list:List[A]):(List[A],A) = 
 {
   (list.take(n) ::: list.drop(n).tail, list(n))
 }
 
 //Insert an element at a given position into a list
 def insertAt[A](e: A, n:Int, list:List[A]): List[A] = list.splitAt(n) match 
 {
   case(pre, post) => pre ::: e :: post
 }
 
 def insert[A](e: A, n:Int, list:List[A]):List[A] = 
 {
   if (n < 0 || list == Nil ) throw new IllegalArgumentException
   list.take(n) ::: List(e) ::: list.drop(n)
 }
 
}

