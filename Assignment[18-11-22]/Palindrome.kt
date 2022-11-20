import java.util.Scanner

fun main() {
    var sc=Scanner(System.`in`)
    println("Enter a number:")
    var num=sc.nextInt()
    var reverse=0
    var temp=num
    while(num>0)
    {
        var remainder=num%10
        reverse=reverse*10+remainder
        num=num/10
    }
    if(temp==reverse)
        println("$temp is a Palindrome number")
    else
        println("$temp is not a Palindrome number")

}