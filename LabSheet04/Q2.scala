object Q2 {
  def check_int(value: Int): String = value match{
    case x if (value < 0) => "Negative"
    case x if (value == 0) => "Zero"
    case x if (value%2 == 0) => "Even"
    case x if (value%2 == 1) => "Odd"
  }
  def get_inputs():Any = {
    print("Enter an integer: ")
    var value = scala.io.StdIn.readInt()
    println(check_int(value))
  }
  def main(args: Array[String]): Unit = {
    get_inputs()
  }
}
