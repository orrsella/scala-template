package com.example

import org.scalatest._

class MainSpec extends FunSuite {
  test("Main hello message") {
    assert(Main.msg === "Hello World")
  }
}