object Q1 {
  def calculateAverage(temps: Array[Double]): Double = {
    var temp_Farh = temps.map(X=> (X*9/5)+32)
    var avg_Farh = temp_Farh.reduce((x,y) => x+y)
    avg_Farh/temps.length
  }
  def main(args: Array[String]): Unit = {
    var temps:Array[Double] = Array (0, 10, 20, 30)
    println("Average temprature in Faranhite = " + calculateAverage(temps))
  }
}
