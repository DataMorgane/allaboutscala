package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 16/05/2017.
  */
object FunctionCompositionAndThen_16 extends App {

  // 1. Assume a pre-calculated total cost amount
  val totalCost: Double = 10

  // 2. How to define a val function to apply discount to total cost
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2  // Fetch discount from database
    amount - discount
  }

  // 3. How to call a val function
  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  // 4. How to define a val function to apply tax to total cost
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1
    amount + tax
  }

  // 5. How to call andThen on a val function
  println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction andThen applyTaxValFunction)(totalCost) }")

}
