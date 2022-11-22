fun main() {

    var c=C()
    c.a()
    c.b()
    c.c()
}
open class A
{
    fun a()
    {
        println("Parent class")
    }
}
open class B:A()
{
    fun b()
    {
        println("Class B")
    }
}
class C:B()
{
    fun c()
    {
        println("Class C")
    }
}