package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 28/04/2017.
  */
object FunctionWithImplicitParameters_05 extends App {

  // 1. How to define a function which has an implicit parameter
  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  // 2. How to define an implicit value
  implicit val discount: Double = 0.1
  println(s"All customer will receive a ${discount * 100}% discount.")

  // 3. How to call a function which has an implicit parameter
  println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost("Glazed Donuts", 5)}""")
  // You don't have to manually pass-through the discount value when calling the totalCost() function.
  // Tha Scala compiler will look for an implicit value of type Double for the discount implicit parameter.
  // If there are no implicit values in scope, you will get a compiler error.

  // 4. How to define a function which takes multiple implicit parameters
  def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"[$storeName] Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  // 5. How to call a function which takes multiple implicit parameters
  implicit val storeName: String = "Tasty Donut Store"
  println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost2("Glazed Donut", 5)}""")

  // 6. How to manually pass-through implicit parameters
  println(s"""Total cost with discount of 5 Glazed Donuts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")


}
