object LS02_Q1 {
  def main(args: Array[String]): Unit = {
    var k, i, j = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'
    println("k + 12 * m = " + (k + 12 * m))
    println("m / j = " + (m / j))
    println("n % j = " + (n % j))
    println("m / j * j = " + (m / j * j))
    println("f + 10 * 5 + g = " + (f + 10 * 5 + g))
    i += 1
    println("i * n = " + (i * n)) // ++i and i++ does not support in Scala
  }
}

//In scala post and pre increment are not supported. But it support operator overloading. Every method treated as a variable in scala and in Java it is treated as objects.


//1. Consider the following variables
//i, j, m, n, k, f, g, c Declare the variables in Scala and assign with the initial values as follows:
// k = i = j = 2;
// m = n = 5;
//f = 12.0f;
//g = 4.0f;
//c = ‘X’;
//Evaluate the following expressions:
//a) k + 12 * m
//b) m / j
//c) n % j
//d) m / j * j
//e) f + 10*5 +g
//f) ++i * n