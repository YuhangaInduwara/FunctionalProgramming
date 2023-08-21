class Rational_2(n: Int, d: Int) {
  private val gcdVal = gcd(n.abs, d.abs)
  val numer = n / gcdVal
  val denom = d / gcdVal

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def - (other: Rational_2): Rational_2 = new Rational_2(numer * other.denom - other.numer * denom, denom * other.denom)

  override def toString: String = s"$numer / $denom"
}

object Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational_2(3, 4)
    val y = new Rational_2(5, 8)
    val z = new Rational_2(2, 7)

    val result = x - y - z
    println(result)
  }
}
