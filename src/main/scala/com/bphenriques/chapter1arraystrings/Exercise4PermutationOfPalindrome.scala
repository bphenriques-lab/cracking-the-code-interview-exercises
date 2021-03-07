package com.bphenriques.chapter1arraystrings

class Exercise4PermutationOfPalindrome {

  // On even length: Every character has to occur exactly twice
  // On odd length: Every character has an equal except one
  // Assumptions: Case Sensitive and spaces matter
  def isPermutationOfPalindrome(s: String): Boolean = {
    // Iterate once to group and then iterate again to count: O(N)
    val distribution = s.groupBy(c => c).view.mapValues(_.length)

    // Iterate again: O(N)
    var numberEvenCount = 0
    var numberOddCount = 0
    for (key <- distribution.keys) {
      if (distribution(key) % 2 == 0)
        numberEvenCount += 1
      else
        numberOddCount += 1
    }

    if (s.length % 2 == 0) {
      numberOddCount == 0 // On even length, all the characters have to have an odd count
    } else {
      numberOddCount == 1 // On odd length, all numbers except one (the middle character) must have an even count
    }
  }
}
