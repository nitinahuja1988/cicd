////class ageException(s:String) extends RuntimeException(s)
//class ageException(S:String) extends Exception(S)
//case class EMPLOYEE(Name:String, exp:Int, salary:Float)
//
//object exceptionHandlingThrow {
//  @throws(classOf[ageException])
//  def empValidate(Exp: Int): String = {
//    if (Exp < 4) {
//      throw new ageException(s"please try ${4 - Exp} years later")
//    }
//    else {
//      "Eligible"
//    }
//  }}
//
//
//object mainObject {
//  def main(args: Array[String]): Unit = {
//    val empList = getEmployee
//    val result = empList.map(emp => {
//      try {
//        val result = exceptionHandlingThrow.empValidate(emp.exp)
//        (emp.Name, result)
//      } catch {
//        case e: ageException => {
//          println(s"not valid : ${e}")
//          (emp.Name, e.getMessage)
//        }
//      }
//    })
//    result.foreach(println)
//  }
//
//  private def getEmployee = {
//    val emp1 = EMPLOYEE("suraj", 5, 5000)
//    val emp2 = EMPLOYEE("maya", 2, 3000)
//    List(emp1, emp2)
//  }}
class ageException (s:String) extends Exception(s)
case class Employee(name: String, exp: Int, salary: Float)
object exceptionHandlingThrow {
  @throws(classOf[ageException])
  def main(args: Array[String]): Unit = {
def validateEmployee(emp: Employee): Employee = {
  if (emp.exp < 4) {
    throw new ageException(s"${emp.name} is ineligible for a visa due to insufficient experience (${emp.exp} years)")
  } else {
    emp
  }
}
val employeeList = List(Employee("suraj", 5, 5000), Employee("maya", 2, 3000))

val result = employeeList.map(emp => {
  try {
     validateEmployee(emp)
    s"${emp.name} is eligible for a visa"
  } catch {
    case e: ageException => e.getMessage
  }
})

result.foreach(println)}}
