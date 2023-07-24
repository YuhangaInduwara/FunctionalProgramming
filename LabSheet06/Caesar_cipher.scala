object Caesar_cipher {

  def encryption(string: String, count: Int): String = {
    var array: Array[Char] = string.toCharArray
    for (i <- 0 until string.length) {
      if (array(i).toInt == 32) {
      } else {
        if (array(i).isUpper) {
          array(i) = ((array(i).toInt + count - 'A'.toInt) % 26 + 'A'.toInt).toChar
        } else if (array(i).isLower) {
          array(i) = ((array(i).toInt + count - 'a'.toInt) % 26 + 'a'.toInt).toChar
        }
      }
    }
    array.mkString
  }

  def decryption(string: String, count: Int): String = {
    var array: Array[Char] = string.toCharArray
    for (i <- 0 until string.length) {
      if (array(i).toInt == 32) {
      } else {
        if (array(i).isUpper) {
          array(i) = ((array(i).toInt - count - 'A'.toInt + 26) % 26 + 'A'.toInt).toChar
        } else if (array(i).isLower) {
          array(i) = ((array(i).toInt - count - 'a'.toInt + 26) % 26 + 'a'.toInt).toChar
        }
      }
    }
    array.mkString
  }

  def caesar_cipher(string: String, count: Int, function: (String, Int) => String): String = {
    function(string, count % 26)
  }

  def main(args: Array[String]): Unit = {
    var count = 10
    var string = "The American Standard Code for Information Interchange (ASCII) was developed under the auspices of a committee of the American Standards Association (ASA),"
    println("Text to encrypt: " + string)
    var encrypted_text = caesar_cipher(string, count, encryption)
    var decrypted_text = caesar_cipher(encrypted_text, count, decryption)
    println("Encrypted text: " + encrypted_text)
    println("Decrypted text: " + decrypted_text)
  }
}
