object checkPrimeNumber {
  def main(args: Array[String]): Unit = {
  def func(str:String):String = {
    str.dropRight(4) + str.takeRight(4).toUpperCase()
  }
   println(func("Hello World"))}}
