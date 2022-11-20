import java.util.Scanner

fun main() {

    var sc=Scanner(System.`in`)
    println("Enter a number:")
    var count=sc.nextInt()
    var n1=0
    var n2=1
    println("Fibonacci series of $count is")
    for(i in 1.. count)
    {
        print(" $n1")
        var temp=n1+n2
        n1=n2
        n2=temp


    }

}
