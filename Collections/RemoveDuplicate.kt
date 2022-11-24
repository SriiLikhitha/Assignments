fun main() {
    var num1 = mutableListOf<Int>(1, 2, 3, 4)
    println(num1)
    num1.add(3)
    println(num1)

   var numswithoutduplicate= num1.toSet()
    println(numswithoutduplicate)
}