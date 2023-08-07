object Q2 {
  def calculateSquare(arr: Array[Int]): Array[Int] = {
    var arr2 = arr.map(x => x * x);
    arr2;
  }
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(calculateSquare(arr).mkString(", "));
  }
}
