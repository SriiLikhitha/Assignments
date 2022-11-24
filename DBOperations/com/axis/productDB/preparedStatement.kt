import java.sql.DriverManager
import java.util.Scanner

fun main(args: Array<String>) {

    var sc=Scanner(System.`in`)
    println("Enter Product Id: ")
    var id=sc.nextInt()
    println("Enter Product name:")
    var name=sc.next()
    println("Enter Product price:")
    var price=sc.nextInt()
    println("Enter Product model:")
    var model=sc.nextInt()


    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")

    val prepstmt=connection.prepareStatement("insert into Product values(?,?,?,?);")

    prepstmt.setInt(1,id)
    prepstmt.setString(2, name)
    prepstmt.setInt(3,price)
    prepstmt.setInt(4,model)

    val result=prepstmt.executeUpdate()
    if(result>0)
    {
        println("Inserted")
    }
    else
        println("Not Inserted")



}



