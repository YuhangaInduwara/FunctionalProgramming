object Q1 {
  def filterEvenNumbers(arr: Array[Int]): Array[Int] = {
    var arr2 = arr.filter(x=>(x%2 == 0));
    arr2;
  }
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(filterEvenNumbers(arr).mkString(", "));
  }
}
