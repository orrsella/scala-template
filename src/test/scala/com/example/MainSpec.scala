package com.example

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class MainSpec extends Specification {

  trait Context extends Scope

  "main" should {
    "have msg `Hello World`" in new Context {
      Main.msg must_== "Hello World"
    }
  }
}