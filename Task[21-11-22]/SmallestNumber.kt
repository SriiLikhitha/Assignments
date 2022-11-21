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
    var small=Arr[0]
    for(i in Arr)
    {
        if(i<small)
        {
            small=i
        }
    }

    println("Smallest Number in an Array:$small ")

}