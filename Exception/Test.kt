import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner

fun main() {
    var sc=Scanner(System.`in`)
    try {
        println("Enter ur 1st number: ")
        var num1 = sc.nextInt()
        println("Enter ur 2nd number: ")
        var num2 = sc.nextInt()
        var result=num1/num2
        println("Result is $result")
    } catch (e:ArithmeticException)
    {
        println("Don't enter Zero'0'")
    }catch (e:InputMismatchException)
    {
        println("Enter only Numbers")
    }



}