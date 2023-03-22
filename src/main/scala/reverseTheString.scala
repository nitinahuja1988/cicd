object reverseTheString {
  def reverse(Str: String): String = {
    val len = Str.length()
    (for (i <- len until 0 by -1) yield Str(i-1)).mkString}
  def main(args: Array[String]): Unit = {
    val Str = "hello my name is nitin ahuja"
    println(reverse(Str))}}