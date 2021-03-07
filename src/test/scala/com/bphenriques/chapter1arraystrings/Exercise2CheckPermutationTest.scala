package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._

class Exercise2CheckPermutationTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise2CheckPermutation()

  it should "return the correct result given" in {
    val testCases = Table(
      ("left",      "right",  "expected"),
      ("",          "",       true),
      ("A",         "",       false),
      ("ABC",       "CBA",    true),
      ("ABC",       "ACB",    true),
      ("AB",        "BAA",    false),
    )

    forAll (testCases) { (left: String, right: String, expected: Boolean) =>
      subject.checkPermutation(left, right) shouldBe expected
    }
  }
}
