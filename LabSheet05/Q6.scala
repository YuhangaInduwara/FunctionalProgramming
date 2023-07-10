object Q6 {
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case x if (x == 1) => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printSeq(n: Int): Unit = {
    if (n > 0) {
      printSeq(n - 1)
    }
    println(fibonacci(n))
  }

  def main(args: Array[String]): Unit = {
    printSeq(3)
  }
}
