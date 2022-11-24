import java.sql.DriverManager


data class User(val id:Int,val name:String,val price:Int,val model:Int)
fun main(args: Array<String>) {

    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    val stmt = connection.createStatement()
    val query = connection.prepareStatement("select * from Product")
    val result = query.executeQuery()
    val Product = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        val price=result.getInt("price")
        val model=result.getInt("model")
        Product.add(User(id, name,price,model))
        println(Product)
        println()

    }
}


