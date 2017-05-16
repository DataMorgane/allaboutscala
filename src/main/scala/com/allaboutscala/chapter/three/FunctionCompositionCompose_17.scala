package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 16/05/2017.
  */
object FunctionCompositionCompose_17 extends App {

  // 1. Assume a pre-calculated total cost amount
  val totalCost: Double = 10

  // 2. How to define a val function to apply discount to total cost
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }

  // 3. How to call a val function
  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  // 4. How to define a val function to apply tax to total cost
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }

  // 5. How to call compose on a val function
  // Compose is similar to andThen but the order is different : f andThen g = g(f(x)) / f compose g = f(g(x))
  // f andThen g = f then g / f compose g = g then f
  println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction compose applyTaxValFunction)(totalCost) }")

}
