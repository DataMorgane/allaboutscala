package com.allaboutscala.chapter.two.tutorial_12

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object TypeHierarchy extends App {

  // 1. Declare a variable of type Any
  val favoriteDonut: Any = "Glazed Donut"
  println(s"favoriteDonut of type Any = $favoriteDonut")

  // 2. Declare a variable of type AnyRef
  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")

  // 3. Declare a variable of type AnyVal
  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")

}
