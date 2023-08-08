object Q3 {
  def filterPrime(arr: Array[Int]): Array[Int] = {
    var arr2 = arr.filter(x => prime(x))
    arr2
  }

  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case b if a < b => gcd(b, a)
    case _ => gcd(b, a % b)
  }

  def prime(a: Int, b: Int = 2): Boolean = b * b > a match {
    case true => true
    case false if a % b == 0 => false
    case _ => prime(a, b + 1)
  }

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 49)
    println(filterPrime(arr).mkString(", "))
  }
}
