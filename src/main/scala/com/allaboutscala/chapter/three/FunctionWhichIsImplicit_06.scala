package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionWhichIsImplicit_06 extends App {

  // 1. How to create a wrapper String class which will extend the String type
  class DonutString(s: String) {
    def isFavoriteDonut: Boolean = s == "Glazed Donut"
  }

  // 2. How to create an implicit function to convert a String to the wrapper String class
  object DonutConversions {
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }

  // 3. How to import the String conversion so that it is in scope
  import DonutConversions._

  // 4. How to create String values
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  // 5. How to access the custom String function called isFavoriteDonut
  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")

}
