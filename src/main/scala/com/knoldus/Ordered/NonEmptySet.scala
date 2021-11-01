package com.knoldus.Ordered

class NonEmptySet[A <: Ordered[A]](element: A, left: Set[A], right: Set[A]) extends Set[A] {
  override def contains(x: A): Boolean = {
    if(x < element)
      left.contains(x)
    else if(x > element)
      right.contains(x)
    else
      true
  }

  override def incl(x: A): Set[A] = {
    if(x < element)
      new NonEmptySet(element, left.incl(x), right)
    else if(x > element)
      new NonEmptySet(element, left, right.incl(x))
    else
      this
  }

}
