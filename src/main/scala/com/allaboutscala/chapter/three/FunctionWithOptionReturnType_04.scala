package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 28/04/2017.
  */
object FunctionWithOptionReturnType_04 extends App {

  // 1. How to define a function which returns an Option of type String
  def dailyCouponCode(): Option[String] = {
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty)
  }

  // 2. How to call function with Option return type using getOrElse
  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon today")}")

  // 3. How to call a function with Option return type using pattern matching
  dailyCouponCode() match {
    case Some(couponCode) => println(s"Today's coupon code = $couponCode")
    case None => println(s"Sorry there is no coupon code today!")
  }

  // 4. How to call function with Option return type using map() function
  dailyCouponCode().map(couponCode => println(s"Today's coupon code = $couponCode"))

  // 5. Review function calculateDonutCost() function from previous tutorial
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")
    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      case None => 2.50 * quantity
    }
  }
  println(s"""Total cost with daily coupon code = ${calculateDonutCost("Glazed Donut", 5, dailyCouponCode())}""")

  // Bonus : how to use the fold function to extract the result
  val todayCouponUsingFold: String = dailyCouponCode().fold("No Coupon Available")(couponCode => couponCode)
  println(s"Today's coupon code = $todayCouponUsingFold")

}
