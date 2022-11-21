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
    var large=Arr[0]
    for(i in Arr)
    {
        if(i>large)
        {
            large=i
        }
    }

    println("Largest Number in an Array:$large ")

}


