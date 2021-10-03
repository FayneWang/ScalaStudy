package com.zeno.scala

import java.util
import java.util.Date

/**
 * @date 2021/10/1
 * @author zeno
 */
object FunctionDemo {

  var returnInt = 199

  def starFunc(): Unit ={
    println("Hello Function Demo")
  }
  def starFunc2(s:String): Unit ={
    println(s"Hello Function Demo with $s")
  }


  def main(args: Array[String]): Unit = {
    def fun1(): Int ={
      returnInt
    }

    println(fun1())

    var list = new util.ArrayList[Int]()
    list.add(1)

    /** 匿名函数 */
    println("匿名函数")
    var anonyFunc1 = (i1:Int,i2:Int)=>{
      i1 + i2;
    }

    /** 匿名函数：签名 */
    println("匿名函数：签名")
    var anonyFunc2:(Int,Int)=>Int = (i1:Int,i2:Int)=>{
      i1 + i2;
    }
    println("AnonyFunc1=" + anonyFunc1(2,3))
    println("AnonyFunc2=" + anonyFunc2(3,4))


    println("---------偏应用函数(Partial Function)-----------")
    def fun07(date:Date,tp:String,msg:String):Unit = {
      println(s"$date\t$tp\t$msg")
    }

    var now = new Date();
    fun07(now,"info","ok")
    var info = fun07(_:Date,"info",_:String)
    var error = fun07(_:Date,"error",_:String)

    info(now,"OK")
    info(now,"error...")


    println("---------可变参数（variable func）-----------")
    def variableFun(a:Int *) : Unit={
      print("可变参数列表：")
      for (e <- a){
        print(e + " ")
      }

      print("\n可变参数 foreach：")
      a.foreach( print(_));
      print("\n可变参数 foreach：")
      a.foreach( x=>print(x));
      print("\n可变参数 foreach：")
      a.foreach( print );
      println("")
    }

    variableFun(1,2,3,4,5)


    println("---------高阶函数（higher order func）-----------")
    // 函数作为参数，函数作为返回值
    def compare(a:Int,b:Int, f:(Int,Int)=>Int):Unit = {
      val res:Int = f(a,b)
      println(res)
    }

    compare(3,8,(x:Int,y:Int)=>{x+y})
    compare(3,8,(x:Int,y:Int)=>{x*y})
    compare(3,9,_*_)

    // 函数作为返回值
    def factory(calc:String): (Int,Int)=>Int ={
      def plus(a:Int,b:Int):Int = {
         a + b;
      }

      if (calc.equals("+")) {
        plus
      } else {
        (a:Int,b:Int)=>{ a * b}
      }
    }

    println("---------柯里化（Currying function）-----------")
    def curryingFunc(i:Int*)(s:String*): Unit ={
      i.foreach((x)=>print(x + " "))
      println("")
      s.foreach((x)=>print(x + " "))
      println("")
    }
    curryingFunc(2,54,3,2)("a","asd","fa");

    println("--------- *.方法 -----------")
    var fun = starFunc2("abc": String)
    // 方法不想执行，则值给一个引用方法名 + 空格 + 下划线
    var funParam = starFunc2(_: String)
    val fun2 = starFunc _
  }
}
