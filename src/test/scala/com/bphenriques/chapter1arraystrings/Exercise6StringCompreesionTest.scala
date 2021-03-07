package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._

class Exercise6StringCompreesionTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise6StringCompression()

  it should "return the correct result given" in {
    val testCases = Table(
      ("left",   "expected"),
      ("",                ""),
      ("A",               "A"),
      ("AA",              "A2"),
      ("AAABBBAAA",       "A3B3A3"),

      // Compression case
      ("ABC",             "ABC"),
    )

    forAll (testCases) { (string: String, expected: String) =>
      subject.compress(string) shouldBe expected
    }
  }
}
