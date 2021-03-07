package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

// Alternative, Table Driven tests.
class Exercise1CheckUniqueTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise1CheckUnique()

  "on empty String" should "return unique" in {
    subject.checkUnique("") shouldBe true
  }

  "ABC" should "be unique" in {
    subject.checkUnique("ABC") shouldBe true
  }

  "CBA" should "be unique" in {
    subject.checkUnique("CBA") shouldBe true
  }

  "AA" should "not be unique" in {
    subject.checkUnique("AA") shouldBe false
  }

  "ABCDD" should "not be unique" in {
    subject.checkUnique("ABCDD") shouldBe false
  }
}
