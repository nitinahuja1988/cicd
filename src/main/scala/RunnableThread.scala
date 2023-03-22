class MyRunnable extends Runnable{
  def run() = {
    println(s"runnable starts ${Thread.currentThread.getName}")
    10 to 25 foreach(num =>{println(s"working $num");Thread.sleep(1500)})
    println(s"done successfully ${Thread.currentThread.getName}")
  }
}
object RunnableThread  {
  def main(args: Array[String]): Unit = {
    println(s"main() ${Thread.currentThread()}")
    val runnable = new MyRunnable
    val th = new Thread(runnable, "MyRunnableee")
    th.start()
    10 to 25 foreach(num =>{println(s"working $num");Thread.sleep(1500)})
    println(s"runnabl stops ${Thread.currentThread.getName}")
  }

}
