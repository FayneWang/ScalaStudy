package com.zeno.scala

/**
 * @date 2021/10/3
 * @author zeno
 */
object TraitDemo {
  def main(args: Array[String]): Unit = {
    var m = new Man("wzz")
    m.say
    m.magic
  }
}

class Man(name:String) extends Person with God with Demon{
  override def say(): Unit={
    println("say...man")
    super.say();
  }
}

trait Person{
  def say():Unit={
    println("say...Person")
  }

  def power(): Unit = {
    print("power...")
  }
}

trait God{
  def say():Unit={
    println("say...god")
  }

  def fingerPower(): Unit ={
    print("fingerPower...")
  }
}

trait Demon{
  def say():Unit={
    println("say...demon")
  }

  def magic():Unit = {
    println("magic...")
  }
}
