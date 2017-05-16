package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionHigherOrderAsParameters_12 extends App {

  // 1. Review how to define function with curried parameter groups
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  // 2. How to define a higher order function which takes another function as parameter
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Double)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  // 3. How to call higher order function and pass an anonymous function as parameter
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2  // Assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")

  // 4. How to define and pass a function to a higher order function
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount function = " +
    s"${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")

}
