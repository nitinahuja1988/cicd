object exceptionHandling2 {
  def main(args: Array[String]): Unit = {
    println("program start")
  val result = process(10,2)
    println(s"process start $result")
  }
  def process(num1:Int, num2:Int) ={
    try{
      println("from inside try block")
      if (num1 > 10) num1 / 0
      else num1 / num2
    } catch{
      case e:ArithmeticException =>{
        println("you cant do this")
        -1}
      case e:Exception => {
        println("you are the last one")
        -1}}
      finally {
        println("this is the last one")
      }
    }
}
