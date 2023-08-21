class Account_2(val accNo: Int, var accBalance: Double) {
  def deposit(value: Double): Unit = {
    accBalance += value
  }
  def withdraw(value: Double): Unit = {
    accBalance -= value
  }
  def transfer(value: Double): Unit = {
    accBalance -= value
  }
  override def toString: String = s"Account $accNo: Balance = $$$accBalance"
}

class Bank(val accounts: List[Account_2]) {
  def accountsWithNegativeBalances: List[Account_2] = {
    accounts.filter(_.accBalance < 0)
  }
  def totalBalance: Double = {
    accounts.map(_.accBalance).sum
  }
  def applyInterest(): Unit = {
    accounts.foreach(account => {
      if (account.accBalance > 0) {
        account.deposit(account.accBalance * 0.05)
      } else {
        account.withdraw(account.accBalance * 0.1)
      }
    })
  }
}

object Q4 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account_2(1001, 20000.00)
    val account2 = new Account_2(1002, -500.00)
    val account3 = new Account_2(1003, 3000.00)
    val account4 = new Account_2(1004, -100.00)

    val bank = new Bank(List(account1, account2, account3, account4))

    println("Accounts with negative balances:")
    val negativeBalances = bank.accountsWithNegativeBalances
    negativeBalances.foreach(println)

    val totalBalance = bank.totalBalance
    println(s"Total balance of all accounts: $$$totalBalance")

    println("Balances after applying interest:")
    bank.applyInterest()
    bank.accounts.foreach(println)
  }
}
