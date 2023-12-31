class Rational(n: Int, d: Int) {
  private val gcdVal = gcd(n.abs, d.abs)
  val numer = n / gcdVal
  val denom = d / gcdVal

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer / $denom"
}

object Q1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    println(s"x: $x")

    val negX = x.neg
    println(s"Negation of x: $negX")
  }
}
