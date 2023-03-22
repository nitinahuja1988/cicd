//trait Employee {
//  def salary(): Unit = {
//    println("10000")}
//  def hike():Unit
//  def timing():Unit ={
//    println("10 to 6")}}
//
//
//class traitDemo1 extends Employee {
//def hike():Unit = {
//  println("20%")}
//}
//class tcsEmployee extends Employee{
//  def hike(): Unit = {
//    println("10%")}
//  override def timing(): Unit = {
//    println("10 to 7")
//  }
//}
//
//object pun extends App {
//  val emp1 = new traitDemo1
//  emp1.hike()
//  emp1.salary()
//  emp1.timing()
//
//  val emp2 = new tcsEmployee
//  emp2.hike()
//  emp2.timing()
//  emp2.salary()
//
//}