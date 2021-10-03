package com.zeno.scala

/**
 * @date 2021/10/1
 * @author zeno
 */
object Hello {
  private var integer = 123;
  private var h = new Hello("hello");

  def main(args: Array[String]): Unit = {

    h.print()
    h.print()
    println(s"Hello World $integer")
  }
}

class Hello(){

  protected var p = "";

  def this(param1 : String){
    this()
    p = param1;
    println("in controller")
  }

  println("start initial..")

  def print(): Unit ={
    Hello.integer+=1;
    println( p + " test " + Hello.integer);
  }


  println("finish initial")
}
