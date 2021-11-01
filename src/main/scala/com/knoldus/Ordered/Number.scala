package com.knoldus.Ordered

case class Number(value: Double) extends Ordered[Number]{
  def compare(that: Number): Int = {
    if(this.value < that.value)
      -1
    else if(this.value > that.value)
      1
    else
      0
  }
}

object NumberTestRun extends App{
  val set = new EmptySet[Number].incl(Number(5.0)).incl(Number(2.0))
  println(set.contains(Number(5.0)))
}
