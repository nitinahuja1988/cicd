abstract class pulser(val fuelType:String, var gearType:String, var meterType:String){
  val fueltype = fuelType
  var geartype = gearType
  val Metertype = meterType
  val maxSpeed:Int
  def start:Unit = {
    println("started")}
  def stop:String

}
class Bike extends pulser("petrol", "b", "digital"){
  val maxSpeed:Int = 100
  def stop: String = "stop the bike"

}

object rola extends App {
  val p1 = new Bike
  println(p1.maxSpeed)
  println(p1.stop)
  println(p1.start)
  println(p1.fuelType)
  println(p1.gearType)
  println(p1.meterType)

}
