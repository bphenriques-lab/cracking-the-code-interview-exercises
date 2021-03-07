package com.bphenriques.chapter1arraystrings

class Exercise5OneEditAway {

  def isOneEditAway(left: String, right: String): Boolean = {
    if (Math.abs(left.length - right.length) <= 1) {
      var i = 0
      var j = 0

      var numberEdits = 0
      while (i < left.length && j < right.length && numberEdits <= 1) {
        if (left(i) != right(j)) {
          numberEdits += 1
          if (left.length > right.length) {
            i += 1
          } else if (right.length > left.length) {
            j += 1
          } else {
            i += 1
            j += 1
          }
        } else {
          i += 1
          j += 1
        }
      }

      numberEdits <= 1
    } else {
      false
    }
  }
}
