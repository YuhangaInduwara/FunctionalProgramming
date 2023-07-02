object volume {
  def volume(radius: Double): Double=4*3.14*radius*radius*radius/3
  def main(args: Array[String]): Unit = {
    var volume_val = volume(5)
    println(s"Volume of a circle with radius 5 = $volume_val")
  }
}
