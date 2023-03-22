object functionInFunction {
  def main(args: Array[String]): Unit = {
    val result = hiHi("nitin")
    print (result)}

def hiHi(username:String) = {
  def greet(msg:String, username:String) = {
    s"hello $msg : $username"
  }
  greet("good morning", username)
}






}