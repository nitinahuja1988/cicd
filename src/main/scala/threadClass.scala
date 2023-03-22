class MyThread extends Thread{
  override def run() = {
    println(s"Current thread running ${Thread.currentThread.getName}")
    1 to 10 foreach(num => {println(s"working $num");Thread.sleep(1000)})
    println(s"thread done successfully ${Thread.currentThread.getName}")
  }
}

object threadClass {
  def main(args: Array[String]): Unit = {
    println(s"main() starts : ${Thread.currentThread()}")
    val th = new MyThread
    th.start()
    Thread.sleep(8000)
    println(s"program over : ${Thread.currentThread()}")
  }
}
