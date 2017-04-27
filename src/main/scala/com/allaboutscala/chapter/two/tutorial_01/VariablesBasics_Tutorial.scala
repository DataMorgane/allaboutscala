package com.allaboutscala.chapter.two.tutorial_01

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object VariablesBasics_Tutorial extends App {

  // 1. Immutable variables
  val donutsToBuy: Int = 5
  // donutsToBuy = 10  // Error because donutsToBuy is immutable

  // 2. Mutable variables
  var favoriteDonut: String = "Glazed Donut"  // The type of favoriteDonut is String
  favoriteDonut = "Vanilla Donut"  // No error because favoriteDonut is mutable

  // 3. Lazy initialization
  // Delay the initialization until the variable is used
  lazy val donutService = "initialize some donut service"
  // donutService is not explicitly typed, but it's a String thanks to 'type inference'.

  // 4. Scala Supported Types
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()  // Similar to Java's 'void'

  // 5. Declare a variable with no initialization
  var leastFavoriteDonut: String = _  // '_' is the wildcard operator
  leastFavoriteDonut = "Plain Donut"

}
