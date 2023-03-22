import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Queue
object arrayBuffer {
  def main(args: Array[String]): Unit = {
//    val a = ArrayBuffer(1, 2, 3)
//    a.append(4); println(a)
//    a.appendAll(Seq(6,7)); println(a)
//    a.prepend(10); println(a)
//    a.insert(0,11) ; println(a)
//    a.prependAll(Array(0)) ; println(a)
//
//    val b = ArrayBuffer.range('a','f')
//    b.remove(0) ;println(b)
//    b.remove(1,2) ; println(b)
//    b.appendAll(Seq('j','k','l'));println(b)
    val c = Queue(3,4,5) ; println(c)
    c+=7 ; println(c)
    c+=(8,9) ; println(c)
    c.enqueue(10,11) ; println(c)
    c.dequeue() ; println(c)
    val d = c.dequeueFirst(num=>num%2==0);  println(d)
    val e = c.dequeueAll(num=>num%2==1) ; println(e)




  }
}
