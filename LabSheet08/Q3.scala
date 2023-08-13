//object Q3 {
//  def toUpper(string:String): String = string.toUpperCase()
//  def toLower(string:String): String = string.toLowerCase()
//  def toUpperOne(index:Int , string:String): String = {
//    var arr:Array[Char] = string.toCharArray
//    arr(index) = arr(index).toUpper
//    arr.mkString
//  }
//  def formatNames(name:String, function: String => String): String = function(name)
//  def formatNames(name:String, function: (Int, String) => String, index:Int): String = function(index, name)
//  def main(args: Array[String]): Unit = {
//    var names:Array[String] =  Array ("Benny", "Niroshan", "Saman" ,"Kumara" )
//    println(formatNames(names(0), toUpper))
//    println(formatNames(names(1), toUpperOne, 1))
//    println(formatNames(names(2), toLower))
//    println(formatNames(names(3), toUpperOne, names(3).length - 1))
//  }
//}

object Q3 {
//  val toUpper: String => String = string => string.toUpperCase()
  val toUpper = (string:String) => string.toUpperCase()
  val toLower: String => String = string => string.toLowerCase()

  val toUpperOne: (Int, String) => String = (index, string) => {
    val arr: Array[Char] = string.toCharArray
    arr(index) = arr(index).toUpper
    arr.mkString
  }

  val formatNames: (String, String => String) => String = (name, function) => function(name)

  val formatNamesWithIndex: (String, (Int, String) => String, Int) => String = (name, function, index) => function(index, name)

  def main(args: Array[String]): Unit = {
    val names: Array[String] = Array("Benny", "Niroshan", "Saman", "Kumara")
    println(formatNames(names(0), toUpper))
    println(formatNamesWithIndex(names(1), toUpperOne, 1))
    println(formatNames(names(2), toLower))
    println(formatNamesWithIndex(names(3), toUpperOne, names(3).length - 1))
  }
}
