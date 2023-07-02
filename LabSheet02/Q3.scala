object LS02_Q3 {
  def calc_Normal(noOfHours:Int):Int = 250 * noOfHours

  def calc_OT(noOfHours:Int):Int = 85 * noOfHours

  def calc_sal(normal_h:Int, ot_h:Int):Int = calc_Normal(normal_h) + calc_OT(ot_h)

  def check_Hours(normal_h:Int, ot_h:Int):Int ={
    if(normal_h >= 40 && ot_h >= 30){
      return 0
    }
    else{
      return 1
    }
  }

  def calc_Tax(salary: Int):Double = salary * 88 / 100

  def final_sal(normal_h:Int, ot_h:Int): Double = {
    if(check_Hours(normal_h, ot_h) == 1){
      return calc_sal(normal_h, ot_h)
    }
    else{
      return calc_Tax(calc_sal(normal_h, ot_h))
    }
  }

  def main(args: Array[String]): Unit = {
    println(final_sal(40,30))
  }
}


//3. Company XYZ & Co. pays all its employees Rs.250 per normal working
//hour and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT) hours per week has to pay 12% tax. Develop a functional program that determines the take home salary of an
//employee from the number of working hours and OT hours given.