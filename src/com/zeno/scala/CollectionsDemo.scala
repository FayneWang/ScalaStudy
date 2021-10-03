package com.zeno.scala

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @date 2021/10/1
 * @author zeno
 */
object CollectionsDemo {

  def main(args: Array[String]): Unit = {
    // immutable Array

    println("-------- Array -----------")
    val arr01 = Array(1,2,3,4)
    arr01(1) = 99
    println(arr01(1))



    // 2. 链表
    // immutable List,使用List() 这种风格的初始化方式的Collection是不可修改的
    println("-------- List -----------")
    val linkedList = List("a",5,1,2,3,4,5)
    linkedList.+("sdf")

    linkedList.foreach(x=>print(x + " "))
    println("")

    val linkedList2 = new ListBuffer[Int]
    linkedList2.+= (2)
    linkedList2.+= (22)
    linkedList2.foreach(x=>print(x + " "))
    println("")


    println("-------- Set -----------")
    var set1:Set[Int]  = Set(1,2,3,4,5)
    set1.foreach(print)
    println("")

    import scala.collection.mutable.Set
    val set2:mutable.Set[Int] = Set(11,22,33,44)
    set2.add(32)
    set2.foreach(print)
    println("")

    println("-------- tuple -----------")
    val t1 = new Tuple1(1)
    val t2 = new Tuple2(1,2)
    println(t1._1)
    println(t2._1 + " "+ t2._2)

    val t4 = (1, 2, 3, 4)
    t4._1
    var t22 = ((a:Int)=>a+1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
    println(t22._12)
    var itr:Iterator[Any] = t22.productIterator
    while(itr.hasNext){
      print(itr.next() + " ")
    }
    println("")


    println("-------- Map -----------")
    val map = Map(("a", 32), ("b", 33), ("c", 35), "a" -> 100)
    println(map.get("a"))
    println(map.getOrElse("aa",0))
    for (e <- map.keys){
      print("k:" + e + " ")
    }
    println("")
    for (e <- map.values){
      print("v:" + e + " ")
    }
    println("")

    val iterator = map.iterator
    while (iterator.hasNext){
      val  p = iterator.next();
      print(p._1 + ":" + p._2 + " ")
    }
    println("")

    map.foreach(p=>print(p._1 + ":" + p._2 + " "))
    println("")


    println("-------- 艺术 -----------")
    val list = List(1,2,3,4,5)
    val listMap = list.map(_ + 10)
    listMap.foreach( x=>print(x + " "))
    println("")

    println("-------- 艺术-升华 -----------")
    val listStr = List("Hello world","Hello msb","good bye")
    var flatMap = listStr.flatMap(_.split(" "))
    flatMap.foreach( x=>println(x + " "))
    println("")

    var listMap2 = flatMap.map((_,1))
    listMap2.foreach(x=>print(x + " "))
    println("")

    println("-------- 艺术-再升华 -----------")
    val listStr2 = List("Hello world","Hello msb","good bye")

    var itrList:Iterator[String] = listStr2.iterator   // 拿的是迭代器
    itrList.next();
    var flatMap2:Iterator[String] = itrList.flatMap(_.split(" ")) // 迭代器拿到的 flatMap也是迭代器
    flatMap2.foreach((x:String)=>print(x + "|"));  // flatMap2 迭代器已遍厉过了
    println("")

    var listStrMap2:Iterator[(String,Int)] = flatMap2.map((_,1))
    listStrMap2.foreach(print(_))  // 上面的 flatMap2 已经迭代过了，所以拿到的 listStrMap2 是个空的迭代器
    println("")


  }

}
