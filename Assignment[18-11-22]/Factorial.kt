import java.util.Scanner

fun main() {

    var sc=Scanner(System.`in`)
    println("Enter a number:")
    var Number=sc.nextInt()
    var fact=1
    for(i in 1..Number)
    {
        fact*=i
    }
    println("Factorial of $Number is:$fact")

}
