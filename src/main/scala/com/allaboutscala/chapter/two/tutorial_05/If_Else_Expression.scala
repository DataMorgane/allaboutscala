package com.allaboutscala.chapter.two.tutorial_05

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object If_Else_Expression extends App {

  // 1. Using if clause as a statement
  val numberOfPeople = 20
  val donutsPerPerson = 2
  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  // 2. Using if and else clause as a statement
  val defaultDonutsToBuy = 8
  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")

  // 3. Using if, else if, and else clause as a statement
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  // 4. Using if and else clause as expression
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")

}
