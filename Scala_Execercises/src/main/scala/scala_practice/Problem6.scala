package scala_practice

object Problem6 {
  
  def main(args: Array[String])
  {
    val list1 = List('a, 'b, 'c, 'c, 'd)
    val list2 = List('a, 'b, 'c, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    val list3 = List(1,3,4,5,11,46,2,3,98,100)
    val list4 = List(11, 22, 33, 66, 77, 88, 99)
    val list5 = (1 to 10).toList
    
   println("Demo of  remove the nthe element in a list         : " + removeAt(3, list1))
    
  }
  
  def removeAt[A](n:Int, list:List[A]):(List[A],A) = 
  {
    (list.take(n) ::: list.drop(n).tail, list(n))
  }
  
  def randomSelect[T](count: Int, list: List[T]): List[T] = 
  {  
    if (count <= 0) Nil  
    else 
    {    
      val r = new java.util.Random()  
      val (rest, removedElement) = removeAt(r.nextInt(list.length), list)  
      return removedElement :: randomSelect(count - 1, rest)  
    }  
  } 
 
}

