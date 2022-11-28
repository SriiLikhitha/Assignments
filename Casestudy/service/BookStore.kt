package Casestudy.service

import Book
import Casestudy.Util.BookUtil
import InvalidBookException

class BookStore
 {
  var bookUtil=BookUtil()
  fun createTable()
  {
   bookUtil.createTable()
  }
  fun addBook(book: Book)
  {
   validation(book)
   bookUtil.insertData(book)
  }
  fun searchByTitle(title:String)
  {
   bookUtil.searchByTitle(title)
  }
  fun searchByAuthor(author:String)
  {
   bookUtil.searchByAuthor(author)
  }
  fun displayById(bookId:String)
  {
   bookUtil.displayById(bookId)
  }
  fun displayAll()
  {
   bookUtil.displayAll()
  }
  fun deleteById(bookId:String)
  {
   bookUtil.deleteById(bookId)
  }


  //validation
  fun validation(book:Book)
  {
   var expStrings=""
   var categories= mutableListOf<String>("Science","Fiction","Technology","Others")
   if(book.bookId.toString().length==4 && book.bookId.toString()[0]=='B')
   {
    expStrings+=""
   }
   else
    expStrings+="The BookId is in not in a Proper Way....BookId should be starts with B"

   if(book.price>0)
   {
    expStrings+=""
   }
   else
    expStrings+="Price should be grater than 0"

   if(book.category in categories)
   {
    expStrings+=""
   }
   else
    expStrings+="Categories should be Science,Fiction,Technology,Others"

   try {
    if(expStrings.length>0)
     throw InvalidBookException(expStrings)
   }catch (e:InvalidBookException)
   {
    println(e.message)
    System.exit(0)
   }

  }
}