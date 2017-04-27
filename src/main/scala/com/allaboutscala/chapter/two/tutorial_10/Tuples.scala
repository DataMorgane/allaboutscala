package com.allaboutscala.chapter.two.tutorial_10

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object Tuples extends App {

  // 1. Using Tuple2 to store 2 data points
  val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
  println(s"Tuple with 2 data points = $glazedDonutTuple")

  // 2. Access each element in tuple
  val donutType = glazedDonutTuple._1
  val donutTasteLevel = glazedDonutTuple._2
  println(s"$donutType taste level is $donutTasteLevel")

  // 3. Using TupleN classes to store more than 2 data points
  val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
  println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and its price is ${glazedDonut._3}")

  // 4. How to use pattern matching on Tuples
  val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
  val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
  val donutList = List(glazedDonut, strawberryDonut, plainDonut)
  // Find the price of the Plain Donut in that list :
  val priceOfPlainDonut = donutList.foreach { tuple => {
    tuple match {
      case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
      case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
      case _ => None
    }
  }
  }

  // 5. Shortcut for creating Tuples
  val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
  println(s"${chocolateDonut._1} taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")


  // Bonus : more elegant pattern marching for step 4
  donutList.foreach {
    case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
    case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
    case _ => None
  }

}
