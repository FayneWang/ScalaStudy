package com.zeno.scala

/**
 * @date 2021/10/3
 * @author zeno
 */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val tup = (1.0,88,"abc",false,'a',11)
    val iter = tup.productIterator

    val itrMap = iter.map(
      (x)=>{
        x match {
          case o:Int => (s"o..$x|")
          case 88  => (s"88..$x|")
          case _=>(s"_...$x|")
        }
        // x // 没指定返回变量时，直接把case指定的值作为返回值
      }
    )

    while (itrMap.hasNext){
      println(itrMap.next())
    }
//    itrMap.foreach(println)
  }
}
