package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionWhichIsTyped_07 extends App {

  // 1. How to define a function chich takes a String parameter
  def applyDiscount(couponCode: String): Unit = {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  // 2. How to define a function which takes a parameter of type Double
  def applyDiscount(percentageDiscount: Double): Unit = {
    println(s"$percentageDiscount discount will be applied")
  }

  // 3. Calling applyDiscount function with String or Double parameter types
  applyDiscount("COUPON_1234")
  applyDiscount(10)

  // 4. How to define a generic typed function which will specify the type of its parameter
  def applyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
      case d: Double =>
        println(s"$d discount will be applied")
      case _ =>
        println("Unsupported discount type")
    }
  }

  // 5. How to call a function which has typed parameters
  applyDiscount[String]("COUPON_1234")  // Lookup percentage discount in database for COUPON_1234
  applyDiscount[Double](10)  // 10.0 discount will be applied
  applyDiscount[Int](5)  // Unsupported discount type

}
