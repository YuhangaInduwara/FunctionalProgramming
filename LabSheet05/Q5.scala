object Q5 {
  def isEven(a:Int):Boolean = a match{
    case 0 => true
    case _ => isOdd(a-1)
  }
  def isOdd(a:Int):Boolean = !isEven(a)

  def sum(a: Int): Int = a match {
    case 0 => 0
    case a if(isEven(a)) => a + sum(a - 2)
    case a if(!isEven(a)) => (a-1) + sum((a-1) - 2)
  }

  def main(args: Array[String]): Unit = {
    print(sum(12))
  }
}
