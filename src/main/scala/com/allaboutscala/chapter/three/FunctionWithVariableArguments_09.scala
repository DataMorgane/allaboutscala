package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 15/05/2017.
  */
object FunctionWithVariableArguments_09 extends App {

  // 1. How to define functions which takes variable number of arguments
  def printReport(names: String*): Unit = {
    println(s"""Donut Report = ${names.mkString(", ")}""")
  }

  // 2. How to call function which takes variable number of String arguments
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")

  // 3. How to pass a List to a function with variable number of arguments
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  // printReport(listDonuts)  // Compilation error !
  printReport(listDonuts: _*)  // Type ascription

  // 4. How to pass a Sequence to a function with variable number of arguments
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  // printReport(seqDonuts)  // Compilation error !
  printReport(seqDonuts: _*)  // Type ascription

  // 5. How to pass an Array to a function with variable number of arguments
  val arrDonuts: Array[String] = Array("Coconut Donut")
  // printReport(arrDonuts)  // Compilation error !
  printReport(arrDonuts: _*)

}
