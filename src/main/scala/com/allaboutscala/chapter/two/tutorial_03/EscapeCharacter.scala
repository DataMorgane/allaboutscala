package com.allaboutscala.chapter.two.tutorial_03

/**
  * Created by Morgane Flauder on 27/04/2017.
  */
object EscapeCharacter extends App {

  // 1. Using backslash to escape quotes
  val donutJson: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson = $donutJson")

  // 2. Using triple quotes """ to escape characters
  val donutJson2: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson2 = $donutJson2")

  // 3. Creating multi-line text using stripMargin
  val donutJson3: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """.stripMargin
  println(s"donutJson3 = $donutJson3")

}
