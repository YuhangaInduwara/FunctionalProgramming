object Q4 {
  def isEven(a:Int):Boolean = a match{
    case 0 => true
    case _ => isOdd(a-1)
  }
  def isOdd(a:Int):Boolean = !isEven(a)

  def main(args: Array[String]): Unit = {
    print(isEven(4))
  }
}
