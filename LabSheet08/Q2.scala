//object Q2 {
//  def check_int(value: Int): String = value match{
//    case x if (value < 0) => "Negative"
//    case x if (value == 0) => "Zero"
//    case x if (value%2 == 0) => "Even"
//    case x if (value%2 == 1) => "Odd"
//  }
//  def get_inputs():Any = {
//    print("Enter an integer: ")
//    var value = scala.io.StdIn.readInt()
//    println(check_int(value))
//  }
//  def main(args: Array[String]): Unit = {
//    get_inputs()
//  }
//}

object Q2 {
  val checkInt: Int => String = value => value match {
    case x if value < 0 => "Negative"
    case x if value == 0 => "Zero"
    case x if value % 2 == 0 => "Even"
    case x if value % 2 == 1 => "Odd"
  }

  val getInputs: () => Unit = () => {
    print("Enter an integer: ")
    val value = scala.io.StdIn.readInt()
    println(checkInt(value))
  }

  def main(args: Array[String]): Unit = {
    getInputs()
  }
}
