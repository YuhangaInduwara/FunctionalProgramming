object Q3 {
  def filterPrime(arr: Array[Int]): Array[Int] = {
    var arr2 = arr.filter(x => {
      if (x <= 1) false
      else if (x <= 3) true
      else if (x % 2 == 0 || x % 3 == 0) false
      else {
        var i = 5
        while (i * i <= x) {
          if (x % i == 0 || x % (i + 2) == 0)
            i += 6
        }
        true
      }
    })
    arr2;
  }
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(filterPrime(arr).mkString(", "));
  }
}
