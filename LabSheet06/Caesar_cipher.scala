object Caesar_cipher {

  def encryption(string: String, count:Int):String = {
    var array: Array[Char]= string.toCharArray;
    for(i <- 0 until (string.length - 1)){
      if(array(i).toInt == 32){
      }
      else{
        if ((array(i).toInt >= 65 && array(i).toInt <= 90) || (array(i).toInt >= 97 && array(i).toInt <= 122)) {
          array(i) = (array(i).toInt + count).toChar;
        }
      }
    }
    array.mkString;
  }

  def decryption(string: String, count: Int): String = {
    var array: Array[Char]= string.toCharArray;
    for (i <- 0 until (string.length - 1)) {
      if (array(i).toInt == 32) {
      }
      else {
        if ((array(i).toInt >= (65 + count) && array(i).toInt <= (90 + count)) || (array(i).toInt >= (97 + count) && array(i).toInt <= (122 + count))) {
          array(i) = (array(i).toInt - count).toChar;
        }
      }
    }
    array.mkString;
  }

  def  caesar_cipher(string: String, count: Int, function: (String,Int) => String): String = {
    function(string, count);
  }

  def main(args: Array[String]): Unit = {
    var count = 10;
    var string = "The American Standard Code for Information Interchange (ASCII) was developed under the auspices of a committee of the American Standards Association (ASA),";
    println("Text to encrypt: " + string);
    var encrypted_text = caesar_cipher(string, count, encryption);
    var decrypted_text = caesar_cipher(encrypted_text, count, decryption)
    println("Encrypted text: " + encrypted_text);
    println("Decrypted text: " + decrypted_text);
  }
}
