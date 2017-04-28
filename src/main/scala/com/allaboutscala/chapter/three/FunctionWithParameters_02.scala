package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 28/04/2017.
  */
object FunctionWithParameters_02 extends App {

  // 1. How to define function with parameters
  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")
    2.50 * quantity
  }

  // 2. How to call a function with parameters
  val totalCost = calculateDonutCost("Glazed Donut", 5)
  println(s"Total cost of donuts = $totalCost")

  // 3. How to add default values to function parameters
  def calculateDonutCostCoupon(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
    2.50 * quantity
  }

  // 4. How to call a function with parameters that has default values
  val totalCostWithDiscount = calculateDonutCostCoupon("Glazed Donut", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateDonutCostCoupon("Glazed Donut", 4)

}
