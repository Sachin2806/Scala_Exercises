package scala_practice

object Problem4 {
  
  def main(args: Array[String])
  {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encodeList = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    println("Packing consecutive duplicates into seperate lists : " + pack(list)) 
    println("Run-length encoding of a list : " + encode(list))
    println("Run-length encode Modified of a list : " + encodeModified(list)) 
    println("Demo of run-length encoding data compression method : " + encodeDirect1(list))
    println("Demo of run-length encoding data compression method : " + encodeDirect2(list1))
  }
  
  def pack[A](ls: List[A]):List[List[A]] = 
  {
    if (ls.isEmpty) List(List())
    else 
    {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
  
  def encodeModified[A](ls: List[A]): List[Any] =
    encode(ls) map { t => if (t._1 == 1) t._2 else t }
  
  //1st direct solution method
  def encodeDirect1[A](ls: List[A]): List[(Int, A)] =
    if (ls.isEmpty) Nil
    else 
    {
      val (packed, next) = ls span { _ == ls.head }
      (packed.length, packed.head) :: encodeDirect1(next)
    }
  
  //2nd direct solution method
  def encodeDirect2[A](ls:List[A]):List[(Int,A)]={
      if(ls==Nil) Nil
      else {
        val l = ls.dropWhile(_ == ls.head)
        List((ls.length - l.length, ls.head)) ::: encodeDirect2(l)
      }
  }
}
