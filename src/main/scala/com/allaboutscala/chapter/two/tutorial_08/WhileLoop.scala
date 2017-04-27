package com.allaboutscala.chapter.two.tutorial_08

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object WhileLoop extends App {

  // 1. How to use while loop in Scala
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  // 2. How to use do while loop in Scala
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)

}
