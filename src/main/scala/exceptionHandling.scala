import java.io.{File, FileNotFoundException, FileReader}
object exceptionHandling {
  def main(args: Array[String]): Unit = {
    println("system begins")
    try {
      process("2")
      println("process is completed ")
    } catch {
      case e: ArithmeticException => {
        println("cannot divide by zero")
      }
      case e: ArrayIndexOutOfBoundsException => {
        println("sorry element is not exist")
      }
      case cnf: ClassNotFoundException => {
        handleClassNotFound(cnf)
      }
      case fnf: FileNotFoundException => {
        println("unable to find the file")
      }
      case _: Exception => {
        println("some other exception")
      }}
    finally {
    println("this is the final block")}
  println("program ends")}

    def handleClassNotFound(cnf: ClassNotFoundException):Unit = {println(s"class not found $cnf")}
    def process(msg:String):Unit = {if (msg.equals("1")) {val result = 5 / 0}
    else if (msg.equals("2")) {
      val arr = Array(5)
      println(arr(10))}
    else if (msg.equals("3")) {Class.forName("Test234")}
    else if (msg.equals("4")) {val f = new File("abc.txt") ;val v = new FileReader(f)}

    else println("successfully")}


}