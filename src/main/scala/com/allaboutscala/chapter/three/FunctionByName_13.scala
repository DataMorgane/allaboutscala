package com.allaboutscala.chapter.three

import scala.util.Random

/**
  * Created by Morgane Flauder on 16/05/2017.
  */
object FunctionByName_13 extends App {

  // 1. How to define a List with Tuple3 elements
  val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla Donut", 10, 3.50))

  // 2. How to define a function to loop through each Tuple3 elements of the List and calculate total cost
  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = $costOfItem €")
      totalCost += costOfItem
    }
    totalCost
  }

  // 3. How to call function with curried group parameter for List of Tuple3 elements
  println(s"Total cost of order = ${placeOrder(listOrders)(0.5)} €")

  // 4. How to define a call-by-name function
  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = $costOfItem €")
      totalCost += costOfItem
    }
    totalCost
  }

  // 5. How to define a simple USD to EUR function
  val randomExchangeRate = new Random(10)
  def usdToEur: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(s"Fetching USD to EUR exchange rate = $rate")
    rate
  }

  // 6. How to call function with call-by-name parameter
  println(s"Total cost of order = ${placeOrderWithByNameParameter(listOrders)(usdToEur)} €")


}
