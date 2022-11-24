import java.sql.DriverManager

fun main(args: Array<String>) {

    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    //updating  data
    val stmt=connection.createStatement()

    val delete_res = connection.createStatement().executeUpdate("delete from Product where id=1 ")
    if( delete_res > 0){
        println("successfully deleted record in Product db !!!")
        println("$delete_res  deletion")
    } else{
        println("Deletetion Not sucessful")
    }

}