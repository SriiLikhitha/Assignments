import java.util.Scanner
fun main() {
    var sc=Scanner(System.`in`)
    println("Enter a number:")
    var num=sc.nextInt()
    println("Even numbers from 1 to $num:")
    for(i in 1..num)
    {
     if(i%2==0)
     {
         println("$i")
     }
    }
}