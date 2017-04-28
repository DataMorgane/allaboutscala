package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 28/04/2017.
  */
object FunctionWithOptionParameters_03 extends App {

  // 1. How to define an Option in a function parameter
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")
    couponCode match {
      case Some(coupon) =>
        val discount = 0.1  // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      case None => 2.50 * quantity
    }
  }

  // 2. How to call a function which has an Option parameter
  println(s"""Total cost = ${calculateDonutCost("Glazed Donut", 5, None)}""")
  println(s"""Total cost = ${calculateDonutCost("Glazed Donut", 5, Some("coupon123"))}""")

  // 3. How to assign a default value to an Option parameter
  def calculateDonutCostWithDefaultOptionValue(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")
    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      case _ => 2.50 * quantity
    }
  }

  // 4. How to call a function whose Option parameter has a default value
  println(s"""Total cost = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5)}""")
  println(s"""Total cost with discount = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5, Some("COUPON_1234"))}""")

  // Bonus : how to use the map function to extract a valid Option value
  val favoriteDonut: Option[String] = Some("Glazed Donut")
  favoriteDonut.map(d => println(s"Favorite donut = $d"))  // Favorite donut = Glazed Donut
  val leastFavoriteDonut: Option[String] = None
  leastFavoriteDonut.map(d => println(s"Least Favorite donut = $d"))  // Nothing is printed

}
