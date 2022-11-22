import java.lang.ArithmeticException
import java.lang.NullPointerException

fun main() {

    println("Get ready")
    println("Take elevator and go parking drive for Office")
    try {
        println(2 / 0)
    }catch(e:ArithmeticException)
    {
        println("Use other route")
    }
    finally {
        println("Exit code -- closing stmt")
    }
    println("Drive for 10kms")
    println("Reach Office")
    println("Login and Start your Day")
}