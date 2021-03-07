package com.bphenriques.chapter1arraystrings

class Exercise6StringCompression {

  // ABC -> A1B1C1 -> ABC
  // AAA -> A3
  // AAABB -> A3B2

  def compress(s: String): String = {
    val stringBuilder = new StringBuilder() // Possible optimization: Start with a initial capacity
    var i = 0

    // Potential short circuit. Whenever I know that it is already greater than the original string, skip the loop.
    while (i < s.length) {
      val char = s(i)

      var numberOccurrences = 1
      var j = i + 1
      while (j < s.length && char == s(j)) {
        numberOccurrences += 1
        j += 1
      }

      stringBuilder.addAll(s"$char$numberOccurrences")
      i = i + numberOccurrences
    }

    if (stringBuilder.length() > s.length) {
      s
    } else {
      stringBuilder.toString()
    }
  }
}
