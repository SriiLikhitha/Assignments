fun main() {
    val rows = 6

    for (i in 0..rows) {
        for (j in 0..rows-i) {
            print(" ")
        }
        for(k in 1..i)
        {
            print("*")
        }
        println(" ")
    }
}