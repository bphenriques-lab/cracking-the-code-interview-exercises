package com.bphenriques.chapter1arraystrings

import scala.annotation.tailrec
import scala.collection.immutable.Set

class Exercise1CheckUnique {

  def checkUnique(s: String): Boolean = checkUniqueV1(s)

  // With data structures
  private def checkUniqueV1(s: String): Boolean = {
    s.length() == Set(elems = s.toCharArray :_*).size
  }

  // Without data structures
  private def checkUniqueV2(s: String): Boolean = {
    @tailrec
    def aux[T](list: List[T]): Boolean = list match {
      case List() => true
      case h :: t :: _ if h == t => false
      case _ :: rest => aux(rest)
    }

    aux(s.sorted.toList)
  }
}
