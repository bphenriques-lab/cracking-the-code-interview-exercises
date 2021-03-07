package com.bphenriques.chapter1arraystrings

class Exercise2CheckPermutation {

  def checkPermutation(left: String, right: String): Boolean = {
    if (left.length != right.length)
      false
    else
      left.sorted == right.sorted
  }
}
