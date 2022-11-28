package Casestudy.Util

import Book
import DBConnection
import java.sql.ResultSet

class BookUtil
{

    var BookList= mutableListOf<Book>()
    //database Connection
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()

    fun  createTable()
    {
        var stmt=connection.createStatement()
        stmt.execute("create table book(bookId varchar(50),title varchar(60),author varchar(60),category varchar(60),price Double(60,2);")
        println("Table Created")
    }

    //inserting data
    fun insertData(book: Book)
    {
        var stmt=connection.prepareStatement("insert into book values(?,?,?,?,?);")
        stmt.setString(1,book.bookId)
        stmt.setString(2,book.title)
        stmt.setString(3,book.author)
        stmt.setString(4,book.category)
        stmt.setDouble(5,book.price)
        var res=stmt.executeUpdate()
        if(res>0)
        {
           println("${res} rows inserted")
        }


    }

    //search by Title
    fun searchByTitle(title:String)
    {
        var stmt=connection.prepareStatement("select * from book where title=?;")
        stmt.setString(1,title)
        var result=stmt.executeQuery()
        display(result)


    }
    //search by Author
    fun searchByAuthor(author:String)
    {
        var stmt=connection.prepareStatement("select * from book where author=?;")
        stmt.setString(1,author)
        var result=stmt.executeQuery()
        display(result)


    }
    //display By Id
    fun displayById(bookId: String)
    {
        var stmt=connection.prepareStatement("select * from book where bookId=? ;")
        var result=stmt.executeQuery()
        display(result)
    }

    //display All
    fun displayAll()
    {
        var stmt=connection.createStatement()
        var result= stmt.executeQuery("select * from book ;")
        display(result)
    }
    //display
    fun display(result:ResultSet)
    {
        while (result.next()) {
            var bookId = result.getString("bookId")
            var title = result.getString("title")
            var author = result.getString("author")
            var category = result.getString("category")
            var price = result.getDouble("price")
            BookList.add(Book(bookId, title, author, category, price))
        }
        if(BookList.count()>0) {
            println("---BookId----Title----Author----Category----Price----")
            for (book in BookList) {
                println("   ${book.bookId}    ${book.title}    ${book.author}    ${book.category}    ${book.price} ")
            }
        }
        else
            println("No books Found")



    }

    //delete by bookId

    fun deleteById(bookId:String)
    {
        var stmt=connection.prepareStatement("delete from book where bookId= ? ; ")
        stmt.setString(1,bookId)
        var res=stmt.executeUpdate()
        if(res>0)
            println("$res row deleted")

    }




}
