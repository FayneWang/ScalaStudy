package com.zeno.scala

/**
 * 偏函数
 * @date 2021/10/3
 * @author zeno
 */
object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    def partialFunc:PartialFunction[Any,String] = {
      case "hello"=> "val is hello"
      case x:Int=>s"$x...is int"
      case _=>"none"
    }


    println(partialFunc("abc"))
    println(partialFunc("hello"))
    println(partialFunc(88))
  }
}
