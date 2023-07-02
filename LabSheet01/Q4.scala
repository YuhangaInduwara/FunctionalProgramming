object WholesaleCost {
  private def shippingCost(price:Double, quantity:Int):Double = price*quantity
  def bookPrice():Double = 24.95*60/100
  def totalValue(quantity: Int): Double = {
    if(quantity <= 50) {
      3 + quantity*bookPrice()
    }
    else{
      3 + shippingCost(0.75, (quantity - 50)) + quantity*bookPrice()
    }
  }
  def main(args: Array[String]): Unit = {
    println(totalValue(60))
  }
}
