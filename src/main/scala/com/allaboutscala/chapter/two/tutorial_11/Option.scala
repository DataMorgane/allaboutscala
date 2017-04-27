package com.allaboutscala.chapter.two.tutorial_11

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object Option extends App {

  // 1. How to use Option and None - a basic example
  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

  // 2. How to use Pattern Matching with Option
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None => println(s"No donut name was found!")
  }

  // Bonus : using the map() function to filter None
  glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))  // Printed
  glazedDonutName.map(name => println(s"glazedDonutName = $name"))  // Not printed (None)

}
