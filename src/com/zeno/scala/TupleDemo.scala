package com.zeno.scala

/**
 * @date 2021/10/1
 * @author zeno
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val ingredient = ("Sugar" , 25, -1)
    println(ingredient)
    var (s,i1,i2) = ingredient
    println(s"$s $i1 $i2")

  }
}
