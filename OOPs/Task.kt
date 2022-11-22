import java.util.Scanner;
fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter ur first number")
    var n1=sc.nextInt()
    println("Enter ur second number ")
    var n2=sc.nextInt()
    var calc=Calculation(n1,n2)
    println("Choose you option\n 1.Addition\n2.Subtract\n3.Multiplication\n4.Division")
    var select=sc.nextInt()
    when(select){
        1->calc.Add()
        2->calc.Substract()
        3->calc.Multiply()
        4->calc.Division()
        else->println("Choose correct option")
    }
}
class Calculation(n1:Int,n2:Int)
{
    var n1:Int=n1
    var n2:Int=n2
    //add
    fun Add(){
        println("$n1 + $n2 = ${n1+n2}")
    }
    //substract
    fun Substract(){
        println("$n1 - $n2 = ${n1-n2}")
    }
    //multiply
    fun Multiply(){
        println("$n1 * $n2 = ${n1*n2}")
    }
    //divide
    fun Division(){
        println("$n1 / $n2 = ${n1/n2}")
    }
}