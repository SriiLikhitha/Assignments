fun main(args: Array<String>) {
    var product= mutableMapOf<String,Int>("Laptop" to 20000,"Smart Watch" to 10000)

    println(product)
    for(keyValue in product)
    {
        println("$keyValue, ${keyValue.key}, ${keyValue.value}")
    }
}