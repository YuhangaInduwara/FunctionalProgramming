class Account(accNo: Int, var accBalance: Double){
  def deposit(value: Double): Unit = {
    accBalance += value
  }
  def withdraw(value: Double): Unit = {
    accBalance -= value
  }
  def transfer(value: Double): Unit = {
    accBalance -= value
  }
  override def toString: String = s"$accBalance"
}

object Q3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1001, 20000.00)
    account1.deposit(2000.00)
    println(s"Account balance after depositing $$2000= $$$account1")
    account1.withdraw(500.00)
    println(s"Account balance after withdraw $$500 = $$$account1")
    account1.transfer(200.00)
    println(s"Account balance after transferring $$200 = $$$account1")
  }
}

