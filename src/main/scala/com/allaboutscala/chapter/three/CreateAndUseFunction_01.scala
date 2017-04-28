package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object CreateAndUseFunction_01 extends App {

  // 1. How to define and use a function which has a return type
  def favoriteDonut(): String = {
    "Glazed Donut"  // The last line is the returned value (no return keyword)
  }
  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")

  // 2. How to define and use a function with no parenthesis
  def leastFavoriteDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavoriteDonut")

  // 3. How to define and use a function with no return type
  def printDonutSalesReport(): Unit = {
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()

  // 4. Use type inference to define function with no return type
  def printReport: Unit = {
    println("Printing donut report... done!")
  }
  printReport

}
