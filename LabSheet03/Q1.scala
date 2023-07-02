import scala.io.StdIn.readLine
object LabSheet03_Q1 {
  def input():Unit = println(reverseString(readLine("Enter a string: ")))
  def reverseString(string: String): String = {
    val length = string.length
    if(length == 1){
      return string(0).toString
    }
    val string2 = reverseString(string.substring(1,length)).concat(string(0).toString)
    string2
  }
  def main(args: Array[String]):Unit = {
    input()
  }
}
