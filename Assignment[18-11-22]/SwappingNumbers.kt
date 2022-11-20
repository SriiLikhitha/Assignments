import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    println("Enter ur First Number:")
    var A = sc.nextInt()
    println("Enter ur Second Number:")
    var B = sc.nextInt()
    println("Before Swapping A=$A and B=$B")
    val temp = A
    A = B
    B = temp
    println("After Swapping A=$A and B=$B")


    //without using Third variable
    println("======================================================")
    var sc1 = Scanner(System.`in`)
    println("Enter ur First Number:")
    var C = sc1.nextInt()
    println("Enter ur Second Number:")
    var D = sc1.nextInt()
    println("Before Swapping C=$C and D=$D")
    C = C - D
    D = C + D
    C = C - D
    println("After Swapping C=$C and D=$D")

}