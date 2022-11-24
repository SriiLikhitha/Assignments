
class Product(id:Int,name:String,price:Double)
{
    var id:Int=id
    var name:String=name
    var price:Double=price


}
fun main() {
    var products= mutableListOf<Product>()
    products.add(0,Product(1,"Laptop",5000.0))
    products.add(Product(2,"Mobile",30000.0))
    products.add(Product(3,"Desktop",42000.0))

    for(product in products)
    {
        println("${product.id} ${product.name} ${product.price}")
    }
}