class closure {
  def executeMe(f:(String)=>String, name:String) = {f(name)}
}
object closureDemo {
val hello = "hello"
def func(name:String):String={
  s"$hello $name"}

  def main(args: Array[String]): Unit = {
    val demo = new closure
    val result = demo.executeMe(func, "nitin")
    println(result)
  }
}

