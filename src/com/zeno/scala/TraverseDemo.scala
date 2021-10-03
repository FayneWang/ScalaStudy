package com.zeno.scala

import scala.collection.immutable


object TraverseDemo{
  private var t = new TraverseDemo();
  def main(args: Array[String]): Unit = {

  }
}

/**
 * @date 2021/10/1
 * @author zeno
 */
class TraverseDemo {

  var a = 1;
  if (a < 0){
    println(s"value: $a")
  }else{
    println(s"value:$a")
  }
  println("")

  println("\n----------------yield---------------------")
  /** for循环中的 yield 会把当前的元素记下来，保存在集合中，循环结束后将返回该集合。*/
  val names = List("_adam", "_david", "_frank")
  val capNames = for (name <- names) yield {
    val nameWithoutUnderscore = name.drop(1)
    val capName = nameWithoutUnderscore.capitalize
    print(name + "|")
    capName
  }
  capNames.foreach(x=>print(x + " "))

  println("\n------------------------------------")
  var aa = 0;
  while (aa<10){
    print(aa + " ")
    aa += 1;
  }
  println("")
  println("-------------------------------------")


  println("步进为2")
  for (i <- Range(0,10,2)){
    print(i + " ")
  }
  println("")
  println("-------------------------------------")

  println("循环守卫")
  for (i <- 0 to 100 if i<5){
    print(i + " ")
  }
  println("-------------------------------------")


  println("")
  val seq:Range.Inclusive = 2 to (10,2)
  println(seq)
  for (i <- seq){
    println(i + "")
  }


  val seq2 = 1 until 10
  println(seq2)


  println("99乘法表:")
  for (i<-1 to 9){
    for (j<-1 to i){
        print(s"$i * $j = ${i*j}\t")
    }
    println("")
  }

  println("")
  var seq3: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i
  println(seq3)
  println("")
}
