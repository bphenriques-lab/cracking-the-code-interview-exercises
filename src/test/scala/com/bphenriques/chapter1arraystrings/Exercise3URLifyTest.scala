package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._

class Exercise3URLifyTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise3URLify()

  it should "return the correct result given" in {
    val testCases = Table(
      ("string",    "length", "expected"),
      ("",          0,       ""),
      (" ",         1,       "%20")
    )

    forAll (testCases) { (string: String, length: Int, expected: String) =>
      subject.urlify(string, length) shouldBe expected
    }
  }
}
