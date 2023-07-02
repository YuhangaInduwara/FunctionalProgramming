object Q1 {
  def find_interest(x:Double, amount:Double): Double = (amount * x)/100
  def find_total_earn(x:Double, amount:Double): Double = amount + find_interest(x, amount)
  def find_interest_rate(amount:Double): Double = amount match {
    case x if amount > 0 && amount <= 20000 => find_total_earn(2, amount)
    case x if amount <= 200000 => find_total_earn(4, amount)
    case x if amount <= 2000000 => find_total_earn(3.5, amount)
    case x if amount > 2000000 => find_total_earn(6.5, amount)
  }
  def get_input():Double = {
    var amount = scala.io.StdIn.readLine("Enter the amount: ")
    find_interest_rate(amount.toDouble)
  }
  def main(args: Array[String]): Unit = {
    println("The final earning user got after one year = " +get_input())
  }

}
