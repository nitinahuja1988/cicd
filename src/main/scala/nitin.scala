abstract class rahul  {
  val a:Int = 60
  val b:Int
  var c = 10
  var k:Int = _
}

class nitin extends rahul {
  override val a = 80  //Must override it because it is in super class
  val b:Int = 15 // u dont need to override it becuase there is no value in super class
  c = 15
  k = 50
}
 object AbstractClassDemo extends App {
   val d = new nitin
   println(d.a)
   println(d.b)
   println(d.c)
   println(d.k)

 }