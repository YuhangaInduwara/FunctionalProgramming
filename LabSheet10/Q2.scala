object Q2 {
  def countLetterOccurrences(words: Array[String]):Int = {
    var word_count = words.map(X=> X.length)
    var letter_count = word_count.reduce((x,y)=>x+y)
    letter_count
  }
  def main(args: Array[String]): Unit = {
    var words = Array("apple", "banana", "cherry", "date")
    println("Total number of letters = " + countLetterOccurrences(words))
  }
}
