

import org.apache.commons.lang3.{ArrayUtils, StringUtils}

import scala.util.chaining.scalaUtilChainingOps

object helloWorldDemo {

  def main(args: Array[String]): Unit = {
    println("hello")
    val result  = printName(fullName = "Ratan kumar ahuja")
    //val result2 = printName(fullName = "Ratan ahuja")
    val result3 = printName(fullName = null)
    println(result3)
  }

  def printName(fullName:String):String = {

    if (fullName == null) {
      print("null names not allowed")
      return ""
    }
    val name = fullName.split(" ")
    var middleName = " "
    if(name.length == 2){
      println("no middle name")
    }
    else if(name.length == 3) {
      middleName = name(1)}
    else{
        println("invalid name")
      }

  middleName
  }



}
