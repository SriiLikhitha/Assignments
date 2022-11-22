fun main() {
    var honda=Honda()
    honda.run()
    honda.display()
}
open class Bike
{
    fun run()
    {
        println("Speed is 40 kmps")
    }
}
class Honda: Bike()
{
    fun display()
    {
        println("Honda speed is 100kmphs")
    }
}