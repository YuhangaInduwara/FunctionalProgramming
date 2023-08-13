//object Q1 {
//  def find_interest(x:Double, amount:Double): Double = (amount * x)/100
//  def find_interest_rate(amount:Double): Double = amount match {
//    case x if amount > 0 && amount <= 20000 => find_interest(2, amount)
//    case x if amount <= 200000 => find_interest(4, amount)
//    case x if amount <= 2000000 => find_interest(3.5, amount)
//    case x if amount > 2000000 => find_interest(6.5, amount)
//  }
//  def get_input():Double = {
//    var amount = scala.io.StdIn.readLine("Enter the amount: ")
//    find_interest_rate(amount.toDouble)
//  }
//  def main(args: Array[String]): Unit = {
//    println("The interest user got after one year = " + get_input())
//  }
//
//}

object Q1 {
//  val findInterest: (Double, Double) => Double = (x, amount) => (amount * x) / 100
  val findInterest = (x: Double, amount: Double) => (amount * x) / 100
  val findInterestRate: Double => Double = amount => amount match {
    case x if amount > 0 && amount <= 20000 => findInterest(2, amount)
    case x if amount <= 200000 => findInterest(4, amount)
    case x if amount <= 2000000 => findInterest(3.5, amount)
    case x if amount > 2000000 => findInterest(6.5, amount)
  }

  val getInput: () => Double = () => {
    val amount = scala.io.StdIn.readLine("Enter the amount: ").toDouble
    findInterestRate(amount)
  }

  def main(args: Array[String]): Unit = {
    println("The interest user got after one year = " + getInput())
  }
}
