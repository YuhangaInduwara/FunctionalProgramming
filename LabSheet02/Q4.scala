object LS02_Q4 {
  def totalCost(attendance: Int): Int = 500 + attendance * 3

  def totalProfit(ticketPrice: Int, attendance: Int): Int = ticketPrice*attendance - totalCost(attendance)

  def findMax(k: Int, profit: Array[Int]): Int = {
    var i = 0
    var maxI = 0
    var max = profit(0)
    for (i <- 1 until (profit.length - 1)) {
      if (profit(i) > max) {
        max = profit(i)
        maxI = i
      }
    }
    maxI
  }

  def print(max:Array[Int]): Unit = {
    if (max(0) > max(1))
      println("Maximum possible profit is " + totalProfit(max(0), 120 + 4 * (15 - max(1))) + " and the ticket price is " + max(0))
    else
      println("Maximum possible profit is " + totalProfit(max(1), 120 - 4 * (max(1) - 15)) + " and the ticket price is " + max(1))
  }

  def checkPrice(){
    var max:Array[Int] = new Array[Int](2)
    max(0) = 15 - makeArray_Dec()
    max(1) = 15 + makeArray_Inc()
    print(max)
  }

  def makeArray_Dec(): Int = {
    var k = 0
    var i = 15
    var j = 120
    var prices:Array[Int] = new Array[Int](100)
    while(i != 0){
      prices(k) = totalProfit(i, j)
      k = k + 1
      i = i - 1
      j = j + 4
    }
    findMax(k, prices)
  }

  def makeArray_Inc(): Int = {
    var k = 0
    var i = 15
    var j = 120
    var prices: Array[Int] = new Array[Int](100)
    while (j != 0) {
      prices(k) = totalProfit(i, j)
      k = k + 1
      i = i + 1
      j = j - 4
    }
    findMax(k, prices)
  }

  def main(args: Array[String]): Unit = {
    checkPrice()
  }
}


//4. Imagine the owner of a movie theater who has complete freedom in
//setting ticket prices. The more he charges, the fewer the people who can afford
//tickets. In a recent experiment the owner determined a precise relationship
//between the price of a ticket and average attendance.
//At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing
//the price by 5 Rupees increases attendance by 20 and increasing the price by 5
//Rupees decreases attendance by 20.
//Unfortunately, the increased attendance also comes at an increased cost. Every
//performance costs the owner Rs.500. Each attendee costs another 3 Rupees.
//The owner would like to know the exact relationship between profit and ticket
//price so that he can determine the price at which he can make the highest profit.
//Implement a functional program to find out the best ticket price.