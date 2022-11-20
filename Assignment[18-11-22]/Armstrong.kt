import java.util.Scanner
fun main() {

    var sc=Scanner(System.`in`)
    println("Enter a number: ")
    var num=sc.nextInt()
    var temp=num
    var rem:Int
    var result=0
    while(temp!=0)
    {
        rem=temp%10
        result+=Math.pow(rem.toDouble(),3.0).toInt()
        temp/=10
    }
    if(result==num)
    {
        println("$num is armstrong number")
    }
    else
    {
        println("$num is not an armstrong number")
    }


}