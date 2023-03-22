object freadingFilesandFolders {
  def main(args: Array[String]): Unit = {
    def fact(num: Int): Int = {
   if (num==1) 1
   else (num*fact (num-1))}
    val out = fact(6)
    println(out)}}

