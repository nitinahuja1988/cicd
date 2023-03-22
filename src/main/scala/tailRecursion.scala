object tailRecursion {
  def main(args: Array[String]): Unit = {
    val numList = List(1, 2, 3, 4, 5, 6)
    val result = sum(numList)
    println("result :" + result)}

def sum(list:List[Int]):Int = list match {
  case Nil => 0
  case h :: t => h + sum(t)
}
}