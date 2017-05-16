package com.allaboutscala.chapter.three

/**
  * Created by Morgane Flauder on 16/05/2017.
  */
object FunctionWithCallbackParameter_14 extends App {

  // 1. How to define a function with a callback parameter
  def printReport(sendEmailCallback: () => Unit): Unit = {
    println("Printing report... started")
    // Look up some data in database and create a report
    println("Printing report... finished")
    sendEmailCallback()
  }

  // 2. How to call a function which has a callback parameter
  printReport(() =>
  println("Sending email... finished")
  )

  // 3. How to call a function without providing its callback parameter
  // printReport()  // Compilation error
  printReport(() => {})  // Passing an empty anonymous function. But : not elegant.

  // 4. How to define a function with an Option callback
  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None): Unit = {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }

  // 5. How to call a function without providing its callback parameter
  printReportWithOptionCallback()  // More elegant

  // 6. How to call a function with Option callback parameter
  printReportWithOptionCallback(Some(() =>
  println("Sending email wrapped in Some()... finished")
  ))


}
