//object headRecursion {
//  val str = "nitin is a good mam"
//
//  def main(args: Array[String]): Unit = {
//    val len = lengthOfString(str,0)
//    print(len)
//  }
//  def lengthOfString(str: String):Int = {
//    if (str.length == 0 ) 0
//    else 1 + lengthOfString(str.substring(1))}
//
//  def lengthOfString(str: String, acc : Int):Int = {
//    if (str.length == 0) return acc
//    else lengthOfString(str.substring(1), acc +1 )}
//
//  def lengthOfString(str: String, acc: Int): Int = {
//    if (str.length > 0) lengthOfString(str.substring(1), acc + 1)
//    else  acc}
//
//
//
//
//}
