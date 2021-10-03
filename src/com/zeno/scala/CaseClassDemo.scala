package com.zeno.scala

/**
 * @date 2021/10/3
 * @author zeno
 */
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    /** 非 case 类 **/
    val book1 = new Book("book1")
    val book2 = new Book("book1")
    println(book1.equals(book2)) // false
    println(book1 == book2)     // false
    // println(book1.isbn)


    var caseBook1 = new CaseBook("caseBook","caseBook1")
    var caseBook2 = new CaseBook("caseBook", "caseBook1")
    println(caseBook1.equals(caseBook1)) // true
    println(caseBook2 == caseBook2)      // true
    println(caseBook1.isbn)

    // 不能修改 isbn 的值，因为它是一个val
    // caseBook1.isbn = "caseBook"
    var caseBook3 = caseBook1.copy("book1")

    println(caseBook3.name + "-" + caseBook3.isbn)
  }
}


class Book(isbn:String){

}


case class CaseBook(name:String,isbn:String){

}