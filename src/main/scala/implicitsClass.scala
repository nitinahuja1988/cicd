//import java.util.Scanner
import java.io._

object implicitsClass extends App {
//  val mainFile = new File("C:/Users/Lenovo/Desktop/word1.txt")
//  val output = new PrintWriter(mainFile)
//  output.write("my name is nitin")
//  output.write("\n you are my brother")
////  output.close()
//
//  val main2 = new File("C:/Users/Lenovo/Desktop/word2.txt")
//  val output2 = new FileWriter(main2)
//  val out = new BufferedWriter(output2)
//  out.write("hello beautiful")
//  out.write("\n you are rocking")
//  out.close()

  val source = io.Source.fromFile("C:/Users/Lenovo/Desktop/word4.txt")
  for (lines <- source.getLines.drop(1)) {
    val Array(id, name, salary) = lines.split(",")


  println(s"empid is ${id} name is ${name} and salary is  ${salary}")
  //  source.close

}}


