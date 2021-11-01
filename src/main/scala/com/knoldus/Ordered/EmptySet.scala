package com.knoldus.Ordered

class EmptySet[A <: Ordered[A]] extends Set[A] {
  override def incl(x: A): Set[A] =  new NonEmptySet(x , new EmptySet[A], new EmptySet[A])

  override def contains(x: A): Boolean = false
}
