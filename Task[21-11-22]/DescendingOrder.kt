import java.util.Scanner

fun main() {

    var sc = Scanner(System.`in`)
    println("Enter the Size of the Array:")
    var size = sc.nextInt()
    var Arr = Array(size, { 0 })
    //taking input
    for (i in 0..size - 1) {
        Arr.set(i, sc.nextInt())
    }
    //sorting
    for (i in 0..size - 1) {
        for (j in i + 1..size - 1) {
            if (Arr[i] < Arr[j]) {
                var temp = Arr[i]
                Arr[i] = Arr[j]
                Arr[j] = temp
            }
        }
    }
    println("Descending Order of Array: ")
    for (i in Arr) {
        print("$i ")
    }

}


