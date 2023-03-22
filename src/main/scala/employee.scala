import java.io._
object employee extends App {
 val source = io.Source.fromFile("C:/Users/Lenovo/Desktop/word4.txt")
 var totalSalary:Int = _
 for(lines <- source.getLines) {
 val salary = lines.split(",")(2).toInt
 totalSalary+=salary
 }
 println(s"total Salary is ${totalSalary}")
//  source.close

}
