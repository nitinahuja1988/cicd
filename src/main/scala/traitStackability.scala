abstract class traitStackability {
def write(data:String):String}

class basicStringWriter extends traitStackability {
  override def write(data: String): String = {
    println("BasicStringWriter.write")
    s"writing the following data : ${data}"}}

trait CapitalizingStringWriter extends traitStackability {
  abstract override def write(data: String): String = {
    println("CapitalizingStringWriter.write")
    super.write(data.split("\\s+").map(_.capitalize).mkString(" "))}}

trait UppercaseStringWriter extends traitStackability {
  abstract override def write(data:String):String = {
    println("UppercaseStringWriter.write")
    super.write(data.toUpperCase)}}

trait LowercaseStringWriter extends traitStackability{
  abstract override def write(data:String):String = {
   println("lowercaseStringWriter.write")
    super.write(data.toLowerCase)}}

object example extends App{
  val writer1 = new basicStringWriter with UppercaseStringWriter with CapitalizingStringWriter
  println(s"writer 1 : '${writer1.write("We like the Data")}'")
  val writer2 = new basicStringWriter with LowercaseStringWriter with CapitalizingStringWriter with UppercaseStringWriter
  println(s"writer 2 : '${writer2.write("you Are the BEST")}'")
  val writer3 = new basicStringWriter with LowercaseStringWriter
  println(s"writer 3 : '${writer3.write("you Are the BEST")}'")
  val writer4 = new basicStringWriter with CapitalizingStringWriter
  println(s"writer 4 : '${writer4.write("you Are the BEST")}'")
}