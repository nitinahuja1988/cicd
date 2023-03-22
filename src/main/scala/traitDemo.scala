abstract class calculator {
  def add:Unit
  def mul(num1:Int, num2:Int):Unit
  def sub():Unit
  def divide():Unit = {
    println("division not supported")
  }}
trait squareAndCube{
  def square(num:Int):Unit = {
    println(s"$num ^2 = ${num * num}")}
  def cube(num:Int):Int
}
trait trignoMetery {
  def sin(num:Int):Unit = {
    println(s"sin of $num = ... ")}
  def cos(num:Int):Unit = {
    println(s"cos of $num = ....")
  }
}
 class calculatorr extends calculator with squareAndCube with trignoMetery {
   def cube(num:Int):Int = {
     println("cube")
     0
   }

   def add:Unit = {
     println("adding numbers")}
   def mul(x:Int, y:Int):Unit = {
     println(s"$x * $y = ${x*y}")}
   def sub():Unit = {
     println("substraction called")}

   override def divide(): Unit = {
     println("it is supported")}
 }

object traitDemo extends App {
val e1 = new calculatorr()
e1.add
e1.mul(15,10)
e1.sub()
e1.divide()
e1.cube(5)
  e1.square(10)
e1.sin(8)
e1.cos(4)
}
