import java.sql.DriverManager

fun main(args: Array<String>) {

    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    //updating  data
    val stmt=connection.createStatement()

    val update_res = connection.createStatement().executeUpdate("update Product set name = 'Phone' where id=2")
    if( update_res > 0){
        println("successfully updated record in Product db !!!")
        println("$update_res  updated")
    } else{
        println("Update Not sucessful")
    }

}