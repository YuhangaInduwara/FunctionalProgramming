import scala.math.BigDecimal.RoundingMode

object LabSheet03_Q3 {
  def average(number1:Int, number2:Int): Float = (number1 + number2)/2F
  def input(): Float = {
    print("Enter number 1: ")
    var input1 = scala.io.StdIn.readInt()
    print("Enter number 2: ")
    var input2 = scala.io.StdIn.readInt()
    var avg = average(input1, input2)
    avg
  }
  def main(args: Array[String]):Unit = {
    var output = input()
    println("%.2f" .format(output))
  }
}
