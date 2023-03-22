trait AA {
  def sayHello1(): Unit
  def sayHello2(): Unit = {println("A.sayHello2")}
  def sayHello3(): Unit = {println("A.sayHello3")}}

 trait BB {
   def sayHello1(): Unit
   def sayHello2(): Unit = {println("B.sayHello2")}
   def sayHello3(): Unit}

class traitPractice extends AA with BB {
  def printEverything(): Unit = {
    sayHello1()
    super[AA].sayHello2()
    super[BB].sayHello2()
  }
  def sayHello1():Unit = {
    println("C.sayHello1")}
  override def sayHello2():Unit = {
    println("C.sayHello2")}
}

object hello extends App{
  val res = new traitPractice
  res.sayHello1()
  res.sayHello2()
  res.sayHello3()
//  res.printEverything()
}
//class icecream {println("icecream object creator")}
//trait vanila {println("its vanila flavour")}
//trait choco {println("its chocolate flavour")}
//object traitPractice extends App{
//val vanilaIceCream = new icecream with vanila
//val chocoIcecream = new icecream  with choco
//val bothIcecream = new icecream with vanila with choco
//}