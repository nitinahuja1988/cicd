import java.io._
object readFileLocation {
  def main(args: Array[String]): Unit = {
    listf("C:/diya")
  }
def listf(dictionaryName:String):Unit = {
  val dir = new File(dictionaryName);
  val filelist = dir.listFiles();
  for (file <- filelist) {
    if(file.isFile()){
      println(file)
    }else if (file.isDirectory()){
      listf(file.getAbsolutePath())
    }

  }
}
}
