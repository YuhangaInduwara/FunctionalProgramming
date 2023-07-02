object temprature {
  def toFarh(tempC: Double): Double = tempC*1.8 + 32
  def main(args: Array[String]): Unit ={
    var tempF = toFarh(35)
    println(s"35C in Fahrenheit = $tempF")
  }
}
