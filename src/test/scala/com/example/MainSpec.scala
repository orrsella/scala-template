package com.example

import org.scalatest._

class MainSpec extends FunSuite {

  test("Main hello message") {
    assert(Main.hello === "Hello World")
  }
}