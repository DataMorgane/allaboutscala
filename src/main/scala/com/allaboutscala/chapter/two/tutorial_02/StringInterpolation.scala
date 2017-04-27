package com.allaboutscala.chapter.two.tutorial_02

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object StringInterpolation extends App {

  // 1. Using String interpolation to print a variable
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut is : $favoriteDonut")
  // Note the 's' prefixed at the beginning of the println statement, and the
  // dollar sign '$' prefixed at the beginning of the variable.

  // 2. Using String interpolation on object properties
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut is : name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  // 3. Using String interpolation to evaluate expressions
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts ? ${qtyDonutsToBuy == 10}")

  // 4. Using String interpolation for formatting text
  // The prefix is 'f' (not 's')
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")  // There are whitespace at the beginning

  // 5. Using f interpolation to format numbers
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")  // 2.5
  println(f"Formatted donut price = $donutPrice%.2f")  // 2,50

  // 6. Using Raw interpolation
  println(raw"Favorite donut\t$donutName")
  // The '\t' is displayed and NOT print as a tab

}
