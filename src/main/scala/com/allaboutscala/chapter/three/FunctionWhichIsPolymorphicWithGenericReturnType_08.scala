package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionWhichIsPolymorphicWithGenericReturnType_08 extends App {

  // 1. Review how to define a generic typed function which will specify the type of its parameter
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

  // 2. Review how to call a function which has typed parameters
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)

  // 3. How to define a polymorphic typed function which also has a generic return type
  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)
      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)
      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }

  // 4. How to call a generic polymorphic function which also has a generic return type
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")
  println()
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")
  println()
  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")

}
