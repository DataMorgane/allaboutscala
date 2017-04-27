package com.allaboutscala.chapter.two.tutorial_13

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object Enumeration extends App {

  // 1. How to create an Enumeration
  object Donut extends Enumeration {
    type Donut = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }

  // 2. How to print the String value of the enumeration
  println(s"Vanilla Donut String value = ${Donut.Vanilla}")

  // 3. How to print the id of the enumeration
  println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

  // 4. How to print all the values listed in Enumeration
  println(s"Donut types = ${Donut.values}")

  // 5. How to pattern match on enumeration values
  Donut.values.foreach {
    case d if d == Donut.Strawberry || d == Donut.Glazed => println(s"Found favorite donut = $d")
    case _ => None
  }

  // 6. How to change the default ordering of enumeration values
  object DonutTaste extends Enumeration{
    type DonutTaste = Value

    val Tasty       = Value(0, "Tasty")
    val VeryTasty   = Value(1, "Very Tasty")
    val Ok          = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")  // -1

}
