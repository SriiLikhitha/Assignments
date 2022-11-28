import Casestudy.service.BookStore
import java.util.Scanner



fun main() {

    var bookStore = BookStore()
    println("===========-------------------------===========")
    while (true) {
        println("1.Insert  2.SearchByTitle  3.SearchByAuthor  4.DisplayById  5.DisplayAll  6.DeleteById")
        println("Enter a value: ")
        var sc = Scanner(System.`in`)
        var choice = sc.nextInt()
        when (choice) {
            1 -> {
                println("Enter values to insert: ")
                bookStore.addBook(GetData("Insert"))
            }
            2->
            {
                println("Enter the book title u want: ")
                bookStore.searchByTitle(GetData("SearchByTitle").title)
                println("=======---------------=========")
            }
            3->
            {
                println("Enter the book Author u want: ")
                bookStore.searchByAuthor(GetData("SearchByAuthor").author)
                println("=======---------------=========")
            }
            4->
            {
                println("Enter  the bookId u want to display: ")
                bookStore.displayById(GetData("DisplayById").bookId)
                println("=======---------------=========")
            }
            5->
            {
                println("==========Data of All Books==========")
                bookStore.displayAll()
                println("=======---------------=========")

            }
            6->
            {
                println("Enter bookId to delete: ")
                bookStore.deleteById(GetData("DeleteById").bookId)
            }
            else ->
            {
                println("===========Completed==============")
            }
        }
    }
}
fun GetData(value:String):Book
{
    var sc=Scanner(System.`in`)
    if(value=="Insert")
    {
        println("BookId:")
        var bookId=sc.next()
        println("Title:")
        var title=sc.next()
        println("Author:")
        var author=sc.next()
        println("Category:")
        var category=sc.next()
        println("Price:")
        var price=sc.nextDouble()
        return Book(bookId,title, author, category, price)

    }
    else
    {
        if(value=="SearchByTitle")
        {
            println("Title:")
            var title=sc.next()
            return Book(" ",title," "," ",0.0)
        }
        else if(value=="DeleteById")
        {
            println("BookId:")
            var bookId=sc.next()
            return Book(bookId," "," "," ",0.0)
        }
        else if(value=="SearchByAuthor")
        {
            println("Author:")
            var author=sc.next()
            return Book(" "," ",author," ",0.0)
        }
        else
        {
            return Book(" "," "," "," ",0.0)
        }
    }
}




