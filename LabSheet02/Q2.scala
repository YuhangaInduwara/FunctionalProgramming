object LS02_Q2 {
  def main(args: Array[String]): Unit = {
    var (a,b,c,d) = (2,3,4,5)
    var k = 4.3f
    b = b - 1 //b -= 1
    println( b * a + c * d)  //println(--b * a + c *d--)
    d = d - 1
    println(a) //println(a++)
    a = a + 1
    println (-2 * (d - k) +c)  //println ((-2) * ( g – k ) +c) we can't call 'g' without declaring it.
    println (c) //println (c=c++) is not supported in scala
    c += 1
    c += 1
    c = c*a
    println (c) //println (c=++c*a++) is not supported in scala
    a += 1
  }
}


//2. Use the following declaration and initialization to convert them to
//acceptable Scala statements.
//int a = 2, b = 3, c = 4, d = 5;
//float k = 4.3f;
//and evaluate the following expressions
//a) println( - -b * a + c *d - -);
//b) println(a++);
//c) println (–2 * ( g – k ) +c);
//d) println (c=c++);
//e) println (c=++c*a++);