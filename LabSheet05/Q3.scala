object Q3 {
  def sum(a:Int):Int = a match {
    case 0 => 0
    case _ => a + sum(a-1)
  }

  def main(args: Array[String]):Unit = {
    print(sum(3))
  }
}
