object LabSheet03_Q2 {
  def input():Unit = {
    var input = scala.io.StdIn.readLine("Enter strings seperated by a space: ")
    var list = input.split(" ").toList
    check_list(list)
  }
  def updateList(list: List[String]):Unit = {
    var i = 0
    for (i <- 0 until list.length) {
      if (list(i) != ""){
        print(list(i))
        if(i != list.length - 1){
          print(",")
        }
      }
    }
  }
  def check_list(list: List[String]):Unit = {
    var list2 = list
    var i = 0;
    for(i<- 0 until list2.length){
      if(list(i).length < 5)
        list2 = list2.updated(i, "")
    }
    updateList(list2)
  }
  def main(args: Array[String]):Unit = {
    input()
  }
}



