object reduceLeftOption {
  def main(args: Array[String]): Unit = {
   val result = getSalaryFromFile()
   val output = result.reduceLeftOption(_+_)
    println(output)
  }

  def getSalaryFromFile():List[Int] = {
    try{
      throw new Exception
      List(1,2,3,4,5)
    } catch {
      case e:Exception =>List()
    }
  }
}
