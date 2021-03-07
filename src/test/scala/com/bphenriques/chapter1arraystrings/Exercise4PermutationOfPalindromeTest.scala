package com.bphenriques.chapter1arraystrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._

class Exercise4PermutationOfPalindromeTest extends AnyFlatSpec with Matchers {

  val subject = new Exercise4PermutationOfPalindrome()

  it should "return the correct result given" in {
    val testCases = Table(
      ("string",    "expected"),
      ("",          true),
      ("A",         true),
      ("AB",        false),
      ("ABBA",      true),
      ("BBAA",      true),
      ("tactcoa",  true)
    )

    forAll (testCases) { (string: String, expected: Boolean) =>
      subject.isPermutationOfPalindrome(string) shouldBe expected
    }
  }
}
