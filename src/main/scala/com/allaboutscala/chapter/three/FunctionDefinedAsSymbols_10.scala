package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionDefinedAsSymbols_10 extends App {

  // 1. How to create and instantiate a class
  class DonutCostCalculator {
    // We are hard-coding the totalCost value for simplicity.
    val totalCost = 100
    def minusDiscount(discount: Double): Double = {
      totalCost - discount
    }
    // 3. How to define a function whose name is just the symbol minus
    def -(discount: Double): Double = {
      totalCost - discount
    }
    // 6. How to define a function whose name is the symbols +++
    // Problem : it's not clear. In this case it's better to use a name and not symbols.
    def +++(taxAmount: Double): Double = {
      totalCost + taxAmount
    }
  }
  val donutCostCalculator = new DonutCostCalculator()

  // 2. How to call a function from an instantiated class
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")

  // 4. How to call a function whose name is just a symbol
  println(s"Calling function '-' = ${donutCostCalculator.-(10.5)}")

  // 5. How to call a function using the operator style notation
  println(s"Calling function '-' with operator style notation = ${donutCostCalculator - 10.5}")

}
