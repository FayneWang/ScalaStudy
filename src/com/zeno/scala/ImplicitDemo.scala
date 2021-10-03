package com.zeno.scala

/**
 * 隐式转换
 * @date 2021/10/3
 * @author zeno
 */
object ImplicitDemo {
  def main(args: Array[String]): Unit = {

    println("=========隐式方法============")
    // 随便取方法名
    implicit def asdffe[T](list:java.util.LinkedList[T]): ImplicitType[T]={
      new ImplicitType(list)
    }

    var list = new java.util.LinkedList[Int]();
    list.add(12)
    list.add(13)
    list.add(14)

    list.foreach(println)

    // 大当前代码块中支持隐式转换类可以不需要定义隐式方法
    implicit class ImplicitType2[T](list:java.util.ArrayList[T]){
      def foreach(f:(T)=>Unit):Unit={
        val iter:java.util.Iterator[T] = list.iterator()
        while (iter.hasNext) f(iter.next())
      }
    }


    var list2 = new java.util.ArrayList[Int]();
    list2.add(12)
    list2.add(13)
    list2.add(14)
    list2.foreach(println)

    println("=========隐式参数============")
    implicit val s1:String = "implicit"
    implicit val i1:Int = 89
    def implicitFunc(implicit s:String):Unit={
      println(s)
    }

    implicitFunc("explicit")
    implicitFunc


    // 隐式参数要放到柯里化函数后面
    def implicitFunc2(i:Int)(implicit s:String):Unit={
      println(i + " " + s)
    }

    implicitFunc2(99)
    implicitFunc2(9)("explicit")
  }
}

class ImplicitType[T](list:java.util.LinkedList[T]){
  def foreach(f:(T)=>Unit):Unit={
    val iter:java.util.Iterator[T] = list.iterator()
    while (iter.hasNext) f(iter.next())
  }
}

