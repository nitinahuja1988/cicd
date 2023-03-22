//trait A{
//  def a(): Unit = println("A.a")
//}
//
//trait B extends A {
//  override def a(): Unit = {println("B.a")
//  super.a()
//}}
// trait C extends A {
//   override def a(): Unit = {
//     println("C.a")
//     super.a()
//   }
//
// }
//trait E extends A {
//  override def a(): Unit = {println("E.a")
//  super.a()
//}}
//
//trait D
//
//object exam extends App {
//  val v1 = new D with B with C
//   v1.a
//  val v2 = new D with E with B with C
//  v2.a
//}