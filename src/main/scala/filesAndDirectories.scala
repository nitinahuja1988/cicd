import java.io._
object filesAndDirectories extends App{
 val filePath1 = new File("C:/diya/employee/emp1/readme.txt")
 val filePath2 = new File("C:/diya/employee/emp2/readme.txt")
 val filePath3 = new File("C:/diya/qualification/emp1/readme.txt")
 val filePath4 = new File("C:/diya/qualification/emp2/readme.txt")

  filePath1.getParentFile().mkdirs()
  filePath2.getParentFile().mkdirs()
  filePath3.getParentFile().mkdirs()
  filePath4.getParentFile().mkdirs()

  val writer1 = new FileWriter(filePath1)
  val writer2 = new FileWriter(filePath2)
  val writer3 = new FileWriter(filePath3)
  val writer4 = new FileWriter(filePath4)

  writer1.close()
  writer2.close()
  writer3.close()
  writer4.close()
}
