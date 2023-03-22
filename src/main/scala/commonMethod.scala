trait A{
  def sayHello1():Unit
  def sayHello2():Unit = {
    println("hello world")}
}
trait B{
  def sayHello1():Unit
  def sayHello2():Unit ={
    println("hello diya")
  }
}

class commonMethod extends A with B {
def sayHello1():Unit = {
  println("hi my name is nitin")}

  override def sayHello2(): Unit = {super.sayHello2()}
}

object result extends App {
  val view = new commonMethod
  view.sayHello1()
  view.sayHello2()
}
