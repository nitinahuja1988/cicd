package threads
import java.util.concurrent.{Callable, ExecutorService, Executors, Future, TimeUnit}
import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer
class Mycallable(list:List[Int]) extends Callable[Int] {
  def call() = {
    println(s"calling thread : ${Thread.currentThread.getName}")
    val sum = list.reduce(_+_)
    println(s"the total sum of $list ${Thread.currentThread.getName} : $sum")
    Thread.sleep(15000);
    println("hello hi")
    sum
}
}
object threadPool {
  def pool(numlist: Range.Inclusive, batchSize:Int) = {
    val totalSubList = Math.ceil(numlist.size / batchSize.toFloat).toInt
    val listofSubList = new ListBuffer[List[Int]]

    for (i <- 0 until totalSubList) {
      var subList: List[Int] = null
      if (i != totalSubList) {
        subList = numlist.slice(i * batchSize, (i + 1) * batchSize).toList
      } else
        subList = numlist.slice(i * batchSize, numlist.length).toList
      listofSubList += (subList)
    }

    listofSubList.toList
  }
    def main(args:Array[String]):Unit = {
      val numlist = 1 to 50
      val batchSize = 10
      val subsublist = pool(numlist, batchSize)

      import java.util.concurrent.ExecutorService
      import java.util.concurrent.Executor
      val threadPool = Executors.newFixedThreadPool(2)

      val futureList = new ListBuffer[Future[Int]]
      subsublist.map(list =>{
        val callable = {
          new Mycallable(list)
        }
        val result = threadPool.submit(callable)
        futureList += result
      })
      futureList.foreach(future=>{
        while(!future.isDone) {}
        println(s"result : ${future.get()}")
      })

    threadPool.shutdown()
  }

}
