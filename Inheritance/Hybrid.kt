fun main() {
    var daughter=Daughter()
    daughter.GrandFather()
    daughter.Father()
}
open class GrandFather()
{
    fun GrandFather()
    {
        println("Class GrandFather")
    }
}
open class Father:GrandFather()
{
    fun Father()
    {
        println("Class Father")
    }
}
class Son:Father()
{
    fun Son()
    {
        println("Class Son")
    }
}
class Daughter:Father()
{
    fun Daughter()
    {
        println("Class Daughter")
    }
}