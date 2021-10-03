package com.zeno.scala

/**
 * @date 2021/10/1
 * @author zeno
 */
class ClassDemo {
  def this(age:Int, name:String){
    this()

    //辅助构造器必须显示的调用主构造器，可以通过调用其他辅助构造器间接调用


    print("辅助构造器")

  }
}
