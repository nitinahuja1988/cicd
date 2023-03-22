import java.io._
object Readandwrite extends App {
  try{
    val input = new FileInputStream("C:/Users/Lenovo/Desktop/nitin1.txt")
    val output = new FileOutputStream("C:/Users/Lenovo/Desktop/nitin2.txt")
    var c = 0
    while ({
      c = input.read;  c!= -1
    }) {
      output.write(c)
    }
  }
  catch {
    case e:IOException => e.printStackTrace()}
  finally{
    println("entered finally ...")
  }

val source  = io.Source.fromFile("C:/Users/Lenovo/Desktop/nitin1.txt")
  for (lines <- source.getLines){
    print(lines)
source.close()

val source1 = io.Source.fromFile("C:/Users/Lenovo/Desktop/nitin1.txt")
for(char <- source1) {
  print(char)
  source1.close()

}}

  }

