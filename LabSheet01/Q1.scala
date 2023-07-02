object area {
  def area(radius: Double): Double=3.14*radius*radius
  def main(args: Array[String]): Unit = {
    var area_val = area(5)
    println(s"Area of a circle with radius 5 = $area_val")
  }
}
