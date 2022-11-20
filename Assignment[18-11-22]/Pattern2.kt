fun main() {
    for (i in 1..5) {
        var num=i

        for (j in 1..i) {
            print("$num ")
            num--
        }


        println()
    }
}