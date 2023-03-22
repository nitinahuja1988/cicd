object ParSeq {
//  def main(args: Array[String]): Unit = {
//    val list = scala.collection.parallel.ParSeq(1 to 10)
//    list.foreach(println)
//  }
def main(args: Array[String]): Unit = {
  val arr = Array("nitin","ahuja","diya")
  process(arr.toList)
  println
  arr.foreach(print)
}
  def process(data:List[String]) = {
    data.foreach(print)
    //data(0) = "haddop"
  }
}
