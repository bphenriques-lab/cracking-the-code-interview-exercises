package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._

class Exercise5OneEditAwayTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise5OneEditAway()

  it should "return the correct result given" in {
    val testCases = Table(
      ("left",    "right", "expected"),
      ("",        "",       true),
      ("A",       "A",      true),
      ("" ,       "A",      true),
      ("A" ,      "",       true),
      ("A" ,      "B",      true),
      ("A",       "AB",     true),
      ("A",       "ABC",    false),
      ("pale",    "ple",    true),
      ("pales",   "pale",    true),
      ("pale",    "bale",    true),
      ("pale",    "bake",    false)
    )

    forAll (testCases) { (left: String, right: String, expected: Boolean) =>
      subject.isOneEditAway(left, right) shouldBe expected
    }
  }
}
