////
////
////
////object implicitVaribaleExample {
////  def main(args: Array[String]): Unit = {
////   val num1 = 20
////    val num2 = 25
////
////    implicit val DBConnection = "DB"
////    implicit val salary = 5000f
////    sum(20 , 25)
////    mul(20,25)
////    sq
////    }
////
////  def sum(num1:Int,num2:Int)(implicit DBConnection:String): Unit = {
////    println(s"$num1, $num2, $DBConnection")
////    val output = num1 + num2
////    print(output)
////  }
////
////  def mul(num1: Int, num2: Int)(implicit DBConnection: String): Unit = {
////    println(s"$num1, $num2, $DBConnection")
////    num1 * num2
////  }
////  def sq(implicit DBConnection:String,salary:Float ) {
////  println(s"$DBConnection , $salary")
////
////}}
//
//class upperClass(str:String) {
//  def func: String = str.toUpperCase}
//class lowerClass(str:String) {
//  def func1: String = str.toLowerCase}
//import scala.language.implicitConversions
//object Conversions  extends App{
//  implicit def mainUpper(str:String):upperClass = new upperClass(str)
//  implicit def mainLower(str:String):lowerClass = new lowerClass(str)}
//
//import Conversions._
//
//
//println("hello".func)
//println("HELLO".func1)
