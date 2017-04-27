package com.allaboutscala.chapter.two.tutorial_04

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object VariablesTypeInference extends App {

  // 1. Scala type inference
  val donutsToBuy: Int = 5
  val donutsBought = 5  // donutsBought is also an Int (type inference)

  // 2. Declaring Scala supported types using inference
  val donutsBoughtToday = 5  // Int
  val bigNumberOfDonuts = 1000000000L  // Long
  val smallNumberOfDonuts = 1  // Short
  val priceOfDonut = 2.50  // Double
  val donutPrcie = 2.50f  // Float
  val donutStoreName = "Allaboutscala Donut Store"  // String
  val donutByte = 0xa  // Byte
  val donutFirstLetter = 'D'  // Char
  val nothing = ()  // Unit

  // 3. Using Scala compiler to convert from one data type to another
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts
  // We can convert from a Short to an Int because there is no precision loss.

  // 4. User driver conversion from one data type to another
  // val minimumDonutsToSell: String = numberOfDonuts  // Error : can't convert from Short to String
  val minimumDonutsToSell: String = numberOfDonuts.toString()  // Use toString() instead
  println(s"Minimum donuts to sell : $minimumDonutsToSell")

}
