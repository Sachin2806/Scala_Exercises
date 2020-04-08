package scala_practice

object Problem3 {
  
  def main(args: Array[String])
  {
    
    val list = List(1,2,3,4,5,6,7) 
    val lol = List(List(1,2), List(3,4))
    val a = Array(Array(1,2), Array(3,4))
    val couples = List(List("kim", "al"), List("julia", "terry"))
    val list1 = List(1,2,3,4,2,3,4,99)
       
    //Eliminate consecutive duplicates of list elements
    val list2 = List(1,1,2,3,3,4,4,5,6,7,7,7,2,2,8)
    val list2Result = list2.head :: list2.sliding(2).collect{case Seq(a,b) if a != b => b}.toList
    
    val dupEle = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val dupEleRes = dupEle.head :: dupEle.sliding(2).collect{case Seq(a,b) if a != b => b}.toList
    
    println("Last element in the list 				: " + list.last)
    println("Last but one element in the list 			: " + list.init.last)
    println("nthElement in the list 	        	    	        :	" + nthElement(1, List(44, 66, 77, 11, 22)))
    println("Total no of elements in the list 			: " + list.length)
    println("Reversing the elements from the list 			: " + list.reverse)
    println("Flattening a list of lists 				: " + lol.flatten)
    println("Flattening a list of arrays 				: " + a.flatten.mkString(","))
    println("Flattening a list of Strings				: " + couples.flatten.map(_.capitalize).sorted)
    println("Finding the distinct elements in the list		: " + list1.distinct)
    println("Eliminate consecutive duplicates of list elements	: " + compress(dupEle))
    println("Eliminate consecutive duplicates of list elements	: " + list2Result)
    println("Eliminate consecutive duplicates of list elements	: " + dupEleRes) 
    
  }
  
  def nthElement[A](n:Int, list:List[A]):A = 
  {
    if(n >= 0 && n < list.length) list(n) else throw new NoSuchFieldException
  }
   
  def compress[A](l: List[A]):List[A] = l match {
    case Nil => Nil
    case h::List() => List(h)
    case h::tail if (h == tail.head) => compress(tail)
    case h::tail => h::compress(tail)
}
}
