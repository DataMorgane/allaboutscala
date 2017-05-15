package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionCurriedParameterGroups_11 extends App {

  // 1. How to define function with curried parameter groups
  // Function defined with parameter groups = curried function
  // Each parameter is enclosed within '()' and there is no need to separate each parameter with commas.
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  // 2. How to call a function with curried parameter groups
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  // 3. How to create a partial function from a function with curried parameter groups
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _

  // 4. How to call a partial function
  println(s"Total cost for Glazed Donuts = ${totalCostForGlazedDonuts(10)(0.1)}")

}
