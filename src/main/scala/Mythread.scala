import scala.collection.mutable.ListBuffer
class Mythread(list:List[Int]) extends Thread {
  override def run () = {
  println(s"thread starts ${Thread.currentThread.getName}")
  val sum = list.reduce(_+_)
  println(s"the total sum of $list and ${Thread.currentThread.getName}:$sum")
  Thread.sleep(2000)
}}
object sublistthread {
  def subList(numList: Range.Inclusive, batchSize: Int): List[List[Int]] = {
    val totalSubListSize = Math.ceil(numList.size / batchSize.toFloat).toInt
    val listofsublist = new ListBuffer[List[Int]]

    for (i <- 0 until totalSubListSize) {
      var subList: List[Int] = null
      if (i + 1 != totalSubListSize) {
        subList = numList.slice(i * batchSize, (i + 1) * batchSize).toList
      }
      else subList = numList.slice(i * batchSize, numList.length).toList
      listofsublist += subList
    }
    listofsublist.toList
  }
 def main(args:Array[String]) :Unit = {
   val NumList = 1 to 10
   val BatchSize =  3
   val subsubList = subList(NumList, BatchSize)

   subsubList.foreach(list =>{
     val runnable = new Mythread(list)
     val th = new Thread(runnable)
     th.start

   })
 }
}
