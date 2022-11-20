import java.util.Scanner
fun main() {

    var sc=Scanner(System.`in`)
    println("Enter a year:")
    var year=sc.nextInt()
    if ((year % 4 == 0) && year % 100 == 0 || year % 400 == 0) {

        println("$year is a leap year")
    }
    else
        println("$year is not a leap year")
}
